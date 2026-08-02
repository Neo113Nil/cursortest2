package ru.ozon.app.android.search.widgets.searchbar.core;

import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarDTO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarVO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"toVo", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$ReturnKeyType;", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$ReturnKeyType;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO$SearchByImageVO;", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchByImage;", "id", "", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActiveSearchBarMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
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
    public static final SearchBarVO.ReturnKeyType toVo(SearchBarDTO.ReturnKeyType returnKeyType) {
        return (returnKeyType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[returnKeyType.ordinal()]) == 1 ? SearchBarVO.ReturnKeyType.DONE : SearchBarVO.ReturnKeyType.SEARCH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActiveSearchBarVO.SearchByImageVO toVo(SearchBarDTO.SearchByImage searchByImage, long j11) {
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
        return new ActiveSearchBarVO.SearchByImageVO(b11, openOnboardingControl, errorNotification, tVar);
    }
}
