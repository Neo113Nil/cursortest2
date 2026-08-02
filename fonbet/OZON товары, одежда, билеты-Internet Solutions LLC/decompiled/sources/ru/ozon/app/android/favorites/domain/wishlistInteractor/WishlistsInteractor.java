package ru.ozon.app.android.favorites.domain.wishlistInteractor;

import Ae.InterfaceC2395h;
import W10.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H¦@¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistsInteractor;", "", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "addWishlistChangeRequest", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;LW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/h;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistUpdate;", "getWishlistsUpdates", "()LAe/h;", "wishlistsUpdates", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface WishlistsInteractor {
    Object addWishlistChangeRequest(@NotNull AtomAction.ComposerAction composerAction, c cVar, @NotNull d<? super Unit> dVar);

    @NotNull
    InterfaceC2395h<WishlistUpdate> getWishlistsUpdates();
}
