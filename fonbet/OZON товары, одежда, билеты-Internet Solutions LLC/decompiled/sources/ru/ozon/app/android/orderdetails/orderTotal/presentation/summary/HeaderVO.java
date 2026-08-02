package ru.ozon.app.android.orderdetails.orderTotal.presentation.summary;

import B90.C2619v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010\u000e¨\u0006!"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/HeaderVO;", "", "", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/LineVO;", "titleLines", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "button", "", "icon", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTitleLines", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "Ljava/lang/String;", "getIcon", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HeaderVO {
    private final ButtonV3Atom.LargeBorderlessButton button;

    @NotNull
    private final String icon;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final List<LineVO> titleLines;

    public HeaderVO(@NotNull List<LineVO> titleLines, @NotNull TextAtom subtitle, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, @NotNull String icon) {
        Intrinsics.checkNotNullParameter(titleLines, "titleLines");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.titleLines = titleLines;
        this.subtitle = subtitle;
        this.button = largeBorderlessButton;
        this.icon = icon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderVO)) {
            return false;
        }
        HeaderVO headerVO = (HeaderVO) other;
        return Intrinsics.d(this.titleLines, headerVO.titleLines) && Intrinsics.d(this.subtitle, headerVO.subtitle) && Intrinsics.d(this.button, headerVO.button) && Intrinsics.d(this.icon, headerVO.icon);
    }

    public final ButtonV3Atom.LargeBorderlessButton getButton() {
        return this.button;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<LineVO> getTitleLines() {
        return this.titleLines;
    }

    public int hashCode() {
        int b11 = C2619v.b(this.titleLines.hashCode() * 31, 31, this.subtitle);
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.button;
        return this.icon.hashCode() + ((b11 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "HeaderVO(titleLines=" + this.titleLines + ", subtitle=" + this.subtitle + ", button=" + this.button + ", icon=" + this.icon + ")";
    }
}
