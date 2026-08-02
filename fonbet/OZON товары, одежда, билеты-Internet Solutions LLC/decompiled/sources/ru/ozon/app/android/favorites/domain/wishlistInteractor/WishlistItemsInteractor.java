package ru.ozon.app.android.favorites.domain.wishlistInteractor;

import Ae.InterfaceC2395h;
import W10.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JR\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH¦@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemsInteractor;", "", "", "sku", "listId", "giftId", "", "uniqId", "actionName", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "addWishlistItemChangeRequest", "(Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;LW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/h;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemUpdate;", "getWishlistItemUpdates", "()LAe/h;", "wishlistItemUpdates", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface WishlistItemsInteractor {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object addWishlistItemChangeRequest$default(WishlistItemsInteractor wishlistItemsInteractor, Long l11, long j11, Long l12, String str, String str2, c cVar, d dVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addWishlistItemChangeRequest");
            }
            if ((i11 & 4) != 0) {
                l12 = null;
            }
            if ((i11 & 8) != 0) {
                str = null;
            }
            return wishlistItemsInteractor.addWishlistItemChangeRequest(l11, j11, l12, str, str2, cVar, dVar);
        }
    }

    Object addWishlistItemChangeRequest(Long l11, long j11, Long l12, String str, @NotNull String str2, c cVar, @NotNull d<? super Unit> dVar);

    @NotNull
    InterfaceC2395h<WishlistItemUpdate> getWishlistItemUpdates();
}
