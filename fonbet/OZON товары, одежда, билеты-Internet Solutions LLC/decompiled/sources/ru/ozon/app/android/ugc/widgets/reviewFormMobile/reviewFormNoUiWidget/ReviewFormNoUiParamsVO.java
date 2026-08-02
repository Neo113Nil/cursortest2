package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormNoUiWidget;

import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderVO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormNoUiWidget/ReviewFormNoUiParamsVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "submitOnBackConfig", "LWZ/t;", "closeReviewFormEvent", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;", "placeholdersSheetConfig", "<init>", "(JLru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;LWZ/t;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "getSubmitOnBackConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "LWZ/t;", "getCloseReviewFormEvent", "()LWZ/t;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;", "getPlaceholdersSheetConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormNoUiParamsVO implements c {
    private final t closeReviewFormEvent;
    private final long id;
    private final ReviewFormHeaderVO.PlaceholdersSheetConfigVO placeholdersSheetConfig;
    private final ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfig;

    public ReviewFormNoUiParamsVO(long j11, ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfigVO, t tVar, ReviewFormHeaderVO.PlaceholdersSheetConfigVO placeholdersSheetConfigVO) {
        this.id = j11;
        this.submitOnBackConfig = submitOnBackConfigVO;
        this.closeReviewFormEvent = tVar;
        this.placeholdersSheetConfig = placeholdersSheetConfigVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormNoUiParamsVO)) {
            return false;
        }
        ReviewFormNoUiParamsVO reviewFormNoUiParamsVO = (ReviewFormNoUiParamsVO) other;
        return this.id == reviewFormNoUiParamsVO.id && Intrinsics.d(this.submitOnBackConfig, reviewFormNoUiParamsVO.submitOnBackConfig) && Intrinsics.d(this.closeReviewFormEvent, reviewFormNoUiParamsVO.closeReviewFormEvent) && Intrinsics.d(this.placeholdersSheetConfig, reviewFormNoUiParamsVO.placeholdersSheetConfig);
    }

    public final t getCloseReviewFormEvent() {
        return this.closeReviewFormEvent;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ReviewFormHeaderVO.PlaceholdersSheetConfigVO getPlaceholdersSheetConfig() {
        return this.placeholdersSheetConfig;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ReviewFormHeaderVO.SubmitOnBackConfigVO getSubmitOnBackConfig() {
        return this.submitOnBackConfig;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfigVO = this.submitOnBackConfig;
        int hashCode2 = (hashCode + (submitOnBackConfigVO == null ? 0 : submitOnBackConfigVO.hashCode())) * 31;
        t tVar = this.closeReviewFormEvent;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        ReviewFormHeaderVO.PlaceholdersSheetConfigVO placeholdersSheetConfigVO = this.placeholdersSheetConfig;
        return hashCode3 + (placeholdersSheetConfigVO != null ? placeholdersSheetConfigVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReviewFormNoUiParamsVO(id=" + this.id + ", submitOnBackConfig=" + this.submitOnBackConfig + ", closeReviewFormEvent=" + this.closeReviewFormEvent + ", placeholdersSheetConfig=" + this.placeholdersSheetConfig + ")";
    }
}
