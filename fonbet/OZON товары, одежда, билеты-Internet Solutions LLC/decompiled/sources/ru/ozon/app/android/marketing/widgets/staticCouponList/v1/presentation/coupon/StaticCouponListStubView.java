package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.coupon;

import Am.C2438a;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListBackground;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u0010\u0017\u001a\u00020\u000f*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001b\u0010\u001b\u001a\u00020\u000f*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/coupon/StaticCouponListStubView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "paddingHorizontal", "", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTextView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "bind", "", "item", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon$Stub;", "bindStubText", "bindBgColor", "bindText", "setBackground", "bindBackgroundColors", "bindBackgroundUnAppliedColor", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/coupon/StaticCouponListCouponDrawable;", "backgroundColors", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "bindBackgroundAppliedColor", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$Colors$Solid;", "bindBackgroundAppliedColor-IjTnD-w", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/coupon/StaticCouponListCouponDrawable;Ljava/lang/Integer;)V", "bindBackgroundIsApplied", "isApplied", "", "createBackgroundDrawable", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListStubView extends FrameLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(StaticCouponListStubView.class, "textView", "getTextView()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = TextAtomV2View.$stable | PreCreationViewPoolDelegate.$stable;
    private final int paddingHorizontal;

    /* renamed from: textView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticCouponListStubView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4, context);
        this.paddingHorizontal = px;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.textView = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new StaticCouponListStubView$special$$inlined$preCreationViewPool$default$1(this), new StaticCouponListStubView$special$$inlined$preCreationViewPool$default$2());
        addView(getTextView());
        setPadding(px, getPaddingTop(), px, getPaddingBottom());
        setBackground();
    }

    /* renamed from: bindBackgroundAppliedColor-IjTnD-w, reason: not valid java name */
    private final void m802bindBackgroundAppliedColorIjTnDw(StaticCouponListCouponDrawable staticCouponListCouponDrawable, Integer num) {
        staticCouponListCouponDrawable.bindSolidBackground(num != null ? num.intValue() : getContext().getColor(UniColors.BG_LIGHT_KEY.getResId()));
    }

    private final void bindBackgroundColors(StaticCouponListVO.ContentItem.Coupon.Stub item) {
        Drawable background = getBackground();
        StaticCouponListCouponDrawable staticCouponListCouponDrawable = background instanceof StaticCouponListCouponDrawable ? (StaticCouponListCouponDrawable) background : null;
        if (staticCouponListCouponDrawable == null) {
            staticCouponListCouponDrawable = createBackgroundDrawable();
            setBackground(staticCouponListCouponDrawable);
        }
        if (item.getIsApplied() && (item.getAppliedBg().getColors() instanceof StaticCouponListBackground.Colors.Solid)) {
            m802bindBackgroundAppliedColorIjTnDw(staticCouponListCouponDrawable, ((StaticCouponListBackground.Colors.Solid) item.getAppliedBg().getColors()).getColor());
        } else {
            bindBackgroundUnAppliedColor(staticCouponListCouponDrawable, item.getIsApplied() ? item.getAppliedBg() : item.getUnappliedBg());
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
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.coupon.StaticCouponListStubView$bindBackgroundIsApplied$$inlined$doOnLayout$1
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

    private final void bindBackgroundUnAppliedColor(final StaticCouponListCouponDrawable staticCouponListCouponDrawable, StaticCouponListBackground staticCouponListBackground) {
        final StaticCouponListBackground.Colors colors = staticCouponListBackground.getColors();
        if (colors instanceof StaticCouponListBackground.Colors.Solid) {
            Integer color = ((StaticCouponListBackground.Colors.Solid) colors).getColor();
            staticCouponListCouponDrawable.bindSolidBackground(color != null ? color.intValue() : getContext().getColor(UniColors.BG_LIGHT_KEY.getResId()));
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
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.coupon.StaticCouponListStubView$bindBackgroundUnAppliedColor$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    StaticCouponListCouponDrawable.this.bindGradientBackground(((StaticCouponListBackground.Colors.Gradient) colors).getGradientDirection(), new int[]{((StaticCouponListBackground.Colors.Gradient) colors).getFromColor().intValue(), ((StaticCouponListBackground.Colors.Gradient) colors).getToColor().intValue()}, this.getWidth(), this.getHeight(), this.getLeft());
                }
            });
        } else {
            staticCouponListCouponDrawable.bindGradientBackground(gradient.getGradientDirection(), new int[]{gradient.getFromColor().intValue(), gradient.getToColor().intValue()}, getWidth(), getHeight(), getLeft());
        }
    }

    private final void bindText(StaticCouponListVO.ContentItem.Coupon.Stub item) {
        TextHolderKt.bind$default(getTextView(), item.getIsApplied() ? item.getAppliedText() : item.getUnAppliedText(), null, 2, null);
    }

    private final StaticCouponListCouponDrawable createBackgroundDrawable() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int color = ResourceExtKt.color(context, UniColors.BG_LIGHT_KEY.getResId());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new StaticCouponListCouponDrawable(context2, color, true);
    }

    private final TextAtomV2View getTextView() {
        return (TextAtomV2View) this.textView.getValue(this, $$delegatedProperties[0]);
    }

    private final void setBackground() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int color = ResourceExtKt.color(context, UniColors.BG_LIGHT_KEY.getResId());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setBackground(new StaticCouponListCouponDrawable(context2, color, true));
    }

    public final void bind(@NotNull StaticCouponListVO.ContentItem.Coupon.Stub item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindText(item);
        bindBackgroundColors(item);
        bindBackgroundIsApplied(item.getIsApplied());
    }

    public final void bindBgColor(@NotNull StaticCouponListVO.ContentItem.Coupon.Stub item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindBackgroundColors(item);
    }

    public final void bindStubText(@NotNull StaticCouponListVO.ContentItem.Coupon.Stub item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindText(item);
    }
}
