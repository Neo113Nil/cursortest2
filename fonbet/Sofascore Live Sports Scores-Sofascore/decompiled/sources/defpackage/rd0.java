package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.facebook.b;
import com.facebook.internal.a0;
import com.facebook.w;
import com.ironsource.C4427z5;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballRankedStatistic;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballRankedStatistics;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class rd0 {
    public static boolean a = false;
    public static final rq3[] b = new rq3[0];
    public static final tc3 c = new tc3(-1518908943, new gd3(11), false);
    public static final tc3 d = new tc3(-2078448035, new gd3(12), false);
    public static final tc3 e = new tc3(1824012362, new qd3(10), false);
    public static final dti f = new dti(19);
    public static final oqf g = new oqf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10.0f, 10.0f);
    public static final float h = 40.0f;
    public static final float i = 49.0f;
    public static final float j = 40.0f;
    public static final float k = 41.0f;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A(z88 z88Var, sq3 sq3Var) {
        sa8 sa8Var;
        int i2;
        fsf fsfVar;
        f0 e2;
        ma8 ma8Var;
        if (sq3Var instanceof sa8) {
            sa8Var = (sa8) sq3Var;
            int i3 = sa8Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sa8Var.u = i3 - Integer.MIN_VALUE;
                Object obj = sa8Var.t;
                Object obj2 = lu3.a;
                i2 = sa8Var.u;
                int i4 = 1;
                if (i2 != 0) {
                    fsf g2 = lnb.g(obj);
                    ma8 ma8Var2 = new ma8(g2, i4);
                    try {
                        sa8Var.r = g2;
                        sa8Var.s = ma8Var2;
                        sa8Var.u = 1;
                        if (z88Var.collect(ma8Var2, sa8Var) == obj2) {
                            return obj2;
                        }
                        fsfVar = g2;
                    } catch (f0 e3) {
                        fsfVar = g2;
                        e2 = e3;
                        ma8Var = ma8Var2;
                        if (e2.a == ma8Var) {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ma8Var = sa8Var.s;
                    fsfVar = sa8Var.r;
                    try {
                        y6a.M(obj);
                    } catch (f0 e4) {
                        e2 = e4;
                        if (e2.a == ma8Var) {
                            throw e2;
                        }
                        bea.u(sa8Var.getContext());
                        return fsfVar.a;
                    }
                }
                return fsfVar.a;
            }
        }
        sa8Var = new sa8(sq3Var);
        Object obj3 = sa8Var.t;
        Object obj22 = lu3.a;
        i2 = sa8Var.u;
        int i42 = 1;
        if (i2 != 0) {
        }
        return fsfVar.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(z88 z88Var, Function2 function2, sq3 sq3Var) {
        ta8 ta8Var;
        int i2;
        fsf fsfVar;
        f0 e2;
        oa8 oa8Var;
        if (sq3Var instanceof ta8) {
            ta8Var = (ta8) sq3Var;
            int i3 = ta8Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ta8Var.u = i3 - Integer.MIN_VALUE;
                Object obj = ta8Var.t;
                Object obj2 = lu3.a;
                i2 = ta8Var.u;
                int i4 = 1;
                if (i2 != 0) {
                    fsf g2 = lnb.g(obj);
                    oa8 oa8Var2 = new oa8(function2, g2, i4);
                    try {
                        ta8Var.r = g2;
                        ta8Var.s = oa8Var2;
                        ta8Var.u = 1;
                        if (z88Var.collect(oa8Var2, ta8Var) == obj2) {
                            return obj2;
                        }
                        fsfVar = g2;
                    } catch (f0 e3) {
                        fsfVar = g2;
                        e2 = e3;
                        oa8Var = oa8Var2;
                        if (e2.a == oa8Var) {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oa8Var = ta8Var.s;
                    fsfVar = ta8Var.r;
                    try {
                        y6a.M(obj);
                    } catch (f0 e4) {
                        e2 = e4;
                        if (e2.a == oa8Var) {
                            throw e2;
                        }
                        bea.u(ta8Var.getContext());
                        return fsfVar.a;
                    }
                }
                return fsfVar.a;
            }
        }
        ta8Var = new ta8(sq3Var);
        Object obj3 = ta8Var.t;
        Object obj22 = lu3.a;
        i2 = ta8Var.u;
        int i42 = 1;
        if (i2 != 0) {
        }
        return fsfVar.a;
    }

    public static final uzc C(v3h v3hVar, Function1 function1) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            s3h a2 = v3hVar.a();
            wma wmaVar = a2.c;
            if (wmaVar.I() && wmaVar.H()) {
                oqf g2 = a2.g();
                uzc uzcVar = new uzc(48);
                e3c e3cVar = new e3c(11);
                e3cVar.m(y6a.J(g2));
                F(new e3c(11), e3cVar, uzcVar, a2, a2, function1);
                return uzcVar;
            }
            uzc uzcVar2 = q6a.a;
            uzcVar2.getClass();
            return uzcVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void D(e3c e3cVar, e3c e3cVar2, uzc uzcVar, s3h s3hVar, s3h s3hVar2, Function1 function1) {
        e3c e3cVar3 = e3cVar;
        Region region = (Region) e3cVar3.b;
        e3c e3cVar4 = e3cVar2;
        Region region2 = (Region) e3cVar4.b;
        wma wmaVar = s3hVar2.c;
        wma wmaVar2 = s3hVar2.c;
        if (!wmaVar.I() || !wmaVar2.H() || region2.isEmpty()) {
            if (s3hVar2.o()) {
                E(uzcVar, s3hVar, s3hVar2);
                return;
            }
            return;
        }
        oqf n2 = s3hVar2.n();
        if (n2.h()) {
            xv4 f2 = s3hVar2.f();
            if (f2 == null) {
                z3a z3aVar = (z3a) wmaVar2.F.d;
                n2 = o6a.y(z3aVar).p(z3aVar, false);
            } else {
                wtc wtcVar = ((wtc) f2).a;
                Object g2 = s3hVar2.d.a.g(k3h.b);
                if (g2 == null) {
                    g2 = null;
                }
                boolean z = g2 != null;
                if (!wtcVar.a.n) {
                    n2 = oqf.e;
                } else if (z) {
                    n2 = c6o.a0(wtcVar, 8).A1();
                } else {
                    wdd a0 = c6o.a0(wtcVar, 8);
                    n2 = o6a.y(a0).p(a0, false);
                }
            }
        }
        x6a J = y6a.J(n2);
        e3cVar3.m(J);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i2 = s3hVar2.f;
            s3h s3hVar3 = s3hVar;
            if (i2 == s3hVar3.f) {
                i2 = -1;
            }
            Rect bounds = region.getBounds();
            u3h u3hVar = new u3h(s3hVar2, new x6a(bounds.left, bounds.top, bounds.right, bounds.bottom));
            uzc uzcVar2 = uzcVar;
            uzcVar2.i(i2, u3hVar);
            List j2 = s3h.j(4, s3hVar2);
            int size = j2.size() - 1;
            while (-1 < size) {
                if (!((Boolean) function1.invoke(j2.get(size))).booleanValue()) {
                    D(e3cVar3, e3cVar4, uzcVar2, s3hVar3, (s3h) j2.get(size), function1);
                }
                size--;
                e3cVar3 = e3cVar;
                e3cVar4 = e3cVar2;
                uzcVar2 = uzcVar;
                s3hVar3 = s3hVar;
            }
            if (K(s3hVar2)) {
                region2.op(J.a, J.b, J.c, J.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void E(uzc uzcVar, s3h s3hVar, s3h s3hVar2) {
        wma wmaVar;
        s3h l2 = s3hVar2.l();
        oqf g2 = (l2 == null || (wmaVar = l2.c) == null || !wmaVar.I()) ? g : l2.g();
        int i2 = s3hVar2.f;
        if (i2 == s3hVar.f) {
            i2 = -1;
        }
        uzcVar.i(i2, new u3h(s3hVar2, y6a.J(g2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        if (r4 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r0 != null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void F(e3c e3cVar, e3c e3cVar2, uzc uzcVar, s3h s3hVar, s3h s3hVar2, Function1 function1) {
        boolean z;
        oqf A1;
        s3h s3hVar3 = s3hVar;
        Function1 function12 = function1;
        int i2 = s3hVar3.f;
        Region region = (Region) e3cVar.b;
        e3c e3cVar3 = e3cVar2;
        Region region2 = (Region) e3cVar3.b;
        wma wmaVar = s3hVar2.c;
        l3h l3hVar = s3hVar2.d;
        wma wmaVar2 = s3hVar2.c;
        int i3 = s3hVar2.f;
        boolean z2 = (wmaVar.I() && wmaVar2.H()) ? false : true;
        if (region2.isEmpty() && i3 != i2) {
            return;
        }
        if (z2 && !s3hVar2.o()) {
            return;
        }
        x6a J = y6a.J(s3hVar2.n());
        e3cVar.m(J);
        if (i3 == i2) {
            i3 = -1;
        }
        if (!region.op(region2, Region.Op.INTERSECT)) {
            if (s3hVar2.o()) {
                E(uzcVar, s3hVar, s3hVar2);
                return;
            } else {
                if (i3 == -1) {
                    Rect bounds = region.getBounds();
                    uzcVar.i(i3, new u3h(s3hVar2, new x6a(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                    return;
                }
                return;
            }
        }
        Rect bounds2 = region.getBounds();
        uzcVar.i(i3, new u3h(s3hVar2, new x6a(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
        List j2 = s3h.j(4, s3hVar2);
        if (l3hVar.c) {
            s3h l2 = s3hVar2.l();
            while (true) {
                if (l2 == null) {
                    l2 = null;
                    break;
                }
                x0d x0dVar = l2.d.a;
                if (x0dVar.c(w3h.w) || x0dVar.c(w3h.v)) {
                    break;
                } else {
                    l2 = l2.l();
                }
            }
            if (l2 != null) {
                wdd d2 = s3hVar2.d();
                if (d2 != null) {
                    if (!d2.e1().n) {
                        d2 = null;
                    }
                }
                d2 = null;
                wdd d3 = l2.d();
                if (d3 != null) {
                    if (!d3.e1().n) {
                        d3 = null;
                    }
                }
                d3 = null;
                if (d2 != null && d3 != null) {
                    oqf p = d3.p(d2, false);
                    z = !p.equals(p.g(jca.r(0L, d7a.I(d3.c))));
                    if (z) {
                        e3c e3cVar4 = new e3c(11);
                        xv4 f2 = s3hVar2.f();
                        if (f2 == null) {
                            z3a z3aVar = (z3a) wmaVar2.F.d;
                            A1 = o6a.y(z3aVar).p(z3aVar, false);
                        } else {
                            wtc wtcVar = ((wtc) f2).a;
                            Object g2 = l3hVar.a.g(k3h.b);
                            boolean z3 = (g2 == null ? null : g2) != null;
                            if (!wtcVar.a.n) {
                                A1 = oqf.e;
                            } else if (z3) {
                                A1 = c6o.a0(wtcVar, 8).A1();
                            } else {
                                wdd a0 = c6o.a0(wtcVar, 8);
                                A1 = o6a.y(a0).p(a0, false);
                            }
                        }
                        e3cVar4.m(y6a.J(A1));
                        int size = j2.size() - 1;
                        while (-1 < size) {
                            if (!((Boolean) function12.invoke(j2.get(size))).booleanValue()) {
                                D(new e3c(11), e3cVar4, uzcVar, s3hVar3, (s3h) j2.get(size), function12);
                            }
                            size--;
                            s3hVar3 = s3hVar;
                        }
                        if (K(s3hVar2)) {
                            return;
                        }
                        region2.op(J.a, J.b, J.c, J.d, Region.Op.DIFFERENCE);
                        return;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        int size2 = j2.size() - 1;
        while (-1 < size2) {
            if (!((Boolean) function12.invoke(j2.get(size2))).booleanValue()) {
                F(e3cVar, e3cVar3, uzcVar, s3hVar, (s3h) j2.get(size2), function12);
            }
            size2--;
            e3cVar3 = e3cVar2;
            function12 = function1;
        }
        if (K(s3hVar2)) {
        }
    }

    public static ek2 G(g23 g23Var) {
        ek2 ek2Var = g23Var.Y;
        if (ek2Var != null) {
            return ek2Var;
        }
        h23 h23Var = j28.a;
        ek2 ek2Var2 = new ek2(i23.c(g23Var, h23Var), i23.a(g23Var, i23.c(g23Var, h23Var)), hkg.B(r13.c(i23.c(g23Var, j28.c), j28.d), i23.c(g23Var, h23Var)), r13.c(i23.a(g23Var, i23.c(g23Var, h23Var)), 0.38f));
        g23Var.Y = ek2Var2;
        return ek2Var2;
    }

    public static final Drawable H(int i2, Context context) {
        Drawable d0 = td4.d0(i2, context);
        if (d0 != null) {
            return d0;
        }
        hc5.f(ljg.j(i2, "Invalid resource ID: "));
        return null;
    }

    public static final q80 I(Integer num, of3 of3Var) {
        q80 h2;
        av8 av8Var = (av8) of3Var;
        av8Var.d0(1629288202);
        if (num == null) {
            h2 = new q80("-");
        } else {
            o80 o80Var = new o80();
            o80Var.d(String.valueOf(num.intValue()));
            av8Var.d0(-1917094488);
            int g2 = o80Var.g(new pwh(0L, v8a.v(12), (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65533));
            try {
                o80Var.d(oea.w(R.string.n_points, new Object[]{""}, av8Var));
                Unit unit = Unit.a;
                o80Var.f(g2);
                av8Var.s(false);
                h2 = o80Var.h();
            } catch (Throwable th) {
                o80Var.f(g2);
                throw th;
            }
        }
        av8Var.s(false);
        return h2;
    }

    public static final boolean J(s3h s3hVar) {
        wdd d2 = s3hVar.d();
        x0d x0dVar = s3hVar.d.a;
        return (d2 != null ? d2.m1() : false) || x0dVar.c(w3h.q) || x0dVar.c(w3h.p);
    }

    public static final boolean K(s3h s3hVar) {
        if (!J(s3hVar)) {
            l3h l3hVar = s3hVar.d;
            if (l3hVar.c) {
                return true;
            }
            x0d x0dVar = l3hVar.a;
            Object[] objArr = x0dVar.b;
            Object[] objArr2 = x0dVar.c;
            long[] jArr = x0dVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((a4h) obj).c) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    public static final bm1 L(uj1 uj1Var, BaseballRankedStatistics baseballRankedStatistics, boolean z) {
        uj1Var.getClass();
        baseballRankedStatistics.getClass();
        BaseballRankedStatistic baseballRankedStatistic = (BaseballRankedStatistic) uj1Var.d.invoke(baseballRankedStatistics);
        String str = (String) uj1Var.g.invoke(baseballRankedStatistics);
        Float f2 = (Float) uj1Var.i.invoke(baseballRankedStatistics);
        if (z || str != null) {
            return new bm1(uj1Var.c, uj1Var.b, str, baseballRankedStatistic != null ? baseballRankedStatistic.getRank() : null, baseballRankedStatistic != null ? baseballRankedStatistic.getCount() : null, f2);
        }
        return null;
    }

    public static final xtc M(xtc xtcVar, Function1 function1) {
        return xtcVar.z(new qnd(function1, new uj8(18, function1), true));
    }

    public static final xtc N(xtc xtcVar, float f2, float f3) {
        return xtcVar.z(new fnd(f2, f3, new a7d(21)));
    }

    public static xtc O(xtc xtcVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return N(xtcVar, f2, f3);
    }

    public static void R(HashMap hashMap) {
        SharedPreferences sharedPreferences = w.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        Object obj = hashMap.get("dataset_id");
        Object obj2 = hashMap.get(C4427z5.r);
        Object obj3 = hashMap.get("access_key");
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("dataset_id", obj.toString());
        edit.putString(C4427z5.r, obj2.toString());
        edit.putString("access_key", obj3.toString());
        edit.apply();
        b bVar = a0.a;
        "rd0".toString().getClass();
        synchronized (w.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object S(z88 z88Var, sq3 sq3Var) {
        ua8 ua8Var;
        int i2;
        ih2 ih2Var;
        fsf fsfVar;
        Object obj;
        if (sq3Var instanceof ua8) {
            ua8Var = (ua8) sq3Var;
            int i3 = ua8Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ua8Var.t = i3 - Integer.MIN_VALUE;
                Object obj2 = ua8Var.s;
                Object obj3 = lu3.a;
                i2 = ua8Var.t;
                ih2Var = rid.a;
                if (i2 != 0) {
                    fsf g2 = lnb.g(obj2);
                    g2.a = ih2Var;
                    b98 ma8Var = new ma8(g2, 2);
                    ua8Var.r = g2;
                    ua8Var.t = 1;
                    if (z88Var.collect(ma8Var, ua8Var) == obj3) {
                        return obj3;
                    }
                    fsfVar = g2;
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar = ua8Var.r;
                    y6a.M(obj2);
                }
                obj = fsfVar.a;
                if (obj == ih2Var) {
                    return obj;
                }
                ogj.m("Flow is empty");
                return null;
            }
        }
        ua8Var = new ua8(sq3Var);
        Object obj22 = ua8Var.s;
        Object obj32 = lu3.a;
        i2 = ua8Var.t;
        ih2Var = rid.a;
        if (i2 != 0) {
        }
        obj = fsfVar.a;
        if (obj == ih2Var) {
        }
    }

    public static final void a(scj scjVar, Function0 function0, Function0 function02, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-150988760);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(scjVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i4 = i3 | 3072;
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc l2 = bkh.l(n9e.q(wnn.A(utcVar, o7g.a(4.0f)), lz.D(R.color.surface_2, av8Var), o7g.a(4.0f)), 32.0f);
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = fi.E;
                av8Var.n0(O2);
            }
            xtc y = tol.y(l2, true, true, true, D, wzcVar, new gm((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function02, 9), av8Var, 0);
            mv1 mv1Var = uxf.g;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, y);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_minimize, 6, av8Var), null, null, lz.D(R.color.n_lv_1, av8Var), av8Var, 48, 4);
            i.o(av8Var, true, utcVar, 8.0f, av8Var);
            xtc d0 = fz8.d0(utcVar, n9a.a);
            k1c c3 = e12.c(uxf.c, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            xtc p = bkh.p(utcVar, 56.0f);
            t28 t28Var = new t28(new p4a(1), r4a.C(2));
            yf8 yf8Var = xth.a;
            q5a.s(scjVar, p, null, null, null, false, null, t28Var, 0L, 0L, 3, 0, dfj.a(xth.h(), lz.D(R.color.n_lv_1, av8Var), 0L, null, null, 0L, null, 3, 0, 0L, null, null, 0, 16744446), 0, false, false, av8Var, (i4 & 14) | 48, 196608, 2979836);
            av8Var = av8Var;
            i.o(av8Var, true, utcVar, 8.0f, av8Var);
            xtc l3 = bkh.l(n9e.q(wnn.A(utcVar, o7g.a(4.0f)), lz.D(R.color.surface_2, av8Var), o7g.a(4.0f)), 32.0f);
            boolean z = (i4 & 112) == 32;
            Object O3 = av8Var.O();
            if (z || O3 == a99Var) {
                O3 = new v61(14, function0);
                av8Var.n0(O3);
            }
            xtc w = oyn.w(l3, false, null, null, (Function0) O3, 15);
            k1c c4 = e12.c(mv1Var, false);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C4 = fqj.C(av8Var, w);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c4, f50Var);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_add, 6, av8Var), null, null, lz.D(R.color.n_lv_1, av8Var), av8Var, 48, 4);
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(i2, 8, scjVar, function0, function02, xtcVar2);
        }
    }

    public static final void b(vy8 vy8Var, int i2, int i3, tc3 tc3Var, of3 of3Var, int i4, int i5) {
        int i6;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1883910253);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (av8Var.g(vy8Var) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i8 = i5 & 2;
        if (i8 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= av8Var.e(i2) ? 32 : 16;
        }
        int i9 = i5 & 4;
        if (i9 != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            i6 |= av8Var.e(i3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= av8Var.g(tc3Var) ? a.o : 1024;
        }
        if ((i6 & 1171) == 1170 && av8Var.D()) {
            av8Var.W();
        } else {
            if (i7 != 0) {
                vy8Var = ty8.a;
            }
            if (i8 != 0) {
                i2 = 0;
            }
            if (i9 != 0) {
                i3 = 0;
            }
            r23 r23Var = r23.b;
            av8Var.e0(578571862);
            av8Var.e0(-548224868);
            if (!(av8Var.a instanceof pf0)) {
                z8e.N();
                throw null;
            }
            av8Var.b0();
            if (av8Var.S) {
                av8Var.l(r23Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, vy8Var, f50.z);
            waa.K(av8Var, new eo(i3), f50.A);
            waa.K(av8Var, new go(i2), f50.B);
            tc3Var.invoke(w23.a, av8Var, Integer.valueOf(((i6 >> 6) & 112) | 6));
            av8Var.s(true);
            av8Var.s(false);
            av8Var.s(false);
        }
        vy8 vy8Var2 = vy8Var;
        int i10 = i2;
        int i11 = i3;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s23(vy8Var2, i10, i11, tc3Var, i4, i5, 0);
        }
    }

    public static final void c(scj scjVar, scj scjVar2, Function1 function1, Function1 function12, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        Function0 function02;
        xtc xtcVar2;
        function1.getClass();
        function12.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1976148012);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(scjVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(scjVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.i(function12) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            function02 = function0;
            i3 |= av8Var.i(function02) ? 16384 : 8192;
        } else {
            function02 = function0;
        }
        int i4 = i3 | 196608;
        if (av8Var.T(i4 & 1, (74899 & i4) != 74898)) {
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String g2 = bf3.g(24.0f, R.string.crowdsourcing_enter_the_correct_ft_score, av8Var, av8Var, utcVar);
            yf8 yf8Var = xth.a;
            udj.c(g2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131066);
            xtc f2 = vxd.f(utcVar, 24.0f, av8Var, utcVar, 1.0f);
            l8g a3 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            int i5 = i4 & 896;
            boolean z = i5 == 256;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new ri(8, function1);
                av8Var.n0(O);
            }
            Function0 function03 = (Function0) O;
            int i6 = i4 & 7168;
            boolean z2 = i6 == 2048;
            Object O2 = av8Var.O();
            int i7 = 9;
            if (z2 || O2 == a99Var) {
                O2 = new ri(i7, function12);
                av8Var.n0(O2);
            }
            a(scjVar, function03, (Function0) O2, null, av8Var, i4 & 14);
            w1l.o(1.0f, true, av8Var);
            boolean z3 = i5 == 256;
            Object O3 = av8Var.O();
            if (z3 || O3 == a99Var) {
                O3 = new ri(10, function1);
                av8Var.n0(O3);
            }
            Function0 function04 = (Function0) O3;
            boolean z4 = i6 == 2048;
            Object O4 = av8Var.O();
            if (z4 || O4 == a99Var) {
                O4 = new ri(11, function12);
                av8Var.n0(O4);
            }
            a(scjVar2, function04, (Function0) O4, null, av8Var, (i4 >> 3) & 14);
            bf3.t(av8Var, true, utcVar, 24.0f, av8Var);
            mha.h(oea.v(R.string.submit, av8Var), function02, bkh.d(utcVar, 1.0f), iqh.a, null, true, false, false, 0L, 0, 0, av8Var, ((i4 >> 9) & 112) | 200064, 0, 2000);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bi(scjVar, scjVar2, function1, function12, function0, xtcVar2, i2, 4);
        }
    }

    public static final void d(y15 y15Var, of3 of3Var, int i2) {
        SnapshotStateList snapshotStateList;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(294589392);
        if ((((av8Var.i(y15Var) ? 4 : 2) | i2) & 3) == 2 && av8Var.D()) {
            av8Var.W();
        } else {
            ppg I = i2a.I(av8Var);
            e1d l2 = sea.l(y15Var.b().e, av8Var, 0);
            List list = (List) l2.getValue();
            boolean booleanValue = ((Boolean) av8Var.k(f5a.a)).booleanValue();
            boolean g2 = av8Var.g(list);
            Object O = av8Var.O();
            Object obj = nf3.a;
            Object obj2 = O;
            if (g2 || O == obj) {
                SnapshotStateList snapshotStateList2 = new SnapshotStateList();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    d6d d6dVar = (d6d) obj3;
                    if (booleanValue || d6dVar.h.j.i.compareTo(e6b.d) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                snapshotStateList2.addAll(arrayList);
                av8Var.n0(snapshotStateList2);
                obj2 = snapshotStateList2;
            }
            SnapshotStateList snapshotStateList3 = (SnapshotStateList) obj2;
            o(snapshotStateList3, (List) l2.getValue(), av8Var, 0);
            e1d l3 = sea.l(y15Var.b().f, av8Var, 0);
            Object O2 = av8Var.O();
            if (O2 == obj) {
                O2 = new SnapshotStateList();
                av8Var.n0(O2);
            }
            SnapshotStateList snapshotStateList4 = (SnapshotStateList) O2;
            av8Var.d0(-367418626);
            ListIterator listIterator = snapshotStateList3.listIterator();
            while (true) {
                hc9 hc9Var = (hc9) listIterator;
                if (!hc9Var.hasNext()) {
                    break;
                }
                d6d d6dVar2 = (d6d) hc9Var.next();
                s6d s6dVar = d6dVar2.b;
                s6dVar.getClass();
                x15 x15Var = (x15) s6dVar;
                boolean i3 = av8Var.i(y15Var) | av8Var.i(d6dVar2);
                Object O3 = av8Var.O();
                if (i3 || O3 == obj) {
                    O3 = new h84(7, y15Var, d6dVar2);
                    av8Var.n0(O3);
                }
                oyn.b((Function0) O3, x15Var.g, yqo.H(1129586364, av8Var, new wi4(d6dVar2, y15Var, I, snapshotStateList4, x15Var, 2)), av8Var, 384);
            }
            av8Var.s(false);
            Set set = (Set) l3.getValue();
            boolean g3 = av8Var.g(l3) | av8Var.i(y15Var);
            Object O4 = av8Var.O();
            if (g3 || O4 == obj) {
                snapshotStateList = snapshotStateList4;
                Object k50Var = new k50(l3, y15Var, snapshotStateList, null, 3);
                av8Var.n0(k50Var);
                O4 = k50Var;
            } else {
                snapshotStateList = snapshotStateList4;
            }
            hz8.q(set, snapshotStateList, (Function2) O4, av8Var);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fv2(y15Var, i2, 10);
        }
    }

    public static final void e(String str, String str2, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        str.getClass();
        str2.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1495061172);
        int i3 = i2 | (av8Var2.g(str) ? 4 : 2) | (av8Var2.g(str2) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            xtc d0 = l98.d0(bkh.d(xtcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10.0f, 1);
            u23 a2 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.p, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m2, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.l(), av8Var2, i3 & 14, 24576, 114682);
            av8Var = av8Var2;
            udj.c(str2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.b(), av8Var2, (i3 >> 3) & 14, 24576, 114682);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cv3(str, str2, xtcVar, i2, 2);
        }
    }

    public static final void f(mte mteVar, boolean z, Function1 function1, Integer num, xtc xtcVar, boolean z2, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        int i4;
        ff3 ff3Var;
        zg3 zg3Var;
        float f2;
        f50 f50Var;
        boolean z3;
        boolean z4;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1568484394);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(mteVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(num) ? a.o : 1024;
        }
        int i5 = i3 | 24576;
        if ((196608 & i2) == 0) {
            i5 |= av8Var.h(z2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (av8Var.T(i5 & 1, (74899 & i5) != 74898)) {
            Double d2 = mteVar.d;
            int i6 = mteVar.a;
            boolean z5 = d2 != null;
            boolean z6 = z5 && num != null && i6 == num.intValue();
            av8Var.d0(-220002661);
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = b74.x;
                av8Var.n0(O2);
            }
            qz5 qz5Var = new qz5((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1, mteVar, 3);
            utc utcVar = utc.a;
            xtc d0 = l98.d0(tol.y(utcVar, true, true, true, D, wzcVar, qz5Var, av8Var, 0), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            if (z6) {
                d0 = d0.z(n9e.q(utcVar, lz.D(R.color.surface_2, av8Var), o7g.a(8.0f)));
            }
            av8Var.s(false);
            xtc c0 = l98.c0(d0, 8.0f, 4.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var2 = hf3.g;
            waa.K(av8Var, a2, f50Var2);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m2, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var3 = hf3.j;
            waa.K(av8Var, valueOf, f50Var3);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var4 = hf3.d;
            waa.K(av8Var, C, f50Var4);
            if (z) {
                av8Var.d0(1879187871);
                int i7 = (i5 >> 6) & 7168;
                i4 = i5;
                zg3Var = zg3Var2;
                f50Var = f50Var2;
                ff3Var = ff3Var2;
                boolean z7 = z6;
                z4 = false;
                f2 = 4.0f;
                g(mteVar.c, mteVar.d, z7, z2, av8Var, i7);
                z3 = z7;
                av8Var.s(false);
            } else {
                i4 = i5;
                ff3Var = ff3Var2;
                zg3Var = zg3Var2;
                f2 = 4.0f;
                f50Var = f50Var2;
                z3 = z6;
                z4 = false;
                av8Var.d0(1879410172);
                av8Var.s(false);
            }
            xtc d02 = l98.d0(utcVar, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            k1c c2 = e12.c(uxf.c, z4);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var3, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var4);
            td4.C(mteVar.a, bkh.l(utcVar, 32.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 48, 12);
            td4.G(mteVar.f, bkh.l(n12.a.a(utcVar, uxf.i), 16.0f), false, 0L, av8Var, 0, 12);
            av8Var.s(true);
            String str = mteVar.b;
            yf8 yf8Var = xth.a;
            udj.c(str, new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110584);
            av8Var = av8Var;
            if (z5 && num != null && num.intValue() == i6) {
                ljg.r(f2, 1880140284, av8Var, av8Var, utcVar);
                c5n.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 31, 0L, 0L, av8Var, null);
                av8Var = av8Var;
                av8Var.s(z4);
            } else {
                av8Var.d0(1880232540);
                av8Var.s(z4);
            }
            if (z) {
                av8Var.d0(1880549980);
                av8Var.s(z4);
            } else {
                ljg.r(f2, 1880274173, av8Var, av8Var, utcVar);
                g(mteVar.c, mteVar.d, z3, z2, av8Var, (i4 >> 6) & 7168);
                av8Var.s(z4);
            }
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new i44(mteVar, z, function1, num, xtcVar2, z2, i2);
        }
    }

    public static final void g(Double d2, Double d3, boolean z, boolean z2, of3 of3Var, int i2) {
        int i3;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        Unit unit;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-897560417);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(d2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(d3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            z3 = z2;
            i3 |= av8Var.h(z3) ? a.o : 1024;
        } else {
            z3 = z2;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            if (d3 == null) {
                av8Var.d0(1244184888);
                av8Var.s(false);
                unit = null;
                i6 = i3;
                z4 = false;
            } else {
                av8Var.d0(1244184889);
                xtc l2 = bkh.l(utc.a, 24.0f);
                if (z) {
                    i4 = -1895502829;
                    i5 = R.color.surface_1;
                } else {
                    i4 = -1895502221;
                    i5 = R.color.surface_2;
                }
                xtc q = n9e.q(l2, ljg.f(av8Var, i4, i5, av8Var, false), oyn.e);
                k1c c2 = e12.c(uxf.g, false);
                int hashCode = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C = fqj.C(av8Var, q);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c2, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                String r = yid.r((int) d3.doubleValue());
                yf8 yf8Var = xth.a;
                z4 = false;
                i6 = i3;
                q5a.w(r, null, lz.D(R.color.n_lv_1, av8Var), new es0(v8a.v(6), v8a.v(12), v8a.u(0.25d)), 0L, 0L, new p7j(3), 0L, 0, false, 1, 0, xth.n(), av8Var, 0, 24576, 113650);
                av8Var = av8Var;
                av8Var.s(true);
                av8Var.s(false);
                unit = Unit.a;
            }
            if (unit == null) {
                av8Var.d0(1244758358);
                i9a.j(d2, false, z3, null, false, true, null, av8Var, (i6 & 14) | 196656 | ((i6 >> 3) & 896), 88);
                av8Var.s(z4);
            } else {
                av8Var.d0(732871370);
                av8Var.s(z4);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bl1(d2, d3, z, z2, i2);
        }
    }

    public static final void h(int i2, int i3, long j2, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        xtc xtcVar3;
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-439675151);
        int i4 = i3 | (av8Var.e(i2) ? 4 : 2) | 48 | (av8Var.f(j2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i5 = 0;
        int i6 = 1;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            av8Var.Y();
            if ((i3 & 1) == 0 || av8Var.B()) {
                xtcVar3 = utc.a;
            } else {
                av8Var.W();
                xtcVar3 = xtcVar;
            }
            av8Var.t();
            Context context = (Context) av8Var.k(nz.b);
            boolean booleanValue = ((Boolean) av8Var.k(f5a.a)).booleanValue();
            Object O = av8Var.O();
            rq3 rq3Var = null;
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                if (!booleanValue) {
                    ia0 ia0Var = ia0.q;
                    udl h2 = ok3.p().h();
                    Set set = h2.l;
                    if (set == null) {
                        set = (Set) td4.t0(g.a, new ndl(h2, rq3Var, i5));
                    }
                    if (set.contains(Integer.valueOf(i2))) {
                        z = true;
                        O = e.f(Boolean.valueOf(z));
                        av8Var.n0(O);
                    }
                }
                z = false;
                O = e.f(Boolean.valueOf(z));
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            Integer valueOf = Integer.valueOf(i2);
            int i7 = i4 & 14;
            boolean z2 = i7 == 4;
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                O2 = new qu1(i2, e1dVar, rq3Var, 7);
                av8Var.n0(O2);
            }
            hz8.o(av8Var, valueOf, (Function2) O2);
            ImageVector N = s6a.N(((Boolean) e1dVar.getValue()).booleanValue() ? R.drawable.ic_notification_active : R.drawable.ic_notification_deselected, 6, av8Var);
            xtc l2 = bkh.l(xtcVar3, 24.0f);
            boolean i8 = (i7 == 4) | av8Var.i(context);
            Object O3 = av8Var.O();
            if (i8 || O3 == a99Var) {
                O3 = new hp5(context, i2, e1dVar, i6);
                av8Var.n0(O3);
            }
            kq9.b(N, null, tol.n(l2, 0.75f, (Function0) O3, 2), j2, av8Var, ((i4 << 3) & 7168) | 48, 0);
            xtcVar2 = xtcVar3;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fr1(i2, i3, j2, xtcVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c5, code lost:
    
        if (r0 == null) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(h73 h73Var, boolean z, boolean z2, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        f50 f50Var;
        lv1 lv1Var;
        f50 f50Var2;
        ff3 ff3Var;
        ry ryVar;
        f50 f50Var3;
        zg3 zg3Var;
        boolean z3;
        boolean z4;
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel;
        av8 av8Var;
        utc utcVar;
        String str;
        zg3 zg3Var2;
        String str2;
        boolean z5;
        o68 o68Var;
        r13 r13Var;
        long j2;
        boolean z6;
        String str3;
        h73Var.getClass();
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel2 = h73Var.b;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1995584911);
        int i3 = i2 | (av8Var2.g(h73Var) ? 4 : 2) | (av8Var2.h(z) ? 32 : 16) | (av8Var2.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            lv1 lv1Var2 = uxf.m;
            kg0 kg0Var = ww9.h;
            utc utcVar2 = utc.a;
            xtc b0 = l98.b0(bkh.d(utcVar2, 1.0f), 8.0f);
            l8g a2 = k8g.a(kg0Var, lv1Var2, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, b0);
            if3.k7.getClass();
            zg3 zg3Var3 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var3);
            } else {
                av8Var2.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var2, a2, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var2, m2, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var2, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var2, C, f50Var6);
            wxf wxfVar = ww9.b;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            l8g a3 = k8g.a(wxfVar, lv1Var2, av8Var2, 54);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, goaVar);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var3);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var4);
            waa.K(av8Var2, m3, ff3Var2);
            bf3.s(hashCode2, av8Var2, f50Var5, av8Var2, ryVar2);
            waa.K(av8Var2, C2, f50Var6);
            if (z2) {
                av8Var2.d0(-273707306);
                o68 o68Var2 = fantasyPlayerFixtureUiModel2 != null ? fantasyPlayerFixtureUiModel2.p : null;
                xtc p = bkh.p(utcVar2, 36.0f);
                k1c c2 = e12.c(uxf.f, false);
                int hashCode3 = Long.hashCode(av8Var2.T);
                aee m4 = av8Var2.m();
                xtc C3 = fqj.C(av8Var2, p);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var3);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, c2, f50Var4);
                waa.K(av8Var2, m4, ff3Var2);
                bf3.s(hashCode3, av8Var2, f50Var5, av8Var2, ryVar2);
                waa.K(av8Var2, C3, f50Var6);
                mv1 mv1Var = uxf.g;
                n7g n7gVar = o7g.a;
                Integer valueOf2 = o68Var2 != null ? Integer.valueOf(o68Var2.a) : null;
                if (valueOf2 == null) {
                    av8Var2.d0(1085317264);
                    z5 = false;
                    av8Var2.s(false);
                    o68Var = o68Var2;
                    r13Var = null;
                } else {
                    z5 = false;
                    o68Var = o68Var2;
                    r13Var = new r13(wv8.b(av8Var2, 1085317265, valueOf2, av8Var2, false));
                }
                if (r13Var == null) {
                    j2 = ljg.f(av8Var2, -1350462171, R.color.rating_00, av8Var2, z5);
                } else {
                    av8Var2.d0(-1350463535);
                    av8Var2.s(z5);
                    j2 = r13Var.a;
                }
                xtc l2 = bkh.l(n9e.q(utcVar2, j2, n7gVar), 20.0f);
                k1c c3 = e12.c(mv1Var, z5);
                int hashCode4 = Long.hashCode(av8Var2.T);
                aee m5 = av8Var2.m();
                xtc C4 = fqj.C(av8Var2, l2);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var3);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, c3, f50Var4);
                waa.K(av8Var2, m5, ff3Var2);
                bf3.s(hashCode4, av8Var2, f50Var5, av8Var2, ryVar2);
                waa.K(av8Var2, C4, f50Var6);
                if (o68Var != null) {
                    z6 = true;
                    str3 = String.valueOf(o68Var.ordinal() + 1);
                } else {
                    z6 = true;
                }
                str3 = "-";
                yf8 yf8Var = xth.a;
                dfj b2 = xth.b();
                long D = lz.D(R.color.surface_1, av8Var2);
                zg3Var = zg3Var3;
                f50Var = f50Var6;
                f50Var2 = f50Var4;
                ryVar = ryVar2;
                f50Var3 = f50Var5;
                utcVar = utcVar2;
                z4 = z6;
                ff3Var = ff3Var2;
                lv1Var = lv1Var2;
                String str4 = str3;
                z3 = z5;
                udj.c(str4, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, b2, av8Var2, 0, 24960, 110586);
                av8Var = av8Var2;
                ljg.t(av8Var, z4, z4, z3);
                fantasyPlayerFixtureUiModel = fantasyPlayerFixtureUiModel2;
            } else {
                f50Var = f50Var6;
                lv1Var = lv1Var2;
                f50Var2 = f50Var4;
                ff3Var = ff3Var2;
                utc utcVar3 = utcVar2;
                ryVar = ryVar2;
                f50Var3 = f50Var5;
                zg3Var = zg3Var3;
                z3 = false;
                z4 = true;
                av8Var2.d0(-272760876);
                q80 I = I(fantasyPlayerFixtureUiModel2 != null ? fantasyPlayerFixtureUiModel2.j : null, av8Var2);
                yf8 yf8Var2 = xth.a;
                fantasyPlayerFixtureUiModel = fantasyPlayerFixtureUiModel2;
                udj.d(I, bkh.q(utcVar3, 36.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, av8Var2), null, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, xth.l(), av8Var2, 48, 24960, 241656);
                av8Var = av8Var2;
                av8Var.s(false);
                utcVar = utcVar3;
            }
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            if (z) {
                av8Var.d0(-272082069);
                av8Var.s(z3);
            } else {
                av8Var.d0(-272319436);
                td4.u(fantasyPlayerFixtureUiModel != null ? fantasyPlayerFixtureUiModel.g : -1, 48, av8Var, bkh.l(utcVar, 24.0f));
                bf3.u(utcVar, 2.0f, av8Var, z3);
            }
            FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel3 = h73Var.c;
            String str5 = "";
            if (fantasyPlayerFixtureUiModel == null || (str = fantasyPlayerFixtureUiModel.h) == null) {
                str = "";
            }
            av8 av8Var3 = av8Var;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var3, 0, 24960, 110586);
            av8Var3.s(z4);
            udj.c(h73Var.a, l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.m(), av8Var3, 48, 24960, 110584);
            uxf uxfVar = ww9.c;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar2 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z4);
            l8g a4 = k8g.a(uxfVar, lv1Var, av8Var3, 54);
            int hashCode5 = Long.hashCode(av8Var3.T);
            aee m6 = av8Var3.m();
            xtc C5 = fqj.C(av8Var3, goaVar2);
            av8Var3.h0();
            if (av8Var3.S) {
                zg3Var2 = zg3Var;
                av8Var3.l(zg3Var2);
            } else {
                zg3Var2 = zg3Var;
                av8Var3.q0();
            }
            f50 f50Var7 = f50Var2;
            waa.K(av8Var3, a4, f50Var7);
            ff3 ff3Var3 = ff3Var;
            waa.K(av8Var3, m6, ff3Var3);
            f50 f50Var8 = f50Var3;
            ry ryVar3 = ryVar;
            bf3.s(hashCode5, av8Var3, f50Var8, av8Var3, ryVar3);
            f50 f50Var9 = f50Var;
            waa.K(av8Var3, C5, f50Var9);
            if (fantasyPlayerFixtureUiModel3 != null && (str2 = fantasyPlayerFixtureUiModel3.h) != null) {
                str5 = str2;
            }
            zg3 zg3Var4 = zg3Var2;
            udj.c(str5, null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var3, 0, 24960, 110586);
            av8Var2 = av8Var3;
            if (z) {
                av8Var2.d0(-64475308);
                av8Var2.s(false);
            } else {
                ljg.r(2.0f, -64713636, av8Var2, av8Var2, utcVar);
                td4.u(fantasyPlayerFixtureUiModel3 != null ? fantasyPlayerFixtureUiModel3.g : -1, 48, av8Var2, bkh.l(utcVar, 24.0f));
                av8Var2.s(false);
            }
            nq8.h(av8Var2, bkh.p(utcVar, 16.0f));
            if (z2) {
                av8Var2.d0(-64385067);
                o68 o68Var3 = fantasyPlayerFixtureUiModel3 != null ? fantasyPlayerFixtureUiModel3.p : null;
                xtc p2 = bkh.p(utcVar, 36.0f);
                k1c c4 = e12.c(uxf.h, false);
                int hashCode6 = Long.hashCode(av8Var2.T);
                aee m7 = av8Var2.m();
                xtc C6 = fqj.C(av8Var2, p2);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var4);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, c4, f50Var7);
                waa.K(av8Var2, m7, ff3Var3);
                bf3.s(hashCode6, av8Var2, f50Var8, av8Var2, ryVar3);
                waa.K(av8Var2, C6, f50Var9);
                ktm.q(o68Var3, null, av8Var2, 0);
                av8Var2.s(true);
                av8Var2.s(false);
            } else {
                av8Var2.d0(-64042579);
                udj.d(I(fantasyPlayerFixtureUiModel3 != null ? fantasyPlayerFixtureUiModel3.j : null, av8Var2), bkh.q(utcVar, 36.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, av8Var2), null, 0L, 0L, new p7j(6), 0L, 2, false, 1, 0, null, null, xth.l(), av8Var2, 48, 24960, 240632);
                av8Var2 = av8Var2;
                av8Var2.s(false);
            }
            av8Var2.s(true);
            av8Var2.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var2.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var2.u();
        if (u != null) {
            u.d = new xt6(h73Var, z, z2, xtcVar2, i2, 1);
        }
    }

    public static final void j(j67 j67Var, ev6 ev6Var, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        String str;
        j67Var.getClass();
        ev6Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1621540236);
        int i3 = i2 | (av8Var.g(j67Var) ? 4 : 2) | (av8Var.g(ev6Var) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            if (j67Var.d()) {
                str = ljg.k(av8Var, 772967865, R.string.fantasy_about_global_league_description, av8Var, false);
            } else {
                av8Var.d0(772970431);
                av8Var.s(false);
                str = j67Var.c;
            }
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            int i4 = ev6Var.c;
            BrandingFantasyCompetition brandingFantasyCompetition = ev6Var.D;
            it7 it7Var = un6.b;
            un6 un6Var = un6.FULL;
            it7Var.getClass();
            wkn.d(i4, brandingFantasyCompetition, it7.x(brandingFantasyCompetition, un6Var, true), d2, yqo.H(1682120706, av8Var, new qm4(14, str, j67Var)), av8Var, 24576);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(j67Var, ev6Var, xtcVar2, i2, 5);
        }
    }

    public static final void k(ev6 ev6Var, int i2, String str, int i3, xtc xtcVar, boolean z, boolean z2, of3 of3Var, int i4) {
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-343904258);
        int i5 = i4 | (av8Var.g(ev6Var) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.e(i3) ? a.o : 1024) | (av8Var.h(z) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i5 & 1, (599187 & i5) != 599186)) {
            Context context = (Context) av8Var.k(nz.b);
            lv1 lv1Var = uxf.m;
            av8Var.d0(220503268);
            xtc d2 = bkh.d(xtcVar, 1.0f);
            utc utcVar = utc.a;
            if (z2) {
                d2 = d2.z(l98.b0(n9e.q(utcVar, lz.D(R.color.surface_2, av8Var), o7g.a(12.0f)), 8.0f));
            }
            av8Var.s(false);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            yf8 yf8Var = xth.a;
            dfj b2 = xth.b();
            udj.c(oea.v(R.string.fantasy_round_highlights_text, av8Var), new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, b2, av8Var, 0, 384, 126968);
            av8Var = av8Var;
            String f2 = fc6.f(16.0f, R.string.fantasy_see_highlights, av8Var, av8Var, utcVar);
            boolean i6 = av8Var.i(context) | ((i5 & 14) == 4) | ((i5 & 112) == 32) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048);
            Object O = av8Var.O();
            if (i6 || O == nf3.a) {
                xj7 xj7Var = new xj7(context, ev6Var, i2, str, i3);
                av8Var.n0(xj7Var);
                O = xj7Var;
            }
            qx9.o(f2, (Function0) O, null, 0L, z, av8Var, i5 & 458752, 28);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e82(ev6Var, i2, str, i3, xtcVar, z, z2, i4);
        }
    }

    public static final void l(v0i v0iVar, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-362443678);
        int i3 = (av8Var.g(v0iVar) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16);
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc p = qx9.p(ljg.h(4.0f, xtcVar, lz.D(R.color.terrain_football, av8Var), 2.0f), 0.627451f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, p);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            boolean z = (i3 & 14) == 4;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = v0iVar != null ? new a10(v0iVar.a) : null;
                av8Var.n0(O);
            }
            a10 a10Var = (a10) O;
            if (a10Var != null) {
                av8Var.d0(1533605495);
                wkn.m(a10Var, bkh.c, av8Var, 25008);
                av8Var.s(false);
            } else {
                av8Var.d0(1533814342);
                av8Var.s(false);
            }
            kq9.b(s6a.N(R.drawable.comparison_football_full_terrain, 6, av8Var), null, bkh.c, lz.D(R.color.neutral_default, av8Var), av8Var, 432, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lr1(v0iVar, xtcVar, i2, i4);
        }
    }

    public static final void m(qu8 qu8Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(806045339);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(qu8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            tc3 H = yqo.H(-63962206, av8Var2, new hl7(qu8Var, 19));
            tc3 H2 = yqo.H(297794298, av8Var2, new mu8(qu8Var, 3));
            tc3 tc3Var = n4o.f;
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object O = av8Var2.O();
            if (z || O == nf3.a) {
                O = new nu8(function1, qu8Var, i4);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar, H, H2, tc3Var, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, null, (Function0) O, av8Var, ((i3 >> 6) & 14) | 28080, 2016);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ou8(qu8Var, function1, xtcVar, i2, 1);
        }
    }

    public static final void n(final boolean z, final boolean z2, long j2, long j3, final Function0 function0, final Function0 function02, final Function0 function03, Function1 function1, final xtc xtcVar, of3 of3Var, final int i2) {
        int i3;
        final long j4;
        e1d e1dVar;
        int i4;
        a99 a99Var;
        n12 n12Var;
        f50 f50Var;
        final long j5 = j3;
        final Function1 function12 = function1;
        mv1 mv1Var = uxf.g;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1722696784);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.f(j2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.f(j5) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.i(function0) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= av8Var.i(function02) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= av8Var.i(function03) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= av8Var.i(function12) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= av8Var.g(xtcVar) ? 67108864 : 33554432;
        }
        if (av8Var.T(i3 & 1, (i3 & 38347923) != 38347922)) {
            int i5 = z ? R.drawable.ic_play_arrow : R.drawable.ic_pause;
            Object O = av8Var.O();
            a99 a99Var2 = nf3.a;
            if (O == a99Var2) {
                O = e.f(Boolean.TRUE);
                av8Var.n0(O);
            }
            e1d e1dVar2 = (e1d) O;
            Boolean valueOf = Boolean.valueOf(z);
            int i6 = i3;
            int i7 = i6 & 14;
            boolean z3 = i7 == 4;
            Object O2 = av8Var.O();
            if (z3 || O2 == a99Var2) {
                O2 = new hw6(z, e1dVar2, null, 2);
                av8Var.n0(O2);
            }
            hz8.o(av8Var, valueOf, (Function2) O2);
            boolean z4 = (i7 == 4) | ((i6 & 112) == 32) | ((i6 & 3670016) == 1048576) | ((i6 & 57344) == 16384) | ((i6 & 458752) == 131072);
            Object O3 = av8Var.O();
            if (z4 || O3 == a99Var2) {
                e1dVar = e1dVar2;
                i4 = i6;
                Function0 function04 = new Function0() { // from class: nqk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (z2) {
                            function03.invoke();
                        } else if (z) {
                            function0.invoke();
                        } else {
                            function02.invoke();
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(function04);
                O3 = function04;
            } else {
                e1dVar = e1dVar2;
                i4 = i6;
            }
            e1d g2 = e.g((Function0) O3, av8Var);
            xtc z5 = xtcVar.z(bkh.c);
            Unit unit = Unit.a;
            boolean g3 = av8Var.g(g2);
            Object O4 = av8Var.O();
            if (g3 || O4 == a99Var2) {
                O4 = new aq7(2, g2);
                av8Var.n0(O4);
            }
            xtc a2 = koi.a(z5, unit, (PointerInputEventHandler) O4);
            mv1 mv1Var2 = uxf.c;
            k1c c2 = e12.c(mv1Var2, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, a2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var2 = hf3.g;
            waa.K(av8Var, c2, f50Var2);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf2 = Integer.valueOf(hashCode);
            f50 f50Var3 = hf3.j;
            waa.K(av8Var, valueOf2, f50Var3);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var4 = hf3.d;
            waa.K(av8Var, C, f50Var4);
            utc utcVar = utc.a;
            n12 n12Var2 = n12.a;
            if (z2) {
                av8Var.d0(1354066912);
                f50Var = f50Var4;
                n12Var = n12Var2;
                a99Var = a99Var2;
                kq9.b(s6a.N(R.drawable.ic_replay, 6, av8Var), null, n12Var2.a(bkh.l(utcVar, 56.0f), mv1Var), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                a99Var = a99Var2;
                n12Var = n12Var2;
                f50Var = f50Var4;
                if (((Boolean) e1dVar.getValue()).booleanValue()) {
                    av8Var.d0(1354425458);
                    kq9.b(s6a.N(i5, 6, av8Var), null, n12Var.a(bkh.l(utcVar, 56.0f), mv1Var), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
                    av8Var = av8Var;
                    av8Var.s(false);
                } else {
                    av8Var.d0(1354706380);
                    av8Var.s(false);
                }
            }
            xtc c0 = l98.c0(n12Var.a(utcVar, uxf.j), 10.0f, 4.0f);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int i8 = i4;
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var2);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var3, av8Var, ryVar);
            goa g4 = ljg.g(av8Var, C2, f50Var, 1.0f, true);
            k1c c3 = e12.c(mv1Var2, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, g4);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var2);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var3, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var);
            xtc q = n9e.q(wnn.A(bkh.d(bkh.e(utcVar, 4.0f), 1.0f), o7g.a(16.0f)), lz.D(R.color.on_color_secondary, av8Var), oyn.e);
            long D = lz.D(R.color.on_color_primary, av8Var);
            long j6 = r13.h;
            int i9 = i8 & 7168;
            boolean z6 = (i9 == 2048) | ((i8 & 896) == 256);
            Object O5 = av8Var.O();
            if (z6 || O5 == a99Var) {
                j4 = j2;
                j5 = j3;
                O5 = new Function0() { // from class: kqk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(j5 / j4);
                    }
                };
                av8Var.n0(O5);
            } else {
                j4 = j2;
                j5 = j3;
            }
            Function0 function05 = (Function0) O5;
            Object O6 = av8Var.O();
            if (O6 == a99Var) {
                O6 = new wik(22);
                av8Var.n0(O6);
            }
            av8 av8Var2 = av8Var;
            ncf.c(function05, q, D, j6, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Function1) O6, av8Var2, 1772544);
            i.o(av8Var2, true, utcVar, 12.0f, av8Var2);
            xtc l2 = bkh.l(utcVar, 24.0f);
            boolean z7 = ((29360128 & i8) == 8388608) | (i9 == 2048);
            Object O7 = av8Var2.O();
            if (z7 || O7 == a99Var) {
                function12 = function1;
                O7 = new oi4(1, j5, function12);
                av8Var2.n0(O7);
            } else {
                function12 = function1;
            }
            kq9.b(s6a.N(R.drawable.ic_maximize, 6, av8Var2), null, oyn.w(l2, false, null, null, (Function0) O7, 15), lz.D(R.color.on_color_primary, av8Var2), av8Var2, 48, 0);
            av8Var = av8Var2;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            j4 = j2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            final long j7 = j4;
            final long j8 = j5;
            u.d = new Function2() { // from class: lqk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rd0.n(z, z2, j7, j8, function0, function02, function03, function12, xtcVar, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void o(List list, Collection collection, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1537894851);
        if ((((av8Var.i(list) ? 4 : 2) | i2 | (av8Var.i(collection) ? 32 : 16)) & 19) == 18 && av8Var.D()) {
            av8Var.W();
        } else {
            boolean booleanValue = ((Boolean) av8Var.k(f5a.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                d6d d6dVar = (d6d) it.next();
                y6b y6bVar = d6dVar.h.j;
                boolean h2 = av8Var.h(booleanValue) | av8Var.i(list) | av8Var.i(d6dVar);
                Object O = av8Var.O();
                if (h2 || O == nf3.a) {
                    O = new gk(d6dVar, booleanValue, list, 3);
                    av8Var.n0(O);
                }
                hz8.d(y6bVar, (Function1) O, av8Var);
            }
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(list, collection, i2, 7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ad, code lost:
    
        if (r5 == r0) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(final ale aleVar, boolean z, boolean z2, String str, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        d6f d6fVar;
        Object h4iVar;
        a99 a99Var;
        Unit unit;
        a99 a99Var2;
        str.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1989224363);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(aleVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(str) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.i(function1) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if (av8Var.T(i4 & 1, (i4 & 74899) != 74898)) {
            int i5 = i4 & 14;
            d6f K = s6a.K(aleVar, av8Var, i5);
            Object O = av8Var.O();
            a99 a99Var3 = nf3.a;
            if (O == a99Var3) {
                O = e.d(aleVar.getDuration());
                av8Var.n0(O);
            }
            boh bohVar = (boh) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var3) {
                O2 = e.d(0L);
                av8Var.n0(O2);
            }
            boh bohVar2 = (boh) O2;
            Unit unit2 = Unit.a;
            boolean i6 = av8Var.i(aleVar);
            Object O3 = av8Var.O();
            rq3 rq3Var = null;
            if (i6 || O3 == a99Var3) {
                d6fVar = K;
                a99Var = a99Var3;
                unit = unit2;
                h4iVar = new h4i(aleVar, bohVar2, bohVar, rq3Var, 25);
                av8Var.n0(h4iVar);
            } else {
                d6fVar = K;
                h4iVar = O3;
                a99Var = a99Var3;
                unit = unit2;
            }
            hz8.o(av8Var, unit, (Function2) h4iVar);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc u = yqo.u(bkh.c, 30.0f, 30.0f, null);
            ht9 ht9Var = new ht9((Context) av8Var.k(nz.b));
            ht9Var.c = str;
            ht9Var.f = "media-video-blur-".concat(str);
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            final int i7 = 0;
            final int i8 = 1;
            awj[] awjVarArr = {new ty1(f2, f2, i7, 7)};
            sl6 sl6Var = st9.a;
            st9.b(ht9Var, ph0.X(awjVarArr));
            xtcVar2 = utcVar;
            haa.a(ht9Var.a(), null, u, null, mp3.a, av8Var, 1572912, 1976);
            hda.d(aleVar, fqj.F(mp3.b, (njh) ((eoh) d6fVar.a).getValue(), av8Var), 0, av8Var, i5);
            long h2 = bohVar.h();
            long h3 = bohVar2.h();
            xtc a2 = n12.a.a(xtcVar2, uxf.i);
            boolean i9 = av8Var.i(aleVar);
            Object O4 = av8Var.O();
            if (i9) {
                a99Var2 = a99Var;
            } else {
                a99Var2 = a99Var;
            }
            O4 = new Function0() { // from class: mqk
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i10 = i7;
                    ale aleVar2 = aleVar;
                    switch (i10) {
                        case 0:
                            aleVar2.play();
                            break;
                        case 1:
                            aleVar2.pause();
                            break;
                        default:
                            aleVar2.seekTo(0L);
                            aleVar2.play();
                            break;
                    }
                    return Unit.a;
                }
            };
            av8Var.n0(O4);
            Function0 function0 = (Function0) O4;
            boolean i10 = av8Var.i(aleVar);
            Object O5 = av8Var.O();
            if (i10 || O5 == a99Var2) {
                O5 = new Function0() { // from class: mqk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i102 = i8;
                        ale aleVar2 = aleVar;
                        switch (i102) {
                            case 0:
                                aleVar2.play();
                                break;
                            case 1:
                                aleVar2.pause();
                                break;
                            default:
                                aleVar2.seekTo(0L);
                                aleVar2.play();
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O5);
            }
            Function0 function02 = (Function0) O5;
            boolean i11 = av8Var.i(aleVar);
            Object O6 = av8Var.O();
            if (i11 || O6 == a99Var2) {
                final int i12 = 2;
                O6 = new Function0() { // from class: mqk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i102 = i12;
                        ale aleVar2 = aleVar;
                        switch (i102) {
                            case 0:
                                aleVar2.play();
                                break;
                            case 1:
                                aleVar2.pause();
                                break;
                            default:
                                aleVar2.seekTo(0L);
                                aleVar2.play();
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O6);
            }
            n(z, z2, h2, h3, function0, function02, (Function0) O6, function1, a2, av8Var, ((i4 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i4 << 9) & 29360128));
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new i44(aleVar, z, z2, str, function1, xtcVar2, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(String str, String str2, xtc xtcVar, ct8 ct8Var, boolean z, Function1 function1, Function0 function0, qqk qqkVar, of3 of3Var, int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        int i6;
        Function0 function02;
        int i7;
        int i8;
        ct8 ct8Var2;
        Function1 function12;
        av8 av8Var;
        Function0 function03;
        qqk qqkVar2;
        eqf u;
        e1d e1dVar;
        e1d e1dVar2;
        Object obj;
        qqk qqkVar3;
        Function1 function13;
        Function0 function04;
        av8 av8Var2;
        av8 av8Var3;
        boolean z3;
        str.getClass();
        str2.getClass();
        ct8Var.getClass();
        av8 av8Var4 = (av8) of3Var;
        av8Var4.f0(1157535235);
        if ((i2 & 6) == 0) {
            i4 = (av8Var4.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var4.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var4.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var4.i(ct8Var) ? a.o : 1024;
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            z2 = z;
            i4 |= av8Var4.h(z2) ? 16384 : 8192;
            int i10 = 1769472 | i4;
            i5 = i3 & 128;
            if (i5 == 0) {
                i10 = 14352384 | i4;
            } else if ((12582912 & i2) == 0) {
                i10 |= av8Var4.i(function1) ? 8388608 : 4194304;
                i6 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i6 != 0) {
                    i10 |= 100663296;
                    function02 = function0;
                } else {
                    function02 = function0;
                    if ((i2 & 100663296) == 0) {
                        i10 |= av8Var4.i(function02) ? 67108864 : 33554432;
                    }
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i10 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i10 |= av8Var4.e(qqkVar == null ? -1 : qqkVar.ordinal()) ? 536870912 : 268435456;
                }
                i8 = i10;
                if (av8Var4.T(i8 & 1, (306783379 & i8) != 306783378)) {
                    boolean z4 = i9 != 0 ? true : z2;
                    Function1 function14 = i5 != 0 ? null : function1;
                    if (i6 != 0) {
                        function02 = null;
                    }
                    qqk qqkVar4 = i7 != 0 ? qqk.a : qqkVar;
                    Object obj2 = (Context) av8Var4.k(nz.b);
                    Object O = av8Var4.O();
                    Object obj3 = nf3.a;
                    if (O == obj3) {
                        O = e.f(null);
                        av8Var4.n0(O);
                    }
                    e1d e1dVar3 = (e1d) O;
                    Object O2 = av8Var4.O();
                    if (O2 == obj3) {
                        O2 = e.f(qqkVar4);
                        av8Var4.n0(O2);
                    }
                    e1d e1dVar4 = (e1d) O2;
                    qqk qqkVar5 = (qqk) e1dVar4.getValue();
                    int i11 = i8 & 14;
                    boolean i12 = av8Var4.i(obj2) | (i11 == 4) | ((i8 & 29360128) == 8388608) | ((i8 & 3670016) == 1048576);
                    Object O3 = av8Var4.O();
                    if (i12 || O3 == obj3) {
                        e1dVar = e1dVar3;
                        e1dVar2 = e1dVar4;
                        obj = obj3;
                        qqkVar3 = qqkVar5;
                        Object w32Var = new w32(obj2, str, e1dVar2, e1dVar, function14, null, 4);
                        function13 = function14;
                        av8Var4.n0(w32Var);
                        O3 = w32Var;
                    } else {
                        obj = obj3;
                        function13 = function14;
                        qqkVar3 = qqkVar5;
                        e1dVar = e1dVar3;
                        e1dVar2 = e1dVar4;
                    }
                    hz8.o(av8Var4, qqkVar3, (Function2) O3);
                    d6b d6bVar = d6b.ON_PAUSE;
                    Object O4 = av8Var4.O();
                    if (O4 == obj) {
                        O4 = new tra(26, e1dVar);
                        av8Var4.n0(O4);
                    }
                    jca.b(d6bVar, null, (Function0) O4, av8Var4, 390);
                    Boolean valueOf = Boolean.valueOf(z4);
                    Object O5 = av8Var4.O();
                    if (O5 == obj) {
                        O5 = new eqh(11, e1dVar);
                        av8Var4.n0(O5);
                    }
                    hz8.d(valueOf, (Function1) O5, av8Var4);
                    long j2 = r13.b;
                    jf9 jf9Var = oyn.e;
                    xtc q = n9e.q(xtcVar, j2, jf9Var);
                    mv1 mv1Var = uxf.g;
                    k1c c2 = e12.c(mv1Var, false);
                    e1d e1dVar5 = e1dVar;
                    int hashCode = Long.hashCode(av8Var4.T);
                    aee m2 = av8Var4.m();
                    xtc C = fqj.C(av8Var4, q);
                    if3.k7.getClass();
                    Function0 function05 = hf3.b;
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(function05);
                    } else {
                        av8Var4.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var4, c2, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var4, m2, ff3Var);
                    Integer valueOf2 = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var4, valueOf2, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var4, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var4, C, f50Var3);
                    int ordinal = ((qqk) e1dVar2.getValue()).ordinal();
                    utc utcVar = utc.a;
                    ug5 ug5Var = mp3.a;
                    if (ordinal == 1) {
                        ct8Var2 = ct8Var;
                        function04 = function02;
                        av8Var4.d0(1997157113);
                        av8Var2 = av8Var4;
                        haa.b(str2, null, n9e.q(xtcVar, lz.D(R.color.surface_2, av8Var4), jf9Var), wv8.c(lz.D(R.color.n_lv_3, av8Var4), 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var4), 12), wv8.c(lz.D(R.color.n_lv_3, av8Var4), 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var4), 12), null, ug5Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, ((i8 >> 3) & 14) | 36912, 6, 31712);
                        ncf.a(bkh.l(utcVar, 40.0f), lz.D(R.color.on_color_primary, av8Var2), 6.0f, r13.h, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 3462, 48);
                        av8Var2.s(false);
                        Unit unit = Unit.a;
                    } else if (ordinal == 2 || ordinal == 3) {
                        function04 = function02;
                        av8Var4.d0(1996543065);
                        ale aleVar = (ale) e1dVar5.getValue();
                        if (aleVar == null) {
                            av8Var4.d0(1996543064);
                            av8Var4.s(false);
                            ct8Var2 = ct8Var;
                            z3 = false;
                            av8Var3 = av8Var4;
                        } else {
                            av8Var4.d0(1996543065);
                            av8Var4.d0(1585922024);
                            av8Var4.d0(-1936579788);
                            boolean g2 = av8Var4.g(aleVar);
                            Object O6 = av8Var4.O();
                            if (g2 || O6 == obj) {
                                O6 = new zje(aleVar);
                                av8Var4.n0(O6);
                            }
                            zje zjeVar = (zje) O6;
                            av8Var4.s(false);
                            av8Var4.d0(-1936577403);
                            boolean i13 = av8Var4.i(zjeVar);
                            Object O7 = av8Var4.O();
                            if (i13 || O7 == obj) {
                                O7 = new ppa(zjeVar, null, 23);
                                av8Var4.n0(O7);
                            }
                            av8Var4.s(false);
                            hz8.o(av8Var4, aleVar, (Function2) O7);
                            av8Var4.s(false);
                            boolean booleanValue = ((Boolean) ((eoh) zjeVar.c).getValue()).booleanValue();
                            boolean z5 = ((qqk) e1dVar2.getValue()) == qqk.d;
                            boolean z6 = ((i8 & 7168) == 2048) | (i11 == 4) | ((i8 & 112) == 32);
                            Object O8 = av8Var4.O();
                            if (z6 || O8 == obj) {
                                ct8Var2 = ct8Var;
                                O8 = new ncj(9, ct8Var2, str, str2);
                                av8Var4.n0(O8);
                            } else {
                                ct8Var2 = ct8Var;
                            }
                            p(aleVar, booleanValue, z5, str2, (Function1) O8, null, av8Var4, (i8 << 6) & 7168);
                            av8Var3 = av8Var4;
                            Unit unit2 = Unit.a;
                            z3 = false;
                            av8Var3.s(false);
                        }
                        av8Var3.s(z3);
                        av8Var2 = av8Var3;
                    } else {
                        av8Var4.d0(-2013759481);
                        boolean z7 = (i8 & 234881024) == 67108864;
                        Object O9 = av8Var4.O();
                        if (z7 || O9 == obj) {
                            O9 = new u54(4, e1dVar2, function02);
                            av8Var4.n0(O9);
                        }
                        function04 = function02;
                        xtc w = oyn.w(xtcVar, false, null, null, (Function0) O9, 15);
                        k1c c3 = e12.c(uxf.c, false);
                        int hashCode2 = Long.hashCode(av8Var4.T);
                        aee m3 = av8Var4.m();
                        xtc C2 = fqj.C(av8Var4, w);
                        av8Var4.h0();
                        if (av8Var4.S) {
                            av8Var4.l(function05);
                        } else {
                            av8Var4.q0();
                        }
                        waa.K(av8Var4, c3, f50Var);
                        waa.K(av8Var4, m3, ff3Var);
                        bf3.s(hashCode2, av8Var4, f50Var2, av8Var4, ryVar);
                        waa.K(av8Var4, C2, f50Var3);
                        haa.b(str2, null, n9e.q(xtcVar, lz.D(R.color.surface_2, av8Var4), jf9Var), wv8.c(lz.D(R.color.n_lv_3, av8Var4), 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var4), 12), wv8.c(lz.D(R.color.n_lv_3, av8Var4), 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var4), 12), null, ug5Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var4, ((i8 >> 3) & 14) | 36912, 6, 31712);
                        kq9.b(s6a.N(R.drawable.ic_highlights_white, 6, av8Var4), null, n12.a.a(bkh.l(utcVar, 40.0f), mv1Var), lz.D(R.color.on_color_primary, av8Var4), av8Var4, 48, 0);
                        av8Var4.s(true);
                        av8Var4.s(false);
                        Unit unit3 = Unit.a;
                        ct8Var2 = ct8Var;
                        av8Var2 = av8Var4;
                    }
                    av8Var2.s(true);
                    av8Var = av8Var2;
                    function03 = function04;
                    function12 = function13;
                    z2 = z4;
                    qqkVar2 = qqkVar4;
                } else {
                    ct8Var2 = ct8Var;
                    av8Var4.W();
                    function12 = function1;
                    av8Var = av8Var4;
                    function03 = function02;
                    qqkVar2 = qqkVar;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new s10(str, str2, xtcVar, ct8Var2, z2, function12, function03, qqkVar2, i2, i3);
                    return;
                }
                return;
            }
            i6 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i6 != 0) {
            }
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            i8 = i10;
            if (av8Var4.T(i8 & 1, (306783379 & i8) != 306783378)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        z2 = z;
        int i102 = 1769472 | i4;
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        i6 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i6 != 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        i8 = i102;
        if (av8Var4.T(i8 & 1, (306783379 & i8) != 306783378)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final xtc r(xtc xtcVar, Function1 function1) {
        return xtcVar.z(new qnd(function1, new uj8(19, function1), false));
    }

    public static final xx4 s(View view) {
        Context context = view.getContext();
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if ((context2 instanceof Activity) || (context2 instanceof InputMethodService) || (context2 instanceof Application)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context2 = contextWrapper.getBaseContext();
        }
        context2 = null;
        if (context2 == null) {
            Configuration configuration = context.getResources().getConfiguration();
            ox4 e2 = wnn.e(context);
            long i2 = hz8.i(configuration.screenWidthDp, configuration.screenHeightDp);
            long R0 = e2.R0(i2);
            return new xx4((((int) Float.intBitsToFloat((int) (R0 & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (R0 >> 32))) << 32), i2);
        }
        kal.a.getClass();
        jal jalVar = jal.a;
        lal lalVar = jal.b;
        lalVar.getClass();
        ContextWrapper contextWrapper2 = (ContextWrapper) context2;
        int i3 = Build.VERSION.SDK_INT;
        ial g2 = (i3 >= 34 ? mx4.b : i3 >= 30 ? v02.c : ccd.h).g(contextWrapper2, lalVar.b);
        long height = (4294967295L & g2.a().height()) | (g2.a().width() << 32);
        return new xx4(height, wnn.e(context2).v(d7a.I(height)));
    }

    public static ek2 t(long j2, of3 of3Var, int i2) {
        long b2 = i23.b(j2, of3Var);
        long j3 = r13.i;
        long c2 = r13.c(b2, 0.38f);
        ek2 G = G((g23) ((av8) of3Var).k(i23.a));
        long j4 = j2 != 16 ? j2 : G.a;
        if (b2 == 16) {
            b2 = G.b;
        }
        long j5 = b2;
        if (j3 == 16) {
            j3 = G.c;
        }
        long j6 = j3;
        if (c2 == 16) {
            c2 = G.d;
        }
        return new ek2(j4, j5, j6, c2);
    }

    public static gk2 u(float f2, int i2) {
        if ((i2 & 1) != 0) {
            h23 h23Var = j28.a;
            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return new gk2(f2, j28.f, j28.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y(z88 z88Var, rq3 rq3Var) {
        pa8 pa8Var;
        int i2;
        ih2 ih2Var;
        fsf fsfVar;
        f0 e2;
        ma8 ma8Var;
        Object obj;
        if (rq3Var instanceof pa8) {
            pa8Var = (pa8) rq3Var;
            int i3 = pa8Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pa8Var.u = i3 - Integer.MIN_VALUE;
                Object obj2 = pa8Var.t;
                Object obj3 = lu3.a;
                i2 = pa8Var.u;
                ih2Var = rid.a;
                if (i2 != 0) {
                    fsf g2 = lnb.g(obj2);
                    g2.a = ih2Var;
                    ma8 ma8Var2 = new ma8(g2, 0);
                    try {
                        pa8Var.r = g2;
                        pa8Var.s = ma8Var2;
                        pa8Var.u = 1;
                        if (z88Var.collect(ma8Var2, pa8Var) == obj3) {
                            return obj3;
                        }
                        fsfVar = g2;
                    } catch (f0 e3) {
                        fsfVar = g2;
                        e2 = e3;
                        ma8Var = ma8Var2;
                        if (e2.a == ma8Var) {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ma8Var = pa8Var.s;
                    fsfVar = pa8Var.r;
                    try {
                        y6a.M(obj2);
                    } catch (f0 e4) {
                        e2 = e4;
                        if (e2.a == ma8Var) {
                            throw e2;
                        }
                        bea.u(pa8Var.getContext());
                        obj = fsfVar.a;
                        if (obj != ih2Var) {
                        }
                    }
                }
                obj = fsfVar.a;
                if (obj != ih2Var) {
                    return obj;
                }
                ogj.m("Expected at least one element");
                return null;
            }
        }
        pa8Var = new pa8(rq3Var);
        Object obj22 = pa8Var.t;
        Object obj32 = lu3.a;
        i2 = pa8Var.u;
        ih2Var = rid.a;
        if (i2 != 0) {
        }
        obj = fsfVar.a;
        if (obj != ih2Var) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object z(z88 z88Var, Function2 function2, rq3 rq3Var) {
        qa8 qa8Var;
        int i2;
        ih2 ih2Var;
        fsf fsfVar;
        f0 e2;
        oa8 oa8Var;
        Object obj;
        if (rq3Var instanceof qa8) {
            qa8Var = (qa8) rq3Var;
            int i3 = qa8Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qa8Var.u = i3 - Integer.MIN_VALUE;
                Object obj2 = qa8Var.t;
                Object obj3 = lu3.a;
                i2 = qa8Var.u;
                ih2Var = rid.a;
                if (i2 != 0) {
                    fsf g2 = lnb.g(obj2);
                    g2.a = ih2Var;
                    oa8 oa8Var2 = new oa8(function2, g2, 0);
                    try {
                        qa8Var.r = g2;
                        qa8Var.s = oa8Var2;
                        qa8Var.u = 1;
                        if (z88Var.collect(oa8Var2, qa8Var) == obj3) {
                            return obj3;
                        }
                        fsfVar = g2;
                    } catch (f0 e3) {
                        fsfVar = g2;
                        e2 = e3;
                        oa8Var = oa8Var2;
                        if (e2.a == oa8Var) {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oa8Var = qa8Var.s;
                    fsfVar = qa8Var.r;
                    try {
                        y6a.M(obj2);
                    } catch (f0 e4) {
                        e2 = e4;
                        if (e2.a == oa8Var) {
                            throw e2;
                        }
                        bea.u(qa8Var.getContext());
                        obj = fsfVar.a;
                        if (obj != ih2Var) {
                        }
                    }
                }
                obj = fsfVar.a;
                if (obj != ih2Var) {
                    return obj;
                }
                ogj.m("Expected at least one element matching the predicate");
                return null;
            }
        }
        qa8Var = new qa8(rq3Var);
        Object obj22 = qa8Var.t;
        Object obj32 = lu3.a;
        i2 = qa8Var.u;
        ih2Var = rid.a;
        if (i2 != 0) {
        }
        obj = fsfVar.a;
        if (obj != ih2Var) {
        }
    }

    public abstract void P(o7 o7Var, o7 o7Var2);

    public abstract void Q(o7 o7Var, Thread thread);

    public abstract boolean v(p7 p7Var, l7 l7Var, l7 l7Var2);

    public abstract boolean w(p7 p7Var, Object obj, Object obj2);

    public abstract boolean x(p7 p7Var, o7 o7Var, o7 o7Var2);
}
