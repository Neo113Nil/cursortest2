package ru.ozon.app.android.search.widgets.suggestions.data;

import Ak.C2436a;
import C.o0;
import G.g;
import K1.G;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.cellList.v2.data.CellListV2DTO;
import ru.ozon.app.android.common.serviceCarousel.data.ServiceCarouselDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.TitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u0014\u0015\u0016\u0017B'\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J+\u0010\r\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO;", "", "blocks", "", "prefetchLinks", "", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getBlocks", "()Ljava/util/List;", "getPrefetchLinks", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SuggestionsList", "SuggestionsCarousel", "SuggestionWithFilter", "SuggestionFilterItems", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SuggestionsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Object> blocks;
    private final List<String> prefetchLinks;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO$SuggestionWithFilter;", "", "suggestion", "Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;", "filter", "Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO$SuggestionFilterItems;", "islandColor", "", "<init>", "(Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO$SuggestionFilterItems;Ljava/lang/String;)V", "getSuggestion", "()Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;", "getFilter", "()Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO$SuggestionFilterItems;", "getIslandColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuggestionWithFilter {
        public static final int $stable = 8;

        @NotNull
        private final SuggestionFilterItems filter;
        private final String islandColor;

        @NotNull
        private final TitleSubtitleCellDTO suggestion;

        public SuggestionWithFilter(@NotNull TitleSubtitleCellDTO suggestion, @NotNull SuggestionFilterItems filter, String str) {
            Intrinsics.checkNotNullParameter(suggestion, "suggestion");
            Intrinsics.checkNotNullParameter(filter, "filter");
            this.suggestion = suggestion;
            this.filter = filter;
            this.islandColor = str;
        }

        public static /* synthetic */ SuggestionWithFilter copy$default(SuggestionWithFilter suggestionWithFilter, TitleSubtitleCellDTO titleSubtitleCellDTO, SuggestionFilterItems suggestionFilterItems, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                titleSubtitleCellDTO = suggestionWithFilter.suggestion;
            }
            if ((i11 & 2) != 0) {
                suggestionFilterItems = suggestionWithFilter.filter;
            }
            if ((i11 & 4) != 0) {
                str = suggestionWithFilter.islandColor;
            }
            return suggestionWithFilter.copy(titleSubtitleCellDTO, suggestionFilterItems, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TitleSubtitleCellDTO getSuggestion() {
            return this.suggestion;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final SuggestionFilterItems getFilter() {
            return this.filter;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIslandColor() {
            return this.islandColor;
        }

        @NotNull
        public final SuggestionWithFilter copy(@NotNull TitleSubtitleCellDTO suggestion, @NotNull SuggestionFilterItems filter, String islandColor) {
            Intrinsics.checkNotNullParameter(suggestion, "suggestion");
            Intrinsics.checkNotNullParameter(filter, "filter");
            return new SuggestionWithFilter(suggestion, filter, islandColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuggestionWithFilter)) {
                return false;
            }
            SuggestionWithFilter suggestionWithFilter = (SuggestionWithFilter) other;
            return Intrinsics.d(this.suggestion, suggestionWithFilter.suggestion) && Intrinsics.d(this.filter, suggestionWithFilter.filter) && Intrinsics.d(this.islandColor, suggestionWithFilter.islandColor);
        }

        @NotNull
        public final SuggestionFilterItems getFilter() {
            return this.filter;
        }

        public final String getIslandColor() {
            return this.islandColor;
        }

        @NotNull
        public final TitleSubtitleCellDTO getSuggestion() {
            return this.suggestion;
        }

        public int hashCode() {
            int hashCode = (this.filter.hashCode() + (this.suggestion.hashCode() * 31)) * 31;
            String str = this.islandColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            TitleSubtitleCellDTO titleSubtitleCellDTO = this.suggestion;
            SuggestionFilterItems suggestionFilterItems = this.filter;
            String str = this.islandColor;
            StringBuilder sb2 = new StringBuilder("SuggestionWithFilter(suggestion=");
            sb2.append(titleSubtitleCellDTO);
            sb2.append(", filter=");
            sb2.append(suggestionFilterItems);
            sb2.append(", islandColor=");
            return o0.c(sb2, str, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO$SuggestionsCarousel;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "body", "Lru/ozon/app/android/common/serviceCarousel/data/ServiceCarouselDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/common/serviceCarousel/data/ServiceCarouselDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBody", "()Lru/ozon/app/android/common/serviceCarousel/data/ServiceCarouselDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuggestionsCarousel {
        public static final int $stable = 8;

        @NotNull
        private final ServiceCarouselDTO body;
        private final TextDTO title;

        public SuggestionsCarousel(TextDTO textDTO, @NotNull ServiceCarouselDTO body) {
            Intrinsics.checkNotNullParameter(body, "body");
            this.title = textDTO;
            this.body = body;
        }

        public static /* synthetic */ SuggestionsCarousel copy$default(SuggestionsCarousel suggestionsCarousel, TextDTO textDTO, ServiceCarouselDTO serviceCarouselDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = suggestionsCarousel.title;
            }
            if ((i11 & 2) != 0) {
                serviceCarouselDTO = suggestionsCarousel.body;
            }
            return suggestionsCarousel.copy(textDTO, serviceCarouselDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ServiceCarouselDTO getBody() {
            return this.body;
        }

        @NotNull
        public final SuggestionsCarousel copy(TextDTO title, @NotNull ServiceCarouselDTO body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return new SuggestionsCarousel(title, body);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuggestionsCarousel)) {
                return false;
            }
            SuggestionsCarousel suggestionsCarousel = (SuggestionsCarousel) other;
            return Intrinsics.d(this.title, suggestionsCarousel.title) && Intrinsics.d(this.body, suggestionsCarousel.body);
        }

        @NotNull
        public final ServiceCarouselDTO getBody() {
            return this.body;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            return this.body.hashCode() + ((textDTO == null ? 0 : textDTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "SuggestionsCarousel(title=" + this.title + ", body=" + this.body + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO$SuggestionsList;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "body", "Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBody", "()Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuggestionsList {
        public static final int $stable = 8;

        @NotNull
        private final CellListV2DTO body;
        private final TextDTO title;

        public SuggestionsList(TextDTO textDTO, @NotNull CellListV2DTO body) {
            Intrinsics.checkNotNullParameter(body, "body");
            this.title = textDTO;
            this.body = body;
        }

        public static /* synthetic */ SuggestionsList copy$default(SuggestionsList suggestionsList, TextDTO textDTO, CellListV2DTO cellListV2DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = suggestionsList.title;
            }
            if ((i11 & 2) != 0) {
                cellListV2DTO = suggestionsList.body;
            }
            return suggestionsList.copy(textDTO, cellListV2DTO);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CellListV2DTO getBody() {
            return this.body;
        }

        @NotNull
        public final SuggestionsList copy(TextDTO title, @NotNull CellListV2DTO body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return new SuggestionsList(title, body);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuggestionsList)) {
                return false;
            }
            SuggestionsList suggestionsList = (SuggestionsList) other;
            return Intrinsics.d(this.title, suggestionsList.title) && Intrinsics.d(this.body, suggestionsList.body);
        }

        @NotNull
        public final CellListV2DTO getBody() {
            return this.body;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            return this.body.hashCode() + ((textDTO == null ? 0 : textDTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "SuggestionsList(title=" + this.title + ", body=" + this.body + ")";
        }
    }

    public SuggestionsDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "islandSeparatorBlock", type = IslandSeparatorDTO.class), @ProtoOneOfSignature(name = "separatorBlock", type = SeparatorDTO.class), @ProtoOneOfSignature(name = "suggestionsListBlock", type = SuggestionsList.class), @ProtoOneOfSignature(name = "suggestionsCarouselBlock", type = SuggestionsCarousel.class), @ProtoOneOfSignature(name = "suggestionWithFilterBlock", type = SuggestionWithFilter.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> blocks, List<String> list) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.blocks = blocks;
        this.prefetchLinks = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuggestionsDTO copy$default(SuggestionsDTO suggestionsDTO, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = suggestionsDTO.blocks;
        }
        if ((i11 & 2) != 0) {
            list2 = suggestionsDTO.prefetchLinks;
        }
        return suggestionsDTO.copy(list, list2);
    }

    @NotNull
    public final List<Object> component1() {
        return this.blocks;
    }

    public final List<String> component2() {
        return this.prefetchLinks;
    }

    @NotNull
    public final SuggestionsDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "islandSeparatorBlock", type = IslandSeparatorDTO.class), @ProtoOneOfSignature(name = "separatorBlock", type = SeparatorDTO.class), @ProtoOneOfSignature(name = "suggestionsListBlock", type = SuggestionsList.class), @ProtoOneOfSignature(name = "suggestionsCarouselBlock", type = SuggestionsCarousel.class), @ProtoOneOfSignature(name = "suggestionWithFilterBlock", type = SuggestionWithFilter.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> blocks, List<String> prefetchLinks) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        return new SuggestionsDTO(blocks, prefetchLinks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestionsDTO)) {
            return false;
        }
        SuggestionsDTO suggestionsDTO = (SuggestionsDTO) other;
        return Intrinsics.d(this.blocks, suggestionsDTO.blocks) && Intrinsics.d(this.prefetchLinks, suggestionsDTO.prefetchLinks);
    }

    @NotNull
    public final List<Object> getBlocks() {
        return this.blocks;
    }

    public final List<String> getPrefetchLinks() {
        return this.prefetchLinks;
    }

    public int hashCode() {
        int hashCode = this.blocks.hashCode() * 31;
        List<String> list = this.prefetchLinks;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return C2436a.b("SuggestionsDTO(blocks=", this.blocks, ", prefetchLinks=", ")", this.prefetchLinks);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO$SuggestionFilterItems;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "values", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getValues", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuggestionFilterItems {
        public static final int $stable = 8;
        private final TestInfo testInfo;
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final List<BadgeDTO> values;

        public SuggestionFilterItems(TextDTO textDTO, @NotNull List<BadgeDTO> values, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(values, "values");
            this.title = textDTO;
            this.values = values;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SuggestionFilterItems copy$default(SuggestionFilterItems suggestionFilterItems, TextDTO textDTO, List list, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = suggestionFilterItems.title;
            }
            if ((i11 & 2) != 0) {
                list = suggestionFilterItems.values;
            }
            if ((i11 & 4) != 0) {
                map = suggestionFilterItems.trackingInfo;
            }
            if ((i11 & 8) != 0) {
                testInfo = suggestionFilterItems.testInfo;
            }
            return suggestionFilterItems.copy(textDTO, list, map, testInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final List<BadgeDTO> component2() {
            return this.values;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final SuggestionFilterItems copy(TextDTO title, @NotNull List<BadgeDTO> values, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(values, "values");
            return new SuggestionFilterItems(title, values, trackingInfo, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuggestionFilterItems)) {
                return false;
            }
            SuggestionFilterItems suggestionFilterItems = (SuggestionFilterItems) other;
            return Intrinsics.d(this.title, suggestionFilterItems.title) && Intrinsics.d(this.values, suggestionFilterItems.values) && Intrinsics.d(this.trackingInfo, suggestionFilterItems.trackingInfo) && Intrinsics.d(this.testInfo, suggestionFilterItems.testInfo);
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final List<BadgeDTO> getValues() {
            return this.values;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int b11 = g.b((textDTO == null ? 0 : textDTO.hashCode()) * 31, 31, this.values);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode = (b11 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            List<BadgeDTO> list = this.values;
            return b.b(", testInfo=", ")", G.e("SuggestionFilterItems(title=", textDTO, ", values=", list, ", trackingInfo="), this.trackingInfo, this.testInfo);
        }

        public /* synthetic */ SuggestionFilterItems(TextDTO textDTO, List list, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, list, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? null : testInfo);
        }
    }
}
