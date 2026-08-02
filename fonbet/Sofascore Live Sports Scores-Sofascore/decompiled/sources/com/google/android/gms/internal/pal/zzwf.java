package com.google.android.gms.internal.pal;

import defpackage.a70;
import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzwf extends zzacz implements zzaeg {
    private static final zzwf zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzwf zzwfVar = new zzwf();
        zzb = zzwfVar;
        zzacz.e(zzwf.class, zzwfVar);
    }

    private zzwf() {
    }

    public static zzwe j() {
        return (zzwe) zzb.f();
    }

    public static /* synthetic */ void m(zzwf zzwfVar, String str) {
        str.getClass();
        zzwfVar.zze = str;
    }

    public static void q(zzwf zzwfVar, int i) {
        if (i != 1) {
            zzwfVar.zzf = i - 2;
        } else {
            a70.p("Can't get the number of an unknown enum value.");
        }
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzwf();
        }
        if (i2 == 4) {
            return new zzwe(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
