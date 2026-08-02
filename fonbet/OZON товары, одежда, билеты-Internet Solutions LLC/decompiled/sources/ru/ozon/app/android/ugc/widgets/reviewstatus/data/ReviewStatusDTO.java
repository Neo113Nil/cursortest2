package ru.ozon.app.android.ugc.widgets.reviewstatus.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewstatus/data/ReviewStatusDTO;", "", "publicationStatus", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "promoStatus", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "getPublicationStatus", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPromoStatus", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewStatusDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3Atom.LargeBorderlessButton button;
    private final DisclaimerAtom promoStatus;

    @NotNull
    private final TextAtom publicationStatus;

    public ReviewStatusDTO(@NotNull TextAtom publicationStatus, DisclaimerAtom disclaimerAtom, @NotNull ButtonV3Atom.LargeBorderlessButton button) {
        Intrinsics.checkNotNullParameter(publicationStatus, "publicationStatus");
        Intrinsics.checkNotNullParameter(button, "button");
        this.publicationStatus = publicationStatus;
        this.promoStatus = disclaimerAtom;
        this.button = button;
    }

    public static /* synthetic */ ReviewStatusDTO copy$default(ReviewStatusDTO reviewStatusDTO, TextAtom textAtom, DisclaimerAtom disclaimerAtom, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = reviewStatusDTO.publicationStatus;
        }
        if ((i11 & 2) != 0) {
            disclaimerAtom = reviewStatusDTO.promoStatus;
        }
        if ((i11 & 4) != 0) {
            largeBorderlessButton = reviewStatusDTO.button;
        }
        return reviewStatusDTO.copy(textAtom, disclaimerAtom, largeBorderlessButton);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getPublicationStatus() {
        return this.publicationStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final DisclaimerAtom getPromoStatus() {
        return this.promoStatus;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.LargeBorderlessButton getButton() {
        return this.button;
    }

    @NotNull
    public final ReviewStatusDTO copy(@NotNull TextAtom publicationStatus, DisclaimerAtom promoStatus, @NotNull ButtonV3Atom.LargeBorderlessButton button) {
        Intrinsics.checkNotNullParameter(publicationStatus, "publicationStatus");
        Intrinsics.checkNotNullParameter(button, "button");
        return new ReviewStatusDTO(publicationStatus, promoStatus, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewStatusDTO)) {
            return false;
        }
        ReviewStatusDTO reviewStatusDTO = (ReviewStatusDTO) other;
        return Intrinsics.d(this.publicationStatus, reviewStatusDTO.publicationStatus) && Intrinsics.d(this.promoStatus, reviewStatusDTO.promoStatus) && Intrinsics.d(this.button, reviewStatusDTO.button);
    }

    @NotNull
    public final ButtonV3Atom.LargeBorderlessButton getButton() {
        return this.button;
    }

    public final DisclaimerAtom getPromoStatus() {
        return this.promoStatus;
    }

    @NotNull
    public final TextAtom getPublicationStatus() {
        return this.publicationStatus;
    }

    public int hashCode() {
        int hashCode = this.publicationStatus.hashCode() * 31;
        DisclaimerAtom disclaimerAtom = this.promoStatus;
        return this.button.hashCode() + ((hashCode + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "ReviewStatusDTO(publicationStatus=" + this.publicationStatus + ", promoStatus=" + this.promoStatus + ", button=" + this.button + ")";
    }
}
