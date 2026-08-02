package ru.ozon.app.android.favorites.ui.wishlists;

import Ae.x0;
import Sc.s;
import W10.c;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistsInteractor;
import ru.ozon.app.android.favorites.ui.wishlists.DeleteWishlistViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.ui.wishlists.DeleteWishlistViewModel$deleteWishlist$1", f = "DeleteWishlistViewModel.kt", l = {50, 51}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class DeleteWishlistViewModel$deleteWishlist$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ c $trackingData;
    int label;
    final /* synthetic */ DeleteWishlistViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeleteWishlistViewModel$deleteWishlist$1(DeleteWishlistViewModel deleteWishlistViewModel, AtomAction.ComposerAction composerAction, c cVar, d<? super DeleteWishlistViewModel$deleteWishlist$1> dVar) {
        super(2, dVar);
        this.this$0 = deleteWishlistViewModel;
        this.$action = composerAction;
        this.$trackingData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new DeleteWishlistViewModel$deleteWishlist$1(this.this$0, this.$action, this.$trackingData, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r5.addWishlistChangeRequest(r1, r3, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r5.emit(r1, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        WishlistsInteractor wishlistsInteractor;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            x0 x0Var = this.this$0._state;
            DeleteWishlistViewModel.State.Loading loading = DeleteWishlistViewModel.State.Loading.INSTANCE;
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
        wishlistsInteractor = this.this$0.wishlistsInteractor;
        AtomAction.ComposerAction composerAction = this.$action;
        c cVar = this.$trackingData;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((DeleteWishlistViewModel$deleteWishlist$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
