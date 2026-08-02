package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.data;

import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/data/AddLegalInnMobileDTO;", "", "searchParams", "", "", "trackingInfo", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "getSearchParams", "()Ljava/util/Map;", "getTrackingInfo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddLegalInnMobileDTO {
    public static final int $stable = 8;
    private final Map<String, String> searchParams;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public AddLegalInnMobileDTO(Map<String, String> map, Map<String, TokenizedTrackingInfo> map2) {
        this.searchParams = map;
        this.trackingInfo = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddLegalInnMobileDTO copy$default(AddLegalInnMobileDTO addLegalInnMobileDTO, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = addLegalInnMobileDTO.searchParams;
        }
        if ((i11 & 2) != 0) {
            map2 = addLegalInnMobileDTO.trackingInfo;
        }
        return addLegalInnMobileDTO.copy(map, map2);
    }

    public final Map<String, String> component1() {
        return this.searchParams;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final AddLegalInnMobileDTO copy(Map<String, String> searchParams, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new AddLegalInnMobileDTO(searchParams, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddLegalInnMobileDTO)) {
            return false;
        }
        AddLegalInnMobileDTO addLegalInnMobileDTO = (AddLegalInnMobileDTO) other;
        return Intrinsics.d(this.searchParams, addLegalInnMobileDTO.searchParams) && Intrinsics.d(this.trackingInfo, addLegalInnMobileDTO.trackingInfo);
    }

    public final Map<String, String> getSearchParams() {
        return this.searchParams;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Map<String, String> map = this.searchParams;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        return hashCode + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AddLegalInnMobileDTO(searchParams=" + this.searchParams + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
