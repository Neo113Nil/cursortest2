package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.presentation;

import Pc.a;
import Vg.d;
import WZ.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.cart.ui.CartAtomBinder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.delegate.SkuScrollMultiFrameDelegateProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.presentation.SkuScrollViewMapper;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.videocover.ContinuousScrollStateListener;
import ru.ozon.app.android.videocover.VideoTileDelegate;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/ScrollWidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SkuScrollViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ScrollWidgetViewHolder> {
    final /* synthetic */ SkuScrollViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkuScrollViewMapper$holderProducer$1(SkuScrollViewMapper skuScrollViewMapper) {
        super(2);
        this.this$0 = skuScrollViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ScrollWidgetViewHolder invoke(View view, ComposerReferences ref) {
        SkuScrollViewMapper.Companion companion;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        ContinuousScrollStateListener widgetsScrollStateListener = this.this$0.component().getVideoTileDelegate().getWidgetsScrollStateListener();
        View requireView = ref.getContainer().j().requireView();
        Intrinsics.checkNotNullExpressionValue(requireView, "requireView(...)");
        widgetsScrollStateListener.setOn(ComposerViewExtensionKt.composerRecyclerView(requireView));
        AdultHandler adultHandler = this.this$0.component().getAdultHandler();
        a<CartAtomBinder> cartAtomBinder = this.this$0.component().getCartAtomBinder();
        l tokenizedAnalytics = ref.getTokenizedAnalytics();
        AdultListDelegateProvider adultListDelegateProvider = this.this$0.component().getAdultListDelegateProvider();
        SkuScrollMultiFrameDelegateProvider frameDelegateProvider = this.this$0.component().getFrameDelegateProvider();
        VideoTileDelegate videoTileDelegate = this.this$0.component().getVideoTileDelegate();
        PlayerPreloader playerPreloader = this.this$0.component().getPlayerPreloader();
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        companion = SkuScrollViewMapper.Companion;
        return new ScrollWidgetViewHolder(view, ref, adultHandler, cartAtomBinder, tokenizedAnalytics, adultListDelegateProvider, frameDelegateProvider, videoTileDelegate, playerPreloader, customActionHandlersStoreFactory.create(companion.getCustomActionHandler()));
    }
}
