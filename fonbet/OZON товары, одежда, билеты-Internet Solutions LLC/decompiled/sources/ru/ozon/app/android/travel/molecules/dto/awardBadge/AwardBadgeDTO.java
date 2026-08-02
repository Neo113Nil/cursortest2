package ru.ozon.app.android.travel.molecules.dto.awardBadge;

import G.g;
import V.e;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001f !B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO;", "", "icon", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeIcon;", "text", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeText;", "backgroundColor", "", "size", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeSize;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeIcon;Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeText;Ljava/lang/String;Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeSize;)V", "getIcon", "()Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeIcon;", "getText", "()Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeText;", "getBackgroundColor", "()Ljava/lang/String;", "getSize", "()Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeSize;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "AwardBadgeIcon", "AwardBadgeText", "AwardBadgeSize", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AwardBadgeDTO {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final AwardBadgeIcon icon;

    @NotNull
    private final AwardBadgeSize size;
    private final AwardBadgeText text;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeIcon;", "", "icon", "", "iconColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getIconColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AwardBadgeIcon {

        @NotNull
        private final String icon;

        @NotNull
        private final String iconColor;

        public AwardBadgeIcon(@NotNull String icon, @NotNull String iconColor) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(iconColor, "iconColor");
            this.icon = icon;
            this.iconColor = iconColor;
        }

        public static /* synthetic */ AwardBadgeIcon copy$default(AwardBadgeIcon awardBadgeIcon, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = awardBadgeIcon.icon;
            }
            if ((i11 & 2) != 0) {
                str2 = awardBadgeIcon.iconColor;
            }
            return awardBadgeIcon.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getIconColor() {
            return this.iconColor;
        }

        @NotNull
        public final AwardBadgeIcon copy(@NotNull String icon, @NotNull String iconColor) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(iconColor, "iconColor");
            return new AwardBadgeIcon(icon, iconColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AwardBadgeIcon)) {
                return false;
            }
            AwardBadgeIcon awardBadgeIcon = (AwardBadgeIcon) other;
            return Intrinsics.d(this.icon, awardBadgeIcon.icon) && Intrinsics.d(this.iconColor, awardBadgeIcon.iconColor);
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getIconColor() {
            return this.iconColor;
        }

        public int hashCode() {
            return this.iconColor.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("AwardBadgeIcon(icon=", this.icon, ", iconColor=", this.iconColor, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeSize;", "", "<init>", "(Ljava/lang/String;I)V", "LARGE", "SMALL", "X_SMALL", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AwardBadgeSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AwardBadgeSize[] $VALUES;

        @i(name = "LARGE")
        public static final AwardBadgeSize LARGE = new AwardBadgeSize("LARGE", 0);

        @i(name = "SMALL")
        public static final AwardBadgeSize SMALL = new AwardBadgeSize("SMALL", 1);

        @i(name = "X_SMALL")
        public static final AwardBadgeSize X_SMALL = new AwardBadgeSize("X_SMALL", 2);

        private static final /* synthetic */ AwardBadgeSize[] $values() {
            return new AwardBadgeSize[]{LARGE, SMALL, X_SMALL};
        }

        static {
            AwardBadgeSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AwardBadgeSize(String str, int i11) {
        }

        public static AwardBadgeSize valueOf(String str) {
            return (AwardBadgeSize) Enum.valueOf(AwardBadgeSize.class, str);
        }

        public static AwardBadgeSize[] values() {
            return (AwardBadgeSize[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeText;", "", "text", "", "textColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getTextColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AwardBadgeText {

        @NotNull
        private final String text;

        @NotNull
        private final String textColor;

        public AwardBadgeText(@NotNull String text, @NotNull String textColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            this.text = text;
            this.textColor = textColor;
        }

        public static /* synthetic */ AwardBadgeText copy$default(AwardBadgeText awardBadgeText, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = awardBadgeText.text;
            }
            if ((i11 & 2) != 0) {
                str2 = awardBadgeText.textColor;
            }
            return awardBadgeText.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        public final AwardBadgeText copy(@NotNull String text, @NotNull String textColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            return new AwardBadgeText(text, textColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AwardBadgeText)) {
                return false;
            }
            AwardBadgeText awardBadgeText = (AwardBadgeText) other;
            return Intrinsics.d(this.text, awardBadgeText.text) && Intrinsics.d(this.textColor, awardBadgeText.textColor);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            return this.textColor.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("AwardBadgeText(text=", this.text, ", textColor=", this.textColor, ")");
        }
    }

    public AwardBadgeDTO(@NotNull AwardBadgeIcon icon, AwardBadgeText awardBadgeText, @NotNull String backgroundColor, @NotNull AwardBadgeSize size) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(size, "size");
        this.icon = icon;
        this.text = awardBadgeText;
        this.backgroundColor = backgroundColor;
        this.size = size;
    }

    public static /* synthetic */ AwardBadgeDTO copy$default(AwardBadgeDTO awardBadgeDTO, AwardBadgeIcon awardBadgeIcon, AwardBadgeText awardBadgeText, String str, AwardBadgeSize awardBadgeSize, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            awardBadgeIcon = awardBadgeDTO.icon;
        }
        if ((i11 & 2) != 0) {
            awardBadgeText = awardBadgeDTO.text;
        }
        if ((i11 & 4) != 0) {
            str = awardBadgeDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            awardBadgeSize = awardBadgeDTO.size;
        }
        return awardBadgeDTO.copy(awardBadgeIcon, awardBadgeText, str, awardBadgeSize);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AwardBadgeIcon getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final AwardBadgeText getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AwardBadgeSize getSize() {
        return this.size;
    }

    @NotNull
    public final AwardBadgeDTO copy(@NotNull AwardBadgeIcon icon, AwardBadgeText text, @NotNull String backgroundColor, @NotNull AwardBadgeSize size) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(size, "size");
        return new AwardBadgeDTO(icon, text, backgroundColor, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AwardBadgeDTO)) {
            return false;
        }
        AwardBadgeDTO awardBadgeDTO = (AwardBadgeDTO) other;
        return Intrinsics.d(this.icon, awardBadgeDTO.icon) && Intrinsics.d(this.text, awardBadgeDTO.text) && Intrinsics.d(this.backgroundColor, awardBadgeDTO.backgroundColor) && this.size == awardBadgeDTO.size;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final AwardBadgeIcon getIcon() {
        return this.icon;
    }

    @NotNull
    public final AwardBadgeSize getSize() {
        return this.size;
    }

    public final AwardBadgeText getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.icon.hashCode() * 31;
        AwardBadgeText awardBadgeText = this.text;
        return this.size.hashCode() + g.a((hashCode + (awardBadgeText == null ? 0 : awardBadgeText.hashCode())) * 31, 31, this.backgroundColor);
    }

    @NotNull
    public String toString() {
        return "AwardBadgeDTO(icon=" + this.icon + ", text=" + this.text + ", backgroundColor=" + this.backgroundColor + ", size=" + this.size + ")";
    }
}
