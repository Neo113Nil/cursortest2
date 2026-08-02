package ru.ozon.app.android.monetization.widgets.matchShoppingCards.di;

import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "invoke", "()LVg/d;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class MatchShoppingCardsWidgetComponent$customActionHandlersStoreFactory$2 extends AbstractC7737t implements Function0<d> {
    final /* synthetic */ MatchShoppingCardsWidgetComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsWidgetComponent$customActionHandlersStoreFactory$2(MatchShoppingCardsWidgetComponent matchShoppingCardsWidgetComponent) {
        super(0);
        this.this$0 = matchShoppingCardsWidgetComponent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final d invoke() {
        C7475g c7475g;
        c7475g = this.this$0.storage;
        return ((CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
    }
}
