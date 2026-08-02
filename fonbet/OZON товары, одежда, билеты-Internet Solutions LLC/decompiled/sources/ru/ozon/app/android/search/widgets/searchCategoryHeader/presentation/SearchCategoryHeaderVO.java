package ru.ozon.app.android.search.widgets.searchCategoryHeader.presentation;

import Ak.C2436a;
import B90.C2619v;
import G.g;
import Lh.a;
import Ve.C4598rp;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/SearchCategoryHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "categoryName", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "productsTotal", "Lru/ozon/uni/atoms/af/AtomAction;", "selectionAction", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "searchEverywhereButton", "Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "onboarding", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getCategoryName", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getProductsTotal", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/af/AtomAction;", "getSelectionAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSearchEverywhereButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "getOnboarding", "()Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchCategoryHeaderVO implements c {

    @NotNull
    private final String categoryName;
    private final long id;
    private final OnboardingModel onboarding;

    @NotNull
    private final TextAtom productsTotal;
    private final ButtonV3DTO searchEverywhereButton;

    @NotNull
    private final AtomAction selectionAction;
    private final t tokenizedEvent;

    public SearchCategoryHeaderVO(long j11, @NotNull String categoryName, @NotNull TextAtom productsTotal, @NotNull AtomAction selectionAction, ButtonV3DTO buttonV3DTO, OnboardingModel onboardingModel, t tVar) {
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        Intrinsics.checkNotNullParameter(productsTotal, "productsTotal");
        Intrinsics.checkNotNullParameter(selectionAction, "selectionAction");
        this.id = j11;
        this.categoryName = categoryName;
        this.productsTotal = productsTotal;
        this.selectionAction = selectionAction;
        this.searchEverywhereButton = buttonV3DTO;
        this.onboarding = onboardingModel;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchCategoryHeaderVO)) {
            return false;
        }
        SearchCategoryHeaderVO searchCategoryHeaderVO = (SearchCategoryHeaderVO) other;
        return this.id == searchCategoryHeaderVO.id && Intrinsics.d(this.categoryName, searchCategoryHeaderVO.categoryName) && Intrinsics.d(this.productsTotal, searchCategoryHeaderVO.productsTotal) && Intrinsics.d(this.selectionAction, searchCategoryHeaderVO.selectionAction) && Intrinsics.d(this.searchEverywhereButton, searchCategoryHeaderVO.searchEverywhereButton) && Intrinsics.d(this.onboarding, searchCategoryHeaderVO.onboarding) && Intrinsics.d(this.tokenizedEvent, searchCategoryHeaderVO.tokenizedEvent);
    }

    @NotNull
    public final String getCategoryName() {
        return this.categoryName;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final OnboardingModel getOnboarding() {
        return this.onboarding;
    }

    @NotNull
    public final TextAtom getProductsTotal() {
        return this.productsTotal;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ButtonV3DTO getSearchEverywhereButton() {
        return this.searchEverywhereButton;
    }

    @NotNull
    public final AtomAction getSelectionAction() {
        return this.selectionAction;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C4598rp.a(this.selectionAction, C2619v.b(g.a(Long.hashCode(this.id) * 31, 31, this.categoryName), 31, this.productsTotal), 31);
        ButtonV3DTO buttonV3DTO = this.searchEverywhereButton;
        int hashCode = (a11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        OnboardingModel onboardingModel = this.onboarding;
        int hashCode2 = (hashCode + (onboardingModel == null ? 0 : onboardingModel.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.categoryName;
        TextAtom textAtom = this.productsTotal;
        AtomAction atomAction = this.selectionAction;
        ButtonV3DTO buttonV3DTO = this.searchEverywhereButton;
        OnboardingModel onboardingModel = this.onboarding;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "SearchCategoryHeaderVO(id=", ", categoryName=", str);
        c11.append(", productsTotal=");
        c11.append(textAtom);
        c11.append(", selectionAction=");
        c11.append(atomAction);
        c11.append(", searchEverywhereButton=");
        c11.append(buttonV3DTO);
        c11.append(", onboarding=");
        c11.append(onboardingModel);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
