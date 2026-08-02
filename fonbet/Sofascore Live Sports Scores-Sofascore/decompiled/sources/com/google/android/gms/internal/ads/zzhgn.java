package com.google.android.gms.internal.ads;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhgn {
    public zzhgu a = null;
    public zzicj b = null;
    public Integer c = null;

    private zzhgn() {
    }

    public final zzhgo a() {
        zzicj zzicjVar;
        zzich b;
        zzhgu zzhguVar = this.a;
        if (zzhguVar == null || (zzicjVar = this.b) == null) {
            defpackage.zzl.x("Cannot build without parameters and/or key material");
            return null;
        }
        if (zzhguVar.a != zzicjVar.a.a.length) {
            defpackage.zzl.x("Key size mismatch");
            return null;
        }
        if (zzhguVar.a() && this.c == null) {
            defpackage.zzl.x("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.a.a() && this.c != null) {
            defpackage.zzl.x("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        zzhgt zzhgtVar = this.a.c;
        if (zzhgtVar == zzhgt.d) {
            b = zzhnx.a;
        } else if (zzhgtVar == zzhgt.c) {
            b = zzhnx.a(this.c.intValue());
        } else {
            if (zzhgtVar != zzhgt.b) {
                a70.r("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(zzhgtVar)));
                return null;
            }
            b = zzhnx.b(this.c.intValue());
        }
        return new zzhgo(this.a, this.b, b, this.c);
    }

    public /* synthetic */ zzhgn(int i) {
    }
}
