package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.me4;
import defpackage.wt3;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhwo extends zzhyo {
    public final zzhwh a;
    public final zzich b;
    public final zzich c;
    public final Integer d;

    public zzhwo(zzhwh zzhwhVar, zzich zzichVar, zzich zzichVar2, Integer num) {
        this.a = zzhwhVar;
        this.b = zzichVar;
        this.c = zzichVar2;
        this.d = num;
    }

    public static zzhwo d(zzhwg zzhwgVar, zzich zzichVar, Integer num) {
        zzich a;
        byte[] bArr = zzichVar.a;
        zzhwh zzhwhVar = new zzhwh(zzhwgVar);
        zzhwg zzhwgVar2 = zzhwg.e;
        if (!zzhwgVar.equals(zzhwgVar2) && num == null) {
            String str = zzhwgVar.a;
            throw new GeneralSecurityException(wt3.m("For given Variant ", str, new StringBuilder(str.length() + 62), " the value of idRequirement must be non-null"));
        }
        if (zzhwgVar == zzhwgVar2 && num != null) {
            defpackage.zzl.x("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (bArr.length != 32) {
            int length = bArr.length;
            throw new GeneralSecurityException(me4.g(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        zzhwg zzhwgVar3 = zzhwhVar.a;
        if (zzhwgVar3 == zzhwgVar2) {
            a = zzhnx.a;
        } else if (zzhwgVar3 == zzhwg.c || zzhwgVar3 == zzhwg.d) {
            a = zzhnx.a(num.intValue());
        } else {
            if (zzhwgVar3 != zzhwg.b) {
                a70.r("Unknown Variant: ".concat(zzhwgVar3.a));
                return null;
            }
            a = zzhnx.b(num.intValue());
        }
        return new zzhwo(zzhwhVar, zzichVar, a, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhyo, com.google.android.gms.internal.ads.zzhes
    public final /* synthetic */ zzhfj a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    public final Integer b() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzhyo
    public final zzich c() {
        return this.c;
    }
}
