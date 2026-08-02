package ru.ozon.app.android.fresh.unsorted.widgets.searchBar.data;

import G.g;
import HY.b;
import N3.C3660k;
import Nh.a;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0080\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/data/SearchBarDTO;", "", HammersV3BodyDTO.PLACEHOLDER, "", "placeholderColor", "isCellable", "", "text", "textColor", "backgroundTintColor", "link", "deeplink", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getPlaceholder", "()Ljava/lang/String;", "getPlaceholderColor", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getText", "getTextColor", "getBackgroundTintColor", "getLink", "getDeeplink", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/data/SearchBarDTO;", "equals", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchBarDTO {
    public static final int $stable = 8;
    private final String backgroundTintColor;

    @NotNull
    private final String deeplink;
    private final Boolean isCellable;

    @NotNull
    private final String link;

    @NotNull
    private final String placeholder;
    private final String placeholderColor;
    private final String text;
    private final String textColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public SearchBarDTO(@NotNull String placeholder, String str, Boolean bool, String str2, String str3, String str4, @NotNull String link, @NotNull String deeplink, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.placeholder = placeholder;
        this.placeholderColor = str;
        this.isCellable = bool;
        this.text = str2;
        this.textColor = str3;
        this.backgroundTintColor = str4;
        this.link = link;
        this.deeplink = deeplink;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SearchBarDTO copy$default(SearchBarDTO searchBarDTO, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchBarDTO.placeholder;
        }
        if ((i11 & 2) != 0) {
            str2 = searchBarDTO.placeholderColor;
        }
        if ((i11 & 4) != 0) {
            bool = searchBarDTO.isCellable;
        }
        if ((i11 & 8) != 0) {
            str3 = searchBarDTO.text;
        }
        if ((i11 & 16) != 0) {
            str4 = searchBarDTO.textColor;
        }
        if ((i11 & 32) != 0) {
            str5 = searchBarDTO.backgroundTintColor;
        }
        if ((i11 & 64) != 0) {
            str6 = searchBarDTO.link;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str7 = searchBarDTO.deeplink;
        }
        if ((i11 & 256) != 0) {
            map = searchBarDTO.trackingInfo;
        }
        String str8 = str7;
        Map map2 = map;
        String str9 = str5;
        String str10 = str6;
        String str11 = str4;
        Boolean bool2 = bool;
        return searchBarDTO.copy(str, str2, bool2, str3, str11, str9, str10, str8, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlaceholderColor() {
        return this.placeholderColor;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsCellable() {
        return this.isCellable;
    }

    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundTintColor() {
        return this.backgroundTintColor;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final SearchBarDTO copy(@NotNull String placeholder, String placeholderColor, Boolean isCellable, String text, String textColor, String backgroundTintColor, @NotNull String link, @NotNull String deeplink, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new SearchBarDTO(placeholder, placeholderColor, isCellable, text, textColor, backgroundTintColor, link, deeplink, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchBarDTO)) {
            return false;
        }
        SearchBarDTO searchBarDTO = (SearchBarDTO) other;
        return Intrinsics.d(this.placeholder, searchBarDTO.placeholder) && Intrinsics.d(this.placeholderColor, searchBarDTO.placeholderColor) && Intrinsics.d(this.isCellable, searchBarDTO.isCellable) && Intrinsics.d(this.text, searchBarDTO.text) && Intrinsics.d(this.textColor, searchBarDTO.textColor) && Intrinsics.d(this.backgroundTintColor, searchBarDTO.backgroundTintColor) && Intrinsics.d(this.link, searchBarDTO.link) && Intrinsics.d(this.deeplink, searchBarDTO.deeplink) && Intrinsics.d(this.trackingInfo, searchBarDTO.trackingInfo);
    }

    public final String getBackgroundTintColor() {
        return this.backgroundTintColor;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getPlaceholderColor() {
        return this.placeholderColor;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.placeholder.hashCode() * 31;
        String str = this.placeholderColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isCellable;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.text;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textColor;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backgroundTintColor;
        int a11 = g.a(g.a((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.link), 31, this.deeplink);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    public final Boolean isCellable() {
        return this.isCellable;
    }

    @NotNull
    public String toString() {
        String str = this.placeholder;
        String str2 = this.placeholderColor;
        Boolean bool = this.isCellable;
        String str3 = this.text;
        String str4 = this.textColor;
        String str5 = this.backgroundTintColor;
        String str6 = this.link;
        String str7 = this.deeplink;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("SearchBarDTO(placeholder=", str, ", placeholderColor=", str2, ", isCellable=");
        b.c(bool, ", text=", str3, ", textColor=", d11);
        a.h(d11, str4, ", backgroundTintColor=", str5, ", link=");
        a.h(d11, str6, ", deeplink=", str7, ", trackingInfo=");
        return P.f(d11, map, ")");
    }

    public /* synthetic */ SearchBarDTO(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bool, str3, str4, str5, str6, str7, (i11 & 256) != 0 ? null : map);
    }
}
