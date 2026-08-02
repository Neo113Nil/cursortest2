package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.data;

import G.g;
import K1.G;
import T7.P;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/FullTextSearchHeaderV4DTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/FullTextSearchHeaderV4DTO$HeaderDTO;", "crosslinks", "", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/FullTextSearchHeaderV4DTO$CrosslinkDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/FullTextSearchHeaderV4DTO$HeaderDTO;Ljava/util/List;Ljava/util/Map;)V", "getHeader", "()Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/FullTextSearchHeaderV4DTO$HeaderDTO;", "getCrosslinks", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "HeaderDTO", "CrosslinkDTO", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FullTextSearchHeaderV4DTO {
    public static final int $stable = 8;
    private final List<CrosslinkDTO> crosslinks;
    private final HeaderDTO header;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/FullTextSearchHeaderV4DTO$CrosslinkDTO;", "", "searchIconShown", "", "text", "", "markupType", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/MarkupType;", "deeplink", "link", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ZLjava/lang/String;Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/MarkupType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getSearchIconShown", "()Z", "getText", "()Ljava/lang/String;", "getMarkupType", "()Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/MarkupType;", "getDeeplink", "getLink", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CrosslinkDTO {
        public static final int $stable = 8;

        @NotNull
        private final String deeplink;

        @NotNull
        private final String link;

        @NotNull
        private final MarkupType markupType;
        private final boolean searchIconShown;

        @NotNull
        private final String text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public CrosslinkDTO(boolean z11, @NotNull String text, @NotNull MarkupType markupType, @NotNull String deeplink, @NotNull String link, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(markupType, "markupType");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(link, "link");
            this.searchIconShown = z11;
            this.text = text;
            this.markupType = markupType;
            this.deeplink = deeplink;
            this.link = link;
            this.trackingInfo = map;
        }

        public static /* synthetic */ CrosslinkDTO copy$default(CrosslinkDTO crosslinkDTO, boolean z11, String str, MarkupType markupType, String str2, String str3, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = crosslinkDTO.searchIconShown;
            }
            if ((i11 & 2) != 0) {
                str = crosslinkDTO.text;
            }
            if ((i11 & 4) != 0) {
                markupType = crosslinkDTO.markupType;
            }
            if ((i11 & 8) != 0) {
                str2 = crosslinkDTO.deeplink;
            }
            if ((i11 & 16) != 0) {
                str3 = crosslinkDTO.link;
            }
            if ((i11 & 32) != 0) {
                map = crosslinkDTO.trackingInfo;
            }
            String str4 = str3;
            Map map2 = map;
            return crosslinkDTO.copy(z11, str, markupType, str2, str4, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSearchIconShown() {
            return this.searchIconShown;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final MarkupType getMarkupType() {
            return this.markupType;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final CrosslinkDTO copy(boolean searchIconShown, @NotNull String text, @NotNull MarkupType markupType, @NotNull String deeplink, @NotNull String link, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(markupType, "markupType");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(link, "link");
            return new CrosslinkDTO(searchIconShown, text, markupType, deeplink, link, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CrosslinkDTO)) {
                return false;
            }
            CrosslinkDTO crosslinkDTO = (CrosslinkDTO) other;
            return this.searchIconShown == crosslinkDTO.searchIconShown && Intrinsics.d(this.text, crosslinkDTO.text) && this.markupType == crosslinkDTO.markupType && Intrinsics.d(this.deeplink, crosslinkDTO.deeplink) && Intrinsics.d(this.link, crosslinkDTO.link) && Intrinsics.d(this.trackingInfo, crosslinkDTO.trackingInfo);
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
        public final MarkupType getMarkupType() {
            return this.markupType;
        }

        public final boolean getSearchIconShown() {
            return this.searchIconShown;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(g.a((this.markupType.hashCode() + g.a(Boolean.hashCode(this.searchIconShown) * 31, 31, this.text)) * 31, 31, this.deeplink), 31, this.link);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return a11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            boolean z11 = this.searchIconShown;
            String str = this.text;
            MarkupType markupType = this.markupType;
            String str2 = this.deeplink;
            String str3 = this.link;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = G.d("CrosslinkDTO(searchIconShown=", ", text=", str, ", markupType=", z11);
            d11.append(markupType);
            d11.append(", deeplink=");
            d11.append(str2);
            d11.append(", link=");
            return C4070a.a(d11, str3, ", trackingInfo=", map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/FullTextSearchHeaderV4DTO$HeaderDTO;", "", "markupType", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/MarkupType;", "text", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "style", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/Style;", "<init>", "(Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/MarkupType;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/Style;)V", "getMarkupType", "()Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/MarkupType;", "getText", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getStyle", "()Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/Style;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderDTO {
        public static final int $stable = 8;

        @NotNull
        private final MarkupType markupType;
        private final Style style;
        private final String text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public HeaderDTO(@NotNull MarkupType markupType, String str, Map<String, TokenizedTrackingInfo> map, Style style) {
            Intrinsics.checkNotNullParameter(markupType, "markupType");
            this.markupType = markupType;
            this.text = str;
            this.trackingInfo = map;
            this.style = style;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, MarkupType markupType, String str, Map map, Style style, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                markupType = headerDTO.markupType;
            }
            if ((i11 & 2) != 0) {
                str = headerDTO.text;
            }
            if ((i11 & 4) != 0) {
                map = headerDTO.trackingInfo;
            }
            if ((i11 & 8) != 0) {
                style = headerDTO.style;
            }
            return headerDTO.copy(markupType, str, map, style);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final MarkupType getMarkupType() {
            return this.markupType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        /* renamed from: component4, reason: from getter */
        public final Style getStyle() {
            return this.style;
        }

        @NotNull
        public final HeaderDTO copy(@NotNull MarkupType markupType, String text, Map<String, TokenizedTrackingInfo> trackingInfo, Style style) {
            Intrinsics.checkNotNullParameter(markupType, "markupType");
            return new HeaderDTO(markupType, text, trackingInfo, style);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderDTO)) {
                return false;
            }
            HeaderDTO headerDTO = (HeaderDTO) other;
            return this.markupType == headerDTO.markupType && Intrinsics.d(this.text, headerDTO.text) && Intrinsics.d(this.trackingInfo, headerDTO.trackingInfo) && this.style == headerDTO.style;
        }

        @NotNull
        public final MarkupType getMarkupType() {
            return this.markupType;
        }

        public final Style getStyle() {
            return this.style;
        }

        public final String getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.markupType.hashCode() * 31;
            String str = this.text;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            Style style = this.style;
            return hashCode3 + (style != null ? style.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "HeaderDTO(markupType=" + this.markupType + ", text=" + this.text + ", trackingInfo=" + this.trackingInfo + ", style=" + this.style + ")";
        }
    }

    public FullTextSearchHeaderV4DTO(HeaderDTO headerDTO, List<CrosslinkDTO> list, Map<String, TokenizedTrackingInfo> map) {
        this.header = headerDTO;
        this.crosslinks = list;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FullTextSearchHeaderV4DTO copy$default(FullTextSearchHeaderV4DTO fullTextSearchHeaderV4DTO, HeaderDTO headerDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            headerDTO = fullTextSearchHeaderV4DTO.header;
        }
        if ((i11 & 2) != 0) {
            list = fullTextSearchHeaderV4DTO.crosslinks;
        }
        if ((i11 & 4) != 0) {
            map = fullTextSearchHeaderV4DTO.trackingInfo;
        }
        return fullTextSearchHeaderV4DTO.copy(headerDTO, list, map);
    }

    /* renamed from: component1, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    public final List<CrosslinkDTO> component2() {
        return this.crosslinks;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final FullTextSearchHeaderV4DTO copy(HeaderDTO header, List<CrosslinkDTO> crosslinks, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new FullTextSearchHeaderV4DTO(header, crosslinks, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullTextSearchHeaderV4DTO)) {
            return false;
        }
        FullTextSearchHeaderV4DTO fullTextSearchHeaderV4DTO = (FullTextSearchHeaderV4DTO) other;
        return Intrinsics.d(this.header, fullTextSearchHeaderV4DTO.header) && Intrinsics.d(this.crosslinks, fullTextSearchHeaderV4DTO.crosslinks) && Intrinsics.d(this.trackingInfo, fullTextSearchHeaderV4DTO.trackingInfo);
    }

    public final List<CrosslinkDTO> getCrosslinks() {
        return this.crosslinks;
    }

    public final HeaderDTO getHeader() {
        return this.header;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        HeaderDTO headerDTO = this.header;
        int hashCode = (headerDTO == null ? 0 : headerDTO.hashCode()) * 31;
        List<CrosslinkDTO> list = this.crosslinks;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        HeaderDTO headerDTO = this.header;
        List<CrosslinkDTO> list = this.crosslinks;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("FullTextSearchHeaderV4DTO(header=");
        sb2.append(headerDTO);
        sb2.append(", crosslinks=");
        sb2.append(list);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
