package ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.favoriteReserveButton.FavoriteReserveButtonUIState;
import ru.ozon.app.android.favorites.ui.favoriteReserveButton.FavoriteReserveButtonUpdate;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonUIState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate.FavoriteReserveButtonDelegateImpl$resubscribe$1", f = "FavoriteReserveButtonDelegateImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavoriteReserveButtonDelegateImpl$resubscribe$1 extends j implements Function2<FavoriteReserveButtonUIState, d<? super Unit>, Object> {
    final /* synthetic */ Long $sku;
    final /* synthetic */ String $uniqId;
    final /* synthetic */ long $wishlistId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FavoriteReserveButtonDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteReserveButtonDelegateImpl$resubscribe$1(FavoriteReserveButtonDelegateImpl favoriteReserveButtonDelegateImpl, Long l11, long j11, String str, d<? super FavoriteReserveButtonDelegateImpl$resubscribe$1> dVar) {
        super(2, dVar);
        this.this$0 = favoriteReserveButtonDelegateImpl;
        this.$sku = l11;
        this.$wishlistId = j11;
        this.$uniqId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FavoriteReserveButtonDelegateImpl$resubscribe$1 favoriteReserveButtonDelegateImpl$resubscribe$1 = new FavoriteReserveButtonDelegateImpl$resubscribe$1(this.this$0, this.$sku, this.$wishlistId, this.$uniqId, dVar);
        favoriteReserveButtonDelegateImpl$resubscribe$1.L$0 = obj;
        return favoriteReserveButtonDelegateImpl$resubscribe$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        FavoriteReserveButtonUIState favoriteReserveButtonUIState = (FavoriteReserveButtonUIState) this.L$0;
        if (Intrinsics.d(favoriteReserveButtonUIState, FavoriteReserveButtonUIState.ProcessAction.INSTANCE)) {
            this.this$0.processingAction = true;
        } else if (Intrinsics.d(favoriteReserveButtonUIState, FavoriteReserveButtonUIState.Error.INSTANCE)) {
            this.this$0.processingAction = false;
            this.this$0.showError();
        } else {
            if (!(favoriteReserveButtonUIState instanceof FavoriteReserveButtonUIState.Success)) {
                throw new o();
            }
            this.this$0.processingAction = false;
            FavoriteReserveButtonUIState.Success success = (FavoriteReserveButtonUIState.Success) favoriteReserveButtonUIState;
            this.this$0.rebindButton(success.getMolecule());
            composerReferences = this.this$0.composerReferences;
            composerReferences.getController().update(new FavoriteReserveButtonUpdate(this.$sku, this.$wishlistId, this.$uniqId, success.getMolecule()));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FavoriteReserveButtonUIState favoriteReserveButtonUIState, d<? super Unit> dVar) {
        return ((FavoriteReserveButtonDelegateImpl$resubscribe$1) create(favoriteReserveButtonUIState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
