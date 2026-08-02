package com.google.android.gms.internal.ads;

import defpackage.f0o;
import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzibu implements zzhrh {
    public static zzhrh b(zzhrf zzhrfVar) {
        zzicj zzicjVar = zzhrfVar.b;
        zzhfr zzhfrVar = zzhfr.a;
        zzhrl zzhrlVar = new zzhrl(zzicjVar.a.b());
        try {
            Provider a = zzhmb.a();
            if (a == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", a);
            return new f0o(24, zzhrlVar, new zzhrm(zzicjVar.a.b(), a));
        } catch (GeneralSecurityException unused) {
            return zzhrlVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhrh
    public final byte[] a(int i, byte[] bArr) {
        throw null;
    }
}
