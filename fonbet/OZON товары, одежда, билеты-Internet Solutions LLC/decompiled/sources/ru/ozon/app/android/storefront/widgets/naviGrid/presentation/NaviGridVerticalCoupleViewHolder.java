package ru.ozon.app.android.storefront.widgets.naviGrid.presentation;

import AU.a;
import Ey.ViewOnClickListenerC2975b;
import Sc.InterfaceC4008j;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.utils.UtilsKt;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.R$drawable;
import ru.ozon.app.android.storefront.databinding.NaviGridCoupleViewBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J#\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u0014\u0010\"\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010/\u001a\u0004\u0018\u00010(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid/presentation/NaviGridVerticalCoupleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/naviGrid/presentation/CoupleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;LWZ/l;)V", "Lru/ozon/app/android/storefront/databinding/NaviGridCoupleViewBinding;", "", "setRoundedBackground", "(Lru/ozon/app/android/storefront/databinding/NaviGridCoupleViewBinding;)V", "setMainBackground", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/naviGrid/presentation/CoupleVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/naviGrid/presentation/CoupleVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "binding", "Lru/ozon/app/android/storefront/databinding/NaviGridCoupleViewBinding;", "Lru/ozon/app/android/storefront/widgets/naviGrid/presentation/ItemVO;", "topItem", "Lru/ozon/app/android/storefront/widgets/naviGrid/presentation/ItemVO;", "bottomItem", "Landroid/graphics/drawable/GradientDrawable;", "topShapeDrawable", "Landroid/graphics/drawable/GradientDrawable;", "bottomShapeDrawable$delegate", "LSc/j;", "getBottomShapeDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "bottomShapeDrawable", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/View$OnClickListener;", "topOnClickListener", "Landroid/view/View$OnClickListener;", "bottomOnClickListener", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviGridVerticalCoupleViewHolder extends k<CoupleVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final NaviGridCoupleViewBinding binding;
    private ItemVO bottomItem;

    @NotNull
    private final View.OnClickListener bottomOnClickListener;

    /* renamed from: bottomShapeDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bottomShapeDrawable;

    @NotNull
    private final l tokenizedAnalytics;
    private ItemVO topItem;

    @NotNull
    private final View.OnClickListener topOnClickListener;
    private final GradientDrawable topShapeDrawable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NaviGridVerticalCoupleViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        NaviGridCoupleViewBinding bind = NaviGridCoupleViewBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Drawable d11 = g.d(getResources(), R$drawable.bg_rounded_navi_grid, getContext().getTheme());
        this.topShapeDrawable = d11 instanceof GradientDrawable ? (GradientDrawable) d11 : null;
        this.bottomShapeDrawable = UtilsKt.unsafeLazy(new NaviGridVerticalCoupleViewHolder$bottomShapeDrawable$2(this));
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new NaviGridVerticalCoupleViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        ViewOnClickListenerC2975b viewOnClickListenerC2975b = new ViewOnClickListenerC2975b(this, 14);
        this.topOnClickListener = viewOnClickListenerC2975b;
        a aVar = new a(this, 13);
        this.bottomOnClickListener = aVar;
        bind.topTitleView.setMovementMethod(null);
        bind.bottomTitleView.setMovementMethod(null);
        bind.topClickAreaView.setOnClickListener(viewOnClickListenerC2975b);
        bind.getConstraintLayout().setOnClickListener(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bottomOnClickListener$lambda$3(NaviGridVerticalCoupleViewHolder naviGridVerticalCoupleViewHolder, View view) {
        AtomAction action;
        ItemVO itemVO = naviGridVerticalCoupleViewHolder.bottomItem;
        if (itemVO == null || (action = itemVO.getAction()) == null) {
            return;
        }
        naviGridVerticalCoupleViewHolder.actionHandler.invoke(action);
    }

    private final GradientDrawable getBottomShapeDrawable() {
        return (GradientDrawable) this.bottomShapeDrawable.getValue();
    }

    private final void setMainBackground(NaviGridCoupleViewBinding naviGridCoupleViewBinding) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        ItemVO itemVO = this.topItem;
        naviGridCoupleViewBinding.getConstraintLayout().setBackgroundColor(styleParser.parseColor(context, itemVO != null ? itemVO.getMainBackgroundColor() : null, UniColors.BG_PRIMARY.getResId()));
    }

    private final void setRoundedBackground(NaviGridCoupleViewBinding naviGridCoupleViewBinding) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        ItemVO itemVO = this.topItem;
        String backgroundColor = itemVO != null ? itemVO.getBackgroundColor() : null;
        UniColors uniColors = UniColors.BG_PRIMARY;
        int parseColor = styleParser.parseColor(context, backgroundColor, uniColors.getResId());
        GradientDrawable gradientDrawable = this.topShapeDrawable;
        if (gradientDrawable != null) {
            gradientDrawable.setTint(parseColor);
        }
        naviGridCoupleViewBinding.topBgView.setBackground(this.topShapeDrawable);
        Context context2 = getContext();
        ItemVO itemVO2 = this.bottomItem;
        int parseColor2 = styleParser.parseColor(context2, itemVO2 != null ? itemVO2.getBackgroundColor() : null, uniColors.getResId());
        if (parseColor == parseColor2) {
            naviGridCoupleViewBinding.bottomBgView.setBackground(this.topShapeDrawable);
            return;
        }
        GradientDrawable bottomShapeDrawable = getBottomShapeDrawable();
        if (bottomShapeDrawable != null) {
            bottomShapeDrawable.setTint(parseColor2);
        }
        naviGridCoupleViewBinding.bottomBgView.setBackground(getBottomShapeDrawable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void topOnClickListener$lambda$1(NaviGridVerticalCoupleViewHolder naviGridVerticalCoupleViewHolder, View view) {
        AtomAction action;
        ItemVO itemVO = naviGridVerticalCoupleViewHolder.topItem;
        if (itemVO == null || (action = itemVO.getAction()) == null) {
            return;
        }
        naviGridVerticalCoupleViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CoupleVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        NaviGridCoupleViewBinding naviGridCoupleViewBinding = this.binding;
        this.topItem = (ItemVO) C7714v.M(item.getItems());
        this.bottomItem = (ItemVO) C7714v.Z(item.getItems());
        setRoundedBackground(naviGridCoupleViewBinding);
        setMainBackground(naviGridCoupleViewBinding);
        ItemVO itemVO = this.topItem;
        if (itemVO != null) {
            naviGridCoupleViewBinding.getConstraintLayout().setPadding(itemVO.getPaddings().e().intValue(), 0, itemVO.getPaddings().f().intValue(), 0);
            TextAtomV2View topTitleView = naviGridCoupleViewBinding.topTitleView;
            Intrinsics.checkNotNullExpressionValue(topTitleView, "topTitleView");
            TextHolderKt.bindOrGone$default(topTitleView, itemVO.getTitle(), null, 2, null);
            Image topImage = naviGridCoupleViewBinding.topImage;
            Intrinsics.checkNotNullExpressionValue(topImage, "topImage");
            ImageHolderKt.bind$default(topImage, itemVO.getImage(), null, 2, null);
        }
        ItemVO itemVO2 = this.bottomItem;
        if (itemVO2 != null) {
            TextAtomV2View bottomTitleView = naviGridCoupleViewBinding.bottomTitleView;
            Intrinsics.checkNotNullExpressionValue(bottomTitleView, "bottomTitleView");
            TextHolderKt.bindOrGone$default(bottomTitleView, itemVO2.getTitle(), null, 2, null);
            Image bottomImage = naviGridCoupleViewBinding.bottomImage;
            Intrinsics.checkNotNullExpressionValue(bottomImage, "bottomImage");
            ImageHolderKt.bind$default(bottomImage, itemVO2.getImage(), null, 2, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CoupleVO item, @NotNull c trackingData, f viewedPond) {
        t widgetTokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((NaviGridVerticalCoupleViewHolder) item, trackingData, viewedPond);
        ItemVO itemVO = this.topItem;
        if (itemVO == null || (widgetTokenizedEvent = itemVO.getWidgetTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, widgetTokenizedEvent, null, 2, null);
    }
}
