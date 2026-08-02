package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.main.start.StartActivity;
import com.sofascore.results.onboarding.OnboardingViewModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class fsd {
    public static final joa a = ypa.a(ysa.c, new ild(7));

    public static final void a(boolean z, of3 of3Var, int i) {
        av8 av8Var;
        int i2;
        boolean z2 = z;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-524329673);
        int i3 = (av8Var2.h(z2) ? 4 : 2) | i;
        int i4 = 0;
        if (av8Var2.T(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) av8Var2.k(nz.b);
            Object k = av8Var2.k(ngb.a);
            BaseActivity baseActivity = k instanceof BaseActivity ? (BaseActivity) k : null;
            if (baseActivity == null) {
                a70.r("Required value was null.");
                return;
            }
            Object obj = (u6b) av8Var2.k(mhb.a);
            boolean z3 = av8Var2.k(dh3.n) == ema.b;
            r7d[] r7dVarArr = {hsd.INSTANCE};
            Object[] objArr = new Object[0];
            qq3 qq3Var = new qq3(new s7d(), 2);
            boolean i5 = av8Var2.i(r7dVarArr);
            Object O = av8Var2.O();
            Object obj2 = nf3.a;
            if (i5 || O == obj2) {
                O = new ate(r7dVarArr, 25);
                av8Var2.n0(O);
            }
            bqg bqgVar = bqg.b;
            c6d c6dVar = (c6d) o3a.L(Arrays.copyOf(objArr, 0), new y3g(9, new s5h(i4, qq3Var, bqgVar), new aaf(17, qq3Var, bqgVar)), null, (Function0) O, av8Var2, 384, 0);
            ttk a2 = cib.a(av8Var2);
            if (a2 == null) {
                a70.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            OnboardingViewModel onboardingViewModel = (OnboardingViewModel) sea.A(duf.a.getOrCreateKotlinClass(OnboardingViewModel.class), a2, kik.V(ufa.s(a2), av8Var2), ufa.r(a2), av8Var2);
            e1d x = rfo.x(onboardingViewModel.f, av8Var2, 0);
            osa a3 = rsa.a(onboardingViewModel.x, av8Var2);
            Unit unit = Unit.a;
            Object O2 = av8Var2.O();
            if (O2 == obj2) {
                O2 = new i40(2, null, 7);
                av8Var2.n0(O2);
            }
            hz8.o(av8Var2, unit, (Function2) O2);
            hof hofVar = onboardingViewModel.h;
            boolean i6 = av8Var2.i(baseActivity) | av8Var2.i(onboardingViewModel);
            Object O3 = av8Var2.O();
            if (i6 || O3 == obj2) {
                O3 = new ord(1, baseActivity, onboardingViewModel);
                av8Var2.n0(O3);
            }
            BaseActivity baseActivity2 = baseActivity;
            w1a.c(hofVar, null, (Function1) O3, av8Var2, 0, 14);
            boolean i7 = av8Var2.i(onboardingViewModel) | av8Var2.i(baseActivity2) | av8Var2.i(obj);
            Object O4 = av8Var2.O();
            if (i7 || O4 == obj2) {
                O4 = new vsc(3, obj, onboardingViewModel, baseActivity2);
                av8Var2.n0(O4);
            }
            hz8.d(obj, (Function1) O4, av8Var2);
            Object O5 = av8Var2.O();
            if (O5 == obj2) {
                O5 = e.f(Boolean.FALSE);
                av8Var2.n0(O5);
            }
            e1d e1dVar = (e1d) O5;
            ysd ysdVar = (ysd) ((vnb) x.getValue()).a();
            if (ysdVar == null) {
                av8Var2.d0(495730899);
                av8Var2.s(false);
                av8Var = av8Var2;
                i2 = 4;
            } else {
                int i8 = ysdVar.a;
                av8Var2.d0(495730900);
                f(i8, 0, av8Var2);
                Object O6 = av8Var2.O();
                if (O6 == obj2) {
                    O6 = new tra(12, e1dVar);
                    av8Var2.n0(O6);
                }
                g(i8, (Function0) O6, av8Var2, 48);
                xtc w = kda.w(utc.a);
                long D = lz.D(R.color.onboarding_surface_1, av8Var2);
                tc3 H = yqo.H(-867469630, av8Var2, new x64(c6dVar, ysdVar, context, baseActivity2, onboardingViewModel, z2));
                z2 = z;
                i2 = 4;
                av8Var = av8Var2;
                q5a.p(w, H, null, null, null, 0, D, 0L, null, yqo.H(-687376243, av8Var2, new bsd(onboardingViewModel, c6dVar, z3, ysdVar, context, z2, baseActivity2, e1dVar, a3)), av8Var, 805306416, 444);
                av8Var.s(false);
            }
        } else {
            av8Var = av8Var2;
            i2 = 4;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zj7(z2, i, i2);
        }
    }

    public static final void b(OnboardingViewModel onboardingViewModel, boolean z, Context context, BaseActivity baseActivity, hrd hrdVar) {
        Object u2gVar;
        Boolean bool;
        onboardingViewModel.x(hrdVar);
        v8a.d = false;
        if (!z) {
            xf0 xf0Var = onboardingViewModel.v;
            Bundle bundle = null;
            uf0 uf0Var = xf0Var instanceof uf0 ? (uf0) xf0Var : null;
            Integer valueOf = uf0Var != null ? Integer.valueOf(uf0Var.a) : null;
            String t = onboardingViewModel.t();
            context.getClass();
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences = a5f.d(applicationContext);
                    uic.j = sharedPreferences;
                }
                sharedPreferences.getClass();
            }
            String string = sharedPreferences.getString("PendingAppsflyerDeeplink", null);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.getClass();
            edit.remove("PendingAppsflyerDeeplink");
            edit.apply();
            try {
                p2g p2gVar = w2g.b;
                if (string != null) {
                    u2gVar = Uri.parse(string);
                    u2gVar.getClass();
                } else {
                    u2gVar = null;
                }
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            if (u2gVar instanceof u2g) {
                u2gVar = null;
            }
            Uri uri = (Uri) u2gVar;
            boolean z2 = onboardingViewModel.v != null;
            if (uri == null || z2) {
                vel velVar = vel.a;
                long w = yaa.w();
                if (1780531199 > w || w > 1784591999 || !onboardingViewModel.w()) {
                    ia0 ia0Var = ia0.q;
                    ri6 d = ok3.p().c().d(l8f.a);
                    if (d != null) {
                        qi6 qi6Var = d instanceof qi6 ? (qi6) d : null;
                        bool = Boolean.valueOf(qi6Var != null && qi6Var.a == 2);
                    } else {
                        bool = null;
                    }
                    if (Intrinsics.c(bool, Boolean.TRUE) && valueOf != null && onboardingViewModel.v()) {
                        ArrayList arrayList = new ArrayList();
                        boolean z3 = MainActivity.n0;
                        arrayList.add(f8h.s(context, fz8.C(fz8.H("sport_name", t))));
                        arrayList.add(a99.x(LeagueActivity.h0, context, valueOf, null, null, null, null, false, false, null, null, null, null, null, 8184));
                        if (arrayList.isEmpty()) {
                            a70.r("No intents added to TaskStackBuilder; cannot startActivities");
                            return;
                        } else {
                            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                            context.startActivities(intentArr, null);
                        }
                    } else {
                        boolean z4 = MainActivity.n0;
                        MainActivity.n0 = true;
                        if (t != null) {
                            Intent s = f8h.s(context, null);
                            s.putExtra("open_action", "open_main");
                            s.putExtra("sport_name", t);
                            context.startActivity(s);
                        } else {
                            f8h.z(context, null, 6);
                        }
                    }
                } else {
                    boolean z5 = MainActivity.n0;
                    f8h.z(context, fz8.C(fz8.H("open_action", "select_world_cup")), 4);
                }
            } else {
                vel velVar2 = vel.a;
                long w2 = yaa.w();
                if (1780531199 > w2 || w2 > 1784591999 || !onboardingViewModel.w()) {
                    String t2 = onboardingViewModel.t();
                    if (t2 != null) {
                        bundle = fz8.C(fz8.H("open_action", "open_main"), fz8.H("sport_name", t2));
                    }
                } else {
                    bundle = fz8.C(fz8.H("open_action", "select_world_cup"));
                }
                int i = StartActivity.q;
                i9a.L(context, uri, bundle);
            }
        }
        baseActivity.finish();
    }

    public static final void c(int i, int i2, of3 of3Var, Function0 function0, Function0 function02, boolean z) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1227232735);
        int i3 = i2 | (av8Var.e(i) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function02) ? a.o : 1024);
        int i4 = 0;
        int i5 = 1;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            zic zicVar = xsd.c;
            boolean z2 = i != 1;
            cdi b = a60.b(z2 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s02.h0(600, 0, null, 6), null, av8Var, 48, 28);
            utc utcVar = utc.a;
            xtc d = bkh.d(utcVar, 1.0f);
            if (!z2) {
                d = d.z(tol.m(utcVar));
            }
            boolean g = av8Var.g(b);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = new cl1(b, 8);
                av8Var.n0(O);
            }
            xtc M = s02.M(d, (Function1) O);
            k1c c = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, M);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            joa joaVar = a;
            i9a.f(((Number) joaVar.getValue()).intValue() - 1, i - 2, yqo.H(2131280323, av8Var, new zrd(i, i4, function0)), yqo.H(-1000105788, av8Var, new zrd(i, i5, function02)), null, lz.D(R.color.onboarding_surface_1, av8Var), z, false, i != ((Number) joaVar.getValue()).intValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, av8Var, ((i3 << 15) & 3670016) | 3456, 3728);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zq2(i, z, function0, function02, i2);
        }
    }

    public static final void d(int i, Function0 function0, of3 of3Var, int i2) {
        av8 av8Var;
        ImageVector imageVector;
        xtc z;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1409970480);
        int i3 = (av8Var2.e(i) ? 4 : 2) | i2 | (av8Var2.i(function0) ? 32 : 16);
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            zic zicVar = xsd.c;
            boolean z2 = i == 2;
            ImageVector N = s6a.N(z2 ? R.drawable.ic_sofascore_logomark : R.drawable.ic_arrow_back, 6, av8Var2);
            long D = lz.D(R.color.n_lv_1, av8Var2);
            utc utcVar = utc.a;
            xtc l = bkh.l(utcVar, 24.0f);
            if (z2) {
                av8Var2.d0(-178849522);
                xtc b0 = l98.b0(utcVar, 2.0f);
                av8Var2.s(false);
                z = l.z(b0);
                av8Var = av8Var2;
                imageVector = N;
            } else {
                av8Var2.d0(544440911);
                boolean z3 = (i3 & 112) == 32;
                Object O = av8Var2.O();
                if (z3 || O == nf3.a) {
                    O = new ve7(29, function0);
                    av8Var2.n0(O);
                }
                av8Var = av8Var2;
                imageVector = N;
                xtc y = tol.y(utcVar, false, false, false, 0L, null, tol.u((Function0) O, av8Var2), av8Var, 29);
                av8Var.s(false);
                z = l.z(y);
            }
            kq9.b(imageVector, null, z, D, av8Var, 48, 0);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nj6(i, i2, 3, function0);
        }
    }

    public static final void e(int i, Function0 function0, of3 of3Var, int i2) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-2095105304);
        int i3 = (av8Var2.e(i) ? 4 : 2) | i2 | (av8Var2.i(function0) ? 32 : 16);
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            xtc A = wnn.A(utc.a, o7g.a(16.0f));
            boolean z = (i3 & 112) == 32;
            Object O = av8Var2.O();
            if (z || O == nf3.a) {
                O = new ve7(28, function0);
                av8Var2.n0(O);
            }
            xtc O2 = kda.O(l98.b0(tol.y(A, i != ((Number) a.getValue()).intValue(), false, false, 0L, null, tol.u((Function0) O, av8Var2), av8Var2, 30), 4.0f), "skip_button", av8Var2);
            String v = oea.v(R.string.skip, av8Var2);
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            q5a.w(v, O2, lz.D(R.color.n_lv_3, av8Var2), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.l(), av8Var, 0, 0, 131064);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nj6(i, i2, 2, function0);
        }
    }

    public static final void f(int i, int i2, of3 of3Var) {
        eqf eqfVar;
        o81 o81Var;
        Window window;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(16756177);
        int i3 = 4;
        int i4 = (av8Var.e(i) ? 4 : 2) | i2;
        if (av8Var.T(i4 & 1, (i4 & 3) != 2)) {
            Activity activity = (Activity) av8Var.k(ngb.a);
            if (activity == null || (window = activity.getWindow()) == null) {
                eqfVar = av8Var.u();
                if (eqfVar != null) {
                    o81Var = new o81(i, i2, i3);
                    eqfVar.d = o81Var;
                }
                return;
            }
            Context context = (Context) av8Var.k(nz.b);
            View view = (View) av8Var.k(nz.f);
            zic zicVar = xsd.c;
            boolean z = i == 1;
            boolean b0 = hkg.b0(context);
            if (Build.VERSION.SDK_INT >= 29) {
                window.setNavigationBarContrastEnforced(false);
            }
            Integer valueOf = Integer.valueOf(i);
            boolean i5 = av8Var.i(window) | av8Var.i(view) | av8Var.h(z) | av8Var.h(b0);
            Object O = av8Var.O();
            if (i5 || O == nf3.a) {
                esd esdVar = new esd(window, view, z, b0, null);
                av8Var.n0(esdVar);
                O = esdVar;
            }
            hz8.o(av8Var, valueOf, (Function2) O);
        } else {
            av8Var.W();
        }
        eqfVar = av8Var.u();
        if (eqfVar != null) {
            o81Var = new o81(i, i2, 5);
            eqfVar.d = o81Var;
        }
    }

    public static final void g(int i, Function0 function0, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1002895459);
        int i3 = (av8Var.e(i) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Integer valueOf = Integer.valueOf(i);
            boolean z = (i3 & 14) == 4;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new qu1(i, function0, (rq3) null, 21);
                av8Var.n0(O);
            }
            hz8.o(av8Var, valueOf, (Function2) O);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nj6(i, i2, 1, function0);
        }
    }
}
