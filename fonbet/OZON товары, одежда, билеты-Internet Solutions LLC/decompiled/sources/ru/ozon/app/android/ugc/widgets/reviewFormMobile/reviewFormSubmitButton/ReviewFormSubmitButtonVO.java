package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormSubmitButton;

import Ak.C2436a;
import De.C2859b;
import El.C2971a;
import G.g;
import Kk.C3532b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJN\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b\n\u0010$R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b\u000b\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "productId", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "submitButton", "", "isBorderHidden", "isModal", "LWZ/t;", "submitErrorEvent", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;ZZLWZ/t;)V", "copy", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;ZZLWZ/t;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getProductId", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Z", "()Z", "LWZ/t;", "getSubmitErrorEvent", "()LWZ/t;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormSubmitButtonVO implements c {
    private final long id;
    private final boolean isBorderHidden;
    private final boolean isModal;

    @NotNull
    private final String productId;

    @NotNull
    private final ButtonV3DTO submitButton;
    private final t submitErrorEvent;

    public ReviewFormSubmitButtonVO(long j11, @NotNull String productId, @NotNull ButtonV3DTO submitButton, boolean z11, boolean z12, t tVar) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.id = j11;
        this.productId = productId;
        this.submitButton = submitButton;
        this.isBorderHidden = z11;
        this.isModal = z12;
        this.submitErrorEvent = tVar;
    }

    public static /* synthetic */ ReviewFormSubmitButtonVO copy$default(ReviewFormSubmitButtonVO reviewFormSubmitButtonVO, long j11, String str, ButtonV3DTO buttonV3DTO, boolean z11, boolean z12, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = reviewFormSubmitButtonVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = reviewFormSubmitButtonVO.productId;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            buttonV3DTO = reviewFormSubmitButtonVO.submitButton;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        if ((i11 & 8) != 0) {
            z11 = reviewFormSubmitButtonVO.isBorderHidden;
        }
        boolean z13 = z11;
        if ((i11 & 16) != 0) {
            z12 = reviewFormSubmitButtonVO.isModal;
        }
        boolean z14 = z12;
        if ((i11 & 32) != 0) {
            tVar = reviewFormSubmitButtonVO.submitErrorEvent;
        }
        return reviewFormSubmitButtonVO.copy(j12, str2, buttonV3DTO2, z13, z14, tVar);
    }

    @NotNull
    public final ReviewFormSubmitButtonVO copy(long id2, @NotNull String productId, @NotNull ButtonV3DTO submitButton, boolean isBorderHidden, boolean isModal, t submitErrorEvent) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new ReviewFormSubmitButtonVO(id2, productId, submitButton, isBorderHidden, isModal, submitErrorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormSubmitButtonVO)) {
            return false;
        }
        ReviewFormSubmitButtonVO reviewFormSubmitButtonVO = (ReviewFormSubmitButtonVO) other;
        return this.id == reviewFormSubmitButtonVO.id && Intrinsics.d(this.productId, reviewFormSubmitButtonVO.productId) && Intrinsics.d(this.submitButton, reviewFormSubmitButtonVO.submitButton) && this.isBorderHidden == reviewFormSubmitButtonVO.isBorderHidden && this.isModal == reviewFormSubmitButtonVO.isModal && Intrinsics.d(this.submitErrorEvent, reviewFormSubmitButtonVO.submitErrorEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public final t getSubmitErrorEvent() {
        return this.submitErrorEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(C3532b.a(C2859b.c(this.submitButton, g.a(Long.hashCode(this.id) * 31, 31, this.productId), 31), 31, this.isBorderHidden), 31, this.isModal);
        t tVar = this.submitErrorEvent;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    /* renamed from: isBorderHidden, reason: from getter */
    public final boolean getIsBorderHidden() {
        return this.isBorderHidden;
    }

    /* renamed from: isModal, reason: from getter */
    public final boolean getIsModal() {
        return this.isModal;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.productId;
        ButtonV3DTO buttonV3DTO = this.submitButton;
        boolean z11 = this.isBorderHidden;
        boolean z12 = this.isModal;
        t tVar = this.submitErrorEvent;
        StringBuilder c11 = C2436a.c(j11, "ReviewFormSubmitButtonVO(id=", ", productId=", str);
        c11.append(", submitButton=");
        c11.append(buttonV3DTO);
        c11.append(", isBorderHidden=");
        c11.append(z11);
        C2971a.d(c11, ", isModal=", z12, ", submitErrorEvent=", tVar);
        c11.append(")");
        return c11.toString();
    }
}
