package com.google.android.gms.internal.ads;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhgd {
    public zzhgm a = null;
    public zzicj b = null;
    public zzicj c = null;
    public Integer d = null;

    private zzhgd() {
    }

    public final zzhge a() {
        zzicj zzicjVar;
        zzich b;
        zzhgm zzhgmVar = this.a;
        if (zzhgmVar == null) {
            defpackage.zzl.x("Cannot build without parameters");
            return null;
        }
        zzicj zzicjVar2 = this.b;
        if (zzicjVar2 == null || (zzicjVar = this.c) == null) {
            defpackage.zzl.x("Cannot build without key material");
            return null;
        }
        if (zzhgmVar.a != zzicjVar2.a.a.length) {
            defpackage.zzl.x("AES key size mismatch");
            return null;
        }
        if (zzhgmVar.b != zzicjVar.a.a.length) {
            defpackage.zzl.x("HMAC key size mismatch");
            return null;
        }
        if (zzhgmVar.a() && this.d == null) {
            defpackage.zzl.x("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.a.a() && this.d != null) {
            defpackage.zzl.x("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        zzhgl zzhglVar = this.a.e;
        if (zzhglVar == zzhgl.d) {
            b = zzhnx.a;
        } else if (zzhglVar == zzhgl.c) {
            b = zzhnx.a(this.d.intValue());
        } else {
            if (zzhglVar != zzhgl.b) {
                a70.r("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(zzhglVar)));
                return null;
            }
            b = zzhnx.b(this.d.intValue());
        }
        return new zzhge(this.a, this.b, this.c, b, this.d);
    }

    public /* synthetic */ zzhgd(int i) {
    }
}
