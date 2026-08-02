package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models;

import Bi.b;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/ApplyFiltersResults;", "", "", "", "appliedFiltersIds", ImagesContract.URL, "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAppliedFiltersIds", "()Ljava/util/List;", "Ljava/lang/String;", "getUrl", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ApplyFiltersResults {

    @NotNull
    private final List<String> appliedFiltersIds;

    @NotNull
    private final String url;

    public ApplyFiltersResults(@NotNull List<String> appliedFiltersIds, @NotNull String url) {
        Intrinsics.checkNotNullParameter(appliedFiltersIds, "appliedFiltersIds");
        Intrinsics.checkNotNullParameter(url, "url");
        this.appliedFiltersIds = appliedFiltersIds;
        this.url = url;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplyFiltersResults)) {
            return false;
        }
        ApplyFiltersResults applyFiltersResults = (ApplyFiltersResults) other;
        return Intrinsics.d(this.appliedFiltersIds, applyFiltersResults.appliedFiltersIds) && Intrinsics.d(this.url, applyFiltersResults.url);
    }

    @NotNull
    public final List<String> getAppliedFiltersIds() {
        return this.appliedFiltersIds;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (this.appliedFiltersIds.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return b.e("ApplyFiltersResults(appliedFiltersIds=", ", url=", this.url, ")", this.appliedFiltersIds);
    }
}
