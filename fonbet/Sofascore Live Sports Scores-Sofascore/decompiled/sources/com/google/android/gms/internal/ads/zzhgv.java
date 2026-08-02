package com.google.android.gms.internal.ads;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhgv {
    public zzhhd a = null;
    public zzicj b = null;
    public Integer c = null;

    private zzhgv() {
    }

    public final zzhgw a() {
        zzicj zzicjVar;
        zzich b;
        zzhhd zzhhdVar = this.a;
        if (zzhhdVar == null || (zzicjVar = this.b) == null) {
            defpackage.zzl.x("Cannot build without parameters and/or key material");
            return null;
        }
        if (zzhhdVar.a != zzicjVar.a.a.length) {
            defpackage.zzl.x("Key size mismatch");
            return null;
        }
        if (zzhhdVar.a() && this.c == null) {
            defpackage.zzl.x("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.a.a() && this.c != null) {
            defpackage.zzl.x("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        zzhhc zzhhcVar = this.a.b;
        if (zzhhcVar == zzhhc.d) {
            b = zzhnx.a;
        } else if (zzhhcVar == zzhhc.c) {
            b = zzhnx.a(this.c.intValue());
        } else {
            if (zzhhcVar != zzhhc.b) {
                a70.r("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(zzhhcVar)));
                return null;
            }
            b = zzhnx.b(this.c.intValue());
        }
        return new zzhgw(this.a, this.b, b, this.c);
    }

    public /* synthetic */ zzhgv(int i) {
    }
}
