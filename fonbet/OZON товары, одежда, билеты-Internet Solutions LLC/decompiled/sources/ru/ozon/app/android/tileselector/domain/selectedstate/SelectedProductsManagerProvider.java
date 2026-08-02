package ru.ozon.app.android.tileselector.domain.selectedstate;

import Sc.InterfaceC4008j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ#\u0010\t\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/tileselector/domain/selectedstate/SelectedProductsManagerProvider;", "", "", "storeHash", "", "pageUrl", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "default", "LSc/j;", "get", "(ILjava/lang/String;Lru/ozon/app/android/favorites/common/SelectedProductsManager;)LSc/j;", "Lru/ozon/app/android/tileselector/domain/selectedstate/UgcSelectedProductsManager;", "(ILjava/lang/String;)Lru/ozon/app/android/tileselector/domain/selectedstate/UgcSelectedProductsManager;", "tileselector_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SelectedProductsManagerProvider {
    @NotNull
    InterfaceC4008j<SelectedProductsManager> get(int storeHash, String pageUrl, @NotNull SelectedProductsManager r32);

    UgcSelectedProductsManager get(int storeHash, String pageUrl);
}
