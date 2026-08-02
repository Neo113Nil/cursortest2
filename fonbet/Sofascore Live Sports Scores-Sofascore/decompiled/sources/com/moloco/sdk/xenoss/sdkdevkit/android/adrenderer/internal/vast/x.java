package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import defpackage.a99;
import defpackage.av8;
import defpackage.eqf;
import defpackage.g9i;
import defpackage.k13;
import defpackage.km5;
import defpackage.nf3;
import defpackage.o13;
import defpackage.of3;
import defpackage.td4;
import defpackage.tol;
import defpackage.xw3;
import defpackage.yqo;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class x {
    public static final v a;
    public static final v b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.v] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.v] */
    static {
        final int i = 0;
        a = new Comparator() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.v
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0 i0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0) obj;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0 i0Var2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0) obj2;
                        i0Var2.getClass();
                        int l = x.l(i0Var2);
                        i0Var.getClass();
                        return Intrinsics.d(l, x.l(i0Var));
                    default:
                        return Intrinsics.d(x.l(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) obj2).h), x.l(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) obj).h));
                }
            }
        };
        final int i2 = 1;
        b = new Comparator() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.v
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0 i0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0) obj;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0 i0Var2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0) obj2;
                        i0Var2.getClass();
                        int l = x.l(i0Var2);
                        i0Var.getClass();
                        return Intrinsics.d(l, x.l(i0Var));
                    default:
                        return Intrinsics.d(x.l(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) obj2).h), x.l(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) obj).h));
                }
            }
        };
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f fVar) {
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.p)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.s;
        }
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.a)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.t;
        }
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.b)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.v;
        }
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.c)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.u;
        }
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.d)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.w;
        }
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.p;
        }
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.g)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.q;
        }
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.r)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.D;
        }
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.e)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.k;
        }
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.h)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.l;
        }
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.n)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.m;
        }
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.k)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.B;
        }
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.o)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.C;
        }
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.q)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.n;
        }
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.i)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.o;
        }
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.j)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.r;
        }
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.m)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.x;
        }
        if (fVar.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.l)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.A;
        }
        zzl.b();
        return null;
    }

    public static final u b(Context context) {
        context.getClass();
        return new u((z) d1.a.getValue(), com.moloco.sdk.service_locator.g.b(), com.moloco.sdk.service_locator.g.a(), g1.b(), (com.moloco.sdk.internal.services.b0) com.moloco.sdk.service_locator.e.e.getValue(), com.moloco.sdk.service_locator.j.a(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Double c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v vVar, double d, Long l) {
        Double valueOf;
        Double valueOf2;
        if (l != null) {
            Integer num = vVar.f;
            Integer num2 = vVar.g;
            if (num != null) {
                valueOf = Double.valueOf(num.intValue());
            } else {
                valueOf = (vVar.h == null || num2 == null) ? null : Double.valueOf((r7.intValue() - num2.intValue()) / 2.0d);
            }
            if (valueOf != null) {
                valueOf2 = Double.valueOf((valueOf.doubleValue() / 8192.0d) * (l.longValue() / 1000.0d));
                if (valueOf2 == null) {
                    return Double.valueOf(valueOf2.doubleValue() - d);
                }
                return null;
            }
        }
        valueOf2 = null;
        if (valueOf2 == null) {
        }
    }

    public static final Double d(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null || num.intValue() == 0 || num2 == null || num2.intValue() == 0 || num3 == null || num3.intValue() == 0 || num4 == null || num4.intValue() == 0) {
            return null;
        }
        return Double.valueOf((num.intValue() * num2.intValue()) - (num3.intValue() * num4.intValue()));
    }

    public static ArrayList e(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            o13.v(list, arrayList);
        }
        if (list2 != null) {
            o13.v(list2, arrayList);
        }
        return arrayList;
    }

    public static List f(LinkedHashMap linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0 c0Var) {
        List list = (List) linkedHashMap.get(c0Var);
        if (list == null) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0) it.next()).b);
        }
        return arrayList;
    }

    public static final Pair g(Double d, Double d2) {
        if (d == null || d2 == null) {
            return new Pair(Boolean.valueOf(d != null), Boolean.valueOf(d2 != null));
        }
        if (Intrinsics.b(d, d2)) {
            Boolean bool = Boolean.TRUE;
            return new Pair(bool, bool);
        }
        if (Math.abs(d.doubleValue()) == Math.abs(d2.doubleValue())) {
            return new Pair(Boolean.valueOf(d.doubleValue() < 0.0d), Boolean.valueOf(d2.doubleValue() < 0.0d));
        }
        return Double.compare(Math.abs(d.doubleValue()), Math.abs(d2.doubleValue())) < 0 ? new Pair(Boolean.TRUE, Boolean.FALSE) : new Pair(Boolean.FALSE, Boolean.TRUE);
    }

    public static void h() {
        g9i g9iVar = VastActivity.j;
        if (g9iVar == null || !g9iVar.isActive()) {
            return;
        }
        g9i g9iVar2 = VastActivity.j;
        if (g9iVar2 != null) {
            g9iVar2.e(null);
        }
        VastActivity.j = null;
    }

    public static final void i(Activity activity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m mVar, Function2 function2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t tVar, of3 of3Var, int i) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1851234025);
        int i2 = i | (av8Var2.g(activity) ? 4 : 2) | (av8Var2.g(mVar) ? 32 : 16) | (av8Var2.g(function2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(tVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        if ((i2 & 1171) == 1170 && av8Var2.D()) {
            av8Var2.W();
            av8Var = av8Var2;
        } else {
            av8Var2.Y();
            if ((i & 1) != 0 && !av8Var2.B()) {
                av8Var2.W();
            }
            av8Var2.t();
            av8Var2.e0(1546094614);
            av8Var2.e0(1546093340);
            boolean g = av8Var2.g(function2) | av8Var2.g(mVar);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            int i3 = 6;
            if (g || O == a99Var) {
                O = new com.appsflyer.f(i3, function2, mVar);
                av8Var2.n0(O);
            }
            int i4 = 0;
            av8Var2.s(false);
            td4.a((Function1) O, null, null, av8Var2, 0, 6);
            av8Var = av8Var2;
            Unit unit = Unit.a;
            av8Var.e0(1546095379);
            if (tVar != null) {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b) tVar).a(yqo.y(1040652088, av8Var, new c(i4)), av8Var, ((i2 >> 6) & 112) | 6);
            }
            av8Var.s(false);
            av8Var.s(false);
            av8Var.e0(1546097303);
            boolean g2 = av8Var.g(mVar);
            Object O2 = av8Var.O();
            if (g2 || O2 == a99Var) {
                com.moloco.sdk.internal.publisher.nativead.b bVar = new com.moloco.sdk.internal.publisher.nativead.b(0, mVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m.class, "goNextAdPartOrDismissAd", "goNextAdPartOrDismissAd()V", 0, 10);
                av8Var.n0(bVar);
                O2 = bVar;
            }
            av8Var.s(false);
            tol.a(0, 1, av8Var, (Function0) ((KFunction) O2), false);
            com.moloco.sdk.internal.publisher.h0.j(activity, av8Var, i2 & 14);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v(activity, mVar, function2, tVar, i, 1);
        }
    }

    public static /* synthetic */ void j(f1 f1Var, List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0 e0Var, int i) {
        if ((i & 2) != 0) {
            e0Var = null;
        }
        f1Var.a(list, e0Var, null, null);
    }

    public static void k(f1 f1Var, List list, ArrayList arrayList, com.moloco.sdk.internal.services.events.c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar) {
        list.getClass();
        cVar.getClass();
        gVar.getClass();
        if (list.isEmpty()) {
            return;
        }
        xw3.L(f1Var.b, null, null, new e1(list, cVar, gVar, f1Var, arrayList, null, null, null, null), 3);
    }

    public static final int l(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0 i0Var) {
        if (i0Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f0) {
            return 4;
        }
        if (i0Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h0) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h0) i0Var).a.b == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n.b ? 3 : 2;
        }
        if (i0Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g0) {
            return 1;
        }
        zzl.b();
        return 0;
    }

    public static final Double m(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null || num.intValue() == 0 || num2 == null || num2.intValue() == 0 || num3 == null || num3.intValue() == 0 || num4 == null || num4.intValue() == 0) {
            return null;
        }
        return Double.valueOf((num.intValue() / num2.intValue()) - (num3.intValue() / num4.intValue()));
    }
}
