package ru.ozon.app.android.search.widgets.searchbar.core;

import WZ.t;
import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.domain.flags.RedesignedSearchBarEnabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarDTO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.utils.SearchBarUtilsKt;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/core/ActiveSearchBarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO;Ll20/d;)Ljava/util/List;", "", "cornerRadius", "", "getSearchBarCornerRadius", "(Ljava/lang/Integer;)F", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActiveSearchBarMapper implements Function2<SearchBarDTO, d, List<? extends ActiveSearchBarVO>> {

    @NotNull
    private final AppType appType;

    @NotNull
    private final FeatureChecker featureChecker;

    public ActiveSearchBarMapper(@NotNull AppType appType, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.appType = appType;
        this.featureChecker = featureChecker;
    }

    public final float getSearchBarCornerRadius(Integer cornerRadius) {
        if (cornerRadius != null) {
            return UiExtKt.toPxF(cornerRadius.intValue());
        }
        return SearchBarUtilsKt.getSearchBarDefaultRadius(this.appType == AppType.SELECT, this.featureChecker.isEnabled(RedesignedSearchBarEnabled.INSTANCE));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ActiveSearchBarVO> invoke(@NotNull SearchBarDTO dto, @NotNull d widgetInfo) {
        SearchBarVO.ReturnKeyType vo;
        ActiveSearchBarVO.SearchByImageVO searchByImageVO;
        ActiveSearchBarVO.SearchByImageVO vo2;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        int hashCode = dto.getDeeplink().hashCode();
        String text = dto.getText();
        long hashCode2 = ("ActiveSearchBar " + hashCode + " " + (text != null ? text.hashCode() : 0)).hashCode();
        String text2 = dto.getText();
        if (text2 == null) {
            text2 = "";
        }
        String str = text2;
        String placeholder = dto.getPlaceholder();
        String deeplink = dto.getDeeplink();
        String link = dto.getLink();
        vo = ActiveSearchBarMapperKt.toVo(dto.getReturnKeyType());
        Map<String, TokenizedTrackingInfo> keyboardSearchTrackingInfo = dto.getKeyboardSearchTrackingInfo();
        t b11 = keyboardSearchTrackingInfo != null ? x.b(keyboardSearchTrackingInfo, Long.valueOf(hashCode2), null) : null;
        float searchBarCornerRadius = getSearchBarCornerRadius(dto.getCornerRadius());
        SearchBarDTO.Colors colors = dto.getColors();
        String backgroundColor = colors != null ? colors.getBackgroundColor() : null;
        SearchBarDTO.Colors colors2 = dto.getColors();
        String searchBarTintColor = colors2 != null ? colors2.getSearchBarTintColor() : null;
        Long searchDelay = dto.getSearchDelay();
        Integer maxSearchQueryTextLength = dto.getMaxSearchQueryTextLength();
        Boolean isDynamicUpdateDisabled = dto.isDynamicUpdateDisabled();
        SearchBarDTO.SearchByImage searchByImage = dto.getSearchByImage();
        if (searchByImage != null) {
            vo2 = ActiveSearchBarMapperKt.toVo(searchByImage, hashCode2);
            searchByImageVO = vo2;
        } else {
            searchByImageVO = null;
        }
        return C7714v.a0(new ActiveSearchBarVO(hashCode2, str, placeholder, deeplink, link, vo, b11, searchDelay, searchBarCornerRadius, backgroundColor, searchBarTintColor, maxSearchQueryTextLength, isDynamicUpdateDisabled, searchByImageVO, dto.getMinTextLength()));
    }
}
