package defpackage;

import android.app.Application;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.blaze.blazesdk.ads.custom_native.a;
import com.blaze.blazesdk.ads.custom_native.models.BlazeAdRequestData;
import com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.blazesdk.ads.models.ui.BlazeStoriesAdsConfigType;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.EventCategoryType;
import com.blaze.blazesdk.analytics.enums.EventNavigationDirection;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsAd;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsStory;
import com.blaze.blazesdk.app_configurations.models.ads.c;
import com.blaze.blazesdk.app_configurations.models.ads.d;
import com.blaze.blazesdk.app_configurations.models.ads.e;
import com.blaze.blazesdk.app_configurations.models.ads.f;
import com.blaze.blazesdk.app_configurations.models.ads.g;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.players.models.J;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerButtonStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerButtonsStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerFirstTimeSlideStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.gim;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ilm extends c1m {
    public final StoriesRepositoryImpl k0 = StoriesRepositoryImpl.a;
    public String l0;
    public String m0;
    public List n0;
    public List o0;
    public int p0;
    public final fdi q0;
    public final fdi r0;
    public final fdi s0;
    public final fdi t0;
    public final yzc u0;
    public BlazeCachingLevel v0;
    public B w0;
    public final a x0;
    public BlazeStoryPlayerStyle y0;
    public xvl z0;

    public ilm() {
        km5 km5Var = km5.a;
        this.n0 = km5Var;
        this.o0 = km5Var;
        this.p0 = -1;
        fdi a = gdi.a(Boolean.TRUE);
        this.q0 = a;
        this.r0 = a;
        fdi a2 = gdi.a(km5Var);
        this.s0 = a2;
        this.t0 = a2;
        this.u0 = new yzc();
        this.v0 = BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release();
        this.x0 = new a();
        x5m.safeViewModelScopeIO$default(this, null, new qhm(this, null), 1, null);
        this.z0 = xvl.IDLE;
    }

    public static final void e0(ilm ilmVar, List list, String str, BlazeStoriesAdsConfigType blazeStoriesAdsConfigType) {
        Object obj;
        ilmVar.getClass();
        try {
            xlm xlmVar = (xlm) CollectionsKt.firstOrNull(list);
            if (xlmVar == null) {
                return;
            }
            Iterator it = xlmVar.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.c(((n4m) obj).a, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            n4m n4mVar = (n4m) obj;
            if (n4mVar == null) {
                try {
                    n4mVar = (n4m) xlmVar.b.get(jca.x(xlmVar));
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                    n4mVar = null;
                }
            }
            if (n4mVar != null) {
                xlmVar.c = n4mVar;
                int a = xlmVar.a();
                int i = 0;
                for (Object obj2 : xlmVar.b) {
                    int i2 = i + 1;
                    if (i < 0) {
                        b.q();
                        throw null;
                    }
                    ((n4m) obj2).m = Boolean.valueOf(i < a);
                    i = i2;
                }
            }
            ilmVar.b0(blazeStoriesAdsConfigType, list);
        } catch (Throwable th2) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
        }
    }

    public static String f0(n4m n4mVar, boolean z) {
        n4mVar.getClass();
        BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
        Application application$blazesdk_release = blazeSDK.getApplication$blazesdk_release();
        if (application$blazesdk_release != null ? f6a.f(application$blazesdk_release) : false) {
            gim gimVar = n4mVar.b;
            gim.d dVar = gimVar instanceof gim.d ? (gim.d) gimVar : null;
            if (dVar != null) {
                StoryModel storyModel = dVar.a;
                srl srlVar = dVar.b;
                int size = storyModel.g.size();
                int i = srlVar.j + 1;
                if (z) {
                    Application application$blazesdk_release2 = blazeSDK.getApplication$blazesdk_release();
                    if (application$blazesdk_release2 != null) {
                        return application$blazesdk_release2.getString(R.string.blaze_accessibility_story_title_page_count, storyModel.title, Integer.valueOf(i), Integer.valueOf(size));
                    }
                } else {
                    Application application$blazesdk_release3 = blazeSDK.getApplication$blazesdk_release();
                    if (application$blazesdk_release3 != null) {
                        return application$blazesdk_release3.getString(R.string.blaze_accessibility_story_page_count, Integer.valueOf(i), Integer.valueOf(size));
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ int getStoryEntryPointIndex$default(ilm ilmVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ilmVar.o0;
        }
        return ilmVar.W(list);
    }

    @Override // defpackage.c1m
    public final void N() {
        n4m D = D();
        gim gimVar = D != null ? D.b : null;
        if (gimVar instanceof gim.d) {
            jom.e(this, EventActionName.PLAYBACK_INITIAL_START, jom.createStoryPlayerProps$default(this, (gim.d) gimVar, null, null, null, null, null, false, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, null));
        } else if (gimVar instanceof gim.a) {
            jom.c(this, EventActionName.PLAYBACK_INITIAL_START, jom.createStoryPlayerAdProps$default(this, (gim.a) gimVar, null, null, false, false, null, 62, null));
        }
    }

    @Override // defpackage.c1m
    public final void O() {
        jom.g(this, H.APP_BACKGROUND);
    }

    @Override // defpackage.c1m
    public final void P() {
        B b = this.w0;
        if (b != null) {
            J j = J.b;
            j.getClass();
            b.b = j;
        }
        jom.b(this);
    }

    public final void U() {
        Object obj;
        List list;
        Iterator it = this.n0.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.c(((xlm) obj).a, this.l0)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        xlm xlmVar = (xlm) obj;
        if (xlmVar == null || (list = xlmVar.b) == null) {
            return;
        }
        int i = ((v0m) ((i7m) this.b0.getValue())).a;
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            Object next = it2.next();
            if (i2 < 0) {
                b.q();
                throw null;
            }
            String str = ((n4m) next).a;
            n4m D = D();
            if (Intrinsics.c(str, D != null ? D.a : null)) {
                break;
            } else {
                i2++;
            }
        }
        Integer valueOf = i2 >= 0 ? Integer.valueOf(i2) : null;
        if (valueOf != null) {
            for (n4m n4mVar : o3a.k(list, valueOf.intValue(), i + 1)) {
                xlm i0 = i0();
                if (i0 == null) {
                    return;
                } else {
                    d0(n4mVar, i0);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r2 < 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r1 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r1 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r0 = defpackage.o3a.k(r6.n0, r1.intValue(), r0 + 1).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r0.hasNext() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r1 = (defpackage.xlm) r0.next();
        r2 = r1.b.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r2.hasNext() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        r3 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (((defpackage.n4m) r3).b.a() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r3 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        r2 = r1.b.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        if (r2.hasNext() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        d0((defpackage.n4m) r2.next(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x003c, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V() {
        int i = ((v0m) ((i7m) this.b0.getValue())).a;
        Iterator it = this.n0.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            Object next = it.next();
            if (i2 < 0) {
                b.q();
                throw null;
            }
            if (Intrinsics.c(((xlm) next).a, this.l0)) {
                break;
            } else {
                i2++;
            }
        }
    }

    public final int W(List list) {
        list.getClass();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.c(((xlm) it.next()).a, this.m0)) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final BlazeContentExtraInfo X(Integer num, Integer num2) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        n4m n4mVar;
        List list;
        g gVar = ((v0m) ((i7m) this.b0.getValue())).b;
        if (gVar instanceof f) {
            if (num == null) {
                return new BlazeContentExtraInfo(null, null, null, null, null, 31, null);
            }
            if (num2 == null) {
                return new BlazeContentExtraInfo(null, null, null, null, null, 31, null);
            }
            xlm xlmVar = (xlm) CollectionsKt.a0(num2.intValue(), this.n0);
            int intValue = num.intValue();
            if (xlmVar != null) {
                kotlin.ranges.a h = llf.h(intValue - 1, 0);
                int i = h.a;
                int i2 = h.b;
                int i3 = h.c;
                if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                    while (true) {
                        n4mVar = (n4m) xlmVar.b.get(i);
                        if (!(n4mVar.c instanceof p7m)) {
                            break;
                        }
                        if (i == i2) {
                            break;
                        }
                        i += i3;
                    }
                }
            }
            n4mVar = null;
            n4m n4mVar2 = (xlmVar == null || (list = xlmVar.b) == null) ? null : (n4m) CollectionsKt.a0(num.intValue(), list);
            n4m n4mVar3 = xlmVar != null ? (n4m) xlmVar.b.get(num.intValue()) : null;
            Map c = fgm.c(n4mVar, n4mVar2);
            Map y = xlmVar != null ? jca.y(xlmVar) : null;
            map3 = fgm.c(n4mVar3, n4mVar2);
            map5 = map3;
            map = c;
            map2 = y;
            map4 = map2;
        } else if (gVar instanceof e) {
            if (num2 == null) {
                return new BlazeContentExtraInfo(null, null, null, null, null, 31, null);
            }
            xlm Z = Z(num2.intValue(), false);
            xlm Z2 = Z(num2.intValue(), true);
            Map y2 = Z != null ? jca.y(Z) : null;
            map3 = Z2 != null ? jca.y(Z2) : null;
            map4 = map3;
            map = y2;
            map2 = null;
            map5 = null;
        } else {
            if (!(gVar instanceof d) && gVar != null) {
                zzl.b();
                return null;
            }
            map = null;
            map2 = null;
            map3 = null;
            map4 = null;
            map5 = null;
        }
        return new BlazeContentExtraInfo(map, map2, map3, map4, map5);
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
    public final Object Y(sq3 sq3Var) {
        ecm ecmVar;
        Object obj;
        lu3 lu3Var;
        int i;
        Object obj2;
        ilm ilmVar;
        vnm vnmVar;
        String str;
        ilm ilmVar2;
        e5f J;
        ye4 a;
        z88 data;
        Object obj3;
        vnm vnmVar2;
        Boolean bool;
        ilm ilmVar3;
        String str2;
        int i2;
        BlazeStoryPlayerStyle blazeStoryPlayerStyle;
        BlazeStoryPlayerFirstTimeSlideStyle firstTimeSlide;
        if (sq3Var instanceof ecm) {
            ecmVar = (ecm) sq3Var;
            int i3 = ecmVar.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ecmVar.x = i3 - Integer.MIN_VALUE;
                obj = ecmVar.v;
                lu3Var = lu3.a;
                i = ecmVar.x;
                if (i != 0) {
                    y6a.M(obj);
                    sum sumVar = (sum) this.V.getValue();
                    if (Intrinsics.c(sumVar, psm.a)) {
                        vnm vnmVar3 = vnm.a;
                        ecmVar.r = this;
                        ecmVar.s = vnmVar3;
                        ecmVar.t = "blaze_data_store_story_player_visited";
                        ecmVar.x = 1;
                        if (vnmVar3.c(ecmVar) != lu3Var) {
                            ilmVar = this;
                            vnmVar = vnmVar3;
                            str = "blaze_data_store_story_player_visited";
                        }
                        return lu3Var;
                    }
                    obj2 = hrm.a;
                    if (Intrinsics.c(sumVar, obj2)) {
                        apm apmVar = this.l;
                        int i4 = apmVar == null ? -1 : xzl.a[apmVar.ordinal()];
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
                        int i5 = ecmVar.u;
                        ilmVar3 = ecmVar.r;
                        y6a.M(obj);
                        i2 = i5;
                        ilm ilmVar4 = ilmVar3;
                        obj2 = (i2 == 0 || (blazeStoryPlayerStyle = ilmVar3.y0) == null || (firstTimeSlide = blazeStoryPlayerStyle.getFirstTimeSlide()) == null || !firstTimeSlide.getShow()) ? ztm.a : hrm.a;
                        this = ilmVar4;
                        this.V.l(obj2);
                        return Unit.a;
                    }
                    vnmVar = ecmVar.s;
                    ilmVar2 = ecmVar.r;
                    try {
                        y6a.M(obj);
                        str2 = (String) obj;
                    } catch (Exception e) {
                        e = e;
                        if (!(e instanceof yga)) {
                        }
                        ilmVar = ilmVar2;
                        obj3 = null;
                        ilmVar2 = ilmVar;
                        Boolean bool2 = (Boolean) obj3;
                        if (bool2 == null) {
                        }
                        vnmVar2 = vnm.a;
                        bool = Boolean.TRUE;
                        ecmVar.r = ilmVar2;
                        ecmVar.s = null;
                        ecmVar.t = null;
                        ecmVar.u = r11;
                        ecmVar.x = 3;
                        if (vnmVar2.d("blaze_data_store_story_player_visited", bool, ecmVar) != lu3Var) {
                        }
                        return lu3Var;
                    }
                    if (str2 != null) {
                        obj3 = vnm.b(vnmVar).fromJson(str2, (Class<Object>) Boolean.class);
                        Boolean bool22 = (Boolean) obj3;
                        ?? booleanValue = bool22 == null ? bool22.booleanValue() : 0;
                        vnmVar2 = vnm.a;
                        bool = Boolean.TRUE;
                        ecmVar.r = ilmVar2;
                        ecmVar.s = null;
                        ecmVar.t = null;
                        ecmVar.u = booleanValue;
                        ecmVar.x = 3;
                        if (vnmVar2.d("blaze_data_store_story_player_visited", bool, ecmVar) != lu3Var) {
                            ilmVar3 = ilmVar2;
                            i2 = booleanValue;
                            ilm ilmVar42 = ilmVar3;
                            obj2 = (i2 == 0 || (blazeStoryPlayerStyle = ilmVar3.y0) == null || (firstTimeSlide = blazeStoryPlayerStyle.getFirstTimeSlide()) == null || !firstTimeSlide.getShow()) ? ztm.a : hrm.a;
                            this = ilmVar42;
                            this.V.l(obj2);
                            return Unit.a;
                        }
                        return lu3Var;
                    }
                    ilmVar = ilmVar2;
                    obj3 = null;
                    ilmVar2 = ilmVar;
                    Boolean bool222 = (Boolean) obj3;
                    if (bool222 == null) {
                    }
                    vnmVar2 = vnm.a;
                    bool = Boolean.TRUE;
                    ecmVar.r = ilmVar2;
                    ecmVar.s = null;
                    ecmVar.t = null;
                    ecmVar.u = booleanValue;
                    ecmVar.x = 3;
                    if (vnmVar2.d("blaze_data_store_story_player_visited", bool, ecmVar) != lu3Var) {
                    }
                    return lu3Var;
                }
                String str3 = ecmVar.t;
                vnm vnmVar4 = ecmVar.s;
                ilmVar = ecmVar.r;
                y6a.M(obj);
                str = str3;
                vnmVar = vnmVar4;
                J = f6a.J(str);
                vnm vnmVar5 = vnm.a;
                vnmVar.getClass();
                a = vnm.a();
                if (a != null && (data = a.getData()) != null) {
                    vdm vdmVar = new vdm(data, J);
                    ecmVar.r = ilmVar;
                    ecmVar.s = vnmVar;
                    ecmVar.t = null;
                    ecmVar.x = 2;
                    obj = rd0.y(vdmVar, ecmVar);
                    if (obj != lu3Var) {
                        ilmVar2 = ilmVar;
                        str2 = (String) obj;
                        if (str2 != null) {
                        }
                        ilmVar = ilmVar2;
                    }
                    return lu3Var;
                }
                obj3 = null;
                ilmVar2 = ilmVar;
                Boolean bool2222 = (Boolean) obj3;
                if (bool2222 == null) {
                }
                vnmVar2 = vnm.a;
                bool = Boolean.TRUE;
                ecmVar.r = ilmVar2;
                ecmVar.s = null;
                ecmVar.t = null;
                ecmVar.u = booleanValue;
                ecmVar.x = 3;
                if (vnmVar2.d("blaze_data_store_story_player_visited", bool, ecmVar) != lu3Var) {
                }
                return lu3Var;
            }
        }
        ecmVar = new ecm(this, sq3Var);
        obj = ecmVar.v;
        lu3Var = lu3.a;
        i = ecmVar.x;
        if (i != 0) {
        }
        J = f6a.J(str);
        vnm vnmVar52 = vnm.a;
        vnmVar.getClass();
        a = vnm.a();
        if (a != null) {
            vdm vdmVar2 = new vdm(data, J);
            ecmVar.r = ilmVar;
            ecmVar.s = vnmVar;
            ecmVar.t = null;
            ecmVar.x = 2;
            obj = rd0.y(vdmVar2, ecmVar);
            if (obj != lu3Var) {
            }
            return lu3Var;
        }
        obj3 = null;
        ilmVar2 = ilmVar;
        Boolean bool22222 = (Boolean) obj3;
        if (bool22222 == null) {
        }
        vnmVar2 = vnm.a;
        bool = Boolean.TRUE;
        ecmVar.r = ilmVar2;
        ecmVar.s = null;
        ecmVar.t = null;
        ecmVar.u = booleanValue;
        ecmVar.x = 3;
        if (vnmVar2.d("blaze_data_store_story_player_visited", bool, ecmVar) != lu3Var) {
        }
        return lu3Var;
    }

    public final xlm Z(int i, boolean z) {
        kotlin.ranges.a j = z ? llf.j(i, this.n0.size()) : llf.h(i - 1, 0);
        int i2 = j.a;
        int i3 = j.b;
        int i4 = j.c;
        if ((i4 <= 0 || i2 > i3) && (i4 >= 0 || i3 > i2)) {
            return null;
        }
        while (true) {
            xlm xlmVar = (xlm) this.n0.get(i2);
            List list = xlmVar.b;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!(((n4m) it.next()).c instanceof p7m)) {
                        return xlmVar;
                    }
                }
            }
            if (i2 == i3) {
                return null;
            }
            i2 += i4;
        }
    }

    public final void a0(cxl cxlVar) {
        n4m D;
        cxlVar.getClass();
        try {
            yda ydaVar = this.d;
            if (ydaVar != null) {
                ydaVar.e(null);
            }
            xlm i0 = i0();
            if (i0 != null && (D = D()) != null) {
                int a = i0.a();
                int ordinal = cxlVar.ordinal();
                yzc yzcVar = this.u0;
                boolean z = true;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        throw new ndd();
                    }
                    if (a != i0.b.size() - 1) {
                        c0((n4m) CollectionsKt.a0(D.p + 1, this.t), EventNavigationDirection.FORWARD);
                        k0();
                        return;
                    }
                    List list = this.o0;
                    list.getClass();
                    if (list.indexOf(i0) != list.size() - 1) {
                        z = false;
                    }
                    yzcVar.k(new Pair(Boolean.valueOf(z), wrl.NEXT));
                    return;
                }
                if (a != 0) {
                    c0((n4m) CollectionsKt.a0(D.p - 1, this.t), EventNavigationDirection.BACKWARD);
                    return;
                }
                List list2 = this.o0;
                list2.getClass();
                if (list2.indexOf(i0) != 0) {
                    yzcVar.k(new Pair(Boolean.FALSE, wrl.PREV));
                    return;
                }
                try {
                    fam famVar = this.e;
                    if (famVar != null) {
                        famVar.seekTo(0L);
                    }
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                }
            }
        } catch (Throwable th2) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01aa  */
    /* JADX WARN: Type inference failed for: r13v16, types: [com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r51v0, types: [c1m, ilm] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(BlazeStoriesAdsConfigType blazeStoriesAdsConfigType, List list) {
        int i;
        List list2;
        Iterator it;
        Iterator it2;
        List list3;
        Iterator it3;
        Iterator it4;
        Iterator it5;
        c cVar;
        List list4;
        c cVar2;
        List list5;
        c.b b;
        g gVar;
        c cVar3;
        BlazeStoryPlayerButtonsStyle buttons;
        BlazeStoryPlayerButtonStyle exit;
        ?? r1 = list;
        i7m i7mVar = (i7m) this.b0.getValue();
        int W = W(r1);
        BlazeStoryPlayerStyle blazeStoryPlayerStyle = this.y0;
        boolean isVisibleForAds = (blazeStoryPlayerStyle == null || (buttons = blazeStoryPlayerStyle.getButtons()) == null || (exit = buttons.getExit()) == null) ? false : exit.isVisibleForAds();
        v0m v0mVar = (v0m) i7mVar;
        v0mVar.getClass();
        blazeStoriesAdsConfigType.getClass();
        tul tulVar = jdm.d;
        Throwable th = null;
        c.b b2 = v0m.b(blazeStoriesAdsConfigType, (tulVar == null || (cVar3 = tulVar.c) == null) ? null : cVar3.a);
        int i2 = 10;
        if (b2 != null) {
            g gVar2 = b2.a;
            v0mVar.b = gVar2;
            v0mVar.a = b2.d;
            if (gVar2 instanceof e) {
                int i3 = ((e) gVar2).a;
                String a = b4m.a(b2);
                ArrayList arrayList = new ArrayList((Collection) r1);
                xlm xlmVar = (xlm) CollectionsKt.firstOrNull(r1);
                BlazeAdInfoModel blazeAdInfoModel = xlmVar != null ? xlmVar.h : null;
                if (blazeAdInfoModel != null && (cVar2 = blazeAdInfoModel.c) != null && (list5 = cVar2.a) != null && (b = v0m.b(BlazeStoriesAdsConfigType.EVERY_X_STORIES, list5)) != null && (gVar = b.a) != null && (gVar instanceof e)) {
                    i3 = ((e) gVar).a;
                }
                dsf dsfVar = new dsf();
                com.blaze.blazesdk.players.models.c d = v0m.d(blazeAdInfoModel);
                if (d != null) {
                    int i4 = W + i3;
                    if (i3 > 0 && i4 >= 0) {
                        while (i4 < arrayList.size()) {
                            xlm xlmVar2 = (xlm) CollectionsKt.a0(i4, arrayList);
                            if (xlmVar2 != null) {
                                n4m n4mVar = (n4m) CollectionsKt.a0(jca.x(xlmVar2), xlmVar2.b);
                                if (n4mVar != null) {
                                    n4mVar.q = (com.blaze.blazesdk.players.models.c) ParcelableExtensionKt.blazeDeepCopy(d);
                                }
                                dsfVar.a++;
                            } else {
                                xlmVar2 = null;
                            }
                            if (xlmVar2 != null) {
                                arrayList.set(i4, xlmVar2);
                            }
                            i4 += i3;
                        }
                    }
                } else if (i3 > 0 && W >= 0) {
                    for (int i5 = W + i3; i5 < arrayList.size(); i5 += i3 + 1) {
                        n4m e = v0m.e(dsfVar.a, new BlazeAdRequestData(blazeAdInfoModel, null, 2, null), a, isVisibleForAds);
                        dsfVar.a++;
                        arrayList.add(i5, new xlm(fc6.C(), kotlin.collections.a.c(e), null, 0, false, null, null, null, 248, null));
                    }
                }
                r1 = arrayList;
            } else {
                if (!(gVar2 instanceof f)) {
                    i = 0;
                    list2 = r1;
                    if (!(gVar2 instanceof d)) {
                        zzl.b();
                        return;
                    }
                    this.n0 = list2;
                    ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                    int i6 = i;
                    for (Object obj : list2) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            b.q();
                            throw null;
                        }
                        xlm copy$default = xlm.copy$default((xlm) obj, null, null, null, 0, false, null, null, null, 255, null);
                        copy$default.d = i6;
                        List list6 = copy$default.b;
                        ArrayList arrayList3 = new ArrayList(k13.r(list6, 10));
                        int i8 = i;
                        for (Object obj2 : list6) {
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                b.q();
                                throw null;
                            }
                            n4m copy$default2 = n4m.copy$default((n4m) obj2, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 0, 0, null, null, null, null, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8388607, null);
                            copy$default2.o = i8;
                            arrayList3.add(copy$default2);
                            i8 = i9;
                        }
                        copy$default.b = arrayList3;
                        arrayList2.add(copy$default);
                        i6 = i7;
                    }
                    this.n0 = arrayList2;
                    ArrayList arrayList4 = new ArrayList(k13.r(arrayList2, 10));
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        xlm copy$default3 = xlm.copy$default((xlm) it.next(), null, null, null, 0, false, null, null, null, 255, null);
                        List list7 = copy$default3.b;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj3 : list7) {
                            gim gimVar = ((n4m) obj3).b;
                            if (!(gimVar instanceof gim.c) || !((gim.c) gimVar).a.a) {
                                arrayList5.add(obj3);
                            }
                        }
                        copy$default3.b = arrayList5;
                        arrayList4.add(copy$default3);
                    }
                    ArrayList arrayList6 = new ArrayList();
                    it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (!((xlm) next).b.isEmpty()) {
                            arrayList6.add(next);
                        }
                    }
                    g0(arrayList6);
                }
                List list8 = ((f) gVar2).a;
                String a2 = b4m.a(b2);
                ArrayList arrayList7 = new ArrayList((Collection) r1);
                r1 = new ArrayList(k13.r(arrayList7, 10));
                Iterator it6 = arrayList7.iterator();
                int i10 = 0;
                while (it6.hasNext()) {
                    xlm xlmVar3 = (xlm) it6.next();
                    BlazeAdInfoModel blazeAdInfoModel2 = xlmVar3.f;
                    if (blazeAdInfoModel2 != null && (cVar = blazeAdInfoModel2.c) != null && (list4 = cVar.a) != null) {
                        c.b b3 = v0m.b(BlazeStoriesAdsConfigType.FIXED_PAGES_INDEX, list4);
                        Object obj4 = b3 != null ? b3.a : th;
                        if (obj4 instanceof f) {
                            list3 = ((f) obj4).a;
                            SortedSet J = kotlin.collections.c.J(list3);
                            ArrayList arrayList8 = new ArrayList();
                            it3 = ((TreeSet) J).iterator();
                            while (it3.hasNext()) {
                                Object next2 = it3.next();
                                Integer num = (Integer) next2;
                                int x = jca.x(xlmVar3);
                                Throwable th2 = th;
                                if (num == null || num.intValue() != x) {
                                    arrayList8.add(next2);
                                }
                                th = th2;
                            }
                            Throwable th3 = th;
                            ArrayList arrayList9 = new ArrayList(k13.r(arrayList8, i2));
                            it4 = arrayList8.iterator();
                            int i11 = 0;
                            while (it4.hasNext()) {
                                Object next3 = it4.next();
                                int i12 = i11 + 1;
                                if (i11 < 0) {
                                    b.q();
                                    throw th3;
                                }
                                Integer num2 = (Integer) next3;
                                ?? r8 = blazeAdInfoModel2 != null ? blazeAdInfoModel2.a : th3;
                                int i13 = r8 == 0 ? -1 : ssl.d[r8.ordinal()];
                                if (i13 != -1) {
                                    if (i13 == 1) {
                                        continue;
                                        arrayList9.add(num2);
                                        i11 = i12;
                                    } else if (i13 != 2) {
                                        zzl.b();
                                        return;
                                    }
                                }
                                num2 = Integer.valueOf(num2.intValue() + i11);
                                arrayList9.add(num2);
                                i11 = i12;
                            }
                            ArrayList U0 = CollectionsKt.U0(xlmVar3.b);
                            it5 = arrayList9.iterator();
                            while (it5.hasNext()) {
                                Integer num3 = (Integer) it5.next();
                                if (num3.intValue() < U0.size()) {
                                    com.blaze.blazesdk.players.models.c d2 = v0m.d(blazeAdInfoModel2);
                                    if (d2 != null) {
                                        ((n4m) U0.get(num3.intValue())).q = (com.blaze.blazesdk.players.models.c) ParcelableExtensionKt.blazeDeepCopy(d2);
                                    } else {
                                        ?? r13 = th3;
                                        U0.add(num3.intValue(), v0m.e(i10, new BlazeAdRequestData(blazeAdInfoModel2, r13, 2, r13), a2, false));
                                    }
                                    i10++;
                                    th3 = null;
                                }
                            }
                            r1.add(xlm.copy$default(xlmVar3, null, U0, null, 0, false, null, null, null, 253, null));
                            th = null;
                            i2 = 10;
                        }
                    }
                    list3 = list8;
                    SortedSet J2 = kotlin.collections.c.J(list3);
                    ArrayList arrayList82 = new ArrayList();
                    it3 = ((TreeSet) J2).iterator();
                    while (it3.hasNext()) {
                    }
                    Throwable th32 = th;
                    ArrayList arrayList92 = new ArrayList(k13.r(arrayList82, i2));
                    it4 = arrayList82.iterator();
                    int i112 = 0;
                    while (it4.hasNext()) {
                    }
                    ArrayList U02 = CollectionsKt.U0(xlmVar3.b);
                    it5 = arrayList92.iterator();
                    while (it5.hasNext()) {
                    }
                    r1.add(xlm.copy$default(xlmVar3, null, U02, null, 0, false, null, null, null, 253, null));
                    th = null;
                    i2 = 10;
                }
            }
        }
        i = 0;
        list2 = r1;
        this.n0 = list2;
        ArrayList arrayList22 = new ArrayList(k13.r(list2, 10));
        int i62 = i;
        while (r1.hasNext()) {
        }
        this.n0 = arrayList22;
        ArrayList arrayList42 = new ArrayList(k13.r(arrayList22, 10));
        it = arrayList22.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList62 = new ArrayList();
        it2 = arrayList42.iterator();
        while (it2.hasNext()) {
        }
        g0(arrayList62);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0066, code lost:
    
        if (r12.equals(r13) == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0(n4m n4mVar, EventNavigationDirection eventNavigationDirection) {
        boolean z;
        n4m D;
        String f0;
        Application application$blazesdk_release;
        StoryModel storyModel;
        StoryModel storyModel2;
        if (n4mVar == null) {
            return;
        }
        try {
            if (n4mVar.equals(D())) {
                c1m.basePrepareMediaFor$default(this, n4mVar, false, false, false, null, 30, null);
                return;
            }
            n4m D2 = D();
            if (D2 != null) {
                jom.f(this, eventNavigationDirection);
            }
            gim gimVar = D2 != null ? D2.b : null;
            gim.d dVar = gimVar instanceof gim.d ? (gim.d) gimVar : null;
            String str = (dVar == null || (storyModel2 = dVar.a) == null) ? null : storyModel2.id;
            gim gimVar2 = n4mVar.b;
            gim.d dVar2 = gimVar2 instanceof gim.d ? (gim.d) gimVar2 : null;
            String str2 = (dVar2 == null || (storyModel = dVar2.a) == null) ? null : storyModel.id;
            if (D2 == null) {
                if (str2 != null) {
                    z = true;
                }
                z = false;
            } else {
                if (str != null) {
                    if (str2 != null) {
                    }
                }
                z = false;
            }
            c1m.basePrepareMediaFor$default(this, n4mVar, false, false, false, null, 30, null);
            U();
            if (z) {
                jom.h(this);
            }
            jom.b(this);
            xlm i0 = i0();
            if (i0 != null && (D = D()) != null) {
                i0.c = D;
                D.m = Boolean.TRUE;
                x5m.safeViewModelScopeIO$default(this, null, new kjm(D, this, null), 1, null);
            }
            if (z || (f0 = f0(n4mVar, false)) == null) {
                return;
            }
            BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
            Application application$blazesdk_release2 = blazeSDK.getApplication$blazesdk_release();
            if ((application$blazesdk_release2 != null ? f6a.f(application$blazesdk_release2) : false) && (application$blazesdk_release = blazeSDK.getApplication$blazesdk_release()) != null) {
                Object systemService = application$blazesdk_release.getSystemService("accessibility");
                AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
                if (accessibilityManager == null) {
                    return;
                }
                AccessibilityEvent c = fx.c();
                c.getText().add(f0);
                accessibilityManager.sendAccessibilityEvent(c);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void d0(n4m n4mVar, xlm xlmVar) {
        ilm ilmVar;
        pxm pxmVar;
        AnalyticsPropsStory analyticsPropsStory;
        AnalyticsPropsAd analyticsPropsAd;
        gim gimVar = n4mVar.b;
        pxm pxmVar2 = gimVar instanceof gim.c ? ((gim.c) gimVar).a : null;
        if (pxmVar2 == null) {
            return;
        }
        n4m D = D();
        gim gimVar2 = D != null ? D.b : null;
        if (gimVar2 instanceof gim.a) {
            gim.a aVar = (gim.a) gimVar2;
            ilmVar = this;
            analyticsPropsAd = jom.createStoryPlayerAdProps$default(ilmVar, aVar, null, null, false, false, null, 62, null);
            pxmVar = pxmVar2;
            analyticsPropsStory = null;
        } else if (gimVar2 instanceof gim.d) {
            gim.d dVar = (gim.d) gimVar2;
            pxmVar = pxmVar2;
            ilmVar = this;
            analyticsPropsStory = jom.createStoryPlayerProps$default(ilmVar, dVar, null, null, null, null, null, false, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, null);
            analyticsPropsAd = null;
        } else {
            ilmVar = this;
            pxmVar = pxmVar2;
            analyticsPropsStory = null;
            analyticsPropsAd = null;
        }
        EventActionName eventActionName = EventActionName.AD_REQUESTED;
        eventActionName.getClass();
        spm.postEvent$default(cwm.a, eventActionName, EventCategoryType.AD, jom.i(ilmVar), analyticsPropsStory, null, null, null, analyticsPropsAd, null, 368, null);
        evl.dispatchOnMain$default(BlazeSDK.INSTANCE, null, new l0n(pxmVar, ilmVar.X(Integer.valueOf(n4mVar.o + 1), Integer.valueOf(xlmVar.d)), new ncj(18, ilmVar, n4mVar, xlmVar), null), 1, null);
    }

    @Override // defpackage.c1m, defpackage.ltk
    public final void e() {
        super.e();
        if (J() && this.U) {
            StoriesRepositoryImpl storiesRepositoryImpl = StoriesRepositoryImpl.a;
            String H = H();
            storiesRepositoryImpl.getClass();
            StoriesRepositoryImpl.h(H);
        }
        if (this.i != null) {
            gzk gzkVar = gzk.a;
            gzk.c(BlazePlayerType.STORIES, C(), this.j);
        }
    }

    public final void g0(List list) {
        List list2;
        this.o0 = list;
        try {
            list2 = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            int i = 0;
            while (it.hasNext()) {
                List<n4m> list3 = ((xlm) it.next()).b;
                ArrayList arrayList = new ArrayList(k13.r(list3, 10));
                for (n4m n4mVar : list3) {
                    n4mVar.p = i;
                    arrayList.add(n4mVar);
                    i++;
                }
                o13.v(arrayList, list2);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            list2 = km5.a;
        }
        list2.getClass();
        this.t = list2;
        if (!list2.isEmpty()) {
            fdi fdiVar = this.u;
            fdiVar.getClass();
            fdiVar.m(null, list2);
        }
        fdi fdiVar2 = this.s0;
        fdiVar2.getClass();
        fdiVar2.m(null, list);
    }

    public final void h0(boolean z) {
        v(z);
        if (Boolean.valueOf(z).equals(this.H.d())) {
            return;
        }
        n4m D = D();
        gim gimVar = D != null ? D.b : null;
        if (gimVar instanceof gim.d) {
            gim.d dVar = (gim.d) gimVar;
            AnalyticsPropsStory createStoryPlayerProps$default = jom.createStoryPlayerProps$default(this, dVar, null, null, null, null, null, false, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, null);
            EventActionName eventActionName = EventActionName.AUDIO;
            jom.e(this, eventActionName, createStoryPlayerProps$default);
            if (dVar.b.l != null) {
                jom.d(this, eventActionName, jom.createStoryPlayerInteractionProps$default(this, dVar, null, 2, null));
            }
        }
    }

    public final xlm i0() {
        Object obj;
        Iterator it = this.o0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.c(((xlm) obj).a, this.l0)) {
                break;
            }
        }
        return (xlm) obj;
    }

    public final Integer j0() {
        Iterator it = this.o0.iterator();
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
            if (Intrinsics.c(((xlm) next).a, this.l0)) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return Integer.valueOf(i);
        }
        return null;
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
        a aVar = this.x0;
        if (equals) {
            n4m D = D();
            gimVar = D != null ? D.b : null;
            if (gimVar instanceof gim.d) {
                jom.e(this, EventActionName.FORCED_PLAYBACK_PLAY, jom.createStoryPlayerProps$default(this, (gim.d) gimVar, null, null, null, null, null, false, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, null));
                return;
            } else {
                if (gimVar instanceof gim.a) {
                    aVar.f();
                    jom.c(this, EventActionName.AD_FORCED_PLAYBACK_PLAY, jom.createStoryPlayerAdProps$default(this, (gim.a) gimVar, null, null, false, false, null, 62, null));
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
        if (gimVar instanceof gim.d) {
            jom.e(this, EventActionName.FORCED_PLAYBACK_PAUSE, jom.createStoryPlayerProps$default(this, (gim.d) gimVar, null, null, null, null, null, false, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, null));
        } else if (gimVar instanceof gim.a) {
            aVar.b();
            jom.c(this, EventActionName.AD_FORCED_PLAYBACK_PAUSE, jom.createStoryPlayerAdProps$default(this, (gim.a) gimVar, null, null, false, false, null, 62, null));
        }
    }

    public final void k0() {
        xlm xlmVar;
        try {
            int i = 0;
            for (Object obj : this.v0.getNumOfPagesInEachStoryToPrefetchWhenPlaying$blazesdk_release()) {
                int i2 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                int intValue = ((Number) obj).intValue();
                Integer j0 = j0();
                if (j0 != null && (xlmVar = (xlm) CollectionsKt.a0(j0.intValue() + i, this.o0)) != null) {
                    int a = xlmVar.a();
                    if (i == 0) {
                        a++;
                    }
                    int i3 = intValue + a;
                    while (a < i3) {
                        n4m n4mVar = (n4m) CollectionsKt.a0(a, xlmVar.b);
                        if (n4mVar != null) {
                            o(n4mVar, null);
                        }
                        a++;
                    }
                    i = i2;
                }
                return;
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
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
