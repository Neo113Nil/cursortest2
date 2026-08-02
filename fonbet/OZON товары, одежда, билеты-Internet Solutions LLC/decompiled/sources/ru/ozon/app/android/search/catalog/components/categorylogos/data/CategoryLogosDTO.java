package ru.ozon.app.android.search.catalog.components.categorylogos.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ*\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categorylogos/data/CategoryLogosDTO;", "", "items", "", "Lru/ozon/app/android/search/catalog/components/categorylogos/data/CategoryLogoDTO;", "hideImage", "", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getItems", "()Ljava/util/List;", "getHideImage", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lru/ozon/app/android/search/catalog/components/categorylogos/data/CategoryLogosDTO;", "equals", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CategoryLogosDTO {
    public static final int $stable = 8;
    private final Boolean hideImage;

    @NotNull
    private final List<CategoryLogoDTO> items;

    public CategoryLogosDTO(@NotNull List<CategoryLogoDTO> items, Boolean bool) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.hideImage = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoryLogosDTO copy$default(CategoryLogosDTO categoryLogosDTO, List list, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = categoryLogosDTO.items;
        }
        if ((i11 & 2) != 0) {
            bool = categoryLogosDTO.hideImage;
        }
        return categoryLogosDTO.copy(list, bool);
    }

    @NotNull
    public final List<CategoryLogoDTO> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getHideImage() {
        return this.hideImage;
    }

    @NotNull
    public final CategoryLogosDTO copy(@NotNull List<CategoryLogoDTO> items, Boolean hideImage) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new CategoryLogosDTO(items, hideImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryLogosDTO)) {
            return false;
        }
        CategoryLogosDTO categoryLogosDTO = (CategoryLogosDTO) other;
        return Intrinsics.d(this.items, categoryLogosDTO.items) && Intrinsics.d(this.hideImage, categoryLogosDTO.hideImage);
    }

    public final Boolean getHideImage() {
        return this.hideImage;
    }

    @NotNull
    public final List<CategoryLogoDTO> getItems() {
        return this.items;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Boolean bool = this.hideImage;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        return "CategoryLogosDTO(items=" + this.items + ", hideImage=" + this.hideImage + ")";
    }
}
