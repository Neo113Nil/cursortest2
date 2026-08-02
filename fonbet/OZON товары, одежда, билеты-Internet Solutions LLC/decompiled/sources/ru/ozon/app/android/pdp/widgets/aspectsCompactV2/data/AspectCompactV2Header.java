package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectCompactV2Header;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "additionalButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "additionalButtonAtom", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "getAdditionalButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAdditionalButtonAtom", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AspectCompactV2Header {
    public static final int $stable = ButtonV3Atom.SmallBorderlessButtonWithIcon.$stable;
    private final ButtonV3Atom.SmallBorderlessButtonWithIcon additionalButton;
    private final ButtonV3DTO additionalButtonAtom;

    @NotNull
    private final TextDTO title;

    public AspectCompactV2Header(@NotNull TextDTO title, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon, ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.additionalButton = smallBorderlessButtonWithIcon;
        this.additionalButtonAtom = buttonV3DTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspectCompactV2Header)) {
            return false;
        }
        AspectCompactV2Header aspectCompactV2Header = (AspectCompactV2Header) other;
        return Intrinsics.d(this.title, aspectCompactV2Header.title) && Intrinsics.d(this.additionalButton, aspectCompactV2Header.additionalButton) && Intrinsics.d(this.additionalButtonAtom, aspectCompactV2Header.additionalButtonAtom);
    }

    public final ButtonV3Atom.SmallBorderlessButtonWithIcon getAdditionalButton() {
        return this.additionalButton;
    }

    public final ButtonV3DTO getAdditionalButtonAtom() {
        return this.additionalButtonAtom;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = this.additionalButton;
        int hashCode2 = (hashCode + (smallBorderlessButtonWithIcon == null ? 0 : smallBorderlessButtonWithIcon.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.additionalButtonAtom;
        return hashCode2 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AspectCompactV2Header(title=" + this.title + ", additionalButton=" + this.additionalButton + ", additionalButtonAtom=" + this.additionalButtonAtom + ")";
    }
}
