package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.me4;
import defpackage.wt3;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhjc extends zzhfz {
    public final zzhjh a;
    public final zzicj b;
    public final zzich c;
    public final Integer d;

    public zzhjc(zzhjh zzhjhVar, zzicj zzicjVar, zzich zzichVar, Integer num) {
        this.a = zzhjhVar;
        this.b = zzicjVar;
        this.c = zzichVar;
        this.d = num;
    }

    public static zzhjc d(zzhjh zzhjhVar, zzicj zzicjVar, Integer num) {
        zzich b;
        zzich zzichVar = zzicjVar.a;
        zzhjg zzhjgVar = zzhjhVar.a;
        zzhjg zzhjgVar2 = zzhjg.c;
        if (zzhjgVar != zzhjgVar2 && num == null) {
            String str = zzhjgVar.a;
            throw new GeneralSecurityException(wt3.m("For given Variant ", str, new StringBuilder(str.length() + 62), " the value of idRequirement must be non-null"));
        }
        if (zzhjgVar == zzhjgVar2 && num != null) {
            defpackage.zzl.x("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (zzichVar.a.length != 32) {
            int length = zzichVar.a.length;
            throw new GeneralSecurityException(me4.g(length, "XAesGcmKey key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 68)));
        }
        if (zzhjgVar == zzhjgVar2) {
            b = zzhnx.a;
        } else {
            if (zzhjgVar != zzhjg.b) {
                a70.r("Unknown Variant: ".concat(zzhjgVar.a));
                return null;
            }
            b = zzhnx.b(num.intValue());
        }
        return new zzhjc(zzhjhVar, zzicjVar, b, num);
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
