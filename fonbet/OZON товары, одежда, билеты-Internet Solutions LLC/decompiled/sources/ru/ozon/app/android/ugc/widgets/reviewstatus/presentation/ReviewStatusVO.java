package ru.ozon.app.android.ugc.widgets.reviewstatus.presentation;

import Ns.b;
import TY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewstatus/presentation/ReviewStatusVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "publicationStatus", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "promoStatus", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "button", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getPublicationStatus", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getPromoStatus", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewStatusVO implements c {

    @NotNull
    private final ButtonV3Atom.LargeBorderlessButton button;
    private final long id;
    private final DisclaimerAtom promoStatus;

    @NotNull
    private final TextDTO publicationStatus;

    public ReviewStatusVO(long j11, @NotNull TextDTO publicationStatus, DisclaimerAtom disclaimerAtom, @NotNull ButtonV3Atom.LargeBorderlessButton button) {
        Intrinsics.checkNotNullParameter(publicationStatus, "publicationStatus");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.publicationStatus = publicationStatus;
        this.promoStatus = disclaimerAtom;
        this.button = button;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewStatusVO)) {
            return false;
        }
        ReviewStatusVO reviewStatusVO = (ReviewStatusVO) other;
        return this.id == reviewStatusVO.id && Intrinsics.d(this.publicationStatus, reviewStatusVO.publicationStatus) && Intrinsics.d(this.promoStatus, reviewStatusVO.promoStatus) && Intrinsics.d(this.button, reviewStatusVO.button);
    }

    @NotNull
    public final ButtonV3Atom.LargeBorderlessButton getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final DisclaimerAtom getPromoStatus() {
        return this.promoStatus;
    }

    @NotNull
    public final TextDTO getPublicationStatus() {
        return this.publicationStatus;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.publicationStatus, Long.hashCode(this.id) * 31, 31);
        DisclaimerAtom disclaimerAtom = this.promoStatus;
        return this.button.hashCode() + ((a11 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.publicationStatus;
        DisclaimerAtom disclaimerAtom = this.promoStatus;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.button;
        StringBuilder b11 = a.b("ReviewStatusVO(id=", j11, ", publicationStatus=", textDTO);
        b11.append(", promoStatus=");
        b11.append(disclaimerAtom);
        b11.append(", button=");
        b11.append(largeBorderlessButton);
        b11.append(")");
        return b11.toString();
    }
}
