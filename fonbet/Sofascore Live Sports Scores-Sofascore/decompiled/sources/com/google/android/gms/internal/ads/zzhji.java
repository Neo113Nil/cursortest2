package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.me4;
import defpackage.wt3;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhji extends zzhfz {
    public final zzhjo a;
    public final zzicj b;
    public final zzich c;
    public final Integer d;

    public zzhji(zzhjo zzhjoVar, zzicj zzicjVar, zzich zzichVar, Integer num) {
        this.a = zzhjoVar;
        this.b = zzicjVar;
        this.c = zzichVar;
        this.d = num;
    }

    public static zzhji d(zzhjn zzhjnVar, zzicj zzicjVar, Integer num) {
        zzich b;
        zzich zzichVar = zzicjVar.a;
        zzhjn zzhjnVar2 = zzhjn.d;
        if (zzhjnVar != zzhjnVar2 && num == null) {
            String str = zzhjnVar.a;
            throw new GeneralSecurityException(wt3.m("For given Variant ", str, new StringBuilder(str.length() + 62), " the value of idRequirement must be non-null"));
        }
        if (zzhjnVar == zzhjnVar2 && num != null) {
            defpackage.zzl.x("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (zzichVar.a.length != 32) {
            int length = zzichVar.a.length;
            throw new GeneralSecurityException(me4.g(length, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 75)));
        }
        zzhjo zzhjoVar = new zzhjo(zzhjnVar);
        zzhjn zzhjnVar3 = zzhjoVar.a;
        if (zzhjnVar3 == zzhjnVar2) {
            b = zzhnx.a;
        } else if (zzhjnVar3 == zzhjn.c) {
            b = zzhnx.a(num.intValue());
        } else {
            if (zzhjnVar3 != zzhjn.b) {
                a70.r("Unknown Variant: ".concat(zzhjnVar3.a));
                return null;
            }
            b = zzhnx.b(num.intValue());
        }
        return new zzhji(zzhjoVar, zzicjVar, b, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhfz, com.google.android.gms.internal.ads.zzhes
    public final /* synthetic */ zzhfj a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    public final Integer b() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzhfz
    public final zzich c() {
        return this.c;
    }
}
