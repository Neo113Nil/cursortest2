package ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.viewmodel;

import Sc.s;
import W10.c;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractor;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.viewmodel.FavoriteToggleProductButtonViewModel$processAction$1", f = "FavoriteToggleProductButtonViewModel.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavoriteToggleProductButtonViewModel$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ Long $giftId;
    final /* synthetic */ long $listId;
    final /* synthetic */ Long $sku;
    final /* synthetic */ c $trackingData;
    final /* synthetic */ String $uniqId;
    int label;
    final /* synthetic */ FavoriteToggleProductButtonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteToggleProductButtonViewModel$processAction$1(FavoriteToggleProductButtonViewModel favoriteToggleProductButtonViewModel, Long l11, long j11, Long l12, String str, AtomAction.ComposerAction composerAction, c cVar, d<? super FavoriteToggleProductButtonViewModel$processAction$1> dVar) {
        super(2, dVar);
        this.this$0 = favoriteToggleProductButtonViewModel;
        this.$sku = l11;
        this.$listId = j11;
        this.$giftId = l12;
        this.$uniqId = str;
        this.$action = composerAction;
        this.$trackingData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FavoriteToggleProductButtonViewModel$processAction$1(this.this$0, this.$sku, this.$listId, this.$giftId, this.$uniqId, this.$action, this.$trackingData, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FavoriteToggleProductButtonInteractor favoriteToggleProductButtonInteractor;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            favoriteToggleProductButtonInteractor = this.this$0.favoriteToggleProductButtonInteractor;
            Long l11 = this.$sku;
            long j11 = this.$listId;
            Long l12 = this.$giftId;
            String str = this.$uniqId;
            String actionName = this.$action.getActionName();
            c cVar = this.$trackingData;
            this.label = 1;
            if (favoriteToggleProductButtonInteractor.addFavoriteWishlistChangeRequest(l11, j11, l12, str, actionName, cVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FavoriteToggleProductButtonViewModel$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
