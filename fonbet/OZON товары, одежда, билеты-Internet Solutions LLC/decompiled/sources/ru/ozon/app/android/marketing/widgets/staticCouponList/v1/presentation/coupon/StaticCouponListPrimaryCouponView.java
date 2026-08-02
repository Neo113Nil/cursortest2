package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.coupon;

import Am.C2438a;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListBackground;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"J\u000e\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020,J\u0010\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020%H\u0002J\u0010\u00101\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(H\u0002J\b\u00102\u001a\u00020\u001dH\u0002J\b\u00103\u001a\u00020\u001dH\u0002J\b\u00104\u001a\u00020\u001dH\u0002J\b\u00105\u001a\u000206H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0017\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001a\u0010\f¨\u00067"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/coupon/StaticCouponListPrimaryCouponView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp16", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "getIconView", "()Lru/ozon/uni/android/atom/icon/IconView;", "iconView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "barrier", "Landroidx/constraintlayout/widget/Barrier;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView$delegate", "subtitleView", "getSubtitleView", "subtitleView$delegate", "chevronView", "getChevronView", "chevronView$delegate", "bind", "", "item", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon;", "bindLeftIcon", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "bindBgColor", "bgColor", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "bindIsApplied", "isApplied", "", "bindChevron", "bindTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "bindSubtitle", "subtitle", "bindBackgroundColor", "backgroundColors", "bindBackgroundIsApplied", "addViews", "setUpConstrains", "setBackground", "createBackgroundDrawable", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/coupon/StaticCouponListCouponDrawable;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListPrimaryCouponView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(StaticCouponListPrimaryCouponView.class, "iconView", "getIconView()Lru/ozon/uni/android/atom/icon/IconView;", 0), C2438a.c(StaticCouponListPrimaryCouponView.class, "titleView", "getTitleView()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(StaticCouponListPrimaryCouponView.class, "subtitleView", "getSubtitleView()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(StaticCouponListPrimaryCouponView.class, "chevronView", "getChevronView()Lru/ozon/uni/android/atom/icon/IconView;", 0)};
    public static final int $stable = 8;

    @NotNull
    private final Barrier barrier;

    /* renamed from: chevronView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate chevronView;
    private final int dp16;
    private final int dp8;

    /* renamed from: iconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate iconView;

    /* renamed from: subtitleView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate subtitleView;

    /* renamed from: titleView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticCouponListPrimaryCouponView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.iconView = new PreCreationViewPoolDelegate(context2, N.b(IconView.class), new StaticCouponListPrimaryCouponView$special$$inlined$preCreationViewPool$default$1(this), new StaticCouponListPrimaryCouponView$special$$inlined$preCreationViewPool$default$2(this));
        Barrier barrier = new Barrier(context);
        barrier.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41615V = 1;
        barrier.f(6);
        barrier.setReferencedIds(new int[]{getIconView().getId()});
        barrier.d(false);
        barrier.setLayoutParams(bVar);
        this.barrier = barrier;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.titleView = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new StaticCouponListPrimaryCouponView$special$$inlined$preCreationViewPool$default$3(this), new StaticCouponListPrimaryCouponView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.subtitleView = new PreCreationViewPoolDelegate(context4, N.b(TextAtomV2View.class), new StaticCouponListPrimaryCouponView$special$$inlined$preCreationViewPool$default$5(this), new StaticCouponListPrimaryCouponView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.chevronView = new PreCreationViewPoolDelegate(context5, N.b(IconView.class), new StaticCouponListPrimaryCouponView$special$$inlined$preCreationViewPool$default$7(this), new StaticCouponListPrimaryCouponView$special$$inlined$preCreationViewPool$default$8());
        addViews();
        setUpConstrains();
        setPadding(px2, getPaddingTop(), px, getPaddingBottom());
        setBackground();
    }

    private final void addViews() {
        addView(getIconView());
        addView(this.barrier);
        addView(getTitleView());
        addView(getSubtitleView());
        addView(getChevronView());
    }

    private final void bindBackgroundColor(StaticCouponListBackground backgroundColors) {
        Drawable background = getBackground();
        StaticCouponListCouponDrawable staticCouponListCouponDrawable = background instanceof StaticCouponListCouponDrawable ? (StaticCouponListCouponDrawable) background : null;
        if (staticCouponListCouponDrawable == null) {
            staticCouponListCouponDrawable = createBackgroundDrawable();
            setBackground(staticCouponListCouponDrawable);
        }
        final StaticCouponListCouponDrawable staticCouponListCouponDrawable2 = staticCouponListCouponDrawable;
        final StaticCouponListBackground.Colors colors = backgroundColors.getColors();
        if (colors instanceof StaticCouponListBackground.Colors.Solid) {
            Integer color = ((StaticCouponListBackground.Colors.Solid) colors).getColor();
            staticCouponListCouponDrawable2.bindSolidBackground(color != null ? color.intValue() : getContext().getColor(UniColors.BG_LIGHT_KEY.getResId()));
            return;
        }
        if (!(colors instanceof StaticCouponListBackground.Colors.Gradient)) {
            throw new o();
        }
        StaticCouponListBackground.Colors.Gradient gradient = (StaticCouponListBackground.Colors.Gradient) colors;
        if (gradient.getFromColor() == null || gradient.getToColor() == null) {
            return;
        }
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.coupon.StaticCouponListPrimaryCouponView$bindBackgroundColor$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    StaticCouponListCouponDrawable.this.bindGradientBackground(((StaticCouponListBackground.Colors.Gradient) colors).getGradientDirection(), new int[]{((StaticCouponListBackground.Colors.Gradient) colors).getFromColor().intValue(), ((StaticCouponListBackground.Colors.Gradient) colors).getToColor().intValue()}, this.getWidth(), this.getHeight(), this.getLeft());
                }
            });
        } else {
            staticCouponListCouponDrawable2.bindGradientBackground(gradient.getGradientDirection(), new int[]{gradient.getFromColor().intValue(), gradient.getToColor().intValue()}, getWidth(), getHeight(), getLeft());
        }
    }

    private final void bindBackgroundIsApplied(final boolean isApplied) {
        Drawable background = getBackground();
        final StaticCouponListCouponDrawable staticCouponListCouponDrawable = background instanceof StaticCouponListCouponDrawable ? (StaticCouponListCouponDrawable) background : null;
        if (staticCouponListCouponDrawable == null) {
            staticCouponListCouponDrawable = createBackgroundDrawable();
            setBackground(staticCouponListCouponDrawable);
        }
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.coupon.StaticCouponListPrimaryCouponView$bindBackgroundIsApplied$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    StaticCouponListCouponDrawable.this.setApplied(isApplied);
                }
            });
        } else {
            staticCouponListCouponDrawable.setApplied(isApplied);
        }
    }

    private final StaticCouponListCouponDrawable createBackgroundDrawable() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int color = ResourceExtKt.color(context, UniColors.BG_LIGHT_KEY.getResId());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new StaticCouponListCouponDrawable(context2, color, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconView getChevronView() {
        return (IconView) this.chevronView.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconView getIconView() {
        return (IconView) this.iconView.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getSubtitleView() {
        return (TextAtomV2View) this.subtitleView.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTitleView() {
        return (TextAtomV2View) this.titleView.getValue(this, $$delegatedProperties[1]);
    }

    private final void setBackground() {
        setBackground(createBackgroundDrawable());
    }

    private final void setUpConstrains() {
        ConstraintLayoutExtKt.updateConstraints(this, new StaticCouponListPrimaryCouponView$setUpConstrains$1(this));
    }

    public final void bind(@NotNull StaticCouponListVO.ContentItem.Coupon item) {
        Intrinsics.checkNotNullParameter(item, "item");
        IconHolderKt.bindOrGone$default(getIconView(), item.getLeftIcon(), null, 2, null);
        TextHolderKt.bind$default(getTitleView(), item.getTitle(), null, 2, null);
        TextHolderKt.bind$default(getSubtitleView(), item.getSubtitle(), null, 2, null);
        IconHolderKt.bindOrGone$default(getChevronView(), item.getChevron(), null, 2, null);
        bindBackgroundColor(item.getBg());
        bindBackgroundIsApplied(item.getIsApplied());
    }

    public final void bindBgColor(@NotNull StaticCouponListBackground bgColor) {
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        bindBackgroundColor(bgColor);
    }

    public final void bindChevron(@NotNull IconDTO icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        IconHolderKt.bindOrGone$default(getChevronView(), icon, null, 2, null);
    }

    public final void bindIsApplied(boolean isApplied) {
        bindBackgroundIsApplied(isApplied);
    }

    public final void bindLeftIcon(IconDTO icon) {
        IconHolderKt.bindOrGone$default(getIconView(), icon, null, 2, null);
    }

    public final void bindSubtitle(@NotNull TextDTO subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        TextHolderKt.bind$default(getSubtitleView(), subtitle, null, 2, null);
    }

    public final void bindTitle(@NotNull TextDTO title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextHolderKt.bind$default(getTitleView(), title, null, 2, null);
    }
}
