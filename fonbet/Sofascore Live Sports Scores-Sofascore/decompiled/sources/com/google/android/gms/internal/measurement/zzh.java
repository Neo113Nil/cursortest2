package com.google.android.gms.internal.measurement;

import defpackage.a70;
import defpackage.dmi;
import defpackage.me4;
import defpackage.ogj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzh {
    public static void a(int i, String str, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    public static void b(int i, String str, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    public static void c(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }

    public static boolean d(zzao zzaoVar) {
        if (zzaoVar == null) {
            return false;
        }
        Double zzd = zzaoVar.zzd();
        return !zzd.isNaN() && zzd.doubleValue() >= 0.0d && zzd.equals(Double.valueOf(Math.floor(zzd.doubleValue())));
    }

    public static zzbk e(String str) {
        zzbk zzbkVar;
        if (str == null || str.isEmpty()) {
            zzbkVar = null;
        } else {
            zzbkVar = (zzbk) zzbk.l0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (zzbkVar != null) {
            return zzbkVar;
        }
        a70.p(dmi.q("Unsupported commandId ", str));
        return null;
    }

    public static boolean f(zzao zzaoVar, zzao zzaoVar2) {
        if (!zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            return false;
        }
        if ((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) {
            return true;
        }
        if (!(zzaoVar instanceof zzah)) {
            return zzaoVar instanceof zzas ? zzaoVar.zzc().equals(zzaoVar2.zzc()) : zzaoVar instanceof zzaf ? zzaoVar.zze().equals(zzaoVar2.zze()) : zzaoVar == zzaoVar2;
        }
        if (Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue())) {
            return false;
        }
        return zzaoVar.zzd().equals(zzaoVar2.zzd());
    }

    public static int g(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) (((d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static double h(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return (d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d));
    }

    public static Object i(zzao zzaoVar) {
        if (zzao.J7.equals(zzaoVar)) {
            return null;
        }
        if (zzao.I7.equals(zzaoVar)) {
            return "";
        }
        if (zzaoVar instanceof zzal) {
            return j((zzal) zzaoVar);
        }
        if (!(zzaoVar instanceof zzae)) {
            return !zzaoVar.zzd().isNaN() ? zzaoVar.zzd() : zzaoVar.zzc();
        }
        ArrayList arrayList = new ArrayList();
        zzae zzaeVar = (zzae) zzaoVar;
        int i = 0;
        while (i < zzaeVar.m()) {
            if (i >= zzaeVar.m()) {
                ogj.m(me4.g(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
                return null;
            }
            int i2 = i + 1;
            Object i3 = i(zzaeVar.n(i));
            if (i3 != null) {
                arrayList.add(i3);
            }
            i = i2;
        }
        return arrayList;
    }

    public static HashMap j(zzal zzalVar) {
        HashMap hashMap = new HashMap();
        Iterator it = new ArrayList(zzalVar.a.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object i = i(zzalVar.zzk(str));
            if (i != null) {
                hashMap.put(str, i);
            }
        }
        return hashMap;
    }

    public static void k(zzg zzgVar) {
        int g = g(zzgVar.g("runtime.counter").zzd().doubleValue() + 1.0d);
        if (g <= 1000000) {
            zzgVar.e("runtime.counter", new zzah(Double.valueOf(g)));
        } else {
            a70.r("Instructions allowed exceeded");
        }
    }
}
