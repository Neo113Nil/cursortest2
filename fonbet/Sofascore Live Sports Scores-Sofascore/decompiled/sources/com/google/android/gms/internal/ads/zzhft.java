package com.google.android.gms.internal.ads;

import defpackage.dpo;
import defpackage.mno;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhft {
    public static zzhfj a(byte[] bArr) {
        try {
            zziew zziewVar = zziew.b;
            int i = dpo.a;
            zzhtw F = zzhtw.F(bArr, zziew.c);
            zzhnw zzhnwVar = zzhnw.b;
            zzhot b = zzhot.b(F);
            zzhpa zzhpaVar = (zzhpa) zzhnwVar.a.get();
            zzhpaVar.getClass();
            return !zzhpaVar.d.containsKey(new mno(zzhot.class, b.a)) ? new zzhnf(b) : zzhnwVar.g(b);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }
}
