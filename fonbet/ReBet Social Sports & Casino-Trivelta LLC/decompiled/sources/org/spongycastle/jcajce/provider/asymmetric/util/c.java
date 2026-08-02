package org.spongycastle.jcajce.provider.asymmetric.util;

import Li.g;
import Qi.u;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import nj.C5740a;
import org.spongycastle.crypto.params.AbstractC5975b;
import org.spongycastle.crypto.params.k;
import org.spongycastle.crypto.params.n;
import org.spongycastle.crypto.params.o;

/* loaded from: classes5.dex */
public abstract class c {
    public static int[] a(int[] iArr) {
        int i10;
        int[] iArr2 = new int[3];
        if (iArr.length == 1) {
            iArr2[0] = iArr[0];
            return iArr2;
        }
        if (iArr.length != 3) {
            throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
        }
        int i11 = iArr[0];
        int i12 = iArr[1];
        if (i11 < i12 && i11 < (i10 = iArr[2])) {
            iArr2[0] = i11;
            if (i12 < i10) {
                iArr2[1] = i12;
                iArr2[2] = i10;
                return iArr2;
            }
            iArr2[1] = i10;
            iArr2[2] = iArr[1];
            return iArr2;
        }
        int i13 = iArr[2];
        if (i12 < i13) {
            iArr2[0] = i12;
            int i14 = iArr[0];
            if (i14 < i13) {
                iArr2[1] = i14;
                iArr2[2] = i13;
                return iArr2;
            }
            iArr2[1] = i13;
            iArr2[2] = i14;
            return iArr2;
        }
        iArr2[0] = i13;
        int i15 = iArr[0];
        if (i15 < i12) {
            iArr2[1] = i15;
            iArr2[2] = iArr[1];
            return iArr2;
        }
        iArr2[1] = i12;
        iArr2[2] = i15;
        return iArr2;
    }

    public static AbstractC5975b b(PrivateKey privateKey) {
        if (privateKey instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) privateKey;
            C5740a d10 = b.d(eCPrivateKey.getParams(), false);
            return new n(eCPrivateKey.getS(), new k(d10.a(), d10.b(), d10.d(), d10.c(), d10.e()));
        }
        try {
            byte[] encoded = privateKey.getEncoded();
            if (encoded == null) {
                throw new InvalidKeyException("no encoding for EC private key");
            }
            PrivateKey c10 = org.spongycastle.jce.provider.a.c(g.e(encoded));
            if (c10 instanceof ECPrivateKey) {
                return b(c10);
            }
            throw new InvalidKeyException("can't identify EC private key.");
        } catch (Exception e10) {
            throw new InvalidKeyException("cannot identify EC private key: " + e10.toString());
        }
    }

    public static AbstractC5975b c(PublicKey publicKey) {
        if (publicKey instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            C5740a d10 = b.d(eCPublicKey.getParams(), false);
            return new o(b.b(eCPublicKey.getParams(), eCPublicKey.getW(), false), new k(d10.a(), d10.b(), d10.d(), d10.c(), d10.e()));
        }
        try {
            byte[] encoded = publicKey.getEncoded();
            if (encoded == null) {
                throw new InvalidKeyException("no encoding for EC public key");
            }
            PublicKey d11 = org.spongycastle.jce.provider.a.d(u.f(encoded));
            if (d11 instanceof ECPublicKey) {
                return c(d11);
            }
            throw new InvalidKeyException("cannot identify EC public key.");
        } catch (Exception e10) {
            throw new InvalidKeyException("cannot identify EC public key: " + e10.toString());
        }
    }
}
