package com.google.android.gms.internal.measurement;

import defpackage.a70;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzba {
    public static zzao a(zzae zzaeVar, zzg zzgVar, ArrayList arrayList, boolean z) {
        zzao zzaoVar;
        zzh.b(1, "reduce", arrayList);
        zzh.c(2, "reduce", arrayList);
        zzao b = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
        if (!(b instanceof zzai)) {
            a70.p("Callback should be a method");
            return null;
        }
        if (arrayList.size() == 2) {
            zzaoVar = zzgVar.b.b(zzgVar, (zzao) arrayList.get(1));
            if (zzaoVar instanceof zzag) {
                a70.p("Failed to parse initial value");
                return null;
            }
        } else {
            if (zzaeVar.m() == 0) {
                a70.r("Empty array with no initial value error");
                return null;
            }
            zzaoVar = null;
        }
        zzai zzaiVar = (zzai) b;
        int m = zzaeVar.m();
        int i = z ? 0 : m - 1;
        int i2 = z ? m - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (zzaoVar == null) {
            zzaoVar = zzaeVar.n(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (zzaeVar.p(i)) {
                zzaoVar = zzaiVar.d(zzgVar, Arrays.asList(zzaoVar, zzaeVar.n(i), new zzah(Double.valueOf(i)), zzaeVar));
                if (zzaoVar instanceof zzag) {
                    a70.r("Reduce operation failed");
                    return null;
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return zzaoVar;
    }

    public static zzae b(zzae zzaeVar, zzg zzgVar, zzan zzanVar, Boolean bool, Boolean bool2) {
        zzae zzaeVar2 = new zzae();
        Iterator e = zzaeVar.e();
        while (e.hasNext()) {
            int intValue = ((Integer) e.next()).intValue();
            if (zzaeVar.p(intValue)) {
                zzao d = zzanVar.d(zzgVar, Arrays.asList(zzaeVar.n(intValue), new zzah(Double.valueOf(intValue)), zzaeVar));
                if (d.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || d.zze().equals(bool2)) {
                    zzaeVar2.o(intValue, d);
                }
            }
        }
        return zzaeVar2;
    }
}
