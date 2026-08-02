package ru.ozon.app.android.favorites.ui.favoriteReserveButton;

import Ae.x0;
import Sc.s;
import W10.c;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.favorites.domain.favoriteReserveButton.FavoriteReserveButtonMoleculeInteractor;
import ru.ozon.app.android.favorites.ui.favoriteReserveButton.FavoriteReserveButtonUIState;
import ru.ozon.app.android.favorites.ui.favoriteReserveButton.FavoriteReserveButtonViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.ui.favoriteReserveButton.FavoriteReserveButtonViewModel$onReserveClick$1", f = "FavoriteReserveButtonViewModel.kt", l = {66, 67}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavoriteReserveButtonViewModel$onReserveClick$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ Long $giftId;
    final /* synthetic */ Long $sku;
    final /* synthetic */ c $trackingData;
    final /* synthetic */ String $uniqId;
    final /* synthetic */ long $wishlistId;
    int label;
    final /* synthetic */ FavoriteReserveButtonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteReserveButtonViewModel$onReserveClick$1(FavoriteReserveButtonViewModel favoriteReserveButtonViewModel, Long l11, long j11, String str, Long l12, AtomAction.ComposerAction composerAction, c cVar, d<? super FavoriteReserveButtonViewModel$onReserveClick$1> dVar) {
        super(2, dVar);
        this.this$0 = favoriteReserveButtonViewModel;
        this.$sku = l11;
        this.$wishlistId = j11;
        this.$uniqId = str;
        this.$giftId = l12;
        this.$action = composerAction;
        this.$trackingData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FavoriteReserveButtonViewModel$onReserveClick$1(this.this$0, this.$sku, this.$wishlistId, this.$uniqId, this.$giftId, this.$action, this.$trackingData, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r3.addFavoriteReservedChangeRequest(r4, r5, r7, r8, r9, r10, r12) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r13.emit(r1, r12) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FavoriteReserveButtonMoleculeInteractor favoriteReserveButtonMoleculeInteractor;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            FavoriteReserveButtonViewModel favoriteReserveButtonViewModel = this.this$0;
            x0 x0Var = favoriteReserveButtonViewModel.get((Map<FavoriteReserveButtonViewModel.FavoriteReserveButtonKey, x0<FavoriteReserveButtonUIState>>) favoriteReserveButtonViewModel.reservedButtonState, this.$sku, this.$wishlistId, this.$uniqId);
            FavoriteReserveButtonUIState.ProcessAction processAction = FavoriteReserveButtonUIState.ProcessAction.INSTANCE;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        favoriteReserveButtonMoleculeInteractor = this.this$0.favoriteReserveButtonInteractor;
        Long l11 = this.$sku;
        long j11 = this.$wishlistId;
        String str = this.$uniqId;
        Long l12 = this.$giftId;
        AtomAction.ComposerAction composerAction = this.$action;
        c cVar = this.$trackingData;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FavoriteReserveButtonViewModel$onReserveClick$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
