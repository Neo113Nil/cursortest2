package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation;

import Ns.b;
import TY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2HeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "additionalButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "additionalButtonAtom", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "getAdditionalButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAdditionalButtonAtom", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AspectCompactV2HeaderVO implements c {
    public static final int $stable = ButtonV3Atom.SmallBorderlessButtonWithIcon.$stable;
    private final ButtonV3Atom.SmallBorderlessButtonWithIcon additionalButton;
    private final ButtonV3DTO additionalButtonAtom;
    private final long id;

    @NotNull
    private final TextDTO title;

    public AspectCompactV2HeaderVO(long j11, @NotNull TextDTO title, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon, ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.additionalButton = smallBorderlessButtonWithIcon;
        this.additionalButtonAtom = buttonV3DTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspectCompactV2HeaderVO)) {
            return false;
        }
        AspectCompactV2HeaderVO aspectCompactV2HeaderVO = (AspectCompactV2HeaderVO) other;
        return this.id == aspectCompactV2HeaderVO.id && Intrinsics.d(this.title, aspectCompactV2HeaderVO.title) && Intrinsics.d(this.additionalButton, aspectCompactV2HeaderVO.additionalButton) && Intrinsics.d(this.additionalButtonAtom, aspectCompactV2HeaderVO.additionalButtonAtom);
    }

    public final ButtonV3Atom.SmallBorderlessButtonWithIcon getAdditionalButton() {
        return this.additionalButton;
    }

    public final ButtonV3DTO getAdditionalButtonAtom() {
        return this.additionalButtonAtom;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = this.additionalButton;
        int hashCode = (a11 + (smallBorderlessButtonWithIcon == null ? 0 : smallBorderlessButtonWithIcon.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.additionalButtonAtom;
        return hashCode + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = this.additionalButton;
        ButtonV3DTO buttonV3DTO = this.additionalButtonAtom;
        StringBuilder b11 = a.b("AspectCompactV2HeaderVO(id=", j11, ", title=", textDTO);
        b11.append(", additionalButton=");
        b11.append(smallBorderlessButtonWithIcon);
        b11.append(", additionalButtonAtom=");
        b11.append(buttonV3DTO);
        b11.append(")");
        return b11.toString();
    }
}
