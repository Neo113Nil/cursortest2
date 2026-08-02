package ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.data;

import B3.p;
import Ql.c;
import T7.P;
import com.google.android.gms.actions.SearchIntents;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelSearchBar/data/TravelSearchBarDTO;", "", HammersV3BodyDTO.PLACEHOLDER, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", SearchIntents.EXTRA_QUERY, "tapAction", "searchTracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getPlaceholder", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getQuery", "getTapAction", "getSearchTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelSearchBarDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final String placeholder;
    private final String query;
    private final Map<String, TokenizedTrackingInfo> searchTracking;
    private final AtomActionDTO tapAction;

    public TravelSearchBarDTO(String str, AtomActionDTO atomActionDTO, String str2, AtomActionDTO atomActionDTO2, Map<String, TokenizedTrackingInfo> map) {
        this.placeholder = str;
        this.action = atomActionDTO;
        this.query = str2;
        this.tapAction = atomActionDTO2;
        this.searchTracking = map;
    }

    public static /* synthetic */ TravelSearchBarDTO copy$default(TravelSearchBarDTO travelSearchBarDTO, String str, AtomActionDTO atomActionDTO, String str2, AtomActionDTO atomActionDTO2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = travelSearchBarDTO.placeholder;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = travelSearchBarDTO.action;
        }
        if ((i11 & 4) != 0) {
            str2 = travelSearchBarDTO.query;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO2 = travelSearchBarDTO.tapAction;
        }
        if ((i11 & 16) != 0) {
            map = travelSearchBarDTO.searchTracking;
        }
        Map map2 = map;
        String str3 = str2;
        return travelSearchBarDTO.copy(str, atomActionDTO, str3, atomActionDTO2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getTapAction() {
        return this.tapAction;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.searchTracking;
    }

    @NotNull
    public final TravelSearchBarDTO copy(String placeholder, AtomActionDTO action, String query, AtomActionDTO tapAction, Map<String, TokenizedTrackingInfo> searchTracking) {
        return new TravelSearchBarDTO(placeholder, action, query, tapAction, searchTracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelSearchBarDTO)) {
            return false;
        }
        TravelSearchBarDTO travelSearchBarDTO = (TravelSearchBarDTO) other;
        return Intrinsics.d(this.placeholder, travelSearchBarDTO.placeholder) && Intrinsics.d(this.action, travelSearchBarDTO.action) && Intrinsics.d(this.query, travelSearchBarDTO.query) && Intrinsics.d(this.tapAction, travelSearchBarDTO.tapAction) && Intrinsics.d(this.searchTracking, travelSearchBarDTO.searchTracking);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getQuery() {
        return this.query;
    }

    public final Map<String, TokenizedTrackingInfo> getSearchTracking() {
        return this.searchTracking;
    }

    public final AtomActionDTO getTapAction() {
        return this.tapAction;
    }

    public int hashCode() {
        String str = this.placeholder;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str2 = this.query;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.tapAction;
        int hashCode4 = (hashCode3 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.searchTracking;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.placeholder;
        AtomActionDTO atomActionDTO = this.action;
        String str2 = this.query;
        AtomActionDTO atomActionDTO2 = this.tapAction;
        Map<String, TokenizedTrackingInfo> map = this.searchTracking;
        StringBuilder c11 = c.c("TravelSearchBarDTO(placeholder=", str, ", action=", atomActionDTO, ", query=");
        p.c(str2, ", tapAction=", ", searchTracking=", c11, atomActionDTO2);
        return P.f(c11, map, ")");
    }
}
