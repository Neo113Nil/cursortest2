package ru.ozon.app.android.pdp.widgets.delivery.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryHeader;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "button", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "annotation", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryHeader {
    private final DisclaimerAtom annotation;
    private final ButtonV3Atom.SmallBorderlessButton button;
    private final TextDTO title;

    public DeliveryHeader(TextDTO textDTO, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, DisclaimerAtom disclaimerAtom) {
        this.title = textDTO;
        this.button = smallBorderlessButton;
        this.annotation = disclaimerAtom;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryHeader)) {
            return false;
        }
        DeliveryHeader deliveryHeader = (DeliveryHeader) other;
        return Intrinsics.d(this.title, deliveryHeader.title) && Intrinsics.d(this.button, deliveryHeader.button) && Intrinsics.d(this.annotation, deliveryHeader.annotation);
    }

    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    public final ButtonV3Atom.SmallBorderlessButton getButton() {
        return this.button;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.button;
        int hashCode2 = (hashCode + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode())) * 31;
        DisclaimerAtom disclaimerAtom = this.annotation;
        return hashCode2 + (disclaimerAtom != null ? disclaimerAtom.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeliveryHeader(title=" + this.title + ", button=" + this.button + ", annotation=" + this.annotation + ")";
    }
}
