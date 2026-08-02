package defpackage;

import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.blazesdk.ads.models.ui.BlazeMomentsAdsConfigType;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.EventNavigationDirection;
import com.blaze.blazesdk.analytics.enums.PlaybackSpeedType;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsMoments;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.delegates.models.BlazeShareParams;
import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import com.blaze.blazesdk.features.moments.models.ui.a;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.players.models.J;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.y0;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerButtonStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerButtonsStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerFirstTimeSlideStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.unity3d.services.UnityAdsConstants;
import defpackage.gim;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sqm extends c1m {
    public final hof A0;
    public BlazeMomentsAdsConfigType B0;
    public int C0;
    public boolean l0;
    public String n0;
    public boolean o0;
    public int q0;
    public B r0;
    public BlazeMomentsPlayerStyle u0;
    public boolean v0;
    public long w0;
    public a y0;
    public final aeh z0;
    public final gum k0 = gum.b;
    public int m0 = -1;
    public List p0 = km5.a;
    public final com.blaze.blazesdk.ads.custom_native.a s0 = new com.blaze.blazesdk.ads.custom_native.a();
    public BlazeCachingLevel t0 = BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release();
    public float x0 = 1.0f;

    public sqm() {
        aeh a = beh.a(0, 1, a62.b);
        this.z0 = a;
        this.A0 = un0.t(a);
        x5m.safeViewModelScopeIO$default(this, null, new bjm(this, null), 1, null);
        x5m.safeViewModelScopeIO$default(this, null, new mmm(this, null), 1, null);
        this.C0 = -1;
    }

    public static final Object W(sqm sqmVar, a6m a6mVar, Function1 function1, h3m h3mVar) {
        sqmVar.getClass();
        y0 y0Var = new y0();
        y0Var.f = a6mVar.a();
        y0Var.g = fn0.p("sourceId", sqmVar.H());
        j1m.a(y0Var);
        Object b = evl.b(function1, y0Var.d(), h3mVar);
        return b == lu3.a ? b : Unit.a;
    }

    public static final Object X(sqm sqmVar, List list, Function1 function1, h3m h3mVar) {
        BlazeMomentsPlayerButtonsStyle buttons;
        BlazeMomentsPlayerButtonStyle exit;
        sqmVar.getClass();
        if (!list.isEmpty()) {
            try {
                ArrayList d0 = sqmVar.d0(list);
                if (!d0.isEmpty()) {
                    ArrayList a = i6m.a(d0);
                    i7m i7mVar = (i7m) sqmVar.b0.getValue();
                    BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = sqmVar.u0;
                    boolean isVisibleForAds = (blazeMomentsPlayerStyle == null || (buttons = blazeMomentsPlayerStyle.getButtons()) == null || (exit = buttons.getExit()) == null) ? false : exit.isVisibleForAds();
                    BlazeMomentsAdsConfigType blazeMomentsAdsConfigType = sqmVar.B0;
                    if (blazeMomentsAdsConfigType == null) {
                        blazeMomentsAdsConfigType = BlazeMomentsAdsConfigType.EVERY_X_MOMENTS;
                    }
                    ArrayList f = ((v0m) i7mVar).f(a, 0, blazeMomentsAdsConfigType, isVisibleForAds);
                    ArrayList U0 = CollectionsKt.U0(sqmVar.p0);
                    U0.addAll(f);
                    ArrayList Y = Y(U0);
                    sqmVar.p0 = Y;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = Y.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        gim gimVar = ((n4m) next).b;
                        if (!(gimVar instanceof gim.c) || !((gim.c) gimVar).a.a) {
                            arrayList.add(next);
                        }
                    }
                    sqmVar.t = arrayList;
                    if (!arrayList.isEmpty()) {
                        fdi fdiVar = sqmVar.u;
                        fdiVar.getClass();
                        fdiVar.m(null, arrayList);
                    }
                }
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        }
        Unit unit = Unit.a;
        Object c = evl.c(function1, new BlazeResult.Success(unit), h3mVar);
        return c == lu3.a ? c : unit;
    }

    public static ArrayList Y(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            n4m copy$default = n4m.copy$default((n4m) obj, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 0, 0, null, null, null, null, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8388607, null);
            copy$default.o = i;
            arrayList2.add(copy$default);
            i = i2;
        }
        return arrayList2;
    }

    public static final void c0(sqm sqmVar, List list, BlazeMomentsAdsConfigType blazeMomentsAdsConfigType) {
        BlazeMomentsPlayerButtonsStyle buttons;
        BlazeMomentsPlayerButtonStyle exit;
        sqmVar.B0 = blazeMomentsAdsConfigType;
        ArrayList a = i6m.a(list);
        i7m i7mVar = (i7m) sqmVar.b0.getValue();
        int i = sqmVar.m0;
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = sqmVar.u0;
        ArrayList f = ((v0m) i7mVar).f(a, i, blazeMomentsAdsConfigType, (blazeMomentsPlayerStyle == null || (buttons = blazeMomentsPlayerStyle.getButtons()) == null || (exit = buttons.getExit()) == null) ? false : exit.isVisibleForAds());
        sqmVar.p0 = f;
        ArrayList Y = Y(f);
        sqmVar.p0 = Y;
        ArrayList arrayList = new ArrayList();
        Iterator it = Y.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            gim gimVar = ((n4m) next).b;
            if (!(gimVar instanceof gim.c) || !((gim.c) gimVar).a.a) {
                arrayList.add(next);
            }
        }
        sqmVar.t = arrayList;
        if (arrayList.isEmpty()) {
            return;
        }
        fdi fdiVar = sqmVar.u;
        fdiVar.getClass();
        fdiVar.m(null, arrayList);
    }

    @Override // defpackage.c1m
    public final t I() {
        return this.k0;
    }

    @Override // defpackage.c1m
    public final void N() {
        n4m D = D();
        gim gimVar = D != null ? D.b : null;
        if (gimVar instanceof gim.b) {
            ysm.d(this, EventActionName.PLAYBACK_INITIAL_START, ysm.createMomentsPlayerProps$default(this, (gim.b) gimVar, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048574, null));
        } else if (gimVar instanceof gim.a) {
            ysm.b(this, EventActionName.PLAYBACK_INITIAL_START, ysm.createMomentsPlayerAdProps$default(this, (gim.a) gimVar, null, null, false, false, 30, null));
        }
    }

    @Override // defpackage.c1m
    public final void O() {
        ysm.g(this, H.APP_BACKGROUND);
    }

    @Override // defpackage.c1m
    public final void P() {
        B b = this.r0;
        if (b != null) {
            J j = J.b;
            j.getClass();
            b.b = j;
        }
        ysm.h(this);
    }

    public final BlazeContentExtraInfo U(Integer num) {
        Map map;
        Map map2;
        n4m n4mVar;
        gim gimVar;
        gim gimVar2;
        com.blaze.blazesdk.app_configurations.models.ads.b bVar = ((v0m) ((i7m) this.b0.getValue())).c;
        Map map3 = null;
        if (bVar instanceof com.blaze.blazesdk.app_configurations.models.ads.a) {
            if (num == null) {
                return new BlazeContentExtraInfo(null, null, null, null, null, 31, null);
            }
            kotlin.ranges.a h = llf.h(num.intValue() - 1, 0);
            int i = h.a;
            int i2 = h.b;
            int i3 = h.c;
            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                while (true) {
                    n4mVar = (n4m) this.p0.get(i);
                    if (!(n4mVar.c instanceof p7m)) {
                        break;
                    }
                    if (i == i2) {
                        break;
                    }
                    i += i3;
                }
            }
            n4mVar = null;
            n4m n4mVar2 = (n4m) CollectionsKt.a0(num.intValue(), this.p0);
            Map mergedExtraInfo$default = (n4mVar == null || (gimVar2 = n4mVar.b) == null) ? null : yjm.mergedExtraInfo$default(gimVar2, null, 1, null);
            if (n4mVar2 != null && (gimVar = n4mVar2.b) != null) {
                map3 = yjm.mergedExtraInfo$default(gimVar, null, 1, null);
            }
            map = mergedExtraInfo$default;
            map2 = map3;
        } else {
            if (bVar != null) {
                zzl.b();
                return null;
            }
            map = null;
            map2 = null;
        }
        return new BlazeContentExtraInfo(map, null, map2, map2, null, 18, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|(1:(1:(1:(5:11|(1:24)(1:19)|20|21|22)(2:25|26))(12:27|28|29|30|(6:42|34|(1:36)(1:41)|37|(6:40|(1:13)|24|20|21|22)|39)|32|33|34|(0)(0)|37|(0)|39))(1:49))(2:61|(3:63|(1:65)|39)(4:66|(4:68|(1:70)(1:77)|(1:(1:(2:74|75)))|76)(2:78|(2:80|81))|21|22))|50|51|(3:55|(4:57|30|(0)|32)|39)|33|34|(0)(0)|37|(0)|39))|82|6|(0)(0)|50|51|(4:53|55|(0)|39)|33|34|(0)(0)|37|(0)|39|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
    
        r12 = new com.blaze.blazesdk.shared.results.r0();
        r12.f = r11;
        defpackage.j1m.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c6, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r11, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b5, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b6, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa A[Catch: Exception -> 0x0043, TRY_LEAVE, TryCatch #1 {Exception -> 0x0043, blocks: (B:29:0x003f, B:30:0x00a4, B:42:0x00aa), top: B:28:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object V(sq3 sq3Var) {
        wbm wbmVar;
        Object obj;
        lu3 lu3Var;
        int i;
        Object obj2;
        sqm sqmVar;
        vnm vnmVar;
        String str;
        sqm sqmVar2;
        e5f J;
        ye4 a;
        z88 data;
        Object obj3;
        vnm vnmVar2;
        Boolean bool;
        sqm sqmVar3;
        String str2;
        int i2;
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle;
        BlazeMomentsPlayerFirstTimeSlideStyle firstTimeSlide;
        if (sq3Var instanceof wbm) {
            wbmVar = (wbm) sq3Var;
            int i3 = wbmVar.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wbmVar.x = i3 - Integer.MIN_VALUE;
                obj = wbmVar.v;
                lu3Var = lu3.a;
                i = wbmVar.x;
                if (i != 0) {
                    y6a.M(obj);
                    sum sumVar = (sum) this.V.getValue();
                    if (Intrinsics.c(sumVar, psm.a)) {
                        vnm vnmVar3 = vnm.a;
                        wbmVar.r = this;
                        wbmVar.s = vnmVar3;
                        wbmVar.t = "blaze_data_store_moment_player_visited";
                        wbmVar.x = 1;
                        if (vnmVar3.c(wbmVar) != lu3Var) {
                            sqmVar = this;
                            vnmVar = vnmVar3;
                            str = "blaze_data_store_moment_player_visited";
                        }
                        return lu3Var;
                    }
                    obj2 = hrm.a;
                    if (Intrinsics.c(sumVar, obj2)) {
                        apm apmVar = this.l;
                        int i4 = apmVar == null ? -1 : irl.a[apmVar.ordinal()];
                        if (i4 != -1) {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    zzl.b();
                                    return null;
                                }
                            }
                        }
                        obj2 = ztm.a;
                    } else {
                        obj2 = ztm.a;
                        if (!Intrinsics.c(sumVar, obj2)) {
                            zzl.b();
                            return null;
                        }
                    }
                    this.V.l(obj2);
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i5 = wbmVar.u;
                        sqmVar3 = wbmVar.r;
                        y6a.M(obj);
                        i2 = i5;
                        sqm sqmVar4 = sqmVar3;
                        obj2 = (i2 == 0 || (blazeMomentsPlayerStyle = sqmVar3.u0) == null || (firstTimeSlide = blazeMomentsPlayerStyle.getFirstTimeSlide()) == null || !firstTimeSlide.getShow()) ? ztm.a : hrm.a;
                        this = sqmVar4;
                        this.V.l(obj2);
                        return Unit.a;
                    }
                    vnmVar = wbmVar.s;
                    sqmVar2 = wbmVar.r;
                    try {
                        y6a.M(obj);
                        str2 = (String) obj;
                    } catch (Exception e) {
                        e = e;
                        if (!(e instanceof yga)) {
                        }
                        sqmVar = sqmVar2;
                        obj3 = null;
                        sqmVar2 = sqmVar;
                        Boolean bool2 = (Boolean) obj3;
                        if (bool2 == null) {
                        }
                        vnmVar2 = vnm.a;
                        bool = Boolean.TRUE;
                        wbmVar.r = sqmVar2;
                        wbmVar.s = null;
                        wbmVar.t = null;
                        wbmVar.u = r11;
                        wbmVar.x = 3;
                        if (vnmVar2.d("blaze_data_store_moment_player_visited", bool, wbmVar) != lu3Var) {
                        }
                        return lu3Var;
                    }
                    if (str2 != null) {
                        obj3 = vnm.b(vnmVar).fromJson(str2, (Class<Object>) Boolean.class);
                        Boolean bool22 = (Boolean) obj3;
                        ?? booleanValue = bool22 == null ? bool22.booleanValue() : 0;
                        vnmVar2 = vnm.a;
                        bool = Boolean.TRUE;
                        wbmVar.r = sqmVar2;
                        wbmVar.s = null;
                        wbmVar.t = null;
                        wbmVar.u = booleanValue;
                        wbmVar.x = 3;
                        if (vnmVar2.d("blaze_data_store_moment_player_visited", bool, wbmVar) != lu3Var) {
                            sqmVar3 = sqmVar2;
                            i2 = booleanValue;
                            sqm sqmVar42 = sqmVar3;
                            obj2 = (i2 == 0 || (blazeMomentsPlayerStyle = sqmVar3.u0) == null || (firstTimeSlide = blazeMomentsPlayerStyle.getFirstTimeSlide()) == null || !firstTimeSlide.getShow()) ? ztm.a : hrm.a;
                            this = sqmVar42;
                            this.V.l(obj2);
                            return Unit.a;
                        }
                        return lu3Var;
                    }
                    sqmVar = sqmVar2;
                    obj3 = null;
                    sqmVar2 = sqmVar;
                    Boolean bool222 = (Boolean) obj3;
                    if (bool222 == null) {
                    }
                    vnmVar2 = vnm.a;
                    bool = Boolean.TRUE;
                    wbmVar.r = sqmVar2;
                    wbmVar.s = null;
                    wbmVar.t = null;
                    wbmVar.u = booleanValue;
                    wbmVar.x = 3;
                    if (vnmVar2.d("blaze_data_store_moment_player_visited", bool, wbmVar) != lu3Var) {
                    }
                    return lu3Var;
                }
                String str3 = wbmVar.t;
                vnm vnmVar4 = wbmVar.s;
                sqmVar = wbmVar.r;
                y6a.M(obj);
                str = str3;
                vnmVar = vnmVar4;
                J = f6a.J(str);
                vnm vnmVar5 = vnm.a;
                vnmVar.getClass();
                a = vnm.a();
                if (a != null && (data = a.getData()) != null) {
                    vdm vdmVar = new vdm(data, J);
                    wbmVar.r = sqmVar;
                    wbmVar.s = vnmVar;
                    wbmVar.t = null;
                    wbmVar.x = 2;
                    obj = rd0.y(vdmVar, wbmVar);
                    if (obj != lu3Var) {
                        sqmVar2 = sqmVar;
                        str2 = (String) obj;
                        if (str2 != null) {
                        }
                        sqmVar = sqmVar2;
                    }
                    return lu3Var;
                }
                obj3 = null;
                sqmVar2 = sqmVar;
                Boolean bool2222 = (Boolean) obj3;
                if (bool2222 == null) {
                }
                vnmVar2 = vnm.a;
                bool = Boolean.TRUE;
                wbmVar.r = sqmVar2;
                wbmVar.s = null;
                wbmVar.t = null;
                wbmVar.u = booleanValue;
                wbmVar.x = 3;
                if (vnmVar2.d("blaze_data_store_moment_player_visited", bool, wbmVar) != lu3Var) {
                }
                return lu3Var;
            }
        }
        wbmVar = new wbm(this, sq3Var);
        obj = wbmVar.v;
        lu3Var = lu3.a;
        i = wbmVar.x;
        if (i != 0) {
        }
        J = f6a.J(str);
        vnm vnmVar52 = vnm.a;
        vnmVar.getClass();
        a = vnm.a();
        if (a != null) {
            vdm vdmVar2 = new vdm(data, J);
            wbmVar.r = sqmVar;
            wbmVar.s = vnmVar;
            wbmVar.t = null;
            wbmVar.x = 2;
            obj = rd0.y(vdmVar2, wbmVar);
            if (obj != lu3Var) {
            }
            return lu3Var;
        }
        obj3 = null;
        sqmVar2 = sqmVar;
        Boolean bool22222 = (Boolean) obj3;
        if (bool22222 == null) {
        }
        vnmVar2 = vnm.a;
        bool = Boolean.TRUE;
        wbmVar.r = sqmVar2;
        wbmVar.s = null;
        wbmVar.t = null;
        wbmVar.u = booleanValue;
        wbmVar.x = 3;
        if (vnmVar2.d("blaze_data_store_moment_player_visited", bool, wbmVar) != lu3Var) {
        }
        return lu3Var;
    }

    public final void Z(int i) {
        aim aimVar;
        try {
            int numOfMomentsToPrefetchWhenPlaying = this.t0.getNumOfMomentsToPrefetchWhenPlaying() + i;
            int i2 = i + 1;
            BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = this.u0;
            if (blazeMomentsPlayerStyle == null || (aimVar = y9m.a(blazeMomentsPlayerStyle)) == null) {
                aimVar = mcm.a;
            }
            Function1 a = e7m.a(aimVar);
            if (i2 > numOfMomentsToPrefetchWhenPlaying) {
                return;
            }
            while (true) {
                n4m n4mVar = (n4m) CollectionsKt.a0(i2, this.t);
                if (n4mVar != null) {
                    o(n4mVar, (List) a.invoke(n4mVar));
                }
                if (i2 == numOfMomentsToPrefetchWhenPlaying) {
                    return;
                } else {
                    i2++;
                }
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void a0(MomentModel momentModel) {
        try {
            x5m.safeViewModelScopeIO$default(this, null, new k9m(this, momentModel, null), 1, null);
            if (momentModel.u) {
                n4m D = D();
                gim gimVar = D != null ? D.b : null;
                if (gimVar instanceof gim.b) {
                    ysm.d(this, EventActionName.LIKE, ysm.createMomentsPlayerProps$default(this, (gim.b) gimVar, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048574, null));
                    return;
                }
                return;
            }
            n4m D2 = D();
            gim gimVar2 = D2 != null ? D2.b : null;
            if (gimVar2 instanceof gim.b) {
                ysm.d(this, EventActionName.UNLIKE, ysm.createMomentsPlayerProps$default(this, (gim.b) gimVar2, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048574, null));
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.coroutines.CoroutineContext, rq3] */
    public final void b0(n4m n4mVar, EventNavigationDirection eventNavigationDirection) {
        Object obj;
        sqm sqmVar;
        ?? r1;
        int i;
        try {
            if (n4mVar.equals(D())) {
                c1m.basePrepareMediaFor$default(this, n4mVar, false, false, false, null, 30, null);
                return;
            }
            Integer t = tz9.t(this.t, n4mVar);
            if (t != null) {
                this.m0 = t.intValue();
            }
            n4m D = D();
            if (D != null) {
                n4m D2 = D();
                if (D2 != null) {
                    x5m.safeViewModelScopeIO$default(this, null, new ynm(this, D2, (Pair) this.o.b, null), 1, null);
                }
                ysm.e(this, eventNavigationDirection);
            }
            this.q0 = 0;
            c1m.basePrepareMediaFor$default(this, n4mVar, false, false, false, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 14, null);
            if (D == null) {
                B b = this.r0;
                B.b bVar = b != null ? b.b : null;
                n4m D3 = D();
                gim gimVar = D3 != null ? D3.b : null;
                if (gimVar instanceof gim.b) {
                    gim.b bVar2 = (gim.b) gimVar;
                    r1 = 0;
                    sqmVar = this;
                    i = 1;
                    try {
                        ysm.d(sqmVar, EventActionName.MOMENTS_PLAYLIST_START, ysm.createMomentsPlayerProps$default(sqmVar, bVar2, null, null, null, bVar, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048558, null));
                        r1 = r1;
                        ysm.h(sqmVar);
                        x5m.safeViewModelScopeIO$default(sqmVar, r1, new opm(sqmVar, r1), i, r1);
                    } catch (Throwable th) {
                        th = th;
                        obj = r1;
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, obj);
                        return;
                    }
                }
            }
            sqmVar = this;
            r1 = 0;
            i = 1;
            ysm.h(sqmVar);
            x5m.safeViewModelScopeIO$default(sqmVar, r1, new opm(sqmVar, r1), i, r1);
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    public final ArrayList d0(List list) {
        List list2 = this.p0;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            gim gimVar = ((n4m) it.next()).b;
            String str = gimVar instanceof gim.b ? ((gim.b) gimVar).a.id : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        Set W0 = CollectionsKt.W0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!W0.contains(((MomentModel) obj).id)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // defpackage.c1m, defpackage.ltk
    public final void e() {
        super.e();
        if (this.v0) {
            i0();
        }
        if (J() && this.U) {
            gum.b.i(H());
        }
        if (this.i != null) {
            gzk gzkVar = gzk.a;
            gzk.c(BlazePlayerType.MOMENTS, C(), this.j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r4 < 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r2 = java.lang.Integer.valueOf(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r2 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r9 = true;
        r24 = defpackage.o3a.k(r0.p0, r2.intValue(), r1 + 1).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r24.hasNext() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        r10 = (defpackage.n4m) r24.next();
        r1 = r10.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if ((r1 instanceof gim.c) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        r11 = ((gim.c) r1).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r11 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        r1 = r0;
        r6 = r8;
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x012e, code lost:
    
        r0 = r1;
        r9 = r3;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        r1 = r0.D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        if (r1 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        r1 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if ((r1 instanceof gim.a) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        r17 = defpackage.ysm.createMomentsPlayerAdProps$default(r0, (gim.a) r1, null, null, false, false, 30, null);
        r14 = r8;
        r0 = r10;
        r27 = r11;
        r1 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f4, code lost:
    
        r10 = com.blaze.blazesdk.analytics.enums.EventActionName.AD_REQUESTED;
        r10.getClass();
        defpackage.spm.postEvent$default(defpackage.cwm.a, r10, com.blaze.blazesdk.analytics.enums.EventCategoryType.AD, defpackage.ysm.i(r1), null, r14, null, null, r17, null, 360, null);
        r3 = true;
        r6 = null;
        defpackage.evl.dispatchOnMain$default(com.blaze.blazesdk.shared.BlazeSDK.INSTANCE, null, new defpackage.l0n(r27, r1.U(java.lang.Integer.valueOf(r0.o + 1)), new defpackage.bcl(21, r1, r0), null), 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
    
        if ((r1 instanceof gim.b) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        r2 = (gim.b) r1;
        r1 = r28;
        r0 = r10;
        r27 = r11;
        r14 = defpackage.ysm.createMomentsPlayerProps$default(r1, r2, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048574, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
    
        r17 = null;
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ed, code lost:
    
        r1 = r28;
        r0 = r10;
        r27 = r11;
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        r11 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0133, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004c, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0(int i) {
        sqm sqmVar = this;
        int i2 = ((v0m) ((i7m) sqmVar.b0.getValue())).a;
        n4m n4mVar = (n4m) CollectionsKt.a0(i, sqmVar.t);
        if (n4mVar != null) {
            Iterator it = sqmVar.p0.iterator();
            int i3 = 0;
            while (true) {
                Object obj = null;
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                Object next = it.next();
                if (i3 < 0) {
                    b.q();
                    throw null;
                }
                if (Intrinsics.c(((n4m) next).a, n4mVar.a)) {
                    break;
                } else {
                    i3++;
                }
            }
        }
    }

    public final void f0(boolean z) {
        try {
            v(z);
            if (Boolean.valueOf(z).equals(this.H.d())) {
                return;
            }
            n4m D = D();
            gim gimVar = D != null ? D.b : null;
            if (gimVar instanceof gim.b) {
                gim.b bVar = (gim.b) gimVar;
                AnalyticsPropsMoments createMomentsPlayerProps$default = ysm.createMomentsPlayerProps$default(this, bVar, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048574, null);
                EventActionName eventActionName = EventActionName.AUDIO;
                ysm.d(this, eventActionName, createMomentsPlayerProps$default);
                if (bVar.a.n != null) {
                    ysm.c(this, eventActionName, ysm.createMomentPlayerInteractionProps$default(this, bVar, null, 2, null));
                }
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final int g0() {
        List list = this.p0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((n4m) obj).b instanceof gim.b) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                b.q();
                throw null;
            }
            String str = ((n4m) next).a;
            n4m D = D();
            if (Intrinsics.c(str, D != null ? D.a : null)) {
                break;
            }
            i++;
        }
        Integer valueOf = i >= 0 ? Integer.valueOf(i) : null;
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return -1;
    }

    public final void h0() {
        Object obj;
        sqm sqmVar;
        try {
            n4m D = D();
            gim gimVar = D != null ? D.b : null;
            if (gimVar instanceof gim.b) {
                gim.b bVar = (gim.b) gimVar;
                sqmVar = this;
                AnalyticsPropsMoments createMomentsPlayerProps$default = ysm.createMomentsPlayerProps$default(sqmVar, bVar, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048574, null);
                EventActionName eventActionName = EventActionName.SHARE_CLICK;
                ysm.d(sqmVar, eventActionName, createMomentsPlayerProps$default);
                if (bVar.a.n != null) {
                    ysm.c(sqmVar, eventActionName, ysm.createMomentPlayerInteractionProps$default(sqmVar, bVar, null, 2, null));
                }
            } else {
                sqmVar = this;
            }
            n4m D2 = sqmVar.D();
            if (D2 == null) {
                return;
            }
            try {
                try {
                    try {
                        obj = null;
                        try {
                            m(BlazePlayerType.MOMENTS, BlazeShareParams.BlazeShareContentType.Moment.INSTANCE, nxl.a(D2), D2.a, D2.d, D2.f);
                        } catch (Throwable th) {
                            th = th;
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, obj);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = null;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = null;
            }
        } catch (Throwable th5) {
            th = th5;
            obj = null;
        }
    }

    public final void i0() {
        float f;
        if (this.v0) {
            long G = G();
            long j = G - this.w0;
            this.v0 = false;
            fam famVar = this.e;
            if (famVar != null) {
                famVar.a(1.0f);
            }
            PlaybackSpeedType playbackSpeedType = PlaybackSpeedType.PRESS_HOLD;
            long j2 = this.w0;
            playbackSpeedType.getClass();
            n4m D = D();
            gim gimVar = D != null ? D.b : null;
            if (gimVar instanceof gim.b) {
                f = 1.0f;
                ysm.d(this, EventActionName.PLAYBACK_SPEED_CHANGE, ysm.createMomentsPlayerProps$default(this, (gim.b) gimVar, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, playbackSpeedType, Long.valueOf(j2), Long.valueOf(G), Long.valueOf(j), 65534, null));
            } else {
                f = 1.0f;
            }
            this.x0 = f;
        }
    }

    @Override // defpackage.c1m
    public final void k(u uVar, boolean z) {
        gim gimVar;
        uVar.getClass();
        super.k(uVar, z);
        if (!z || Intrinsics.c(this.Z.getValue(), uVar)) {
            return;
        }
        boolean equals = uVar.equals(a1n.a);
        com.blaze.blazesdk.ads.custom_native.a aVar = this.s0;
        if (equals) {
            n4m D = D();
            gimVar = D != null ? D.b : null;
            if (gimVar instanceof gim.b) {
                ysm.d(this, EventActionName.FORCED_PLAYBACK_PLAY, ysm.createMomentsPlayerProps$default(this, (gim.b) gimVar, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048574, null));
                return;
            } else {
                if (gimVar instanceof gim.a) {
                    aVar.f();
                    ysm.b(this, EventActionName.AD_FORCED_PLAYBACK_PLAY, ysm.createMomentsPlayerAdProps$default(this, (gim.a) gimVar, null, null, false, false, 30, null));
                    return;
                }
                return;
            }
        }
        if (!uVar.equals(n1n.a)) {
            zzl.b();
            return;
        }
        n4m D2 = D();
        gimVar = D2 != null ? D2.b : null;
        if (gimVar instanceof gim.b) {
            ysm.d(this, EventActionName.FORCED_PLAYBACK_PAUSE, ysm.createMomentsPlayerProps$default(this, (gim.b) gimVar, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048574, null));
        } else if (gimVar instanceof gim.a) {
            aVar.b();
            ysm.b(this, EventActionName.AD_FORCED_PLAYBACK_PAUSE, ysm.createMomentsPlayerAdProps$default(this, (gim.a) gimVar, null, null, false, false, 30, null));
        }
    }

    @Override // defpackage.c1m
    public final void l(n7k n7kVar) {
        n7kVar.getClass();
        fdi fdiVar = this.X;
        fdiVar.getClass();
        fdiVar.m(null, n7kVar);
    }
}
