package ru.ozon.app.android.common.filterWidgets.filters.presentation.category.footer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/footer/CategoryFooterVO;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$CategoryFilter$Footer;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FooterMapperKt {
    @NotNull
    public static final CategoryFooterVO toVO(@NotNull FiltersDTO.Section.Filter.CategoryFilter.Footer footer) {
        Intrinsics.checkNotNullParameter(footer, "<this>");
        return new CategoryFooterVO(footer.hashCode(), footer.getButton());
    }
}
