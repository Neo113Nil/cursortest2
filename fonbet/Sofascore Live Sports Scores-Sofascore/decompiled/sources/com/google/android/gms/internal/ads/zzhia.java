package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhia extends zzhfz {
    public final zzhic a;
    public final zzich b;
    public final Integer c;

    public zzhia(zzhic zzhicVar, zzich zzichVar, Integer num) {
        this.a = zzhicVar;
        this.b = zzichVar;
        this.c = num;
    }

    public static zzhia d(zzhic zzhicVar, Integer num) {
        zzich a;
        zzhib zzhibVar = zzhicVar.b;
        if (zzhibVar == zzhib.b) {
            if (num == null) {
                defpackage.zzl.x("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            a = zzich.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzhibVar != zzhib.c) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zzhibVar.a));
            }
            if (num != null) {
                defpackage.zzl.x("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            a = zzich.a(new byte[0]);
        }
        return new zzhia(zzhicVar, a, num);
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
