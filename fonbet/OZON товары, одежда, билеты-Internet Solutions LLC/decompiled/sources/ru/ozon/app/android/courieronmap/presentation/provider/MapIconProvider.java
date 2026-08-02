package ru.ozon.app.android.courieronmap.presentation.provider;

import Bi.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.animation.Animator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.courieronmap.R$drawable;
import ru.ozon.app.android.courieronmap.R$id;
import ru.ozon.app.android.courieronmap.databinding.ItemPinBinding;
import ru.ozon.app.android.courieronmap.presentation.provider.MapIconProvider;
import ru.ozon.app.android.courieronmap.presentation.vo.CourierOnMapVO;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import we0.m;
import we0.u;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001=B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0012\u001a\u00020\n*\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u000e*\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u000b\u0010\u001eJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R$\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R!\u00102\u001a\b\u0012\u0004\u0012\u00020-0,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/provider/MapIconProvider;", "", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "mapController", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/app/android/mapcommon/map/OzonMapController;Landroid/content/Context;)V", "Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO$PinInfo;", "pinInfo", "", "createPinMarker", "(Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO$PinInfo;)V", "Lru/ozon/app/android/courieronmap/databinding/ItemPinBinding;", "", "isCourier", "Lkotlin/Function0;", "onImageLoaded", "setData", "(Lru/ozon/app/android/courieronmap/databinding/ItemPinBinding;Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO$PinInfo;ZLkotlin/jvm/functions/Function0;)V", "newPinInfo", "", "animationDuration", "animateCourierPinMoveIfNeed", "(Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO$PinInfo;I)V", "", "isLocalResourceImage", "(Ljava/lang/String;)Z", "Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;", "vo", "(Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;)V", "onPause", "()V", "onStop", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "captionViewWidth", "F", "getCaptionViewWidth", "()F", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/LayoutInflater;", "Landroid/animation/TypeEvaluator;", "Lwe0/m;", "mapPointEvaluator$delegate", "LSc/j;", "getMapPointEvaluator", "()Landroid/animation/TypeEvaluator;", "mapPointEvaluator", "Lwe0/u;", "courierPin", "Lwe0/u;", "customerPin", "Landroid/animation/Animator;", "courierPinAnimator", "Landroid/animation/Animator;", "Lru/ozon/app/android/courieronmap/presentation/provider/BitmapProcessor;", "bitmapProcessor", "Lru/ozon/app/android/courieronmap/presentation/provider/BitmapProcessor;", "Companion", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MapIconProvider {

    @NotNull
    private final BitmapProcessor bitmapProcessor;
    private float captionViewWidth;
    private u courierPin;
    private Animator courierPinAnimator;
    private u customerPin;

    @NotNull
    private final LayoutInflater inflater;

    @NotNull
    private final OzonMapController mapController;

    /* renamed from: mapPointEvaluator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapPointEvaluator;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int PIN_STROKE_WIDTH = ResourceExtKt.toPx(2);
    private static final int COURIER_PIN_SIZE = ResourceExtKt.toPx(48);
    private static final int CUSTOMER_PIN_SIZE = ResourceExtKt.toPx(32);
    private static final int COURIER_PIN_PADDING = ResourceExtKt.toPx(10);
    private static final int CUSTOMER_PIN_PADDING = ResourceExtKt.toPx(6);
    private static final int COURIER_PIN_TIME_START_MARGIN = ResourceExtKt.toPx(44);
    private static final int CUSTOMER_PIN_TIME_START_MARGIN = ResourceExtKt.toPx(28);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/provider/MapIconProvider$Companion;", "", "<init>", "()V", "", "PIN_ANCHOR_DEFAULT", "F", "PIN_Z_INDEX_DEFAULT", "PIN_Z_INDEX_ELEVATED", "", "LOCAL_IMAGE_RESOURCE_PREFIX", "Ljava/lang/String;", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MapIconProvider(@NotNull OzonMapController mapController, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(mapController, "mapController");
        Intrinsics.checkNotNullParameter(context, "context");
        this.mapController = mapController;
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.inflater = (LayoutInflater) systemService;
        this.mapPointEvaluator = k.b(MapIconProvider$mapPointEvaluator$2.INSTANCE);
        this.bitmapProcessor = new BitmapProcessor();
    }

    private final void animateCourierPinMoveIfNeed(CourierOnMapVO.PinInfo newPinInfo, int animationDuration) {
        final u uVar = this.courierPin;
        if (uVar == null || Intrinsics.d(uVar.c(), newPinInfo.getCoordinates())) {
            return;
        }
        Animator animator = this.courierPinAnimator;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(getMapPointEvaluator(), uVar.c(), newPinInfo.getCoordinates());
        ofObject.setDuration(animationDuration);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Yr.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MapIconProvider.animateCourierPinMoveIfNeed$lambda$11$lambda$9(MapIconProvider.this, uVar, valueAnimator);
            }
        });
        ofObject.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.courieronmap.presentation.provider.MapIconProvider$animateCourierPinMoveIfNeed$lambda$11$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator2) {
                OzonMapController ozonMapController;
                MapIconProvider mapIconProvider = MapIconProvider.this;
                ozonMapController = mapIconProvider.mapController;
                mapIconProvider.courierPin = ozonMapController.getPlacemarkById(uVar.e());
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator2) {
            }
        });
        ofObject.start();
        this.courierPinAnimator = ofObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateCourierPinMoveIfNeed$lambda$11$lambda$9(MapIconProvider mapIconProvider, u uVar, ValueAnimator valueAnimator) {
        mapIconProvider.mapController.updateMarker(u.a(uVar, (m) a.b(valueAnimator, AppMeasurementSdk.ConditionalUserProperty.VALUE, "null cannot be cast to non-null type ru.ozon.mapsdk.common.model.LatLng"), null, null, null, 1022));
    }

    private final TypeEvaluator<m> getMapPointEvaluator() {
        return (TypeEvaluator) this.mapPointEvaluator.getValue();
    }

    private final boolean isLocalResourceImage(String str) {
        return h.e0(str, "ic_", false);
    }

    private final void setData(ItemPinBinding itemPinBinding, CourierOnMapVO.PinInfo pinInfo, boolean z11, final Function0<Unit> function0) {
        int resId;
        if (z11) {
            ImageView pinIv = itemPinBinding.pinIv;
            Intrinsics.checkNotNullExpressionValue(pinIv, "pinIv");
            ViewGroup.LayoutParams layoutParams = pinIv.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int i11 = COURIER_PIN_SIZE;
            layoutParams.width = i11;
            layoutParams.height = i11;
            pinIv.setLayoutParams(layoutParams);
            if (isLocalResourceImage(pinInfo.getImage())) {
                ImageView pinIv2 = itemPinBinding.pinIv;
                Intrinsics.checkNotNullExpressionValue(pinIv2, "pinIv");
                int i12 = COURIER_PIN_PADDING;
                pinIv2.setPadding(i12, i12, i12, i12);
            }
            TextView pinTimeTv = itemPinBinding.pinTimeTv;
            Intrinsics.checkNotNullExpressionValue(pinTimeTv, "pinTimeTv");
            ViewGroup.LayoutParams layoutParams2 = pinTimeTv.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.setMarginStart(COURIER_PIN_TIME_START_MARGIN);
            pinTimeTv.setLayoutParams(marginLayoutParams);
            Context context = itemPinBinding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            resId = ThemeExtKt.themeColorRes(context, R$attr.graphicAccentPrimary);
        } else {
            ImageView pinIv3 = itemPinBinding.pinIv;
            Intrinsics.checkNotNullExpressionValue(pinIv3, "pinIv");
            ViewGroup.LayoutParams layoutParams3 = pinIv3.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int i13 = CUSTOMER_PIN_SIZE;
            layoutParams3.width = i13;
            layoutParams3.height = i13;
            pinIv3.setLayoutParams(layoutParams3);
            if (isLocalResourceImage(pinInfo.getImage())) {
                ImageView pinIv4 = itemPinBinding.pinIv;
                Intrinsics.checkNotNullExpressionValue(pinIv4, "pinIv");
                int i14 = CUSTOMER_PIN_PADDING;
                pinIv4.setPadding(i14, i14, i14, i14);
            }
            TextView pinTimeTv2 = itemPinBinding.pinTimeTv;
            Intrinsics.checkNotNullExpressionValue(pinTimeTv2, "pinTimeTv");
            ViewGroup.LayoutParams layoutParams4 = pinTimeTv2.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams2.setMarginStart(CUSTOMER_PIN_TIME_START_MARGIN);
            pinTimeTv2.setLayoutParams(marginLayoutParams2);
            AppTokensProvider.CourierOnMapPinColor courierOnMapPinColor = AppTokensProvider.CourierOnMapPinColor.INSTANCE;
            Context context2 = itemPinBinding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            resId = courierOnMapPinColor.courier(context2).getResId();
        }
        TextView textView = itemPinBinding.pinTimeTv;
        Intrinsics.f(textView);
        String caption = pinInfo.getCaption();
        ViewExtKt.showOrGone(textView, Boolean.valueOf(!(caption == null || caption.length() == 0)));
        textView.setText(pinInfo.getCaption());
        itemPinBinding.getConstraintLayout().measure(0, 0);
        if (pinInfo.getIsCourier()) {
            this.captionViewWidth = itemPinBinding.getConstraintLayout().getMeasuredWidth();
        }
        final ImageView imageView = itemPinBinding.pinIv;
        if (isLocalResourceImage(pinInfo.getImage())) {
            Drawable d11 = g.d(imageView.getResources(), R$drawable.bg_pin_image, imageView.getContext().getTheme());
            Intrinsics.g(d11, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            LayerDrawable layerDrawable = (LayerDrawable) d11;
            imageView.setBackground(layerDrawable);
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R$id.round_bg);
            Intrinsics.g(findDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R$id.round_stroke);
            Intrinsics.g(findDrawableByLayerId2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) findDrawableByLayerId).setColor(imageView.getContext().getColor(resId));
            int i15 = PIN_STROKE_WIDTH;
            Context context3 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            ((GradientDrawable) findDrawableByLayerId2).setStroke(i15, ThemeExtKt.themeColor(context3, R$attr.bgLightKey));
            Context context4 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            ThemeExtKt.tint(imageView, Integer.valueOf(ThemeExtKt.themeColor(context4, R$attr.bgLightKey)));
        }
        Intrinsics.f(imageView);
        ImageViewExtKt.loadOriginal$default(imageView, pinInfo.getImage(), null, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.courieronmap.presentation.provider.MapIconProvider$setData$6$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                Lm0.a.f17149a.e(e11);
                function0.invoke();
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                imageView.setImageDrawable(resource);
                function0.invoke();
            }
        }, null, false, null, 58, null);
    }

    public final void createPinMarker(@NotNull CourierOnMapVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        if (this.customerPin == null) {
            createPinMarker(vo.getCustomer());
        }
        if (vo.getCourier() != null && this.courierPin == null) {
            createPinMarker(vo.getCourier());
            return;
        }
        if (vo.getCourier() != null && this.courierPin != null) {
            animateCourierPinMoveIfNeed(vo.getCourier(), vo.getPinAnimationDuration());
            return;
        }
        u uVar = this.courierPin;
        if (uVar != null) {
            this.mapController.removePlacemark(uVar.e());
            this.courierPin = null;
        }
    }

    public final float getCaptionViewWidth() {
        return this.captionViewWidth;
    }

    public final void onPause() {
        Animator animator = this.courierPinAnimator;
        if (animator != null) {
            animator.end();
        }
        this.courierPinAnimator = null;
    }

    public final void onStop() {
        this.bitmapProcessor.cancelProcessing();
    }

    private final void createPinMarker(CourierOnMapVO.PinInfo pinInfo) {
        ItemPinBinding inflate = ItemPinBinding.inflate(this.inflater, null, false);
        Intrinsics.f(inflate);
        setData(inflate, pinInfo, pinInfo.getIsCourier(), new MapIconProvider$createPinMarker$2$1(pinInfo, inflate, this));
    }
}
