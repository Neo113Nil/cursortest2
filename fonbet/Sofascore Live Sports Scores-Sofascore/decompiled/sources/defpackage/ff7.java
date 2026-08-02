package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import android.text.SpannedString;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.appsflyer.internal.i;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.Sports;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.sofascore.results.fantasy.onboarding.steps.FantasyOnboardingStepsNavigation;
import com.sofascore.results.fantasy.onboarding.steps.f;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ff7 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ff7(kae kaeVar, h0a h0aVar, Context context, Gender gender, e1d e1dVar) {
        this.a = 12;
        this.e = kaeVar;
        this.b = h0aVar;
        this.c = context;
        this.f = gender;
        this.d = e1dVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        av8 av8Var;
        kae kaeVar = (kae) this.e;
        h0a h0aVar = (h0a) this.b;
        oz9 oz9Var = h0aVar.m;
        Context context = (Context) this.c;
        Gender gender = (Gender) this.f;
        e1d e1dVar = (e1d) this.d;
        of3 of3Var = (of3) obj2;
        ((Integer) obj3).getClass();
        ((r70) obj).getClass();
        u23 a = t23.a(ww9.d, uxf.p, of3Var, 48);
        av8 av8Var2 = (av8) of3Var;
        int hashCode = Long.hashCode(av8Var2.T);
        aee m = av8Var2.m();
        utc utcVar = utc.a;
        xtc C = fqj.C(of3Var, utcVar);
        if3.k7.getClass();
        zg3 zg3Var = hf3.b;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.h0();
        if (av8Var3.S) {
            av8Var3.l(zg3Var);
        } else {
            av8Var3.q0();
        }
        waa.K(of3Var, a, hf3.g);
        waa.K(of3Var, m, hf3.f);
        waa.K(of3Var, Integer.valueOf(hashCode), hf3.j);
        waa.J(of3Var, hf3.k);
        waa.K(of3Var, C, hf3.d);
        xtc B = wnn.B(bkh.d(utcVar, 1.0f));
        boolean i = av8Var3.i(kaeVar);
        Object O = av8Var3.O();
        a99 a99Var = nf3.a;
        if (i || O == a99Var) {
            O = new uf8(9, kaeVar, e1dVar);
            av8Var3.n0(O);
        }
        Function1 function1 = (Function1) O;
        Object O2 = av8Var3.O();
        if (O2 == a99Var) {
            O2 = new yo9(11);
            av8Var3.n0(O2);
        }
        td4.a(function1, B, (Function1) O2, of3Var, 432, 0);
        if (oz9Var != null) {
            av8Var3.d0(59909968);
            nq8.h(of3Var, bkh.e(utcVar, 8.0f));
            String v = oea.v(oz9Var.a, of3Var);
            bqh bqhVar = new bqh(s6a.N(R.drawable.ic_chevron_right_large_16, 6, of3Var), uxf.q);
            boolean i2 = av8Var3.i(context) | av8Var3.g(h0aVar) | av8Var3.i(kaeVar) | av8Var3.e(gender == null ? -1 : gender.ordinal());
            Object O3 = av8Var3.O();
            if (i2 || O3 == a99Var) {
                m61 m61Var = new m61(context, h0aVar, kaeVar, gender, 10);
                av8Var3.n0(m61Var);
                O3 = m61Var;
            }
            av8Var = av8Var3;
            mha.h(v, (Function0) O3, null, rqh.a, bqhVar, false, false, false, 0L, 0, 0, of3Var, 3072, 0, IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED);
            nq8.h(of3Var, bkh.e(utcVar, 8.0f));
            av8Var.s(false);
        } else {
            av8Var = av8Var3;
            av8Var.d0(62037622);
            av8Var.s(false);
        }
        av8Var.s(true);
        return Unit.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        long j;
        gv9<oxh> gv9Var = (gv9) this.e;
        oxh oxhVar = (oxh) this.f;
        Function1 function1 = (Function1) this.b;
        uxh uxhVar = (uxh) this.c;
        e1d e1dVar = (e1d) this.d;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        int i = 1;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            for (oxh oxhVar2 : gv9Var) {
                boolean c = Intrinsics.c(oxhVar2.a, oxhVar != null ? oxhVar.a : null);
                av8Var.d0(-1337561612);
                if (c) {
                    j = ljg.f(av8Var, 2073451835, R.color.surface_2, av8Var, false);
                } else {
                    av8Var.d0(2073452633);
                    av8Var.s(false);
                    j = r13.i;
                }
                jf9 jf9Var = oyn.e;
                utc utcVar = utc.a;
                xtc q = n9e.q(utcVar, j, jf9Var);
                if (oxhVar2.h) {
                    q = q.z(td4.Z(utcVar, new yz(lz.D(R.color.n_lv_4, av8Var), i)));
                }
                xtc xtcVar = q;
                av8Var.s(false);
                t3e t3eVar = new t3e(8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                hdd hddVar = !oxhVar2.g ? new hdd() : null;
                tc3 H = yqo.H(1032099294, av8Var, new t60(oxhVar2, uxhVar, c));
                boolean g = av8Var.g(oxhVar2) | av8Var.h(c) | av8Var.h(false) | av8Var.g(function1);
                Object O = av8Var.O();
                if (g || O == nf3.a) {
                    O = new b93(oxhVar2, c, function1, e1dVar);
                    av8Var.n0(O);
                }
                u10.b(H, (Function0) O, xtcVar, null, false, null, t3eVar, hddVar, av8Var, 6, 120);
            }
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v68 */
    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        kv1 kv1Var;
        boolean z;
        int i;
        int i2;
        int i3;
        float f;
        Iterator it;
        boolean z2;
        int i4 = this.a;
        utc utcVar = utc.a;
        Object obj4 = nf3.a;
        int i5 = 6;
        Object obj5 = this.b;
        Object obj6 = this.c;
        Object obj7 = this.f;
        Object obj8 = this.d;
        Object obj9 = this.e;
        switch (i4) {
            case 0:
                ksa ksaVar = (ksa) obj9;
                Function1 function1 = (Function1) obj5;
                gf7 gf7Var = (gf7) obj7;
                Context context = (Context) obj6;
                cdi cdiVar = (cdi) obj8;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).h(booleanValue) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (!av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    av8Var.W();
                } else if (booleanValue) {
                    av8Var.d0(956544558);
                    s6a.f(36.0f, 4.0f, 432, 56, 0L, 0L, av8Var, hkg.u0(bkh.c, hkg.o0(av8Var), false, 14));
                    av8Var.s(false);
                } else {
                    av8Var.d0(956920433);
                    g28 g28Var = bkh.c;
                    t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 40.0f, 7);
                    boolean g = av8Var.g(function1) | av8Var.i(gf7Var) | av8Var.i(context);
                    Object O = av8Var.O();
                    if (g || O == obj4) {
                        O = new l50(gf7Var, function1, cdiVar, context);
                        av8Var.n0(O);
                    }
                    v8a.a(g28Var, ksaVar, C, null, null, null, false, null, (Function1) O, av8Var, 390, PglCryptUtils.BASE64_FAILED);
                    av8Var.s(false);
                }
                return Unit.a;
            case 1:
                ao7 ao7Var = (ao7) obj9;
                Function1 function12 = (Function1) obj5;
                Function0 function0 = (Function0) obj7;
                Context context2 = (Context) obj6;
                cdi cdiVar2 = (cdi) obj8;
                p3e p3eVar = (p3e) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                kg0 kg0Var = ww9.f;
                p3eVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(p3eVar) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    png pngVar = new png(8.0f, uxf.l);
                    float a = p3eVar.a();
                    utc utcVar2 = utc.a;
                    xtc f0 = l98.f0(hkg.u0(l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a, 7).z(bkh.c), u0a.J(av8Var2), false, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5);
                    kv1 kv1Var2 = uxf.o;
                    u23 a2 = t23.a(pngVar, kv1Var2, av8Var2, 6);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var2, a2, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var2, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C2, f50Var3);
                    if (ao7Var.x != FantasyCompetitionType.WEEKLY) {
                        av8Var2.d0(-160953370);
                        kv1Var = kv1Var2;
                        fqj.l(((vn7) cdiVar2.getValue()).d, ((vn7) cdiVar2.getValue()).l, ((vn7) cdiVar2.getValue()).c, l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var2, 3072);
                        av8Var2 = av8Var2;
                        av8Var2.s(false);
                    } else {
                        kv1Var = kv1Var2;
                        av8Var2.d0(-160675207);
                        av8Var2.s(false);
                    }
                    o1j.f(((vn7) cdiVar2.getValue()).a.a, l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var2, 48);
                    if (((vn7) cdiVar2.getValue()).a.e || ((vn7) cdiVar2.getValue()).a.f) {
                        av8Var2.d0(-160414342);
                        if (((vn7) cdiVar2.getValue()).a.f) {
                            i = 271922404;
                            i2 = R.string.fantasy_quick_fix_active_info;
                            z = false;
                        } else {
                            z = false;
                            i = 271925224;
                            i2 = R.string.fantasy_rebuild_squad_active_info;
                        }
                        String k = ljg.k(av8Var2, i, i2, av8Var2, z);
                        i3 = 6;
                        f = 8.0f;
                        m6k.h(384, 24, av8Var2, l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), s6a.N(R.drawable.ic_team, 6, av8Var2), k, null, false);
                        av8Var2.s(z);
                    } else {
                        av8Var2.d0(-159923271);
                        av8Var2.s(false);
                        i3 = 6;
                        f = 8.0f;
                    }
                    ng0 ng0Var = new ng0(f, true, new a70(i3));
                    xtc d0 = l98.d0(gz8.x(bkh.d(utcVar2, 1.0f), null, null, 3), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    u23 a3 = t23.a(ng0Var, kv1Var, av8Var2, 6);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C3 = fqj.C(av8Var2, d0);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a3, f50Var);
                    waa.K(av8Var2, m2, ff3Var);
                    bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C3, f50Var3);
                    av8Var2.d0(547984510);
                    Iterator it2 = ((vn7) cdiVar2.getValue()).m.iterator();
                    int i6 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            b.q();
                            throw null;
                        }
                        yn7 yn7Var = (yn7) next;
                        if (yn7Var instanceof wn7) {
                            av8Var2.d0(1195969515);
                            int i8 = yn7Var.a;
                            int i9 = ((wn7) yn7Var).b;
                            d2a.i(oea.t(i8, i9, new Object[]{Integer.valueOf(i9)}, av8Var2), null, 0L, kg0Var, av8Var2, 3072, 6);
                            av8Var2.s(false);
                            it = it2;
                        } else {
                            if (!(yn7Var instanceof xn7)) {
                                throw dmi.h(av8Var2, 1195967983, false);
                            }
                            av8Var2.d0(1195975742);
                            int i10 = yn7Var.a;
                            xn7 xn7Var = (xn7) yn7Var;
                            Object[] objArr = {xn7Var.b, Integer.valueOf(xn7Var.c)};
                            Resources resources = (Resources) av8Var2.k(nz.c);
                            kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
                            boolean e = av8Var2.e(i10) | av8Var2.g(objArr);
                            Object O2 = av8Var2.O();
                            if (e || O2 == obj4) {
                                Object[] copyOf = Arrays.copyOf(objArr, 2);
                                resources.getClass();
                                ArrayList arrayList = new ArrayList(copyOf.length);
                                int length = copyOf.length;
                                int i11 = 0;
                                ?? r5 = copyOf;
                                while (i11 < length) {
                                    Iterator it3 = it2;
                                    ?? r0 = r5[i11];
                                    Object obj10 = r5;
                                    if (r0 instanceof Spanned) {
                                        String html = Html.toHtml((Spanned) r0, 0);
                                        html.getClass();
                                        r0 = StringsKt.d0(html, "<p dir=\"ltr\">", html);
                                        int T = StringsKt.T("</p>", r0, 6);
                                        if (T != -1) {
                                            r0 = r0.substring(0, T);
                                        }
                                    }
                                    arrayList.add(r0);
                                    i11++;
                                    it2 = it3;
                                    r5 = obj10;
                                }
                                it = it2;
                                z2 = false;
                                Object[] array = arrayList.toArray(new Object[0]);
                                String html2 = Html.toHtml(new SpannedString(resources.getText(i10)), 0);
                                html2.getClass();
                                String d02 = StringsKt.d0(html2, "<p dir=\"ltr\">", html2);
                                int T2 = StringsKt.T("</p>", d02, 6);
                                if (T2 != -1) {
                                    d02 = d02.substring(0, T2);
                                }
                                Object[] copyOf2 = Arrays.copyOf(array, array.length);
                                Spanned fromHtml = Html.fromHtml(String.format(d02, Arrays.copyOf(copyOf2, copyOf2.length)), 0);
                                fromHtml.getClass();
                                O2 = hda.Q(fromHtml, kx4Var);
                                av8Var2.n0(O2);
                            } else {
                                it = it2;
                                z2 = false;
                            }
                            d2a.h((q80) O2, null, 0L, kg0Var, av8Var2, 3072, 6);
                            av8Var2.s(z2);
                        }
                        it2 = it;
                        i6 = i7;
                    }
                    av8Var2.s(false);
                    av8Var2.s(true);
                    av8 av8Var3 = av8Var2;
                    rz0.a(new sz0(AdType.Banner.FantasySmall, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), null, 0, 0, true, av8Var3, 24960, 10);
                    gv9 gv9Var = ((vn7) cdiVar2.getValue()).b;
                    ev6 ev6Var = ao7Var.g;
                    il8 r = ao7Var.r();
                    if (r == null) {
                        r = il8.h;
                    }
                    tol.j(gv9Var, ev6Var, function12, r, function0, !((vn7) cdiVar2.getValue()).a.a.d(), ((vn7) cdiVar2.getValue()).a.g, ((vn7) cdiVar2.getValue()).a.a.h(), null, false, null, av8Var3, 805306368, 1280);
                    xtc d03 = l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    String v = oea.v(R.string.fantasy_learn_how_transfers_work, av8Var3);
                    boolean i12 = av8Var3.i(context2) | av8Var3.i(ao7Var);
                    Object O3 = av8Var3.O();
                    if (i12 || O3 == obj4) {
                        O3 = new n37(20, context2, ao7Var);
                        av8Var3.n0(O3);
                    }
                    x2a.d(v, d03, null, 0L, 0L, 0L, (Function0) O3, c5n.a, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var3, 12582960, 0, 1852);
                    rz0.a(new sz0(AdType.Banner.FantasyBig, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), null, 0, 0, true, av8Var3, 24960, 10);
                    av8Var3.s(true);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                ksa ksaVar2 = (ksa) obj9;
                Function1 function13 = (Function1) obj5;
                cdi cdiVar3 = (cdi) obj8;
                h4d h4dVar = (h4d) obj7;
                Function2 function2 = (Function2) obj6;
                tzj tzjVar = (tzj) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                tzjVar.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= (intValue3 & 8) == 0 ? ((av8) of3Var3).g(tzjVar) : ((av8) of3Var3).i(tzjVar) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var3;
                if (av8Var4.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    Object O4 = av8Var4.O();
                    if (O4 == obj4) {
                        O4 = new wla();
                        av8Var4.n0(O4);
                    }
                    wla wlaVar = (wla) O4;
                    ng0 ng0Var2 = new ng0(8.0f, true, new a70(6));
                    int i13 = intValue3;
                    t3e t3eVar = new t3e(8.0f, 8.0f, 8.0f, hkg.u(48.0f, av8Var4, 0));
                    xtc s = b6a.s(bkh.c, wlaVar);
                    boolean g2 = av8Var4.g(function13) | ((i13 & 14) == 4 || ((i13 & 8) != 0 && av8Var4.i(tzjVar))) | av8Var4.g(cdiVar3) | av8Var4.g(h4dVar) | av8Var4.i(wlaVar) | av8Var4.g(function2);
                    Object O5 = av8Var4.O();
                    if (g2 || O5 == obj4) {
                        O5 = new yx1(tzjVar, function13, h4dVar, wlaVar, function2, cdiVar3, 6);
                        av8Var4.n0(O5);
                    }
                    v8a.a(s, ksaVar2, t3eVar, ng0Var2, null, null, false, null, (Function1) O5, av8Var4, 24576, 488);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 3:
                gv9<fgf> gv9Var2 = (gv9) obj9;
                gv9<fgf> gv9Var3 = (gv9) obj5;
                OddsEventUIModel oddsEventUIModel = (OddsEventUIModel) obj7;
                old oldVar = (old) obj6;
                vmd vmdVar = (vmd) obj8;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var5 = (av8) of3Var4;
                if (av8Var5.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    av8Var5.d0(498916860);
                    for (fgf fgfVar : gv9Var2) {
                        nld.d(oddsEventUIModel.a, oddsEventUIModel.b, oddsEventUIModel.c, oldVar, fgfVar, vmdVar, "additional", null, 0L, false, cgf.c, false, false, null, fgfVar.g, av8Var5, 1572864, 6, 15232);
                    }
                    av8Var5.s(false);
                    if (gv9Var2.isEmpty() || gv9Var3.isEmpty()) {
                        av8Var5.d0(-1712843758);
                        av8Var5.s(false);
                    } else {
                        av8Var5.d0(-1712906223);
                        w1l.s(utcVar, 16.0f, av8Var5, false);
                    }
                    if (gv9Var3.isEmpty()) {
                        av8Var5.d0(-1712038254);
                        av8Var5.s(false);
                    } else {
                        av8Var5.d0(-1712779185);
                        hi.e(((fgf) CollectionsKt.Y(gv9Var3)).b, ((fgf) CollectionsKt.Y(gv9Var3)).d, oddsEventUIModel.c, av8Var5, 0);
                        for (fgf fgfVar2 : gv9Var3) {
                            nld.d(oddsEventUIModel.a, oddsEventUIModel.b, oddsEventUIModel.c, oldVar, fgfVar2, vmdVar, "additional", null, 0L, false, cgf.c, false, false, null, fgfVar2.g, av8Var5, 1572864, 6, 15232);
                        }
                        av8Var5.s(false);
                    }
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 4:
                j64 j64Var = (j64) obj9;
                Function1 function14 = (Function1) obj5;
                Function1 function15 = (Function1) obj7;
                Function0 function02 = (Function0) obj6;
                Function1 function16 = (Function1) obj8;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var6 = (av8) of3Var5;
                if (av8Var6.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    nq8.h(av8Var6, bkh.e(utcVar, 8.0f));
                    pco.c(j64Var.b, function14, function15, function02, function16, av8Var6, 0);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 5:
                qpb qpbVar = (qpb) obj7;
                Function1 function17 = (Function1) obj5;
                ksa ksaVar3 = (ksa) obj9;
                qpa qpaVar = (qpa) obj6;
                e1d e1dVar = (e1d) obj8;
                upb upbVar = (upb) obj;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                upbVar.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((av8) of3Var6).e(upbVar.ordinal()) ? 4 : 2;
                }
                av8 av8Var7 = (av8) of3Var6;
                if (av8Var7.T(intValue6 & 1, (intValue6 & 19) != 18)) {
                    int ordinal = upbVar.ordinal();
                    if (ordinal == 0) {
                        av8Var7.d0(989400659);
                        eo6.a((ppb) qpbVar, function17, ksaVar3, ((p75) e1dVar.getValue()).a, null, av8Var7, 0);
                        av8Var7.s(false);
                    } else {
                        if (ordinal != 1) {
                            throw dmi.h(av8Var7, 863197836, false);
                        }
                        av8Var7.d0(989854003);
                        ao6.a((ppb) qpbVar, function17, qpaVar, ((p75) e1dVar.getValue()).a, null, av8Var7, 0);
                        av8Var7.s(false);
                    }
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 6:
                y97 y97Var = (y97) obj9;
                ct8 ct8Var = (ct8) obj7;
                Function2 function22 = (Function2) obj6;
                Function1 function18 = (Function1) obj5;
                qug qugVar = (qug) obj8;
                of3 of3Var7 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var8 = (av8) of3Var7;
                if (av8Var8.T(intValue7 & 1, (intValue7 & 17) != 16)) {
                    wnn.i(y97Var, ct8Var, function22, function18, null, qugVar, false, av8Var8, 0);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
            case 7:
                k7d k7dVar = (k7d) obj9;
                et8 et8Var = (et8) obj7;
                Function1 function19 = (Function1) obj5;
                e1d e1dVar2 = (e1d) obj6;
                e1d e1dVar3 = (e1d) obj8;
                p3e p3eVar2 = (p3e) obj;
                of3 of3Var8 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                p3eVar2.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((av8) of3Var8).g(p3eVar2) ? 4 : 2;
                }
                av8 av8Var9 = (av8) of3Var8;
                if (av8Var9.T(intValue8 & 1, (intValue8 & 19) != 18)) {
                    FantasyOnboardingStepsNavigation fantasyOnboardingStepsNavigation = ((pb7) e1dVar2.getValue()).b;
                    xtc a0 = l98.a0(utcVar, p3eVar2);
                    Object O6 = av8Var9.O();
                    if (O6 == obj4) {
                        O6 = new fw6(i5, e1dVar3);
                        av8Var9.n0(O6);
                    }
                    f.a(k7dVar, fantasyOnboardingStepsNavigation, et8Var, function19, (Function1) O6, a0, av8Var9, 24576);
                } else {
                    av8Var9.W();
                }
                return Unit.a;
            case 8:
                e1d e1dVar4 = (e1d) obj9;
                Function1 function110 = (Function1) obj5;
                wb7 wb7Var = (wb7) obj7;
                ComponentActivity componentActivity = (ComponentActivity) obj6;
                e1d e1dVar5 = (e1d) obj8;
                xtc xtcVar = (xtc) obj;
                of3 of3Var9 = (of3) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                xtcVar.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((av8) of3Var9).g(xtcVar) ? 4 : 2;
                }
                av8 av8Var10 = (av8) of3Var9;
                if (av8Var10.T(intValue9 & 1, (intValue9 & 19) != 18)) {
                    ImageVector N = s6a.N(R.drawable.ic_close, 6, av8Var10);
                    long D = lz.D(R.color.n_lv_1, av8Var10);
                    xtc l = bkh.l(xtcVar, 24.0f);
                    boolean g3 = av8Var10.g(e1dVar4) | av8Var10.g(function110) | av8Var10.i(wb7Var) | av8Var10.i(componentActivity);
                    Object O7 = av8Var10.O();
                    if (g3 || O7 == obj4) {
                        O7 = new l31(wb7Var, componentActivity, e1dVar4, function110, e1dVar5, 3);
                        av8Var10.n0(O7);
                    }
                    kq9.b(N, null, tol.y(l, false, false, false, 0L, null, (Function0) O7, av8Var10, 29), D, av8Var10, 48, 0);
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 9:
                FantasyCompetitionType fantasyCompetitionType = (FantasyCompetitionType) obj9;
                qug qugVar2 = (qug) obj7;
                Function1 function111 = (Function1) obj5;
                mei meiVar = (mei) obj6;
                nei neiVar = (nei) obj8;
                xpa xpaVar = (xpa) obj;
                of3 of3Var10 = (of3) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((av8) of3Var10).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var11 = (av8) of3Var10;
                if (av8Var11.T(intValue10 & 1, (intValue10 & 19) != 18)) {
                    int i14 = ek7.a[fantasyCompetitionType.ordinal()];
                    if (i14 == 1) {
                        av8Var11.d0(-441410494);
                        zm2.d(qugVar2, xpa.a(xpaVar, utcVar, 7), function111, meiVar, neiVar, fqj.a, false, null, false, false, false, av8Var11, 196608, 1984);
                        av8Var11.s(false);
                    } else {
                        if (i14 != 2) {
                            throw dmi.h(av8Var11, 262853217, false);
                        }
                        av8Var11.d0(-440405226);
                        rfo.d(qugVar2, xpa.a(xpaVar, utcVar, 7), function111, meiVar, neiVar, fqj.b, false, null, av8Var11, 196608);
                        av8Var11.s(false);
                    }
                } else {
                    av8Var11.W();
                }
                return Unit.a;
            case 10:
                nl7 nl7Var = (nl7) obj9;
                Function1 function112 = (Function1) obj5;
                ev6 ev6Var2 = (ev6) obj7;
                xtc xtcVar2 = (xtc) obj6;
                ct8 ct8Var2 = (ct8) obj8;
                of3 of3Var11 = (of3) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var12 = (av8) of3Var11;
                if (av8Var12.T(intValue11 & 1, (intValue11 & 17) != 16)) {
                    kv1 kv1Var3 = uxf.p;
                    xtc x = gz8.x(bkh.d(utcVar, 1.0f), null, null, 3);
                    p4h p4hVar = ww9.d;
                    u23 a4 = t23.a(p4hVar, kv1Var3, av8Var12, 48);
                    int hashCode3 = Long.hashCode(av8Var12.T);
                    aee m3 = av8Var12.m();
                    xtc C4 = fqj.C(av8Var12, x);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var12.h0();
                    if (av8Var12.S) {
                        av8Var12.l(zg3Var2);
                    } else {
                        av8Var12.q0();
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var12, a4, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var12, m3, ff3Var2);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    f50 f50Var5 = hf3.j;
                    waa.K(av8Var12, valueOf2, f50Var5);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var12, ryVar2);
                    f50 f50Var6 = hf3.d;
                    waa.K(av8Var12, C4, f50Var6);
                    rha.b(oea.v(R.string.fantasy_team_of_the_round, av8Var12), null, 0L, av8Var12, 0, 6);
                    nq8.h(av8Var12, bkh.e(utcVar, 4.0f));
                    ol7 ol7Var = nl7Var.b;
                    kik.d(ol7Var.a, nl7Var.a, function112, null, av8Var12, 0, 8);
                    nq8.h(av8Var12, bkh.e(utcVar, 4.0f));
                    xtc d04 = l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    l8g a5 = k8g.a(ww9.b, uxf.m, av8Var12, 48);
                    int hashCode4 = Long.hashCode(av8Var12.T);
                    aee m4 = av8Var12.m();
                    xtc C5 = fqj.C(av8Var12, d04);
                    av8Var12.h0();
                    if (av8Var12.S) {
                        av8Var12.l(zg3Var2);
                    } else {
                        av8Var12.q0();
                    }
                    waa.K(av8Var12, a5, f50Var4);
                    waa.K(av8Var12, m4, ff3Var2);
                    bf3.s(hashCode4, av8Var12, f50Var5, av8Var12, ryVar2);
                    waa.K(av8Var12, C5, f50Var6);
                    pl7 pl7Var = ol7Var.e;
                    String v2 = oea.v(R.string.least_points_short, av8Var12);
                    Locale locale = Locale.ROOT;
                    String upperCase = v2.toUpperCase(locale);
                    upperCase.getClass();
                    boolean z3 = ev6Var2.A;
                    p8g p8gVar = p8g.a;
                    fz8.A(pl7Var, upperCase, z3, p8gVar.a(1.0f, utcVar, true), 0L, av8Var12, 0, 16);
                    nq8.h(av8Var12, bkh.p(utcVar, 8.0f));
                    xtc c0 = l98.c0(n9e.q(p8gVar.a(1.0f, xtcVar2, true), lz.D(R.color.surface_2, av8Var12), o7g.a(12.0f)), 8.0f, 4.0f);
                    u23 a6 = t23.a(p4hVar, kv1Var3, av8Var12, 48);
                    int hashCode5 = Long.hashCode(av8Var12.T);
                    aee m5 = av8Var12.m();
                    xtc C6 = fqj.C(av8Var12, c0);
                    av8Var12.h0();
                    if (av8Var12.S) {
                        av8Var12.l(zg3Var2);
                    } else {
                        av8Var12.q0();
                    }
                    waa.K(av8Var12, a6, f50Var4);
                    waa.K(av8Var12, m5, ff3Var2);
                    bf3.s(hashCode5, av8Var12, f50Var5, av8Var12, ryVar2);
                    waa.K(av8Var12, C6, f50Var6);
                    String valueOf3 = String.valueOf(ol7Var.b);
                    yf8 yf8Var = xth.a;
                    udj.c(valueOf3, null, lz.D(R.color.n_lv_1, av8Var12), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.h(), av8Var12, 0, 24960, 110586);
                    String upperCase2 = oea.v(R.string.points, av8Var12).toUpperCase(locale);
                    upperCase2.getClass();
                    udj.c(upperCase2, null, lz.D(R.color.n_lv_1, av8Var12), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var12, 0, 24960, 110586);
                    i.o(av8Var12, true, utcVar, 8.0f, av8Var12);
                    pl7 pl7Var2 = ol7Var.d;
                    String upperCase3 = oea.v(R.string.most_points_short, av8Var12).toUpperCase(locale);
                    upperCase3.getClass();
                    fz8.A(pl7Var2, upperCase3, ev6Var2.A, p8gVar.a(1.0f, utcVar, true), 0L, av8Var12, 0, 16);
                    bf3.t(av8Var12, true, utcVar, 16.0f, av8Var12);
                    dy0.b(bkh.d(utcVar, 1.0f), uxf.g, yqo.H(1466179212, av8Var12, new d67(26, nl7Var, ev6Var2, ct8Var2)), av8Var12, 3126, 4);
                    gv9 gv9Var4 = nl7Var.c;
                    if (gv9Var4 == null) {
                        av8Var12.d0(775329164);
                        av8Var12.s(false);
                    } else {
                        av8Var12.d0(775329165);
                        View view = (View) av8Var12.k(nz.f);
                        Object O8 = av8Var12.O();
                        if (O8 == obj4) {
                            O8 = e.f(Boolean.TRUE);
                            av8Var12.n0(O8);
                        }
                        qug o0 = hkg.o0(av8Var12);
                        nq8.h(av8Var12, bkh.e(utcVar, 8.0f));
                        tol.b(nyd.a.a(null), yqo.H(21288871, av8Var12, new ere(o0, view, (e1d) O8, gv9Var4, ev6Var2, 15)), av8Var12, 56);
                        Unit unit = Unit.a;
                        av8Var12.s(false);
                    }
                    av8Var12.s(true);
                } else {
                    av8Var12.W();
                }
                return Unit.a;
            case 11:
                dy7 dy7Var = (dy7) obj9;
                wla wlaVar2 = (wla) obj5;
                List list = (List) obj7;
                Context context3 = (Context) obj6;
                ct8 ct8Var3 = (ct8) obj8;
                of3 of3Var12 = (of3) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var13 = (av8) of3Var12;
                if (av8Var13.T(intValue12 & 1, (intValue12 & 17) != 16)) {
                    fz8.e(dy7Var.d, null, null, uo5.f(s02.h0(300, 0, null, 6), 2), null, yqo.H(-1666005508, av8Var13, new er6(wlaVar2, list, context3, ct8Var3, 18)), av8Var13, 199680, 22);
                } else {
                    av8Var13.W();
                }
                return Unit.a;
            case 12:
                return a(obj, obj2, obj3);
            case 13:
                return b(obj, obj2, obj3);
            default:
                w3l w3lVar = (w3l) obj9;
                cdi cdiVar4 = (cdi) obj8;
                sn3 sn3Var = (sn3) obj7;
                Function0 function03 = (Function0) obj6;
                Function1 function113 = (Function1) obj5;
                of3 of3Var13 = (of3) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var14 = (av8) of3Var13;
                if (av8Var14.T(intValue13 & 1, (intValue13 & 17) != 16)) {
                    int i15 = w3lVar.b;
                    int i16 = w3lVar.c;
                    boolean booleanValue2 = ((Boolean) cdiVar4.getValue()).booleanValue();
                    boolean g4 = av8Var14.g(cdiVar4) | av8Var14.g(w3lVar) | av8Var14.i(sn3Var) | av8Var14.g(function03);
                    Object O9 = av8Var14.O();
                    if (g4 || O9 == obj4) {
                        O9 = new m61(w3lVar, sn3Var, function03, cdiVar4, 27);
                        av8Var14.n0(O9);
                    }
                    i9a.n(i15, i16, booleanValue2, (Function0) O9, function113, null, av8Var14, 0);
                } else {
                    av8Var14.W();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ ff7(ksa ksaVar, Function1 function1, e1d e1dVar, h4d h4dVar, Function2 function2) {
        this.a = 2;
        this.e = ksaVar;
        this.b = function1;
        this.d = e1dVar;
        this.f = h4dVar;
        this.c = function2;
    }

    public /* synthetic */ ff7(qpb qpbVar, Function1 function1, ksa ksaVar, qpa qpaVar, e1d e1dVar) {
        this.a = 5;
        this.f = qpbVar;
        this.b = function1;
        this.e = ksaVar;
        this.c = qpaVar;
        this.d = e1dVar;
    }

    public /* synthetic */ ff7(y97 y97Var, ct8 ct8Var, Function2 function2, Function1 function1, qug qugVar) {
        this.a = 6;
        this.e = y97Var;
        this.f = ct8Var;
        this.c = function2;
        this.b = function1;
        this.d = qugVar;
    }

    public /* synthetic */ ff7(w3l w3lVar, cdi cdiVar, sn3 sn3Var, Function0 function0, Function1 function1) {
        this.a = 14;
        this.e = w3lVar;
        this.d = cdiVar;
        this.f = sn3Var;
        this.c = function0;
        this.b = function1;
    }

    public /* synthetic */ ff7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.e = obj;
        this.b = obj2;
        this.f = obj3;
        this.c = obj4;
        this.d = obj5;
    }

    public /* synthetic */ ff7(Object obj, Object obj2, Function1 function1, Object obj3, Object obj4, int i) {
        this.a = i;
        this.e = obj;
        this.f = obj2;
        this.b = function1;
        this.c = obj3;
        this.d = obj4;
    }
}
