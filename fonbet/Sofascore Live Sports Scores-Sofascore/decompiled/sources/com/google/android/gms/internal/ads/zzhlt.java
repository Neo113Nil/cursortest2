package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.j40;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhlt implements zzhek {
    public static final j40 a = new j40(13);

    public static zzhkh a(zzhhf zzhhfVar) {
        byte[] bArr = zzhkh.c;
        try {
            Cipher cipher = (Cipher) a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            if (!zzhkh.a(cipher)) {
                a70.r("Cipher does not implement AES GCM SIV.");
                return null;
            }
            zzicj zzicjVar = zzhhfVar.b;
            zzhfr zzhfrVar = zzhfr.a;
            return new zzhkh(zzicjVar.a.b(), zzhhfVar.c.b());
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final byte[] c(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
