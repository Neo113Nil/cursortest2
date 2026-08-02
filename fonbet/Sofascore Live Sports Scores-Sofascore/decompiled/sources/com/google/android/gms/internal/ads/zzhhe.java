package com.google.android.gms.internal.ads;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhhe {
    public zzhhm a = null;
    public zzicj b = null;
    public Integer c = null;

    private zzhhe() {
    }

    public final zzhhf a() {
        zzicj zzicjVar;
        zzich b;
        zzhhm zzhhmVar = this.a;
        if (zzhhmVar == null || (zzicjVar = this.b) == null) {
            defpackage.zzl.x("Cannot build without parameters and/or key material");
            return null;
        }
        if (zzhhmVar.a != zzicjVar.a.a.length) {
            defpackage.zzl.x("Key size mismatch");
            return null;
        }
        if (zzhhmVar.a() && this.c == null) {
            defpackage.zzl.x("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.a.a() && this.c != null) {
            defpackage.zzl.x("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        zzhhl zzhhlVar = this.a.b;
        if (zzhhlVar == zzhhl.d) {
            b = zzhnx.a;
        } else if (zzhhlVar == zzhhl.c) {
            b = zzhnx.a(this.c.intValue());
        } else {
            if (zzhhlVar != zzhhl.b) {
                a70.r("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(zzhhlVar)));
                return null;
            }
            b = zzhnx.b(this.c.intValue());
        }
        return new zzhhf(this.a, this.b, b, this.c);
    }

    public /* synthetic */ zzhhe(int i) {
    }
}
