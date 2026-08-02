package ru.ozon.app.android.common.filterWidgets.filtervalues.data.api.applyfilters;

import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/data/api/applyfilters/ApplySearchFiltersResponse;", "", ImagesContract.URL, "", "totalItems", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getUrl", "()Ljava/lang/String;", "getTotalItems", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/app/android/common/filterWidgets/filtervalues/data/api/applyfilters/ApplySearchFiltersResponse;", "equals", "", "other", "hashCode", "toString", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ApplySearchFiltersResponse {
    private final Integer totalItems;
    private final String url;

    public ApplySearchFiltersResponse(String str, Integer num) {
        this.url = str;
        this.totalItems = num;
    }

    public static /* synthetic */ ApplySearchFiltersResponse copy$default(ApplySearchFiltersResponse applySearchFiltersResponse, String str, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = applySearchFiltersResponse.url;
        }
        if ((i11 & 2) != 0) {
            num = applySearchFiltersResponse.totalItems;
        }
        return applySearchFiltersResponse.copy(str, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getTotalItems() {
        return this.totalItems;
    }

    @NotNull
    public final ApplySearchFiltersResponse copy(String url, Integer totalItems) {
        return new ApplySearchFiltersResponse(url, totalItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplySearchFiltersResponse)) {
            return false;
        }
        ApplySearchFiltersResponse applySearchFiltersResponse = (ApplySearchFiltersResponse) other;
        return Intrinsics.d(this.url, applySearchFiltersResponse.url) && Intrinsics.d(this.totalItems, applySearchFiltersResponse.totalItems);
    }

    public final Integer getTotalItems() {
        return this.totalItems;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.totalItems;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ApplySearchFiltersResponse(url=" + this.url + ", totalItems=" + this.totalItems + ")";
    }
}
