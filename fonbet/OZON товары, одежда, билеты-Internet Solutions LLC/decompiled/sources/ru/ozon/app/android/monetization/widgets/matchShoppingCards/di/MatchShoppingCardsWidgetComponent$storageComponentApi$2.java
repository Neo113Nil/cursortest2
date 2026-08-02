package ru.ozon.app.android.monetization.widgets.matchShoppingCards.di;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MatchShoppingCardsWidgetComponent$storageComponentApi$2 extends AbstractC7737t implements Function0<StorageComponentApi> {
    final /* synthetic */ MatchShoppingCardsWidgetComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsWidgetComponent$storageComponentApi$2(MatchShoppingCardsWidgetComponent matchShoppingCardsWidgetComponent) {
        super(0);
        this.this$0 = matchShoppingCardsWidgetComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final StorageComponentApi invoke() {
        C7475g c7475g;
        c7475g = this.this$0.storage;
        return (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
    }
}
