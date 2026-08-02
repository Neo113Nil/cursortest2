package ru.ozon.app.android.storefront.widgets.naviGrid.presentation;

import AS.a;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.R$drawable;
import ru.ozon.app.android.storefront.databinding.NaviGridItemViewBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 +2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001+B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00140$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid/presentation/NaviGridItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/naviGrid/presentation/ItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;LWZ/l;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/storefront/widgets/naviGrid/presentation/ItemVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/naviGrid/presentation/ItemVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "Lru/ozon/app/android/storefront/databinding/NaviGridItemViewBinding;", "binding", "Lru/ozon/app/android/storefront/databinding/NaviGridItemViewBinding;", "Landroid/graphics/drawable/GradientDrawable;", "shapeDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviGridItemViewHolder extends k<ItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final NaviGridItemViewBinding binding;

    @NotNull
    private final View.OnClickListener onClickListener;
    private final GradientDrawable shapeDrawable;

    @NotNull
    private final l tokenizedAnalytics;
    public static final int $stable = 8;
    private static final int dp8 = UiExtKt.toPx(8);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NaviGridItemViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        NaviGridItemViewBinding bind = NaviGridItemViewBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Drawable d11 = g.d(getResources(), R$drawable.bg_rounded_navi_grid, getContext().getTheme());
        this.shapeDrawable = d11 instanceof GradientDrawable ? (GradientDrawable) d11 : null;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new NaviGridItemViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        a aVar = new a(this, 15);
        this.onClickListener = aVar;
        bind.itemTitleView.setMovementMethod(null);
        bind.getConstraintLayout().setOnClickListener(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClickListener$lambda$1(NaviGridItemViewHolder naviGridItemViewHolder, View view) {
        AtomAction action;
        ItemVO boundData = naviGridItemViewHolder.getBoundData();
        if (boundData == null || (action = boundData.getAction()) == null) {
            return;
        }
        naviGridItemViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ItemVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        NaviGridItemViewBinding naviGridItemViewBinding = this.binding;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        String mainBackgroundColor = item.getMainBackgroundColor();
        UniColors uniColors = UniColors.BG_PRIMARY;
        naviGridItemViewBinding.getConstraintLayout().setBackgroundColor(styleParser.parseColor(context, mainBackgroundColor, uniColors.getResId()));
        naviGridItemViewBinding.getConstraintLayout().setPadding(item.getPaddings().e().intValue(), 0, item.getPaddings().f().intValue(), dp8);
        int parseColor = styleParser.parseColor(getContext(), item.getBackgroundColor(), uniColors.getResId());
        GradientDrawable gradientDrawable = this.shapeDrawable;
        if (gradientDrawable != null) {
            gradientDrawable.setTint(parseColor);
        }
        naviGridItemViewBinding.itemBgView.setBackground(this.shapeDrawable);
        TextAtomV2View itemTitleView = naviGridItemViewBinding.itemTitleView;
        Intrinsics.checkNotNullExpressionValue(itemTitleView, "itemTitleView");
        TextHolderKt.bindOrGone$default(itemTitleView, item.getTitle(), null, 2, null);
        Image itemImage = naviGridItemViewBinding.itemImage;
        Intrinsics.checkNotNullExpressionValue(itemImage, "itemImage");
        ImageHolderKt.bind$default(itemImage, item.getImage(), null, 2, null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ItemVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((NaviGridItemViewHolder) item, trackingData, viewedPond);
        t widgetTokenizedEvent = item.getWidgetTokenizedEvent();
        if (widgetTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, widgetTokenizedEvent, null, 2, null);
        }
    }
}
