package ru.ozon.app.android.search.widgets.searchCategoryHeader.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.search.widgets.searchCategoryHeader.presentation.SearchCategoryHeaderVO;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/search/widgets/searchCategoryHeader/data/SearchCategoryHeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/widgets/searchCategoryHeader/data/SearchCategoryHeaderDTO;", "Ll20/d;", "", "Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/SearchCategoryHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVO", "(Lru/ozon/app/android/search/widgets/searchCategoryHeader/data/SearchCategoryHeaderDTO;J)Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/SearchCategoryHeaderVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/widgets/searchCategoryHeader/data/SearchCategoryHeaderDTO;Ll20/d;)Ljava/util/List;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchCategoryHeaderMapper implements Function2<SearchCategoryHeaderDTO, d, List<? extends SearchCategoryHeaderVO>> {
    private final SearchCategoryHeaderVO toVO(SearchCategoryHeaderDTO searchCategoryHeaderDTO, long j11) {
        String categoryName = searchCategoryHeaderDTO.getCategoryName();
        TextAtom productsTotal = searchCategoryHeaderDTO.getProductsTotal();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(searchCategoryHeaderDTO.getSelectionAction(), searchCategoryHeaderDTO.getTrackingInfo());
        ButtonV3DTO searchEverywhereButton = searchCategoryHeaderDTO.getSearchEverywhereButton();
        OnboardingModel onboarding = searchCategoryHeaderDTO.getOnboarding();
        Map<String, TokenizedTrackingInfo> trackingInfo = searchCategoryHeaderDTO.getTrackingInfo();
        return new SearchCategoryHeaderVO(j11, categoryName, productsTotal, atomAction, searchEverywhereButton, onboarding, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SearchCategoryHeaderVO> invoke(@NotNull SearchCategoryHeaderDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.c0(toVO(state, widgetInfo.d().hashCode()));
    }
}
