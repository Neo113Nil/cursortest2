package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.results.R;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.sofascore.results.wc26.widget.LaunchSearchActivity;
import com.sofascore.results.wc26.widget.LaunchTeamMatchesAction;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class zya implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zya(xtc xtcVar, n8i n8iVar, Context context) {
        this.a = 10;
        this.d = xtcVar;
        this.b = n8iVar;
        this.c = context;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        n52 n52Var = (n52) this.b;
        Function1 function1 = (Function1) this.c;
        Context context = (Context) this.d;
        d2j d2jVar = (d2j) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        d2jVar.getClass();
        gv9 gv9Var = d2jVar.c;
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? ((av8) of3Var).g(d2jVar) : ((av8) of3Var).i(d2jVar) ? 4 : 2;
        }
        boolean z = false;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            n1j n1jVar = d2jVar.b;
            boolean g = av8Var.g(gv9Var) | av8Var.e(n1jVar.ordinal());
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            Object obj4 = O;
            if (g || O == a99Var) {
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : gv9Var) {
                    if (((z1j) obj5).a().contains(n1jVar)) {
                        arrayList.add(obj5);
                    }
                }
                av8Var.n0(arrayList);
                obj4 = arrayList;
            }
            List list = (List) obj4;
            t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
            if ((intValue & 14) == 4 || ((intValue & 8) != 0 && av8Var.i(d2jVar))) {
                z = true;
            }
            boolean g2 = av8Var.g(n52Var) | z | av8Var.g(function1) | av8Var.i(list) | av8Var.i(context);
            Object O2 = av8Var.O();
            if (g2 || O2 == a99Var) {
                O2 = new ke(d2jVar, list, n52Var, function1, context, 13);
                av8Var.n0(O2);
            }
            v8a.a(null, null, C, null, null, null, false, null, (Function1) O2, av8Var, 384, PglCryptUtils.UNKNOWN_ERR);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        imh imhVar = (imh) this.c;
        ku3 ku3Var = (ku3) this.b;
        w3l w3lVar = (w3l) this.d;
        gmh gmhVar = (gmh) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        gmhVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(gmhVar) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            efi efiVar = gmhVar.a;
            if (efiVar == null) {
                efiVar = null;
            }
            if (efiVar == null) {
                return Unit.a;
            }
            x2a.k((gmh) ((eoh) imhVar.b).getValue(), null, ku3Var, null, yqo.H(483717207, av8Var, new e6i(19, efiVar, w3lVar)), av8Var, 24576, 10);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        av8 av8Var;
        int i;
        int i2;
        Integer num = (Integer) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        of3 of3Var = (of3) obj2;
        ((Integer) obj3).getClass();
        ((r70) obj).getClass();
        String i3 = num != null ? mz1.i(num.intValue(), "%") : "-";
        yf8 yf8Var = xth.a;
        dfj l = xth.l();
        if (Intrinsics.c(str, str2)) {
            av8Var = (av8) of3Var;
            i = R.color.primary_default;
            i2 = 969436171;
        } else {
            av8Var = (av8) of3Var;
            i = R.color.n_lv_1;
            i2 = 969436961;
        }
        udj.c(i3, null, ljg.f(av8Var, i2, i, av8Var, false), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, l, of3Var, 0, 0, 131066);
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        Bitmap bitmap = (Bitmap) this.b;
        jfj jfjVar = (jfj) this.c;
        jfj jfjVar2 = (jfj) this.d;
        of3 of3Var = (of3) obj2;
        ((Integer) obj3).getClass();
        ((o8g) obj).getClass();
        bx1 bx1Var = bitmap != null ? new bx1(bitmap) : null;
        dt9 v20Var = bx1Var == null ? new v20(R.drawable.team_logo_placeholder) : bx1Var;
        vy8 K = nq8.K(20.0f);
        int i = R.color.on_color_secondary;
        c5n.n(v20Var, K, 0, bx1Var == null ? new t13(new fjj(new h1g(R.color.on_color_secondary))) : null, of3Var, 32816, 8);
        aba.i(o8g.a(), of3Var, 0);
        String str = jfjVar.a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        yf8 yf8Var = xth.a;
        dfj k = xth.k();
        Integer num = jfjVar.b;
        o3a.i(str2, null, l98.j0(k, Integer.valueOf(num != null ? num.intValue() : R.color.on_color_secondary), of3Var), 0, of3Var, 0, 10);
        if ((jfjVar2 != null ? jfjVar2.a : null) == null) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(-1462883587);
            av8Var.s(false);
        } else {
            av8 av8Var2 = (av8) of3Var;
            av8Var2.d0(-1462883586);
            aba.i(nq8.N(ty8.a, 4.0f), av8Var2, 0);
            String str3 = jfjVar2.a;
            dfj k2 = xth.k();
            Integer num2 = jfjVar2.b;
            if (num2 != null) {
                i = num2.intValue();
            }
            o3a.i(str3, null, l98.j0(k2, Integer.valueOf(i), av8Var2), 0, av8Var2, 0, 10);
            av8Var2.s(false);
        }
        return Unit.a;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        of3 of3Var;
        old oldVar;
        n8i n8iVar;
        ServerType serverType;
        v5i v5iVar;
        boolean z;
        boolean z2;
        ServerType serverType2;
        v5i v5iVar2;
        vy8 vy8Var;
        int i2 = this.a;
        int i3 = 9;
        int i4 = 14;
        Object obj4 = nf3.a;
        int i5 = 18;
        utc utcVar = utc.a;
        int i6 = 1;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i2) {
            case 0:
                ku3 ku3Var = (ku3) obj7;
                ksa ksaVar = (ksa) obj6;
                xtc xtcVar = (xtc) obj5;
                xpa xpaVar = (xpa) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var2).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var2;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    boolean i7 = av8Var.i(ku3Var) | av8Var.g(ksaVar);
                    Object O = av8Var.O();
                    if (i7 || O == obj4) {
                        O = new uf8(24, ku3Var, ksaVar);
                        av8Var.n0(O);
                    }
                    aza.c(0, av8Var, l98.f0(xpa.a(xpaVar, xtcVar, 7), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), (Function1) O);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                gv9 gv9Var = (gv9) obj7;
                rgh rghVar = (rgh) obj6;
                String str = (String) obj5;
                of3 of3Var3 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var3;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    boolean i8 = av8Var2.i(rghVar);
                    Object O2 = av8Var2.O();
                    if (i8 || O2 == obj4) {
                        O2 = new mnc(rghVar, 18);
                        av8Var2.n0(O2);
                    }
                    g7a.f(0, av8Var2, gv9Var, null, str, (Function1) O2);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                d2e d2eVar = (d2e) obj7;
                d2e d2eVar2 = (d2e) obj6;
                d2e d2eVar3 = (d2e) obj5;
                of3 of3Var4 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                boolean z3 = (intValue3 & 17) != 16;
                int i9 = intValue3 & 1;
                av8 av8Var3 = (av8) of3Var4;
                if (av8Var3.T(i9, z3)) {
                    u0a.c(d2eVar, d2eVar2, d2eVar3, l98.b0(utcVar, 16.0f), av8Var3, 3072);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 3:
                gv9<RaceFlowModels$RaceEntrant> gv9Var2 = (gv9) obj7;
                gv9 gv9Var3 = (gv9) obj6;
                Object obj8 = (Function1) obj5;
                of3 of3Var5 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((kb8) obj).getClass();
                av8 av8Var4 = (av8) of3Var5;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    for (RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant : gv9Var2) {
                        String str2 = raceFlowModels$RaceEntrant.c;
                        boolean contains = gv9Var3.contains(Integer.valueOf(raceFlowModels$RaceEntrant.a));
                        hrh hrhVar = hrh.m;
                        boolean g = av8Var4.g(obj8) | av8Var4.g(raceFlowModels$RaceEntrant);
                        Object O3 = av8Var4.O();
                        if (g || O3 == obj4) {
                            O3 = new zbe(i5, obj8, raceFlowModels$RaceEntrant);
                            av8Var4.n0(O3);
                        }
                        qha.f(str2, contains, hrhVar, (Function0) O3, null, false, yqo.H(1428496544, av8Var4, new g31(raceFlowModels$RaceEntrant, 6)), null, false, true, null, null, av8Var4, 806879616, 7600);
                    }
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 4:
                String str3 = (String) obj7;
                gv9 gv9Var4 = (gv9) obj6;
                tc3 tc3Var = (tc3) obj5;
                of3 of3Var6 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((kb8) obj).getClass();
                av8 av8Var5 = (av8) of3Var6;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    if (str3 == null) {
                        av8Var5.d0(1653922691);
                        i = 0;
                        av8Var5.s(false);
                    } else {
                        av8Var5.d0(1653922692);
                        long D = lz.D(R.color.n_lv_1, av8Var5);
                        yf8 yf8Var = xth.a;
                        udj.c(str3, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var5, 0, 24960, 110586);
                        i = 0;
                        bf3.u(utcVar, 4.0f, av8Var5, false);
                    }
                    Iterator<E> it = gv9Var4.iterator();
                    while (it.hasNext()) {
                        tc3Var.invoke((ukf) it.next(), av8Var5, Integer.valueOf(i));
                        i = 0;
                    }
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 5:
                wla wlaVar = (wla) obj7;
                e49 e49Var = (e49) obj6;
                ct8 ct8Var = (ct8) obj5;
                int intValue6 = ((Integer) obj).intValue();
                of3 of3Var7 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((av8) of3Var7).e(intValue6) ? 4 : 2;
                }
                av8 av8Var6 = (av8) of3Var7;
                if (av8Var6.T(intValue7 & 1, (intValue7 & 19) != 18)) {
                    Context context = (Context) av8Var6.k(nz.b);
                    int i10 = intValue7 & 14;
                    boolean i11 = av8Var6.i(context) | av8Var6.i(e49Var) | (i10 == 4);
                    Object O4 = av8Var6.O();
                    if (i11 || O4 == obj4) {
                        O4 = new y51(context, e49Var, intValue6, 10);
                        av8Var6.n0(O4);
                    }
                    xtc P = tgj.P(wlaVar, (Function1) O4, av8Var6);
                    w31 w31Var = (w31) e49Var.n.get(intValue6);
                    boolean g2 = av8Var6.g(ct8Var) | (i10 == 4) | av8Var6.i(e49Var);
                    Object O5 = av8Var6.O();
                    if (g2 || O5 == obj4) {
                        O5 = new y51(ct8Var, intValue6, e49Var, 11);
                        av8Var6.n0(O5);
                    }
                    jaa.j(0, w31Var, av8Var6, P, (Function1) O5);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 6:
                String str4 = (String) obj7;
                e1d e1dVar = (e1d) obj6;
                scj scjVar = (scj) obj5;
                Function2 function2 = (Function2) obj;
                of3 of3Var8 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                function2.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((av8) of3Var8).i(function2) ? 4 : 2;
                }
                av8 av8Var7 = (av8) of3Var8;
                if (av8Var7.T(intValue8 & 1, (intValue8 & 19) != 18)) {
                    l8g a = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var7, 54);
                    int hashCode = Long.hashCode(av8Var7.T);
                    aee m = av8Var7.m();
                    xtc C = fqj.C(av8Var7, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var7.h0();
                    if (av8Var7.S) {
                        av8Var7.l(zg3Var);
                    } else {
                        av8Var7.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var7, a, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var7, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var7, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var7, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var7, C, f50Var3);
                    wnn.d(Boolean.FALSE, null, s02.h0(150, 0, null, 6), null, yqo.H(816722291, av8Var7, new vcg(4)), av8Var7, 24960, 10);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode2 = Long.hashCode(av8Var7.T);
                    aee m2 = av8Var7.m();
                    xtc C2 = fqj.C(av8Var7, goaVar);
                    av8Var7.h0();
                    if (av8Var7.S) {
                        av8Var7.l(zg3Var);
                    } else {
                        av8Var7.q0();
                    }
                    waa.K(av8Var7, c, f50Var);
                    waa.K(av8Var7, m2, ff3Var);
                    bf3.s(hashCode2, av8Var7, f50Var2, av8Var7, ryVar);
                    waa.K(av8Var7, C2, f50Var3);
                    if (((String) e1dVar.getValue()).length() == 0) {
                        av8Var7.d0(-1423072769);
                        yf8 yf8Var2 = xth.a;
                        udj.c(str4, null, lz.D(R.color.n_lv_3, av8Var7), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.d(), av8Var7, 0, 24576, 114682);
                        av8Var7.s(false);
                    } else {
                        av8Var7.d0(-1422827032);
                        av8Var7.s(false);
                    }
                    function2.invoke(av8Var7, Integer.valueOf(intValue8 & 14));
                    av8Var7.s(true);
                    fz8.d(((String) e1dVar.getValue()).length() > 0, null, uo5.e(s02.h0(150, 0, null, 6), 2), uo5.f(s02.h0(150, 0, null, 6), 2), null, yqo.H(-633052468, av8Var7, new yya(22, scjVar, e1dVar)), av8Var7, 1600518, 18);
                    av8Var7.s(true);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 7:
                i73 i73Var = (i73) obj7;
                Function1 function1 = (Function1) obj6;
                e93 e93Var = (e93) obj5;
                of3 of3Var9 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                u23 a2 = t23.a(ww9.d, uxf.o, of3Var9, 0);
                av8 av8Var8 = (av8) of3Var9;
                int hashCode3 = Long.hashCode(av8Var8.T);
                aee m3 = av8Var8.m();
                xtc C3 = fqj.C(of3Var9, utcVar);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8 av8Var9 = (av8) of3Var9;
                av8Var9.h0();
                if (av8Var9.S) {
                    av8Var9.l(zg3Var2);
                } else {
                    av8Var9.q0();
                }
                waa.K(of3Var9, a2, hf3.g);
                waa.K(of3Var9, m3, hf3.f);
                waa.K(of3Var9, Integer.valueOf(hashCode3), hf3.j);
                waa.J(of3Var9, hf3.k);
                waa.K(of3Var9, C3, hf3.d);
                nq8.h(of3Var9, bkh.e(utcVar, 8.0f));
                gv9 gv9Var5 = i73Var.h;
                String str5 = i73Var.i;
                boolean g3 = av8Var9.g(function1) | av8Var9.e(e93Var.ordinal());
                Object O6 = av8Var9.O();
                if (g3 || O6 == obj4) {
                    O6 = new ayg(function1, e93Var);
                    av8Var9.n0(O6);
                }
                fyg.i(3072, of3Var9, gv9Var5, bkh.d(utcVar, 1.0f), str5, (Function1) O6);
                av8Var9.s(true);
                return Unit.a;
            case 8:
                vnb vnbVar = (vnb) obj7;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj6;
                Function1 function12 = (Function1) obj5;
                p3e p3eVar = (p3e) obj;
                of3 of3Var10 = (of3) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                p3eVar.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((av8) of3Var10).g(p3eVar) ? 4 : 2;
                }
                av8 av8Var10 = (av8) of3Var10;
                if (av8Var10.T(intValue9 & 1, (intValue9 & 19) != 18)) {
                    ktm.t(vnbVar, n9e.q(utcVar, lz.D(R.color.surface_1, av8Var10), oyn.e), false, null, null, yqo.H(-555114694, av8Var10, new zya(i3, snapshotStateList, function12, p3eVar)), av8Var10, 196608, 28);
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 9:
                SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj7;
                Function1 function13 = (Function1) obj6;
                p3e p3eVar2 = (p3e) obj5;
                p2h p2hVar = (p2h) obj;
                of3 of3Var11 = (of3) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                p2hVar.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((av8) of3Var11).g(p2hVar) ? 4 : 2;
                }
                av8 av8Var11 = (av8) of3Var11;
                if (av8Var11.T(intValue10 & 1, (intValue10 & 19) != 18)) {
                    boolean g4 = av8Var11.g(snapshotStateList2);
                    Object O7 = av8Var11.O();
                    if (g4 || O7 == obj4) {
                        O7 = new fvg(snapshotStateList2, 7);
                        av8Var11.n0(O7);
                    }
                    Function2 function22 = (Function2) O7;
                    boolean g5 = av8Var11.g(function13);
                    Object O8 = av8Var11.O();
                    if (g5 || O8 == obj4) {
                        O8 = new k1e(5, function13);
                        av8Var11.n0(O8);
                    }
                    hz8.v(snapshotStateList2, function22, (Function1) O8, p2hVar.c, l98.a0(utcVar, p3eVar2), av8Var11, 0);
                } else {
                    av8Var11.W();
                }
                return Unit.a;
            case 10:
                n8i n8iVar2 = (n8i) obj7;
                Context context2 = (Context) obj6;
                of3 of3Var12 = (of3) obj2;
                ((Integer) obj3).getClass();
                lv1 lv1Var = uxf.l;
                ((r70) obj).getClass();
                k1c c2 = e12.c(uxf.c, false);
                av8 av8Var12 = (av8) of3Var12;
                int hashCode4 = Long.hashCode(av8Var12.T);
                aee m4 = av8Var12.m();
                xtc C4 = fqj.C(of3Var12, (xtc) obj5);
                if3.k7.getClass();
                zg3 zg3Var3 = hf3.b;
                av8 av8Var13 = (av8) of3Var12;
                av8Var13.h0();
                if (av8Var13.S) {
                    av8Var13.l(zg3Var3);
                } else {
                    av8Var13.q0();
                }
                f50 f50Var4 = hf3.g;
                waa.K(of3Var12, c2, f50Var4);
                ff3 ff3Var2 = hf3.f;
                waa.K(of3Var12, m4, ff3Var2);
                Integer valueOf2 = Integer.valueOf(hashCode4);
                f50 f50Var5 = hf3.j;
                waa.K(of3Var12, valueOf2, f50Var5);
                ry ryVar2 = hf3.k;
                waa.J(of3Var12, ryVar2);
                f50 f50Var6 = hf3.d;
                waa.K(of3Var12, C4, f50Var6);
                if (n8iVar2 == null) {
                    av8Var13.d0(1463643459);
                    av8Var13.s(false);
                    z = true;
                } else {
                    old oldVar2 = n8iVar2.c;
                    wmd wmdVar = n8iVar2.d;
                    av8Var13.d0(1463643460);
                    vmd vmdVar = n8iVar2.a.e == ymd.b ? vmd.DRIVER_INFO : vmd.CONSTRUCTOR_INFO;
                    utc utcVar2 = utc.a;
                    vmd vmdVar2 = vmdVar;
                    xtc d = bkh.d(utcVar2, 1.0f);
                    ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                    kv1 kv1Var = uxf.o;
                    u23 a3 = t23.a(ng0Var, kv1Var, of3Var12, 6);
                    int hashCode5 = Long.hashCode(av8Var13.T);
                    aee m5 = av8Var13.m();
                    xtc C5 = fqj.C(of3Var12, d);
                    av8Var13.h0();
                    if (av8Var13.S) {
                        av8Var13.l(zg3Var3);
                    } else {
                        av8Var13.q0();
                    }
                    waa.K(of3Var12, a3, f50Var4);
                    waa.K(of3Var12, m5, ff3Var2);
                    waa.K(of3Var12, Integer.valueOf(hashCode5), f50Var5);
                    waa.J(of3Var12, ryVar2);
                    waa.K(of3Var12, C5, f50Var6);
                    xtc d2 = bkh.d(utcVar2, 1.0f);
                    l8g a4 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, of3Var12, 54);
                    int hashCode6 = Long.hashCode(av8Var13.T);
                    aee m6 = av8Var13.m();
                    xtc C6 = fqj.C(of3Var12, d2);
                    av8Var13.h0();
                    if (av8Var13.S) {
                        av8Var13.l(zg3Var3);
                    } else {
                        av8Var13.q0();
                    }
                    waa.K(of3Var12, a4, f50Var4);
                    waa.K(of3Var12, m6, ff3Var2);
                    waa.K(of3Var12, Integer.valueOf(hashCode6), f50Var5);
                    waa.J(of3Var12, ryVar2);
                    waa.K(of3Var12, C6, f50Var6);
                    String str6 = wmdVar.f;
                    ServerType serverType3 = wmdVar.b;
                    Integer num = wmdVar.g;
                    wmd wmdVar2 = wmdVar.h;
                    if (str6 != null) {
                        av8Var13.d0(1410717683);
                        td4.k(wmdVar.f, bkh.l(utcVar2, 40.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, of3Var12, 48, 12);
                        av8Var13.s(false);
                    } else if (num != null) {
                        av8Var13.d0(1411062806);
                        td4.i(num, bkh.l(utcVar2, 40.0f), of3Var12, 48);
                        av8Var13.s(false);
                    } else {
                        av8Var13.d0(1411364405);
                        av8Var13.s(false);
                    }
                    xtc g6 = bkh.g(new goa(1.0f, true), 40.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    u23 a5 = t23.a(ww9.g, kv1Var, of3Var12, 6);
                    int hashCode7 = Long.hashCode(av8Var13.T);
                    aee m7 = av8Var13.m();
                    xtc C7 = fqj.C(of3Var12, g6);
                    av8Var13.h0();
                    if (av8Var13.S) {
                        av8Var13.l(zg3Var3);
                    } else {
                        av8Var13.q0();
                    }
                    waa.K(of3Var12, a5, f50Var4);
                    waa.K(of3Var12, m7, ff3Var2);
                    waa.K(of3Var12, Integer.valueOf(hashCode7), f50Var5);
                    waa.J(of3Var12, ryVar2);
                    waa.K(of3Var12, C7, f50Var6);
                    String a6 = wmdVar.c.a(of3Var12);
                    yf8 yf8Var3 = xth.a;
                    udj.c(a6, null, lz.D(R.color.n_lv_1, of3Var12), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), of3Var12, 0, 0, 131066);
                    Long l = wmdVar2 != null ? wmdVar2.d : null;
                    if (l == null) {
                        av8Var13.d0(-885458948);
                        av8Var13.s(false);
                        of3Var = of3Var12;
                    } else {
                        av8Var13.d0(-885458947);
                        of3Var = of3Var12;
                        udj.c(oea.w(R.string.bullet_separator, new Object[]{oea.v(R.string.formula_race, of3Var12), rik.q(l.longValue(), context2)}, of3Var12), null, lz.D(R.color.n_lv_3, of3Var12), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), of3Var, 0, 0, 131066);
                        av8Var13.s(false);
                    }
                    av8Var13.s(true);
                    if (oldVar2.c) {
                        av8Var13.d0(1412752461);
                        n8iVar = n8iVar2;
                        vmd vmdVar3 = n8iVar.f;
                        if (wmdVar2 == null || (serverType2 = wmdVar2.b) == null) {
                            serverType2 = serverType3;
                        }
                        switch (serverType2 == null ? -1 : y5i.a[serverType2.ordinal()]) {
                            case 1:
                            case 2:
                                v5iVar2 = v5i.Practice;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                v5iVar2 = v5i.Qualifying;
                                break;
                            case 7:
                            default:
                                v5iVar2 = v5i.Race;
                                break;
                            case 8:
                                v5iVar2 = v5i.Season;
                                break;
                        }
                        nld.f(oldVar2, vmdVar3, v5iVar2.a, "featured", Integer.valueOf(wmdVar.a), null, false, of3Var, 24960, PsExtractor.AUDIO_STREAM);
                        oldVar = oldVar2;
                        av8Var13.s(false);
                    } else {
                        oldVar = oldVar2;
                        n8iVar = n8iVar2;
                        av8Var13.d0(1413252181);
                        av8Var13.s(false);
                    }
                    av8Var13.s(true);
                    int i12 = wmdVar.a;
                    String str7 = wmdVar.e;
                    fgf fgfVar = n8iVar.b;
                    cgf cgfVar = cgf.c;
                    if (wmdVar2 == null || (serverType = wmdVar2.b) == null) {
                        serverType = serverType3;
                    }
                    switch (serverType == null ? -1 : y5i.a[serverType.ordinal()]) {
                        case 1:
                        case 2:
                            v5iVar = v5i.Practice;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            v5iVar = v5i.Qualifying;
                            break;
                        case 7:
                        default:
                            v5iVar = v5i.Race;
                            break;
                        case 8:
                            v5iVar = v5i.Season;
                            break;
                    }
                    of3 of3Var13 = of3Var;
                    nld.d(i12, str7, null, oldVar, fgfVar, vmdVar2, "featured", null, 0L, false, cgfVar, false, true, v5iVar.a, null, of3Var13, 1573248, 390, 19328);
                    int ordinal = n8iVar.e.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            av8Var13.d0(800736432);
                            udj.c(oea.v(R.string.germany_betting_regulations_text, of3Var13), bkh.d(l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), lz.D(R.color.n_lv_3, of3Var13), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.c(), of3Var13, 48, 24960, 109560);
                            av8Var13.s(false);
                            Unit unit = Unit.a;
                        } else if (ordinal != 3) {
                            av8Var13.d0(-1498139827);
                            av8Var13.s(false);
                            Unit unit2 = Unit.a;
                        } else {
                            av8Var13.d0(801329028);
                            l8g a7 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var, of3Var13, 6);
                            int hashCode8 = Long.hashCode(av8Var13.T);
                            aee m8 = av8Var13.m();
                            xtc C8 = fqj.C(of3Var13, utcVar2);
                            av8Var13.h0();
                            if (av8Var13.S) {
                                av8Var13.l(zg3Var3);
                            } else {
                                av8Var13.q0();
                            }
                            waa.K(of3Var13, a7, f50Var4);
                            waa.K(of3Var13, m8, ff3Var2);
                            waa.K(of3Var13, Integer.valueOf(hashCode8), f50Var5);
                            waa.J(of3Var13, ryVar2);
                            waa.K(of3Var13, C8, f50Var6);
                            wkn.k(haa.t(R.drawable.igaming_eng, 0, of3Var13), null, bkh.e(bkh.p(utcVar2, 74.0f), 21.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, of3Var13, 440, 120);
                            wkn.k(haa.t(R.drawable.igaming_fra, 0, of3Var13), null, bkh.e(bkh.p(utcVar2, 92.0f), 21.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, of3Var13, 440, 120);
                            av8Var13.s(true);
                            av8Var13.s(false);
                            Unit unit3 = Unit.a;
                        }
                        z2 = false;
                        z = true;
                    } else {
                        av8Var13.d0(799653416);
                        xtc b0 = l98.b0(utcVar2, 12.0f);
                        l8g a8 = k8g.a(new ng0(12.0f, true, new a70(6)), lv1Var, of3Var13, 6);
                        int hashCode9 = Long.hashCode(av8Var13.T);
                        aee m9 = av8Var13.m();
                        xtc C9 = fqj.C(of3Var13, b0);
                        av8Var13.h0();
                        if (av8Var13.S) {
                            av8Var13.l(zg3Var3);
                        } else {
                            av8Var13.q0();
                        }
                        waa.K(of3Var13, a8, f50Var4);
                        waa.K(of3Var13, m9, ff3Var2);
                        waa.K(of3Var13, Integer.valueOf(hashCode9), f50Var5);
                        waa.J(of3Var13, ryVar2);
                        waa.K(of3Var13, C9, f50Var6);
                        wkn.l(s6a.N(R.drawable.eeep_logo, 6, of3Var13), bkh.l(utcVar2, 24.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new ay1(lz.D(R.color.n_lv_3, of3Var13), 5), of3Var13, 432, 56);
                        udj.c(oea.v(R.string.greek_betting_regulations_text, of3Var13), null, lz.D(R.color.n_lv_3, of3Var13), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), of3Var13, 0, 0, 131066);
                        z = true;
                        av8Var13.s(true);
                        z2 = false;
                        av8Var13.s(false);
                        Unit unit4 = Unit.a;
                    }
                    av8Var13.s(z);
                    av8Var13.s(z2);
                }
                av8Var13.s(z);
                return Unit.a;
            case 11:
                lwi lwiVar = (lwi) obj7;
                Function1 function14 = (Function1) obj6;
                Function1 function15 = (Function1) obj5;
                kb8 kb8Var = (kb8) obj;
                of3 of3Var14 = (of3) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                kb8Var.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((av8) of3Var14).g(kb8Var) ? 4 : 2;
                }
                av8 av8Var14 = (av8) of3Var14;
                if (av8Var14.T(intValue11 & 1, (intValue11 & 19) != 18)) {
                    int i13 = 0;
                    for (Object obj9 : lwiVar.d) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            b.q();
                            throw null;
                        }
                        vvi vviVar = (vvi) obj9;
                        av8Var14.a0(62958520, Integer.valueOf(i13));
                        xtc a9 = kb8Var.a(1.0f, utcVar, true);
                        Object O9 = av8Var14.O();
                        if (O9 == obj4) {
                            O9 = new rfi(23);
                            av8Var14.n0(O9);
                        }
                        Function1 function16 = (Function1) O9;
                        Object O10 = av8Var14.O();
                        if (O10 == obj4) {
                            O10 = new rfi(24);
                            av8Var14.n0(O10);
                        }
                        l98.b(vviVar, a9, function16, null, "calendar_item_crossfade", (Function1) O10, yqo.H(-1663858326, av8Var14, new qb7(function14, function15, i6)), av8Var14, 1794432, 8);
                        av8Var14.s(false);
                        i13 = i14;
                    }
                } else {
                    av8Var14.W();
                }
                return Unit.a;
            case 12:
                return a(obj, obj2, obj3);
            case 13:
                of3 of3Var15 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                x2a.d(oea.v(R.string.disclaimer_based_on_available_data, of3Var15), l98.f0(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), null, 0L, 0L, lz.D(R.color.surface_2, of3Var15), null, yqo.H(1340607573, of3Var15, new mfh(i4, (Context) obj7, (e1d) obj6, (String) obj5)), uxf.l, 8.0f, null, of3Var15, 918552624, 0, 1116);
                return Unit.a;
            case 14:
                return b(obj, obj2, obj3);
            case 15:
                return c(obj, obj2, obj3);
            case 16:
                return d(obj, obj2, obj3);
            default:
                Bitmap bitmap = (Bitmap) obj7;
                Integer num2 = (Integer) obj5;
                of3 of3Var16 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((o8g) obj).getClass();
                nq8.g(j72.x(gz8.E(c5n.t(h5a.N(o8g.a(), 8.0f), new h1g(R.color.on_color_highlight_2)), 8.0f), new x9g(LaunchSearchActivity.class, zm2.A((lc[]) Arrays.copyOf(new lc[0], 0)))), 0, 1, yqo.H(-1344161691, of3Var16, new tu5((Context) obj6, i3)), of3Var16, 3072, 2);
                aba.i(nq8.N(ty8.a, 16.0f), of3Var16, 0);
                if (bitmap != null) {
                    av8 av8Var15 = (av8) of3Var16;
                    av8Var15.d0(-2049436822);
                    bx1 bx1Var = new bx1(bitmap);
                    vy8 K = nq8.K(32.0f);
                    if (num2 != null) {
                        vy8 x = j72.x(K, new x9g(LaunchTeamMatchesAction.class, zm2.A((lc[]) Arrays.copyOf(new lc[]{new lc(fz8.n, Integer.valueOf(num2.intValue()))}, 1))));
                        if (x != null) {
                            vy8Var = x;
                            c5n.n(bx1Var, vy8Var, 0, null, av8Var15, 48, 24);
                            av8Var15.s(false);
                        }
                    }
                    vy8Var = K;
                    c5n.n(bx1Var, vy8Var, 0, null, av8Var15, 48, 24);
                    av8Var15.s(false);
                } else {
                    av8 av8Var16 = (av8) of3Var16;
                    av8Var16.d0(-2049006821);
                    c5n.n(new v20(R.drawable.team_logo_placeholder), nq8.K(32.0f), 0, new t13(new fjj(new h1g(R.color.on_color_secondary))), av8Var16, 32816, 8);
                    av8Var16.s(false);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ zya(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ zya(e1d e1dVar, String str, e1d e1dVar2, scj scjVar) {
        this.a = 6;
        this.b = str;
        this.c = e1dVar2;
        this.d = scjVar;
    }

    public /* synthetic */ zya(imh imhVar, ku3 ku3Var, w3l w3lVar) {
        this.a = 14;
        this.c = imhVar;
        this.b = ku3Var;
        this.d = w3lVar;
    }
}
