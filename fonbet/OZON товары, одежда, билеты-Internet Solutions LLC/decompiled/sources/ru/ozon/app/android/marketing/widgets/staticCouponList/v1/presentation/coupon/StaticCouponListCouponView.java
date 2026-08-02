package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.coupon;

import Ax.ViewOnClickListenerC2451a;
import Cw.b;
import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListBackground;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rJ\u0014\u0010\u000e\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"J\b\u0010$\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/coupon/StaticCouponListCouponView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "couponView", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/coupon/StaticCouponListPrimaryCouponView;", "stubView", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/coupon/StaticCouponListStubView;", "setOnStubClickListener", "", "click", "Lkotlin/Function0;", "setOnCuponClickListener", "bind", "item", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon;", "bindLeftIcon", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "bindBgColor", "bgColor", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "bindIsApplied", "bindIsAppliedAnimated", "bindChevron", "bindTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "bindSubtitle", "subtitle", "bindStubText", "stub", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon$Stub;", "bindStubColor", "addViews", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListCouponView extends LinearLayout {

    @NotNull
    private final StaticCouponListPrimaryCouponView couponView;

    @NotNull
    private final StaticCouponListStubView stubView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/coupon/StaticCouponListCouponView$Companion;", "", "<init>", "()V", "COUPON_WEIGHT", "", "STUB_WEIGHT", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticCouponListCouponView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        StaticCouponListPrimaryCouponView staticCouponListPrimaryCouponView = new StaticCouponListPrimaryCouponView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 0.7f;
        staticCouponListPrimaryCouponView.setLayoutParams(layoutParams);
        this.couponView = staticCouponListPrimaryCouponView;
        StaticCouponListStubView staticCouponListStubView = new StaticCouponListStubView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
        layoutParams2.weight = 0.3f;
        staticCouponListStubView.setLayoutParams(layoutParams2);
        this.stubView = staticCouponListStubView;
        setOrientation(0);
        addViews();
    }

    private final void addViews() {
        addView(this.couponView);
        addView(this.stubView);
    }

    public final void bind(@NotNull StaticCouponListVO.ContentItem.Coupon item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.couponView.bind(item);
        this.stubView.bind(item.getStub());
    }

    public final void bindBgColor(@NotNull StaticCouponListBackground bgColor) {
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        this.couponView.bindBgColor(bgColor);
    }

    public final void bindChevron(@NotNull IconDTO icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.couponView.bindChevron(icon);
    }

    public final void bindIsApplied(@NotNull StaticCouponListVO.ContentItem.Coupon item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.couponView.bindIsApplied(item.getIsApplied());
        this.stubView.bind(item.getStub());
    }

    public final void bindIsAppliedAnimated(@NotNull StaticCouponListVO.ContentItem.Coupon item) {
        Intrinsics.checkNotNullParameter(item, "item");
        StaticCouponListCouponAnimationKt.animateTear(this.stubView, new StaticCouponListCouponView$bindIsAppliedAnimated$1(this, item));
    }

    public final void bindLeftIcon(IconDTO icon) {
        this.couponView.bindLeftIcon(icon);
    }

    public final void bindStubColor(@NotNull StaticCouponListVO.ContentItem.Coupon.Stub stub) {
        Intrinsics.checkNotNullParameter(stub, "stub");
        this.stubView.bindBgColor(stub);
    }

    public final void bindStubText(@NotNull StaticCouponListVO.ContentItem.Coupon.Stub stub) {
        Intrinsics.checkNotNullParameter(stub, "stub");
        this.stubView.bindStubText(stub);
    }

    public final void bindSubtitle(@NotNull TextDTO subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.couponView.bindSubtitle(subtitle);
    }

    public final void bindTitle(@NotNull TextDTO title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.couponView.bindTitle(title);
    }

    public final void setOnCuponClickListener(@NotNull Function0<Unit> click) {
        Intrinsics.checkNotNullParameter(click, "click");
        this.couponView.setOnClickListener(new ViewOnClickListenerC2451a(click, 12));
    }

    public final void setOnStubClickListener(@NotNull Function0<Unit> click) {
        Intrinsics.checkNotNullParameter(click, "click");
        this.stubView.setOnClickListener(new b(click, 9));
    }
}
