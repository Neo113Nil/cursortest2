package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2397i;
import Ne0.e;
import Sc.s;
import Wc.a;
import android.content.Context;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.H;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.i;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.ThrowableExtKt;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;
import ru.ozon.mapsdk.OzonMapView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ve0.b;
import we0.m;
import we0.q;
import we0.r;
import we0.y;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation.HotelsPageMapPreviewV2WidgetViewHolder$initMap$1", f = "HotelsPageMapPreviewV2WidgetViewHolder.kt", l = {106, 113}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsPageMapPreviewV2WidgetViewHolder$initMap$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ HotelsPageMapPreviewV2WidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lve0/b;", "newController", "", "<anonymous>", "(Lve0/b;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation.HotelsPageMapPreviewV2WidgetViewHolder$initMap$1$1", f = "HotelsPageMapPreviewV2WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation.HotelsPageMapPreviewV2WidgetViewHolder$initMap$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<b, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HotelsPageMapPreviewV2WidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HotelsPageMapPreviewV2WidgetViewHolder hotelsPageMapPreviewV2WidgetViewHolder, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = hotelsPageMapPreviewV2WidgetViewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b bVar;
            i iVar;
            HotelsPageMapPreviewV2WidgetViewHolder$lifecycleObserver$1 hotelsPageMapPreviewV2WidgetViewHolder$lifecycleObserver$1;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            b bVar2 = (b) this.L$0;
            if (bVar2 != null) {
                bVar = this.this$0.controller;
                if (!bVar2.equals(bVar)) {
                    HotelsPageMapPreviewV2WidgetViewHolder hotelsPageMapPreviewV2WidgetViewHolder = this.this$0;
                    bVar2.d().c(false);
                    bVar2.d().d(false);
                    bVar2.d().a(false);
                    bVar2.d().b(false);
                    bVar2.h().b(ThemeExtKt.isDarkThemeActive(hotelsPageMapPreviewV2WidgetViewHolder.getContext()) ? y.DARK : y.LIGHT);
                    bVar2.setLogoConfig(new q(r.LEFT_BOTTOM, 2));
                    HotelsPageMapPreviewV2VO boundData = hotelsPageMapPreviewV2WidgetViewHolder.getBoundData();
                    if (boundData != null) {
                        hotelsPageMapPreviewV2WidgetViewHolder.setUpMap(boundData.getMap(), bVar2);
                    }
                    hotelsPageMapPreviewV2WidgetViewHolder.isMapReady = true;
                    hotelsPageMapPreviewV2WidgetViewHolder.controller = bVar2;
                    this.this$0.observeActions();
                    iVar = this.this$0.container;
                    AbstractC5434v lifecycle = iVar.Q().f().getLifecycle();
                    hotelsPageMapPreviewV2WidgetViewHolder$lifecycleObserver$1 = this.this$0.lifecycleObserver;
                    lifecycle.a(hotelsPageMapPreviewV2WidgetViewHolder$lifecycleObserver$1);
                }
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b bVar, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lve0/b;", "", "e", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation.HotelsPageMapPreviewV2WidgetViewHolder$initMap$1$2", f = "HotelsPageMapPreviewV2WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation.HotelsPageMapPreviewV2WidgetViewHolder$initMap$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements InterfaceC6511n<InterfaceC2397i<? super b>, Throwable, d<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super b> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = interfaceC2397i;
            anonymousClass2.L$1 = th2;
            return anonymousClass2.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ThrowableExtKt.log((Throwable) this.L$1, ((InterfaceC2397i) this.L$0).getClass().getSimpleName().concat("_mapControllerFlow"));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsPageMapPreviewV2WidgetViewHolder$initMap$1(HotelsPageMapPreviewV2WidgetViewHolder hotelsPageMapPreviewV2WidgetViewHolder, d<? super HotelsPageMapPreviewV2WidgetViewHolder$initMap$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsPageMapPreviewV2WidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsPageMapPreviewV2WidgetViewHolder$initMap$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt.initMapForTravel$default(r4, r5, r6, r7, r8, null, r10, 16, null) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (ru.ozon.mapsdk.OzonMapView.k(r14, r1, r13) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        HotelsPageMapPreviewV2WidgetViewHolder$initMap$1 hotelsPageMapPreviewV2WidgetViewHolder$initMap$1;
        TravelGeoProvidersStorage travelGeoProvidersStorage;
        String str;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            HotelsPageMapPreviewV2VO boundData = this.this$0.getBoundData();
            if (boundData != null) {
                OzonMapView map = this.this$0.view.getMap();
                travelGeoProvidersStorage = this.this$0.travelGeoProvidersStorage;
                m coordinate = boundData.getMap().getPin().getCoordinate();
                Context context = this.this$0.getContext();
                str = this.this$0.miniAppName;
                this.label = 1;
                hotelsPageMapPreviewV2WidgetViewHolder$initMap$1 = this;
            } else {
                hotelsPageMapPreviewV2WidgetViewHolder$initMap$1 = this;
                OzonMapView map2 = hotelsPageMapPreviewV2WidgetViewHolder$initMap$1.this$0.view.getMap();
                e.a aVar2 = new e.a();
                hotelsPageMapPreviewV2WidgetViewHolder$initMap$1.label = 2;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            hotelsPageMapPreviewV2WidgetViewHolder$initMap$1 = this;
        }
        C2399j.C(new C(new C2408n0(hotelsPageMapPreviewV2WidgetViewHolder$initMap$1.this$0.view.getMap().h(), new AnonymousClass1(hotelsPageMapPreviewV2WidgetViewHolder$initMap$1.this$0, null)), new AnonymousClass2(null)), H.a(hotelsPageMapPreviewV2WidgetViewHolder$initMap$1.this$0.getLifecycle()));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsPageMapPreviewV2WidgetViewHolder$initMap$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
