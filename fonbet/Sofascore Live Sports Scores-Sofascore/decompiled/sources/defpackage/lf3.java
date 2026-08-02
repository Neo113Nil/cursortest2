package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.sofascore.results.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lf3 {
    public final View a;
    public final mg3 b;
    public final u6b c;
    public final qqg d;
    public final ttk e;
    public final iu9 f;
    public final q1g g;
    public final Configuration h;
    public final e1d i;
    public final mx j;
    public final p40 k;
    public final gy l;
    public final fy m;
    public final nf8 n;
    public final e1d o;
    public final z69 p;
    public final s40 q;
    public final yma r;
    public final ata s;
    public final xj2 t;
    public int u;
    public final j63 v;
    public final kf3 w;

    public lf3(lf3 lf3Var, View view, mg3 mg3Var, u6b u6bVar, qqg qqgVar, ttk ttkVar) {
        iu9 iu9Var;
        Configuration configuration;
        e1d f;
        mx mxVar;
        p40 p40Var;
        gy gyVar;
        fy fyVar;
        nf8 w00Var;
        e1d e;
        s40 s40Var;
        boolean c = Intrinsics.c(lf3Var != null ? lf3Var.a.getContext() : null, view.getContext());
        this.a = view;
        this.b = mg3Var;
        this.c = u6bVar;
        this.d = qqgVar;
        this.e = ttkVar;
        if (c) {
            lf3Var.getClass();
            iu9Var = lf3Var.f;
        } else {
            iu9Var = new iu9();
        }
        this.f = iu9Var;
        this.g = lf3Var != null ? lf3Var.g : new q1g();
        if (c) {
            lf3Var.getClass();
            configuration = lf3Var.h;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.h = configuration;
        if (c) {
            lf3Var.getClass();
            f = lf3Var.i;
        } else {
            f = e.f(new Configuration(configuration));
        }
        this.i = f;
        if (c) {
            lf3Var.getClass();
            mxVar = lf3Var.j;
        } else {
            mxVar = new mx(view.getContext());
        }
        this.j = mxVar;
        if (c) {
            lf3Var.getClass();
            p40Var = lf3Var.k;
        } else {
            p40Var = new p40(view.getContext());
        }
        this.k = p40Var;
        if (c) {
            lf3Var.getClass();
            gyVar = lf3Var.l;
        } else {
            gyVar = new gy(view.getContext());
        }
        this.l = gyVar;
        if (c) {
            lf3Var.getClass();
            fyVar = lf3Var.m;
        } else {
            fyVar = new fy(gyVar);
        }
        this.m = fyVar;
        if (c) {
            lf3Var.getClass();
            w00Var = lf3Var.n;
        } else {
            w00Var = new w00(view.getContext(), 0);
        }
        this.n = w00Var;
        if (c) {
            lf3Var.getClass();
            e = lf3Var.o;
        } else {
            e = e.e(rz8.A(view.getContext()), p4h.g);
        }
        this.o = e;
        this.p = view == (lf3Var != null ? lf3Var.a : null) ? lf3Var.p : new kie(view);
        if (c) {
            lf3Var.getClass();
            s40Var = lf3Var.q;
        } else {
            s40Var = new s40(ViewConfiguration.get(view.getContext()));
        }
        this.q = s40Var;
        this.r = lf3Var != null ? lf3Var.r : new yma();
        this.s = new ata();
        this.t = lf3Var != null ? lf3Var.t : new xj2();
        this.v = new j63(this, 3);
        this.w = new kf3(this);
    }

    public final void a(xy xyVar, tc3 tc3Var, of3 of3Var, int i) {
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(123858079);
        int i2 = (av8Var.i(xyVar) ? 4 : 2) | i | (av8Var.i(tc3Var) ? 32 : 16) | (av8Var.i(this) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i3 = 1;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            Object tag = xyVar.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof eia) && !(tag instanceof jia))) ? null : (Set) tag;
            if (set == null) {
                Object parent = xyVar.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof eia) && !(tag2 instanceof jia))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(av8Var.z());
                av8Var.q = true;
                av8Var.C = true;
                av8Var.c.c();
                av8Var.H.c();
                mlh mlhVar = av8Var.I;
                jlh jlhVar = mlhVar.a;
                mlhVar.e = jlhVar.j;
                mlhVar.f = jlhVar.k;
            }
            Object O = av8Var.O();
            qqg qqgVar = this.d;
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                Object parent2 = xyVar.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag3 instanceof String ? (String) tag3 : null;
                if (str == null) {
                    str = String.valueOf(view2.getId());
                }
                String q = dmi.q("SaveableStateRegistry:", str);
                nqg savedStateRegistry = qqgVar.getSavedStateRegistry();
                Bundle a = savedStateRegistry.a(q);
                if (a != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : a.keySet()) {
                        ArrayList parcelableArrayList = a.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                }
                s84 s84Var = s84.l;
                ff5 ff5Var = upg.a;
                tpg tpgVar = new tpg(linkedHashMap, s84Var);
                if (savedStateRegistry.b(q) == null) {
                    try {
                        savedStateRegistry.c(q, new qb3(tpgVar, i3));
                        z = true;
                    } catch (IllegalArgumentException unused) {
                    }
                    s55 s55Var = new s55(tpgVar, new t55(z, savedStateRegistry, q));
                    av8Var.n0(s55Var);
                    O = s55Var;
                }
                z = false;
                s55 s55Var2 = new s55(tpgVar, new t55(z, savedStateRegistry, q));
                av8Var.n0(s55Var2);
                O = s55Var2;
            }
            s55 s55Var3 = (s55) O;
            Unit unit = Unit.a;
            boolean i4 = av8Var.i(s55Var3);
            Object O2 = av8Var.O();
            if (i4 || O2 == a99Var) {
                O2 = new oo(s55Var3, 11);
                av8Var.n0(O2);
            }
            hz8.d(unit, (Function1) O2, av8Var);
            ff5 ff5Var2 = dh3.w;
            boolean booleanValue = ((Boolean) av8Var.k(ff5Var2)).booleanValue() | xyVar.getScrollCaptureInProgress$ui();
            boolean g = av8Var.g(xyVar.getView());
            Object O3 = av8Var.O();
            if (g || O3 == a99Var) {
                O3 = new fvk(xyVar.getView());
                av8Var.n0(O3);
            }
            tol.c(new gb0[]{mhb.a.a(this.c), shb.a.a(qqgVar), nz.d.a(this.f), nz.e.a(this.g), nz.b.a(xyVar.getContext()), g5a.a.a(set), nz.a.a(xyVar.getConfiguration()), upg.a.a(s55Var3), nz.f.a(xyVar.getView()), ff5Var2.a(Boolean.valueOf(booleanValue)), dh3.t.a(xyVar.getViewConfiguration()), pf9.a.a((fvk) O3)}, yqo.H(1317454175, av8Var, new jf3(xyVar, this, tc3Var)), av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new jf3(this, xyVar, tc3Var, i);
        }
    }

    public final void b() {
        int i = this.u - 1;
        this.u = i;
        if (i < 0) {
            i = 0;
            this.u = 0;
        }
        if (i == 0) {
            View view = this.a;
            Context context = view.getContext();
            kf3 kf3Var = this.w;
            context.unregisterComponentCallbacks(kf3Var);
            ata ataVar = this.s;
            if (ataVar.b == null) {
                ataVar.a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(kf3Var);
        }
    }

    public final void c() {
        int i = this.u + 1;
        this.u = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            kf3 kf3Var = this.w;
            context.registerComponentCallbacks(kf3Var);
            d(view.getResources().getConfiguration());
            boolean hasWindowFocus = view.hasWindowFocus();
            ata ataVar = this.s;
            ((eoh) ataVar.c).setValue(Boolean.valueOf(hasWindowFocus));
            e1d e1dVar = ataVar.b;
            j63 j63Var = this.v;
            if (e1dVar == null) {
                ataVar.a = j63Var;
            }
            if (e1dVar != null) {
                ((eoh) e1dVar).setValue(j63Var.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(kf3Var);
        }
    }

    public final void d(Configuration configuration) {
        e1d e1dVar;
        int updateFrom = this.h.updateFrom(configuration);
        if (updateFrom != 0) {
            Iterator it = this.f.a.entrySet().iterator();
            while (it.hasNext()) {
                gu9 gu9Var = (gu9) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (gu9Var == null || Configuration.needNewResources(updateFrom, gu9Var.b)) {
                    it.remove();
                }
            }
            this.i.setValue(new Configuration(configuration));
            this.g.a();
            if ((268435456 & updateFrom) != 0) {
                this.o.setValue(rz8.A(this.a.getContext()));
            }
            if (((-1342235264) & updateFrom) == 0 || (e1dVar = this.s.b) == null) {
                return;
            }
            ((eoh) e1dVar).setValue(this.v.invoke());
        }
    }
}
