package ru.ozon.app.android.search.widgets.suggestion.data;

import WZ.t;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.search.R$drawable;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionDTO;
import ru.ozon.app.android.search.widgets.suggestion.presentation.SuggestionVO;
import ru.ozon.app.android.search.widgets.utils.SuggestionsUtilsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00152\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010 *\u00020\u001f*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\"H\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b(\u0010'J#\u0010-\u001a\u00020,*\u00020)2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001cH\u0002¢\u0006\u0004\b-\u0010.J*\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u00100\u001a\u00060\u0003j\u0002`/H\u0096\u0002¢\u0006\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO;", "Ll20/d;", "", "Lru/ozon/app/android/search/widgets/suggestion/presentation/SuggestionVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO$SuggestionItemDTO;", "item", "", "getRemoveQueryActionName", "(Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO;Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO$SuggestionItemDTO;)Ljava/lang/String;", "", "isHistorySuggest", "(Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO$SuggestionItemDTO;)Z", SelectionItemFormDTO.TITLE_FIELD_NAME, "queryText", "shouldHighlight", "", "getTitle", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/CharSequence;", "Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO$BreadcrumbsDTO;", "breadcrumbsList", "getBreadcrumb", "(Ljava/util/List;)Ljava/lang/CharSequence;", "", "getTypeImageResId", "(Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO$SuggestionItemDTO;)Ljava/lang/Integer;", "", "T", "", "Lkotlin/Function1;", "additionalCondition", "filterNotNull", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "prepareQueryText", "(Ljava/lang/String;)Ljava/lang/String;", "replaceSameLetter", "Landroid/text/SpannableStringBuilder;", "start", "end", "", "setupSpan", "(Landroid/text/SpannableStringBuilder;II)V", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionDTO;Ll20/d;)Ljava/util/List;", "Lkotlin/text/Regex;", "querySpacesRegex", "Lkotlin/text/Regex;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionMapper implements Function2<SuggestionDTO, d, List<? extends SuggestionVO>> {

    @NotNull
    private final Regex querySpacesRegex = new Regex("\\s+");

    private final <T> List<T> filterNotNull(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        for (T t2 : iterable) {
            if (t2 != null && function1.invoke(t2).booleanValue()) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    private final CharSequence getBreadcrumb(List<SuggestionDTO.BreadcrumbsDTO> breadcrumbsList) {
        SuggestionDTO.BreadcrumbsDTO breadcrumbsDTO;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (breadcrumbsList != null) {
            SuggestionDTO.BreadcrumbsDTO breadcrumbsDTO2 = (SuggestionDTO.BreadcrumbsDTO) C7714v.M(breadcrumbsList);
            if (breadcrumbsDTO2 != null) {
                spannableStringBuilder.append((CharSequence) breadcrumbsDTO2.getText());
            }
            if (breadcrumbsList.size() <= 1) {
                breadcrumbsList = null;
            }
            if (breadcrumbsList != null && (breadcrumbsDTO = (SuggestionDTO.BreadcrumbsDTO) C7714v.Z(breadcrumbsList)) != null) {
                spannableStringBuilder.append((CharSequence) (" / " + breadcrumbsDTO.getText()));
            }
        }
        return spannableStringBuilder;
    }

    private final String getRemoveQueryActionName(SuggestionDTO state, SuggestionDTO.SuggestionItemDTO item) {
        if (isHistorySuggest(item)) {
            return state.getRemoveHistoryActionName();
        }
        return null;
    }

    private final CharSequence getTitle(String title, String queryText, boolean shouldHighlight) {
        int J11 = h.J(replaceSameLetter(title), queryText, 0, true, 2);
        int length = queryText.length() + J11;
        if (queryText.length() <= 0 || !shouldHighlight) {
            return title;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(title);
        if (J11 < 0) {
            setupSpan(spannableStringBuilder, 0, title.length());
            return spannableStringBuilder;
        }
        if (J11 != 0) {
            setupSpan(spannableStringBuilder, 0, J11 - 1);
        }
        setupSpan(spannableStringBuilder, length, title.length());
        return spannableStringBuilder;
    }

    private final Integer getTypeImageResId(SuggestionDTO.SuggestionItemDTO item) {
        SuggestionDTO.SuggestionItemDTO.MetaDTO meta = item.getMeta();
        if (meta != null && meta.isHistory()) {
            return Integer.valueOf(R$drawable.ic_search_history_s);
        }
        SuggestionDTO.SuggestionItemDTO.MetaDTO meta2 = item.getMeta();
        if (meta2 == null || !meta2.isSuggest()) {
            return null;
        }
        return Integer.valueOf(R$drawable.ic_search);
    }

    private final boolean isHistorySuggest(SuggestionDTO.SuggestionItemDTO item) {
        SuggestionDTO.SuggestionItemDTO.MetaDTO meta = item.getMeta();
        if (meta != null) {
            return meta.isHistory();
        }
        return false;
    }

    private final String prepareQueryText(String str) {
        return replaceSameLetter(this.querySpacesRegex.replace(h.E0(str), " "));
    }

    private final String replaceSameLetter(String str) {
        return h.X(str, "ё", "е", true);
    }

    private final void setupSpan(SpannableStringBuilder spannableStringBuilder, int i11, int i12) {
        spannableStringBuilder.setSpan(new StyleSpan(1), i11, i12, 33);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SuggestionVO> invoke(@NotNull SuggestionDTO state, @NotNull d widgetInfo) {
        List filterNotNull;
        Boolean isPromotedProduct;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<SuggestionDTO.SuggestionItemDTO> items = state.getItems();
        ArrayList arrayList = null;
        if (items != null && (filterNotNull = filterNotNull(items, SuggestionMapper$invoke$1.INSTANCE)) != null) {
            List list = filterNotNull;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                SuggestionDTO.SuggestionItemDTO suggestionItemDTO = (SuggestionDTO.SuggestionItemDTO) obj;
                SuggestionDTO.SuggestionItemDTO.MetaDTO meta = suggestionItemDTO.getMeta();
                CharSequence title = getTitle(suggestionItemDTO.getTitle(), prepareQueryText(suggestionItemDTO.getQueryText()), meta != null && (meta.isHistory() || meta.isSuggest()));
                String formatSuggestionDeeplink = SuggestionsUtilsKt.formatSuggestionDeeplink(suggestionItemDTO.getDeeplink());
                String title2 = suggestionItemDTO.getTitle();
                List<SuggestionDTO.BreadcrumbsDTO> breadCrumbs = suggestionItemDTO.getBreadCrumbs();
                long hashCode = (title2 + "_" + formatSuggestionDeeplink + "_" + (breadCrumbs != null ? C7714v.V(breadCrumbs, null, null, null, null, 63) : null)).hashCode();
                String subtitle = suggestionItemDTO.getSubtitle();
                String str = subtitle == null ? "" : subtitle;
                Boolean shouldPrefetch = suggestionItemDTO.getShouldPrefetch();
                boolean booleanValue = shouldPrefetch != null ? shouldPrefetch.booleanValue() : false;
                String image = suggestionItemDTO.getImage();
                String str2 = image == null ? "" : image;
                CharSequence breadcrumb = getBreadcrumb(suggestionItemDTO.getBreadCrumbs());
                String queryText = suggestionItemDTO.getQueryText();
                String note = suggestionItemDTO.getNote();
                String str3 = note == null ? "" : note;
                String removeQueryActionName = getRemoveQueryActionName(state, suggestionItemDTO);
                Integer typeImageResId = getTypeImageResId(suggestionItemDTO);
                SuggestionDTO.SuggestionItemDTO.MetaDTO meta2 = suggestionItemDTO.getMeta();
                boolean booleanValue2 = (meta2 == null || (isPromotedProduct = meta2.isPromotedProduct()) == null) ? false : isPromotedProduct.booleanValue();
                Map<String, TokenizedTrackingInfo> trackingInfo = suggestionItemDTO.getTrackingInfo();
                t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
                Map<String, TokenizedTrackingInfo> searchTrackingInfo = suggestionItemDTO.getSearchTrackingInfo();
                t tokenizedEvent$default2 = searchTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(searchTrackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
                Map<String, TokenizedTrackingInfo> removeTrackingInfo = suggestionItemDTO.getRemoveTrackingInfo();
                arrayList2.add(new SuggestionVO(hashCode, title, str, formatSuggestionDeeplink, booleanValue, str2, breadcrumb, queryText, str3, removeQueryActionName, typeImageResId, booleanValue2, tokenizedEvent$default, tokenizedEvent$default2, removeTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(removeTrackingInfo, Long.valueOf(hashCode), null, 2, null) : null, i11 != C7714v.P(state.getItems())));
                i11 = i12;
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? K.f71697a : arrayList;
    }
}
