package ru.ozon.app.android.marketing.widgets.coupon.common;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.coupon.core.CouponUpdateState;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/common/CouponState;", "", "<init>", "()V", "NeedLogin", "ReadyToApply", "Applied", "ChangeMiniWidget", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponState$Applied;", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponState$ChangeMiniWidget;", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponState$NeedLogin;", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponState$ReadyToApply;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CouponState {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/common/CouponState$Applied;", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponState;", "<init>", "()V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Applied extends CouponState {

        @NotNull
        public static final Applied INSTANCE = new Applied();

        private Applied() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/common/CouponState$ChangeMiniWidget;", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponState;", "Lru/ozon/app/android/marketing/widgets/coupon/core/CouponUpdateState;", "couponState", "LA00/a$J$a;", "newWidgetState", "<init>", "(Lru/ozon/app/android/marketing/widgets/coupon/core/CouponUpdateState;LA00/a$J$a;)V", "Lru/ozon/app/android/marketing/widgets/coupon/core/CouponUpdateState;", "getCouponState", "()Lru/ozon/app/android/marketing/widgets/coupon/core/CouponUpdateState;", "LA00/a$J$a;", "getNewWidgetState", "()LA00/a$J$a;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChangeMiniWidget extends CouponState {
        private final CouponUpdateState couponState;
        private final a.J.InterfaceC0007a newWidgetState;

        public ChangeMiniWidget(CouponUpdateState couponUpdateState, a.J.InterfaceC0007a interfaceC0007a) {
            super(null);
            this.couponState = couponUpdateState;
            this.newWidgetState = interfaceC0007a;
        }

        public final CouponUpdateState getCouponState() {
            return this.couponState;
        }

        public final a.J.InterfaceC0007a getNewWidgetState() {
            return this.newWidgetState;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/common/CouponState$NeedLogin;", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponState;", "<init>", "()V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NeedLogin extends CouponState {

        @NotNull
        public static final NeedLogin INSTANCE = new NeedLogin();

        private NeedLogin() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/common/CouponState$ReadyToApply;", "Lru/ozon/app/android/marketing/widgets/coupon/common/CouponState;", "<init>", "()V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReadyToApply extends CouponState {

        @NotNull
        public static final ReadyToApply INSTANCE = new ReadyToApply();

        private ReadyToApply() {
            super(null);
        }
    }

    public /* synthetic */ CouponState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CouponState() {
    }
}
