package ru.ozon.app.android.marketing.widgets.coupon.presentation;

import EE.a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.common.view.GradientCouponView;
import ru.ozon.app.android.marketing.coupon.utils.CouponUtilsKt;
import ru.ozon.app.android.marketing.databinding.WidgetGradientCouponBinding;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\nJ\u001b\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR(\u0010\u001c\u001a\u0004\u0018\u00010\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponBinder;", "", "Lru/ozon/app/android/marketing/databinding/WidgetGradientCouponBinding;", "binding", "<init>", "(Lru/ozon/app/android/marketing/databinding/WidgetGradientCouponBinding;)V", "", "isMiniWidget", "", "setMiniWidgetMode", "(Z)V", "Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;", "item", "bind", "(Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;Z)V", "isApplied", "setApplied", "", "", "appliedCoupons", "isCouponApplied", "(Ljava/util/Set;)Z", "Lkotlin/Function0;", "onClick", "setOnClickListener", "(Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/marketing/databinding/WidgetGradientCouponBinding;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "couponCode", "Ljava/lang/String;", "getCouponCode", "()Ljava/lang/String;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponBinder {

    @NotNull
    private final WidgetGradientCouponBinding binding;
    private String couponCode;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int miniWidgetMargin = ResourceExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponBinder$Companion;", "", "<init>", "()V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CouponBinder(@NotNull WidgetGradientCouponBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    private final void setMiniWidgetMode(boolean isMiniWidget) {
        GradientCouponView gradientCouponView = this.binding.couponView;
        ViewGroup.LayoutParams layoutParams = gradientCouponView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = isMiniWidget ? miniWidgetMargin : 0;
        gradientCouponView.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnClickListener$lambda$1(CouponBinder couponBinder, Function0 function0, View view) {
        if (couponBinder.binding.couponView.getIsApplied()) {
            return;
        }
        function0.invoke();
    }

    public final void bind(@NotNull CouponVO item, boolean isMiniWidget) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetGradientCouponBinding widgetGradientCouponBinding = this.binding;
        setMiniWidgetMode(isMiniWidget);
        AtomAction action = item.getAction();
        AtomAction.ComposerAction composerAction = action instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) action : null;
        this.couponCode = composerAction != null ? CouponUtilsKt.findCouponCode(composerAction) : null;
        widgetGradientCouponBinding.couponView.setApplied(item.getAction() == null);
        widgetGradientCouponBinding.couponView.bindApplyText(item.getApplyText());
        widgetGradientCouponBinding.couponView.bindAppliedColor(item.getAppliedColor());
        widgetGradientCouponBinding.couponView.bindCodeText(item.getCode());
        widgetGradientCouponBinding.couponView.bindSubtitleText(item.getSubtitle());
        widgetGradientCouponBinding.couponView.setGradient(item.getGradient().getStartColor(), item.getGradient().getEndColor());
    }

    public final boolean isCouponApplied(@NotNull Set<String> appliedCoupons) {
        Intrinsics.checkNotNullParameter(appliedCoupons, "appliedCoupons");
        return C7714v.A(appliedCoupons, this.couponCode);
    }

    public final void setApplied(boolean isApplied) {
        this.binding.couponView.setApplied(isApplied);
    }

    public final void setOnClickListener(@NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.binding.couponView.setOnClickListener(new a(12, this, onClick));
    }
}
