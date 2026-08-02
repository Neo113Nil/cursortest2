package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhii extends zzhfz {
    public final zzhim a;
    public final zzich b;
    public final Integer c;

    public zzhii(zzhim zzhimVar, zzich zzichVar, Integer num) {
        this.a = zzhimVar;
        this.b = zzichVar;
        this.c = num;
    }

    public static zzhii d(zzhim zzhimVar, Integer num) {
        zzich b;
        zzhil zzhilVar = zzhimVar.a;
        if (zzhilVar == zzhil.c) {
            if (num != null) {
                defpackage.zzl.x("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            b = zzhnx.a;
        } else {
            if (zzhilVar != zzhil.b) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzhilVar)));
            }
            if (num == null) {
                defpackage.zzl.x("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            b = zzhnx.b(num.intValue());
        }
        return new zzhii(zzhimVar, b, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhfz, com.google.android.gms.internal.ads.zzhes
    public final /* synthetic */ zzhfj a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    public final Integer b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzhfz
    public final zzich c() {
        return this.b;
    }
}
