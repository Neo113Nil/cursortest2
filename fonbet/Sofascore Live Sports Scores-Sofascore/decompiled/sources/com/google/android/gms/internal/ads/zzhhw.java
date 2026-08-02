package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.mpo;
import defpackage.wt3;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhhw implements zzhek {
    public static final byte[] c = new byte[0];
    public static final Set d;
    public final String a;
    public final zzhek b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        d = Collections.unmodifiableSet(hashSet);
    }

    public zzhhw(zzhtw zzhtwVar, zzhek zzhekVar) {
        if (!d.contains(zzhtwVar.D())) {
            String D = zzhtwVar.D();
            a70.p(wt3.m("Unsupported DEK key type: ", D, new StringBuilder(String.valueOf(D).length() + 67), ". Only Tink AEAD key types are supported."));
            throw null;
        }
        this.a = zzhtwVar.D();
        zzhtv H = zzhtw.H(zzhtwVar);
        H.n();
        ((zzhtw) H.b).M(5);
        zzhft.a(((zzhtw) H.o()).d());
        this.b = zzhekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final byte[] c(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > 4096 || i > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] c2 = this.b.c(bArr3, c);
            String str = this.a;
            mpo mpoVar = zziei.b;
            try {
                return ((zzhek) ((zzhoo) zzhnt.b.a.get()).a(zzhnw.b.e(zzhos.a(str, zziei.B(0, c2.length, c2), zzhfl.c, zzhfm.e, null), zzhfr.a), zzhek.class)).c(bArr4, bArr2);
            } catch (NegativeArraySizeException e) {
                e = e;
                throw new GeneralSecurityException("invalid ciphertext", e);
            } catch (BufferUnderflowException e2) {
                e = e2;
                throw new GeneralSecurityException("invalid ciphertext", e);
            }
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e3) {
            e = e3;
        }
    }
}
