package ru.ozon.app.android.geo.map.performance;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.C2417s0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import xe.B0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0012\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\nJ\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/geo/map/performance/MapPerformanceAnalyticsManager;", "", "Lru/ozon/app/android/geo/map/performance/MapPerformanceAnalyticsSender;", "mapPerformanceAnalyticsSender", "Ll10/i;", "container", "<init>", "(Lru/ozon/app/android/geo/map/performance/MapPerformanceAnalyticsSender;Ll10/i;)V", "", "prepareForAnalytics", "()V", "LAe/h;", "", "pinsCountFlow", "", "tilesLoadingFlow", "Landroidx/lifecycle/J;", "lifecycleOwner", "startObservation", "(LAe/h;LAe/h;Landroidx/lifecycle/J;)V", "permissionViewStart", "permissionViewEnd", "", "uuid", "setInitStartTime", "(Ljava/lang/String;)V", "Lru/ozon/app/android/geo/map/performance/MapPerformanceAnalyticsSender;", "Ll10/i;", "needSendAnalytics", "Z", "waitingForNewTiles", "Lxe/B0;", "currentJob", "Lxe/B0;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapPerformanceAnalyticsManager {

    @NotNull
    private final i container;
    private B0 currentJob;

    @NotNull
    private final MapPerformanceAnalyticsSender mapPerformanceAnalyticsSender;
    private boolean needSendAnalytics;
    private boolean waitingForNewTiles;

    public MapPerformanceAnalyticsManager(@NotNull MapPerformanceAnalyticsSender mapPerformanceAnalyticsSender, @NotNull i container) {
        Intrinsics.checkNotNullParameter(mapPerformanceAnalyticsSender, "mapPerformanceAnalyticsSender");
        Intrinsics.checkNotNullParameter(container, "container");
        this.mapPerformanceAnalyticsSender = mapPerformanceAnalyticsSender;
        this.container = container;
        this.waitingForNewTiles = true;
    }

    public final void permissionViewEnd() {
        this.mapPerformanceAnalyticsSender.permissionViewEnd();
    }

    public final void permissionViewStart() {
        this.mapPerformanceAnalyticsSender.permissionViewStart();
    }

    public final void prepareForAnalytics() {
        this.needSendAnalytics = true;
        this.waitingForNewTiles = true;
    }

    public final void setInitStartTime(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.mapPerformanceAnalyticsSender.setInitStartTime(uuid);
    }

    public final void startObservation(@NotNull InterfaceC2395h<Integer> pinsCountFlow, InterfaceC2395h<Boolean> tilesLoadingFlow, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(pinsCountFlow, "pinsCountFlow");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        B0 b02 = this.currentJob;
        B0 b03 = null;
        if (b02 != null) {
            b02.j(null);
        }
        if (tilesLoadingFlow != null) {
            final InterfaceC2395h a11 = C5427n.a(new C2417s0(new C2408n0(tilesLoadingFlow, new MapPerformanceAnalyticsManager$startObservation$1(this, null)), pinsCountFlow, new MapPerformanceAnalyticsManager$startObservation$2(null)), lifecycleOwner.getLifecycle(), AbstractC5434v.b.STARTED);
            b03 = C2399j.C(new C2408n0(new InterfaceC2395h<Pair<? extends Integer, ? extends Boolean>>() { // from class: ru.ozon.app.android.geo.map.performance.MapPerformanceAnalyticsManager$startObservation$$inlined$filter$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.geo.map.performance.MapPerformanceAnalyticsManager$startObservation$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                    final /* synthetic */ MapPerformanceAnalyticsManager this$0;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.geo.map.performance.MapPerformanceAnalyticsManager$startObservation$$inlined$filter$1$2", f = "MapPerformanceAnalyticsManager.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.geo.map.performance.MapPerformanceAnalyticsManager$startObservation$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends c {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= LinearLayoutManager.INVALID_OFFSET;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i, MapPerformanceAnalyticsManager mapPerformanceAnalyticsManager) {
                        this.$this_unsafeFlow = interfaceC2397i;
                        this.this$0 = mapPerformanceAnalyticsManager;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, d dVar) {
                        AnonymousClass1 anonymousClass1;
                        int i11;
                        boolean z11;
                        boolean z12;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i12 = anonymousClass1.label;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = anonymousClass1.result;
                                a aVar = a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                    Pair pair = (Pair) obj;
                                    if (((Number) pair.e()).intValue() == 0 && ((Boolean) pair.f()).booleanValue()) {
                                        z11 = this.this$0.needSendAnalytics;
                                        if (z11) {
                                            z12 = this.this$0.waitingForNewTiles;
                                            if (!z12) {
                                                anonymousClass1.label = 1;
                                                if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                                    return aVar;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (i11 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    s.b(obj2);
                                }
                                return Unit.f71690a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(dVar);
                        Object obj22 = anonymousClass1.result;
                        a aVar2 = a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super Pair<? extends Integer, ? extends Boolean>> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                    return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            }, new MapPerformanceAnalyticsManager$startObservation$4(this, null)), K.a(lifecycleOwner));
        }
        this.currentJob = b03;
    }
}
