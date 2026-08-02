package ru.ozon.app.android.commonwidgets.widgets.logosList.presentation;

import Vg.d;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListWidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LogosListViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, LogosListWidgetViewHolder> {
    final /* synthetic */ d $customActionHandlersStoreFactory;
    final /* synthetic */ LogosListViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LogosListViewMapper$holderProducer$1(LogosListViewMapper logosListViewMapper, d dVar) {
        super(2);
        this.this$0 = logosListViewMapper;
        this.$customActionHandlersStoreFactory = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LogosListWidgetViewHolder invoke(View view, ComposerReferences ref) {
        AppType appType;
        AsyncCartViewModelProviderWrapper asyncCartViewModelProviderWrapper;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        CartNavigationService cartNavigationService = ((CartServiceApi) ref.getComponent(CartServiceApi.class)).getCartNavigationService();
        RecyclerView recyclerView = (RecyclerView) view;
        appType = this.this$0.appType;
        d dVar = this.$customActionHandlersStoreFactory;
        asyncCartViewModelProviderWrapper = this.this$0.asyncCartViewModelProvider;
        return new LogosListWidgetViewHolder(recyclerView, appType, ref, dVar, cartNavigationService, asyncCartViewModelProviderWrapper.get(ref));
    }
}
