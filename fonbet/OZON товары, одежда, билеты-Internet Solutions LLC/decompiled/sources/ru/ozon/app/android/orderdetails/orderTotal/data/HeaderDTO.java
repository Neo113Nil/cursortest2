package ru.ozon.app.android.orderdetails.orderTotal.data;

import B90.C2619v;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/data/HeaderDTO;", "", "titleLines", "", "Lru/ozon/app/android/orderdetails/orderTotal/data/LineDTO;", "atomSubtitle", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "icon", "", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/lang/String;)V", "getTitleLines", "()Ljava/util/List;", "getAtomSubtitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getIcon", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HeaderDTO {
    public static final int $stable = 8;

    @NotNull
    private final TextAtom atomSubtitle;
    private final ButtonV3Atom.LargeBorderlessButton button;

    @NotNull
    private final String icon;

    @NotNull
    private final List<LineDTO> titleLines;

    public HeaderDTO(@NotNull List<LineDTO> titleLines, @NotNull TextAtom atomSubtitle, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, @NotNull String icon) {
        Intrinsics.checkNotNullParameter(titleLines, "titleLines");
        Intrinsics.checkNotNullParameter(atomSubtitle, "atomSubtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.titleLines = titleLines;
        this.atomSubtitle = atomSubtitle;
        this.button = largeBorderlessButton;
        this.icon = icon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, List list, TextAtom textAtom, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = headerDTO.titleLines;
        }
        if ((i11 & 2) != 0) {
            textAtom = headerDTO.atomSubtitle;
        }
        if ((i11 & 4) != 0) {
            largeBorderlessButton = headerDTO.button;
        }
        if ((i11 & 8) != 0) {
            str = headerDTO.icon;
        }
        return headerDTO.copy(list, textAtom, largeBorderlessButton, str);
    }

    @NotNull
    public final List<LineDTO> component1() {
        return this.titleLines;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getAtomSubtitle() {
        return this.atomSubtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.LargeBorderlessButton getButton() {
        return this.button;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final HeaderDTO copy(@NotNull List<LineDTO> titleLines, @NotNull TextAtom atomSubtitle, ButtonV3Atom.LargeBorderlessButton button, @NotNull String icon) {
        Intrinsics.checkNotNullParameter(titleLines, "titleLines");
        Intrinsics.checkNotNullParameter(atomSubtitle, "atomSubtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new HeaderDTO(titleLines, atomSubtitle, button, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderDTO)) {
            return false;
        }
        HeaderDTO headerDTO = (HeaderDTO) other;
        return Intrinsics.d(this.titleLines, headerDTO.titleLines) && Intrinsics.d(this.atomSubtitle, headerDTO.atomSubtitle) && Intrinsics.d(this.button, headerDTO.button) && Intrinsics.d(this.icon, headerDTO.icon);
    }

    @NotNull
    public final TextAtom getAtomSubtitle() {
        return this.atomSubtitle;
    }

    public final ButtonV3Atom.LargeBorderlessButton getButton() {
        return this.button;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final List<LineDTO> getTitleLines() {
        return this.titleLines;
    }

    public int hashCode() {
        int b11 = C2619v.b(this.titleLines.hashCode() * 31, 31, this.atomSubtitle);
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.button;
        return this.icon.hashCode() + ((b11 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "HeaderDTO(titleLines=" + this.titleLines + ", atomSubtitle=" + this.atomSubtitle + ", button=" + this.button + ", icon=" + this.icon + ")";
    }
}
