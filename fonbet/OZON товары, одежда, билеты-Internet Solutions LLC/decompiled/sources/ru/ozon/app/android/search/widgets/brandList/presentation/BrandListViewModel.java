package ru.ozon.app.android.search.widgets.brandList.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ge.n;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3978p0;
import S0.n1;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import c1.u;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.FavoriteStateStore;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.KeyFavoriteEntityModel;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\bJ\u001b\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R+\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R+\u0010%\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/search/widgets/brandList/presentation/BrandListViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/FavoriteStateStore;", "favoriteStateStore", "<init>", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/FavoriteStateStore;)V", "", "observeFavoriteUpdate", "()V", "", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/KeyFavoriteEntityModel;", "", "updates", "applyFavoriteUpdates", "(Ljava/util/Map;)V", "clearSearchText", "", "", "newFavorites", "setInitialFavoriteState", "(Ljava/util/List;)V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/FavoriteStateStore;", "", "<set-?>", "textState$delegate", "LS0/p0;", "getTextState", "()Ljava/lang/String;", "setTextState", "(Ljava/lang/String;)V", "textState", "Lc1/u;", "favorites", "Lc1/u;", "getFavorites", "()Lc1/u;", "isSearchTextInitialized$delegate", "isSearchTextInitialized", "()Z", "setSearchTextInitialized", "(Z)V", "favState", "Ljava/util/List;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BrandListViewModel extends w0 {
    private List<Long> favState;

    @NotNull
    private final FavoriteStateStore favoriteStateStore;

    @NotNull
    private final u<Long> favorites;

    /* renamed from: isSearchTextInitialized$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 isSearchTextInitialized;

    /* renamed from: textState$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 textState;

    public BrandListViewModel(@NotNull FavoriteStateStore favoriteStateStore) {
        C3991w0 f7;
        C3991w0 f11;
        Intrinsics.checkNotNullParameter(favoriteStateStore, "favoriteStateStore");
        this.favoriteStateStore = favoriteStateStore;
        f7 = n1.f("", D1.f25195a);
        this.textState = f7;
        this.favorites = new u<>();
        f11 = n1.f(Boolean.FALSE, D1.f25195a);
        this.isSearchTextInitialized = f11;
        observeFavoriteUpdate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyFavoriteUpdates(Map<KeyFavoriteEntityModel, Boolean> updates) {
        for (Map.Entry<KeyFavoriteEntityModel, Boolean> entry : updates.entrySet()) {
            KeyFavoriteEntityModel key = entry.getKey();
            boolean booleanValue = entry.getValue().booleanValue();
            if (booleanValue && !this.favorites.contains(Long.valueOf(key.getSku()))) {
                this.favorites.add(Long.valueOf(key.getSku()));
            } else if (!booleanValue) {
                this.favorites.remove(Long.valueOf(key.getSku()));
            }
        }
    }

    private final void observeFavoriteUpdate() {
        C2399j.C(new C2408n0(n.a(this.favoriteStateStore.subscribeOnFavoriteUpdate()), new BrandListViewModel$observeFavoriteUpdate$1(this, null)), x0.a(this));
    }

    public final void clearSearchText() {
        setTextState("");
    }

    @NotNull
    public final u<Long> getFavorites() {
        return this.favorites;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getTextState() {
        return (String) this.textState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSearchTextInitialized() {
        return ((Boolean) this.isSearchTextInitialized.getValue()).booleanValue();
    }

    public final void setInitialFavoriteState(@NotNull List<Long> newFavorites) {
        Intrinsics.checkNotNullParameter(newFavorites, "newFavorites");
        if (this.favState == null) {
            this.favState = newFavorites;
            this.favorites.addAll(newFavorites);
        }
    }

    public final void setSearchTextInitialized(boolean z11) {
        this.isSearchTextInitialized.setValue(Boolean.valueOf(z11));
    }

    public final void setTextState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.textState.setValue(str);
    }
}
