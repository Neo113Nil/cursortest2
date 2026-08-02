package ru.ozon.app.android.favorites.domain.favoriteToggleProductButton;

import Ae.InterfaceC2395h;
import W10.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteToggleProductButton.model.FavoriteToggleProductButtonChangeResult;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005JJ\u0010\u0011\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH¦@¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoriteToggleProductButton/FavoriteToggleProductButtonInteractor;", "", "LAe/h;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteToggleProductButton/model/FavoriteToggleProductButtonChangeResult;", "observeRequests", "()LAe/h;", "", "sku", "listId", "giftId", "", "uniqId", "actionName", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "addFavoriteWishlistChangeRequest", "(Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;LW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getFavoriteToggleProductButtonUpdates", "favoriteToggleProductButtonUpdates", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FavoriteToggleProductButtonInteractor {
    Object addFavoriteWishlistChangeRequest(Long l11, long j11, Long l12, String str, @NotNull String str2, @NotNull c cVar, @NotNull d<? super Unit> dVar);

    @NotNull
    InterfaceC2395h<FavoriteToggleProductButtonChangeResult> getFavoriteToggleProductButtonUpdates();

    @NotNull
    InterfaceC2395h<FavoriteToggleProductButtonChangeResult> observeRequests();
}
