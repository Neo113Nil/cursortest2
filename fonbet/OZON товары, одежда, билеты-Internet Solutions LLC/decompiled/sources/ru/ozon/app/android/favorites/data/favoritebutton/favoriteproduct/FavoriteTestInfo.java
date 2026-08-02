package ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct;

import com.squareup.moshi.j;
import kotlin.Metadata;
import ru.ozon.uni.atoms.data.TestInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteTestInfo;", "", "favoriteButton", "Lru/ozon/uni/atoms/data/TestInfo;", "unFavoriteButton", "<init>", "(Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/uni/atoms/data/TestInfo;)V", "getFavoriteButton", "()Lru/ozon/uni/atoms/data/TestInfo;", "getUnFavoriteButton", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteTestInfo {
    private final TestInfo favoriteButton;
    private final TestInfo unFavoriteButton;

    public FavoriteTestInfo(TestInfo testInfo, TestInfo testInfo2) {
        this.favoriteButton = testInfo;
        this.unFavoriteButton = testInfo2;
    }

    public final TestInfo getFavoriteButton() {
        return this.favoriteButton;
    }

    public final TestInfo getUnFavoriteButton() {
        return this.unFavoriteButton;
    }
}
