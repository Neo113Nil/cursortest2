package ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.purchase;

import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.InstallmentVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010!\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001b\u0010$\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001b\u0010'\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001d¨\u0006("}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/purchase/InstallmentPurchaseView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "", "isSelect", "<init>", "(Landroid/content/Context;Z)V", "Landroid/view/View$OnClickListener;", "onClickListener", "", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/purchase/PdpPriceWithTitleView;", "installmentPwtv", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/purchase/PdpPriceWithTitleView;", "getInstallmentPwtv", "()Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/purchase/PdpPriceWithTitleView;", "Landroid/graphics/drawable/ShapeDrawable;", "backgroundNoneRoundRectShape$delegate", "LSc/j;", "getBackgroundNoneRoundRectShape", "()Landroid/graphics/drawable/ShapeDrawable;", "backgroundNoneRoundRectShape", "backgroundTopRoundRectShape$delegate", "getBackgroundTopRoundRectShape", "backgroundTopRoundRectShape", "backgroundBottomRoundRectShape$delegate", "getBackgroundBottomRoundRectShape", "backgroundBottomRoundRectShape", "backgroundAllRoundRectShape$delegate", "getBackgroundAllRoundRectShape", "backgroundAllRoundRectShape", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class InstallmentPurchaseView extends FrameLayout {

    /* renamed from: backgroundAllRoundRectShape$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundAllRoundRectShape;

    /* renamed from: backgroundBottomRoundRectShape$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundBottomRoundRectShape;

    /* renamed from: backgroundNoneRoundRectShape$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundNoneRoundRectShape;

    /* renamed from: backgroundTopRoundRectShape$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundTopRoundRectShape;

    @NotNull
    private final PdpPriceWithTitleView installmentPwtv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallmentPurchaseView(@NotNull Context context, boolean z11) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        PdpPriceWithTitleView pdpPriceWithTitleView = new PdpPriceWithTitleView(context, z11);
        pdpPriceWithTitleView.setId(R$id.priceInstallmentPwtv);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        int dp_12 = dimens.getDP_12();
        layoutParams.setMargins(dp_12, dp_12, dp_12, dp_12);
        pdpPriceWithTitleView.setLayoutParams(layoutParams);
        this.installmentPwtv = pdpPriceWithTitleView;
        this.backgroundNoneRoundRectShape = DelegatesKt.lazyUnsafe(new InstallmentPurchaseView$backgroundNoneRoundRectShape$2(context));
        this.backgroundTopRoundRectShape = DelegatesKt.lazyUnsafe(new InstallmentPurchaseView$backgroundTopRoundRectShape$2(context));
        this.backgroundBottomRoundRectShape = DelegatesKt.lazyUnsafe(new InstallmentPurchaseView$backgroundBottomRoundRectShape$2(context));
        this.backgroundAllRoundRectShape = DelegatesKt.lazyUnsafe(new InstallmentPurchaseView$backgroundAllRoundRectShape$2(context));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = dimens.getDP_16();
        layoutParams2.rightMargin = dimens.getDP_16();
        setLayoutParams(layoutParams2);
        addView(pdpPriceWithTitleView);
    }

    private final ShapeDrawable getBackgroundAllRoundRectShape() {
        return (ShapeDrawable) this.backgroundAllRoundRectShape.getValue();
    }

    private final ShapeDrawable getBackgroundBottomRoundRectShape() {
        return (ShapeDrawable) this.backgroundBottomRoundRectShape.getValue();
    }

    private final ShapeDrawable getBackgroundNoneRoundRectShape() {
        return (ShapeDrawable) this.backgroundNoneRoundRectShape.getValue();
    }

    private final ShapeDrawable getBackgroundTopRoundRectShape() {
        return (ShapeDrawable) this.backgroundTopRoundRectShape.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r7 != (r4 != null ? r4.bottomMargin : 0)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012c, code lost:
    
        if (r7 != (r3 != null ? r3.bottomMargin : 0)) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bind(@NotNull InstallmentVO.Purchase item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        PdpPriceWithTitleView pdpPriceWithTitleView = this.installmentPwtv;
        ViewGroup.LayoutParams layoutParams = pdpPriceWithTitleView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            marginLayoutParams.bottomMargin = item.getHasPeriods() ? Dimens.INSTANCE.getDP_8() : Dimens.INSTANCE.getDP_12();
            if (i11 == marginLayoutParams.leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = pdpPriceWithTitleView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = pdpPriceWithTitleView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = pdpPriceWithTitleView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            pdpPriceWithTitleView.setLayoutParams(marginLayoutParams);
        }
        ShapeDrawable backgroundTopRoundRectShape = (item.getShowTopRounding() && item.getHasPeriods()) ? getBackgroundTopRoundRectShape() : (item.getShowTopRounding() || !item.getHasPeriods()) ? !item.getShowTopRounding() ? getBackgroundBottomRoundRectShape() : getBackgroundAllRoundRectShape() : getBackgroundNoneRoundRectShape();
        Paint paint = backgroundTopRoundRectShape.getPaint();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(ContextExtKt.parseColor(context, item.getBackground()));
        setBackground(backgroundTopRoundRectShape);
        if (item.getAction() != null) {
            PdpPriceWithTitleView pdpPriceWithTitleView2 = this.installmentPwtv;
            ViewGroup.LayoutParams layoutParams5 = pdpPriceWithTitleView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
            if (marginLayoutParams5 != null) {
                int i15 = marginLayoutParams5.leftMargin;
                int i16 = marginLayoutParams5.topMargin;
                int i17 = marginLayoutParams5.rightMargin;
                int i18 = marginLayoutParams5.bottomMargin;
                marginLayoutParams5.rightMargin = Dimens.INSTANCE.getDP_8();
                if (i15 == marginLayoutParams5.leftMargin) {
                    ViewGroup.LayoutParams layoutParams6 = pdpPriceWithTitleView2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                    if (i16 == (marginLayoutParams6 != null ? marginLayoutParams6.topMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams7 = pdpPriceWithTitleView2.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                        if (i17 == (marginLayoutParams7 != null ? marginLayoutParams7.rightMargin : 0)) {
                            ViewGroup.LayoutParams layoutParams8 = pdpPriceWithTitleView2.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                        }
                    }
                }
                pdpPriceWithTitleView2.setLayoutParams(marginLayoutParams5);
            }
        }
        this.installmentPwtv.bind(item.getPrice(), actionHandler, item.getChevronIcon(), item.getPriceIcon());
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.installmentPwtv.setOnClickListener(onClickListener);
    }
}
