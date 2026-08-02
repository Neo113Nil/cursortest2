package ru.ozon.app.android.common.filterWidgets.filters.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/BoolFilterModel;", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggleCounter;", "filter", "", "originalUrl", "<init>", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggleCounter;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggleCounter;", "getFilter", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggleCounter;", "Ljava/lang/String;", "getOriginalUrl", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BoolFilterModel {

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter filter;

    @NotNull
    private final String originalUrl;

    public BoolFilterModel(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter filter, @NotNull String originalUrl) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        this.filter = filter;
        this.originalUrl = originalUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoolFilterModel)) {
            return false;
        }
        BoolFilterModel boolFilterModel = (BoolFilterModel) other;
        return Intrinsics.d(this.filter, boolFilterModel.filter) && Intrinsics.d(this.originalUrl, boolFilterModel.originalUrl);
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter getFilter() {
        return this.filter;
    }

    @NotNull
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    public int hashCode() {
        return this.originalUrl.hashCode() + (this.filter.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "BoolFilterModel(filter=" + this.filter + ", originalUrl=" + this.originalUrl + ")";
    }
}
