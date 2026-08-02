package ru.ozon.app.android.fresh.checkout.widgets.searchBankList.mapper;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.checkout.widgets.searchBankList.data.SearchBankListDTO;
import ru.ozon.app.android.fresh.checkout.widgets.searchBankList.presentation.SearchBankListVO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/mapper/SearchBankListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/presentation/SearchBankListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVO", "(Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO;J)Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/presentation/SearchBankListVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO;Ll20/d;)Ljava/util/List;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SearchBankListMapper implements Function2<SearchBankListDTO, d, List<? extends SearchBankListVO>> {
    private final SearchBankListVO toVO(SearchBankListDTO searchBankListDTO, long j11) {
        Map<String, TokenizedTrackingInfo> trackingInfo = searchBankListDTO.getTrackingInfo();
        t mapToTokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        TextDTO emptyText = searchBankListDTO.getEmptyText();
        TextDTO copy$default = emptyText != null ? TextDTO.copy$default(emptyText, null, null, null, null, CommonCellSettings.LayoutPadding.PADDING_500, CommonCellSettings.LayoutPadding.PADDING_300, null, null, null, null, null, null, null, false, null, null, null, null, null, 524239, null) : null;
        SearchBankListDTO.SectionHeader copy$default2 = SearchBankListDTO.SectionHeader.copy$default(searchBankListDTO.getSectionHeader(), TextDTO.copy$default(searchBankListDTO.getSectionHeader().getText(), null, null, null, null, CommonCellSettings.LayoutPadding.PADDING_500, CommonCellSettings.LayoutPadding.PADDING_300, null, null, null, null, null, null, null, false, null, null, null, null, null, 524239, null), null, 2, null);
        IconButtonV3DTO closeButton = searchBankListDTO.getCloseButton();
        NotificationDTO restriction = searchBankListDTO.getRestriction();
        SearchBankListDTO.SearchBar searchBar = searchBankListDTO.getSearchBar();
        List<CellDTO> elementsCell = searchBankListDTO.getElementsCell();
        if (elementsCell == null) {
            elementsCell = K.f71697a;
        }
        return new SearchBankListVO(j11, elementsCell, copy$default, restriction, searchBar, closeButton, copy$default2, mapToTokenizedEvent$default);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SearchBankListVO> invoke(@NotNull SearchBankListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.c0(toVO(state, widgetInfo.d().hashCode()));
    }
}
