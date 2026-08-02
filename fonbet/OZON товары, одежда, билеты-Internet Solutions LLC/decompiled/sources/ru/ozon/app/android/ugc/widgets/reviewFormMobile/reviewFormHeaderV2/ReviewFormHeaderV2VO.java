package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2;

import RZ.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.view.text.clickable.ClickableTextVO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0081\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u001aJ¢\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b0\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010@\u001a\u0004\bA\u0010\u001eR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0017\u00107\u001a\u0004\bE\u00109R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0018\u00107\u001a\u0004\bF\u00109¨\u0006G"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/ReviewFormHeaderV2VO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "productImage", "Lru/ozon/app/android/ugc/view/text/clickable/ClickableTextVO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;", "rating", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "closeButton", "LWZ/t;", "closeReviewFormEvent", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "submitOnBackConfig", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;", "placeholdersSheetConfig", "", "widgetToken", "LRZ/b;", "pageAnalyticsInfo", "viewEvent", "ratingTokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/app/android/ugc/view/text/clickable/ClickableTextVO;Lru/ozon/app/android/ugc/view/text/clickable/ClickableTextVO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;LWZ/t;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;Ljava/lang/String;LRZ/b;LWZ/t;LWZ/t;)V", "copy", "(JLru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/app/android/ugc/view/text/clickable/ClickableTextVO;Lru/ozon/app/android/ugc/view/text/clickable/ClickableTextVO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;LWZ/t;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;Ljava/lang/String;LRZ/b;LWZ/t;LWZ/t;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/ReviewFormHeaderV2VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getProductImage", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "Lru/ozon/app/android/ugc/view/text/clickable/ClickableTextVO;", "getTitle", "()Lru/ozon/app/android/ugc/view/text/clickable/ClickableTextVO;", "getSubtitle", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;", "getRating", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$RatingDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "LWZ/t;", "getCloseReviewFormEvent", "()LWZ/t;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "getSubmitOnBackConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;", "getPlaceholdersSheetConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;", "Ljava/lang/String;", "getWidgetToken", "LRZ/b;", "getPageAnalyticsInfo", "()LRZ/b;", "getViewEvent", "getRatingTokenizedEvent", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormHeaderV2VO implements c {

    @NotNull
    private final IconButtonV3DTO closeButton;
    private final t closeReviewFormEvent;
    private final long id;
    private final b pageAnalyticsInfo;
    private final ReviewFormHeaderVO.PlaceholdersSheetConfigVO placeholdersSheetConfig;

    @NotNull
    private final ProductMediaDTO productImage;

    @NotNull
    private final ReviewFormDTO.RatingDTO rating;
    private final t ratingTokenizedEvent;
    private final ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfig;
    private final ClickableTextVO subtitle;

    @NotNull
    private final ClickableTextVO title;
    private final t viewEvent;
    private final String widgetToken;

    public ReviewFormHeaderV2VO(long j11, @NotNull ProductMediaDTO productImage, @NotNull ClickableTextVO title, ClickableTextVO clickableTextVO, @NotNull ReviewFormDTO.RatingDTO rating, @NotNull IconButtonV3DTO closeButton, t tVar, ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfigVO, ReviewFormHeaderVO.PlaceholdersSheetConfigVO placeholdersSheetConfigVO, String str, b bVar, t tVar2, t tVar3) {
        Intrinsics.checkNotNullParameter(productImage, "productImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        this.id = j11;
        this.productImage = productImage;
        this.title = title;
        this.subtitle = clickableTextVO;
        this.rating = rating;
        this.closeButton = closeButton;
        this.closeReviewFormEvent = tVar;
        this.submitOnBackConfig = submitOnBackConfigVO;
        this.placeholdersSheetConfig = placeholdersSheetConfigVO;
        this.widgetToken = str;
        this.pageAnalyticsInfo = bVar;
        this.viewEvent = tVar2;
        this.ratingTokenizedEvent = tVar3;
    }

    @NotNull
    public final ReviewFormHeaderV2VO copy(long id2, @NotNull ProductMediaDTO productImage, @NotNull ClickableTextVO title, ClickableTextVO subtitle, @NotNull ReviewFormDTO.RatingDTO rating, @NotNull IconButtonV3DTO closeButton, t closeReviewFormEvent, ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfig, ReviewFormHeaderVO.PlaceholdersSheetConfigVO placeholdersSheetConfig, String widgetToken, b pageAnalyticsInfo, t viewEvent, t ratingTokenizedEvent) {
        Intrinsics.checkNotNullParameter(productImage, "productImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        return new ReviewFormHeaderV2VO(id2, productImage, title, subtitle, rating, closeButton, closeReviewFormEvent, submitOnBackConfig, placeholdersSheetConfig, widgetToken, pageAnalyticsInfo, viewEvent, ratingTokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormHeaderV2VO)) {
            return false;
        }
        ReviewFormHeaderV2VO reviewFormHeaderV2VO = (ReviewFormHeaderV2VO) other;
        return this.id == reviewFormHeaderV2VO.id && Intrinsics.d(this.productImage, reviewFormHeaderV2VO.productImage) && Intrinsics.d(this.title, reviewFormHeaderV2VO.title) && Intrinsics.d(this.subtitle, reviewFormHeaderV2VO.subtitle) && Intrinsics.d(this.rating, reviewFormHeaderV2VO.rating) && Intrinsics.d(this.closeButton, reviewFormHeaderV2VO.closeButton) && Intrinsics.d(this.closeReviewFormEvent, reviewFormHeaderV2VO.closeReviewFormEvent) && Intrinsics.d(this.submitOnBackConfig, reviewFormHeaderV2VO.submitOnBackConfig) && Intrinsics.d(this.placeholdersSheetConfig, reviewFormHeaderV2VO.placeholdersSheetConfig) && Intrinsics.d(this.widgetToken, reviewFormHeaderV2VO.widgetToken) && Intrinsics.d(this.pageAnalyticsInfo, reviewFormHeaderV2VO.pageAnalyticsInfo) && Intrinsics.d(this.viewEvent, reviewFormHeaderV2VO.viewEvent) && Intrinsics.d(this.ratingTokenizedEvent, reviewFormHeaderV2VO.ratingTokenizedEvent);
    }

    @NotNull
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final b getPageAnalyticsInfo() {
        return this.pageAnalyticsInfo;
    }

    @NotNull
    public final ProductMediaDTO getProductImage() {
        return this.productImage;
    }

    @NotNull
    public final ReviewFormDTO.RatingDTO getRating() {
        return this.rating;
    }

    public final t getRatingTokenizedEvent() {
        return this.ratingTokenizedEvent;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ReviewFormHeaderVO.SubmitOnBackConfigVO getSubmitOnBackConfig() {
        return this.submitOnBackConfig;
    }

    public final ClickableTextVO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final ClickableTextVO getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final String getWidgetToken() {
        return this.widgetToken;
    }

    public int hashCode() {
        int hashCode = (this.title.hashCode() + ((this.productImage.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31;
        ClickableTextVO clickableTextVO = this.subtitle;
        int c11 = GR.b.c(this.closeButton, (this.rating.hashCode() + ((hashCode + (clickableTextVO == null ? 0 : clickableTextVO.hashCode())) * 31)) * 31, 31);
        t tVar = this.closeReviewFormEvent;
        int hashCode2 = (c11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfigVO = this.submitOnBackConfig;
        int hashCode3 = (hashCode2 + (submitOnBackConfigVO == null ? 0 : submitOnBackConfigVO.hashCode())) * 31;
        ReviewFormHeaderVO.PlaceholdersSheetConfigVO placeholdersSheetConfigVO = this.placeholdersSheetConfig;
        int hashCode4 = (hashCode3 + (placeholdersSheetConfigVO == null ? 0 : placeholdersSheetConfigVO.hashCode())) * 31;
        String str = this.widgetToken;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.pageAnalyticsInfo;
        int hashCode6 = (hashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        t tVar2 = this.viewEvent;
        int hashCode7 = (hashCode6 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        t tVar3 = this.ratingTokenizedEvent;
        return hashCode7 + (tVar3 != null ? tVar3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ProductMediaDTO productMediaDTO = this.productImage;
        ClickableTextVO clickableTextVO = this.title;
        ClickableTextVO clickableTextVO2 = this.subtitle;
        ReviewFormDTO.RatingDTO ratingDTO = this.rating;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        t tVar = this.closeReviewFormEvent;
        ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfigVO = this.submitOnBackConfig;
        ReviewFormHeaderVO.PlaceholdersSheetConfigVO placeholdersSheetConfigVO = this.placeholdersSheetConfig;
        String str = this.widgetToken;
        b bVar = this.pageAnalyticsInfo;
        t tVar2 = this.viewEvent;
        t tVar3 = this.ratingTokenizedEvent;
        StringBuilder sb2 = new StringBuilder("ReviewFormHeaderV2VO(id=");
        sb2.append(j11);
        sb2.append(", productImage=");
        sb2.append(productMediaDTO);
        sb2.append(", title=");
        sb2.append(clickableTextVO);
        sb2.append(", subtitle=");
        sb2.append(clickableTextVO2);
        sb2.append(", rating=");
        sb2.append(ratingDTO);
        sb2.append(", closeButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", closeReviewFormEvent=");
        sb2.append(tVar);
        sb2.append(", submitOnBackConfig=");
        sb2.append(submitOnBackConfigVO);
        sb2.append(", placeholdersSheetConfig=");
        sb2.append(placeholdersSheetConfigVO);
        sb2.append(", widgetToken=");
        sb2.append(str);
        sb2.append(", pageAnalyticsInfo=");
        sb2.append(bVar);
        sb2.append(", viewEvent=");
        sb2.append(tVar2);
        return Lh.a.b(sb2, ", ratingTokenizedEvent=", tVar3, ")");
    }
}
