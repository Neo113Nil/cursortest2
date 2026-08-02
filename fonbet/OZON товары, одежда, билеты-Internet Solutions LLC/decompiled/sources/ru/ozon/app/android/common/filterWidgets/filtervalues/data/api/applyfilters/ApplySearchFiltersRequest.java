package ru.ozon.app.android.common.filterWidgets.filtervalues.data.api.applyfilters;

import An.C2439a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/data/api/applyfilters/ApplySearchFiltersRequest;", "", "referer", "", "applyFilters", "", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/api/applyfilters/ApplySearchFiltersRequest$ApplyFilters;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getReferer", "()Ljava/lang/String;", "getApplyFilters", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ApplyFilters", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ApplySearchFiltersRequest {

    @NotNull
    private final List<ApplyFilters> applyFilters;

    @NotNull
    private final String referer;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/data/api/applyfilters/ApplySearchFiltersRequest$ApplyFilters;", "", "key", "", "type", "modeNot", "", "values", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getKey", "()Ljava/lang/String;", "getType", "getModeNot", "()Z", "getValues", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ApplyFilters {

        @NotNull
        private final String key;
        private final boolean modeNot;

        @NotNull
        private final String type;

        @NotNull
        private final List<String> values;

        public ApplyFilters(@NotNull String key, @NotNull String type, boolean z11, @NotNull List<String> values) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(values, "values");
            this.key = key;
            this.type = type;
            this.modeNot = z11;
            this.values = values;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApplyFilters copy$default(ApplyFilters applyFilters, String str, String str2, boolean z11, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = applyFilters.key;
            }
            if ((i11 & 2) != 0) {
                str2 = applyFilters.type;
            }
            if ((i11 & 4) != 0) {
                z11 = applyFilters.modeNot;
            }
            if ((i11 & 8) != 0) {
                list = applyFilters.values;
            }
            return applyFilters.copy(str, str2, z11, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getModeNot() {
            return this.modeNot;
        }

        @NotNull
        public final List<String> component4() {
            return this.values;
        }

        @NotNull
        public final ApplyFilters copy(@NotNull String key, @NotNull String type, boolean modeNot, @NotNull List<String> values) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(values, "values");
            return new ApplyFilters(key, type, modeNot, values);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApplyFilters)) {
                return false;
            }
            ApplyFilters applyFilters = (ApplyFilters) other;
            return Intrinsics.d(this.key, applyFilters.key) && Intrinsics.d(this.type, applyFilters.type) && this.modeNot == applyFilters.modeNot && Intrinsics.d(this.values, applyFilters.values);
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        public final boolean getModeNot() {
            return this.modeNot;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final List<String> getValues() {
            return this.values;
        }

        public int hashCode() {
            return this.values.hashCode() + C3532b.a(g.a(this.key.hashCode() * 31, 31, this.type), 31, this.modeNot);
        }

        @NotNull
        public String toString() {
            String str = this.key;
            String str2 = this.type;
            boolean z11 = this.modeNot;
            List<String> list = this.values;
            StringBuilder d11 = C3660k.d("ApplyFilters(key=", str, ", type=", str2, ", modeNot=");
            d11.append(z11);
            d11.append(", values=");
            d11.append(list);
            d11.append(")");
            return d11.toString();
        }
    }

    public ApplySearchFiltersRequest(@NotNull String referer, @NotNull List<ApplyFilters> applyFilters) {
        Intrinsics.checkNotNullParameter(referer, "referer");
        Intrinsics.checkNotNullParameter(applyFilters, "applyFilters");
        this.referer = referer;
        this.applyFilters = applyFilters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApplySearchFiltersRequest copy$default(ApplySearchFiltersRequest applySearchFiltersRequest, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = applySearchFiltersRequest.referer;
        }
        if ((i11 & 2) != 0) {
            list = applySearchFiltersRequest.applyFilters;
        }
        return applySearchFiltersRequest.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getReferer() {
        return this.referer;
    }

    @NotNull
    public final List<ApplyFilters> component2() {
        return this.applyFilters;
    }

    @NotNull
    public final ApplySearchFiltersRequest copy(@NotNull String referer, @NotNull List<ApplyFilters> applyFilters) {
        Intrinsics.checkNotNullParameter(referer, "referer");
        Intrinsics.checkNotNullParameter(applyFilters, "applyFilters");
        return new ApplySearchFiltersRequest(referer, applyFilters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplySearchFiltersRequest)) {
            return false;
        }
        ApplySearchFiltersRequest applySearchFiltersRequest = (ApplySearchFiltersRequest) other;
        return Intrinsics.d(this.referer, applySearchFiltersRequest.referer) && Intrinsics.d(this.applyFilters, applySearchFiltersRequest.applyFilters);
    }

    @NotNull
    public final List<ApplyFilters> getApplyFilters() {
        return this.applyFilters;
    }

    @NotNull
    public final String getReferer() {
        return this.referer;
    }

    public int hashCode() {
        return this.applyFilters.hashCode() + (this.referer.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return C2439a.a("ApplySearchFiltersRequest(referer=", this.referer, ", applyFilters=", ")", this.applyFilters);
    }
}
