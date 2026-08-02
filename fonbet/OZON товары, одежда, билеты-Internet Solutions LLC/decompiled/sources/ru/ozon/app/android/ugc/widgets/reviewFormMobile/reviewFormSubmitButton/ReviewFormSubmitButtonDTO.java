package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormSubmitButton;

import De.C2859b;
import Kk.C3532b;
import Pk0.f;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonDTO;", "", "productId", "", "submitButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "isBorderHidden", "", "isModal", "submitErrorTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;ZZLjava/util/Map;)V", "getProductId", "()Ljava/lang/String;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "()Z", "getSubmitErrorTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormSubmitButtonDTO {
    public static final int $stable = 8;
    private final boolean isBorderHidden;
    private final boolean isModal;

    @NotNull
    private final String productId;

    @NotNull
    private final ButtonV3DTO submitButton;
    private final Map<String, TokenizedTrackingInfo> submitErrorTrackingInfo;

    public ReviewFormSubmitButtonDTO(@NotNull String productId, @NotNull ButtonV3DTO submitButton, boolean z11, boolean z12, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.productId = productId;
        this.submitButton = submitButton;
        this.isBorderHidden = z11;
        this.isModal = z12;
        this.submitErrorTrackingInfo = map;
    }

    public static /* synthetic */ ReviewFormSubmitButtonDTO copy$default(ReviewFormSubmitButtonDTO reviewFormSubmitButtonDTO, String str, ButtonV3DTO buttonV3DTO, boolean z11, boolean z12, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reviewFormSubmitButtonDTO.productId;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = reviewFormSubmitButtonDTO.submitButton;
        }
        if ((i11 & 4) != 0) {
            z11 = reviewFormSubmitButtonDTO.isBorderHidden;
        }
        if ((i11 & 8) != 0) {
            z12 = reviewFormSubmitButtonDTO.isModal;
        }
        if ((i11 & 16) != 0) {
            map = reviewFormSubmitButtonDTO.submitErrorTrackingInfo;
        }
        Map map2 = map;
        boolean z13 = z11;
        return reviewFormSubmitButtonDTO.copy(str, buttonV3DTO, z13, z12, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsBorderHidden() {
        return this.isBorderHidden;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsModal() {
        return this.isModal;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.submitErrorTrackingInfo;
    }

    @NotNull
    public final ReviewFormSubmitButtonDTO copy(@NotNull String productId, @NotNull ButtonV3DTO submitButton, boolean isBorderHidden, boolean isModal, Map<String, TokenizedTrackingInfo> submitErrorTrackingInfo) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new ReviewFormSubmitButtonDTO(productId, submitButton, isBorderHidden, isModal, submitErrorTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormSubmitButtonDTO)) {
            return false;
        }
        ReviewFormSubmitButtonDTO reviewFormSubmitButtonDTO = (ReviewFormSubmitButtonDTO) other;
        return Intrinsics.d(this.productId, reviewFormSubmitButtonDTO.productId) && Intrinsics.d(this.submitButton, reviewFormSubmitButtonDTO.submitButton) && this.isBorderHidden == reviewFormSubmitButtonDTO.isBorderHidden && this.isModal == reviewFormSubmitButtonDTO.isModal && Intrinsics.d(this.submitErrorTrackingInfo, reviewFormSubmitButtonDTO.submitErrorTrackingInfo);
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public final Map<String, TokenizedTrackingInfo> getSubmitErrorTrackingInfo() {
        return this.submitErrorTrackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a(C3532b.a(C2859b.c(this.submitButton, this.productId.hashCode() * 31, 31), 31, this.isBorderHidden), 31, this.isModal);
        Map<String, TokenizedTrackingInfo> map = this.submitErrorTrackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    public final boolean isBorderHidden() {
        return this.isBorderHidden;
    }

    public final boolean isModal() {
        return this.isModal;
    }

    @NotNull
    public String toString() {
        String str = this.productId;
        ButtonV3DTO buttonV3DTO = this.submitButton;
        boolean z11 = this.isBorderHidden;
        boolean z12 = this.isModal;
        Map<String, TokenizedTrackingInfo> map = this.submitErrorTrackingInfo;
        StringBuilder sb2 = new StringBuilder("ReviewFormSubmitButtonDTO(productId=");
        sb2.append(str);
        sb2.append(", submitButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", isBorderHidden=");
        f.c(", isModal=", ", submitErrorTrackingInfo=", sb2, z11, z12);
        return P.f(sb2, map, ")");
    }
}
