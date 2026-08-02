package ru.ozon.app.android.monetization.widgets.matchShoppingCards.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MatchShoppingCardsWidgetComponent$teensModeStorage$2 extends AbstractC7737t implements Function0<TeensModeStorage> {
    final /* synthetic */ MatchShoppingCardsWidgetComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsWidgetComponent$teensModeStorage$2(MatchShoppingCardsWidgetComponent matchShoppingCardsWidgetComponent) {
        super(0);
        this.this$0 = matchShoppingCardsWidgetComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TeensModeStorage invoke() {
        StorageComponentApi storageComponentApi;
        storageComponentApi = this.this$0.getStorageComponentApi();
        return storageComponentApi.getTeensModeStorage();
    }
}
