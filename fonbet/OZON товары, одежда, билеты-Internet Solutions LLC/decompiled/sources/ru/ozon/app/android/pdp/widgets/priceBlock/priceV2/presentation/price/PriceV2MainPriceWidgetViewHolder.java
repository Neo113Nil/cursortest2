package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.price;

import W10.c;
import WZ.l;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.drawables.PriceV2ShapeDrawableStorage;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00140\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/price/PriceV2MainPriceWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/price/PriceV2MainPriceVO;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/price/PriceV2MainPriceView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/drawables/PriceV2ShapeDrawableStorage;", "drawableStorage", "LWZ/l;", "tokenizedAnalytics", "", "isSelect", "<init>", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/price/PriceV2MainPriceView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/drawables/PriceV2ShapeDrawableStorage;LWZ/l;Z)V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "", "trackView", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/price/PriceV2MainPriceVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/price/PriceV2MainPriceVO;Ll20/d;)V", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/price/PriceV2MainPriceView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/drawables/PriceV2ShapeDrawableStorage;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/price/PdpPriceAdapter;", "priceAdapter", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/price/PdpPriceAdapter;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceV2MainPriceWidgetViewHolder extends k<PriceV2MainPriceVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PriceV2ShapeDrawableStorage drawableStorage;

    @NotNull
    private final PdpPriceAdapter priceAdapter;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final PriceV2MainPriceView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceV2MainPriceWidgetViewHolder(@NotNull PriceV2MainPriceView view, @NotNull ComposerReferences refs, @NotNull PriceV2ShapeDrawableStorage drawableStorage, @NotNull l tokenizedAnalytics, boolean z11) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(drawableStorage, "drawableStorage");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.refs = refs;
        this.drawableStorage = drawableStorage;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.priceAdapter = new PdpPriceAdapter(z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PriceV2MainPriceVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        PriceV2MainPriceView priceV2MainPriceView = this.view;
        priceV2MainPriceView.setPadding(priceV2MainPriceView.getPaddingLeft(), priceV2MainPriceView.getPaddingTop(), priceV2MainPriceView.getPaddingRight(), item.getBottomPadding());
        r a11 = this.refs.getContainer().a();
        boolean isDarkThemeActive = a11 != null ? ThemeExtKt.isDarkThemeActive(a11) : false;
        this.view.setBackground(this.drawableStorage.background(getContext(), item.getBackgroundCornersConfig(), isDarkThemeActive));
        if (this.drawableStorage.getColor(getContext(), isDarkThemeActive) != null) {
            new PriceV2MainPriceWidgetViewHolder$bind$1$1$1(this.view);
        }
        this.priceAdapter.submit(this.view.getScrollablePriceContentLl(), item.getPrice(), this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull PriceV2MainPriceVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getEvent());
    }
}
