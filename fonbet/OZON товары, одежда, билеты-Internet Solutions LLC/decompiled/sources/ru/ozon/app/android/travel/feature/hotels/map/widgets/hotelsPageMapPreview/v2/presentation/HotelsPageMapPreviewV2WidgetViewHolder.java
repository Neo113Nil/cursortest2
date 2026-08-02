package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.view.View;
import androidx.core.view.Y;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.H;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import me0.InterfaceC8137a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation.HotelsPageMapPreviewV2VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.view.MapPreviewV2View;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.mapsdk.OzonMapView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ve0.b;
import we0.C10551g;
import we0.m;
import xe.B0;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000½\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001P\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010&\u001a\u00020\u0016*\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010\u001aJ\u000f\u0010)\u001a\u00020\u0016H\u0016¢\u0006\u0004\b)\u0010\u001aJ#\u0010.\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00022\n\u0010-\u001a\u00060+j\u0002`,H\u0014¢\u0006\u0004\b.\u0010/J3\u00106\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00022\n\u00102\u001a\u000600j\u0002`12\u000e\u00105\u001a\n\u0018\u000103j\u0004\u0018\u0001`4H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010:R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010;R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010<R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010<R\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010N\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00160L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/view/MapPreviewV2View;", "view", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ll10/i;", "container", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "travelGeoProvidersStorage", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "miniAppName", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/view/MapPreviewV2View;LVg/d;Ll10/i;Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;LWZ/l;Ljava/lang/String;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO$MapSettings;", "map", "", "bindMap", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO$MapSettings;)V", "initMap", "()V", "Lve0/b;", "controller", "setUpMap", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO$MapSettings;Lve0/b;)V", "Lwe0/m;", "pinCoordinate", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "pinIcon", "Landroid/graphics/PointF;", "pinAnchorPoint", "cacheKey", "setUpMarker", "(Lve0/b;Lwe0/m;Lru/ozon/uni/atoms/data/icon/IconDTO;Landroid/graphics/PointF;Ljava/lang/String;)V", "observeActions", "onDetach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/view/MapPreviewV2View;", "Ll10/i;", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "LWZ/l;", "Ljava/lang/String;", "Lve0/b;", "", "isMapReady", "Z", "Lxe/B0;", "mapInitJob", "Lxe/B0;", "mapClickJob", "Lxe/J;", "coroutineExceptionHandler", "Lxe/J;", "cachedMarkerIconCacheKey", "Landroid/graphics/Bitmap;", "cachedMarkerIcon", "Landroid/graphics/Bitmap;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2WidgetViewHolder$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2WidgetViewHolder$lifecycleObserver$1;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageMapPreviewV2WidgetViewHolder extends k<HotelsPageMapPreviewV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private Bitmap cachedMarkerIcon;
    private String cachedMarkerIconCacheKey;

    @NotNull
    private final i container;
    private b controller;

    @NotNull
    private J coroutineExceptionHandler;
    private boolean isMapReady;

    @NotNull
    private final HotelsPageMapPreviewV2WidgetViewHolder$lifecycleObserver$1 lifecycleObserver;
    private B0 mapClickJob;
    private B0 mapInitJob;

    @NotNull
    private final String miniAppName;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final TravelGeoProvidersStorage travelGeoProvidersStorage;

    @NotNull
    private final MapPreviewV2View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v5, types: [ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation.HotelsPageMapPreviewV2WidgetViewHolder$lifecycleObserver$1] */
    public HotelsPageMapPreviewV2WidgetViewHolder(@NotNull MapPreviewV2View view, @NotNull d customActionHandlersStoreFactory, @NotNull i container, @NotNull TravelGeoProvidersStorage travelGeoProvidersStorage, @NotNull l tokenizedAnalytics, @NotNull String miniAppName) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(travelGeoProvidersStorage, "travelGeoProvidersStorage");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        this.view = view;
        this.container = container;
        this.travelGeoProvidersStorage = travelGeoProvidersStorage;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.miniAppName = miniAppName;
        this.coroutineExceptionHandler = new HotelsPageMapPreviewV2WidgetViewHolder$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0, this);
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new HotelsPageMapPreviewV2WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.lifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation.HotelsPageMapPreviewV2WidgetViewHolder$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(androidx.lifecycle.J owner) {
                b bVar;
                Intrinsics.checkNotNullParameter(owner, "owner");
                bVar = HotelsPageMapPreviewV2WidgetViewHolder.this.controller;
                if (bVar != null) {
                    bVar.onStart();
                }
                HotelsPageMapPreviewV2WidgetViewHolder.this.observeActions();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(androidx.lifecycle.J owner) {
                b bVar;
                B0 b02;
                Intrinsics.checkNotNullParameter(owner, "owner");
                bVar = HotelsPageMapPreviewV2WidgetViewHolder.this.controller;
                if (bVar != null) {
                    bVar.onStop();
                }
                b02 = HotelsPageMapPreviewV2WidgetViewHolder.this.mapClickJob;
                if (b02 != null) {
                    b02.j(null);
                }
                HotelsPageMapPreviewV2WidgetViewHolder.this.mapClickJob = null;
            }
        };
    }

    private final void bindMap(HotelsPageMapPreviewV2VO.MapSettings map) {
        if (this.isMapReady) {
            setUpMap(map, this.controller);
        } else {
            initMap();
        }
    }

    private final void initMap() {
        B0 b02 = this.mapInitJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.mapInitJob = C10727i.c(H.a(getLifecycle()), this.coroutineExceptionHandler, null, new HotelsPageMapPreviewV2WidgetViewHolder$initMap$1(this, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeActions() {
        InterfaceC8137a d11;
        B0 b02 = this.mapClickJob;
        B0 b03 = null;
        if (b02 != null) {
            b02.j(null);
        }
        b bVar = this.controller;
        if (bVar != null && (d11 = bVar.d()) != null) {
            b03 = C2399j.C(new C(new C2408n0(d11.e(), new HotelsPageMapPreviewV2WidgetViewHolder$observeActions$1(this, null)), new HotelsPageMapPreviewV2WidgetViewHolder$observeActions$2(null)), H.a(getLifecycle()));
        }
        this.mapClickJob = b03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpMap(final HotelsPageMapPreviewV2VO.MapSettings map, final b controller) {
        if (controller != null) {
            OzonMapView map2 = this.view.getMap();
            int i11 = Y.f42258g;
            if (!map2.isLaidOut() || map2.isLayoutRequested()) {
                map2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation.HotelsPageMapPreviewV2WidgetViewHolder$setUpMap$lambda$2$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        MapExtKt.updateActiveZone(HotelsPageMapPreviewV2WidgetViewHolder.this.view.getMap(), controller);
                        controller.g().f(C10551g.a(controller.g().c(map.getVisibleRegion()), map.getPin().getCoordinate(), 0.0f, 14));
                    }
                });
            } else {
                MapExtKt.updateActiveZone(this.view.getMap(), controller);
                controller.g().f(C10551g.a(controller.g().c(map.getVisibleRegion()), map.getPin().getCoordinate(), 0.0f, 14));
            }
            controller.b().clear();
            setUpMarker(controller, map.getPin().getCoordinate(), map.getPin().getIcon(), map.getPin().getAnchorPoint(), map.getPin().getPinCacheKey());
        }
    }

    private final void setUpMarker(b bVar, m mVar, IconDTO iconDTO, PointF pointF, String str) {
        HotelsPageMapPreviewV2WidgetViewHolder$setUpMarker$onBitmapReady$1 hotelsPageMapPreviewV2WidgetViewHolder$setUpMarker$onBitmapReady$1 = new HotelsPageMapPreviewV2WidgetViewHolder$setUpMarker$onBitmapReady$1(this, str, mVar, pointF, bVar);
        if (this.cachedMarkerIcon == null || !Intrinsics.d(this.cachedMarkerIconCacheKey, str)) {
            IconView iconView = new IconView(getContext(), null, 0, 6, null);
            IconHolderKt.bind$default(iconView, iconDTO, null, 2, null);
            hotelsPageMapPreviewV2WidgetViewHolder$setUpMarker$onBitmapReady$1.invoke((HotelsPageMapPreviewV2WidgetViewHolder$setUpMarker$onBitmapReady$1) MapExtKt.getBitmap(iconView));
        } else {
            Bitmap bitmap = this.cachedMarkerIcon;
            if (bitmap != null) {
                hotelsPageMapPreviewV2WidgetViewHolder$setUpMarker$onBitmapReady$1.invoke((HotelsPageMapPreviewV2WidgetViewHolder$setUpMarker$onBitmapReady$1) bitmap);
            }
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.container.Q().f().getLifecycle().e(this.lifecycleObserver);
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsPageMapPreviewV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        setIsRecyclable(false);
        bindMap(item.getMap());
        this.view.bind(item, this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HotelsPageMapPreviewV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
