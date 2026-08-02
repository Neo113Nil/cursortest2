package ru.ozon.app.android.storefront.widgets.navbarApparel.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.storefront.widgets.navbarApparel.data.NavBarApparelDTO;
import ru.ozon.app.android.storefront.widgets.navbarApparel.presentation.NavBarApparelVO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u0004H\u0002\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¨\u0006\b"}, d2 = {"toVO", "Lru/ozon/app/android/storefront/widgets/navbarApparel/presentation/NavBarApparelVO;", "Lru/ozon/app/android/storefront/widgets/navbarApparel/data/NavBarApparelDTO;", "nullIfEmpty", "", "modifyRightButtons", "", "", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavBarApparelMapperKt {
    private static final List<Object> modifyRightButtons(List<? extends Object> list) {
        List<? extends Object> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (Object obj : list2) {
            if (!(obj instanceof FavoriteProductMolecule) && !(obj instanceof IconButtonV3DTO)) {
                obj = null;
            }
            arrayList.add(obj);
        }
        return C7714v.I(arrayList);
    }

    private static final String nullIfEmpty(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    @NotNull
    public static final NavBarApparelVO toVO(@NotNull NavBarApparelDTO navBarApparelDTO) {
        Intrinsics.checkNotNullParameter(navBarApparelDTO, "<this>");
        long hashCode = navBarApparelDTO.hashCode();
        IconButtonV3DTO backButton = navBarApparelDTO.getBackButton();
        List<Object> rightButtons = navBarApparelDTO.getRightButtons();
        return new NavBarApparelVO(hashCode, backButton, rightButtons != null ? modifyRightButtons(rightButtons) : null, nullIfEmpty(navBarApparelDTO.getPrefetchDeeplink()));
    }
}
