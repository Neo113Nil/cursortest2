package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class aoa {
    public static final Map a = tub.h(new Pair(foa.d, Integer.valueOf(R.layout.glance_text)), new Pair(foa.e, Integer.valueOf(R.layout.glance_list)), new Pair(foa.f, Integer.valueOf(R.layout.glance_check_box)), new Pair(foa.g, Integer.valueOf(R.layout.glance_check_box_backport)), new Pair(foa.h, Integer.valueOf(R.layout.glance_button)), new Pair(foa.r, Integer.valueOf(R.layout.glance_swtch)), new Pair(foa.s, Integer.valueOf(R.layout.glance_swtch_backport)), new Pair(foa.i, Integer.valueOf(R.layout.glance_frame)), new Pair(foa.t, Integer.valueOf(R.layout.glance_image_crop)), new Pair(foa.w, Integer.valueOf(R.layout.glance_image_crop_decorative)), new Pair(foa.u, Integer.valueOf(R.layout.glance_image_fit)), new Pair(foa.x, Integer.valueOf(R.layout.glance_image_fit_decorative)), new Pair(foa.v, Integer.valueOf(R.layout.glance_image_fill_bounds)), new Pair(foa.y, Integer.valueOf(R.layout.glance_image_fill_bounds_decorative)), new Pair(foa.j, Integer.valueOf(R.layout.glance_linear_progress_indicator)), new Pair(foa.k, Integer.valueOf(R.layout.glance_circular_progress_indicator)), new Pair(foa.l, Integer.valueOf(R.layout.glance_vertical_grid_one_column)), new Pair(foa.m, Integer.valueOf(R.layout.glance_vertical_grid_two_columns)), new Pair(foa.n, Integer.valueOf(R.layout.glance_vertical_grid_three_columns)), new Pair(foa.o, Integer.valueOf(R.layout.glance_vertical_grid_four_columns)), new Pair(foa.p, Integer.valueOf(R.layout.glance_vertical_grid_five_columns)), new Pair(foa.q, Integer.valueOf(R.layout.glance_vertical_grid_auto_fit)), new Pair(foa.z, Integer.valueOf(R.layout.glance_radio_button)), new Pair(foa.A, Integer.valueOf(R.layout.glance_radio_button_backport)));
    public static final int b;
    public static final int c;

    static {
        int size = yv8.f.size();
        b = size;
        c = Build.VERSION.SDK_INT >= 31 ? yv8.h : yv8.h / size;
    }

    public static final dyf a(pxj pxjVar, vy8 vy8Var, int i) {
        Map d;
        Context context = pxjVar.a;
        Integer valueOf = Integer.valueOf(R.id.rootStubId);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            int i3 = yv8.h;
            if (i >= i3) {
                ogj.h(dmi.k(i3, i, "Index of the root view cannot be more than ", ", currently "));
                return null;
            }
            ikh ikhVar = new ikh(1, 1);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), yv8.g + i);
            a8l a8lVar = (a8l) vy8Var.a(null, ff3.u);
            if (a8lVar != null) {
                gz8.B(remoteViews, a8lVar, R.id.rootView);
            }
            q99 q99Var = (q99) vy8Var.a(null, ff3.v);
            if (q99Var != null) {
                gz8.A(remoteViews, q99Var, R.id.rootView);
            }
            if (i2 >= 33) {
                remoteViews.removeAllViews(R.id.rootView);
            }
            if (i2 >= 33) {
                d = lm5.a;
                d.getClass();
            } else {
                d = sub.d(new Pair(0, sub.d(new Pair(ikhVar, valueOf))));
            }
            return new dyf(remoteViews, new s4a(R.id.rootView, 0, d, 2));
        }
        int i4 = b * i;
        int i5 = yv8.h;
        if (i4 >= i5) {
            is8.d(", currently ", "Index of the root view cannot be more than ", i5 / 4, i);
            return null;
        }
        a8l a8lVar2 = (a8l) vy8Var.a(null, ff3.s);
        z25 z25Var = x25.a;
        z25 z25Var2 = a8lVar2 != null ? a8lVar2.a : z25Var;
        q99 q99Var2 = (q99) vy8Var.a(null, ff3.t);
        if (q99Var2 != null) {
            z25Var = q99Var2.a;
        }
        s25 s25Var = s25.a;
        int i6 = z25Var2.equals(s25Var) ? 4 : 1;
        int i7 = z25Var.equals(s25Var) ? 4 : 1;
        ikh ikhVar2 = new ikh(i6 == 2 ? 1 : i6, i7 != 2 ? i7 : 1);
        Integer num = (Integer) yv8.f.get(ikhVar2);
        if (num != null) {
            return new dyf(new RemoteViews(context.getPackageName(), i4 + yv8.g + num.intValue()), new s4a(0, 0, sub.d(new Pair(0, sub.d(new Pair(ikhVar2, valueOf)))), 3));
        }
        throw new IllegalStateException("Cannot find root element for size [" + wv8.z(i6) + ", " + wv8.z(i7) + ']');
    }

    public static final s4a b(RemoteViews remoteViews, pxj pxjVar, foa foaVar, int i, vy8 vy8Var, eo eoVar, go goVar) {
        int intValue;
        if (i > 10) {
            Objects.toString(foaVar);
            new IllegalArgumentException(foaVar + " container cannot have more than 10 elements");
        }
        int i2 = i <= 10 ? i : 10;
        Integer f = f(foaVar, vy8Var);
        if (f != null) {
            intValue = f.intValue();
        } else {
            co3 co3Var = (co3) yv8.a.get(new eo3(foaVar, i2, eoVar, goVar));
            Integer valueOf = co3Var != null ? Integer.valueOf(co3Var.a) : null;
            if (valueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + foaVar + " with " + i + " children");
            }
            intValue = valueOf.intValue();
        }
        Map map = (Map) yv8.b.get(foaVar);
        if (map == null) {
            is8.c(foaVar, "Cannot find generated children for ");
            return null;
        }
        s4a d = d(remoteViews, pxjVar, intValue, vy8Var);
        int i3 = d.a;
        s4a s4aVar = new s4a(map, i3, d.b);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(i3);
        }
        return s4aVar;
    }

    public static final s4a c(RemoteViews remoteViews, pxj pxjVar, foa foaVar, vy8 vy8Var) {
        Integer f = f(foaVar, vy8Var);
        if (f != null || (f = (Integer) a.get(foaVar)) != null) {
            return d(remoteViews, pxjVar, f.intValue(), vy8Var);
        }
        is8.c(foaVar, "Cannot use `insertView` with a container like ");
        return null;
    }

    public static final s4a d(RemoteViews remoteViews, pxj pxjVar, int i, vy8 vy8Var) {
        Integer valueOf;
        int i2 = pxjVar.e;
        a8l a8lVar = (a8l) vy8Var.a(null, ff3.w);
        z25 z25Var = x25.a;
        z25 z25Var2 = a8lVar != null ? a8lVar.a : z25Var;
        q99 q99Var = (q99) vy8Var.a(null, ff3.x);
        if (q99Var != null) {
            z25Var = q99Var.a;
        }
        if (vy8Var.b()) {
            valueOf = null;
        } else {
            if (pxjVar.i.getAndSet(true)) {
                a70.r("At most one view can be set as AppWidgetBackground.");
                return null;
            }
            valueOf = Integer.valueOf(android.R.id.background);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            int intValue = valueOf != null ? valueOf.intValue() : pxjVar.g.incrementAndGet();
            RemoteViews a2 = zna.a.a(pxjVar.a.getPackageName(), i, intValue);
            int i4 = pxjVar.h.a;
            if (i3 >= 31) {
                fyf.a.a(remoteViews, i4, a2, i2);
            } else {
                remoteViews.addView(i4, a2);
            }
            return new s4a(intValue, 0, null, 6);
        }
        if (i3 >= 31) {
            r25 r25Var = r25.a;
            return new s4a(w1a.t(remoteViews, pxjVar, e(remoteViews, pxjVar, i2, z25Var2.equals(r25Var) ? 3 : 1, z25Var.equals(r25Var) ? 3 : 1), i, valueOf), 0, null, 6);
        }
        int g = g(z25Var2);
        int g2 = g(z25Var);
        int e = e(remoteViews, pxjVar, i2, g, g2);
        if (g != 2 && g2 != 2) {
            return new s4a(w1a.t(remoteViews, pxjVar, e, i, valueOf), 0, null, 6);
        }
        kma kmaVar = (kma) yv8.e.get(new ikh(g, g2));
        if (kmaVar != null) {
            return new s4a(w1a.t(remoteViews, pxjVar, R.id.glanceViewStub, i, valueOf), w1a.t(remoteViews, pxjVar, e, kmaVar.a, null), null, 4);
        }
        sw9.q("Could not find complex layout for width=", wv8.z(g), ", height=", wv8.z(g2));
        return null;
    }

    public static final int e(RemoteViews remoteViews, pxj pxjVar, int i, int i2, int i3) {
        ikh ikhVar = new ikh(i2 == 2 ? 1 : i2, i3 != 2 ? i3 : 1);
        Map map = (Map) pxjVar.h.c.get(Integer.valueOf(i));
        if (map == null) {
            a70.r(ljg.j(i, "Parent doesn't have child position "));
            return 0;
        }
        Integer num = (Integer) map.get(ikhVar);
        if (num == null) {
            StringBuilder t = lnb.t(i, "No child for position ", " and size ");
            t.append(wv8.z(i2));
            t.append(" x ");
            zzl.m(t, wv8.z(i3));
            return 0;
        }
        int intValue = num.intValue();
        Collection values = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (((Number) obj).intValue() != intValue) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w1a.t(remoteViews, pxjVar, ((Number) it.next()).intValue(), R.layout.glance_deleted_view, Integer.valueOf(R.id.deletedViewId));
        }
        return intValue;
    }

    public static final Integer f(foa foaVar, vy8 vy8Var) {
        if (Build.VERSION.SDK_INT >= 33) {
            qo qoVar = (qo) vy8Var.a(null, ff3.y);
            a8l a8lVar = (a8l) vy8Var.a(null, ff3.z);
            r25 r25Var = r25.a;
            boolean equals = a8lVar != null ? a8lVar.a.equals(r25Var) : false;
            q99 q99Var = (q99) vy8Var.a(null, ff3.A);
            boolean equals2 = q99Var != null ? q99Var.a.equals(r25Var) : false;
            if (qoVar != null) {
                ho hoVar = qoVar.a;
                kma kmaVar = (kma) yv8.c.get(new c12(foaVar, hoVar.a, hoVar.b));
                if (kmaVar != null) {
                    return Integer.valueOf(kmaVar.a);
                }
                yhk.m("Cannot find ", foaVar, " with alignment ", hoVar);
                return null;
            }
            if (equals || equals2) {
                kma kmaVar2 = (kma) yv8.d.get(new f8g(foaVar, equals, equals2));
                if (kmaVar2 != null) {
                    return Integer.valueOf(kmaVar2.a);
                }
                sw9.o(foaVar, " with defaultWeight set", "Cannot find ");
                return null;
            }
        }
        return null;
    }

    public static final int g(z25 z25Var) {
        if (z25Var instanceof x25) {
            return 1;
        }
        if (z25Var instanceof r25) {
            return 3;
        }
        if (z25Var instanceof s25) {
            return 4;
        }
        if (z25Var instanceof q25) {
            return 2;
        }
        zzl.b();
        return 0;
    }
}
