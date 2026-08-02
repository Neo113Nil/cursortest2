package ru.ozon.app.android.search.widgets.searchCategoryHeader.data;

import Ak.C2436a;
import B90.C2619v;
import Ih.a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003JW\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lru/ozon/app/android/search/widgets/searchCategoryHeader/data/SearchCategoryHeaderDTO;", "", "categoryName", "", "productsTotal", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "selectionAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "searchEverywhereButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "onboarding", "Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;Ljava/util/Map;)V", "getCategoryName", "()Ljava/lang/String;", "getProductsTotal", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSelectionAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getSearchEverywhereButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getOnboarding", "()Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchCategoryHeaderDTO {
    public static final int $stable = 8;

    @NotNull
    private final String categoryName;
    private final OnboardingModel onboarding;

    @NotNull
    private final TextAtom productsTotal;
    private final ButtonV3DTO searchEverywhereButton;

    @NotNull
    private final AtomActionDTO selectionAction;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public SearchCategoryHeaderDTO(@NotNull String categoryName, @NotNull TextAtom productsTotal, @NotNull AtomActionDTO selectionAction, ButtonV3DTO buttonV3DTO, OnboardingModel onboardingModel, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        Intrinsics.checkNotNullParameter(productsTotal, "productsTotal");
        Intrinsics.checkNotNullParameter(selectionAction, "selectionAction");
        this.categoryName = categoryName;
        this.productsTotal = productsTotal;
        this.selectionAction = selectionAction;
        this.searchEverywhereButton = buttonV3DTO;
        this.onboarding = onboardingModel;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SearchCategoryHeaderDTO copy$default(SearchCategoryHeaderDTO searchCategoryHeaderDTO, String str, TextAtom textAtom, AtomActionDTO atomActionDTO, ButtonV3DTO buttonV3DTO, OnboardingModel onboardingModel, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchCategoryHeaderDTO.categoryName;
        }
        if ((i11 & 2) != 0) {
            textAtom = searchCategoryHeaderDTO.productsTotal;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = searchCategoryHeaderDTO.selectionAction;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = searchCategoryHeaderDTO.searchEverywhereButton;
        }
        if ((i11 & 16) != 0) {
            onboardingModel = searchCategoryHeaderDTO.onboarding;
        }
        if ((i11 & 32) != 0) {
            map = searchCategoryHeaderDTO.trackingInfo;
        }
        OnboardingModel onboardingModel2 = onboardingModel;
        Map map2 = map;
        return searchCategoryHeaderDTO.copy(str, textAtom, atomActionDTO, buttonV3DTO, onboardingModel2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getProductsTotal() {
        return this.productsTotal;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getSelectionAction() {
        return this.selectionAction;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getSearchEverywhereButton() {
        return this.searchEverywhereButton;
    }

    /* renamed from: component5, reason: from getter */
    public final OnboardingModel getOnboarding() {
        return this.onboarding;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final SearchCategoryHeaderDTO copy(@NotNull String categoryName, @NotNull TextAtom productsTotal, @NotNull AtomActionDTO selectionAction, ButtonV3DTO searchEverywhereButton, OnboardingModel onboarding, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        Intrinsics.checkNotNullParameter(productsTotal, "productsTotal");
        Intrinsics.checkNotNullParameter(selectionAction, "selectionAction");
        return new SearchCategoryHeaderDTO(categoryName, productsTotal, selectionAction, searchEverywhereButton, onboarding, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchCategoryHeaderDTO)) {
            return false;
        }
        SearchCategoryHeaderDTO searchCategoryHeaderDTO = (SearchCategoryHeaderDTO) other;
        return Intrinsics.d(this.categoryName, searchCategoryHeaderDTO.categoryName) && Intrinsics.d(this.productsTotal, searchCategoryHeaderDTO.productsTotal) && Intrinsics.d(this.selectionAction, searchCategoryHeaderDTO.selectionAction) && Intrinsics.d(this.searchEverywhereButton, searchCategoryHeaderDTO.searchEverywhereButton) && Intrinsics.d(this.onboarding, searchCategoryHeaderDTO.onboarding) && Intrinsics.d(this.trackingInfo, searchCategoryHeaderDTO.trackingInfo);
    }

    @NotNull
    public final String getCategoryName() {
        return this.categoryName;
    }

    public final OnboardingModel getOnboarding() {
        return this.onboarding;
    }

    @NotNull
    public final TextAtom getProductsTotal() {
        return this.productsTotal;
    }

    public final ButtonV3DTO getSearchEverywhereButton() {
        return this.searchEverywhereButton;
    }

    @NotNull
    public final AtomActionDTO getSelectionAction() {
        return this.selectionAction;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = a.b(this.selectionAction, C2619v.b(this.categoryName.hashCode() * 31, 31, this.productsTotal), 31);
        ButtonV3DTO buttonV3DTO = this.searchEverywhereButton;
        int hashCode = (b11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        OnboardingModel onboardingModel = this.onboarding;
        int hashCode2 = (hashCode + (onboardingModel == null ? 0 : onboardingModel.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.categoryName;
        TextAtom textAtom = this.productsTotal;
        AtomActionDTO atomActionDTO = this.selectionAction;
        ButtonV3DTO buttonV3DTO = this.searchEverywhereButton;
        OnboardingModel onboardingModel = this.onboarding;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C2436a.d("SearchCategoryHeaderDTO(categoryName=", str, ", productsTotal=", ", selectionAction=", textAtom);
        d11.append(atomActionDTO);
        d11.append(", searchEverywhereButton=");
        d11.append(buttonV3DTO);
        d11.append(", onboarding=");
        d11.append(onboardingModel);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }
}
