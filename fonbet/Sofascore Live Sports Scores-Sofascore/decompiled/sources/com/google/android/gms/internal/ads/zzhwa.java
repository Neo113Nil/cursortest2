package com.google.android.gms.internal.ads;

import defpackage.a70;
import java.security.spec.ECPoint;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhwa {
    public zzhvx a = null;
    public ECPoint b = null;
    public Integer c = null;

    private zzhwa() {
    }

    public final zzhwb a() {
        zzich a;
        zzhvx zzhvxVar = this.a;
        if (zzhvxVar == null) {
            defpackage.zzl.x("Cannot build without parameters");
            return null;
        }
        ECPoint eCPoint = this.b;
        if (eCPoint == null) {
            defpackage.zzl.x("Cannot build without public point");
            return null;
        }
        zzhmm.a(eCPoint, zzhvxVar.b.b.getCurve());
        if (this.a.a() && this.c == null) {
            defpackage.zzl.x("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.a.a() && this.c != null) {
            defpackage.zzl.x("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        zzhvw zzhvwVar = this.a.d;
        if (zzhvwVar == zzhvw.e) {
            a = zzhnx.a;
        } else if (zzhvwVar == zzhvw.d || zzhvwVar == zzhvw.c) {
            a = zzhnx.a(this.c.intValue());
        } else {
            if (zzhvwVar != zzhvw.b) {
                a70.r("Unknown EcdsaParameters.Variant: ".concat(zzhvwVar.a));
                return null;
            }
            a = zzhnx.b(this.c.intValue());
        }
        return new zzhwb(this.a, this.b, a, this.c);
    }

    public /* synthetic */ zzhwa(int i) {
    }
}
