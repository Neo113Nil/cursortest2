package org.bouncycastle.pqc.crypto.lms;

import com.plaid.internal.EnumC3631g;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes5.dex */
public class LMSPrivateKeyParameters extends LMSKeyParameters implements LMSContextBasedSigner {

    /* renamed from: T1, reason: collision with root package name */
    private static CacheKey f62060T1;
    private static CacheKey[] internedKeys;

    /* renamed from: I, reason: collision with root package name */
    private final byte[] f62061I;
    private final byte[] masterSecret;
    private final int maxCacheR;
    private final int maxQ;
    private final LMOtsParameters otsParameters;
    private final LMSigParameters parameters;
    private LMSPublicKeyParameters publicKey;

    /* renamed from: q, reason: collision with root package name */
    private int f62062q;
    private final Map<CacheKey, byte[]> tCache;
    private final Digest tDigest;

    public static class CacheKey {
        private final int index;

        public CacheKey(int i10) {
            this.index = i10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof CacheKey) && ((CacheKey) obj).index == this.index;
        }

        public int hashCode() {
            return this.index;
        }
    }

    static {
        CacheKey cacheKey = new CacheKey(1);
        f62060T1 = cacheKey;
        CacheKey[] cacheKeyArr = new CacheKey[EnumC3631g.SDK_ASSET_ILLUSTRATION_FORM_VALUE];
        internedKeys = cacheKeyArr;
        cacheKeyArr[1] = cacheKey;
        int i10 = 2;
        while (true) {
            CacheKey[] cacheKeyArr2 = internedKeys;
            if (i10 >= cacheKeyArr2.length) {
                return;
            }
            cacheKeyArr2[i10] = new CacheKey(i10);
            i10++;
        }
    }

    private LMSPrivateKeyParameters(LMSPrivateKeyParameters lMSPrivateKeyParameters, int i10, int i11) {
        super(true);
        LMSigParameters lMSigParameters = lMSPrivateKeyParameters.parameters;
        this.parameters = lMSigParameters;
        this.otsParameters = lMSPrivateKeyParameters.otsParameters;
        this.f62062q = i10;
        this.f62061I = lMSPrivateKeyParameters.f62061I;
        this.maxQ = i11;
        this.masterSecret = lMSPrivateKeyParameters.masterSecret;
        this.maxCacheR = 1 << lMSigParameters.getH();
        this.tCache = lMSPrivateKeyParameters.tCache;
        this.tDigest = DigestUtil.getDigest(lMSigParameters.getDigestOID());
        this.publicKey = lMSPrivateKeyParameters.publicKey;
    }

    private byte[] calcT(int i10) {
        int h10 = 1 << getSigParameters().getH();
        if (i10 >= h10) {
            LmsUtils.byteArray(getI(), this.tDigest);
            LmsUtils.u32str(i10, this.tDigest);
            LmsUtils.u16str((short) -32126, this.tDigest);
            LmsUtils.byteArray(LM_OTS.lms_ots_generatePublicKey(getOtsParameters(), getI(), i10 - h10, getMasterSecret()), this.tDigest);
            byte[] bArr = new byte[this.tDigest.getDigestSize()];
            this.tDigest.doFinal(bArr, 0);
            return bArr;
        }
        int i11 = i10 * 2;
        byte[] findT = findT(i11);
        byte[] findT2 = findT(i11 + 1);
        LmsUtils.byteArray(getI(), this.tDigest);
        LmsUtils.u32str(i10, this.tDigest);
        LmsUtils.u16str((short) -31869, this.tDigest);
        LmsUtils.byteArray(findT, this.tDigest);
        LmsUtils.byteArray(findT2, this.tDigest);
        byte[] bArr2 = new byte[this.tDigest.getDigestSize()];
        this.tDigest.doFinal(bArr2, 0);
        return bArr2;
    }

    public static LMSPrivateKeyParameters getInstance(Object obj) {
        Throwable th2;
        DataInputStream dataInputStream;
        if (obj instanceof LMSPrivateKeyParameters) {
            return (LMSPrivateKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() != 0) {
                throw new IllegalStateException("expected version 0 lms private key");
            }
            LMSigParameters parametersForType = LMSigParameters.getParametersForType(dataInputStream2.readInt());
            LMOtsParameters parametersForType2 = LMOtsParameters.getParametersForType(dataInputStream2.readInt());
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            int readInt = dataInputStream2.readInt();
            int readInt2 = dataInputStream2.readInt();
            int readInt3 = dataInputStream2.readInt();
            if (readInt3 < 0) {
                throw new IllegalStateException("secret length less than zero");
            }
            if (readInt3 <= dataInputStream2.available()) {
                byte[] bArr2 = new byte[readInt3];
                dataInputStream2.readFully(bArr2);
                return new LMSPrivateKeyParameters(parametersForType, parametersForType2, readInt, bArr, readInt2, bArr2);
            }
            throw new IOException("secret length exceeded " + dataInputStream2.available());
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream3 = null;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            LMSPrivateKeyParameters lMSPrivateKeyParameters = getInstance(dataInputStream);
            dataInputStream.close();
            return lMSPrivateKeyParameters;
        } catch (Throwable th4) {
            th2 = th4;
            dataInputStream3 = dataInputStream;
            if (dataInputStream3 == null) {
                throw th2;
            }
            dataInputStream3.close();
            throw th2;
        }
    }

    public boolean equals(Object obj) {
        LMSPublicKeyParameters lMSPublicKeyParameters;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LMSPrivateKeyParameters lMSPrivateKeyParameters = (LMSPrivateKeyParameters) obj;
        if (this.f62062q != lMSPrivateKeyParameters.f62062q || this.maxQ != lMSPrivateKeyParameters.maxQ || !Arrays.areEqual(this.f62061I, lMSPrivateKeyParameters.f62061I)) {
            return false;
        }
        LMSigParameters lMSigParameters = this.parameters;
        if (lMSigParameters == null ? lMSPrivateKeyParameters.parameters != null : !lMSigParameters.equals(lMSPrivateKeyParameters.parameters)) {
            return false;
        }
        LMOtsParameters lMOtsParameters = this.otsParameters;
        if (lMOtsParameters == null ? lMSPrivateKeyParameters.otsParameters != null : !lMOtsParameters.equals(lMSPrivateKeyParameters.otsParameters)) {
            return false;
        }
        if (!Arrays.areEqual(this.masterSecret, lMSPrivateKeyParameters.masterSecret)) {
            return false;
        }
        LMSPublicKeyParameters lMSPublicKeyParameters2 = this.publicKey;
        if (lMSPublicKeyParameters2 == null || (lMSPublicKeyParameters = lMSPrivateKeyParameters.publicKey) == null) {
            return true;
        }
        return lMSPublicKeyParameters2.equals(lMSPublicKeyParameters);
    }

    public LMSPrivateKeyParameters extractKeyShard(int i10) {
        LMSPrivateKeyParameters lMSPrivateKeyParameters;
        synchronized (this) {
            try {
                int i11 = this.f62062q;
                if (i11 + i10 >= this.maxQ) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining");
                }
                lMSPrivateKeyParameters = new LMSPrivateKeyParameters(this, i11, i11 + i10);
                this.f62062q += i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lMSPrivateKeyParameters;
    }

    public byte[] findT(int i10) {
        if (i10 >= this.maxCacheR) {
            return calcT(i10);
        }
        CacheKey[] cacheKeyArr = internedKeys;
        return findT(i10 < cacheKeyArr.length ? cacheKeyArr[i10] : new CacheKey(i10));
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public LMSContext generateLMSContext() {
        int h10 = getSigParameters().getH();
        int index = getIndex();
        LMOtsPrivateKey nextOtsPrivateKey = getNextOtsPrivateKey();
        int i10 = (1 << h10) + index;
        byte[][] bArr = new byte[h10][];
        for (int i11 = 0; i11 < h10; i11++) {
            bArr[i11] = findT((i10 / (1 << i11)) ^ 1);
        }
        return nextOtsPrivateKey.getSignatureContext(getSigParameters(), bArr);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public byte[] generateSignature(LMSContext lMSContext) {
        try {
            return LMS.generateSign(lMSContext).getEncoded();
        } catch (IOException e10) {
            throw new IllegalStateException("unable to encode signature: " + e10.getMessage(), e10);
        }
    }

    public LMOtsPrivateKey getCurrentOTSKey() {
        LMOtsPrivateKey lMOtsPrivateKey;
        synchronized (this) {
            try {
                int i10 = this.f62062q;
                if (i10 >= this.maxQ) {
                    throw new ExhaustedPrivateKeyException("ots private keys expired");
                }
                lMOtsPrivateKey = new LMOtsPrivateKey(this.otsParameters, this.f62061I, i10, this.masterSecret);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lMOtsPrivateKey;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return Composer.compose().u32str(0).u32str(this.parameters.getType()).u32str(this.otsParameters.getType()).bytes(this.f62061I).u32str(this.f62062q).u32str(this.maxQ).u32str(this.masterSecret.length).bytes(this.masterSecret).build();
    }

    public byte[] getI() {
        return Arrays.clone(this.f62061I);
    }

    public synchronized int getIndex() {
        return this.f62062q;
    }

    public byte[] getMasterSecret() {
        return Arrays.clone(this.masterSecret);
    }

    public LMOtsPrivateKey getNextOtsPrivateKey() {
        LMOtsPrivateKey lMOtsPrivateKey;
        synchronized (this) {
            try {
                int i10 = this.f62062q;
                if (i10 >= this.maxQ) {
                    throw new ExhaustedPrivateKeyException("ots private key exhausted");
                }
                lMOtsPrivateKey = new LMOtsPrivateKey(this.otsParameters, this.f62061I, i10, this.masterSecret);
                incIndex();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lMOtsPrivateKey;
    }

    public LMOtsParameters getOtsParameters() {
        return this.otsParameters;
    }

    public LMSPublicKeyParameters getPublicKey() {
        LMSPublicKeyParameters lMSPublicKeyParameters;
        synchronized (this) {
            try {
                if (this.publicKey == null) {
                    this.publicKey = new LMSPublicKeyParameters(this.parameters, this.otsParameters, findT(f62060T1), this.f62061I);
                }
                lMSPublicKeyParameters = this.publicKey;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lMSPublicKeyParameters;
    }

    public LMSigParameters getSigParameters() {
        return this.parameters;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public long getUsagesRemaining() {
        return this.maxQ - this.f62062q;
    }

    public int hashCode() {
        int hashCode = ((this.f62062q * 31) + Arrays.hashCode(this.f62061I)) * 31;
        LMSigParameters lMSigParameters = this.parameters;
        int hashCode2 = (hashCode + (lMSigParameters != null ? lMSigParameters.hashCode() : 0)) * 31;
        LMOtsParameters lMOtsParameters = this.otsParameters;
        int hashCode3 = (((((hashCode2 + (lMOtsParameters != null ? lMOtsParameters.hashCode() : 0)) * 31) + this.maxQ) * 31) + Arrays.hashCode(this.masterSecret)) * 31;
        LMSPublicKeyParameters lMSPublicKeyParameters = this.publicKey;
        return hashCode3 + (lMSPublicKeyParameters != null ? lMSPublicKeyParameters.hashCode() : 0);
    }

    public synchronized void incIndex() {
        this.f62062q++;
    }

    public LMSPrivateKeyParameters(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, int i10, byte[] bArr, int i11, byte[] bArr2) {
        super(true);
        this.parameters = lMSigParameters;
        this.otsParameters = lMOtsParameters;
        this.f62062q = i10;
        this.f62061I = Arrays.clone(bArr);
        this.maxQ = i11;
        this.masterSecret = Arrays.clone(bArr2);
        this.maxCacheR = 1 << (lMSigParameters.getH() + 1);
        this.tCache = new WeakHashMap();
        this.tDigest = DigestUtil.getDigest(lMSigParameters.getDigestOID());
    }

    private byte[] findT(CacheKey cacheKey) {
        byte[] bArr;
        synchronized (this.tCache) {
            try {
                bArr = this.tCache.get(cacheKey);
                if (bArr == null) {
                    bArr = calcT(cacheKey.index);
                    this.tCache.put(cacheKey, bArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    public static LMSPrivateKeyParameters getInstance(byte[] bArr, byte[] bArr2) {
        LMSPrivateKeyParameters lMSPrivateKeyParameters = getInstance(bArr);
        lMSPrivateKeyParameters.publicKey = LMSPublicKeyParameters.getInstance(bArr2);
        return lMSPrivateKeyParameters;
    }
}
