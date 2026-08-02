package ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.delegate;

import Vg.c;
import Vg.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.favorites.ui.actionhandler.FavoriteWishlistRemoveActionHandler;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class FavoriteToggleProductButtonDelegateImpl$customActionHandlersStore$2 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ FavoriteToggleProductButtonDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteToggleProductButtonDelegateImpl$customActionHandlersStore$2(FavoriteToggleProductButtonDelegateImpl favoriteToggleProductButtonDelegateImpl) {
        super(0);
        this.this$0 = favoriteToggleProductButtonDelegateImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        d dVar;
        dVar = this.this$0.customActionHandlersStoreFactory;
        return dVar.create(FavoriteWishlistRemoveActionHandler.class);
    }
}
