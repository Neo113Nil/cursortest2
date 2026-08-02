package io.ably.lib.util;

import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Param;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes9.dex */
public class Crypto {
    public static final String DEFAULT_ALGORITHM = "aes";
    public static final int DEFAULT_BLOCKLENGTH = 16;
    public static final int DEFAULT_KEYLENGTH;
    private static final String TAG;
    private static final SecureRandom secureRandom;

    public interface DecryptingChannelCipher {
        byte[] decrypt(byte[] bArr) throws AblyException;
    }

    public interface EncryptingChannelCipher {
        byte[] encrypt(byte[] bArr) throws AblyException;

        String getAlgorithm();
    }

    static {
        DEFAULT_KEYLENGTH = is256BitsSupported() ? 256 : 128;
        secureRandom = new SecureRandom();
        TAG = Crypto.class.getName();
    }

    public static class CipherParams {
        private final String algorithm;
        private final IvParameterSpec ivSpec;
        private final int keyLength;
        private final SecretKeySpec keySpec;

        CipherParams(String str, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
            str = str == null ? Crypto.DEFAULT_ALGORITHM : str;
            this.algorithm = str;
            this.keyLength = bArr.length * 8;
            this.keySpec = new SecretKeySpec(bArr, str.toUpperCase(Locale.ROOT));
            this.ivSpec = new IvParameterSpec(bArr2);
        }

        int getKeyLength() {
            return this.keyLength;
        }

        String getAlgorithm() {
            return this.algorithm;
        }
    }

    public static CipherParams getDefaultParams() {
        return getParams(DEFAULT_ALGORITHM, DEFAULT_KEYLENGTH);
    }

    public static CipherParams getDefaultParams(byte[] bArr) {
        try {
            return getParams(DEFAULT_ALGORITHM, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    static CipherParams getDefaultParams(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
        return new CipherParams(DEFAULT_ALGORITHM, bArr, bArr2);
    }

    public static CipherParams getDefaultParams(String str) {
        return getDefaultParams(Base64Coder.decode(str));
    }

    static CipherParams getDefaultParams(String str, byte[] bArr) throws NoSuchAlgorithmException {
        return new CipherParams(null, Base64Coder.decode(str), bArr);
    }

    public static CipherParams getParams(String str, int i) {
        if (str == null) {
            str = DEFAULT_ALGORITHM;
        }
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(str.toUpperCase(Locale.ROOT));
            keyGenerator.init(i);
            return getParams(str, keyGenerator.generateKey().getEncoded());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static CipherParams getParams(String str, byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArr2 = new byte[16];
        secureRandom.nextBytes(bArr2);
        return getParams(str, bArr, bArr2);
    }

    public static CipherParams getParams(String str, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
        return new CipherParams(str, bArr, bArr2);
    }

    public static byte[] generateRandomKey(int i) {
        byte[] bArr = new byte[(i + 7) / 8];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    public static byte[] generateRandomKey() {
        return generateRandomKey(DEFAULT_KEYLENGTH);
    }

    public static EncryptingChannelCipher createChannelEncipher(CipherParams cipherParams) throws AblyException {
        return new EncryptingCBCCipher(cipherParams);
    }

    public static DecryptingChannelCipher createChannelDecipher(CipherParams cipherParams) throws AblyException {
        return new DecryptingCBCCipher(cipherParams);
    }

    public static CipherParams checkCipherParams(Object obj) throws AblyException {
        if (obj == null) {
            return getDefaultParams();
        }
        if (obj instanceof CipherParams) {
            return (CipherParams) obj;
        }
        throw AblyException.fromErrorInfo(new ErrorInfo("ChannelOptions not supported", 400, 40000));
    }

    private static class CBCCipher {
        protected final String algorithm;
        protected final int blockLength;
        protected final Cipher cipher;
        protected final IvParameterSpec ivSpec;
        protected final SecretKeySpec keySpec;

        protected CBCCipher(CipherParams cipherParams) throws AblyException {
            String algorithm = cipherParams.getAlgorithm();
            String str = algorithm.toUpperCase(Locale.ROOT) + "/CBC/PKCS5Padding";
            try {
                this.algorithm = algorithm + '-' + cipherParams.getKeyLength() + "-cbc";
                this.keySpec = cipherParams.keySpec;
                IvParameterSpec ivParameterSpec = cipherParams.ivSpec;
                this.ivSpec = ivParameterSpec;
                this.blockLength = ivParameterSpec.getIV().length;
                this.cipher = Cipher.getInstance(str);
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw AblyException.fromThrowable(e);
            }
        }
    }

    private static class EncryptingCBCCipher extends CBCCipher implements EncryptingChannelCipher {
        private static final byte[] emptyBlock = new byte[16];
        private static final byte[][] pkcs5Padding = {new byte[]{16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16}, new byte[]{1}, new byte[]{2, 2}, new byte[]{3, 3, 3}, new byte[]{4, 4, 4, 4}, new byte[]{5, 5, 5, 5, 5}, new byte[]{6, 6, 6, 6, 6, 6}, new byte[]{7, 7, 7, 7, 7, 7, 7}, new byte[]{8, 8, 8, 8, 8, 8, 8, 8}, new byte[]{9, 9, 9, 9, 9, 9, 9, 9, 9}, new byte[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, new byte[]{11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11}, new byte[]{12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12}, new byte[]{13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13}, new byte[]{14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14}, new byte[]{15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15}, new byte[]{16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16}};
        private byte[] iv;

        private static int getPaddedLength(int i) {
            return (i + 16) & (-16);
        }

        EncryptingCBCCipher(CipherParams cipherParams) throws AblyException {
            super(cipherParams);
            try {
                this.cipher.init(1, this.keySpec, this.ivSpec);
                this.iv = cipherParams.ivSpec.getIV();
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw AblyException.fromThrowable(e);
            }
        }

        @Override // io.ably.lib.util.Crypto.EncryptingChannelCipher
        public String getAlgorithm() {
            return this.algorithm;
        }

        private byte[] getNextIv() {
            byte[] bArr = this.iv;
            if (bArr == null) {
                return this.cipher.update(emptyBlock);
            }
            this.iv = null;
            return bArr;
        }

        @Override // io.ably.lib.util.Crypto.EncryptingChannelCipher
        public byte[] encrypt(byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            int length = bArr.length;
            int paddedLength = getPaddedLength(length);
            byte[] bArr2 = new byte[paddedLength];
            byte[] bArr3 = new byte[this.blockLength + paddedLength];
            int i = paddedLength - length;
            System.arraycopy(bArr, 0, bArr2, 0, length);
            System.arraycopy(pkcs5Padding[i], 0, bArr2, length, i);
            System.arraycopy(getNextIv(), 0, bArr3, 0, this.blockLength);
            System.arraycopy(this.cipher.update(bArr2), 0, bArr3, this.blockLength, paddedLength);
            return bArr3;
        }
    }

    private static class DecryptingCBCCipher extends CBCCipher implements DecryptingChannelCipher {
        DecryptingCBCCipher(CipherParams cipherParams) throws AblyException {
            super(cipherParams);
        }

        @Override // io.ably.lib.util.Crypto.DecryptingChannelCipher
        public byte[] decrypt(byte[] bArr) throws AblyException {
            if (bArr == null) {
                return null;
            }
            try {
                this.cipher.init(2, this.keySpec, new IvParameterSpec(bArr, 0, this.blockLength));
                return this.cipher.doFinal(bArr, this.blockLength, bArr.length - this.blockLength);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
                throw AblyException.fromThrowable(e);
            }
        }
    }

    public static String getRandomId() {
        byte[] bArr = new byte[9];
        secureRandom.nextBytes(bArr);
        return Base64Coder.encodeToString(bArr);
    }

    public static Param generateRandomRequestId() {
        return new Param(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, getRandomId());
    }

    private static boolean is256BitsSupported() {
        try {
            return Cipher.getMaxAllowedKeyLength(DEFAULT_ALGORITHM) >= 256;
        } catch (NoSuchAlgorithmException unused) {
            return false;
        }
    }
}
