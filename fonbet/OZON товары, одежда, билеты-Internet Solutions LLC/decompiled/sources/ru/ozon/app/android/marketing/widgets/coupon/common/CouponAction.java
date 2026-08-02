package ru.ozon.app.android.marketing.widgets.coupon.common;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.coupon.core.CouponUpdateState;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperCurrentMiniWidget;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/common/CouponAction;", "", "<init>", "()V", "FullRefresh", "CouponAsyncRefresh", "AsyncRefresh", "UpdateCurrentMiniWidget", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponAction$AsyncRefresh;", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponAction$CouponAsyncRefresh;", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponAction$FullRefresh;", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponAction$UpdateCurrentMiniWidget;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CouponAction {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/common/CouponAction$AsyncRefresh;", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponAction;", "Lru/ozon/app/android/marketing/widgets/coupon/core/CouponUpdateState;", "fromState", "LA00/a$J$a;", "toState", "cartData", "<init>", "(Lru/ozon/app/android/marketing/widgets/coupon/core/CouponUpdateState;LA00/a$J$a;LA00/a$J$a;)V", "Lru/ozon/app/android/marketing/widgets/coupon/core/CouponUpdateState;", "getFromState", "()Lru/ozon/app/android/marketing/widgets/coupon/core/CouponUpdateState;", "LA00/a$J$a;", "getToState", "()LA00/a$J$a;", "getCartData", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AsyncRefresh extends CouponAction {
        private final a.J.InterfaceC0007a cartData;

        @NotNull
        private final CouponUpdateState fromState;
        private final a.J.InterfaceC0007a toState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AsyncRefresh(@NotNull CouponUpdateState fromState, a.J.InterfaceC0007a interfaceC0007a, a.J.InterfaceC0007a interfaceC0007a2) {
            super(null);
            Intrinsics.checkNotNullParameter(fromState, "fromState");
            this.fromState = fromState;
            this.toState = interfaceC0007a;
            this.cartData = interfaceC0007a2;
        }

        public final a.J.InterfaceC0007a getCartData() {
            return this.cartData;
        }

        @NotNull
        public final CouponUpdateState getFromState() {
            return this.fromState;
        }

        public final a.J.InterfaceC0007a getToState() {
            return this.toState;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/common/CouponAction$CouponAsyncRefresh;", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponAction;", "newCouponState", "Lru/ozon/app/android/marketing/widgets/coupon/core/CouponUpdateState;", "<init>", "(Lru/ozon/app/android/marketing/widgets/coupon/core/CouponUpdateState;)V", "getNewCouponState", "()Lru/ozon/app/android/marketing/widgets/coupon/core/CouponUpdateState;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CouponAsyncRefresh extends CouponAction {

        @NotNull
        private final CouponUpdateState newCouponState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CouponAsyncRefresh(@NotNull CouponUpdateState newCouponState) {
            super(null);
            Intrinsics.checkNotNullParameter(newCouponState, "newCouponState");
            this.newCouponState = newCouponState;
        }

        @NotNull
        public final CouponUpdateState getNewCouponState() {
            return this.newCouponState;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/common/CouponAction$FullRefresh;", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponAction;", "<init>", "()V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FullRefresh extends CouponAction {

        @NotNull
        public static final FullRefresh INSTANCE = new FullRefresh();

        private FullRefresh() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/common/CouponAction$UpdateCurrentMiniWidget;", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponAction;", "currentMiniWidget", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperCurrentMiniWidget;", "<init>", "(Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperCurrentMiniWidget;)V", "getCurrentMiniWidget", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperCurrentMiniWidget;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UpdateCurrentMiniWidget extends CouponAction {

        @NotNull
        private final HighlightsWrapperCurrentMiniWidget currentMiniWidget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateCurrentMiniWidget(@NotNull HighlightsWrapperCurrentMiniWidget currentMiniWidget) {
            super(null);
            Intrinsics.checkNotNullParameter(currentMiniWidget, "currentMiniWidget");
            this.currentMiniWidget = currentMiniWidget;
        }

        @NotNull
        public final HighlightsWrapperCurrentMiniWidget getCurrentMiniWidget() {
            return this.currentMiniWidget;
        }
    }

    public /* synthetic */ CouponAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CouponAction() {
    }
}
