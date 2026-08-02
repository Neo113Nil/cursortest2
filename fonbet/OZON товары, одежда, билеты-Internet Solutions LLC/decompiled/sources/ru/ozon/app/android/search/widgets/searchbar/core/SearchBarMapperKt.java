package ru.ozon.app.android.search.widgets.searchbar.core;

import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVOKt;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarDTO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u0003*\u0004\u0018\u00010\u0004H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\u0000\u001a\u00020\t*\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"toVo", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$SearchButton;", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchButton;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$ReturnKeyType;", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$ReturnKeyType;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$SearchByImageVO;", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchByImage;", "id", "", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$TooltipVO;", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$Tooltip;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchBarMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchBarDTO.ReturnKeyType.values().length];
            try {
                iArr[SearchBarDTO.ReturnKeyType.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchBarVO.SearchButton toVo(SearchBarDTO.SearchButton searchButton) {
        Icon icon = searchButton.getIcon();
        AtomActionDTO action = searchButton.getAction();
        return new SearchBarVO.SearchButton(icon, action != null ? AtomActionMapperKt.toAtomAction(action, searchButton.getTrackingInfo()) : null, searchButton.getTestInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchBarVO.ReturnKeyType toVo(SearchBarDTO.ReturnKeyType returnKeyType) {
        if ((returnKeyType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[returnKeyType.ordinal()]) == 1) {
            return SearchBarVO.ReturnKeyType.DONE;
        }
        return SearchBarVO.ReturnKeyType.SEARCH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchBarVO.SearchByImageVO toVo(SearchBarDTO.SearchByImage searchByImage, long j11) {
        Map<String, TokenizedTrackingInfo> spinnerTrackingInfo;
        Map<String, TokenizedTrackingInfo> buttonTrackingInfo = searchByImage.getButtonTrackingInfo();
        t tVar = null;
        t b11 = buttonTrackingInfo != null ? x.b(buttonTrackingInfo, Long.valueOf(j11), null) : null;
        CommonControlSettings openOnboardingControl = searchByImage.getOpenOnboardingControl();
        NotificationDTO errorNotification = searchByImage.getErrorNotification();
        SearchBarDTO.SearchByImageStatus status = searchByImage.getStatus();
        if (status != null && (spinnerTrackingInfo = status.getSpinnerTrackingInfo()) != null) {
            tVar = x.b(spinnerTrackingInfo, Long.valueOf(j11), null);
        }
        return new SearchBarVO.SearchByImageVO(b11, openOnboardingControl, errorNotification, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchBarVO.TooltipVO toVo(SearchBarDTO.Tooltip tooltip) {
        return new SearchBarVO.TooltipVO(CartTooltipVOKt.toCartTooltipVO(tooltip.getTooltip()), tooltip.getTooltipKey(), tooltip.getTooltipDelay());
    }
}
