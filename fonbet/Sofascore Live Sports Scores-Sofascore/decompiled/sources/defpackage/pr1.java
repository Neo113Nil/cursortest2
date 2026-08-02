package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.SeasonShotAction;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class pr1 implements et8 {
    public final /* synthetic */ int a;

    public /* synthetic */ pr1(int i) {
        this.a = i;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        zve zveVar;
        ArrayList arrayList;
        dzg dzgVar;
        dzg dzgVar2;
        of3 of3Var;
        int i = this.a;
        utc utcVar = utc.a;
        switch (i) {
            case 0:
                c73 c73Var = (c73) obj;
                e93 e93Var = (e93) obj2;
                tfh tfhVar = (tfh) obj3;
                Context context = (Context) obj4;
                c73Var.getClass();
                e93Var.getClass();
                tfhVar.getClass();
                context.getClass();
                d73 d73Var = c73Var.c;
                if (d73Var == null || (dzgVar2 = d73Var.e) == null) {
                    zveVar = null;
                } else {
                    zveVar = new zve();
                    Iterator it = dzgVar2.b.iterator();
                    while (it.hasNext()) {
                        zveVar.a((SeasonShotAction) it.next());
                    }
                }
                if (zveVar == null) {
                    return null;
                }
                ArrayList arrayList2 = zveVar.b;
                ArrayList arrayList3 = zveVar.c;
                qo2 qo2Var = c73Var.a;
                Integer valueOf = qo2Var != null ? Integer.valueOf(qo2Var.a) : null;
                Integer num = d73Var != null ? d73Var.a : null;
                Season season = c73Var.b;
                Integer valueOf2 = season != null ? Integer.valueOf(season.getId()) : null;
                String str = d73Var != null ? d73Var.b : null;
                String name = tfhVar.name();
                int ordinal = e93Var.ordinal();
                StringBuilder sb = new StringBuilder();
                sb.append(valueOf);
                sb.append("_");
                sb.append(num);
                sb.append("_");
                sb.append(valueOf2);
                bf3.v(sb, "_", str, "_", name);
                String g = me4.g(ordinal, "_", sb);
                int ordinal2 = tfhVar.ordinal();
                if (ordinal2 == 0) {
                    arrayList = arrayList2;
                } else if (ordinal2 == 1) {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.addAll(arrayList2);
                    arrayList4.addAll(arrayList3);
                    arrayList = arrayList4;
                } else {
                    if (ordinal2 != 2) {
                        zzl.b();
                        return null;
                    }
                    arrayList = arrayList3;
                }
                int m = yid.m((d73Var == null || (dzgVar = d73Var.e) == null) ? null : Integer.valueOf(dzgVar.a));
                if (arrayList.isEmpty() || m <= 0) {
                    return null;
                }
                return new v0i(i99.b((i99) rr1.a.getValue(), context, arrayList, m, false, false, false, 120), "basketball_heatmap_".concat(g));
            case 1:
                ze8 ze8Var = (ze8) obj2;
                of3 of3Var2 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                ze8Var.getClass();
                kq9.b(s6a.N(ze8Var.d(), 6, of3Var2), null, bkh.l(utcVar, 24.0f), ((r13) ze8Var.getColor().invoke(of3Var2, 0)).a, of3Var2, 432, 0);
                return Unit.a;
            case 2:
                gv9 gv9Var = (gv9) obj2;
                of3 of3Var3 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                gv9Var.getClass();
                xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                l8g a = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, of3Var3, 6);
                av8 av8Var = (av8) of3Var3;
                int hashCode = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C = fqj.C(of3Var3, f0);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8 av8Var2 = (av8) of3Var3;
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(of3Var3, a, hf3.g);
                waa.K(of3Var3, m2, hf3.f);
                waa.K(of3Var3, Integer.valueOf(hashCode), hf3.j);
                waa.J(of3Var3, hf3.k);
                waa.K(of3Var3, C, hf3.d);
                av8Var2.d0(503643550);
                Iterator<E> it2 = gv9Var.iterator();
                while (it2.hasNext()) {
                    ww9.a((v0i) it2.next(), new goa(1.0f, true), of3Var3, 0);
                }
                av8Var2.s(false);
                av8Var2.s(true);
                return Unit.a;
            case 3:
                gv9 gv9Var2 = (gv9) obj2;
                of3 of3Var4 = (of3) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((k60) obj).getClass();
                gv9Var2.getClass();
                if (gv9Var2.size() > 2) {
                    av8 av8Var3 = (av8) of3Var4;
                    av8Var3.d0(-580358252);
                    xw3.o(gv9Var2, null, av8Var3, (intValue >> 3) & 14);
                    av8Var3.s(false);
                } else {
                    av8 av8Var4 = (av8) of3Var4;
                    av8Var4.d0(-580266027);
                    xw3.j(gv9Var2, null, av8Var4, (intValue >> 3) & 14);
                    av8Var4.s(false);
                }
                return Unit.a;
            case 4:
                ((Integer) obj2).intValue();
                of3 of3Var5 = (of3) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                av8 av8Var5 = (av8) of3Var5;
                if (!av8Var5.T(intValue2 & 1, (intValue2 & 129) != 128)) {
                    av8Var5.W();
                }
                return Unit.a;
            case 5:
                il8 il8Var = (il8) obj2;
                of3 of3Var6 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                il8Var.getClass();
                kq9.b(s6a.N(il8Var.c, 6, of3Var6), null, bkh.l(l98.b0(utcVar, 12.0f), 24.0f), lz.D(R.color.n_lv_1, of3Var6), of3Var6, 432, 0);
                return Unit.a;
            case 6:
                of3 of3Var7 = (of3) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                ((m12) obj).getClass();
                av8 av8Var6 = (av8) of3Var7;
                if (av8Var6.T(intValue3 & 1, (intValue3 & 129) != 128)) {
                    kq9.b(s6a.N(R.drawable.ic_list_view_black, 6, av8Var6), null, ljg.h(8.0f, bkh.l(utcVar, 32.0f), lz.D(R.color.surface_2, av8Var6), 4.0f), lz.D(R.color.n_lv_1, av8Var6), av8Var6, 48, 0);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 7:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                of3 of3Var8 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                kq9.b(s6a.N(booleanValue ? R.drawable.ic_stop_16 : R.drawable.ic_play_16, 6, of3Var8), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, of3Var8), of3Var8, 432, 0);
                return Unit.a;
            case 8:
                fwb fwbVar = (fwb) obj2;
                of3 of3Var9 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                fwbVar.getClass();
                String title = fwbVar.getTitle();
                yf8 yf8Var = xth.a;
                udj.c(title, null, lz.D(R.color.n_lv_1, of3Var9), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.h(), of3Var9, 0, 0, 131066);
                return Unit.a;
            case 9:
                String str2 = (String) obj2;
                of3 of3Var10 = (of3) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((k60) obj).getClass();
                str2.getClass();
                yf8 yf8Var2 = xth.a;
                udj.c(str2, null, lz.D(R.color.n_lv_1, of3Var10), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.j(), of3Var10, (intValue4 >> 3) & 14, 0, 130042);
                return Unit.a;
            case 10:
                e6j e6jVar = (e6j) obj2;
                of3 of3Var11 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                e6jVar.getClass();
                u23 a2 = t23.a(ww9.d, uxf.o, of3Var11, 0);
                av8 av8Var7 = (av8) of3Var11;
                int hashCode2 = Long.hashCode(av8Var7.T);
                aee m3 = av8Var7.m();
                xtc C2 = fqj.C(of3Var11, utcVar);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8 av8Var8 = (av8) of3Var11;
                av8Var8.h0();
                if (av8Var8.S) {
                    av8Var8.l(zg3Var2);
                } else {
                    av8Var8.q0();
                }
                waa.K(of3Var11, a2, hf3.g);
                waa.K(of3Var11, m3, hf3.f);
                waa.K(of3Var11, Integer.valueOf(hashCode2), hf3.j);
                waa.J(of3Var11, hf3.k);
                waa.K(of3Var11, C2, hf3.d);
                d6j d6jVar = e6jVar.c;
                if (d6jVar == null) {
                    av8Var8.d0(-1600963881);
                    av8Var8.s(false);
                    of3Var = of3Var11;
                } else {
                    av8Var8.d0(-1600963880);
                    g6j.a(oea.v(R.string.career_high, of3Var11), d6jVar.a, false, false, null, null, of3Var11, 0, 60);
                    of3Var = of3Var11;
                    av8Var8.s(false);
                }
                av8Var8.d0(-1991295953);
                d6j d6jVar2 = e6jVar.b;
                g6j.a(oea.v(R.string.current_ranking, of3Var), d6jVar2.a, false, true, d6jVar2.b, d6jVar2.c, of3Var, 3072, 4);
                av8Var8.s(false);
                d6j d6jVar3 = e6jVar.d;
                if (d6jVar3 == null) {
                    av8Var8.d0(-1600103197);
                    av8Var8.s(false);
                } else {
                    av8Var8.d0(-1600103196);
                    g6j.a(oea.v(R.string.previous, of3Var), d6jVar3.a, true, false, null, d6jVar3.c, of3Var, 384, 24);
                    av8Var8.s(false);
                }
                av8Var8.s(true);
                return Unit.a;
            case 11:
                return new kje((CoroutineContext) obj, (Context) obj2, (u2h) obj3, (eib) obj4);
            case 12:
                Context context2 = (Context) obj;
                long longValue = ((Long) obj2).longValue();
                long longValue2 = ((Long) obj3).longValue();
                boolean booleanValue2 = ((Boolean) obj4).booleanValue();
                context2.getClass();
                return new ahg(context2, longValue, longValue2, booleanValue2);
            default:
                Context context3 = (Context) obj;
                long longValue3 = ((Long) obj2).longValue();
                long longValue4 = ((Long) obj3).longValue();
                boolean booleanValue3 = ((Boolean) obj4).booleanValue();
                context3.getClass();
                return new ahg(context3, longValue3, longValue4, booleanValue3);
        }
    }
}
