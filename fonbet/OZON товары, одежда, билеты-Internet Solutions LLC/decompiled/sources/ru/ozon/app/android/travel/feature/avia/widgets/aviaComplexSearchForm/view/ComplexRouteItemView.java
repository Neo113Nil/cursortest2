package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view;

import Al.ViewOnClickListenerC2437a;
import RM.a;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import jF.C7315a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mz.C8355a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.databinding.ItemComplexRouteBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation.AviaComplexSearchFormVO;
import ru.ozon.app.android.travel.molecules.extensions.DrawableExtensionsKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\r\u0010\fJS\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010\u001dJ-\u0010%\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002¢\u0006\u0004\b%\u0010&J-\u0010-\u001a\u00020\u0012*\u00020'2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0012H\u0002¢\u0006\u0004\b/\u0010\u0019J\u000f\u00100\u001a\u00020\u0012H\u0002¢\u0006\u0004\b0\u0010\u0019J\u000f\u00101\u001a\u00020\u0012H\u0002¢\u0006\u0004\b1\u0010\u0019J\u0017\u00104\u001a\u00020*2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00122\u0006\u00106\u001a\u00020*H\u0002¢\u0006\u0004\b7\u00108J1\u0010=\u001a\u00020\u00122\u0006\u00109\u001a\u00020*2\u0006\u0010:\u001a\u00020*2\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010;H\u0002¢\u0006\u0004\b=\u0010>J#\u0010B\u001a\u00020\n*\u00020?2\u0006\u0010@\u001a\u00020*2\u0006\u0010A\u001a\u00020*H\u0002¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010DR\u0014\u0010I\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010N\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010DR$\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010OR$\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010OR\u0018\u0010P\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010R\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010QR\u0016\u0010T\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010UR\u0014\u0010W\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010DR\u0016\u0010Z\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010JR\u0014\u0010[\u001a\u00020*8\u0002X\u0082D¢\u0006\u0006\n\u0004\b[\u0010JR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R$\u0010_\u001a\u00020*2\u0006\u00106\u001a\u00020*8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b_\u0010J\"\u0004\b`\u00108R\u0014\u0010c\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b¨\u0006d"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/view/ComplexRouteItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "", "scrollThreshold", "<init>", "(Landroid/content/Context;I)V", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Flight;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "onSwipedListener", "getIsDemoAnimationRequired", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Flight;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "hideDeleteButton", "()V", "showAndHideDeleteButton", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Field;", "bindDirection", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Field;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Content;", "bindFrom", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Content;)V", "bindTo", "bindDate", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "onDeleteClickListener", "bindDeleteButton", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/drawable/GradientDrawable;", "", "backgroundColorToken", "", "radius", "borderColorToken", "update", "(Landroid/graphics/drawable/GradientDrawable;Ljava/lang/String;FLjava/lang/String;)V", "setUpView", "setUpLocationView", "setUpDateView", "Landroid/view/View;", "view", "calculateTotalWidth", "(Landroid/view/View;)F", AppMeasurementSdk.ConditionalUserProperty.VALUE, "translateChildrenX", "(F)V", "start", "end", "Lkotlin/Function0;", "action", "animateSwipeOffset", "(FFLkotlin/jvm/functions/Function0;)V", "Landroid/graphics/PointF;", "x", "y", "isScrollDetected", "(Landroid/graphics/PointF;FF)Z", "I", "Lru/ozon/app/android/travel/feature/avia/databinding/ItemComplexRouteBinding;", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/ItemComplexRouteBinding;", "strokeWidth", "animationOffset", "F", "locationBackgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "dateBackgroundDrawable", "rippleColor", "Lkotlin/jvm/functions/Function1;", "fromAction", "Lru/ozon/uni/atoms/af/AtomAction;", "toAction", "dateAction", "isScrolling", "Z", "hasDeleteButton", "initialTouchPoint", "Landroid/graphics/PointF;", "direction", "previousTouchX", "rightLimit", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "animInterpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "swipeOffset", "setSwipeOffset", "getLeftLimit", "()F", "leftLimit", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComplexRouteItemView extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final AccelerateDecelerateInterpolator animInterpolator;
    private final float animationOffset;

    @NotNull
    private final ItemComplexRouteBinding binding;
    private AtomAction dateAction;

    @NotNull
    private final GradientDrawable dateBackgroundDrawable;
    private int direction;
    private AtomAction fromAction;
    private boolean hasDeleteButton;

    @NotNull
    private final PointF initialTouchPoint;
    private boolean isScrolling;

    @NotNull
    private final GradientDrawable locationBackgroundDrawable;
    private Function1<? super Boolean, Unit> onSwipedListener;
    private float previousTouchX;
    private final float rightLimit;
    private final int rippleColor;
    private final int scrollThreshold;
    private final int strokeWidth;
    private float swipeOffset;
    private AtomAction toAction;

    public /* synthetic */ ComplexRouteItemView(Context context, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() : i11);
    }

    private final void animateSwipeOffset(float start, float end, Function0<Unit> action) {
        int i11 = 2;
        if (action != null) {
            action.invoke();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(start, end).setDuration(500L);
        duration.setInterpolator(this.animInterpolator);
        duration.addUpdateListener(new a(this, i11));
        duration.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void animateSwipeOffset$default(ComplexRouteItemView complexRouteItemView, float f7, float f11, Function0 function0, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function0 = null;
        }
        complexRouteItemView.animateSwipeOffset(f7, f11, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateSwipeOffset$lambda$23$lambda$22(ComplexRouteItemView complexRouteItemView, ValueAnimator valueAnimator) {
        complexRouteItemView.setSwipeOffset(((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    private final void bindDate(AviaComplexSearchFormVO.Field item) {
        AviaComplexSearchFormVO.Content leftValue = item.getLeftValue();
        this.dateAction = leftValue.getClickAction();
        ItemComplexRouteBinding itemComplexRouteBinding = this.binding;
        TextAtomV2View complexRouteDateTextView = itemComplexRouteBinding.complexRouteDateTextView;
        Intrinsics.checkNotNullExpressionValue(complexRouteDateTextView, "complexRouteDateTextView");
        TextHolderKt.bind$default(complexRouteDateTextView, leftValue.getTitle(), null, 2, null);
        TextAtomV2View complexRouteDayOfWeekTextView = itemComplexRouteBinding.complexRouteDayOfWeekTextView;
        Intrinsics.checkNotNullExpressionValue(complexRouteDayOfWeekTextView, "complexRouteDayOfWeekTextView");
        TextHolderKt.bindOrGone$default(complexRouteDayOfWeekTextView, leftValue.getSubtitle(), null, 2, null);
        TextAtomV2View complexRouteDateErrorTextView = itemComplexRouteBinding.complexRouteDateErrorTextView;
        Intrinsics.checkNotNullExpressionValue(complexRouteDateErrorTextView, "complexRouteDateErrorTextView");
        TextHolderKt.bindOrGone$default(complexRouteDateErrorTextView, item.getErrorMessage(), null, 2, null);
        if (this.dateBackgroundDrawable.getCornerRadius() != item.getCornerRadius()) {
            itemComplexRouteBinding.complexRouteDateBackgroundView.setForeground(DrawableExtensionsKt.contentlessRipple(this.rippleColor, item.getCornerRadius()));
        }
        update(this.dateBackgroundDrawable, item.getBackgroundColor(), item.getCornerRadius(), item.getBorderColor());
    }

    private final void bindDeleteButton(IconButtonV3DTO item, Function1<? super AtomAction, Unit> onDeleteClickListener) {
        this.hasDeleteButton = item != null;
        IconButtonV3View complexRouteDeleteButton = this.binding.complexRouteDeleteButton;
        Intrinsics.checkNotNullExpressionValue(complexRouteDeleteButton, "complexRouteDeleteButton");
        IconButtonV3HolderKt.bindOrGone(complexRouteDeleteButton, item, onDeleteClickListener);
    }

    private final void bindDirection(AviaComplexSearchFormVO.Field item) {
        bindFrom(item.getLeftValue());
        bindTo(item.getRightValue());
        float cornerRadius = item.getCornerRadius();
        ItemComplexRouteBinding itemComplexRouteBinding = this.binding;
        IconView complexRouteLocationIconView = itemComplexRouteBinding.complexRouteLocationIconView;
        Intrinsics.checkNotNullExpressionValue(complexRouteLocationIconView, "complexRouteLocationIconView");
        IconHolderKt.bindOrGone$default(complexRouteLocationIconView, item.getIcon(), null, 2, null);
        TextAtomV2View complexRouteLocationErrorTextView = itemComplexRouteBinding.complexRouteLocationErrorTextView;
        Intrinsics.checkNotNullExpressionValue(complexRouteLocationErrorTextView, "complexRouteLocationErrorTextView");
        TextHolderKt.bindOrGone$default(complexRouteLocationErrorTextView, item.getErrorMessage(), null, 2, null);
        if (cornerRadius != this.locationBackgroundDrawable.getCornerRadius()) {
            itemComplexRouteBinding.complexRouteLocationFromClickAreaView.setForeground(DrawableExtensionsKt.contentlessRipple$default(this.rippleColor, cornerRadius, 0.0f, cornerRadius, 0.0f, 20, null));
            View view = itemComplexRouteBinding.complexRouteLocationToClickAreaView;
            RippleDrawable contentlessRipple$default = DrawableExtensionsKt.contentlessRipple$default(this.rippleColor, 0.0f, cornerRadius, 0.0f, cornerRadius, 10, null);
            cornerRadius = cornerRadius;
            view.setForeground(contentlessRipple$default);
        }
        update(this.locationBackgroundDrawable, item.getBackgroundColor(), cornerRadius, item.getBorderColor());
    }

    private final void bindFrom(AviaComplexSearchFormVO.Content item) {
        this.fromAction = item.getClickAction();
        ItemComplexRouteBinding itemComplexRouteBinding = this.binding;
        TextAtomV2View complexRouteLocationFromCodeTextView = itemComplexRouteBinding.complexRouteLocationFromCodeTextView;
        Intrinsics.checkNotNullExpressionValue(complexRouteLocationFromCodeTextView, "complexRouteLocationFromCodeTextView");
        TextHolderKt.bind$default(complexRouteLocationFromCodeTextView, item.getTitle(), null, 2, null);
        TextAtomV2View complexRouteLocationFromCityTextView = itemComplexRouteBinding.complexRouteLocationFromCityTextView;
        Intrinsics.checkNotNullExpressionValue(complexRouteLocationFromCityTextView, "complexRouteLocationFromCityTextView");
        TextHolderKt.bindOrGone$default(complexRouteLocationFromCityTextView, item.getSubtitle(), null, 2, null);
    }

    private final void bindTo(AviaComplexSearchFormVO.Content item) {
        this.toAction = item != null ? item.getClickAction() : null;
        if (item == null) {
            return;
        }
        ItemComplexRouteBinding itemComplexRouteBinding = this.binding;
        TextAtomV2View complexRouteLocationToCodeTextView = itemComplexRouteBinding.complexRouteLocationToCodeTextView;
        Intrinsics.checkNotNullExpressionValue(complexRouteLocationToCodeTextView, "complexRouteLocationToCodeTextView");
        TextHolderKt.bind$default(complexRouteLocationToCodeTextView, item.getTitle(), null, 2, null);
        TextAtomV2View complexRouteLocationToCityTextView = itemComplexRouteBinding.complexRouteLocationToCityTextView;
        Intrinsics.checkNotNullExpressionValue(complexRouteLocationToCityTextView, "complexRouteLocationToCityTextView");
        TextHolderKt.bindOrGone$default(complexRouteLocationToCityTextView, item.getSubtitle(), null, 2, null);
    }

    private final float calculateTotalWidth(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null) == null) {
            return 0.0f;
        }
        return view.getWidth() + ((ViewGroup.MarginLayoutParams) r0).leftMargin + ((ViewGroup.MarginLayoutParams) r0).rightMargin;
    }

    private final float getLeftLimit() {
        IconButtonV3View complexRouteDeleteButton = this.binding.complexRouteDeleteButton;
        Intrinsics.checkNotNullExpressionValue(complexRouteDeleteButton, "complexRouteDeleteButton");
        return -calculateTotalWidth(complexRouteDeleteButton);
    }

    private final boolean isScrollDetected(PointF pointF, float f7, float f11) {
        return Math.abs(pointF.x - f7) > ((float) this.scrollThreshold) || Math.abs(pointF.y - f11) > ((float) this.scrollThreshold);
    }

    private final void setSwipeOffset(float f7) {
        if (this.swipeOffset == f7) {
            return;
        }
        this.swipeOffset = f7;
        translateChildrenX(f7);
    }

    private final void setUpDateView() {
        View view = this.binding.complexRouteDateBackgroundView;
        view.setBackground(this.dateBackgroundDrawable);
        view.setOnClickListener(new FG.a(this, 23));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpDateView$lambda$21$lambda$20(ComplexRouteItemView complexRouteItemView, View view) {
        Function1<? super AtomAction, Unit> function1;
        float f7 = complexRouteItemView.swipeOffset;
        float f11 = complexRouteItemView.rightLimit;
        if (f7 != f11) {
            complexRouteItemView.animateSwipeOffset(f7, f11, new ComplexRouteItemView$invokeIfDeleteButtonIsHidden$1(complexRouteItemView));
            return;
        }
        AtomAction atomAction = complexRouteItemView.dateAction;
        if (atomAction == null || (function1 = complexRouteItemView.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final void setUpLocationView() {
        ItemComplexRouteBinding itemComplexRouteBinding = this.binding;
        itemComplexRouteBinding.complexRouteLocationBackgroundView.setBackground(this.locationBackgroundDrawable);
        itemComplexRouteBinding.complexRouteLocationFromClickAreaView.setOnClickListener(new BC.a(this, 17));
        itemComplexRouteBinding.complexRouteLocationToClickAreaView.setOnClickListener(new ViewOnClickListenerC2437a(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpLocationView$lambda$17$lambda$13(ComplexRouteItemView complexRouteItemView, View view) {
        Function1<? super AtomAction, Unit> function1;
        float f7 = complexRouteItemView.swipeOffset;
        float f11 = complexRouteItemView.rightLimit;
        if (f7 != f11) {
            complexRouteItemView.animateSwipeOffset(f7, f11, new ComplexRouteItemView$invokeIfDeleteButtonIsHidden$1(complexRouteItemView));
            return;
        }
        AtomAction atomAction = complexRouteItemView.fromAction;
        if (atomAction == null || (function1 = complexRouteItemView.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpLocationView$lambda$17$lambda$16(ComplexRouteItemView complexRouteItemView, View view) {
        Function1<? super AtomAction, Unit> function1;
        float f7 = complexRouteItemView.swipeOffset;
        float f11 = complexRouteItemView.rightLimit;
        if (f7 != f11) {
            complexRouteItemView.animateSwipeOffset(f7, f11, new ComplexRouteItemView$invokeIfDeleteButtonIsHidden$1(complexRouteItemView));
            return;
        }
        AtomAction atomAction = complexRouteItemView.toAction;
        if (atomAction == null || (function1 = complexRouteItemView.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final void setUpView() {
        C5314e0 c11 = C5316f0.c(this);
        while (c11.hasNext()) {
            View view = (View) c11.next();
            if (view instanceof TextAtomV2View) {
                TextAtomV2View textAtomV2View = (TextAtomV2View) view;
                textAtomV2View.setTextIsSelectable(false);
                textAtomV2View.setClickable(false);
                textAtomV2View.setFocusable(false);
            }
        }
        setUpLocationView();
        setUpDateView();
    }

    private final void showAndHideDeleteButton() {
        int i11 = 1;
        int i12 = 2;
        float f7 = this.swipeOffset;
        float f11 = this.rightLimit;
        if (f7 != f11) {
            setSwipeOffset(f11);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.rightLimit, this.animationOffset).setDuration(500L);
        duration.setInterpolator(this.animInterpolator);
        duration.setStartDelay(300L);
        duration.addUpdateListener(new C7315a(this, i11));
        ValueAnimator duration2 = ValueAnimator.ofFloat(this.animationOffset, this.rightLimit).setDuration(500L);
        duration2.setStartDelay(500L);
        duration2.setInterpolator(this.animInterpolator);
        duration2.addUpdateListener(new C8355a(this, i12));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration2).after(duration);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAndHideDeleteButton$lambda$1$lambda$0(ComplexRouteItemView complexRouteItemView, ValueAnimator valueAnimator) {
        complexRouteItemView.setSwipeOffset(((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAndHideDeleteButton$lambda$3$lambda$2(ComplexRouteItemView complexRouteItemView, ValueAnimator valueAnimator) {
        complexRouteItemView.setSwipeOffset(((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    private final void translateChildrenX(float value) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).setTranslationX(value);
        }
    }

    private final void update(GradientDrawable gradientDrawable, String str, float f7, String str2) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, str2);
        gradientDrawable.setStroke(this.strokeWidth, parseColor != null ? parseColor.intValue() : 0);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context2, str);
        int intValue = parseColor2 != null ? parseColor2.intValue() : 0;
        int[] colors = gradientDrawable.getColors();
        if (colors == null || colors.length == 0 || colors[0] != intValue) {
            gradientDrawable.setColors(new int[]{intValue, intValue});
        }
        if (gradientDrawable.getCornerRadius() == f7) {
            return;
        }
        gradientDrawable.setCornerRadius(f7);
    }

    public final void bind(@NotNull AviaComplexSearchFormVO.Flight item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super Boolean, Unit> onSwipedListener, @NotNull Function1<? super Boolean, Boolean> getIsDemoAnimationRequired) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onSwipedListener, "onSwipedListener");
        Intrinsics.checkNotNullParameter(getIsDemoAnimationRequired, "getIsDemoAnimationRequired");
        this.actionHandler = actionHandler;
        this.onSwipedListener = onSwipedListener;
        bindDeleteButton(item.getDeleteButton(), actionHandler);
        bindDirection(item.getDirection());
        bindDate(item.getDate());
        if (Intrinsics.d(getIsDemoAnimationRequired.invoke(Boolean.valueOf(item.getIsAnimateItem())), Boolean.TRUE)) {
            showAndHideDeleteButton();
            return;
        }
        if (item.getIsSwiped()) {
            return;
        }
        float f7 = this.swipeOffset;
        float f11 = this.rightLimit;
        if (f7 == f11) {
            return;
        }
        setSwipeOffset(f11);
    }

    public final void hideDeleteButton() {
        animateSwipeOffset$default(this, this.swipeOffset, this.rightLimit, null, 4, null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.hasDeleteButton) {
            return false;
        }
        this.previousTouchX = event.getX();
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.initialTouchPoint.set(event.getX(), event.getY());
            return false;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.isScrolling) {
                    return true;
                }
                if (!isScrollDetected(this.initialTouchPoint, event.getX(), event.getY())) {
                    return false;
                }
                this.isScrolling = true;
                return true;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        this.isScrolling = false;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r5 != 3) goto L31;
     */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.hasDeleteButton) {
            return false;
        }
        float x11 = event.getX();
        int actionMasked = event.getActionMasked();
        if (actionMasked != 1) {
            int i11 = 2;
            if (actionMasked == 2) {
                float f7 = x11 - this.previousTouchX;
                this.previousTouchX = x11;
                if (f7 < 0.0f) {
                    i11 = 1;
                } else if (f7 <= 0.0f) {
                    i11 = -1;
                }
                this.direction = i11;
                float f11 = this.swipeOffset + f7;
                float f12 = this.rightLimit;
                if (f11 > f12) {
                    f11 = f12;
                } else if (f11 < getLeftLimit()) {
                    f11 = getLeftLimit();
                }
                setSwipeOffset(f11);
            }
            return true;
        }
        this.isScrolling = false;
        animateSwipeOffset(this.swipeOffset, this.direction == 1 ? getLeftLimit() : this.rightLimit, new ComplexRouteItemView$onTouchEvent$1(this));
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplexRouteItemView(@NotNull Context context, int i11) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scrollThreshold = i11;
        ItemComplexRouteBinding inflate = ItemComplexRouteBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.strokeWidth = ResourceExtKt.toPx(1, context);
        this.animationOffset = ResourceExtKt.toPxF(-64, context);
        this.locationBackgroundDrawable = new GradientDrawable();
        this.dateBackgroundDrawable = new GradientDrawable();
        this.rippleColor = ThemeExtKt.themeColor(context, UniColors.BG_ACTION_SECONDARY.getResId());
        this.initialTouchPoint = new PointF(0.0f, 0.0f);
        this.direction = -1;
        this.animInterpolator = new AccelerateDecelerateInterpolator();
        this.swipeOffset = this.rightLimit;
        setUpView();
    }
}
