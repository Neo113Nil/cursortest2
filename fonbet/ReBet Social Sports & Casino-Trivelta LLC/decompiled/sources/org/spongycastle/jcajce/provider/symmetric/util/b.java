package org.spongycastle.jcajce.provider.symmetric.util;

import Xi.i;
import Xi.j;
import Xi.k;
import Xi.l;
import ej.AbstractC4217a;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.crypto.digests.h;
import org.spongycastle.crypto.params.AbstractC5976c;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.params.z;
import org.spongycastle.crypto.y;

/* loaded from: classes5.dex */
public abstract class b {
    public static byte[] a(int i10, PBEKeySpec pBEKeySpec) {
        return i10 == 2 ? y.a(pBEKeySpec.getPassword()) : (i10 == 5 || i10 == 4) ? y.c(pBEKeySpec.getPassword()) : y.b(pBEKeySpec.getPassword());
    }

    public static y b(int i10, int i11) {
        if (i10 == 0 || i10 == 4) {
            if (i11 == 0) {
                return new k(AbstractC4217a.a());
            }
            if (i11 == 1) {
                return new k(AbstractC4217a.b());
            }
            if (i11 == 5) {
                return new k(new h());
            }
            throw new IllegalStateException("PKCS5 scheme 1 only supports MD2, MD5 and SHA1.");
        }
        if (i10 == 1 || i10 == 5) {
            switch (i11) {
                case 0:
                    return new l(AbstractC4217a.a());
                case 1:
                    return new l(AbstractC4217a.b());
                case 2:
                    return new l(new org.spongycastle.crypto.digests.l());
                case 3:
                    return new l(new org.spongycastle.crypto.digests.y());
                case 4:
                    return new l(AbstractC4217a.d());
                case 5:
                    return new l(new h());
                case 6:
                    return new l(new org.spongycastle.crypto.digests.a());
                case 7:
                    return new l(AbstractC4217a.c());
                case 8:
                    return new l(AbstractC4217a.e());
                case 9:
                    return new l(AbstractC4217a.j());
                default:
                    throw new IllegalStateException("unknown digest scheme for PBE PKCS5S2 encryption.");
            }
        }
        if (i10 != 2) {
            return new i();
        }
        switch (i11) {
            case 0:
                return new j(AbstractC4217a.a());
            case 1:
                return new j(AbstractC4217a.b());
            case 2:
                return new j(new org.spongycastle.crypto.digests.l());
            case 3:
                return new j(new org.spongycastle.crypto.digests.y());
            case 4:
                return new j(AbstractC4217a.d());
            case 5:
                return new j(new h());
            case 6:
                return new j(new org.spongycastle.crypto.digests.a());
            case 7:
                return new j(AbstractC4217a.c());
            case 8:
                return new j(AbstractC4217a.e());
            case 9:
                return new j(AbstractC4217a.j());
            default:
                throw new IllegalStateException("unknown digest scheme for PBE encryption.");
        }
    }

    public static org.spongycastle.crypto.j c(SecretKey secretKey, int i10, int i11, int i12, PBEParameterSpec pBEParameterSpec) {
        y b10 = b(i10, i11);
        byte[] encoded = secretKey.getEncoded();
        b10.g(secretKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
        org.spongycastle.crypto.j d10 = b10.d(i12);
        for (int i13 = 0; i13 != encoded.length; i13++) {
            encoded[i13] = 0;
        }
        return d10;
    }

    public static org.spongycastle.crypto.j d(PBEKeySpec pBEKeySpec, int i10, int i11, int i12) {
        y b10 = b(i10, i11);
        byte[] a10 = a(i10, pBEKeySpec);
        b10.g(a10, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
        org.spongycastle.crypto.j d10 = b10.d(i12);
        for (int i13 = 0; i13 != a10.length; i13++) {
            a10[i13] = 0;
        }
        return d10;
    }

    public static org.spongycastle.crypto.j e(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
        }
        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
        y b10 = b(bCPBEKey.getType(), bCPBEKey.getDigest());
        b10.g(bCPBEKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
        return b10.d(bCPBEKey.getKeySize());
    }

    public static org.spongycastle.crypto.j f(PBEKeySpec pBEKeySpec, int i10, int i11, int i12, int i13) {
        y b10 = b(i10, i11);
        byte[] a10 = a(i10, pBEKeySpec);
        b10.g(a10, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
        org.spongycastle.crypto.j f10 = i13 != 0 ? b10.f(i12, i13) : b10.e(i12);
        for (int i14 = 0; i14 != a10.length; i14++) {
            a10[i14] = 0;
        }
        return f10;
    }

    public static org.spongycastle.crypto.j g(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, String str) {
        if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
        }
        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
        y b10 = b(bCPBEKey.getType(), bCPBEKey.getDigest());
        byte[] encoded = bCPBEKey.getEncoded();
        if (bCPBEKey.shouldTryWrongPKCS12()) {
            encoded = new byte[2];
        }
        b10.g(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
        org.spongycastle.crypto.j f10 = bCPBEKey.getIvSize() != 0 ? b10.f(bCPBEKey.getKeySize(), bCPBEKey.getIvSize()) : b10.e(bCPBEKey.getKeySize());
        if (str.startsWith("DES")) {
            if (f10 instanceof z) {
                AbstractC5976c.c(((w) ((z) f10).b()).a());
                return f10;
            }
            AbstractC5976c.c(((w) f10).a());
        }
        return f10;
    }

    public static org.spongycastle.crypto.j h(byte[] bArr, int i10, int i11, int i12, int i13, AlgorithmParameterSpec algorithmParameterSpec, String str) {
        if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw new InvalidAlgorithmParameterException("Need a PBEParameter spec with a PBE key.");
        }
        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
        y b10 = b(i10, i11);
        b10.g(bArr, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
        org.spongycastle.crypto.j f10 = i13 != 0 ? b10.f(i12, i13) : b10.e(i12);
        if (str.startsWith("DES")) {
            if (f10 instanceof z) {
                AbstractC5976c.c(((w) ((z) f10).b()).a());
                return f10;
            }
            AbstractC5976c.c(((w) f10).a());
        }
        return f10;
    }
}
