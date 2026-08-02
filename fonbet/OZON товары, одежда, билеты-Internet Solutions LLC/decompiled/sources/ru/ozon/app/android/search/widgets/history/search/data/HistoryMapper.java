package ru.ozon.app.android.search.widgets.history.search.data;

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
import ru.ozon.app.android.search.widgets.history.search.data.HistoryDTO;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryItem;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryVO;
import ru.ozon.app.android.storefront.ui.tooltip.TooltipVOKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 *2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001*B\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\r\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\r\u0010\u001dJ*\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001e\u001a\u00020\u00022\n\u0010 \u001a\u00060\u0003j\u0002`\u001fH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001b¢\u0006\u0004\b)\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/data/HistoryMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO;", "Ll20/d;", "", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "", "asyncData", "toVO", "(Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO;JLjava/lang/String;)Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO;", "Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$PresentationSettings;", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$PresentationSettings;", "toVo", "(Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$PresentationSettings;)Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$PresentationSettings;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem$ButtonVO;", "buttonToVO", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem$ButtonVO;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem$TagButtonVO;", "tagButtonToVO", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem$TagButtonVO;", "Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$Onboarding;", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$Onboarding;", "(Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$Onboarding;)Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$Onboarding;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO;Ll20/d;)Ljava/util/List;", "", "dto", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;", "mapHistoryItemToVO", "(Ljava/lang/Object;)Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;", "onboarding", "mapFiltersOnboardingToVO", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HistoryMapper implements Function2<HistoryDTO, d, List<? extends HistoryVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/data/HistoryMapper$Companion;", "", "<init>", "()V", "BUTTON_PREFETCH_KEY", "", "MAX_ROWS", "", "MIN_TAG_WIDTH", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final HistoryItem.ButtonVO buttonToVO(ButtonV3DTO buttonV3DTO) {
        AtomActionDTO action;
        Map<String, String> params;
        String str;
        Boolean t02;
        long hashCode = Double.hashCode(Math.random());
        CommonControlSettings common = buttonV3DTO.getCommon();
        return new HistoryItem.ButtonVO(hashCode, buttonV3DTO, (common == null || (action = common.getAction()) == null || (params = action.getParams()) == null || (str = params.get("shouldPrefetch")) == null || (t02 = h.t0(str)) == null) ? false : t02.booleanValue());
    }

    private final HistoryItem.TagButtonVO tagButtonToVO(TagButtonDTO tagButtonDTO) {
        AtomActionDTO action;
        Map<String, String> params;
        String str;
        Boolean t02;
        long hashCode = Double.hashCode(Math.random());
        CommonControlSettings common = tagButtonDTO.getCommon();
        return new HistoryItem.TagButtonVO(hashCode, tagButtonDTO, (common == null || (action = common.getAction()) == null || (params = action.getParams()) == null || (str = params.get("shouldPrefetch")) == null || (t02 = h.t0(str)) == null) ? false : t02.booleanValue());
    }

    private final HistoryVO toVO(HistoryDTO historyDTO, long j11, String str) {
        TextDTO title = historyDTO.getTitle();
        ButtonV3DTO deleteButton = historyDTO.getDeleteButton();
        List<AtomDTO> historyItems = historyDTO.getHistoryItems();
        ArrayList arrayList = new ArrayList(C7714v.z(historyItems, 10));
        Iterator<T> it = historyItems.iterator();
        while (it.hasNext()) {
            arrayList.add(mapHistoryItemToVO((AtomDTO) it.next()));
        }
        HistoryDTO.PresentationSettings presentationSettings = historyDTO.getPresentationSettings();
        HistoryVO.PresentationSettings vo = presentationSettings != null ? toVo(presentationSettings) : null;
        HistoryDTO.Onboarding onboarding = historyDTO.getOnboarding();
        return new HistoryVO(j11, title, deleteButton, arrayList, str, false, vo, onboarding != null ? toVO(onboarding) : null, 32, null);
    }

    private final HistoryVO.PresentationSettings toVo(HistoryDTO.PresentationSettings presentationSettings) {
        HistoryItem.ButtonVO buttonToVO = buttonToVO(presentationSettings.getShowMoreButton());
        Boolean hasMoreItems = presentationSettings.getHasMoreItems();
        boolean booleanValue = hasMoreItems != null ? hasMoreItems.booleanValue() : false;
        Integer collapsedMaxRows = presentationSettings.getCollapsedMaxRows();
        int intValue = collapsedMaxRows != null ? collapsedMaxRows.intValue() : 2;
        Integer lastItemMinWidth = presentationSettings.getLastItemMinWidth();
        int px = UiExtKt.toPx(lastItemMinWidth != null ? lastItemMinWidth.intValue() : 80);
        Paddings paddingTop = presentationSettings.getPaddingTop();
        if (paddingTop == null) {
            paddingTop = Paddings.NONE;
        }
        int px2 = UiExtKt.toPx(paddingTop.getPx());
        Paddings paddingRight = presentationSettings.getPaddingRight();
        if (paddingRight == null) {
            paddingRight = Paddings.PADDING_500;
        }
        int px3 = UiExtKt.toPx(paddingRight.getPx());
        Paddings paddingBottom = presentationSettings.getPaddingBottom();
        if (paddingBottom == null) {
            paddingBottom = Paddings.PADDING_500;
        }
        int px4 = UiExtKt.toPx(paddingBottom.getPx());
        Paddings paddingLeft = presentationSettings.getPaddingLeft();
        if (paddingLeft == null) {
            paddingLeft = Paddings.PADDING_500;
        }
        int px5 = UiExtKt.toPx(paddingLeft.getPx());
        Paddings rowGap = presentationSettings.getRowGap();
        if (rowGap == null) {
            rowGap = Paddings.PADDING_300;
        }
        int px6 = UiExtKt.toPx(rowGap.getPx()) / 2;
        Paddings columnGap = presentationSettings.getColumnGap();
        if (columnGap == null) {
            columnGap = Paddings.PADDING_300;
        }
        return new HistoryVO.PresentationSettings(buttonToVO, booleanValue, intValue, px, new HistoryVO.PresentationSettings.HistoryPaddings(px2, px3, px4, px5, px6, UiExtKt.toPx(columnGap.getPx()) / 2));
    }

    @NotNull
    public final HistoryVO.Onboarding mapFiltersOnboardingToVO(@NotNull HistoryDTO.Onboarding onboarding) {
        Intrinsics.checkNotNullParameter(onboarding, "onboarding");
        return toVO(onboarding);
    }

    @NotNull
    public final HistoryItem mapHistoryItemToVO(@NotNull Object dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        if (dto instanceof ButtonV3DTO) {
            return buttonToVO((ButtonV3DTO) dto);
        }
        if (dto instanceof TagButtonDTO) {
            return tagButtonToVO((TagButtonDTO) dto);
        }
        throw new IllegalArgumentException("unsupported history type");
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HistoryVO> invoke(@NotNull HistoryDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode(), widgetInfo.c().a()));
    }

    private final HistoryVO.Onboarding toVO(HistoryDTO.Onboarding onboarding) {
        return new HistoryVO.Onboarding(TooltipVOKt.toTooltipVO(onboarding.getTooltip()), onboarding.getOnboardingId(), onboarding.getOnboardingDelay());
    }
}
