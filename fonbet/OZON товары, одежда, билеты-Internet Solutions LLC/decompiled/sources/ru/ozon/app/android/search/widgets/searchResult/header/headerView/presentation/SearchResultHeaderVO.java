package ru.ozon.app.android.search.widgets.searchResult.header.headerView.presentation;

import Ak.C2436a;
import Nh.a;
import WZ.t;
import android.net.Uri;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002By\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0098\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b*\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b,\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b1\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b2\u0010\u0019R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "categoryTitle", "Landroid/net/Uri;", "categoryDeeplink", CommentV3DTO.HEADER_FIELD_NAME, "totalFound", "searchOriginalText", "searchOriginalDeepLink", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "favoriteEntityButton", "shareText", "shareLink", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;Ljava/lang/String;Ljava/lang/String;LWZ/t;)V", "copy", "(JLjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;Ljava/lang/String;Ljava/lang/String;LWZ/t;)Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getCategoryTitle", "Landroid/net/Uri;", "getCategoryDeeplink", "()Landroid/net/Uri;", "getHeader", "getTotalFound", "getSearchOriginalText", "getSearchOriginalDeepLink", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "getFavoriteEntityButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "getShareText", "getShareLink", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchResultHeaderVO implements c {
    private final Uri categoryDeeplink;
    private final String categoryTitle;
    private final FavoriteEntity favoriteEntityButton;
    private final String header;
    private final long id;
    private final String searchOriginalDeepLink;
    private final String searchOriginalText;
    private final String shareLink;
    private final String shareText;
    private final t tokenizedEvent;
    private final String totalFound;

    public SearchResultHeaderVO(long j11, String str, Uri uri, String str2, String str3, String str4, String str5, FavoriteEntity favoriteEntity, String str6, String str7, t tVar) {
        this.id = j11;
        this.categoryTitle = str;
        this.categoryDeeplink = uri;
        this.header = str2;
        this.totalFound = str3;
        this.searchOriginalText = str4;
        this.searchOriginalDeepLink = str5;
        this.favoriteEntityButton = favoriteEntity;
        this.shareText = str6;
        this.shareLink = str7;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ SearchResultHeaderVO copy$default(SearchResultHeaderVO searchResultHeaderVO, long j11, String str, Uri uri, String str2, String str3, String str4, String str5, FavoriteEntity favoriteEntity, String str6, String str7, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = searchResultHeaderVO.id;
        }
        return searchResultHeaderVO.copy(j11, (i11 & 2) != 0 ? searchResultHeaderVO.categoryTitle : str, (i11 & 4) != 0 ? searchResultHeaderVO.categoryDeeplink : uri, (i11 & 8) != 0 ? searchResultHeaderVO.header : str2, (i11 & 16) != 0 ? searchResultHeaderVO.totalFound : str3, (i11 & 32) != 0 ? searchResultHeaderVO.searchOriginalText : str4, (i11 & 64) != 0 ? searchResultHeaderVO.searchOriginalDeepLink : str5, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? searchResultHeaderVO.favoriteEntityButton : favoriteEntity, (i11 & 256) != 0 ? searchResultHeaderVO.shareText : str6, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? searchResultHeaderVO.shareLink : str7, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? searchResultHeaderVO.tokenizedEvent : tVar);
    }

    @NotNull
    public final SearchResultHeaderVO copy(long id2, String categoryTitle, Uri categoryDeeplink, String header, String totalFound, String searchOriginalText, String searchOriginalDeepLink, FavoriteEntity favoriteEntityButton, String shareText, String shareLink, t tokenizedEvent) {
        return new SearchResultHeaderVO(id2, categoryTitle, categoryDeeplink, header, totalFound, searchOriginalText, searchOriginalDeepLink, favoriteEntityButton, shareText, shareLink, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultHeaderVO)) {
            return false;
        }
        SearchResultHeaderVO searchResultHeaderVO = (SearchResultHeaderVO) other;
        return this.id == searchResultHeaderVO.id && Intrinsics.d(this.categoryTitle, searchResultHeaderVO.categoryTitle) && Intrinsics.d(this.categoryDeeplink, searchResultHeaderVO.categoryDeeplink) && Intrinsics.d(this.header, searchResultHeaderVO.header) && Intrinsics.d(this.totalFound, searchResultHeaderVO.totalFound) && Intrinsics.d(this.searchOriginalText, searchResultHeaderVO.searchOriginalText) && Intrinsics.d(this.searchOriginalDeepLink, searchResultHeaderVO.searchOriginalDeepLink) && Intrinsics.d(this.favoriteEntityButton, searchResultHeaderVO.favoriteEntityButton) && Intrinsics.d(this.shareText, searchResultHeaderVO.shareText) && Intrinsics.d(this.shareLink, searchResultHeaderVO.shareLink) && Intrinsics.d(this.tokenizedEvent, searchResultHeaderVO.tokenizedEvent);
    }

    public final Uri getCategoryDeeplink() {
        return this.categoryDeeplink;
    }

    public final String getCategoryTitle() {
        return this.categoryTitle;
    }

    public final FavoriteEntity getFavoriteEntityButton() {
        return this.favoriteEntityButton;
    }

    public final String getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSearchOriginalDeepLink() {
        return this.searchOriginalDeepLink;
    }

    public final String getSearchOriginalText() {
        return this.searchOriginalText;
    }

    public final String getShareLink() {
        return this.shareLink;
    }

    public final String getShareText() {
        return this.shareText;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final String getTotalFound() {
        return this.totalFound;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.categoryTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.categoryDeeplink;
        int hashCode3 = (hashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str2 = this.header;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.totalFound;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.searchOriginalText;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.searchOriginalDeepLink;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        FavoriteEntity favoriteEntity = this.favoriteEntityButton;
        int hashCode8 = (hashCode7 + (favoriteEntity == null ? 0 : favoriteEntity.hashCode())) * 31;
        String str6 = this.shareText;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.shareLink;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode10 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.categoryTitle;
        Uri uri = this.categoryDeeplink;
        String str2 = this.header;
        String str3 = this.totalFound;
        String str4 = this.searchOriginalText;
        String str5 = this.searchOriginalDeepLink;
        FavoriteEntity favoriteEntity = this.favoriteEntityButton;
        String str6 = this.shareText;
        String str7 = this.shareLink;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "SearchResultHeaderVO(id=", ", categoryTitle=", str);
        c11.append(", categoryDeeplink=");
        c11.append(uri);
        c11.append(", header=");
        c11.append(str2);
        a.h(c11, ", totalFound=", str3, ", searchOriginalText=", str4);
        c11.append(", searchOriginalDeepLink=");
        c11.append(str5);
        c11.append(", favoriteEntityButton=");
        c11.append(favoriteEntity);
        a.h(c11, ", shareText=", str6, ", shareLink=", str7);
        return Lh.a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
