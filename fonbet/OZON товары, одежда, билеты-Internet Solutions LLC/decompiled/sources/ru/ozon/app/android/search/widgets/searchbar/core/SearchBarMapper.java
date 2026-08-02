package ru.ozon.app.android.search.widgets.searchbar.core;

import T00.a;
import T00.k;
import WZ.t;
import WZ.x;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.domain.flags.RedesignedSearchBarEnabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarDTO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.utils.SearchBarUtilsKt;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO;Ll20/d;)Ljava/util/List;", "", "cornerRadius", "", "getSearchBarCornerRadius", "(Ljava/lang/Integer;)F", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchBarMapper implements Function2<SearchBarDTO, d, List<? extends SearchBarVO>> {

    @NotNull
    private final AppType appType;

    @NotNull
    private final FeatureChecker featureChecker;

    public SearchBarMapper(@NotNull AppType appType, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.appType = appType;
        this.featureChecker = featureChecker;
    }

    public final float getSearchBarCornerRadius(Integer cornerRadius) {
        if (cornerRadius != null) {
            return ResourceExtKt.toPxF(cornerRadius.intValue());
        }
        return SearchBarUtilsKt.getSearchBarDefaultRadius(this.appType == AppType.SELECT, this.featureChecker.isEnabled(RedesignedSearchBarEnabled.INSTANCE));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SearchBarVO> invoke(@NotNull SearchBarDTO dto, @NotNull d widgetInfo) {
        SearchBarVO.SearchButton searchButton;
        SearchBarVO.ReturnKeyType vo;
        SearchBarVO.TooltipVO tooltipVO;
        SearchBarVO.TooltipVO vo2;
        SearchBarVO.SearchButton vo3;
        k.a a11;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        a b11 = widgetInfo.b();
        k k11 = b11 != null ? b11.k() : null;
        int hashCode = dto.getDeeplink().hashCode();
        String text = dto.getText();
        long hashCode2 = ("SearchBar " + hashCode + " " + (text != null ? text.hashCode() : 0)).hashCode();
        String deeplink = dto.getDeeplink();
        String link = dto.getLink();
        String text2 = dto.getText();
        if (text2 == null) {
            text2 = "";
        }
        String str = text2;
        String placeholder = dto.getPlaceholder();
        String scanItDeeplink = dto.getScanItDeeplink();
        boolean scanItEnabled = dto.getScanItEnabled();
        SearchBarDTO.Colors colors = dto.getColors();
        String backgroundColor = colors != null ? colors.getBackgroundColor() : null;
        SearchBarDTO.Colors colors2 = dto.getColors();
        String searchBarTintColor = colors2 != null ? colors2.getSearchBarTintColor() : null;
        String b12 = (k11 == null || (a11 = k11.a()) == null) ? null : a11.b();
        SearchBarDTO.SearchButton searchButton2 = dto.getSearchButton();
        if (searchButton2 != null) {
            vo3 = SearchBarMapperKt.toVo(searchButton2);
            searchButton = vo3;
        } else {
            searchButton = null;
        }
        Map<String, TokenizedTrackingInfo> scanItTrackingInfo = dto.getScanItTrackingInfo();
        t b13 = scanItTrackingInfo != null ? x.b(scanItTrackingInfo, Long.valueOf(hashCode2), null) : null;
        Map<String, TokenizedTrackingInfo> voiceTrackingInfo = dto.getVoiceTrackingInfo();
        t b14 = voiceTrackingInfo != null ? x.b(voiceTrackingInfo, Long.valueOf(hashCode2), null) : null;
        Map<String, TokenizedTrackingInfo> searchBarTrackingInfo = dto.getSearchBarTrackingInfo();
        t b15 = searchBarTrackingInfo != null ? x.b(searchBarTrackingInfo, Long.valueOf(hashCode2), null) : null;
        Map<String, TokenizedTrackingInfo> keyboardSearchTrackingInfo = dto.getKeyboardSearchTrackingInfo();
        t b16 = keyboardSearchTrackingInfo != null ? x.b(keyboardSearchTrackingInfo, Long.valueOf(hashCode2), null) : null;
        vo = SearchBarMapperKt.toVo(dto.getReturnKeyType());
        Integer maxSearchQueryTextLength = dto.getMaxSearchQueryTextLength();
        float searchBarCornerRadius = getSearchBarCornerRadius(dto.getCornerRadius());
        Long searchDelay = dto.getSearchDelay();
        OnBoardingDTO onboarding = dto.getOnboarding();
        SearchBarDTO.Tooltip tooltip = dto.getTooltip();
        if (tooltip != null) {
            vo2 = SearchBarMapperKt.toVo(tooltip);
            tooltipVO = vo2;
        } else {
            tooltipVO = null;
        }
        Boolean isDynamicUpdateDisabled = dto.isDynamicUpdateDisabled();
        SearchBarDTO.SearchByImage searchByImage = dto.getSearchByImage();
        return C7714v.a0(new SearchBarVO(hashCode2, deeplink, link, str, placeholder, scanItDeeplink, scanItEnabled, backgroundColor, searchBarTintColor, b12, null, searchButton, b13, b14, b15, b16, vo, maxSearchQueryTextLength, searchDelay, searchBarCornerRadius, isDynamicUpdateDisabled, onboarding, tooltipVO, searchByImage != null ? SearchBarMapperKt.toVo(searchByImage, hashCode2) : null, dto.getDynamicOnScrollColors(), dto.getDynamicOnScrollColors() != null, dto.getMinTextLength(), dto.getRightButton(), UserVerificationMethods.USER_VERIFY_ALL, null));
    }
}
