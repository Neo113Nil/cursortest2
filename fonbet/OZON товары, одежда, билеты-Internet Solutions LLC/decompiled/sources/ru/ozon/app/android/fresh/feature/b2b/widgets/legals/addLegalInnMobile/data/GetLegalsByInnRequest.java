package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.data;

import Nh.a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/data/GetLegalsByInnRequest;", "", "inn", "", "searchParams", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getInn", "()Ljava/lang/String;", "getSearchParams", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetLegalsByInnRequest {
    public static final int $stable = 8;

    @NotNull
    private final String inn;
    private final Map<String, String> searchParams;

    public GetLegalsByInnRequest(@NotNull String inn, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(inn, "inn");
        this.inn = inn;
        this.searchParams = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetLegalsByInnRequest copy$default(GetLegalsByInnRequest getLegalsByInnRequest, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = getLegalsByInnRequest.inn;
        }
        if ((i11 & 2) != 0) {
            map = getLegalsByInnRequest.searchParams;
        }
        return getLegalsByInnRequest.copy(str, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getInn() {
        return this.inn;
    }

    public final Map<String, String> component2() {
        return this.searchParams;
    }

    @NotNull
    public final GetLegalsByInnRequest copy(@NotNull String inn, Map<String, String> searchParams) {
        Intrinsics.checkNotNullParameter(inn, "inn");
        return new GetLegalsByInnRequest(inn, searchParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetLegalsByInnRequest)) {
            return false;
        }
        GetLegalsByInnRequest getLegalsByInnRequest = (GetLegalsByInnRequest) other;
        return Intrinsics.d(this.inn, getLegalsByInnRequest.inn) && Intrinsics.d(this.searchParams, getLegalsByInnRequest.searchParams);
    }

    @NotNull
    public final String getInn() {
        return this.inn;
    }

    public final Map<String, String> getSearchParams() {
        return this.searchParams;
    }

    public int hashCode() {
        int hashCode = this.inn.hashCode() * 31;
        Map<String, String> map = this.searchParams;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return a.d("GetLegalsByInnRequest(inn=", this.inn, ", searchParams=", ")", this.searchParams);
    }
}
