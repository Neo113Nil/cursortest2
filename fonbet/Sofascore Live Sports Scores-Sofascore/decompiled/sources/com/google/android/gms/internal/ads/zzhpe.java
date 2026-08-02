package com.google.android.gms.internal.ads;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhpe {
    public zzhpm a = null;
    public zzicj b = null;
    public Integer c = null;

    private zzhpe() {
    }

    public final zzhpf a() {
        zzicj zzicjVar;
        zzich a;
        zzhpm zzhpmVar = this.a;
        if (zzhpmVar == null || (zzicjVar = this.b) == null) {
            defpackage.zzl.x("Cannot build without parameters and/or key material");
            return null;
        }
        if (zzhpmVar.a != zzicjVar.a.a.length) {
            defpackage.zzl.x("Key size mismatch");
            return null;
        }
        if (zzhpmVar.a() && this.c == null) {
            defpackage.zzl.x("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.a.a() && this.c != null) {
            defpackage.zzl.x("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        zzhpl zzhplVar = this.a.c;
        if (zzhplVar == zzhpl.e) {
            a = zzhnx.a;
        } else if (zzhplVar == zzhpl.d || zzhplVar == zzhpl.c) {
            a = zzhnx.a(this.c.intValue());
        } else {
            if (zzhplVar != zzhpl.b) {
                a70.r("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(zzhplVar)));
                return null;
            }
            a = zzhnx.b(this.c.intValue());
        }
        return new zzhpf(this.a, this.b, a, this.c);
    }

    public /* synthetic */ zzhpe(int i) {
    }
}
