package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.presentation;

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
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.travel.feature.hotels.map.databinding.WidgetHotelsPageMapPreviewBinding;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;
import ru.ozon.app.android.travel.utils.utils.RoundedOutlineProvider;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.mapsdk.OzonMapView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ve0.b;
import we0.C10551g;
import we0.m;
import xe.B0;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000Ï\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001U\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010#\u001a\u00020\u0014*\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0014H\u0002¢\u0006\u0004\b%\u0010\u0016J\u000f\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b&\u0010\u0016J#\u0010*\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010)\u001a\u00060'j\u0002`(H\u0014¢\u0006\u0004\b*\u0010+J3\u00102\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010.\u001a\u00060,j\u0002`-2\u000e\u00101\u001a\n\u0018\u00010/j\u0004\u0018\u0001`0H\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00105R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00106R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00107R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010LR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR \u0010S\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\u00140Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006X"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/presentation/HotelsPageMapPreviewWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/presentation/HotelsPageMapPreviewVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ll10/i;", "container", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "travelGeoProvidersStorage", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "miniAppName", "<init>", "(Landroid/view/View;LVg/d;Ll10/i;Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;LWZ/l;Ljava/lang/String;)V", "", "initMap", "()V", "item", "Lve0/b;", "controller", "setUpMap", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/presentation/HotelsPageMapPreviewVO;Lve0/b;)V", "Lwe0/m;", "pinCoordinate", "Lru/ozon/uni/atoms/data/button/Icon;", "pinIcon", "Landroid/graphics/PointF;", "pinAnchorPoint", "cacheKey", "setUpMarker", "(Lve0/b;Lwe0/m;Lru/ozon/uni/atoms/data/button/Icon;Landroid/graphics/PointF;Ljava/lang/String;)V", "observeActions", "onDetach", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/presentation/HotelsPageMapPreviewVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/presentation/HotelsPageMapPreviewVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/i;", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "LWZ/l;", "Ljava/lang/String;", "Lru/ozon/app/android/travel/feature/hotels/map/databinding/WidgetHotelsPageMapPreviewBinding;", "binding", "Lru/ozon/app/android/travel/feature/hotels/map/databinding/WidgetHotelsPageMapPreviewBinding;", "", "isMapReady", "Z", "cachedMarkerIconCacheKey", "Landroid/graphics/Bitmap;", "cachedMarkerIcon", "Landroid/graphics/Bitmap;", "", "defaultIconWidth", "I", "defaultIconHeight", "", "mapCornerRadius", "F", "Lve0/b;", "Lxe/B0;", "mapInitJob", "Lxe/B0;", "mapClickJob", "Lxe/J;", "coroutineExceptionHandler", "Lxe/J;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/presentation/HotelsPageMapPreviewWidgetViewHolder$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/presentation/HotelsPageMapPreviewWidgetViewHolder$lifecycleObserver$1;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageMapPreviewWidgetViewHolder extends k<HotelsPageMapPreviewVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetHotelsPageMapPreviewBinding binding;
    private Bitmap cachedMarkerIcon;
    private String cachedMarkerIconCacheKey;

    @NotNull
    private final i container;
    private b controller;

    @NotNull
    private J coroutineExceptionHandler;
    private final int defaultIconHeight;
    private final int defaultIconWidth;
    private boolean isMapReady;

    @NotNull
    private final HotelsPageMapPreviewWidgetViewHolder$lifecycleObserver$1 lifecycleObserver;
    private B0 mapClickJob;
    private final float mapCornerRadius;
    private B0 mapInitJob;

    @NotNull
    private final String miniAppName;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final TravelGeoProvidersStorage travelGeoProvidersStorage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v3, types: [ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.presentation.HotelsPageMapPreviewWidgetViewHolder$lifecycleObserver$1] */
    public HotelsPageMapPreviewWidgetViewHolder(@NotNull View containerView, @NotNull d customActionHandlersStoreFactory, @NotNull i container, @NotNull TravelGeoProvidersStorage travelGeoProvidersStorage, @NotNull l tokenizedAnalytics, @NotNull String miniAppName) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(travelGeoProvidersStorage, "travelGeoProvidersStorage");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        this.container = container;
        this.travelGeoProvidersStorage = travelGeoProvidersStorage;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.miniAppName = miniAppName;
        WidgetHotelsPageMapPreviewBinding bind = WidgetHotelsPageMapPreviewBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.defaultIconWidth = ResourceExtKt.toPx(24, getContext());
        this.defaultIconHeight = ResourceExtKt.toPx(35, getContext());
        float pxF = ResourceExtKt.toPxF(8, getContext());
        this.mapCornerRadius = pxF;
        this.coroutineExceptionHandler = new HotelsPageMapPreviewWidgetViewHolder$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0, this);
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new HotelsPageMapPreviewWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.lifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.presentation.HotelsPageMapPreviewWidgetViewHolder$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(androidx.lifecycle.J owner) {
                b bVar;
                Intrinsics.checkNotNullParameter(owner, "owner");
                bVar = HotelsPageMapPreviewWidgetViewHolder.this.controller;
                if (bVar != null) {
                    bVar.onStart();
                }
                HotelsPageMapPreviewWidgetViewHolder.this.observeActions();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(androidx.lifecycle.J owner) {
                b bVar;
                B0 b02;
                Intrinsics.checkNotNullParameter(owner, "owner");
                bVar = HotelsPageMapPreviewWidgetViewHolder.this.controller;
                if (bVar != null) {
                    bVar.onStop();
                }
                b02 = HotelsPageMapPreviewWidgetViewHolder.this.mapClickJob;
                if (b02 != null) {
                    b02.j(null);
                }
                HotelsPageMapPreviewWidgetViewHolder.this.mapClickJob = null;
            }
        };
        OzonMapView ozonMapView = bind.hotelsPageMapPreviewMap;
        ozonMapView.setOutlineProvider(new RoundedOutlineProvider(pxF));
        ozonMapView.setClipToOutline(true);
    }

    private final void initMap() {
        B0 b02 = this.mapInitJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.mapInitJob = C10727i.c(H.a(getLifecycle()), this.coroutineExceptionHandler, null, new HotelsPageMapPreviewWidgetViewHolder$initMap$1(this, null), 2);
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
            b03 = C2399j.C(new C(new C2408n0(d11.e(), new HotelsPageMapPreviewWidgetViewHolder$observeActions$1(this, null)), new HotelsPageMapPreviewWidgetViewHolder$observeActions$2(null)), H.a(getLifecycle()));
        }
        this.mapClickJob = b03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpMap(final HotelsPageMapPreviewVO item, final b controller) {
        if (controller != null) {
            OzonMapView hotelsPageMapPreviewMap = this.binding.hotelsPageMapPreviewMap;
            Intrinsics.checkNotNullExpressionValue(hotelsPageMapPreviewMap, "hotelsPageMapPreviewMap");
            int i11 = Y.f42258g;
            if (!hotelsPageMapPreviewMap.isLaidOut() || hotelsPageMapPreviewMap.isLayoutRequested()) {
                hotelsPageMapPreviewMap.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.presentation.HotelsPageMapPreviewWidgetViewHolder$setUpMap$lambda$4$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        OzonMapView hotelsPageMapPreviewMap2 = HotelsPageMapPreviewWidgetViewHolder.this.binding.hotelsPageMapPreviewMap;
                        Intrinsics.checkNotNullExpressionValue(hotelsPageMapPreviewMap2, "hotelsPageMapPreviewMap");
                        MapExtKt.updateActiveZone(hotelsPageMapPreviewMap2, controller);
                        controller.g().f(C10551g.a(controller.g().c(item.getBoundingBox()), item.getMoveToCoordinate(), 0.0f, 14));
                    }
                });
            } else {
                OzonMapView hotelsPageMapPreviewMap2 = this.binding.hotelsPageMapPreviewMap;
                Intrinsics.checkNotNullExpressionValue(hotelsPageMapPreviewMap2, "hotelsPageMapPreviewMap");
                MapExtKt.updateActiveZone(hotelsPageMapPreviewMap2, controller);
                controller.g().f(C10551g.a(controller.g().c(item.getBoundingBox()), item.getMoveToCoordinate(), 0.0f, 14));
            }
            controller.b().clear();
            setUpMarker(controller, item.getPinCoordinate(), item.getPinIcon(), item.getPinAnchorPoint(), item.getPinCacheKey());
        }
    }

    private final void setUpMarker(b bVar, m mVar, Icon icon, PointF pointF, String str) {
        HotelsPageMapPreviewWidgetViewHolder$setUpMarker$onBitmapReady$1 hotelsPageMapPreviewWidgetViewHolder$setUpMarker$onBitmapReady$1 = new HotelsPageMapPreviewWidgetViewHolder$setUpMarker$onBitmapReady$1(this, str, mVar, pointF, bVar);
        if (this.cachedMarkerIcon == null || !Intrinsics.d(this.cachedMarkerIconCacheKey, str)) {
            ContextExtKt.loadAsBitmap$default(getContext(), icon.getImage(), null, new ImageSize(this.defaultIconWidth, this.defaultIconHeight), null, hotelsPageMapPreviewWidgetViewHolder$setUpMarker$onBitmapReady$1, 10, null);
            return;
        }
        Bitmap bitmap = this.cachedMarkerIcon;
        if (bitmap != null) {
            hotelsPageMapPreviewWidgetViewHolder$setUpMarker$onBitmapReady$1.invoke((HotelsPageMapPreviewWidgetViewHolder$setUpMarker$onBitmapReady$1) bitmap);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.container.Q().f().getLifecycle().e(this.lifecycleObserver);
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsPageMapPreviewVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        setIsRecyclable(false);
        if (this.isMapReady) {
            setUpMap(item, this.controller);
        } else {
            initMap();
        }
        this.binding.hotelsPageMapPreviewRoot.setRadius(ResourceExtKt.toPxF(item.getCornerRadius(), getContext()));
        TextAtomView hotelsPageMapPreviewTitle = this.binding.hotelsPageMapPreviewTitle;
        Intrinsics.checkNotNullExpressionValue(hotelsPageMapPreviewTitle, "hotelsPageMapPreviewTitle");
        TextAtomHolderKt.bind$default(hotelsPageMapPreviewTitle, item.getTitle(), null, 2, null);
        TextAtomView hotelsPageMapPreviewSubtitle = this.binding.hotelsPageMapPreviewSubtitle;
        Intrinsics.checkNotNullExpressionValue(hotelsPageMapPreviewSubtitle, "hotelsPageMapPreviewSubtitle");
        TextAtomHolderKt.bind$default(hotelsPageMapPreviewSubtitle, item.getSubtitle(), null, 2, null);
        this.binding.hotelsPageMapPreviewCopyButton.bind(item.getCopyButton(), this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HotelsPageMapPreviewVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((HotelsPageMapPreviewWidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
