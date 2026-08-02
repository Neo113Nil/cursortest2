package ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.singleCarriageTrain;

import Am.b;
import W10.c;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.product.tiles.skuGrid2.BackgroundDrawBySkuGrid2DecoratorDisabled;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u000e\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/singleCarriageTrain/PremiumPointsTrainV2SingleWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/singleCarriageTrain/PremiumPointsTrainV2SingleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/product/tiles/skuGrid2/BackgroundDrawBySkuGrid2DecoratorDisabled;", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/singleCarriageTrain/PremiumPointsTrainV2SingleView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/singleCarriageTrain/PremiumPointsTrainV2SingleView;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/singleCarriageTrain/PremiumPointsTrainV2SingleVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/singleCarriageTrain/PremiumPointsTrainV2SingleVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/singleCarriageTrain/PremiumPointsTrainV2SingleView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PremiumPointsTrainV2SingleWidgetViewHolder extends k<PremiumPointsTrainV2SingleVO> implements BackgroundDrawBySkuGrid2DecoratorDisabled {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final PremiumPointsTrainV2SingleView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumPointsTrainV2SingleWidgetViewHolder(@NotNull PremiumPointsTrainV2SingleView view, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        view.getLinearContainer().setOnClickListener(new b(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(PremiumPointsTrainV2SingleWidgetViewHolder premiumPointsTrainV2SingleWidgetViewHolder, View view) {
        AtomAction action;
        PremiumPointsTrainV2SingleVO boundedData = premiumPointsTrainV2SingleWidgetViewHolder.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        premiumPointsTrainV2SingleWidgetViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PremiumPointsTrainV2SingleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        PremiumPointsTrainV2SingleView premiumPointsTrainV2SingleView = this.view;
        premiumPointsTrainV2SingleView.getLinearContainer().setClickable(item.getAction() != null);
        TextAtomHolderKt.bind$default(premiumPointsTrainV2SingleView.getTitleTav(), item.getTitle(), null, 2, null);
        ImageViewExtKt.load$default(premiumPointsTrainV2SingleView.getIconIv(), item.getStatusIcon(), null, null, null, null, false, null, 126, null);
        ImageView iconIv = premiumPointsTrainV2SingleView.getIconIv();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = premiumPointsTrainV2SingleView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(iconIv, styleParser.parseColor(context, item.getStatusIconTint()));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull PremiumPointsTrainV2SingleVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((PremiumPointsTrainV2SingleWidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
