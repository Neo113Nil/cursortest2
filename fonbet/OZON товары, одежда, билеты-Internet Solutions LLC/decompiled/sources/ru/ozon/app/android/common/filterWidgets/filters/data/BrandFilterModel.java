package ru.ozon.app.android.common.filterWidgets.filters.data;

import B0.C2454a;
import Ek.a;
import G.g;
import T7.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001d\u0010\u0011R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/BrandFilterModel;", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "brandCell", "", "originalUrl", "", "brandIndex", "brandsCount", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;Ljava/lang/String;IILjava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "getBrandCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "Ljava/lang/String;", "getOriginalUrl", "I", "getBrandIndex", "getBrandsCount", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BrandFilterModel {

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio brandCell;
    private final int brandIndex;
    private final int brandsCount;

    @NotNull
    private final String originalUrl;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public BrandFilterModel(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio brandCell, @NotNull String originalUrl, int i11, int i12, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(brandCell, "brandCell");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        this.brandCell = brandCell;
        this.originalUrl = originalUrl;
        this.brandIndex = i11;
        this.brandsCount = i12;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandFilterModel)) {
            return false;
        }
        BrandFilterModel brandFilterModel = (BrandFilterModel) other;
        return Intrinsics.d(this.brandCell, brandFilterModel.brandCell) && Intrinsics.d(this.originalUrl, brandFilterModel.originalUrl) && this.brandIndex == brandFilterModel.brandIndex && this.brandsCount == brandFilterModel.brandsCount && Intrinsics.d(this.trackingInfo, brandFilterModel.trackingInfo);
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio getBrandCell() {
        return this.brandCell;
    }

    public final int getBrandIndex() {
        return this.brandIndex;
    }

    public final int getBrandsCount() {
        return this.brandsCount;
    }

    @NotNull
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.brandsCount, C2454a.a(this.brandIndex, g.a(this.brandCell.hashCode() * 31, 31, this.originalUrl), 31), 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cellWithSubtitle40IconCheckboxRadio = this.brandCell;
        String str = this.originalUrl;
        int i11 = this.brandIndex;
        int i12 = this.brandsCount;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("BrandFilterModel(brandCell=");
        sb2.append(cellWithSubtitle40IconCheckboxRadio);
        sb2.append(", originalUrl=");
        sb2.append(str);
        sb2.append(", brandIndex=");
        a.f(i11, i12, ", brandsCount=", ", trackingInfo=", sb2);
        return P.f(sb2, map, ")");
    }
}
