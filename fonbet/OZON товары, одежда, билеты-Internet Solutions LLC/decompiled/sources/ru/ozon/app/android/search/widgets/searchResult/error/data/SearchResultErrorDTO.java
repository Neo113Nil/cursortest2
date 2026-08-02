package ru.ozon.app.android.search.widgets.searchResult.error.data;

import G.g;
import N3.C3660k;
import Nh.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003Je\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/error/data/SearchResultErrorDTO;", "", "message", "", "action", "deeplink", "link", "image", "type", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getMessage", "()Ljava/lang/String;", "getAction", "getDeeplink", "getLink", "getImage", "getType", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchResultErrorDTO {
    public static final int $stable = 8;
    private final String action;
    private final String deeplink;

    @NotNull
    private final String image;
    private final String link;

    @NotNull
    private final String message;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final String type;

    public SearchResultErrorDTO(@NotNull String message, String str, String str2, String str3, @NotNull String image, String str4, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(image, "image");
        this.message = message;
        this.action = str;
        this.deeplink = str2;
        this.link = str3;
        this.image = image;
        this.type = str4;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SearchResultErrorDTO copy$default(SearchResultErrorDTO searchResultErrorDTO, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchResultErrorDTO.message;
        }
        if ((i11 & 2) != 0) {
            str2 = searchResultErrorDTO.action;
        }
        if ((i11 & 4) != 0) {
            str3 = searchResultErrorDTO.deeplink;
        }
        if ((i11 & 8) != 0) {
            str4 = searchResultErrorDTO.link;
        }
        if ((i11 & 16) != 0) {
            str5 = searchResultErrorDTO.image;
        }
        if ((i11 & 32) != 0) {
            str6 = searchResultErrorDTO.type;
        }
        if ((i11 & 64) != 0) {
            map = searchResultErrorDTO.trackingInfo;
        }
        String str7 = str6;
        Map map2 = map;
        String str8 = str5;
        String str9 = str3;
        return searchResultErrorDTO.copy(str, str2, str9, str4, str8, str7, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final SearchResultErrorDTO copy(@NotNull String message, String action, String deeplink, String link, @NotNull String image, String type, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(image, "image");
        return new SearchResultErrorDTO(message, action, deeplink, link, image, type, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultErrorDTO)) {
            return false;
        }
        SearchResultErrorDTO searchResultErrorDTO = (SearchResultErrorDTO) other;
        return Intrinsics.d(this.message, searchResultErrorDTO.message) && Intrinsics.d(this.action, searchResultErrorDTO.action) && Intrinsics.d(this.deeplink, searchResultErrorDTO.deeplink) && Intrinsics.d(this.link, searchResultErrorDTO.link) && Intrinsics.d(this.image, searchResultErrorDTO.image) && Intrinsics.d(this.type, searchResultErrorDTO.type) && Intrinsics.d(this.trackingInfo, searchResultErrorDTO.trackingInfo);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.message.hashCode() * 31;
        String str = this.action;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deeplink;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.link;
        int a11 = g.a((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.image);
        String str4 = this.type;
        int hashCode4 = (a11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.message;
        String str2 = this.action;
        String str3 = this.deeplink;
        String str4 = this.link;
        String str5 = this.image;
        String str6 = this.type;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("SearchResultErrorDTO(message=", str, ", action=", str2, ", deeplink=");
        a.h(d11, str3, ", link=", str4, ", image=");
        a.h(d11, str5, ", type=", str6, ", trackingInfo=");
        return P.f(d11, map, ")");
    }
}
