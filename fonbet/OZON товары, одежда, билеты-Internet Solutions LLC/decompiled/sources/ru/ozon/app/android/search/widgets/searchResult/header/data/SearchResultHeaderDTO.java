package ru.ozon.app.android.search.widgets.searchResult.header.data;

import Nh.a;
import Tz.C4055a;
import V.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002/0Bi\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J{\u0010(\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00061"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/data/SearchResultHeaderDTO;", "", "breadCrumbs", "", "Lru/ozon/app/android/search/widgets/searchResult/header/data/SearchResultHeaderDTO$BreadCrumb;", CommentV3DTO.HEADER_FIELD_NAME, "", "totalFound", "searchOriginalText", "deeplink", "shareData", "Lru/ozon/app/android/search/widgets/searchResult/header/data/SearchResultHeaderDTO$ShareData;", "favoriteEntityButton", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/search/widgets/searchResult/header/data/SearchResultHeaderDTO$ShareData;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;Ljava/util/Map;)V", "getBreadCrumbs", "()Ljava/util/List;", "getHeader", "()Ljava/lang/String;", "getTotalFound", "getSearchOriginalText", "getDeeplink", "getShareData", "()Lru/ozon/app/android/search/widgets/searchResult/header/data/SearchResultHeaderDTO$ShareData;", "getFavoriteEntityButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "BreadCrumb", "ShareData", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchResultHeaderDTO {
    public static final int $stable = 8;
    private final List<BreadCrumb> breadCrumbs;
    private final String deeplink;
    private final FavoriteEntity favoriteEntityButton;
    private final String header;
    private final String searchOriginalText;
    private final ShareData shareData;
    private final String totalFound;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/data/SearchResultHeaderDTO$BreadCrumb;", "", "text", "", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getDeeplink", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BreadCrumb {
        public static final int $stable = 0;
        private final String deeplink;

        @NotNull
        private final String text;

        public BreadCrumb(@NotNull String text, String str) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.deeplink = str;
        }

        public static /* synthetic */ BreadCrumb copy$default(BreadCrumb breadCrumb, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = breadCrumb.text;
            }
            if ((i11 & 2) != 0) {
                str2 = breadCrumb.deeplink;
            }
            return breadCrumb.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final BreadCrumb copy(@NotNull String text, String deeplink) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new BreadCrumb(text, deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BreadCrumb)) {
                return false;
            }
            BreadCrumb breadCrumb = (BreadCrumb) other;
            return Intrinsics.d(this.text, breadCrumb.text) && Intrinsics.d(this.deeplink, breadCrumb.deeplink);
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.deeplink;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("BreadCrumb(text=", this.text, ", deeplink=", this.deeplink, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/data/SearchResultHeaderDTO$ShareData;", "", "text", "", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getLink", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShareData {
        public static final int $stable = 0;

        @NotNull
        private final String link;

        @NotNull
        private final String text;

        public ShareData(@NotNull String text, @NotNull String link) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(link, "link");
            this.text = text;
            this.link = link;
        }

        public static /* synthetic */ ShareData copy$default(ShareData shareData, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = shareData.text;
            }
            if ((i11 & 2) != 0) {
                str2 = shareData.link;
            }
            return shareData.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final ShareData copy(@NotNull String text, @NotNull String link) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(link, "link");
            return new ShareData(text, link);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShareData)) {
                return false;
            }
            ShareData shareData = (ShareData) other;
            return Intrinsics.d(this.text, shareData.text) && Intrinsics.d(this.link, shareData.link);
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.link.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("ShareData(text=", this.text, ", link=", this.link, ")");
        }
    }

    public SearchResultHeaderDTO(List<BreadCrumb> list, String str, String str2, String str3, String str4, ShareData shareData, FavoriteEntity favoriteEntity, Map<String, TokenizedTrackingInfo> map) {
        this.breadCrumbs = list;
        this.header = str;
        this.totalFound = str2;
        this.searchOriginalText = str3;
        this.deeplink = str4;
        this.shareData = shareData;
        this.favoriteEntityButton = favoriteEntity;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SearchResultHeaderDTO copy$default(SearchResultHeaderDTO searchResultHeaderDTO, List list, String str, String str2, String str3, String str4, ShareData shareData, FavoriteEntity favoriteEntity, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = searchResultHeaderDTO.breadCrumbs;
        }
        if ((i11 & 2) != 0) {
            str = searchResultHeaderDTO.header;
        }
        if ((i11 & 4) != 0) {
            str2 = searchResultHeaderDTO.totalFound;
        }
        if ((i11 & 8) != 0) {
            str3 = searchResultHeaderDTO.searchOriginalText;
        }
        if ((i11 & 16) != 0) {
            str4 = searchResultHeaderDTO.deeplink;
        }
        if ((i11 & 32) != 0) {
            shareData = searchResultHeaderDTO.shareData;
        }
        if ((i11 & 64) != 0) {
            favoriteEntity = searchResultHeaderDTO.favoriteEntityButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = searchResultHeaderDTO.trackingInfo;
        }
        FavoriteEntity favoriteEntity2 = favoriteEntity;
        Map map2 = map;
        String str5 = str4;
        ShareData shareData2 = shareData;
        return searchResultHeaderDTO.copy(list, str, str2, str3, str5, shareData2, favoriteEntity2, map2);
    }

    public final List<BreadCrumb> component1() {
        return this.breadCrumbs;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTotalFound() {
        return this.totalFound;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSearchOriginalText() {
        return this.searchOriginalText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component6, reason: from getter */
    public final ShareData getShareData() {
        return this.shareData;
    }

    /* renamed from: component7, reason: from getter */
    public final FavoriteEntity getFavoriteEntityButton() {
        return this.favoriteEntityButton;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final SearchResultHeaderDTO copy(List<BreadCrumb> breadCrumbs, String header, String totalFound, String searchOriginalText, String deeplink, ShareData shareData, FavoriteEntity favoriteEntityButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new SearchResultHeaderDTO(breadCrumbs, header, totalFound, searchOriginalText, deeplink, shareData, favoriteEntityButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultHeaderDTO)) {
            return false;
        }
        SearchResultHeaderDTO searchResultHeaderDTO = (SearchResultHeaderDTO) other;
        return Intrinsics.d(this.breadCrumbs, searchResultHeaderDTO.breadCrumbs) && Intrinsics.d(this.header, searchResultHeaderDTO.header) && Intrinsics.d(this.totalFound, searchResultHeaderDTO.totalFound) && Intrinsics.d(this.searchOriginalText, searchResultHeaderDTO.searchOriginalText) && Intrinsics.d(this.deeplink, searchResultHeaderDTO.deeplink) && Intrinsics.d(this.shareData, searchResultHeaderDTO.shareData) && Intrinsics.d(this.favoriteEntityButton, searchResultHeaderDTO.favoriteEntityButton) && Intrinsics.d(this.trackingInfo, searchResultHeaderDTO.trackingInfo);
    }

    public final List<BreadCrumb> getBreadCrumbs() {
        return this.breadCrumbs;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final FavoriteEntity getFavoriteEntityButton() {
        return this.favoriteEntityButton;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getSearchOriginalText() {
        return this.searchOriginalText;
    }

    public final ShareData getShareData() {
        return this.shareData;
    }

    public final String getTotalFound() {
        return this.totalFound;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        List<BreadCrumb> list = this.breadCrumbs;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.header;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.totalFound;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.searchOriginalText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deeplink;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ShareData shareData = this.shareData;
        int hashCode6 = (hashCode5 + (shareData == null ? 0 : shareData.hashCode())) * 31;
        FavoriteEntity favoriteEntity = this.favoriteEntityButton;
        int hashCode7 = (hashCode6 + (favoriteEntity == null ? 0 : favoriteEntity.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode7 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<BreadCrumb> list = this.breadCrumbs;
        String str = this.header;
        String str2 = this.totalFound;
        String str3 = this.searchOriginalText;
        String str4 = this.deeplink;
        ShareData shareData = this.shareData;
        FavoriteEntity favoriteEntity = this.favoriteEntityButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = C4055a.a("SearchResultHeaderDTO(breadCrumbs=", ", header=", str, ", totalFound=", list);
        a.h(a11, str2, ", searchOriginalText=", str3, ", deeplink=");
        a11.append(str4);
        a11.append(", shareData=");
        a11.append(shareData);
        a11.append(", favoriteEntityButton=");
        a11.append(favoriteEntity);
        a11.append(", trackingInfo=");
        a11.append(map);
        a11.append(")");
        return a11.toString();
    }
}
