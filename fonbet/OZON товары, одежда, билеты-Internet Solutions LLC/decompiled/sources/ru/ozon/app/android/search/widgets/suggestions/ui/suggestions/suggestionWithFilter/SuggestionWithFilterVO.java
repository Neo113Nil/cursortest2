package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter;

import G.g;
import K1.G;
import WZ.t;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.TitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001$B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010\u0010¨\u0006%"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;", "suggestion", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO$SuggestionFilterItemsVO;", "filterItems", "", "backgroundColor", "<init>", "(JLru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO$SuggestionFilterItemsVO;Ljava/lang/String;)V", "copy", "(JLru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO$SuggestionFilterItemsVO;Ljava/lang/String;)Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;", "getSuggestion", "()Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO$SuggestionFilterItemsVO;", "getFilterItems", "()Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO$SuggestionFilterItemsVO;", "Ljava/lang/String;", "getBackgroundColor", "SuggestionFilterItemsVO", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SuggestionWithFilterVO implements c {
    private final String backgroundColor;

    @NotNull
    private final SuggestionFilterItemsVO filterItems;
    private final long id;

    @NotNull
    private final TitleSubtitleCellDTO suggestion;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJV\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO$SuggestionFilterItemsVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "filterName", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "values", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Landroid/os/Parcelable;", "layoutManagerState", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;Landroid/os/Parcelable;)V", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;Landroid/os/Parcelable;)Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO$SuggestionFilterItemsVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getFilterName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuggestionFilterItemsVO {
        private final TextDTO filterName;
        private final Parcelable layoutManagerState;
        private final TestInfo testInfo;
        private final t tokenizedEvent;

        @NotNull
        private final List<BadgeDTO> values;

        public SuggestionFilterItemsVO(TextDTO textDTO, @NotNull List<BadgeDTO> values, t tVar, TestInfo testInfo, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(values, "values");
            this.filterName = textDTO;
            this.values = values;
            this.tokenizedEvent = tVar;
            this.testInfo = testInfo;
            this.layoutManagerState = parcelable;
        }

        public static /* synthetic */ SuggestionFilterItemsVO copy$default(SuggestionFilterItemsVO suggestionFilterItemsVO, TextDTO textDTO, List list, t tVar, TestInfo testInfo, Parcelable parcelable, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = suggestionFilterItemsVO.filterName;
            }
            if ((i11 & 2) != 0) {
                list = suggestionFilterItemsVO.values;
            }
            if ((i11 & 4) != 0) {
                tVar = suggestionFilterItemsVO.tokenizedEvent;
            }
            if ((i11 & 8) != 0) {
                testInfo = suggestionFilterItemsVO.testInfo;
            }
            if ((i11 & 16) != 0) {
                parcelable = suggestionFilterItemsVO.layoutManagerState;
            }
            Parcelable parcelable2 = parcelable;
            t tVar2 = tVar;
            return suggestionFilterItemsVO.copy(textDTO, list, tVar2, testInfo, parcelable2);
        }

        @NotNull
        public final SuggestionFilterItemsVO copy(TextDTO filterName, @NotNull List<BadgeDTO> values, t tokenizedEvent, TestInfo testInfo, Parcelable layoutManagerState) {
            Intrinsics.checkNotNullParameter(values, "values");
            return new SuggestionFilterItemsVO(filterName, values, tokenizedEvent, testInfo, layoutManagerState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuggestionFilterItemsVO)) {
                return false;
            }
            SuggestionFilterItemsVO suggestionFilterItemsVO = (SuggestionFilterItemsVO) other;
            return Intrinsics.d(this.filterName, suggestionFilterItemsVO.filterName) && Intrinsics.d(this.values, suggestionFilterItemsVO.values) && Intrinsics.d(this.tokenizedEvent, suggestionFilterItemsVO.tokenizedEvent) && Intrinsics.d(this.testInfo, suggestionFilterItemsVO.testInfo) && Intrinsics.d(this.layoutManagerState, suggestionFilterItemsVO.layoutManagerState);
        }

        public final TextDTO getFilterName() {
            return this.filterName;
        }

        public final Parcelable getLayoutManagerState() {
            return this.layoutManagerState;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        @NotNull
        public final List<BadgeDTO> getValues() {
            return this.values;
        }

        public int hashCode() {
            TextDTO textDTO = this.filterName;
            int b11 = g.b((textDTO == null ? 0 : textDTO.hashCode()) * 31, 31, this.values);
            t tVar = this.tokenizedEvent;
            int hashCode = (b11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode2 = (hashCode + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Parcelable parcelable = this.layoutManagerState;
            return hashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.filterName;
            List<BadgeDTO> list = this.values;
            t tVar = this.tokenizedEvent;
            TestInfo testInfo = this.testInfo;
            Parcelable parcelable = this.layoutManagerState;
            StringBuilder e11 = G.e("SuggestionFilterItemsVO(filterName=", textDTO, ", values=", list, ", tokenizedEvent=");
            e11.append(tVar);
            e11.append(", testInfo=");
            e11.append(testInfo);
            e11.append(", layoutManagerState=");
            e11.append(parcelable);
            e11.append(")");
            return e11.toString();
        }
    }

    public SuggestionWithFilterVO(long j11, @NotNull TitleSubtitleCellDTO suggestion, @NotNull SuggestionFilterItemsVO filterItems, String str) {
        Intrinsics.checkNotNullParameter(suggestion, "suggestion");
        Intrinsics.checkNotNullParameter(filterItems, "filterItems");
        this.id = j11;
        this.suggestion = suggestion;
        this.filterItems = filterItems;
        this.backgroundColor = str;
    }

    public static /* synthetic */ SuggestionWithFilterVO copy$default(SuggestionWithFilterVO suggestionWithFilterVO, long j11, TitleSubtitleCellDTO titleSubtitleCellDTO, SuggestionFilterItemsVO suggestionFilterItemsVO, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = suggestionWithFilterVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            titleSubtitleCellDTO = suggestionWithFilterVO.suggestion;
        }
        TitleSubtitleCellDTO titleSubtitleCellDTO2 = titleSubtitleCellDTO;
        if ((i11 & 4) != 0) {
            suggestionFilterItemsVO = suggestionWithFilterVO.filterItems;
        }
        SuggestionFilterItemsVO suggestionFilterItemsVO2 = suggestionFilterItemsVO;
        if ((i11 & 8) != 0) {
            str = suggestionWithFilterVO.backgroundColor;
        }
        return suggestionWithFilterVO.copy(j12, titleSubtitleCellDTO2, suggestionFilterItemsVO2, str);
    }

    @NotNull
    public final SuggestionWithFilterVO copy(long id2, @NotNull TitleSubtitleCellDTO suggestion, @NotNull SuggestionFilterItemsVO filterItems, String backgroundColor) {
        Intrinsics.checkNotNullParameter(suggestion, "suggestion");
        Intrinsics.checkNotNullParameter(filterItems, "filterItems");
        return new SuggestionWithFilterVO(id2, suggestion, filterItems, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestionWithFilterVO)) {
            return false;
        }
        SuggestionWithFilterVO suggestionWithFilterVO = (SuggestionWithFilterVO) other;
        return this.id == suggestionWithFilterVO.id && Intrinsics.d(this.suggestion, suggestionWithFilterVO.suggestion) && Intrinsics.d(this.filterItems, suggestionWithFilterVO.filterItems) && Intrinsics.d(this.backgroundColor, suggestionWithFilterVO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final SuggestionFilterItemsVO getFilterItems() {
        return this.filterItems;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TitleSubtitleCellDTO getSuggestion() {
        return this.suggestion;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.filterItems.hashCode() + ((this.suggestion.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31;
        String str = this.backgroundColor;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "SuggestionWithFilterVO(id=" + this.id + ", suggestion=" + this.suggestion + ", filterItems=" + this.filterItems + ", backgroundColor=" + this.backgroundColor + ")";
    }
}
