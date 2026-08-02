package ru.ozon.app.android.travel.molecules.dto.travelBadge.v2;

import C.o0;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/travelBadge/v2/TravelBadgeV2DTO;", "", "imageLinks", "", "Lru/ozon/app/android/travel/molecules/dto/travelBadge/v2/TravelBadgeV2DTO$BadgeIcon;", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "bgColor", "", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "getImageLinks", "()Ljava/util/List;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBgColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "BadgeIcon", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TravelBadgeV2DTO {

    @NotNull
    private final String bgColor;

    @NotNull
    private final List<BadgeIcon> imageLinks;
    private final TextAtom text;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/travelBadge/v2/TravelBadgeV2DTO$BadgeIcon;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "bgColor", "", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getBgColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BadgeIcon {
        private final String bgColor;

        @NotNull
        private final Icon icon;

        public BadgeIcon(@NotNull Icon icon, String str) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.bgColor = str;
        }

        public static /* synthetic */ BadgeIcon copy$default(BadgeIcon badgeIcon, Icon icon, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = badgeIcon.icon;
            }
            if ((i11 & 2) != 0) {
                str = badgeIcon.bgColor;
            }
            return badgeIcon.copy(icon, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBgColor() {
            return this.bgColor;
        }

        @NotNull
        public final BadgeIcon copy(@NotNull Icon icon, String bgColor) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new BadgeIcon(icon, bgColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadgeIcon)) {
                return false;
            }
            BadgeIcon badgeIcon = (BadgeIcon) other;
            return Intrinsics.d(this.icon, badgeIcon.icon) && Intrinsics.d(this.bgColor, badgeIcon.bgColor);
        }

        public final String getBgColor() {
            return this.bgColor;
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            String str = this.bgColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "BadgeIcon(icon=" + this.icon + ", bgColor=" + this.bgColor + ")";
        }
    }

    public TravelBadgeV2DTO(@NotNull List<BadgeIcon> imageLinks, TextAtom textAtom, @NotNull String bgColor) {
        Intrinsics.checkNotNullParameter(imageLinks, "imageLinks");
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        this.imageLinks = imageLinks;
        this.text = textAtom;
        this.bgColor = bgColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelBadgeV2DTO copy$default(TravelBadgeV2DTO travelBadgeV2DTO, List list, TextAtom textAtom, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = travelBadgeV2DTO.imageLinks;
        }
        if ((i11 & 2) != 0) {
            textAtom = travelBadgeV2DTO.text;
        }
        if ((i11 & 4) != 0) {
            str = travelBadgeV2DTO.bgColor;
        }
        return travelBadgeV2DTO.copy(list, textAtom, str);
    }

    @NotNull
    public final List<BadgeIcon> component1() {
        return this.imageLinks;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBgColor() {
        return this.bgColor;
    }

    @NotNull
    public final TravelBadgeV2DTO copy(@NotNull List<BadgeIcon> imageLinks, TextAtom text, @NotNull String bgColor) {
        Intrinsics.checkNotNullParameter(imageLinks, "imageLinks");
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        return new TravelBadgeV2DTO(imageLinks, text, bgColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelBadgeV2DTO)) {
            return false;
        }
        TravelBadgeV2DTO travelBadgeV2DTO = (TravelBadgeV2DTO) other;
        return Intrinsics.d(this.imageLinks, travelBadgeV2DTO.imageLinks) && Intrinsics.d(this.text, travelBadgeV2DTO.text) && Intrinsics.d(this.bgColor, travelBadgeV2DTO.bgColor);
    }

    @NotNull
    public final String getBgColor() {
        return this.bgColor;
    }

    @NotNull
    public final List<BadgeIcon> getImageLinks() {
        return this.imageLinks;
    }

    public final TextAtom getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.imageLinks.hashCode() * 31;
        TextAtom textAtom = this.text;
        return this.bgColor.hashCode() + ((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        List<BadgeIcon> list = this.imageLinks;
        TextAtom textAtom = this.text;
        String str = this.bgColor;
        StringBuilder sb2 = new StringBuilder("TravelBadgeV2DTO(imageLinks=");
        sb2.append(list);
        sb2.append(", text=");
        sb2.append(textAtom);
        sb2.append(", bgColor=");
        return o0.c(sb2, str, ")");
    }
}
