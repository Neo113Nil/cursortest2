package ru.ozon.mapsdk;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import De.C2862e;
import Je0.d;
import Je0.o;
import Ne0.e;
import Sc.InterfaceC4008j;
import Sc.r;
import Sc.s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.LinearLayoutManager;
import ei0.InterfaceC6369b;
import ie0.C7064a;
import java.util.List;
import je0.C7406a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.ActualBXTab;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;
import te0.C9867b;
import ue0.InterfaceC10046c;
import ve0.AbstractC10313a;
import we0.w;
import we0.x;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.C10737n;
import xe.H0;
import xe.L0;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/mapsdk/OzonMapView;", "Landroid/widget/FrameLayout;", "", "clearAnalyticModule", "()V", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OzonMapView extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f97534l = 0;

    /* renamed from: a, reason: collision with root package name */
    private AbstractC7737t f97535a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ve0.c f97536b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2862e f97537c;

    /* renamed from: d, reason: collision with root package name */
    private B0 f97538d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private x0<x> f97539e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final FrameLayout.LayoutParams f97540f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<ve0.b> f97541g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final M0<ve0.b> f97542h;

    /* renamed from: i, reason: collision with root package name */
    private ie0.n f97543i;

    /* renamed from: j, reason: collision with root package name */
    private C7406a f97544j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97545k;

    static final class a extends AbstractC7737t implements Function0<Je0.c> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f97546b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Je0.c invoke() {
            Je0.c cVar;
            InterfaceC6369b ozonTracker;
            Je0.c cVar2;
            Je0.c cVar3;
            ie0.g.f66321a.getClass();
            if (ie0.g.c() == null) {
                Je0.c.f14654d = null;
                return null;
            }
            cVar = Je0.c.f14654d;
            if (cVar != null) {
                cVar3 = Je0.c.f14654d;
                return cVar3;
            }
            GeoProxyConfig c11 = ie0.g.c();
            if (c11 == null || (ozonTracker = c11.getOzonTracker()) == null) {
                d.a.a();
                return null;
            }
            Je0.c.f14654d = new Je0.c(ozonTracker);
            cVar2 = Je0.c.f14654d;
            return cVar2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OzonMapView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void a(OzonMapView ozonMapView, AbstractC10313a abstractC10313a) {
        ozonMapView.getClass();
        View contentView = abstractC10313a.getContentView();
        contentView.setLayoutParams(ozonMapView.f97540f);
        ozonMapView.addView(contentView);
        abstractC10313a.onStart();
        abstractC10313a.onResume();
    }

    public static Object k(OzonMapView ozonMapView, e.a aVar, kotlin.coroutines.jvm.internal.j jVar) {
        ActualBXTab actualBXTab = ActualBXTab.NONE;
        ozonMapView.getClass();
        Object i11 = ozonMapView.i(null, actualBXTab, null, new e(new b(aVar)), jVar);
        return i11 == Wc.a.COROUTINE_SUSPENDED ? i11 : Unit.f71690a;
    }

    public static Object l(OzonMapView ozonMapView, String str, boolean z11, kotlin.coroutines.d dVar) {
        ActualBXTab actualBXTab = ActualBXTab.NONE;
        ozonMapView.getClass();
        Object i11 = ozonMapView.i(str, actualBXTab, null, new d(z11), (kotlin.coroutines.jvm.internal.c) dVar);
        return i11 == Wc.a.COROUTINE_SUSPENDED ? i11 : Unit.f71690a;
    }

    public static Object m(OzonMapView ozonMapView, GeoProviderConfig geoProviderConfig, String str, boolean z11, kotlin.coroutines.d dVar) {
        ozonMapView.getClass();
        Object j11 = ozonMapView.j(geoProviderConfig, str, new g(z11), (kotlin.coroutines.jvm.internal.c) dVar);
        return j11 == Wc.a.COROUTINE_SUSPENDED ? j11 : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0112 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:11:0x0032, B:15:0x010e, B:17:0x0112, B:18:0x011e, B:20:0x0125, B:21:0x012a, B:23:0x012e, B:25:0x0134, B:26:0x0144, B:28:0x015a, B:36:0x004c, B:38:0x0065, B:41:0x0072, B:43:0x007b, B:45:0x0083, B:47:0x0093, B:49:0x00af, B:51:0x00b7, B:53:0x009d, B:55:0x00a5, B:57:0x00bf, B:59:0x00c7, B:60:0x00ca, B:64:0x0076), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0125 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:11:0x0032, B:15:0x010e, B:17:0x0112, B:18:0x011e, B:20:0x0125, B:21:0x012a, B:23:0x012e, B:25:0x0134, B:26:0x0144, B:28:0x015a, B:36:0x004c, B:38:0x0065, B:41:0x0072, B:43:0x007b, B:45:0x0083, B:47:0x0093, B:49:0x00af, B:51:0x00b7, B:53:0x009d, B:55:0x00a5, B:57:0x00bf, B:59:0x00c7, B:60:0x00ca, B:64:0x0076), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012e A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:11:0x0032, B:15:0x010e, B:17:0x0112, B:18:0x011e, B:20:0x0125, B:21:0x012a, B:23:0x012e, B:25:0x0134, B:26:0x0144, B:28:0x015a, B:36:0x004c, B:38:0x0065, B:41:0x0072, B:43:0x007b, B:45:0x0083, B:47:0x0093, B:49:0x00af, B:51:0x00b7, B:53:0x009d, B:55:0x00a5, B:57:0x00bf, B:59:0x00c7, B:60:0x00ca, B:64:0x0076), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015a A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #0 {Exception -> 0x0039, blocks: (B:11:0x0032, B:15:0x010e, B:17:0x0112, B:18:0x011e, B:20:0x0125, B:21:0x012a, B:23:0x012e, B:25:0x0134, B:26:0x0144, B:28:0x015a, B:36:0x004c, B:38:0x0065, B:41:0x0072, B:43:0x007b, B:45:0x0083, B:47:0x0093, B:49:0x00af, B:51:0x00b7, B:53:0x009d, B:55:0x00a5, B:57:0x00bf, B:59:0x00c7, B:60:0x00ca, B:64:0x0076), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(GeoProviderConfig geoProviderConfig, String str, String str2, w wVar, kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        int i11;
        long b11;
        String str3;
        OzonMapView ozonMapView;
        long j11;
        String str4;
        C7406a c7406a;
        B0 b02;
        C7406a c7406a2;
        Je0.c cVar2;
        M0<Boolean> p11;
        GeoProviderConfig geoProviderConfig2 = geoProviderConfig;
        try {
            if (cVar instanceof h) {
                hVar = (h) cVar;
                int i12 = hVar.f97572j;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    hVar.f97572j = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = hVar.f97570h;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = hVar.f97572j;
                    B0 b03 = null;
                    if (i11 != 0) {
                        s.b(obj);
                        int i13 = o.f14690f;
                        o.a.a();
                        kotlin.time.g.f71988a.getClass();
                        kotlin.time.f.f71986a.getClass();
                        b11 = kotlin.time.f.b();
                        ie0.g.f66321a.getClass();
                        if (ie0.g.c() == null) {
                            C9867b c9867b = C9867b.f99466a;
                            C9867b.g("Try init mapview when geoproxy config is null", InterfaceC10046c.a.ERROR, 4);
                        }
                        if (str2 == null) {
                            ie0.g.m(false);
                        } else {
                            ie0.g.l(str2);
                        }
                        x0<ve0.b> x0Var = this.f97541g;
                        ve0.b value = x0Var.getValue();
                        if (((value != null ? value.getClass().getSimpleName().equals("YandexMapController") : false) && geoProviderConfig2.getSdkType().isYandex()) || ((x0Var.getValue() instanceof Le0.o) && geoProviderConfig2.getSdkType().isMapLibre())) {
                            ve0.b value2 = x0Var.getValue();
                            if (value2 != null) {
                                value2.clear();
                            }
                            str4 = str;
                            ozonMapView = this;
                            GeoProviderConfig geoProviderConfig3 = geoProviderConfig2;
                            c7406a = ozonMapView.f97544j;
                            if (c7406a != null) {
                                C7064a.f66281a.getClass();
                                c7406a.s(geoProviderConfig3, C7064a.h());
                            }
                            ozonMapView.q();
                            b02 = ozonMapView.f97538d;
                            if (b02 != null) {
                                ((H0) b02).j(null);
                            }
                            c7406a2 = ozonMapView.f97544j;
                            if (c7406a2 != null && (p11 = c7406a2.p()) != null) {
                                b03 = C2399j.C(new C2408n0(p11, new n(ozonMapView, null)), ozonMapView.f97537c);
                            }
                            ozonMapView.f97538d = b03;
                            kotlin.time.f.f71986a.getClass();
                            long a11 = kotlin.time.f.a(b11);
                            cVar2 = (Je0.c) ozonMapView.f97545k.getValue();
                            if (cVar2 != null) {
                                Je0.c.d(cVar2, geoProviderConfig3, Je0.e.MAP_READY, str4, new Long(kotlin.time.b.h(a11)), null, null, 112);
                            }
                            return Unit.f71690a;
                        }
                        ve0.b value3 = x0Var.getValue();
                        if (value3 != null) {
                            value3.dispose();
                        }
                        x0Var.setValue(null);
                        Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        AbstractC10313a f7 = f(context, geoProviderConfig2, this.f97539e, wVar);
                        C7406a c7406a3 = new C7406a();
                        this.f97544j = c7406a3;
                        c7406a3.r(f7);
                        C7064a.f66281a.getClass();
                        C7064a.n(geoProviderConfig2);
                        ve0.b value4 = x0Var.getValue();
                        hVar.f97566d = this;
                        hVar.f97567e = geoProviderConfig2;
                        str3 = str;
                        hVar.f97568f = str3;
                        hVar.f97569g = b11;
                        hVar.f97572j = 1;
                        if (o(f7, value4, hVar) == aVar) {
                            return aVar;
                        }
                        ozonMapView = this;
                        j11 = b11;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j11 = hVar.f97569g;
                        String str5 = hVar.f97568f;
                        GeoProviderConfig geoProviderConfig4 = hVar.f97567e;
                        ozonMapView = hVar.f97566d;
                        s.b(obj);
                        str3 = str5;
                        geoProviderConfig2 = geoProviderConfig4;
                    }
                    b11 = j11;
                    str4 = str3;
                    GeoProviderConfig geoProviderConfig32 = geoProviderConfig2;
                    c7406a = ozonMapView.f97544j;
                    if (c7406a != null) {
                    }
                    ozonMapView.q();
                    b02 = ozonMapView.f97538d;
                    if (b02 != null) {
                    }
                    c7406a2 = ozonMapView.f97544j;
                    if (c7406a2 != null) {
                        b03 = C2399j.C(new C2408n0(p11, new n(ozonMapView, null)), ozonMapView.f97537c);
                    }
                    ozonMapView.f97538d = b03;
                    kotlin.time.f.f71986a.getClass();
                    long a112 = kotlin.time.f.a(b11);
                    cVar2 = (Je0.c) ozonMapView.f97545k.getValue();
                    if (cVar2 != null) {
                    }
                    return Unit.f71690a;
                }
            }
            if (i11 != 0) {
            }
            b11 = j11;
            str4 = str3;
            GeoProviderConfig geoProviderConfig322 = geoProviderConfig2;
            c7406a = ozonMapView.f97544j;
            if (c7406a != null) {
            }
            ozonMapView.q();
            b02 = ozonMapView.f97538d;
            if (b02 != null) {
            }
            c7406a2 = ozonMapView.f97544j;
            if (c7406a2 != null) {
            }
            ozonMapView.f97538d = b03;
            kotlin.time.f.f71986a.getClass();
            long a1122 = kotlin.time.f.a(b11);
            cVar2 = (Je0.c) ozonMapView.f97545k.getValue();
            if (cVar2 != null) {
            }
            return Unit.f71690a;
        } catch (Exception e11) {
            C9867b c9867b2 = C9867b.f99466a;
            C9867b.f("Error while init map view", e11, InterfaceC10046c.a.ERROR);
            throw e11;
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f97570h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f97572j;
        B0 b032 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cc, code lost:
    
        if (r10 != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
    
        if (r10 == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r10v7, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r11v9, types: [ve0.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(AbstractC10313a abstractC10313a, ve0.b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        i frame;
        int i11;
        m mVar;
        OzonMapView ozonMapView;
        Object n11;
        if (cVar instanceof i) {
            frame = (i) cVar;
            int i12 = frame.f97578i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                frame.f97578i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = frame.f97576g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = frame.f97578i;
                if (i11 != 0) {
                    s.b(obj);
                    if (bVar != null) {
                        B0 b02 = this.f97538d;
                        if (b02 != null) {
                            ((H0) b02).j(null);
                        }
                        bVar.clear();
                        bVar.onPause();
                        bVar.onStop();
                        bVar.onDestroy();
                        removeAllViews();
                    }
                    mVar = new m(this, bVar);
                    if (abstractC10313a instanceof Le0.o) {
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        L0 x11 = De.s.f6650a.x();
                        j jVar = new j(this, abstractC10313a, null);
                        frame.f97573d = this;
                        frame.f97574e = abstractC10313a;
                        frame.f97575f = mVar;
                        frame.f97578i = 1;
                        if (C10727i.f(x11, jVar, frame) != aVar) {
                            ozonMapView = this;
                            frame.f97573d = ozonMapView;
                            frame.f97574e = abstractC10313a;
                            frame.f97575f = mVar;
                            frame.f97578i = 2;
                            C10737n c10737n = new C10737n(1, Wc.b.b(frame));
                            c10737n.o();
                            c10737n.q(mVar);
                            Intrinsics.g(abstractC10313a, "null cannot be cast to non-null type ru.ozon.mapsdk.common.InitializableMapController");
                            abstractC10313a.a(new k(ozonMapView, abstractC10313a, c10737n));
                            n11 = c10737n.n();
                            if (n11 == aVar) {
                            }
                        }
                    } else {
                        frame.f97573d = this;
                        frame.f97574e = abstractC10313a;
                        frame.f97575f = mVar;
                        frame.f97578i = 3;
                        C10737n c10737n2 = new C10737n(1, Wc.b.b(frame));
                        c10737n2.o();
                        Intrinsics.g(abstractC10313a, "null cannot be cast to non-null type ru.ozon.mapsdk.common.InitializableMapController");
                        abstractC10313a.a(new l(c10737n2, mVar, this, abstractC10313a));
                        Object n12 = c10737n2.n();
                        if (n12 == aVar) {
                            Intrinsics.checkNotNullParameter(frame, "frame");
                        }
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        Function1 function1 = frame.f97575f;
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Function1 function12 = frame.f97575f;
                    s.b(obj);
                    return Unit.f71690a;
                }
                Function1 function13 = frame.f97575f;
                ?? r11 = frame.f97574e;
                OzonMapView ozonMapView2 = frame.f97573d;
                s.b(obj);
                mVar = function13;
                abstractC10313a = r11;
                ozonMapView = ozonMapView2;
                frame.f97573d = ozonMapView;
                frame.f97574e = abstractC10313a;
                frame.f97575f = mVar;
                frame.f97578i = 2;
                C10737n c10737n3 = new C10737n(1, Wc.b.b(frame));
                c10737n3.o();
                c10737n3.q(mVar);
                Intrinsics.g(abstractC10313a, "null cannot be cast to non-null type ru.ozon.mapsdk.common.InitializableMapController");
                abstractC10313a.a(new k(ozonMapView, abstractC10313a, c10737n3));
                n11 = c10737n3.n();
                if (n11 == aVar) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
            }
        }
        frame = new i(this, cVar);
        Object obj2 = frame.f97576g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = frame.f97578i;
        if (i11 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        ie0.n nVar = this.f97543i;
        Function1<r<? extends List<He0.a>>, Unit> c11 = nVar != null ? nVar.c() : null;
        ie0.n nVar2 = this.f97543i;
        if (nVar2 != null) {
            nVar2.setSearchListener(null);
        }
        ie0.n nVar3 = this.f97543i;
        if (nVar3 != null) {
            nVar3.clear();
        }
        ie0.n nVar4 = this.f97543i;
        if (nVar4 != null) {
            nVar4.d();
        }
        ie0.n nVar5 = new ie0.n(this.f97544j);
        this.f97543i = nVar5;
        nVar5.setSearchListener(c11);
    }

    @Keep
    public final void clearAnalyticModule() {
        C7406a c7406a = this.f97544j;
        if (c7406a != null) {
            c7406a.o();
        }
        this.f97544j = null;
    }

    @NotNull
    public final AbstractC10313a f(@NotNull Context context, @NotNull GeoProviderConfig geoProvider, @NotNull M0 mapState, @NotNull w mapSettings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(geoProvider, "geoProvider");
        Intrinsics.checkNotNullParameter(mapState, "mapState");
        Intrinsics.checkNotNullParameter(mapSettings, "mapSettings");
        this.f97536b.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(geoProvider, "geoProvider");
        Intrinsics.checkNotNullParameter(mapState, "mapState");
        Intrinsics.checkNotNullParameter(mapSettings, "mapSettings");
        if (!Intrinsics.d(geoProvider.getSdkType(), GeoProviderConfig.SdkType.Yandex.INSTANCE)) {
            return new Le0.o(context, geoProvider, mapState, mapSettings);
        }
        mapSettings.getInitCameraConfig();
        return new Ue0.h(context, mapState, geoProvider);
    }

    @NotNull
    public final C7406a g() {
        C7406a c7406a = this.f97544j;
        if (c7406a != null) {
            return c7406a;
        }
        throw new ae0.j();
    }

    @NotNull
    public final M0<ve0.b> h() {
        return this.f97542h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        if (r2.n((ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig) r0, r4, null, r6, r7) != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, @NotNull ActualBXTab actualBXTab, String str2, @NotNull w wVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        ru.ozon.mapsdk.a aVar;
        int i11;
        OzonMapView ozonMapView;
        String str3;
        w wVar2;
        if (cVar instanceof ru.ozon.mapsdk.a) {
            aVar = (ru.ozon.mapsdk.a) cVar;
            int i12 = aVar.f97552i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f97552i = i12 - LinearLayoutManager.INVALID_OFFSET;
                ru.ozon.mapsdk.a aVar2 = aVar;
                Object obj = aVar2.f97550g;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar2.f97552i;
                if (i11 != 0) {
                    s.b(obj);
                    this.f97541g.setValue(null);
                    C7064a c7064a = C7064a.f66281a;
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    aVar2.f97547d = this;
                    aVar2.f97548e = str;
                    aVar2.f97549f = wVar;
                    aVar2.f97552i = 1;
                    obj = c7064a.k(context, str, null, null, actualBXTab, str2, aVar2);
                    aVar2 = aVar2;
                    if (obj != aVar3) {
                        ozonMapView = this;
                        str3 = str;
                        wVar2 = wVar;
                    }
                    return aVar3;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                w wVar3 = aVar2.f97549f;
                String str4 = aVar2.f97548e;
                ozonMapView = aVar2.f97547d;
                s.b(obj);
                wVar2 = wVar3;
                str3 = str4;
                aVar2.f97547d = null;
                aVar2.f97548e = null;
                aVar2.f97549f = null;
                aVar2.f97552i = 2;
            }
        }
        aVar = new ru.ozon.mapsdk.a(this, cVar);
        ru.ozon.mapsdk.a aVar22 = aVar;
        Object obj2 = aVar22.f97550g;
        Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar22.f97552i;
        if (i11 != 0) {
        }
        aVar22.f97547d = null;
        aVar22.f97548e = null;
        aVar22.f97549f = null;
        aVar22.f97552i = 2;
    }

    public final Object j(@NotNull GeoProviderConfig geoProviderConfig, String str, @NotNull w wVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object n11 = n(geoProviderConfig, null, str, wVar, cVar);
        return n11 == Wc.a.COROUTINE_SUSPENDED ? n11 : Unit.f71690a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        ve0.b value = this.f97541g.getValue();
        if (value != null) {
            B0 b02 = this.f97538d;
            if (b02 != null) {
                ((H0) b02).j(null);
            }
            value.clear();
            value.onPause();
            value.onStop();
            value.onDestroy();
            removeAllViews();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 == i13 && i12 == i14) {
            return;
        }
        ?? r62 = this.f97535a;
        if (r62 != 0) {
            r62.invoke(Integer.valueOf(i11), Integer.valueOf(i12));
        }
        x0<x> x0Var = this.f97539e;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        int i15 = (int) (i11 / context.getResources().getDisplayMetrics().density);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Intrinsics.checkNotNullParameter(context2, "context");
        x0Var.setValue(new x(i15, (int) (i12 / context2.getResources().getDisplayMetrics().density)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(Function2<? super Integer, ? super Integer, Unit> function2) {
        this.f97535a = (AbstractC7737t) function2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OzonMapView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, 0);
        attributeSet = (i11 & 2) != 0 ? null : attributeSet;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f97536b = new ve0.c();
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f97537c = N.a(CoroutineContext.Element.a.d(De.s.f6650a, (H0) b11));
        this.f97539e = O0.a(new x(0, 0));
        this.f97540f = new FrameLayout.LayoutParams(-1, -1, 17);
        x0<ve0.b> a11 = O0.a(null);
        this.f97541g = a11;
        this.f97542h = C2399j.b(a11);
        this.f97545k = Sc.k.b(a.f97546b);
    }
}
