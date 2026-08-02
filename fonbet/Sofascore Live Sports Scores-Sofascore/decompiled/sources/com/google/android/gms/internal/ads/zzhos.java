package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhos implements zzhow {
    public final String a;
    public final zzich b;
    public final zziei c;
    public final zzhfl d;
    public final zzhfm e;
    public final Integer f;

    public zzhos(String str, zzich zzichVar, zziei zzieiVar, zzhfl zzhflVar, zzhfm zzhfmVar, Integer num) {
        this.a = str;
        this.b = zzichVar;
        this.c = zzieiVar;
        this.d = zzhflVar;
        this.e = zzhfmVar;
        this.f = num;
    }

    public static zzhos a(String str, zziei zzieiVar, zzhfl zzhflVar, zzhfm zzhfmVar, Integer num) {
        if (zzhfmVar != zzhfm.e) {
            if (num == null) {
                defpackage.zzl.x("Keys with output prefix type different from raw should have an id requirement.");
                return null;
            }
        } else if (num != null) {
            defpackage.zzl.x("Keys with output prefix type raw should not have an id requirement.");
            return null;
        }
        return new zzhos(str, zzhpd.b(str), zzieiVar, zzhflVar, zzhfmVar, num);
    }
}
