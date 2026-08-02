package ru.ozon.fintech.settings.models;

import B0.C2454a;
import K00.b;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/fintech/settings/models/FeatureFlagsRequest;", "", "filterRequest", "Lru/ozon/fintech/settings/models/FilterRequest;", "page", "", "perPage", "<init>", "(Lru/ozon/fintech/settings/models/FilterRequest;II)V", "getFilterRequest", "()Lru/ozon/fintech/settings/models/FilterRequest;", "getPage", "()I", "getPerPage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "fintech-settings_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FeatureFlagsRequest {

    @i(name = "filter")
    @NotNull
    private final FilterRequest filterRequest;

    @i(name = "page")
    private final int page;

    @i(name = "perPage")
    private final int perPage;

    public FeatureFlagsRequest(@NotNull FilterRequest filterRequest, int i11, int i12) {
        Intrinsics.checkNotNullParameter(filterRequest, "filterRequest");
        this.filterRequest = filterRequest;
        this.page = i11;
        this.perPage = i12;
    }

    public static /* synthetic */ FeatureFlagsRequest copy$default(FeatureFlagsRequest featureFlagsRequest, FilterRequest filterRequest, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            filterRequest = featureFlagsRequest.filterRequest;
        }
        if ((i13 & 2) != 0) {
            i11 = featureFlagsRequest.page;
        }
        if ((i13 & 4) != 0) {
            i12 = featureFlagsRequest.perPage;
        }
        return featureFlagsRequest.copy(filterRequest, i11, i12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FilterRequest getFilterRequest() {
        return this.filterRequest;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPerPage() {
        return this.perPage;
    }

    @NotNull
    public final FeatureFlagsRequest copy(@NotNull FilterRequest filterRequest, int page, int perPage) {
        Intrinsics.checkNotNullParameter(filterRequest, "filterRequest");
        return new FeatureFlagsRequest(filterRequest, page, perPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureFlagsRequest)) {
            return false;
        }
        FeatureFlagsRequest featureFlagsRequest = (FeatureFlagsRequest) other;
        return Intrinsics.d(this.filterRequest, featureFlagsRequest.filterRequest) && this.page == featureFlagsRequest.page && this.perPage == featureFlagsRequest.perPage;
    }

    @NotNull
    public final FilterRequest getFilterRequest() {
        return this.filterRequest;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getPerPage() {
        return this.perPage;
    }

    public int hashCode() {
        return Integer.hashCode(this.perPage) + C2454a.a(this.page, this.filterRequest.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        FilterRequest filterRequest = this.filterRequest;
        int i11 = this.page;
        int i12 = this.perPage;
        StringBuilder sb2 = new StringBuilder("FeatureFlagsRequest(filterRequest=");
        sb2.append(filterRequest);
        sb2.append(", page=");
        sb2.append(i11);
        sb2.append(", perPage=");
        return b.e(i12, ")", sb2);
    }
}
