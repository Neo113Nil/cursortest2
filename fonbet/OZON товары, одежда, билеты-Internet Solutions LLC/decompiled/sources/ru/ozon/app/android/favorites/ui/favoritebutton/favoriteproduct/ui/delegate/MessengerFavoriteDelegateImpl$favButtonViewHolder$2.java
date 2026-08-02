package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate;

import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.MessengerProductFavoriteButtonViewHolder;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/MessengerProductFavoriteButtonViewHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MessengerFavoriteDelegateImpl$favButtonViewHolder$2 extends AbstractC7737t implements Function0<MessengerProductFavoriteButtonViewHolder> {
    final /* synthetic */ MessengerFavoriteDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessengerFavoriteDelegateImpl$favButtonViewHolder$2(MessengerFavoriteDelegateImpl messengerFavoriteDelegateImpl) {
        super(0);
        this.this$0 = messengerFavoriteDelegateImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MessengerProductFavoriteButtonViewHolder invoke() {
        AdultHandler adultHandler;
        AppType appType;
        Function1 function1;
        ComponentCallbacksC5392m componentCallbacksC5392m;
        adultHandler = this.this$0.adultHandler;
        appType = this.this$0.appType;
        function1 = this.this$0.actionHandler;
        componentCallbacksC5392m = this.this$0.containerFragment;
        return new MessengerProductFavoriteButtonViewHolder(componentCallbacksC5392m, adultHandler, appType, function1);
    }
}
