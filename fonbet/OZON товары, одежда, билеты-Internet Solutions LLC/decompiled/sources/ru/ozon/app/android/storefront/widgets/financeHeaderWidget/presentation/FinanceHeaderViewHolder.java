package ru.ozon.app.android.storefront.widgets.financeHeaderWidget.presentation;

import Dc0.m;
import Sc.InterfaceC4008j;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.SharedPreferences;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.databinding.FinanceHeaderBinding;
import ru.ozon.app.android.storefront.widgets.financeHeaderWidget.presentation.FinanceHeaderVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010 \u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00100\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,R\u001b\u00103\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u0014\u00104\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Landroid/content/SharedPreferences;", "sharedPreferences", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Landroid/content/SharedPreferences;LWZ/l;)V", "Lru/ozon/app/android/storefront/databinding/FinanceHeaderBinding;", "item", "", "bindBadgeAndShowTooltip", "(Lru/ozon/app/android/storefront/databinding/FinanceHeaderBinding;Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO;)V", "showTooltip", "(Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO;Ll20/d;)V", "onDetach", "()V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/content/SharedPreferences;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/graphics/drawable/ShapeDrawable;", "bxShapeDrawable$delegate", "LSc/j;", "getBxShapeDrawable", "()Landroid/graphics/drawable/ShapeDrawable;", "bxShapeDrawable", "selectShapeDrawable$delegate", "getSelectShapeDrawable", "selectShapeDrawable", "topRoundedShapeDrawable$delegate", "getTopRoundedShapeDrawable", "topRoundedShapeDrawable", "binding", "Lru/ozon/app/android/storefront/databinding/FinanceHeaderBinding;", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipHelper;", "tooltipHelper", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipHelper;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinanceHeaderViewHolder extends k<FinanceHeaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final FinanceHeaderBinding binding;

    /* renamed from: bxShapeDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bxShapeDrawable;

    /* renamed from: selectShapeDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j selectShapeDrawable;

    @NotNull
    private final SharedPreferences sharedPreferences;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final FinanceTooltipHelper tooltipHelper;

    /* renamed from: topRoundedShapeDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topRoundedShapeDrawable;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final float selectBadgeRadius = UiExtKt.toPxF(12);
    private static final float bxBadgeRadius = UiExtKt.toPxF(8);
    private static final float topLeftRadius = UiExtKt.toPxF(24);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderViewHolder$Companion;", "", "<init>", "()V", "selectBadgeRadius", "", "getSelectBadgeRadius", "()F", "bxBadgeRadius", "getBxBadgeRadius", "topLeftRadius", "TOOLTIP_PREFS_KEY", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getBxBadgeRadius() {
            return FinanceHeaderViewHolder.bxBadgeRadius;
        }

        public final float getSelectBadgeRadius() {
            return FinanceHeaderViewHolder.selectBadgeRadius;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinanceHeaderViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull SharedPreferences sharedPreferences, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.sharedPreferences = sharedPreferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.bxShapeDrawable = LazyUtilsKt.unsafeLazy(FinanceHeaderViewHolder$bxShapeDrawable$2.INSTANCE);
        this.selectShapeDrawable = LazyUtilsKt.unsafeLazy(FinanceHeaderViewHolder$selectShapeDrawable$2.INSTANCE);
        this.topRoundedShapeDrawable = LazyUtilsKt.unsafeLazy(new FinanceHeaderViewHolder$topRoundedShapeDrawable$2(this));
        FinanceHeaderBinding bind = FinanceHeaderBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.tooltipHelper = new FinanceTooltipHelper(refs.getContainer().j());
        bind.getConstraintLayout().setBackground(getTopRoundedShapeDrawable());
        bind.clickableArea.setOnClickListener(new m(this, 6));
    }

    private final void bindBadgeAndShowTooltip(FinanceHeaderBinding financeHeaderBinding, FinanceHeaderVO financeHeaderVO) {
        FinanceHeaderVO.FinanceBadgeVO badge = financeHeaderVO.getBadge();
        if (badge == null) {
            LinearLayout badgeLL = financeHeaderBinding.badgeLL;
            Intrinsics.checkNotNullExpressionValue(badgeLL, "badgeLL");
            ViewExtKt.gone(badgeLL);
            return;
        }
        int parseColor = StyleParser.INSTANCE.parseColor(getContext(), badge.getBackgroundColor(), UniColors.BG_PRIMARY.getResId());
        financeHeaderBinding.badgeLL.setBackground(financeHeaderVO.getIsSelect() ? getSelectShapeDrawable() : getBxShapeDrawable());
        LinearLayout badgeLL2 = financeHeaderBinding.badgeLL;
        Intrinsics.checkNotNullExpressionValue(badgeLL2, "badgeLL");
        ViewExtKt.setBackgroundTint(badgeLL2, parseColor);
        TextAtomV2View textAtomV2View = financeHeaderBinding.badgeTv;
        Intrinsics.f(textAtomV2View);
        TextHolderKt.bind$default(textAtomV2View, badge.getTitle(), null, 2, null);
        textAtomV2View.setMovementMethod(null);
        Image badgeImage = financeHeaderBinding.badgeImage;
        Intrinsics.checkNotNullExpressionValue(badgeImage, "badgeImage");
        ImageHolderKt.bind$default(badgeImage, badge.getImage(), null, 2, null);
        LinearLayout badgeLL3 = financeHeaderBinding.badgeLL;
        Intrinsics.checkNotNullExpressionValue(badgeLL3, "badgeLL");
        ViewExtKt.show(badgeLL3);
        showTooltip(financeHeaderVO);
    }

    private final ShapeDrawable getBxShapeDrawable() {
        return (ShapeDrawable) this.bxShapeDrawable.getValue();
    }

    private final ShapeDrawable getSelectShapeDrawable() {
        return (ShapeDrawable) this.selectShapeDrawable.getValue();
    }

    private final ShapeDrawable getTopRoundedShapeDrawable() {
        return (ShapeDrawable) this.topRoundedShapeDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(FinanceHeaderViewHolder financeHeaderViewHolder, View view) {
        FinanceHeaderVO.FinanceBadgeVO badge;
        AtomAction action;
        FinanceHeaderVO boundData = financeHeaderViewHolder.getBoundData();
        if (boundData == null || (badge = boundData.getBadge()) == null || (action = badge.getAction()) == null) {
            return;
        }
        financeHeaderViewHolder.actionHandler.invoke(action);
    }

    private final void showTooltip(final FinanceHeaderVO item) {
        FinanceHeaderVO.TooltipVO tooltip = item.getTooltip();
        String tooltipKey = tooltip != null ? tooltip.getTooltipKey() : null;
        if (this.sharedPreferences.contains("TOOLTIP_PREFS_KEY")) {
            String string = this.sharedPreferences.getString("TOOLTIP_PREFS_KEY", null);
            if (Intrinsics.d(string, tooltipKey) && string != null) {
                return;
            }
        }
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString("TOOLTIP_PREFS_KEY", tooltipKey);
        edit.apply();
        final ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.storefront.widgets.financeHeaderWidget.presentation.FinanceHeaderViewHolder$showTooltip$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                FinanceTooltipHelper financeTooltipHelper;
                FinanceHeaderBinding financeHeaderBinding;
                l lVar;
                if (constraintLayout.getMeasuredWidth() <= 0 || constraintLayout.getMeasuredHeight() <= 0) {
                    return;
                }
                constraintLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                FinanceHeaderVO.TooltipVO tooltip2 = item.getTooltip();
                if (tooltip2 != null) {
                    financeTooltipHelper = this.tooltipHelper;
                    financeHeaderBinding = this.binding;
                    LinearLayout badgeLL = financeHeaderBinding.badgeLL;
                    Intrinsics.checkNotNullExpressionValue(badgeLL, "badgeLL");
                    financeTooltipHelper.onShowTooltip(tooltip2, badgeLL);
                    t tokenizedEvent = item.getTooltip().getTokenizedEvent();
                    if (tokenizedEvent != null) {
                        lVar = this.tokenizedAnalytics;
                        WZ.m.c(lVar, tokenizedEvent, null);
                    }
                }
            }
        });
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.tooltipHelper.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FinanceHeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        FinanceHeaderBinding financeHeaderBinding = this.binding;
        TextAtomV2View titleTv = financeHeaderBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextHolderKt.bind$default(titleTv, item.getTitle(), null, 2, null);
        bindBadgeAndShowTooltip(financeHeaderBinding, item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull FinanceHeaderVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            WZ.m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
