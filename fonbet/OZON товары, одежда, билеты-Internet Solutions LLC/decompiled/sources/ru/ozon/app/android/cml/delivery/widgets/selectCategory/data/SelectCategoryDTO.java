package ru.ozon.app.android.cml.delivery.widgets.selectCategory.data;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListMoleculeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/selectCategory/data/SelectCategoryDTO;", "", "categories", "Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Ljava/util/Map;)V", "getCategories", "()Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectCategoryDTO {

    @NotNull
    private final CmlCellListMoleculeDTO categories;

    @NotNull
    private final DisclaimerDTO disclaimer;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public SelectCategoryDTO(@NotNull CmlCellListMoleculeDTO categories, @NotNull DisclaimerDTO disclaimer, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.categories = categories;
        this.disclaimer = disclaimer;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectCategoryDTO copy$default(SelectCategoryDTO selectCategoryDTO, CmlCellListMoleculeDTO cmlCellListMoleculeDTO, DisclaimerDTO disclaimerDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cmlCellListMoleculeDTO = selectCategoryDTO.categories;
        }
        if ((i11 & 2) != 0) {
            disclaimerDTO = selectCategoryDTO.disclaimer;
        }
        if ((i11 & 4) != 0) {
            map = selectCategoryDTO.trackingInfo;
        }
        return selectCategoryDTO.copy(cmlCellListMoleculeDTO, disclaimerDTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CmlCellListMoleculeDTO getCategories() {
        return this.categories;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final SelectCategoryDTO copy(@NotNull CmlCellListMoleculeDTO categories, @NotNull DisclaimerDTO disclaimer, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return new SelectCategoryDTO(categories, disclaimer, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectCategoryDTO)) {
            return false;
        }
        SelectCategoryDTO selectCategoryDTO = (SelectCategoryDTO) other;
        return Intrinsics.d(this.categories, selectCategoryDTO.categories) && Intrinsics.d(this.disclaimer, selectCategoryDTO.disclaimer) && Intrinsics.d(this.trackingInfo, selectCategoryDTO.trackingInfo);
    }

    @NotNull
    public final CmlCellListMoleculeDTO getCategories() {
        return this.categories;
    }

    @NotNull
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.disclaimer.hashCode() + (this.categories.hashCode() * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        CmlCellListMoleculeDTO cmlCellListMoleculeDTO = this.categories;
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("SelectCategoryDTO(categories=");
        sb2.append(cmlCellListMoleculeDTO);
        sb2.append(", disclaimer=");
        sb2.append(disclaimerDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
