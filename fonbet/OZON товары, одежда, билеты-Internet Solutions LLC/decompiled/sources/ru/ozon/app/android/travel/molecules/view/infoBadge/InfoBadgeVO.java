package ru.ozon.app.android.travel.molecules.view.infoBadge;

import K00.b;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u0007\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010\u0015¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "", "isIconVisible", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "backgroundColor", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "linkButton", "", "maxLines", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;ZLru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Z", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "getLinkButton", "()Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "I", "getMaxLines", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InfoBadgeVO {
    public static final int $stable = 8;
    private final AtomAction action;
    private final String backgroundColor;
    private final Icon icon;
    private final boolean isIconVisible;
    private final LinkButtonVO linkButton;
    private final int maxLines;

    @NotNull
    private final TextAtom text;

    public InfoBadgeVO(@NotNull TextAtom text, Icon icon, boolean z11, AtomAction atomAction, String str, LinkButtonVO linkButtonVO, int i11) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.icon = icon;
        this.isIconVisible = z11;
        this.action = atomAction;
        this.backgroundColor = str;
        this.linkButton = linkButtonVO;
        this.maxLines = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoBadgeVO)) {
            return false;
        }
        InfoBadgeVO infoBadgeVO = (InfoBadgeVO) other;
        return Intrinsics.d(this.text, infoBadgeVO.text) && Intrinsics.d(this.icon, infoBadgeVO.icon) && this.isIconVisible == infoBadgeVO.isIconVisible && Intrinsics.d(this.action, infoBadgeVO.action) && Intrinsics.d(this.backgroundColor, infoBadgeVO.backgroundColor) && Intrinsics.d(this.linkButton, infoBadgeVO.linkButton) && this.maxLines == infoBadgeVO.maxLines;
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final LinkButtonVO getLinkButton() {
        return this.linkButton;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Icon icon = this.icon;
        int a11 = C3532b.a((hashCode + (icon == null ? 0 : icon.hashCode())) * 31, 31, this.isIconVisible);
        AtomAction atomAction = this.action;
        int hashCode2 = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        LinkButtonVO linkButtonVO = this.linkButton;
        return Integer.hashCode(this.maxLines) + ((hashCode3 + (linkButtonVO != null ? linkButtonVO.hashCode() : 0)) * 31);
    }

    /* renamed from: isIconVisible, reason: from getter */
    public final boolean getIsIconVisible() {
        return this.isIconVisible;
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.text;
        Icon icon = this.icon;
        boolean z11 = this.isIconVisible;
        AtomAction atomAction = this.action;
        String str = this.backgroundColor;
        LinkButtonVO linkButtonVO = this.linkButton;
        int i11 = this.maxLines;
        StringBuilder sb2 = new StringBuilder("InfoBadgeVO(text=");
        sb2.append(textAtom);
        sb2.append(", icon=");
        sb2.append(icon);
        sb2.append(", isIconVisible=");
        sb2.append(z11);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", linkButton=");
        sb2.append(linkButtonVO);
        sb2.append(", maxLines=");
        return b.e(i11, ")", sb2);
    }
}
