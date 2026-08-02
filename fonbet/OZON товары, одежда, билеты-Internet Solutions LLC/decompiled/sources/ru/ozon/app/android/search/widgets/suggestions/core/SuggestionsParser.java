package ru.ozon.app.android.search.widgets.suggestions.core;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.serviceCarousel.data.ServiceCarouselDTO;
import ru.ozon.app.android.search.widgets.suggestions.data.SuggestionsDTO;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsBadgeTitleSubtitleList;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsBadgeTitleSubtitleModel;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsCellModel;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsCommonModel;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsPrefetchModel;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsTextModel;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsTitleModel;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsTitleSubtitleList;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsTitleSubtitleModel;
import ru.ozon.app.android.search.widgets.utils.SelectUtilsKt;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.DisclosureBadgeIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IconButtonTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.TitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 722\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0001j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003`\u0005:\u00017B\u001b\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010&\u001a\u00020%*\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010&\u001a\u00020%*\u00020(2\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b&\u0010)J'\u0010-\u001a\u00020,*\u00020*2\b\u0010$\u001a\u0004\u0018\u00010\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b-\u0010.J'\u0010-\u001a\u00020,*\u00020/2\b\u0010$\u001a\u0004\u0018\u00010\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b-\u00100J*\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u00101\u001a\u0004\u0018\u00010\u00022\b\u00102\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b3\u00104R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/core/SuggestionsParser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Landroid/content/Context;)V", "", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "islandSeparatorDTO", "", "appendIslandSeparator", "(Ljava/util/List;Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;)V", "Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "separatorDTO", "appendSeparator", "(Ljava/util/List;Lru/ozon/app/android/widgets/separator/SeparatorDTO;)V", "Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO$SuggestionsList;", "suggestionsList", "appendSuggestionsList", "(Ljava/util/List;Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO$SuggestionsList;)V", "Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO$SuggestionsCarousel;", "suggestionsCarousel", "appendSuggestionsCarousel", "(Ljava/util/List;Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO$SuggestionsCarousel;)V", "Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO$SuggestionWithFilter;", "suggestionWithFilter", "appendSuggestionWithFilter", "(Ljava/util/List;Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO$SuggestionWithFilter;)V", "Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;", "islandColor", "Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsTitleSubtitleModel;", "toTitleSubtitleSuggest", "(Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;Ljava/lang/String;)Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsTitleSubtitleModel;", "Lru/ozon/uni/atoms/data/cell/IconButtonTitleSubtitleCellDTO;", "(Lru/ozon/uni/atoms/data/cell/IconButtonTitleSubtitleCellDTO;Ljava/lang/String;)Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsTitleSubtitleModel;", "Lru/ozon/uni/atoms/data/cell/DisclosureBadgeIconTitleSubtitleCellDTO;", "backgroundColor", "Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsBadgeTitleSubtitleModel;", "toBadgeTitleSubtitleSuggest", "(Lru/ozon/uni/atoms/data/cell/DisclosureBadgeIconTitleSubtitleCellDTO;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsBadgeTitleSubtitleModel;", "Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;", "(Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsBadgeTitleSubtitleModel;", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Landroid/content/Context;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SuggestionsParser implements Function2<String, String, List<? extends Object>> {

    @NotNull
    private final Context context;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/core/SuggestionsParser$Companion;", "", "<init>", "()V", "ADDITIONAL_SEPARATOR_HEIGHT", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SuggestionsParser(@NotNull JsonParser jsonDeserializer, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.jsonDeserializer = jsonDeserializer;
        this.context = context;
    }

    private final void appendIslandSeparator(List<Object> list, IslandSeparatorDTO islandSeparatorDTO) {
        list.add(islandSeparatorDTO);
    }

    private final void appendSeparator(List<Object> list, SeparatorDTO separatorDTO) {
        list.add(separatorDTO);
    }

    private final void appendSuggestionWithFilter(List<Object> list, SuggestionsDTO.SuggestionWithFilter suggestionWithFilter) {
        list.add(suggestionWithFilter);
    }

    private final void appendSuggestionsCarousel(List<Object> list, SuggestionsDTO.SuggestionsCarousel suggestionsCarousel) {
        String token = SelectUtilsKt.isSelect(this.context) ? UniColors.LAYER_FLOOR_1.getToken() : null;
        TextDTO title = suggestionsCarousel.getTitle();
        if (title != null) {
            list.add(new SuggestionsTitleModel(title, token));
        }
        list.add(ServiceCarouselDTO.copy$default(suggestionsCarousel.getBody(), null, null, null, true, null, null, 55, null));
        appendSeparator(list, new SeparatorDTO(null, 8, token));
    }

    private final void appendSuggestionsList(List<Object> list, SuggestionsDTO.SuggestionsList suggestionsList) {
        TextDTO title = suggestionsList.getTitle();
        if (title != null) {
            list.add(new SuggestionsTitleModel(title, suggestionsList.getBody().getIslandColor()));
        }
        String islandColor = suggestionsList.getBody().getIslandColor();
        String backgroundColor = suggestionsList.getBody().getBackgroundColor();
        List<AtomDTO> cells = suggestionsList.getBody().getCells();
        ArrayList arrayList = new ArrayList();
        for (Object obj : cells) {
            if (obj instanceof CellDTO) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            list.add(new SuggestionsCellModel((CellDTO) it.next(), backgroundColor, islandColor, suggestionsList.getBody().getTopMargin(), suggestionsList.getBody().getBottomMargin(), suggestionsList.getBody().getLeftMargin(), suggestionsList.getBody().getRightMargin()));
        }
        List<AtomDTO> cells2 = suggestionsList.getBody().getCells();
        ArrayList arrayList2 = new ArrayList(C7714v.z(cells2, 10));
        for (AtomDTO atomDTO : cells2) {
            arrayList2.add(atomDTO instanceof TitleSubtitleCellDTO ? toTitleSubtitleSuggest((TitleSubtitleCellDTO) atomDTO, islandColor) : atomDTO instanceof IconButtonTitleSubtitleCellDTO ? toTitleSubtitleSuggest((IconButtonTitleSubtitleCellDTO) atomDTO, islandColor) : Unit.f71690a);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof SuggestionsTitleSubtitleModel) {
                arrayList3.add(next);
            }
        }
        list.add(new SuggestionsTitleSubtitleList(arrayList3, islandColor));
        List<AtomDTO> cells3 = suggestionsList.getBody().getCells();
        ArrayList arrayList4 = new ArrayList(C7714v.z(cells3, 10));
        for (AtomDTO atomDTO2 : cells3) {
            arrayList4.add(atomDTO2 instanceof DisclosureBadgeIconTitleSubtitleCellDTO ? toBadgeTitleSubtitleSuggest((DisclosureBadgeIconTitleSubtitleCellDTO) atomDTO2, islandColor, backgroundColor) : atomDTO2 instanceof DisclosureIconTitleSubtitleCellDTO ? toBadgeTitleSubtitleSuggest((DisclosureIconTitleSubtitleCellDTO) atomDTO2, islandColor, backgroundColor) : Unit.f71690a);
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (next2 instanceof SuggestionsBadgeTitleSubtitleModel) {
                arrayList5.add(next2);
            }
        }
        if (suggestionsList.getTitle() == null && !arrayList5.isEmpty()) {
            appendSeparator(list, new SeparatorDTO(null, 8, backgroundColor));
        }
        list.add(new SuggestionsBadgeTitleSubtitleList(arrayList5, islandColor, backgroundColor));
    }

    private final SuggestionsBadgeTitleSubtitleModel toBadgeTitleSubtitleSuggest(DisclosureBadgeIconTitleSubtitleCellDTO disclosureBadgeIconTitleSubtitleCellDTO, String str, String str2) {
        SuggestionsTextModel suggestionsTextModel = new SuggestionsTextModel(disclosureBadgeIconTitleSubtitleCellDTO.getTitle().getTestInfo(), disclosureBadgeIconTitleSubtitleCellDTO.getTitle().getText());
        CommonAtomLabelDTO subtitle = disclosureBadgeIconTitleSubtitleCellDTO.getSubtitle();
        TestInfo testInfo = subtitle != null ? subtitle.getTestInfo() : null;
        CommonAtomLabelDTO subtitle2 = disclosureBadgeIconTitleSubtitleCellDTO.getSubtitle();
        SuggestionsTextModel suggestionsTextModel2 = new SuggestionsTextModel(testInfo, subtitle2 != null ? subtitle2.getText() : null);
        Map<String, TokenizedTrackingInfo> map = null;
        CommonCellSettings common = disclosureBadgeIconTitleSubtitleCellDTO.getCommon();
        AtomActionDTO action = common != null ? common.getAction() : null;
        CommonCellSettings common2 = disclosureBadgeIconTitleSubtitleCellDTO.getCommon();
        TestInfo testInfo2 = common2 != null ? common2.getTestInfo() : null;
        CommonCellSettings common3 = disclosureBadgeIconTitleSubtitleCellDTO.getCommon();
        if (common3 != null) {
            map = common3.getTrackingInfo();
        }
        return new SuggestionsBadgeTitleSubtitleModel(new SuggestionsCommonModel(action, testInfo2, map), suggestionsTextModel, suggestionsTextModel2, disclosureBadgeIconTitleSubtitleCellDTO.getBadge(), disclosureBadgeIconTitleSubtitleCellDTO.getIcon(), str2, str);
    }

    private final SuggestionsTitleSubtitleModel toTitleSubtitleSuggest(TitleSubtitleCellDTO titleSubtitleCellDTO, String str) {
        return new SuggestionsTitleSubtitleModel(new SuggestionsCommonModel(titleSubtitleCellDTO.getCommon().getAction(), titleSubtitleCellDTO.getCommon().getTestInfo(), titleSubtitleCellDTO.getCommon().getTrackingInfo()), new SuggestionsTextModel(titleSubtitleCellDTO.getTitle().getTestInfo(), titleSubtitleCellDTO.getTitle().getText()), null, str);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        JsonParser jsonParser = this.jsonDeserializer;
        Intrinsics.f(state);
        SuggestionsDTO suggestionsDTO = (SuggestionsDTO) jsonParser.fromJson(state, SuggestionsDTO.class);
        ArrayList arrayList = new ArrayList();
        List<String> prefetchLinks = suggestionsDTO.getPrefetchLinks();
        if (prefetchLinks != null) {
            arrayList.add(new SuggestionsPrefetchModel(prefetchLinks));
        }
        for (Object obj : suggestionsDTO.getBlocks()) {
            if (obj instanceof IslandSeparatorDTO) {
                appendIslandSeparator(arrayList, (IslandSeparatorDTO) obj);
            } else if (obj instanceof SeparatorDTO) {
                appendSeparator(arrayList, (SeparatorDTO) obj);
            } else if (obj instanceof SuggestionsDTO.SuggestionsList) {
                appendSuggestionsList(arrayList, (SuggestionsDTO.SuggestionsList) obj);
            } else if (obj instanceof SuggestionsDTO.SuggestionsCarousel) {
                appendSuggestionsCarousel(arrayList, (SuggestionsDTO.SuggestionsCarousel) obj);
            } else if (obj instanceof SuggestionsDTO.SuggestionWithFilter) {
                appendSuggestionWithFilter(arrayList, (SuggestionsDTO.SuggestionWithFilter) obj);
            }
        }
        return arrayList;
    }

    private final SuggestionsTitleSubtitleModel toTitleSubtitleSuggest(IconButtonTitleSubtitleCellDTO iconButtonTitleSubtitleCellDTO, String str) {
        CommonCellSettings common = iconButtonTitleSubtitleCellDTO.getCommon();
        AtomActionDTO action = common != null ? common.getAction() : null;
        CommonCellSettings common2 = iconButtonTitleSubtitleCellDTO.getCommon();
        TestInfo testInfo = common2 != null ? common2.getTestInfo() : null;
        CommonCellSettings common3 = iconButtonTitleSubtitleCellDTO.getCommon();
        return new SuggestionsTitleSubtitleModel(new SuggestionsCommonModel(action, testInfo, common3 != null ? common3.getTrackingInfo() : null), new SuggestionsTextModel(iconButtonTitleSubtitleCellDTO.getTitle().getTestInfo(), iconButtonTitleSubtitleCellDTO.getTitle().getText()), iconButtonTitleSubtitleCellDTO.getIconButton(), str);
    }

    private final SuggestionsBadgeTitleSubtitleModel toBadgeTitleSubtitleSuggest(DisclosureIconTitleSubtitleCellDTO disclosureIconTitleSubtitleCellDTO, String str, String str2) {
        SuggestionsTextModel suggestionsTextModel = new SuggestionsTextModel(disclosureIconTitleSubtitleCellDTO.getTitle().getTestInfo(), disclosureIconTitleSubtitleCellDTO.getTitle().getText());
        CommonAtomLabelDTO subtitle = disclosureIconTitleSubtitleCellDTO.getSubtitle();
        TestInfo testInfo = subtitle != null ? subtitle.getTestInfo() : null;
        CommonAtomLabelDTO subtitle2 = disclosureIconTitleSubtitleCellDTO.getSubtitle();
        SuggestionsTextModel suggestionsTextModel2 = new SuggestionsTextModel(testInfo, subtitle2 != null ? subtitle2.getText() : null);
        Map<String, TokenizedTrackingInfo> map = null;
        CommonCellSettings common = disclosureIconTitleSubtitleCellDTO.getCommon();
        AtomActionDTO action = common != null ? common.getAction() : null;
        CommonCellSettings common2 = disclosureIconTitleSubtitleCellDTO.getCommon();
        TestInfo testInfo2 = common2 != null ? common2.getTestInfo() : null;
        CommonCellSettings common3 = disclosureIconTitleSubtitleCellDTO.getCommon();
        if (common3 != null) {
            map = common3.getTrackingInfo();
        }
        return new SuggestionsBadgeTitleSubtitleModel(new SuggestionsCommonModel(action, testInfo2, map), suggestionsTextModel, suggestionsTextModel2, null, disclosureIconTitleSubtitleCellDTO.getIcon(), str2, str);
    }
}
