package ru.ozon.app.android.travel.molecules.dto.infoBadge;

import HY.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JM\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\rHÖ\u0001J\t\u0010'\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "backgroundColor", "", "linkButton", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "maxLines", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;I)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getLinkButton", "()Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "getMaxLines", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InfoBadgeDTO {
    private final AtomActionDTO action;
    private final String backgroundColor;
    private final Icon icon;
    private final LinkButtonDTO linkButton;
    private final int maxLines;

    @NotNull
    private final TextAtom text;

    public InfoBadgeDTO(@NotNull TextAtom text, Icon icon, AtomActionDTO atomActionDTO, String str, LinkButtonDTO linkButtonDTO, int i11) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.icon = icon;
        this.action = atomActionDTO;
        this.backgroundColor = str;
        this.linkButton = linkButtonDTO;
        this.maxLines = i11;
    }

    public static /* synthetic */ InfoBadgeDTO copy$default(InfoBadgeDTO infoBadgeDTO, TextAtom textAtom, Icon icon, AtomActionDTO atomActionDTO, String str, LinkButtonDTO linkButtonDTO, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            textAtom = infoBadgeDTO.text;
        }
        if ((i12 & 2) != 0) {
            icon = infoBadgeDTO.icon;
        }
        if ((i12 & 4) != 0) {
            atomActionDTO = infoBadgeDTO.action;
        }
        if ((i12 & 8) != 0) {
            str = infoBadgeDTO.backgroundColor;
        }
        if ((i12 & 16) != 0) {
            linkButtonDTO = infoBadgeDTO.linkButton;
        }
        if ((i12 & 32) != 0) {
            i11 = infoBadgeDTO.maxLines;
        }
        LinkButtonDTO linkButtonDTO2 = linkButtonDTO;
        int i13 = i11;
        return infoBadgeDTO.copy(textAtom, icon, atomActionDTO, str, linkButtonDTO2, i13);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final LinkButtonDTO getLinkButton() {
        return this.linkButton;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    @NotNull
    public final InfoBadgeDTO copy(@NotNull TextAtom text, Icon icon, AtomActionDTO action, String backgroundColor, LinkButtonDTO linkButton, int maxLines) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new InfoBadgeDTO(text, icon, action, backgroundColor, linkButton, maxLines);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoBadgeDTO)) {
            return false;
        }
        InfoBadgeDTO infoBadgeDTO = (InfoBadgeDTO) other;
        return Intrinsics.d(this.text, infoBadgeDTO.text) && Intrinsics.d(this.icon, infoBadgeDTO.icon) && Intrinsics.d(this.action, infoBadgeDTO.action) && Intrinsics.d(this.backgroundColor, infoBadgeDTO.backgroundColor) && Intrinsics.d(this.linkButton, infoBadgeDTO.linkButton) && this.maxLines == infoBadgeDTO.maxLines;
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final LinkButtonDTO getLinkButton() {
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
        int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        LinkButtonDTO linkButtonDTO = this.linkButton;
        return Integer.hashCode(this.maxLines) + ((hashCode4 + (linkButtonDTO != null ? linkButtonDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.text;
        Icon icon = this.icon;
        AtomActionDTO atomActionDTO = this.action;
        String str = this.backgroundColor;
        LinkButtonDTO linkButtonDTO = this.linkButton;
        int i11 = this.maxLines;
        StringBuilder sb2 = new StringBuilder("InfoBadgeDTO(text=");
        sb2.append(textAtom);
        sb2.append(", icon=");
        sb2.append(icon);
        sb2.append(", action=");
        b.d(", backgroundColor=", str, ", linkButton=", sb2, atomActionDTO);
        sb2.append(linkButtonDTO);
        sb2.append(", maxLines=");
        sb2.append(i11);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ InfoBadgeDTO(TextAtom textAtom, Icon icon, AtomActionDTO atomActionDTO, String str, LinkButtonDTO linkButtonDTO, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, icon, atomActionDTO, str, linkButtonDTO, (i12 & 32) != 0 ? 2 : i11);
    }
}
