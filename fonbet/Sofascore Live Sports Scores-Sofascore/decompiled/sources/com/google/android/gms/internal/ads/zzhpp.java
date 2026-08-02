package com.google.android.gms.internal.ads;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhpp {
    public zzhpz a = null;
    public zzicj b = null;
    public Integer c = null;

    private zzhpp() {
    }

    public final zzhpq a() {
        zzicj zzicjVar;
        zzich a;
        zzhpz zzhpzVar = this.a;
        if (zzhpzVar == null || (zzicjVar = this.b) == null) {
            defpackage.zzl.x("Cannot build without parameters and/or key material");
            return null;
        }
        if (zzhpzVar.a != zzicjVar.a.a.length) {
            defpackage.zzl.x("Key size mismatch");
            return null;
        }
        if (zzhpzVar.a() && this.c == null) {
            defpackage.zzl.x("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.a.a() && this.c != null) {
            defpackage.zzl.x("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        zzhpy zzhpyVar = this.a.c;
        if (zzhpyVar == zzhpy.e) {
            a = zzhnx.a;
        } else if (zzhpyVar == zzhpy.d || zzhpyVar == zzhpy.c) {
            a = zzhnx.a(this.c.intValue());
        } else {
            if (zzhpyVar != zzhpy.b) {
                a70.r("Unknown HmacParameters.Variant: ".concat(String.valueOf(zzhpyVar)));
                return null;
            }
            a = zzhnx.b(this.c.intValue());
        }
        return new zzhpq(this.a, this.b, a, this.c);
    }

    public /* synthetic */ zzhpp(int i) {
    }
}
