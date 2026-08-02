package org.spongycastle.jcajce.provider.asymmetric.util;

import Li.g;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import lj.C5474a;
import lj.InterfaceC5475b;
import org.spongycastle.crypto.C;
import org.spongycastle.crypto.r;

/* loaded from: classes5.dex */
public abstract class BaseCipherSpi extends CipherSpi {
    private byte[] iv;
    private int ivSize;
    private Class[] availableSpecs = {IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
    private final InterfaceC5475b helper = new C5474a();
    protected AlgorithmParameters engineParams = null;
    protected C wrapEngine = null;

    public class a extends InvalidKeyException {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BadPaddingException f62695a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, BadPaddingException badPaddingException) {
            super(str);
            this.f62695a = badPaddingException;
        }

        @Override // java.lang.Throwable
        public synchronized Throwable getCause() {
            return this.f62695a;
        }
    }

    public final AlgorithmParameters createParametersInstance(String str) {
        return this.helper.createAlgorithmParameters(str);
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i10) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        throw new NoSuchAlgorithmException("can't support mode " + str);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) {
        throw new NoSuchPaddingException("Padding " + str + " unknown.");
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i10) {
        try {
            C c10 = this.wrapEngine;
            byte[] engineDoFinal = c10 == null ? engineDoFinal(bArr, 0, bArr.length) : c10.unwrap(bArr, 0, bArr.length);
            if (i10 == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            if (str.equals("") && i10 == 2) {
                try {
                    g e10 = g.e(engineDoFinal);
                    PrivateKey c11 = org.spongycastle.jce.provider.a.c(e10);
                    if (c11 != null) {
                        return c11;
                    }
                    throw new InvalidKeyException("algorithm " + e10.f().c() + " not supported");
                } catch (Exception unused) {
                    throw new InvalidKeyException("Invalid key encoding.");
                }
            }
            try {
                KeyFactory createKeyFactory = this.helper.createKeyFactory(str);
                if (i10 == 1) {
                    return createKeyFactory.generatePublic(new X509EncodedKeySpec(engineDoFinal));
                }
                if (i10 == 2) {
                    return createKeyFactory.generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
                }
                throw new InvalidKeyException("Unknown key type " + i10);
            } catch (NoSuchAlgorithmException e11) {
                throw new InvalidKeyException("Unknown key type " + e11.getMessage());
            } catch (NoSuchProviderException e12) {
                throw new InvalidKeyException("Unknown key type " + e12.getMessage());
            } catch (InvalidKeySpecException e13) {
                throw new InvalidKeyException("Unknown key type " + e13.getMessage());
            }
        } catch (BadPaddingException e14) {
            throw new a("unable to unwrap", e14);
        } catch (IllegalBlockSizeException e15) {
            throw new InvalidKeyException(e15.getMessage());
        } catch (r e16) {
            throw new InvalidKeyException(e16.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try {
            C c10 = this.wrapEngine;
            return c10 == null ? engineDoFinal(encoded, 0, encoded.length) : c10.wrap(encoded, 0, encoded.length);
        } catch (BadPaddingException e10) {
            throw new IllegalBlockSizeException(e10.getMessage());
        }
    }
}
