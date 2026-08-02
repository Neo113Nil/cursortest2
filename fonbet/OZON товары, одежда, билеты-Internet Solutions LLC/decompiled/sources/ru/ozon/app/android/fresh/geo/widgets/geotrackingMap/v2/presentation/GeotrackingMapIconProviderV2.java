package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import De.s;
import Lm0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import WZ.t;
import android.animation.Animator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.tooltip.TooltipVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.tooltip.internal.TooltipView;
import ru.ozon.app.android.fresh.common.widgets.molecules.tooltip.internal.TooltipViewUtilsKt;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.core.NetworkImageDataLoader;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2VO;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pinlocator.PinLocator;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import we0.InterfaceC10542A;
import we0.m;
import we0.u;
import we0.z;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 O2\u00020\u0001:\u0001OB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J7\u0010%\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010$\u001a\u00020\u000b2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\u001cH\u0002¢\u0006\u0004\b%\u0010&J'\u0010)\u001a\u00020\u00142\u0006\u0010(\u001a\u00020'2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b)\u0010*J7\u00100\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010!2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020 2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b0\u00101J)\u00105\u001a\u00020\u00142\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0011022\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0014¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0014¢\u0006\u0004\b9\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010=R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR-\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020F0E0D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapIconProviderV2;", "", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "mapController", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/core/NetworkImageDataLoader;", "networkImageDataLoader", "Landroid/content/Context;", "context", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "controlCourierAnimation", "<init>", "(Lru/ozon/app/android/mapcommon/map/OzonMapController;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/core/NetworkImageDataLoader;Landroid/content/Context;LWZ/l;Z)V", "Lwe0/u;", "mapPlacemark", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;", "pin", "Lkotlin/Function0;", "", "onCourierChanged", "setupTooltip", "(Lwe0/u;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/internal/TooltipView;", "tooltipView", "createTooltipMarker", "(Lwe0/u;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/internal/TooltipView;)Lwe0/u;", "Lkotlin/Function1;", "onCourierPinInserted", "createPinMarker", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Coordinates;", "Lwe0/m;", "toLatLng", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Coordinates;)Lwe0/m;", "isDefaultPin", "loadCourierPin", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;ZLkotlin/jvm/functions/Function1;)V", "", "iconUrl", "updateCourierPinIcon", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "currentPlacePoint", "", "direction", "newCoordinates", "onCourierAnimationStart", "animateCourierPinMove", "(Lwe0/m;DLru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Coordinates;Lkotlin/jvm/functions/Function0;)V", "", "target", "additionalAnimation", "drawPinsOnMapView", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "resetPins", "()V", "onStop", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/core/NetworkImageDataLoader;", "Landroid/content/Context;", "LWZ/l;", "Z", "courierPinPlacemark", "Lwe0/u;", "Landroid/animation/Animator;", "courierPinAnimator", "Landroid/animation/Animator;", "Landroid/animation/TypeEvaluator;", "Lkotlin/Pair;", "", "mapPointEvaluator$delegate", "LSc/j;", "getMapPointEvaluator", "()Landroid/animation/TypeEvaluator;", "mapPointEvaluator", "Lxe/M;", "providerScope", "Lxe/M;", "Companion", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GeotrackingMapIconProviderV2 {
    private static final int tooltipPadding = ResourceExtKt.toPx(160);

    @NotNull
    private final Context context;
    private final boolean controlCourierAnimation;
    private Animator courierPinAnimator;
    private u courierPinPlacemark;

    @NotNull
    private final OzonMapController mapController;

    /* renamed from: mapPointEvaluator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapPointEvaluator;

    @NotNull
    private final NetworkImageDataLoader networkImageDataLoader;

    @NotNull
    private final M providerScope;

    @NotNull
    private final l tokenizedAnalytics;

    public GeotrackingMapIconProviderV2(@NotNull OzonMapController mapController, @NotNull NetworkImageDataLoader networkImageDataLoader, @NotNull Context context, @NotNull l tokenizedAnalytics, boolean z11) {
        Intrinsics.checkNotNullParameter(mapController, "mapController");
        Intrinsics.checkNotNullParameter(networkImageDataLoader, "networkImageDataLoader");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.mapController = mapController;
        this.networkImageDataLoader = networkImageDataLoader;
        this.context = context;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.controlCourierAnimation = z11;
        this.mapPointEvaluator = k.b(GeotrackingMapIconProviderV2$mapPointEvaluator$2.INSTANCE);
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.providerScope = N.a(CoroutineContext.Element.a.d(s.f6650a.x(), (H0) b11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateCourierPinMove(m currentPlacePoint, final double direction, GeotrackingMapV2VO.Pin.Coordinates newCoordinates, final Function0<Unit> onCourierAnimationStart) {
        u uVar;
        String e11;
        final u placemarkById;
        ValueAnimator valueAnimator;
        if (currentPlacePoint == null || (uVar = this.courierPinPlacemark) == null || (e11 = uVar.e()) == null || (placemarkById = this.mapController.getPlacemarkById(e11)) == null) {
            return;
        }
        Animator animator = this.courierPinAnimator;
        if (animator != null) {
            animator.cancel();
        }
        u uVar2 = this.courierPinPlacemark;
        if (uVar2 != null) {
            float f7 = (float) direction;
            float c11 = uVar2.d().c() - f7 > 180.0f ? uVar2.d().c() - 360 : uVar2.d().c();
            if (f7 - uVar2.d().c() > 180.0f) {
                f7 -= 360;
            }
            valueAnimator = ValueAnimator.ofObject(getMapPointEvaluator(), new Pair(uVar2.c(), Float.valueOf(c11)), new Pair(new m(newCoordinates.getLatitude(), newCoordinates.getLongitude()), Float.valueOf(f7)));
            valueAnimator.setDuration(1000L);
            if (this.controlCourierAnimation) {
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapIconProviderV2$animateCourierPinMove$lambda$11$lambda$10$$inlined$addCourierAnimationListener$1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator value) {
                        OzonMapController ozonMapController;
                        Intrinsics.checkNotNullParameter(value, "value");
                        Object animatedValue = value.getAnimatedValue();
                        Pair pair = animatedValue instanceof Pair ? (Pair) animatedValue : null;
                        if (pair != null) {
                            m mVar = (m) pair.a();
                            float floatValue = ((Number) pair.b()).floatValue();
                            u uVar3 = u.this;
                            u a11 = u.a(uVar3, mVar, z.a(uVar3.d(), null, null, false, 0.0f, floatValue, 191), null, null, 1020);
                            ozonMapController = this.mapController;
                            ozonMapController.updateMarker(a11);
                            this.courierPinPlacemark = u.a(a11, null, z.a(a11.d(), null, null, false, 0.0f, (float) direction, 191), null, null, 1021);
                        }
                    }
                });
            } else {
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapIconProviderV2$animateCourierPinMove$lambda$11$lambda$10$$inlined$addCourierAnimationListener$2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator value) {
                        OzonMapController ozonMapController;
                        Intrinsics.checkNotNullParameter(value, "value");
                        Object animatedValue = value.getAnimatedValue();
                        Pair pair = animatedValue instanceof Pair ? (Pair) animatedValue : null;
                        if (pair != null) {
                            u a11 = u.a(u.this, (m) pair.a(), null, null, null, 1022);
                            ozonMapController = this.mapController;
                            ozonMapController.updateMarker(a11);
                            this.courierPinPlacemark = a11;
                        }
                    }
                });
            }
            valueAnimator.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapIconProviderV2$animateCourierPinMove$lambda$11$lambda$10$$inlined$addListener$default$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator2) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator2) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator2) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator2) {
                    Function0.this.invoke();
                }
            });
            valueAnimator.start();
        } else {
            valueAnimator = null;
        }
        this.courierPinAnimator = valueAnimator;
    }

    private final void createPinMarker(final GeotrackingMapV2VO.Pin pin, Function1<? super u, Unit> onCourierPinInserted) {
        final m latLng;
        final ImageView imageView = new ImageView(this.context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(ResourceExtKt.toPx(pin.getIcon().getOptions().getSize().getWidth()), ResourceExtKt.toPx(pin.getIcon().getOptions().getSize().getHeight())));
        String animatedIconUrl = pin.getIcon().getAnimatedIconUrl();
        boolean z11 = false;
        if (animatedIconUrl != null && animatedIconUrl.length() > 0) {
            z11 = true;
        }
        GeotrackingMapV2VO.Pin.Coordinates coordinates = pin.getCoordinates();
        if (coordinates == null || (latLng = toLatLng(coordinates)) == null) {
            return;
        }
        if (pin.getIsCourier()) {
            loadCourierPin(pin, !z11, onCourierPinInserted);
        } else {
            ImageViewExtKt.loadAsBitmap$default(imageView, pin.getIcon().getUrl(), null, new PikazonLoaderCallback<Bitmap>() { // from class: ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapIconProviderV2$createPinMarker$1
                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadFailed(Exception e11) {
                    PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, e11);
                    a.f17149a.e(e11);
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadSuccessful(Bitmap resource) {
                    OzonMapController ozonMapController;
                    imageView.setImageBitmap(resource);
                    ozonMapController = this.mapController;
                    ozonMapController.insertPlacemark(new u(latLng, new z(new InterfaceC10542A.b(new GeotrackingMapIconProviderV2$createPinMarker$1$onLoadSuccessful$1(imageView)), pin.getIcon().getOptions().getContentAnchor(), false, false, 0.0f, 0.0f, 0.0f, 252), PinLocator.Placemark.INSTANCE, null, null, 1016));
                }
            }, null, 10, null);
        }
    }

    private final u createTooltipMarker(u mapPlacemark, GeotrackingMapV2VO.Pin pin, TooltipView tooltipView) {
        return new u(mapPlacemark.c(), new z(new InterfaceC10542A.b(new GeotrackingMapIconProviderV2$createTooltipMarker$1(this, tooltipView)), pin.getIcon().getOptions().getContentAnchor(), false, false, 0.0f, 1.0f, 0.0f, 156), PinLocator.Courier.INSTANCE, "courierTooltipId", null, 1008);
    }

    private final TypeEvaluator<Pair<m, Float>> getMapPointEvaluator() {
        return (TypeEvaluator) this.mapPointEvaluator.getValue();
    }

    private final void loadCourierPin(GeotrackingMapV2VO.Pin pin, boolean isDefaultPin, Function1<? super u, Unit> onCourierPinInserted) {
        m latLng;
        GeotrackingMapV2VO.Pin.Coordinates coordinates = pin.getCoordinates();
        if (coordinates == null || (latLng = toLatLng(coordinates)) == null) {
            return;
        }
        GeotrackingMapV2VO.Pin.Icon icon = pin.getIcon();
        String url = isDefaultPin ? icon.getUrl() : icon.getAnimatedIconUrl();
        if (url == null) {
            return;
        }
        C10727i.c(this.providerScope, null, null, new GeotrackingMapIconProviderV2$loadCourierPin$2(this, url, isDefaultPin, pin, latLng, onCourierPinInserted, null), 3);
    }

    private final void setupTooltip(u mapPlacemark, GeotrackingMapV2VO.Pin pin, Function0<Unit> onCourierChanged) {
        TooltipView tooltipView$default = TooltipViewUtilsKt.getTooltipView$default(this.context, 0.0f, 0, 6, null);
        GeotrackingMapV2VO.Pin.Modification currentModification = pin.getCurrentModification();
        if (currentModification == null) {
            String animatedIconUrl = pin.getIcon().getAnimatedIconUrl();
            if (animatedIconUrl != null) {
                updateCourierPinIcon(animatedIconUrl, onCourierChanged);
            }
            this.mapController.removePlacemark("courierTooltipId");
            return;
        }
        String animatedIconUrl2 = currentModification.getAnimatedIconUrl();
        if (animatedIconUrl2 != null) {
            updateCourierPinIcon$default(this, animatedIconUrl2, null, 2, null);
        } else {
            String animatedIconUrl3 = pin.getIcon().getAnimatedIconUrl();
            if (animatedIconUrl3 != null) {
                updateCourierPinIcon(animatedIconUrl3, onCourierChanged);
            }
        }
        TooltipVO tooltip = currentModification.getTooltip();
        if (tooltip != null) {
            tooltipView$default.bindTooltip(tooltip);
            this.mapController.updateMarker(createTooltipMarker(mapPlacemark, pin, tooltipView$default));
        } else {
            this.mapController.removePlacemark("courierTooltipId");
        }
        t tokenizedEvent = currentModification.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void setupTooltip$default(GeotrackingMapIconProviderV2 geotrackingMapIconProviderV2, u uVar, GeotrackingMapV2VO.Pin pin, Function0 function0, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function0 = GeotrackingMapIconProviderV2$setupTooltip$1.INSTANCE;
        }
        geotrackingMapIconProviderV2.setupTooltip(uVar, pin, function0);
    }

    private final m toLatLng(GeotrackingMapV2VO.Pin.Coordinates coordinates) {
        return new m(coordinates.getLatitude(), coordinates.getLongitude());
    }

    private final void updateCourierPinIcon(String iconUrl, Function0<Unit> onCourierChanged) {
        String e11;
        u placemarkById;
        u uVar = this.courierPinPlacemark;
        if (uVar == null || (e11 = uVar.e()) == null || (placemarkById = this.mapController.getPlacemarkById(e11)) == null) {
            return;
        }
        C10727i.c(this.providerScope, null, null, new GeotrackingMapIconProviderV2$updateCourierPinIcon$2(this, iconUrl, placemarkById, onCourierChanged, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void updateCourierPinIcon$default(GeotrackingMapIconProviderV2 geotrackingMapIconProviderV2, String str, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = GeotrackingMapIconProviderV2$updateCourierPinIcon$1.INSTANCE;
        }
        geotrackingMapIconProviderV2.updateCourierPinIcon(str, function0);
    }

    public final void drawPinsOnMapView(@NotNull List<GeotrackingMapV2VO.Pin> target, @NotNull Function0<Unit> additionalAnimation) {
        String animatedIconUrl;
        GeotrackingMapV2VO.Pin copy$default;
        u uVar;
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(additionalAnimation, "additionalAnimation");
        for (GeotrackingMapV2VO.Pin pin : target) {
            if (!pin.getIsCourier() || pin.getCoordinates() == null || (uVar = this.courierPinPlacemark) == null) {
                GeotrackingMapV2VO.Pin.Modification currentModification = pin.getCurrentModification();
                if (currentModification != null && (animatedIconUrl = currentModification.getAnimatedIconUrl()) != null && (copy$default = GeotrackingMapV2VO.Pin.copy$default(pin, null, 0.0d, GeotrackingMapV2VO.Pin.Icon.copy$default(pin.getIcon(), null, animatedIconUrl, null, 5, null), false, null, 27, null)) != null) {
                    pin = copy$default;
                }
                createPinMarker(pin, new GeotrackingMapIconProviderV2$drawPinsOnMapView$1$2(this, pin));
            } else if (uVar != null) {
                setupTooltip(uVar, pin, new GeotrackingMapIconProviderV2$drawPinsOnMapView$1$1$1(this, uVar, pin, additionalAnimation));
            }
        }
    }

    public final void onStop() {
        Animator animator = this.courierPinAnimator;
        if (animator != null) {
            animator.end();
        }
        this.courierPinAnimator = null;
    }

    public final void resetPins() {
        this.mapController.clearPlacemarkObjects();
    }
}
