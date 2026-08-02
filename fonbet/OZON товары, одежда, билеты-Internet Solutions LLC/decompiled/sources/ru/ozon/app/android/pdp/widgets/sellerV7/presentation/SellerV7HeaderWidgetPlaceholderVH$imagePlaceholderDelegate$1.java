package ru.ozon.app.android.pdp.widgets.sellerV7.presentation;

import Sc.InterfaceC4008j;
import Vg.d;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/sellerV7/presentation/SellerV7HeaderBinder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SellerV7HeaderWidgetPlaceholderVH$imagePlaceholderDelegate$1 extends AbstractC7737t implements Function0<SellerV7HeaderBinder> {
    final /* synthetic */ d $customActionHandlersStoreFactory;
    final /* synthetic */ ComposerReferences $refs;
    final /* synthetic */ SellerFavoriteService $sellerFavoriteService;
    final /* synthetic */ WidgetImagePlaceholderAdapter $widgetImagePlaceholderAdapter;
    final /* synthetic */ SellerV7HeaderWidgetPlaceholderVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerV7HeaderWidgetPlaceholderVH$imagePlaceholderDelegate$1(SellerV7HeaderWidgetPlaceholderVH sellerV7HeaderWidgetPlaceholderVH, ComposerReferences composerReferences, d dVar, WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, SellerFavoriteService sellerFavoriteService) {
        super(0);
        this.this$0 = sellerV7HeaderWidgetPlaceholderVH;
        this.$refs = composerReferences;
        this.$customActionHandlersStoreFactory = dVar;
        this.$widgetImagePlaceholderAdapter = widgetImagePlaceholderAdapter;
        this.$sellerFavoriteService = sellerFavoriteService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SellerV7HeaderBinder invoke() {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = this.this$0.mainView;
        return new SellerV7HeaderBinder((LinearLayout) interfaceC4008j.getValue(), this.$refs, this.$customActionHandlersStoreFactory, this.$widgetImagePlaceholderAdapter, this.this$0, this.$sellerFavoriteService);
    }
}
