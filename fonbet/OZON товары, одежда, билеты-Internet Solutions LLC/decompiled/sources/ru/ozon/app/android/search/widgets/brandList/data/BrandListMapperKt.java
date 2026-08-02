package ru.ozon.app.android.search.widgets.brandList.data;

import Tc.b;
import Tc.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.brandList.data.BrandListDTO;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.FavoriteCell;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.TitleCell;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\u0000\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003*\u00020\u0005H\u0000\u001a\u000e\u0010\b\u001a\u00020\u0002*\u0004\u0018\u00010\tH\u0000\u001a\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u0002\u001a\f\u0010\f\u001a\u00020\u0004*\u00020\rH\u0002¨\u0006\u000e"}, d2 = {"mapSections", "", "Lru/ozon/app/android/search/widgets/brandList/presentation/models/TitleCell;", "", "Lru/ozon/app/android/search/widgets/brandList/presentation/models/FavoriteCell;", "Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO;", "mapFavorites", "", "toTitleCell", "Lru/ozon/uni/atoms/data/text/TextDTO;", "mapToCells", "", "toFavoriteCell", "Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$WrappedCell;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BrandListMapperKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @NotNull
    public static final List<Long> mapFavorites(@NotNull BrandListDTO brandListDTO) {
        ?? r12;
        List<FavoriteCell> mapToCells;
        Intrinsics.checkNotNullParameter(brandListDTO, "<this>");
        b builder = C7714v.B();
        List<Object> values = brandListDTO.getFavorites().getValues();
        if (values == null || (mapToCells = mapToCells(values)) == null) {
            r12 = K.f71697a;
        } else {
            List<FavoriteCell> list = mapToCells;
            r12 = new ArrayList(C7714v.z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SisBrandFavoriteButton favoriteButton = ((FavoriteCell) it.next()).getFavoriteButton();
                r12.add(Long.valueOf(favoriteButton != null ? favoriteButton.getId() : -1L));
            }
        }
        builder.addAll(r12);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    @NotNull
    public static final Map<TitleCell, List<FavoriteCell>> mapSections(@NotNull BrandListDTO brandListDTO) {
        List list;
        Intrinsics.checkNotNullParameter(brandListDTO, "<this>");
        d builder = new d();
        List<BrandListDTO.Section> sections = brandListDTO.getSections();
        if (sections != null) {
            for (BrandListDTO.Section section : sections) {
                TitleCell titleCell = toTitleCell(section.getTitle());
                List<Object> values = section.getValues();
                if (values == null || (list = mapToCells(values)) == null) {
                    list = K.f71697a;
                }
                builder.put(titleCell, list);
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }

    private static final List<FavoriteCell> mapToCells(List<? extends Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            FavoriteCell favoriteCell = obj instanceof BrandListDTO.WrappedCell ? toFavoriteCell((BrandListDTO.WrappedCell) obj) : null;
            if (favoriteCell != null) {
                arrayList.add(favoriteCell);
            }
        }
        return arrayList;
    }

    private static final FavoriteCell toFavoriteCell(BrandListDTO.WrappedCell wrappedCell) {
        return new FavoriteCell(String.valueOf(wrappedCell.hashCode()), wrappedCell.getCell(), wrappedCell.getFavoriteButton());
    }

    @NotNull
    public static final TitleCell toTitleCell(TextDTO textDTO) {
        return new TitleCell(String.valueOf(textDTO != null ? textDTO.hashCode() : 0), textDTO);
    }
}
