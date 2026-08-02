package ru.ozon.app.android.search.widgets.dialogSearchBar.data;

import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.DialogSearchBarDTO;
import ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 .2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001.B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u0005*\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0012J\u0013\u0010\r\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\r\u0010\u0015J\u0013\u0010\r\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\r\u0010\u0018J\u0013\u0010\r\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\r\u0010\u001bJ\u0013\u0010\r\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\r\u0010\u001eJ\u0013\u0010\r\u001a\u00020 *\u00020\u001fH\u0002¢\u0006\u0004\b\r\u0010!J\u0019\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b%\u0010&J*\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010'\u001a\u00020\u00022\n\u0010)\u001a\u00060\u0003j\u0002`(H\u0096\u0002¢\u0006\u0004\b*\u0010+J)\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b-\u0010\u000e¨\u0006/"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "asyncData", "", "widgetId", "toVo", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO;Ljava/lang/String;J)Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$RefreshInfo;", "id", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$RefreshInfoVO;", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$RefreshInfo;J)Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$RefreshInfoVO;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$ReturnKeyInfo;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$ReturnKeyInfoVO;", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$ReturnKeyInfo;)Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$ReturnKeyInfoVO;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$TapTagOptions;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TapTagOptionsVO;", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$TapTagOptions;)Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TapTagOptionsVO;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TapTagVO;", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TapTagVO;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$TagsList;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TagsListVO;", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$TagsList;)Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TagsListVO;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$AllFiltersButton;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$AllFiltersButtonVO;", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$AllFiltersButton;)Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$AllFiltersButtonVO;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$ReturnKeyType;", "keyType", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$ReturnKeyType;", "getReturnKeyTypeVo", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$ReturnKeyType;)Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$ReturnKeyType;", "state", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO;Ll20/d;)Ljava/util/List;", "dto", "mapDTOToVO", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DialogSearchBarMapper implements Function2<DialogSearchBarDTO, d, List<? extends DialogSearchBarVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarMapper$Companion;", "", "<init>", "()V", "DEFAULT_STATE_LINK", "", "PREFETCH_KEY", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final DialogSearchBarVO.ReturnKeyType getReturnKeyTypeVo(DialogSearchBarDTO.ReturnKeyType keyType) {
        return keyType == DialogSearchBarDTO.ReturnKeyType.TYPE_DONE ? DialogSearchBarVO.ReturnKeyType.TYPE_DONE : DialogSearchBarVO.ReturnKeyType.TYPE_SEARCH;
    }

    private final DialogSearchBarVO toVo(DialogSearchBarDTO dialogSearchBarDTO, String str, long j11) {
        String inputText = dialogSearchBarDTO.getInputText();
        String placeholder = dialogSearchBarDTO.getPlaceholder();
        DialogSearchBarVO.RefreshInfoVO vo = toVo(dialogSearchBarDTO.getWidgetRefresh(), j11);
        DialogSearchBarDTO.RefreshInfo pageRefresh = dialogSearchBarDTO.getPageRefresh();
        DialogSearchBarVO.RefreshInfoVO vo2 = pageRefresh != null ? toVo(pageRefresh, j11) : null;
        DialogSearchBarDTO.ReturnKeyInfo returnKey = dialogSearchBarDTO.getReturnKey();
        DialogSearchBarVO.ReturnKeyInfoVO vo3 = returnKey != null ? toVo(returnKey) : null;
        DialogSearchBarDTO.TapTagOptions tapTagOptions = dialogSearchBarDTO.getTapTagOptions();
        DialogSearchBarVO.TapTagOptionsVO vo4 = tapTagOptions != null ? toVo(tapTagOptions) : null;
        DialogSearchBarDTO.TagsList usedTags = dialogSearchBarDTO.getUsedTags();
        DialogSearchBarVO.TagsListVO vo5 = usedTags != null ? toVo(usedTags) : null;
        DialogSearchBarDTO.AllFiltersButton allFilters = dialogSearchBarDTO.getAllFilters();
        DialogSearchBarVO.AllFiltersButtonVO vo6 = allFilters != null ? toVo(allFilters) : null;
        Map<String, TokenizedTrackingInfo> pageInteraction = dialogSearchBarDTO.getPageInteraction();
        t b11 = pageInteraction != null ? x.b(pageInteraction, Long.valueOf(j11), null) : null;
        String defaultStateLink = dialogSearchBarDTO.getDefaultStateLink();
        if (defaultStateLink == null) {
            defaultStateLink = "ozon://dialogSearch";
        }
        return new DialogSearchBarVO(j11, inputText, placeholder, vo, vo2, vo3, vo4, vo5, vo6, b11, str, defaultStateLink, dialogSearchBarDTO.getSearchBarStyles(), dialogSearchBarDTO.getRightButton());
    }

    @NotNull
    public final DialogSearchBarVO mapDTOToVO(@NotNull DialogSearchBarDTO dto, String asyncData, long widgetId) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        return toVo(dto, asyncData, widgetId);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DialogSearchBarVO> invoke(@NotNull DialogSearchBarDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.c().a(), widgetInfo.d().hashCode()));
    }

    private final DialogSearchBarVO.RefreshInfoVO toVo(DialogSearchBarDTO.RefreshInfo refreshInfo, long j11) {
        String url = refreshInfo.getUrl();
        Long debounceMs = refreshInfo.getDebounceMs();
        Map<String, TokenizedTrackingInfo> tracking = refreshInfo.getTracking();
        return new DialogSearchBarVO.RefreshInfoVO(url, debounceMs, tracking != null ? x.b(tracking, Long.valueOf(j11), null) : null);
    }

    private final DialogSearchBarVO.ReturnKeyInfoVO toVo(DialogSearchBarDTO.ReturnKeyInfo returnKeyInfo) {
        return new DialogSearchBarVO.ReturnKeyInfoVO(getReturnKeyTypeVo(returnKeyInfo.getType()), returnKeyInfo.getPressControl());
    }

    private final DialogSearchBarVO.TapTagOptionsVO toVo(DialogSearchBarDTO.TapTagOptions tapTagOptions) {
        ArrayList arrayList;
        List<TagButtonDTO> items = tapTagOptions.getItems();
        if (items != null) {
            List<TagButtonDTO> list = items;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toVo((TagButtonDTO) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new DialogSearchBarVO.TapTagOptionsVO(arrayList, tapTagOptions.getMaxRows());
    }

    private final DialogSearchBarVO.TapTagVO toVo(TagButtonDTO tagButtonDTO) {
        AtomActionDTO action;
        Map<String, String> params;
        String str;
        Boolean t02;
        CommonControlSettings common = tagButtonDTO.getCommon();
        return new DialogSearchBarVO.TapTagVO(tagButtonDTO, (common == null || (action = common.getAction()) == null || (params = action.getParams()) == null || (str = params.get("shouldPrefetch")) == null || (t02 = h.t0(str)) == null) ? false : t02.booleanValue());
    }

    private final DialogSearchBarVO.TagsListVO toVo(DialogSearchBarDTO.TagsList tagsList) {
        return new DialogSearchBarVO.TagsListVO(tagsList.getItems());
    }

    private final DialogSearchBarVO.AllFiltersButtonVO toVo(DialogSearchBarDTO.AllFiltersButton allFiltersButton) {
        return new DialogSearchBarVO.AllFiltersButtonVO(allFiltersButton.getButton(), allFiltersButton.getIndicator());
    }
}
