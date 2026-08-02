package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2ExtKt;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.models.TopRightButtonCheckBox;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¨\u0006\u0006"}, d2 = {"modifyTopRightButtons", "", "", "isSelected", "", "compactFavoriteIcon", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TopRightButtonsUtilsKt {
    @NotNull
    public static final List<Object> modifyTopRightButtons(@NotNull List<? extends Object> list, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof FavoriteProductMoleculeV2) {
                obj = FavoriteProductMoleculeV2ExtKt.mapToV1((FavoriteProductMoleculeV2) obj, z12);
            } else if (obj instanceof TopRightButtonCheckBox) {
                obj = TopRightButtonCheckBox.copy$default((TopRightButtonCheckBox) obj, z11, null, 2, null);
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
