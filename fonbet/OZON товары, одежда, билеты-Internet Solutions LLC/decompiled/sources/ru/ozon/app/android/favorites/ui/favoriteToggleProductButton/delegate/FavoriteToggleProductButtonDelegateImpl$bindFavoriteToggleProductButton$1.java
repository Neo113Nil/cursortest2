package ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.delegate;

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
import ru.ozon.app.android.favorites.ui.notification.FavoritesNotification;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/ui/notification/FavoritesNotification;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.delegate.FavoriteToggleProductButtonDelegateImpl$bindFavoriteToggleProductButton$1", f = "FavoriteToggleProductButtonDelegateImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavoriteToggleProductButtonDelegateImpl$bindFavoriteToggleProductButton$1 extends j implements Function2<FavoritesNotification, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FavoriteToggleProductButtonDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteToggleProductButtonDelegateImpl$bindFavoriteToggleProductButton$1(FavoriteToggleProductButtonDelegateImpl favoriteToggleProductButtonDelegateImpl, d<? super FavoriteToggleProductButtonDelegateImpl$bindFavoriteToggleProductButton$1> dVar) {
        super(2, dVar);
        this.this$0 = favoriteToggleProductButtonDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FavoriteToggleProductButtonDelegateImpl$bindFavoriteToggleProductButton$1 favoriteToggleProductButtonDelegateImpl$bindFavoriteToggleProductButton$1 = new FavoriteToggleProductButtonDelegateImpl$bindFavoriteToggleProductButton$1(this.this$0, dVar);
        favoriteToggleProductButtonDelegateImpl$bindFavoriteToggleProductButton$1.L$0 = obj;
        return favoriteToggleProductButtonDelegateImpl$bindFavoriteToggleProductButton$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        FavoritesNotification favoritesNotification = (FavoritesNotification) this.L$0;
        if (favoritesNotification instanceof FavoritesNotification.Success) {
            this.this$0.showNotification(((FavoritesNotification.Success) favoritesNotification).getNotification());
        } else {
            if (!Intrinsics.d(favoritesNotification, FavoritesNotification.Error.INSTANCE)) {
                throw new o();
            }
            this.this$0.showError();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FavoritesNotification favoritesNotification, d<? super Unit> dVar) {
        return ((FavoriteToggleProductButtonDelegateImpl$bindFavoriteToggleProductButton$1) create(favoritesNotification, dVar)).invokeSuspend(Unit.f71690a);
    }
}
