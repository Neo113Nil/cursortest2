package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.view.View;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.model.database.DisplayType;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.pots.highestRated.POTSHighestRatedPlayersFragment;
import com.sofascore.results.referee.events.RefereeEventsFragment;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class yya implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yya(gta gtaVar, e1d e1dVar) {
        this.a = 15;
        this.c = gtaVar;
        this.b = e1dVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.c;
        Function0 function02 = (Function0) this.b;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            mha.i(6, 4, av8Var, function0, null, false);
            xtc f0 = l98.f0(n9e.q(l98.f0(bkh.d(utcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 8.0f, 2), lz.D(R.color.surface_2, av8Var), o7g.a(8.0f)), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String v = oea.v(R.string.available_for_registered_users, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            w1l.o(1.0f, true, av8Var);
            xtc A = wnn.A(l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1), o7g.a(8.0f));
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
                O2 = mce.n;
                av8Var.n0(O2);
            }
            udj.c(oea.v(R.string.user_sign_in, av8Var), l98.c0(tol.y(A, true, true, true, D, wzcVar, new p28(function02, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 27), av8Var, 0), 4.0f, 8.0f), lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131064);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.c;
        a6c a6cVar = (a6c) this.b;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            utc utcVar = utc.a;
            xtc d = bkh.d(utcVar, 1.0f);
            boolean g = av8Var.g(function1) | av8Var.g(a6cVar);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = new zbe(27, function1, a6cVar);
                av8Var.n0(O);
            }
            xtc Y = fz8.Y(l98.b0(tol.y(d, false, false, false, 0L, null, (Function0) O, av8Var, 31), 16.0f), n9a.b);
            l8g a = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, Y);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            f9g f9gVar = a6cVar.a;
            String str = f9gVar.d;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            haa.a(str, null, n9e.q(qx9.p(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.8f), lz.D(R.color.n_lv_5, av8Var), oyn.e), null, mp3.a, av8Var, 1572912, 1976);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            long D = lz.D(R.color.n_lv_1, av8Var);
            String str2 = f9gVar.b;
            yf8 yf8Var = xth.a;
            udj.c(str2, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.l(), av8Var, 0, 24960, 110586);
            udj.c(f9gVar.c, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 48, 24960, 110584);
            w1l.o(1.0f, true, av8Var);
            udj.c(f9gVar.f, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 131066);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        z69 z69Var = (z69) this.b;
        Function1 function1 = (Function1) this.c;
        of3 of3Var = (of3) obj2;
        ((Integer) obj3).getClass();
        ((r70) obj).getClass();
        ImageVector N = s6a.N(R.drawable.ic_close, 6, of3Var);
        long D = lz.D(R.color.n_lv_1, of3Var);
        long D2 = lz.D(R.color.n_lv_4, of3Var);
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            O = mz1.e(av8Var);
        }
        wzc wzcVar = (wzc) O;
        Object[] objArr = new Object[0];
        Object O2 = av8Var.O();
        if (O2 == a99Var) {
            O2 = mce.s;
            av8Var.n0(O2);
        }
        kq9.b(N, null, kda.O(tol.y(utc.a, true, true, false, D2, wzcVar, new gi(29, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), z69Var, function1), av8Var, 0), "search_end_icon", av8Var), D, av8Var, 48, 0);
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        scj scjVar = (scj) this.c;
        e1d e1dVar = (e1d) this.b;
        of3 of3Var = (of3) obj2;
        ((Integer) obj3).getClass();
        ((r70) obj).getClass();
        ImageVector N = s6a.N(R.drawable.ic_close, 6, of3Var);
        long D = lz.D(R.color.n_lv_1, of3Var);
        long D2 = lz.D(R.color.n_lv_4, of3Var);
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            O = mz1.e(av8Var);
        }
        wzc wzcVar = (wzc) O;
        Object[] objArr = new Object[0];
        Object O2 = av8Var.O();
        if (O2 == a99Var) {
            O2 = mce.q;
            av8Var.n0(O2);
        }
        kq9.b(N, null, tol.y(utc.a, true, false, true, D2, wzcVar, new gi(27, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), scjVar, e1dVar), av8Var, 0), D, av8Var, 48, 0);
        return Unit.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        z69 z69Var = (z69) this.c;
        Function0 function0 = (Function0) this.b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).h(booleanValue) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            xtc l = bkh.l(utc.a, 24.0f);
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
                O2 = mce.r;
                av8Var.n0(O2);
            }
            kq9.b(s6a.N(booleanValue ? R.drawable.ic_chevron_left : R.drawable.ic_search, 6, av8Var), null, kda.O(tol.y(l, booleanValue, true, false, D, wzcVar, new gi(28, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), z69Var, function0), av8Var, 0), "search_start_icon", av8Var), lz.D(R.color.n_lv_1, av8Var), av8Var, 48, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.b;
        Function1 function1 = (Function1) this.c;
        ((Integer) obj3).getClass();
        av8 av8Var = (av8) ((of3) obj2);
        av8Var.d0(759876635);
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            O = goh.b(function0);
            av8Var.n0(O);
        }
        cdi cdiVar = (cdi) O;
        Object O2 = av8Var.O();
        if (O2 == a99Var) {
            dnd dndVar = (dnd) cdiVar.getValue();
            long j = dndVar.a;
            O2 = new q50(dndVar, g3h.b, new dnd(g3h.c), 8);
            av8Var.n0(O2);
        }
        q50 q50Var = (q50) O2;
        Unit unit = Unit.a;
        boolean i = av8Var.i(q50Var);
        Object O3 = av8Var.O();
        if (i || O3 == a99Var) {
            O3 = new v1f(cdiVar, q50Var, (rq3) null, 18);
            av8Var.n0(O3);
        }
        hz8.o(av8Var, unit, (Function2) O3);
        d80 d80Var = q50Var.c;
        boolean g = av8Var.g(d80Var);
        Object O4 = av8Var.O();
        if (g || O4 == a99Var) {
            O4 = new m56(d80Var, 2);
            av8Var.n0(O4);
        }
        xtc xtcVar = (xtc) function1.invoke((Function0) O4);
        av8Var.s(false);
        return xtcVar;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        long j;
        tt2 tt2Var = (tt2) this.c;
        Function0 function0 = (Function0) this.b;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            for (ut2 ut2Var : tt2Var.a) {
                boolean c = Intrinsics.c(ut2Var.a, tt2Var.b);
                if (c) {
                    j = ljg.f(av8Var, 1098946223, R.color.surface_2, av8Var, false);
                } else {
                    av8Var.d0(1098947021);
                    av8Var.s(false);
                    j = r13.i;
                }
                xtc q = n9e.q(utc.a, j, oyn.e);
                t3e B = l98.B(16.0f, 2);
                tc3 H = yqo.H(-1382361646, av8Var, new m81(ut2Var, c, 13));
                boolean h = av8Var.h(c) | av8Var.g(tt2Var) | av8Var.g(ut2Var) | av8Var.g(function0);
                Object O = av8Var.O();
                if (h || O == nf3.a) {
                    b93 b93Var = new b93(c, tt2Var, ut2Var, function0, 4);
                    av8Var.n0(b93Var);
                    O = b93Var;
                }
                u10.b(H, (Function0) O, q, null, false, null, B, null, av8Var, 12582918, 376);
            }
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        fv fvVar = (fv) this.c;
        iuh iuhVar = (iuh) this.b;
        ((Integer) obj3).getClass();
        ((r70) obj).getClass();
        av8 av8Var = (av8) ((of3) obj2);
        boolean i = av8Var.i(iuhVar);
        Object O = av8Var.O();
        if (i || O == nf3.a) {
            O = new e6g(iuhVar, 26);
            av8Var.n0(O);
        }
        g7a.i(fvVar, (Function0) O, l98.c0(utc.a, 8.0f, 4.0f), av8Var, 0);
        return Unit.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        Spannable spannable = (Spannable) this.c;
        jw5 jw5Var = (jw5) this.b;
        pwh pwhVar = (pwh) obj;
        int intValue = ((Integer) obj2).intValue();
        int intValue2 = ((Integer) obj3).intValue();
        tf8 tf8Var = pwhVar.f;
        wg8 wg8Var = pwhVar.c;
        if (wg8Var == null) {
            wg8Var = wg8.g;
        }
        rg8 rg8Var = pwhVar.d;
        int i = rg8Var != null ? rg8Var.a : 0;
        sg8 sg8Var = pwhVar.e;
        int i2 = sg8Var != null ? sg8Var.a : 65535;
        a20 a20Var = (a20) jw5Var.b;
        i6k c = ((vf8) a20Var.e).c(tf8Var, wg8Var, i, i2);
        if (c instanceof h6k) {
            Object obj4 = ((h6k) c).a;
            obj4.getClass();
            typeface = (Typeface) obj4;
        } else {
            sx2 sx2Var = new sx2(c, a20Var.j);
            a20Var.j = sx2Var;
            Object obj5 = sx2Var.c;
            obj5.getClass();
            typeface = (Typeface) obj5;
        }
        spannable.setSpan(new xf8(typeface, 1), intValue, intValue2, 33);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x0736, code lost:
    
        if (r3 != false) goto L230;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ct8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d7e c;
        float f;
        boolean z;
        av8 av8Var;
        int i = this.a;
        bqh bqhVar = null;
        utc utcVar = utc.a;
        a99 a99Var = nf3.a;
        Object[] objArr = 0;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj5;
                xtc xtcVar = (xtc) obj4;
                xpa xpaVar = (xpa) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 19) != 18)) {
                    boolean g = av8Var2.g(function1);
                    Object O = av8Var2.O();
                    if (g || O == a99Var) {
                        O = new l77(25, function1);
                        av8Var2.n0(O);
                    }
                    aza.e(0, av8Var2, l98.d0(xpa.a(xpaVar, xtcVar, 7), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), (Function0) O);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 1:
                bza bzaVar = (bza) obj5;
                xtc xtcVar2 = (xtc) obj4;
                xpa xpaVar2 = (xpa) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                xpaVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xpaVar2) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var2;
                if (av8Var3.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    aza.d(bzaVar.j, xpa.a(xpaVar2, xtcVar2, 7), av8Var3, 0);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 2:
                u8b u8bVar = (u8b) obj4;
                Function1 function12 = (Function1) obj5;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var4 = (av8) of3Var3;
                if (av8Var4.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    j6c j6cVar = u8bVar.o;
                    boolean g2 = av8Var4.g(u8bVar) | av8Var4.g(function12);
                    Object O2 = av8Var4.O();
                    if (g2 || O2 == a99Var) {
                        O2 = new t8b(u8bVar, function12);
                        av8Var4.n0(O2);
                    }
                    cae.c(j6cVar, (Function0) O2, av8Var4, 0);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 3:
                Integer num = (Integer) obj5;
                String str = (String) obj4;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var5 = (av8) of3Var4;
                if (av8Var5.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (num != null) {
                        av8Var5.d0(-1252955731);
                        c = i9a.C(num.intValue(), av8Var5);
                        av8Var5.s(false);
                    } else if (str != null) {
                        av8Var5.d0(-1252953193);
                        c = i9a.A(str, av8Var5);
                        av8Var5.s(false);
                    } else {
                        av8Var5.d0(-1252951192);
                        c = wv8.c(lz.D(R.color.neutral_default, av8Var5), 5, haa.t(R.drawable.team_logo_placeholder, 0, av8Var5), 12);
                        av8Var5.s(false);
                    }
                    wkn.k(c, null, l98.b0(bkh.l(utcVar, 20.0f), 2.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var5, 440, 120);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 4:
                String str2 = (String) obj5;
                ImageVector imageVector = (ImageVector) obj4;
                s22 s22Var = (s22) obj;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                s22Var.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((av8) of3Var5).g(s22Var) ? 4 : 2;
                }
                av8 av8Var6 = (av8) of3Var5;
                if (av8Var6.T(intValue5 & 1, (intValue5 & 19) != 18)) {
                    kx4 kx4Var = (kx4) av8Var6.k(dh3.h);
                    jej Q = h5a.Q(0, 0, 1, av8Var6);
                    yf8 yf8Var = xth.a;
                    dfj k = xth.k();
                    long j = jej.a(Q, str2, xth.k(), 1020).c;
                    float C0 = kx4Var.C0((int) (j >> 32));
                    float C02 = kx4Var.C0((int) (j & 4294967295L)) / 2.0f;
                    float f2 = imageVector != null ? 20.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    float c2 = ((s22Var.c() - (C02 * 2.0f)) - 32.0f) - f2;
                    float f3 = p75.a(C0, c2) > 0 ? c2 + 32.0f + f2 : C0 + 32.0f + f2;
                    lv1 lv1Var = uxf.m;
                    xtc Y = fz8.Y(utcVar, n9a.b);
                    l8g a = k8g.a(ww9.b, lv1Var, av8Var6, 48);
                    int hashCode = Long.hashCode(av8Var6.T);
                    aee m = av8Var6.m();
                    xtc C = fqj.C(av8Var6, Y);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var6.h0();
                    if (av8Var6.S) {
                        av8Var6.l(zg3Var);
                    } else {
                        av8Var6.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var6, a, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var6, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var6, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var6, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var6, C, f50Var3);
                    p8g p8gVar = p8g.a;
                    i2a.a(true, false, bkh.c(p8gVar.a(1.0f, utcVar, true), 1.0f), 0L, av8Var6, 54);
                    float f4 = f3;
                    ng0 ng0Var = new ng0(4.0f, true, new l1(uxf.p, 5));
                    xtc p = bkh.p(utcVar, f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f4);
                    l8g a2 = k8g.a(ng0Var, lv1Var, av8Var6, 54);
                    int hashCode2 = Long.hashCode(av8Var6.T);
                    aee m2 = av8Var6.m();
                    xtc C2 = fqj.C(av8Var6, p);
                    av8Var6.h0();
                    if (av8Var6.S) {
                        av8Var6.l(zg3Var);
                    } else {
                        av8Var6.q0();
                    }
                    waa.K(av8Var6, a2, f50Var);
                    waa.K(av8Var6, m2, ff3Var);
                    bf3.s(hashCode2, av8Var6, f50Var2, av8Var6, ryVar);
                    waa.K(av8Var6, C2, f50Var3);
                    udj.c(str2, p8gVar.a(1.0f, utcVar, false), lz.D(R.color.n_lv_1, av8Var6), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, k, av8Var6, 0, 24960, 109560);
                    if (imageVector == null) {
                        av8Var6.d0(428503760);
                        av8Var6.s(false);
                    } else {
                        av8Var6.d0(428503761);
                        kq9.b(imageVector, null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var6), av8Var6, 432, 0);
                        Unit unit = Unit.a;
                        av8Var6.s(false);
                    }
                    av8Var6.s(true);
                    i2a.a(false, true, bkh.c(p8gVar.a(1.0f, utcVar, true), 1.0f), 0L, av8Var6, 54);
                    av8Var6.s(true);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 5:
                byb bybVar = (byb) obj4;
                Function1 function13 = (Function1) obj5;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var7 = (av8) of3Var6;
                if (av8Var7.T(intValue6 & 1, (intValue6 & 17) != 16)) {
                    xtc c0 = l98.c0(fz8.Y(bkh.d(utcVar, 1.0f), n9a.a), 8.0f, 16.0f);
                    l8g a3 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var7, 6);
                    int hashCode3 = Long.hashCode(av8Var7.T);
                    aee m3 = av8Var7.m();
                    xtc C3 = fqj.C(av8Var7, c0);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var7.h0();
                    if (av8Var7.S) {
                        av8Var7.l(zg3Var2);
                    } else {
                        av8Var7.q0();
                    }
                    waa.K(av8Var7, a3, hf3.g);
                    waa.K(av8Var7, m3, hf3.f);
                    waa.K(av8Var7, Integer.valueOf(hashCode3), hf3.j);
                    waa.J(av8Var7, hf3.k);
                    waa.K(av8Var7, C3, hf3.d);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    String v = oea.v(R.string.default_view, av8Var7);
                    String v2 = oea.v(R.string.default_view_body, av8Var7);
                    ImageVector N = s6a.N(R.drawable.ic_list_view, 6, av8Var7);
                    boolean z2 = bybVar.a == DisplayType.DEFAULT;
                    boolean g3 = av8Var7.g(function13);
                    Object O3 = av8Var7.O();
                    if (g3 || O3 == a99Var) {
                        O3 = new l77(28, function13);
                        av8Var7.n0(O3);
                    }
                    wnn.v(0, av8Var7, goaVar, N, v, v2, (Function0) O3, z2);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    goa goaVar2 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    String v3 = oea.v(R.string.chronological_view, av8Var7);
                    String v4 = oea.v(R.string.chronological_view_body, av8Var7);
                    ImageVector N2 = s6a.N(R.drawable.ic_access_time, 6, av8Var7);
                    boolean z3 = bybVar.a == DisplayType.CHRONOLOGICAL;
                    boolean g4 = av8Var7.g(function13);
                    Object O4 = av8Var7.O();
                    if (g4 || O4 == a99Var) {
                        O4 = new l77(29, function13);
                        av8Var7.n0(O4);
                    }
                    wnn.v(0, av8Var7, goaVar2, N2, v3, v4, (Function0) O4, z3);
                    av8Var7.s(true);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 6:
                m1c m1cVar = (m1c) obj;
                g1c g1cVar = (g1c) obj2;
                m1cVar.getClass();
                g1cVar.getClass();
                qhe J = g1cVar.J(((an3) obj3).a);
                ((xnh) obj5).i(J.b);
                int b = wzb.b(((xnh) obj4).h());
                int i2 = J.b + b;
                if (i2 < 0) {
                    i2 = 0;
                }
                return m1c.G0(m1cVar, J.a, i2, new ja(J, b, 2));
            case 7:
                osa osaVar = (osa) obj5;
                POTSHighestRatedPlayersFragment pOTSHighestRatedPlayersFragment = (POTSHighestRatedPlayersFragment) obj4;
                q1e q1eVar = (q1e) obj;
                of3 of3Var7 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                q1eVar.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= (intValue7 & 8) == 0 ? ((av8) of3Var7).g(q1eVar) : ((av8) of3Var7).i(q1eVar) ? 4 : 2;
                }
                av8 av8Var8 = (av8) of3Var7;
                if (av8Var8.T(intValue7 & 1, (intValue7 & 19) != 18)) {
                    boolean i3 = av8Var8.i(pOTSHighestRatedPlayersFragment);
                    Object O5 = av8Var8.O();
                    if (i3 || O5 == a99Var) {
                        O5 = new mnc(pOTSHighestRatedPlayersFragment, 22);
                        av8Var8.n0(O5);
                    }
                    xw3.l(q1eVar, osaVar, (Function1) O5, av8Var8, (intValue7 & 14) | 64);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
            case 8:
                a6e a6eVar = (a6e) obj5;
                ema emaVar = (ema) obj4;
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                float floatValue3 = ((Float) obj3).floatValue();
                boolean G = y6a.G(a6eVar, floatValue);
                if (a6eVar.m().e != ewd.a && emaVar != ema.a) {
                    G = !G;
                }
                int i4 = a6eVar.m().b;
                float z4 = i4 == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : y6a.z(a6eVar) / i4;
                float f5 = z4 - ((int) z4);
                char c3 = Math.abs(floatValue) < a6eVar.n.H0(400.0f) ? (char) 0 : floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (char) 1 : (char) 2;
                if (c3 != 0) {
                    if (c3 != 1) {
                        if (c3 != 2) {
                            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        f = floatValue2;
                    }
                    f = floatValue3;
                } else if (Math.abs(f5) <= 0.5f) {
                    float abs = Math.abs(z4);
                    kx4 kx4Var2 = a6eVar.n;
                    b6e b6eVar = c6e.a;
                    if (abs < Math.abs(Math.min(kx4Var2.H0(56.0f), a6eVar.o() / 2.0f) / a6eVar.o())) {
                        f = floatValue3;
                        break;
                    } else {
                        f = floatValue3;
                    }
                }
                return Float.valueOf(f);
            case 9:
                ox1 ox1Var = (ox1) obj5;
                e1d e1dVar = (e1d) obj4;
                of3 of3Var8 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                xtc x = gz8.x(utcVar, s02.h0(300, 0, jg5.a, 2), null, 2);
                String v5 = oea.v(((Boolean) e1dVar.getValue()).booleanValue() ? R.string.reorder : R.string.done, of3Var8);
                dib c4 = pie.a.P().c();
                if (v5.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    char charAt = v5.charAt(0);
                    sb.append((Object) (Character.isLowerCase(charAt) ? CharsKt.c(charAt, c4.a) : String.valueOf(charAt)));
                    sb.append(v5.substring(1));
                    v5 = sb.toString();
                }
                String str3 = v5;
                if (((Boolean) e1dVar.getValue()).booleanValue()) {
                    av8Var = (av8) of3Var8;
                    av8Var.d0(-58582192);
                    bqhVar = new bqh(s6a.N(R.drawable.ic_reorder_2_16, 6, av8Var), uxf.q);
                    z = false;
                } else {
                    z = false;
                    av8Var = (av8) of3Var8;
                    av8Var.d0(-1815931360);
                }
                av8Var.s(z);
                bqh bqhVar2 = bqhVar;
                av8 av8Var9 = (av8) of3Var8;
                boolean g5 = av8Var9.g(ox1Var);
                Object O6 = av8Var9.O();
                if (g5 || O6 == a99Var) {
                    O6 = new zbe(1, ox1Var, e1dVar);
                    av8Var9.n0(O6);
                }
                mha.h(str3, (Function0) O6, x, tqh.a, bqhVar2, false, false, false, 0L, 0, 0, av8Var9, 3072, 0, 2016);
                return Unit.a;
            case 10:
                int intValue8 = ((Integer) obj2).intValue();
                xoe xoeVar = (xoe) obj3;
                ((View) obj).getClass();
                xoeVar.getClass();
                ((zoe) obj5).l(intValue8);
                ((gpe) obj4).invoke(xoeVar);
                return Unit.a;
            case 11:
                cpe cpeVar = (cpe) obj5;
                xoe xoeVar2 = (xoe) obj4;
                of3 of3Var9 = (of3) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var10 = (av8) of3Var9;
                if (av8Var10.T(intValue9 & 1, (intValue9 & 17) != 16)) {
                    cpeVar.j(xoeVar2, av8Var10, 0);
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 12:
                zqe zqeVar = (zqe) obj5;
                Context context = (Context) obj4;
                xpa xpaVar3 = (xpa) obj;
                of3 of3Var10 = (of3) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                xpaVar3.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((av8) of3Var10).g(xpaVar3) ? 4 : 2;
                }
                av8 av8Var11 = (av8) of3Var10;
                if (av8Var11.T(intValue10 & 1, (intValue10 & 19) != 18)) {
                    mv1 mv1Var = uxf.h;
                    xtc c02 = l98.c0(n9e.q(l98.d0(bkh.d(xpa.a(xpaVar3, utcVar, 7), 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var11), oyn.e), 14.0f, 2.0f);
                    k1c c5 = e12.c(mv1Var, false);
                    int hashCode4 = Long.hashCode(av8Var11.T);
                    aee m4 = av8Var11.m();
                    xtc C4 = fqj.C(av8Var11, c02);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var11.h0();
                    if (av8Var11.S) {
                        av8Var11.l(zg3Var3);
                    } else {
                        av8Var11.q0();
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var11, c5, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var11, m4, ff3Var2);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    f50 f50Var5 = hf3.j;
                    waa.K(av8Var11, valueOf2, f50Var5);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var11, ryVar2);
                    f50 f50Var6 = hf3.d;
                    waa.K(av8Var11, C4, f50Var6);
                    lv1 lv1Var2 = uxf.m;
                    xtc A = wnn.A(utcVar, o7g.a(4.0f));
                    boolean z5 = zqeVar.b;
                    boolean i5 = av8Var11.i(context);
                    Object O7 = av8Var11.O();
                    if (i5 || O7 == a99Var) {
                        O7 = new nzd(context, 8);
                        av8Var11.n0(O7);
                    }
                    xtc b0 = l98.b0(tol.y(A, z5, false, false, 0L, null, (Function0) O7, av8Var11, 30), 2.0f);
                    l8g a4 = k8g.a(ww9.b, lv1Var2, av8Var11, 48);
                    int hashCode5 = Long.hashCode(av8Var11.T);
                    aee m5 = av8Var11.m();
                    xtc C5 = fqj.C(av8Var11, b0);
                    av8Var11.h0();
                    if (av8Var11.S) {
                        av8Var11.l(zg3Var3);
                    } else {
                        av8Var11.q0();
                    }
                    waa.K(av8Var11, a4, f50Var4);
                    waa.K(av8Var11, m5, ff3Var2);
                    bf3.s(hashCode5, av8Var11, f50Var5, av8Var11, ryVar2);
                    waa.K(av8Var11, C5, f50Var6);
                    String upperCase = zqeVar.a.a(av8Var11).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    long D = lz.D(R.color.n_lv_3, av8Var11);
                    yf8 yf8Var2 = xth.a;
                    udj.c(upperCase, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var11, 0, 24960, 110586);
                    if (zqeVar.b) {
                        ljg.r(4.0f, 1645653686, av8Var11, av8Var11, utcVar);
                        kq9.b(s6a.N(R.drawable.ic_info, 6, av8Var11), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var11), av8Var11, 432, 0);
                        av8Var11.s(false);
                    } else {
                        av8Var11.d0(1646195690);
                        av8Var11.s(false);
                    }
                    av8Var11.s(true);
                    av8Var11.s(true);
                } else {
                    av8Var11.W();
                }
                return Unit.a;
            case 13:
                Function1 function14 = (Function1) obj5;
                w3f w3fVar = (w3f) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var11 = (of3) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((av8) of3Var11).h(booleanValue) ? 4 : 2;
                }
                av8 av8Var12 = (av8) of3Var11;
                if (!av8Var12.T(intValue11 & 1, (intValue11 & 19) != 18)) {
                    av8Var12.W();
                } else if (booleanValue) {
                    av8Var12.d0(-347488271);
                    l8g a5 = k8g.a(ww9.b, uxf.m, av8Var12, 48);
                    int hashCode6 = Long.hashCode(av8Var12.T);
                    aee m6 = av8Var12.m();
                    utc utcVar2 = utc.a;
                    xtc C6 = fqj.C(av8Var12, utcVar2);
                    if3.k7.getClass();
                    zg3 zg3Var4 = hf3.b;
                    av8Var12.h0();
                    if (av8Var12.S) {
                        av8Var12.l(zg3Var4);
                    } else {
                        av8Var12.q0();
                    }
                    waa.K(av8Var12, a5, hf3.g);
                    waa.K(av8Var12, m6, hf3.f);
                    waa.K(av8Var12, Integer.valueOf(hashCode6), hf3.j);
                    waa.J(av8Var12, hf3.k);
                    waa.K(av8Var12, C6, hf3.d);
                    long D2 = lz.D(R.color.n_lv_4, av8Var12);
                    Object O8 = av8Var12.O();
                    if (O8 == a99Var) {
                        O8 = mz1.e(av8Var12);
                    }
                    wzc wzcVar = (wzc) O8;
                    Object[] objArr2 = new Object[0];
                    Object O9 = av8Var12.O();
                    if (O9 == a99Var) {
                        O9 = mce.g;
                        av8Var12.n0(O9);
                    }
                    kq9.b(s6a.N(R.drawable.ic_edit, 6, av8Var12), oea.v(R.string.change_vote_button, av8Var12), tol.y(utcVar2, true, false, true, D2, wzcVar, new gi(24, (boh) o3a.N(objArr2, (Function0) O9, av8Var12, 48), function14, w3fVar), av8Var12, 0), lz.D(R.color.primary_default, av8Var12), av8Var12, 0, 0);
                    tz9.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 14, 0L, 0L, av8Var12, l98.d0(bkh.e(utcVar2, 18.0f), 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2));
                    av8Var12.s(true);
                    av8Var12.s(false);
                } else {
                    av8Var12.d0(-346619527);
                    av8Var12.s(false);
                }
                return Unit.a;
            case 14:
                pi5 pi5Var = (pi5) obj5;
                Context context2 = (Context) obj4;
                of3 of3Var12 = (of3) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var13 = (av8) of3Var12;
                if (av8Var13.T(intValue12 & 1, (intValue12 & 17) != 16)) {
                    si5 si5Var = pi5Var.d;
                    boolean i6 = av8Var13.i(context2);
                    Object O10 = av8Var13.O();
                    if (i6 || O10 == a99Var) {
                        O10 = new k9f(context2, objArr == true ? 1 : 0);
                        av8Var13.n0(O10);
                    }
                    u6h.x(si5Var, (Function0) O10, l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), av8Var13, 384);
                } else {
                    av8Var13.W();
                }
                return Unit.a;
            case 15:
                gta gtaVar = (gta) obj5;
                cdi cdiVar = (cdi) obj4;
                of3 of3Var13 = (of3) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var14 = (av8) of3Var13;
                if (av8Var14.T(intValue13 & 1, (intValue13 & 17) != 16)) {
                    m6k.o((pbf) cdiVar.getValue(), gtaVar, av8Var14, 0);
                } else {
                    av8Var14.W();
                }
                return Unit.a;
            case 16:
                gta gtaVar2 = (gta) obj5;
                pbf pbfVar = (pbf) obj4;
                of3 of3Var14 = (of3) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var15 = (av8) of3Var14;
                if (av8Var15.T(intValue14 & 1, (intValue14 & 17) != 16)) {
                    kda.g(gtaVar2, l6g.W(CollectionsKt.L0(((obf) pbfVar).a, 3)), null, av8Var15, 0);
                } else {
                    av8Var15.W();
                }
                return Unit.a;
            case 17:
                RefereeEventsFragment refereeEventsFragment = (RefereeEventsFragment) obj5;
                b7e b7eVar = (b7e) obj4;
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof y21) {
                    wxf wxfVar = EventActivity.h0;
                    Context requireContext = refereeEventsFragment.requireContext();
                    requireContext.getClass();
                    wxf.B(requireContext, ((y21) obj3).d().getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                } else if (obj3 instanceof lrj) {
                    a99 a99Var2 = LeagueActivity.h0;
                    Context context3 = b7eVar.b;
                    Tournament tournament = ((lrj) obj3).a;
                    UniqueTournament uniqueTournament = tournament.getUniqueTournament();
                    a99.A(a99Var2, context3, uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null, Integer.valueOf(tournament.getId()), null, null, null, null, 4088);
                }
                return Unit.a;
            case 18:
                return a(obj, obj2, obj3);
            case 19:
                ujg ujgVar = (ujg) obj4;
                int intValue15 = ((Integer) obj).intValue();
                String str4 = (String) obj2;
                b8d b8dVar = (b8d) obj3;
                str4.getClass();
                b8dVar.getClass();
                Object obj6 = ((Map) obj5).get(str4);
                obj6.getClass();
                List list = (List) obj6;
                int ordinal = (((b8dVar instanceof i13) || ((KSerializer) ujgVar.b).getDescriptor().i(intValue15)) ? w7g.b : w7g.a).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        zzl.b();
                        return null;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ujgVar.C(str4, (String) it.next());
                    }
                } else {
                    if (list.size() != 1) {
                        StringBuilder q = wt3.q("Expected one value for argument ", str4, ", found ");
                        q.append(list.size());
                        q.append("values instead.");
                        throw new IllegalArgumentException(q.toString().toString());
                    }
                    ujgVar.d = ((String) ujgVar.d) + '/' + ((String) CollectionsKt.Y(list));
                }
                return Unit.a;
            case 20:
                return b(obj, obj2, obj3);
            case 21:
                return c(obj, obj2, obj3);
            case 22:
                return d(obj, obj2, obj3);
            case 23:
                return e(obj, obj2, obj3);
            case 24:
                of3 of3Var15 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                uni.a(null, null, lz.D(R.color.surface_1, of3Var15), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, null, yqo.H(-1240693782, of3Var15, new gme(27, (gyg) obj4, (Function1) obj5)), of3Var15, 12779520, 91);
                return Unit.a;
            case 25:
                return f(obj, obj2, obj3);
            case 26:
                return g(obj, obj2, obj3);
            case 27:
                return h(obj, obj2, obj3);
            case 28:
                return i(obj, obj2, obj3);
            default:
                Context context4 = (Context) obj5;
                f6i f6iVar = (f6i) obj4;
                of3 of3Var16 = (of3) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var16 = (av8) of3Var16;
                if (av8Var16.T(intValue16 & 1, (intValue16 & 17) != 16)) {
                    xtc c03 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
                    String f6 = rld.f(context4, Intrinsics.c(f6iVar.d.e, Boolean.TRUE));
                    yf8 yf8Var3 = xth.a;
                    udj.c(f6, c03, lz.D(R.color.n_lv_3, av8Var16), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var16, 48, 0, 130040);
                } else {
                    av8Var16.W();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ yya(int i, Object obj, Function1 function1) {
        this.a = i;
        this.b = obj;
        this.c = function1;
    }

    public /* synthetic */ yya(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
