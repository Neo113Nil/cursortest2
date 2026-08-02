package ru.ozon.app.android.search.widgets.tapTags.v3.core;

import G.g;
import Nh.a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002!\"B3\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JB\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3DTO;", "", "items", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "maxRows", "", "searchText", "", "suggestedPage", "Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3DTO$SuggestedPage;", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3DTO$SuggestedPage;)V", "getItems", "()Ljava/util/List;", "getMaxRows", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSearchText", "()Ljava/lang/String;", "getSuggestedPage", "()Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3DTO$SuggestedPage;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3DTO$SuggestedPage;)Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3DTO;", "equals", "", "other", "hashCode", "toString", "Companion", "SuggestedPage", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TapTagsV3DTO {
    private final List<TagButtonDTO> items;
    private final Integer maxRows;

    @NotNull
    private final String searchText;
    private final SuggestedPage suggestedPage;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3DTO$Companion;", "", "<init>", "()V", "createEmptyDTO", "Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3DTO;", "suggestedPage", "Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3DTO$SuggestedPage;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ TapTagsV3DTO createEmptyDTO$default(Companion companion, SuggestedPage suggestedPage, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                suggestedPage = null;
            }
            return companion.createEmptyDTO(suggestedPage);
        }

        @NotNull
        public final TapTagsV3DTO createEmptyDTO(SuggestedPage suggestedPage) {
            return new TapTagsV3DTO(K.f71697a, null, "", suggestedPage);
        }

        private Companion() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3DTO$SuggestedPage;", "", "refreshLink", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getRefreshLink", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuggestedPage {
        public static final int $stable = 8;

        @NotNull
        private final String refreshLink;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public SuggestedPage(@NotNull String refreshLink, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(refreshLink, "refreshLink");
            this.refreshLink = refreshLink;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SuggestedPage copy$default(SuggestedPage suggestedPage, String str, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = suggestedPage.refreshLink;
            }
            if ((i11 & 2) != 0) {
                map = suggestedPage.trackingInfo;
            }
            return suggestedPage.copy(str, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getRefreshLink() {
            return this.refreshLink;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.trackingInfo;
        }

        @NotNull
        public final SuggestedPage copy(@NotNull String refreshLink, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(refreshLink, "refreshLink");
            return new SuggestedPage(refreshLink, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuggestedPage)) {
                return false;
            }
            SuggestedPage suggestedPage = (SuggestedPage) other;
            return Intrinsics.d(this.refreshLink, suggestedPage.refreshLink) && Intrinsics.d(this.trackingInfo, suggestedPage.trackingInfo);
        }

        @NotNull
        public final String getRefreshLink() {
            return this.refreshLink;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.refreshLink.hashCode() * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            return a.d("SuggestedPage(refreshLink=", this.refreshLink, ", trackingInfo=", ")", this.trackingInfo);
        }
    }

    public TapTagsV3DTO(List<TagButtonDTO> list, Integer num, @NotNull String searchText, SuggestedPage suggestedPage) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        this.items = list;
        this.maxRows = num;
        this.searchText = searchText;
        this.suggestedPage = suggestedPage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TapTagsV3DTO copy$default(TapTagsV3DTO tapTagsV3DTO, List list, Integer num, String str, SuggestedPage suggestedPage, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tapTagsV3DTO.items;
        }
        if ((i11 & 2) != 0) {
            num = tapTagsV3DTO.maxRows;
        }
        if ((i11 & 4) != 0) {
            str = tapTagsV3DTO.searchText;
        }
        if ((i11 & 8) != 0) {
            suggestedPage = tapTagsV3DTO.suggestedPage;
        }
        return tapTagsV3DTO.copy(list, num, str, suggestedPage);
    }

    public final List<TagButtonDTO> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getMaxRows() {
        return this.maxRows;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSearchText() {
        return this.searchText;
    }

    /* renamed from: component4, reason: from getter */
    public final SuggestedPage getSuggestedPage() {
        return this.suggestedPage;
    }

    @NotNull
    public final TapTagsV3DTO copy(List<TagButtonDTO> items, Integer maxRows, @NotNull String searchText, SuggestedPage suggestedPage) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        return new TapTagsV3DTO(items, maxRows, searchText, suggestedPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapTagsV3DTO)) {
            return false;
        }
        TapTagsV3DTO tapTagsV3DTO = (TapTagsV3DTO) other;
        return Intrinsics.d(this.items, tapTagsV3DTO.items) && Intrinsics.d(this.maxRows, tapTagsV3DTO.maxRows) && Intrinsics.d(this.searchText, tapTagsV3DTO.searchText) && Intrinsics.d(this.suggestedPage, tapTagsV3DTO.suggestedPage);
    }

    public final List<TagButtonDTO> getItems() {
        return this.items;
    }

    public final Integer getMaxRows() {
        return this.maxRows;
    }

    @NotNull
    public final String getSearchText() {
        return this.searchText;
    }

    public final SuggestedPage getSuggestedPage() {
        return this.suggestedPage;
    }

    public int hashCode() {
        List<TagButtonDTO> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.maxRows;
        int a11 = g.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.searchText);
        SuggestedPage suggestedPage = this.suggestedPage;
        return a11 + (suggestedPage != null ? suggestedPage.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TapTagsV3DTO(items=" + this.items + ", maxRows=" + this.maxRows + ", searchText=" + this.searchText + ", suggestedPage=" + this.suggestedPage + ")";
    }
}
