package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.blaze.blazesdk.ads.custom_native.models.BlazeGoogleCustomNativeAdModel;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.search.ui.SearchActivity;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamStatus;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.blaze.blazesdk.features.videos.players.ui.a;
import com.blaze.blazesdk.players.ui.BackToLiveButtonView;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.g0;
import com.blaze.blazesdk.shared.results.l;
import com.blaze.blazesdk.shared.results.n;
import com.blaze.blazesdk.shared.results.p;
import com.blaze.blazesdk.shared.results.q;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerBackToLiveButtonStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import com.sofascore.local_persistance.BrandingFeaturedTournament;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.wc26.bottomSheet.WorldCupTeamPickerBottomSheet;
import com.unity3d.services.UnityAdsConstants;
import defpackage.gim;
import defpackage.n4m;
import defpackage.w3m;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class bcl implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bcl(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yil yilVar;
        sil silVar;
        sil silVar2;
        ofl oflVar;
        boolean z;
        boolean z2;
        gv9 gv9Var;
        yil yilVar2;
        gv9 gv9Var2;
        gv9 gv9Var3;
        ywl ywlVar;
        n4m D;
        Date date;
        aim aimVar;
        VideoModel videoModel;
        int i = this.a;
        int i2 = 7;
        int i3 = 17;
        int i4 = -1;
        int i5 = 11;
        int i6 = 2;
        int i7 = 0;
        yil yilVar3 = null;
        r14 = null;
        r14 = null;
        BlazeLiveStreamStatus blazeLiveStreamStatus = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                ((ccl) obj3).b.a0(glgVar, (acl) obj2);
                return Unit.a;
            case 1:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                ((ecl) obj3).b.a0(glgVar2, (dcl) obj2);
                return Unit.a;
            case 2:
                String str = (String) obj3;
                qcl qclVar = (qcl) obj2;
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                nlg V0 = glgVar3.V0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    V0.L(1, str);
                    dh0 dh0Var = new dh0(0);
                    dh0 dh0Var2 = new dh0(0);
                    while (V0.U0()) {
                        String F0 = V0.F0(0);
                        if (!dh0Var.containsKey(F0)) {
                            dh0Var.put(F0, new ArrayList());
                        }
                        String F02 = V0.F0(0);
                        if (!dh0Var2.containsKey(F02)) {
                            dh0Var2.put(F02, new ArrayList());
                        }
                    }
                    V0.reset();
                    qclVar.b(glgVar3, dh0Var);
                    qclVar.a(glgVar3, dh0Var2);
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        String F03 = V0.F0(i7);
                        sbl E = sha.E((int) V0.getLong(1));
                        byte[] blob = V0.getBlob(i6);
                        md4 md4Var = md4.b;
                        md4 y = ww9.y(blob);
                        int i8 = (int) V0.getLong(3);
                        int i9 = (int) V0.getLong(4);
                        long j = V0.getLong(14);
                        long j2 = V0.getLong(15);
                        long j3 = V0.getLong(16);
                        zy0 B = sha.B((int) V0.getLong(i3));
                        long j4 = V0.getLong(18);
                        long j5 = V0.getLong(19);
                        int i10 = (int) V0.getLong(20);
                        long j6 = V0.getLong(21);
                        int i11 = (int) V0.getLong(22);
                        zm3 zm3Var = new zm3(sha.Y(V0.getBlob(6)), sha.C((int) V0.getLong(5)), ((int) V0.getLong(7)) != 0, ((int) V0.getLong(8)) != 0, ((int) V0.getLong(9)) != 0, ((int) V0.getLong(10)) != 0, V0.getLong(11), V0.getLong(12), sha.o(V0.getBlob(13)));
                        Object a = rub.a(V0.F0(0), dh0Var);
                        a.getClass();
                        List list = (List) a;
                        Object a2 = rub.a(V0.F0(0), dh0Var2);
                        a2.getClass();
                        arrayList.add(new kcl(F03, E, y, j, j2, j3, zm3Var, i8, B, j4, j5, i10, i9, j6, i11, list, (List) a2));
                        i7 = 0;
                        i3 = 17;
                        i6 = 2;
                    }
                    return arrayList;
                } catch (Throwable th) {
                    throw th;
                }
            case 3:
                sbl sblVar = (sbl) obj3;
                String str2 = (String) obj2;
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                nlg V02 = glgVar4.V0("UPDATE workspec SET state=? WHERE id=?");
                try {
                    V02.q(1, sha.X(sblVar));
                    V02.L(2, str2);
                    V02.U0();
                    int y2 = u0a.y(glgVar4);
                    V02.close();
                    return Integer.valueOf(y2);
                } finally {
                }
            case 4:
                md4 md4Var2 = (md4) obj3;
                String str3 = (String) obj2;
                glg glgVar5 = (glg) obj;
                glgVar5.getClass();
                nlg V03 = glgVar5.V0("UPDATE workspec SET output=? WHERE id=?");
                try {
                    md4 md4Var3 = md4.b;
                    V03.r(1, ww9.I(md4Var2));
                    V03.L(2, str3);
                    V03.U0();
                    V03.close();
                    return Unit.a;
                } finally {
                }
            case 5:
                glg glgVar6 = (glg) obj;
                glgVar6.getClass();
                ((scl) obj3).b.a0(glgVar6, (rcl) obj2);
                return Unit.a;
            case 6:
                WorldCupTeamPickerBottomSheet worldCupTeamPickerBottomSheet = (WorldCupTeamPickerBottomSheet) obj3;
                uv3 uv3Var = (uv3) obj;
                uv3Var.getClass();
                String str4 = (String) ((e1d) obj2).getValue();
                String str5 = uv3Var.b;
                if (!Intrinsics.c(str4, str5)) {
                    worldCupTeamPickerBottomSheet.D = true;
                    FragmentActivity activity = worldCupTeamPickerBottomSheet.getActivity();
                    rq3 rq3Var = null;
                    BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
                    qkl L = worldCupTeamPickerBottomSheet.L();
                    bcl bclVar = new bcl(i2, baseActivity, uv3Var);
                    str5.getClass();
                    xw3.L(un0.z(L), null, null, new z23(L, str5, bclVar, rq3Var, 25), 3);
                }
                worldCupTeamPickerBottomSheet.j();
                return Unit.a;
            case 7:
                BaseActivity baseActivity2 = (BaseActivity) obj3;
                uv3 uv3Var2 = (uv3) obj2;
                int intValue = ((Integer) obj).intValue();
                if (baseActivity2 != null) {
                    p4h.t(baseActivity2, false, new y51(baseActivity2, intValue, uv3Var2, i3), null, 56);
                }
                return Unit.a;
            case 8:
                gv9 gv9Var4 = (gv9) obj3;
                xil xilVar = (xil) obj2;
                oil oilVar = (oil) obj;
                oilVar.getClass();
                yil yilVar4 = oilVar.t;
                if (yilVar4 != null) {
                    if (gv9Var4 == null) {
                        gv9Var4 = rlh.b;
                    }
                    yilVar = yil.a(yilVar4, gv9Var4, xilVar, 1);
                } else {
                    yilVar = null;
                }
                return oil.a(oilVar, null, null, null, null, null, false, null, false, false, null, null, false, null, null, null, null, null, null, null, yilVar, null, null, null, null, null, 33030143);
            case 9:
                qkl qklVar = (qkl) obj3;
                String str6 = (String) obj2;
                oil oilVar2 = (oil) obj;
                oilVar2.getClass();
                oil oilVar3 = (oil) qklVar.l().a();
                if (oilVar3 == null || (silVar2 = oilVar3.o) == null) {
                    silVar = null;
                } else {
                    gv9 gv9Var5 = (gv9) qklVar.I.get(str6);
                    if (gv9Var5 == null) {
                        gv9Var5 = rlh.b;
                    }
                    silVar = sil.a(silVar2, str6, null, gv9Var5, 2);
                }
                return oil.a(oilVar2, null, null, null, null, null, false, null, false, false, null, null, false, null, null, silVar, null, null, null, null, null, null, null, null, null, null, 33538047);
            case 10:
                oil oilVar4 = (oil) obj3;
                qkl qklVar2 = (qkl) obj2;
                oil oilVar5 = (oil) obj;
                iel ielVar = oilVar4.a;
                tee teeVar = oilVar4.b;
                ofl oflVar2 = oilVar4.c;
                boolean z3 = oilVar4.l;
                sxa sxaVar = oilVar5.d;
                sxa sxaVar2 = oilVar4.d;
                if (sxaVar != null) {
                    if (sxaVar2 == null || (gv9Var3 = sxaVar2.b) == null) {
                        gv9Var3 = rlh.b;
                    }
                    sxaVar2 = sxa.a(sxaVar, gv9Var3, null, null, false, null, 61);
                }
                sxa sxaVar3 = sxaVar2;
                boolean z4 = oilVar4.h;
                boolean z5 = oilVar4.i;
                old oldVar = oilVar4.e;
                boolean z6 = oilVar4.f;
                gv9 gv9Var6 = oilVar4.j;
                gv9 gv9Var7 = oilVar4.k;
                gv9 gv9Var8 = oilVar4.m;
                BrandingFeaturedTournament brandingFeaturedTournament = oilVar4.n;
                gv9 gv9Var9 = oilVar4.p;
                bgl bglVar = oilVar4.y;
                sil silVar3 = oilVar5.o;
                sil silVar4 = oilVar4.o;
                if (silVar3 != null) {
                    if (silVar4 == null || (gv9Var2 = silVar4.b) == null) {
                        gv9Var2 = silVar3.b;
                    }
                    oflVar = oflVar2;
                    z = z3;
                    gv9 gv9Var10 = (gv9) qklVar2.I.get(silVar3.a);
                    if (gv9Var10 == null) {
                        gv9Var10 = silVar3.c;
                    }
                    z2 = z4;
                    silVar4 = sil.a(silVar3, null, gv9Var2, gv9Var10, 1);
                } else {
                    oflVar = oflVar2;
                    z = z3;
                    z2 = z4;
                }
                sil silVar5 = silVar4;
                gv9 gv9Var11 = oilVar4.q;
                gv9 gv9Var12 = oilVar4.r;
                efl eflVar = oilVar4.s;
                yil yilVar5 = oilVar5.t;
                if (yilVar5 != null) {
                    gv9 gv9Var13 = (gv9) qklVar2.J.get(yilVar5.c);
                    if (gv9Var13 == null) {
                        gv9Var13 = yilVar5.b;
                    }
                    gv9Var = gv9Var11;
                    yilVar2 = yil.a(yilVar5, gv9Var13, null, 5);
                } else {
                    gv9Var = gv9Var11;
                    yilVar2 = oilVar4.t;
                }
                yil yilVar6 = yilVar2;
                mjl mjlVar = oilVar4.u;
                if (mjlVar == null) {
                    mjlVar = oilVar5.u;
                }
                mjl mjlVar2 = mjlVar;
                cgl cglVar = oilVar4.v;
                if (cglVar == null) {
                    cglVar = oilVar5.v;
                }
                cgl cglVar2 = cglVar;
                xxi xxiVar = oilVar4.w;
                if (xxiVar == null) {
                    xxiVar = oilVar5.w;
                }
                xxi xxiVar2 = xxiVar;
                gv9 gv9Var14 = oilVar4.x;
                if (gv9Var14 == null) {
                    gv9Var14 = oilVar5.x;
                }
                return oil.a(oilVar5, ielVar, teeVar, oflVar, sxaVar3, oldVar, z6, null, z2, z5, gv9Var6, gv9Var7, z, gv9Var8, brandingFeaturedTournament, silVar5, gv9Var9, gv9Var, gv9Var12, eflVar, yilVar6, mjlVar2, cglVar2, xxiVar2, gv9Var14, bglVar, 64);
            case 11:
                qkl qklVar3 = (qkl) obj3;
                xil xilVar2 = (xil) obj2;
                oil oilVar6 = (oil) obj;
                yil yilVar7 = oilVar6.t;
                if (yilVar7 != null) {
                    gv9 gv9Var15 = (gv9) qklVar3.J.get(xilVar2);
                    if (gv9Var15 == null) {
                        gv9Var15 = rlh.b;
                    }
                    yilVar3 = yil.a(yilVar7, gv9Var15, null, 5);
                }
                return oil.a(oilVar6, null, null, null, null, null, false, null, false, false, null, null, false, null, null, null, null, null, null, null, yilVar3, null, null, null, null, null, 33030143);
            case 12:
                gll gllVar = (gll) obj3;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                gv9 gv9Var16 = gllVar.a;
                esaVar.a(gv9Var16.size(), new wsd(25, new t6j(24), gv9Var16), new dyg(gv9Var16, 12), new tc3(2039820996, new l46(gv9Var16, gllVar, (Function1) obj2, i5), true));
                return Unit.a;
            case 13:
                SearchActivity searchActivity = (SearchActivity) obj3;
                String str7 = (String) obj;
                str7.getClass();
                ((e1d) obj2).setValue(str7);
                if (str7.length() == 0) {
                    prl prlVar = (prl) searchActivity.b.getValue();
                    prlVar.g();
                    prlVar.f();
                }
                return Unit.a;
            case 14:
                c1m c1mVar = (c1m) obj3;
                n4m n4mVar = (n4m) obj2;
                dke dkeVar = (dke) obj;
                dkeVar.getClass();
                g0 qVar = new q();
                fdi fdiVar = c1mVar.K;
                switch (dkeVar.a) {
                    case 2001:
                    case 2002:
                        qVar = new p();
                        qVar.f = dkeVar;
                        j1m.a(qVar);
                        ywlVar = ywl.i;
                        i7 = 1;
                        break;
                    case 2003:
                    default:
                        ywlVar = ywl.g;
                        i7 = 1;
                        break;
                    case 2004:
                        n4m D2 = c1mVar.D();
                        if ((D2 != null ? D2.h : null) != null && ((D = c1mVar.D()) == null || (date = D.h) == null || !date.after(new Date()))) {
                            ywlVar = ywl.g;
                        } else {
                            qVar = new l();
                            ywlVar = ywl.e;
                        }
                        i7 = 1;
                        break;
                    case 2005:
                        n4m D3 = c1mVar.D();
                        if (!((D3 != null ? D3.c : null) instanceof n4m.a.C1353a)) {
                            ywlVar = ywl.g;
                            i7 = 1;
                            break;
                        } else {
                            ywlVar = ywl.f;
                            break;
                        }
                }
                fdiVar.l(ywlVar);
                if (i7 != 0) {
                    qVar.f = dkeVar;
                    qVar.g = i9a.p("id", n4mVar.a);
                    j1m.a(qVar);
                }
                return Unit.a;
            case 15:
                w3m w3mVar = (w3m) obj3;
                n4m n4mVar2 = (n4m) obj2;
                n4m n4mVar3 = (n4m) obj;
                if (n4mVar3 != null) {
                    w3mVar.o(n4mVar3, null);
                    ArrayList U0 = CollectionsKt.U0(w3mVar.t);
                    Iterator it = U0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (i7 < 0) {
                                b.q();
                                throw null;
                            }
                            if (((n4m) next).o > n4mVar2.o) {
                                i4 = i7;
                            } else {
                                i7++;
                            }
                        }
                    }
                    Integer valueOf = i4 >= 0 ? Integer.valueOf(i4) : null;
                    int intValue2 = valueOf != null ? valueOf.intValue() : U0.size();
                    if (w3mVar.Q0 >= intValue2) {
                        gim gimVar = n4mVar3.b;
                        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel = gimVar instanceof gim.a ? ((gim.a) gimVar).a : null;
                        if (blazeGoogleCustomNativeAdModel != null) {
                            pwl pwlVar = pwl.a;
                            pwl.b.put(123456, blazeGoogleCustomNativeAdModel);
                        }
                    } else {
                        U0.add(intValue2, n4mVar3);
                        w3mVar.t = U0;
                        if (!U0.isEmpty()) {
                            fdi fdiVar2 = w3mVar.u;
                            fdiVar2.getClass();
                            fdiVar2.m(null, U0);
                        }
                    }
                }
                return Unit.a;
            case 16:
                List list2 = (List) obj3;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                esa.e(esaVar2, list2.size(), null, null, new tc3(1165847850, new ktl(list2, (Function1) obj2), true), 6);
                return Unit.a;
            case 17:
                n4m n4mVar4 = (n4m) obj2;
                gq5 gq5Var = (gq5) obj;
                boolean z7 = efm.j;
                gq5Var.getClass();
                n nVar = new n();
                nVar.f = gq5Var.c;
                xlm xlmVar = ((efm) obj3).d;
                nVar.g = tub.h(new Pair("storyId", String.valueOf(xlmVar != null ? xlmVar.a : null)), new Pair("pageId", n4mVar4.a));
                j1m.a(nVar);
                return Unit.a;
            case 18:
                efm efmVar = (efm) obj3;
                eqm eqmVar = (eqm) obj2;
                View view = (View) obj;
                boolean z8 = efm.j;
                view.getClass();
                xyl xylVar = efmVar.i;
                if (xylVar != null && xylVar.c && eqmVar.d()) {
                    evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                    obm obmVar = (obm) efmVar.c;
                    obmVar.getClass();
                    try {
                        ((ilm) obmVar.getViewModel()).k(n1n.a, false);
                        arl.b(obmVar.getActivity(), eqmVar);
                    } catch (Throwable th2) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                    }
                }
                return Unit.a;
            case 19:
                String str8 = (String) obj;
                int i12 = dlm.o;
                str8.getClass();
                syl sylVar = (syl) ((dlm) obj3).c;
                sylVar.getClass();
                ((n4m) obj2).getClass();
                try {
                    ((sqm) sylVar.getViewModel()).getClass();
                    sylVar.i(BlazePlayerType.MOMENTS, str8);
                } catch (Throwable th3) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th3, null);
                }
                return Unit.a;
            case 20:
                dlm dlmVar = (dlm) obj3;
                eqm eqmVar2 = (eqm) obj2;
                View view2 = (View) obj;
                int i13 = dlm.o;
                view2.getClass();
                xyl xylVar2 = dlmVar.n;
                if (xylVar2 != null && xylVar2.c && eqmVar2.d()) {
                    evl.animateAndVibrate$default(view2, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                    syl sylVar2 = (syl) dlmVar.c;
                    sylVar2.getClass();
                    try {
                        arl.b(sylVar2.getActivity(), eqmVar2);
                    } catch (Throwable th4) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th4, null);
                    }
                }
                return Unit.a;
            case 21:
                sqm sqmVar = (sqm) obj3;
                n4m n4mVar5 = (n4m) obj2;
                n4m n4mVar6 = (n4m) obj;
                if (n4mVar6 != null) {
                    BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = sqmVar.u0;
                    if (blazeMomentsPlayerStyle == null || (aimVar = y9m.a(blazeMomentsPlayerStyle)) == null) {
                        aimVar = mcm.a;
                    }
                    sqmVar.o(n4mVar6, (List) e7m.a(aimVar).invoke(n4mVar6));
                    ArrayList U02 = CollectionsKt.U0(sqmVar.t);
                    Iterator it2 = U02.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            if (i7 < 0) {
                                b.q();
                                throw null;
                            }
                            if (((n4m) next2).o > n4mVar5.o) {
                                i4 = i7;
                            } else {
                                i7++;
                            }
                        }
                    }
                    Integer valueOf2 = i4 >= 0 ? Integer.valueOf(i4) : null;
                    int intValue3 = valueOf2 != null ? valueOf2.intValue() : U02.size();
                    if (sqmVar.C0 >= intValue3) {
                        gim gimVar2 = n4mVar6.b;
                        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel2 = gimVar2 instanceof gim.a ? ((gim.a) gimVar2).a : null;
                        if (blazeGoogleCustomNativeAdModel2 != null) {
                            pwl pwlVar2 = pwl.a;
                            pwl.b.put(123456, blazeGoogleCustomNativeAdModel2);
                        }
                    } else {
                        U02.add(intValue3, n4mVar6);
                        sqmVar.t = U02;
                        if (!U02.isEmpty()) {
                            fdi fdiVar3 = sqmVar.u;
                            fdiVar3.getClass();
                            fdiVar3.m(null, U02);
                        }
                    }
                }
                return Unit.a;
            case 22:
                evl.dispatchOnMain$default(BlazeSDK.INSTANCE, null, new czm((pxm) obj3, (n4m) obj, (Function1) obj2, null), 1, null);
                return Unit.a;
            case 23:
                uxm uxmVar = (uxm) obj;
                boolean z9 = e0n.n;
                uxmVar.getClass();
                ImageView imageView = uxmVar.p;
                imageView.getClass();
                imageView.setVisibility(8);
                e0n.updatePlayerOverlayVisibility$default((e0n) obj3, (wpm) obj2, false, 2, null);
                return Unit.a;
            case 24:
                e0n e0nVar = (e0n) obj2;
                uxm uxmVar2 = (uxm) obj;
                boolean z10 = e0n.n;
                uxmVar2.getClass();
                BlazeVideosPlayerBackToLiveButtonStyle backToLiveButton$blazesdk_release = ((BlazeVideosPlayerStyle) obj3).getBackToLiveButton$blazesdk_release();
                n4m n4mVar7 = e0nVar.d;
                if (n4mVar7 != null) {
                    gim gimVar3 = n4mVar7.b;
                    gim.e eVar = gimVar3 instanceof gim.e ? (gim.e) gimVar3 : null;
                    if (eVar != null && (videoModel = eVar.a) != null) {
                        blazeLiveStreamStatus = videoModel.s;
                    }
                }
                BlazeLiveStreamStatus blazeLiveStreamStatus2 = BlazeLiveStreamStatus.LIVE;
                BackToLiveButtonView backToLiveButtonView = uxmVar2.g;
                if (blazeLiveStreamStatus != blazeLiveStreamStatus2) {
                    backToLiveButtonView.getClass();
                    backToLiveButtonView.setVisibility(8);
                    return Unit.a;
                }
                backToLiveButtonView.setupView(backToLiveButton$blazesdk_release);
                backToLiveButtonView.setOnClickListener(new ivj(i5, backToLiveButtonView, e0nVar));
                backToLiveButtonView.setVisibility(0);
                return Unit.a;
            default:
                eqm eqmVar3 = (eqm) obj3;
                e0n e0nVar2 = (e0n) obj2;
                View view3 = (View) obj;
                boolean z11 = e0n.n;
                view3.getClass();
                evl.animateAndVibrate$default(view3, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                xyl xylVar3 = e0nVar2.i;
                if (xylVar3 == null || !xylVar3.c || !eqmVar3.d()) {
                    eqmVar3 = null;
                }
                a aVar = (a) e0nVar2.c;
                aVar.getClass();
                try {
                    w3m w3mVar2 = (w3m) aVar.getViewModel();
                    if (eqmVar3 != null) {
                        yda ydaVar = w3mVar2.M0;
                        if (ydaVar != null) {
                            ydaVar.e(null);
                        }
                    } else {
                        w3mVar2.getClass();
                        w3mVar2.h0(new w3m.a.b(true));
                    }
                    if (eqmVar3 != null) {
                        arl.b(aVar.getActivity(), eqmVar3);
                    }
                } catch (Throwable th5) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th5, null);
                }
                return Unit.a;
        }
    }
}
