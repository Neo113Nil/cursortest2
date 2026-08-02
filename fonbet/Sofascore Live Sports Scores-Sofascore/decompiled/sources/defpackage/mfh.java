package defpackage;

import android.content.Context;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandColors;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.sofascore.results.feed.compose.model.ShortVideoFeedCardModel;
import com.sofascore.results.league.fragment.details.compose.totr.share.TotrSharePayload;
import com.sofascore.results.wc26.data.WorldCupLastDanceUiModel;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeUserDailyBonusModal;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class mfh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mfh(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        r13 r13Var;
        int i = this.a;
        a99 a99Var = nf3.a;
        Object obj3 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                h5a.u((ShortVideoFeedCardModel) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                g7a.i((fv) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                jzh.b((ozh) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                jzh.d((hzh) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                wba.b((hwi) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                wba.h((jwi) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                kda.j((xwi) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                sea.f((mxi) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(385));
                break;
            case 8:
                ((Integer) obj2).getClass();
                mha.g((TotrSharePayload) obj5, (Function1) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                z1a.b((q2h) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                y6a.o((Pair) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                a6j.a((f29) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 12:
                esf esfVar = (esf) obj5;
                lcj lcjVar = (lcj) obj4;
                mze mzeVar = (mze) obj;
                long i2 = dnd.i(esfVar.a, ((dnd) obj2).a);
                esfVar.a = i2;
                lcjVar.A(k69.a, dnd.i(((esf) obj3).a, i2));
                if (lcjVar.u(lcjVar.n())) {
                    mzeVar.a();
                    z69 z69Var = lcjVar.j;
                    if (z69Var != null) {
                        ((kie) z69Var).a(9);
                    }
                }
                break;
            case 13:
                Brand brand = (Brand) obj5;
                lmj lmjVar = (lmj) obj4;
                vte vteVar = (vte) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    BrandColors color = brand != null ? brand.getColor() : null;
                    if (color == null) {
                        av8Var.d0(1786287304);
                        av8Var.s(false);
                        r13Var = null;
                    } else {
                        av8Var.d0(2135832153);
                        long D = tz9.D(color, av8Var);
                        av8Var.s(false);
                        r13Var = new r13(D);
                    }
                    s02.b(r13Var, brand != null ? Integer.valueOf(brand.getId()) : null, brand != null ? brand.getUrl() : null, brand != null ? brand.getSlug() : null, BrandLocation.EventScreen, lmjVar.n, null, l98.c0(utc.a, lmjVar.mo904getHorizontalPaddingD9Ej5fM(), 4.0f), null, lz.D(R.color.surface_1, av8Var), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, yqo.H(-1657194879, av8Var, new e6i(14, vteVar, lmjVar)), av8Var, 1597440, 3078, 6400);
                } else {
                    av8Var.W();
                }
                break;
            case 14:
                Context context = (Context) obj5;
                e1d e1dVar = (e1d) obj4;
                String str = (String) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    xtc l = bkh.l(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 16.0f);
                    long D2 = lz.D(R.color.n_lv_4, av8Var2);
                    Object O = av8Var2.O();
                    if (O == a99Var) {
                        O = mz1.e(av8Var2);
                    }
                    wzc wzcVar = (wzc) O;
                    Object[] objArr = new Object[0];
                    Object O2 = av8Var2.O();
                    if (O2 == a99Var) {
                        O2 = nuh.z;
                        av8Var2.n0(O2);
                    }
                    kq9.b(s6a.N(R.drawable.ic_close, 6, av8Var2), null, tol.y(l, true, false, true, D2, wzcVar, new e32((boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), context, e1dVar, str, 8), av8Var2, 0), lz.D(R.color.n_lv_1, av8Var2), av8Var2, 48, 0);
                } else {
                    av8Var2.W();
                }
                break;
            case 15:
                ((Integer) obj2).getClass();
                f5p.n((dxi) obj5, (dxi) obj4, (tc3) obj3, (of3) obj, aba.K(385));
                break;
            case 16:
                ((Integer) obj2).getClass();
                xzj.b((syj) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 17:
                break;
            case 18:
                kx4 kx4Var = (kx4) obj5;
                jxk jxkVar = (jxk) obj4;
                znh znhVar = (znh) obj3;
                yji yjiVar = (yji) obj;
                yjiVar.getClass();
                long j = ((an3) obj2).a;
                Object[] objArr2 = an3.h(j) != Integer.MAX_VALUE;
                if (objArr2 != false) {
                    znhVar.i(an3.h(j));
                }
                List t = yjiVar.t("sets", new tc3(2016891797, new exk(jxkVar, r7 ? 1 : 0), true));
                final ArrayList arrayList = new ArrayList(k13.r(t, 10));
                Iterator it = t.iterator();
                while (it.hasNext()) {
                    arrayList.add(((g1c) it.next()).J(j));
                }
                Iterator it2 = arrayList.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    i3 += ((qhe) it2.next()).a;
                }
                float C0 = kx4Var.C0(znhVar.h() - i3) - 8.0f;
                boolean contains = hxk.a.contains(jxkVar.c.a);
                float max = Math.max(40.0f, C0);
                final qhe J = Boolean.valueOf(contains ^ true).equals(Boolean.TRUE) ? ((g1c) CollectionsKt.Y(yjiVar.t("result", new tc3(-1597143032, new t81(max, jxkVar), true)))).J(j) : null;
                final int g = an3.g(j);
                r7 = contains || p75.a(max, 40.0f) > 0 || !objArr2 == true;
                break;
            case 19:
                cdi cdiVar = (cdi) obj5;
                Event event = (Event) obj4;
                WeeklyChallengeUserDailyBonusModal weeklyChallengeUserDailyBonusModal = (WeeklyChallengeUserDailyBonusModal) obj3;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    wkn.a((w3f) cdiVar.getValue(), null, null, null, yqo.H(1963220816, av8Var3, new e6i(18, event, weeklyChallengeUserDailyBonusModal)), av8Var3, 24576, 14);
                } else {
                    av8Var3.W();
                }
                break;
            case 20:
                Function0 function0 = (Function0) obj5;
                WeeklyChallengeViewModel weeklyChallengeViewModel = (WeeklyChallengeViewModel) obj4;
                Context context2 = (Context) obj3;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean g2 = av8Var4.g(function0) | av8Var4.i(weeklyChallengeViewModel);
                    Object O3 = av8Var4.O();
                    if (g2 || O3 == a99Var) {
                        O3 = new fej(20, function0, weeklyChallengeViewModel);
                        av8Var4.n0(O3);
                    }
                    v88.a((Function0) O3, bkh.e(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 8.0f, 3), 40.0f), o7g.a(32.0f), lz.D(R.color.primary_default, av8Var4), 0L, null, yqo.H(1723937466, av8Var4, new m04(context2, 3)), av8Var4, 12582912, 112);
                } else {
                    av8Var4.W();
                }
                break;
            case 21:
                imh imhVar = (imh) obj5;
                ku3 ku3Var = (ku3) obj4;
                w3l w3lVar = (w3l) obj3;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    hda.g(imhVar, null, yqo.H(-1032561020, av8Var5, new zya(imhVar, ku3Var, w3lVar)), av8Var5, 390);
                } else {
                    av8Var5.W();
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                jaa.o((y7l) obj5, (y21) obj4, (vy8) obj3, (of3) obj, aba.K(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                uaa.j((y7l) obj5, (m5i) obj4, (vy8) obj3, (of3) obj, aba.K(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                nq8.q((y7l) obj5, (tee) obj4, (vy8) obj3, (of3) obj, aba.K(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                w3a.d((WorldCupLastDanceUiModel) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                r4a.p((ofl) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                q5a.k((gv9) obj5, (Integer) obj3, (Function1) obj4, (of3) obj, aba.K(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                q5a.j((jqk) obj5, (Integer) obj3, (Function1) obj4, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                f6a.e((cgl) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ mfh(Object obj, Integer num, Function1 function1, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = num;
        this.d = function1;
    }

    public /* synthetic */ mfh(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}
