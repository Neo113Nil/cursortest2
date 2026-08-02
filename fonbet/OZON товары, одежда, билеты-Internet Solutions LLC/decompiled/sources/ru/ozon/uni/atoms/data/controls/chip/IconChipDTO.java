package ru.ozon.uni.atoms.data.controls.chip;

import C.o0;
import El.C2971a;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.android.wrappers.main.data.BackgroundMargin;
import ru.ozon.uni.android.wrappers.main.data.BackgroundPadding;
import ru.ozon.uni.android.wrappers.main.data.BackgroundWrapperCorners;
import ru.ozon.uni.android.wrappers.main.data.BackgroundWrapperSettings;
import ru.ozon.uni.android.wrappers.main.data.BackgroundWrapperSize;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002,-B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010 \u001a\u00020\u0019J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0019HÖ\u0001J\t\u0010&\u001a\u00020\u000bHÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0019R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006."}, d2 = {"Lru/ozon/uni/atoms/data/controls/chip/IconChipDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "style", "Lru/ozon/uni/atoms/data/controls/chip/Style;", "state", "Lru/ozon/uni/android/wrappers/main/chip/ChipState;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "context", "", "<init>", "(Lru/ozon/uni/atoms/data/controls/chip/Style;Lru/ozon/uni/android/wrappers/main/chip/ChipState;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)V", "getStyle", "()Lru/ozon/uni/atoms/data/controls/chip/Style;", "getState", "()Lru/ozon/uni/android/wrappers/main/chip/ChipState;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getContext", "()Ljava/lang/String;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "IconSettings", "IconChipSize", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class IconChipDTO extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<IconChipDTO> CREATOR = new Creator();
    private final CommonControlSettings common;
    private final String context;

    @NotNull
    private final IconDTO icon;

    @EnumNullFallback
    private final ChipState state;

    @EnumNullFallback
    private final Style style;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IconChipDTO> {
        @Override // android.os.Parcelable.Creator
        public final IconChipDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IconChipDTO(parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ChipState.valueOf(parcel.readString()), IconDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CommonControlSettings.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IconChipDTO[] newArray(int i11) {
            return new IconChipDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/uni/atoms/data/controls/chip/IconChipDTO$IconChipSize;", "", "settings", "Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;", "iconSettings", "Lru/ozon/uni/atoms/data/controls/chip/IconChipDTO$IconSettings;", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;Lru/ozon/uni/atoms/data/controls/chip/IconChipDTO$IconSettings;)V", "getSettings", "()Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;", "getIconSettings", "()Lru/ozon/uni/atoms/data/controls/chip/IconChipDTO$IconSettings;", "SIZE_500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconChipSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconChipSize[] $VALUES;
        public static final IconChipSize SIZE_500;

        @NotNull
        private final IconSettings iconSettings;

        @NotNull
        private final BackgroundWrapperSettings settings;

        private static final /* synthetic */ IconChipSize[] $values() {
            return new IconChipSize[]{SIZE_500};
        }

        static {
            BackgroundWrapperSize backgroundWrapperSize = BackgroundWrapperSize.SIZE_600;
            BackgroundPadding backgroundPadding = BackgroundPadding.PADDING_200;
            SIZE_500 = new IconChipSize("SIZE_500", 0, new BackgroundWrapperSettings(backgroundWrapperSize, backgroundPadding, null, backgroundPadding, null, BackgroundWrapperCorners.INSTANCE.getCornersAll(), BackgroundMargin.MARGIN_NONE, 20, null), new IconSettings(IconDTO.IconSize.SIZE_500, IconDTO.IconShape.CIRCLE));
            IconChipSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IconChipSize(String str, int i11, BackgroundWrapperSettings backgroundWrapperSettings, IconSettings iconSettings) {
            this.settings = backgroundWrapperSettings;
            this.iconSettings = iconSettings;
        }

        @NotNull
        public static a<IconChipSize> getEntries() {
            return $ENTRIES;
        }

        public static IconChipSize valueOf(String str) {
            return (IconChipSize) Enum.valueOf(IconChipSize.class, str);
        }

        public static IconChipSize[] values() {
            return (IconChipSize[]) $VALUES.clone();
        }

        @NotNull
        public final IconSettings getIconSettings() {
            return this.iconSettings;
        }

        @NotNull
        public final BackgroundWrapperSettings getSettings() {
            return this.settings;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/atoms/data/controls/chip/IconChipDTO$IconSettings;", "", "iconSize", "Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;", "iconShape", "Lru/ozon/uni/atoms/data/icon/IconDTO$IconShape;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;Lru/ozon/uni/atoms/data/icon/IconDTO$IconShape;)V", "getIconSize", "()Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;", "getIconShape", "()Lru/ozon/uni/atoms/data/icon/IconDTO$IconShape;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconSettings {
        public static final int $stable = 0;

        @NotNull
        private final IconDTO.IconShape iconShape;

        @NotNull
        private final IconDTO.IconSize iconSize;

        public IconSettings(@NotNull IconDTO.IconSize iconSize, @NotNull IconDTO.IconShape iconShape) {
            Intrinsics.checkNotNullParameter(iconSize, "iconSize");
            Intrinsics.checkNotNullParameter(iconShape, "iconShape");
            this.iconSize = iconSize;
            this.iconShape = iconShape;
        }

        public static /* synthetic */ IconSettings copy$default(IconSettings iconSettings, IconDTO.IconSize iconSize, IconDTO.IconShape iconShape, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconSize = iconSettings.iconSize;
            }
            if ((i11 & 2) != 0) {
                iconShape = iconSettings.iconShape;
            }
            return iconSettings.copy(iconSize, iconShape);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO.IconSize getIconSize() {
            return this.iconSize;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IconDTO.IconShape getIconShape() {
            return this.iconShape;
        }

        @NotNull
        public final IconSettings copy(@NotNull IconDTO.IconSize iconSize, @NotNull IconDTO.IconShape iconShape) {
            Intrinsics.checkNotNullParameter(iconSize, "iconSize");
            Intrinsics.checkNotNullParameter(iconShape, "iconShape");
            return new IconSettings(iconSize, iconShape);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconSettings)) {
                return false;
            }
            IconSettings iconSettings = (IconSettings) other;
            return this.iconSize == iconSettings.iconSize && this.iconShape == iconSettings.iconShape;
        }

        @NotNull
        public final IconDTO.IconShape getIconShape() {
            return this.iconShape;
        }

        @NotNull
        public final IconDTO.IconSize getIconSize() {
            return this.iconSize;
        }

        public int hashCode() {
            return this.iconShape.hashCode() + (this.iconSize.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "IconSettings(iconSize=" + this.iconSize + ", iconShape=" + this.iconShape + ")";
        }
    }

    public /* synthetic */ IconChipDTO(Style style, ChipState chipState, IconDTO iconDTO, CommonControlSettings commonControlSettings, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Style.ASPECT_PRIMARY : style, (i11 & 2) != 0 ? ChipState.ENABLED : chipState, iconDTO, commonControlSettings, (i11 & 16) != 0 ? null : str);
    }

    public static /* synthetic */ IconChipDTO copy$default(IconChipDTO iconChipDTO, Style style, ChipState chipState, IconDTO iconDTO, CommonControlSettings commonControlSettings, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            style = iconChipDTO.style;
        }
        if ((i11 & 2) != 0) {
            chipState = iconChipDTO.state;
        }
        if ((i11 & 4) != 0) {
            iconDTO = iconChipDTO.icon;
        }
        if ((i11 & 8) != 0) {
            commonControlSettings = iconChipDTO.common;
        }
        if ((i11 & 16) != 0) {
            str = iconChipDTO.context;
        }
        String str2 = str;
        IconDTO iconDTO2 = iconDTO;
        return iconChipDTO.copy(style, chipState, iconDTO2, commonControlSettings, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    /* renamed from: component2, reason: from getter */
    public final ChipState getState() {
        return this.state;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component5, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @NotNull
    public final IconChipDTO copy(Style style, ChipState state, @NotNull IconDTO icon, CommonControlSettings common, String context) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new IconChipDTO(style, state, icon, common, context);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconChipDTO)) {
            return false;
        }
        IconChipDTO iconChipDTO = (IconChipDTO) other;
        return this.style == iconChipDTO.style && this.state == iconChipDTO.state && Intrinsics.d(this.icon, iconChipDTO.icon) && Intrinsics.d(this.common, iconChipDTO.common) && Intrinsics.d(this.context, iconChipDTO.context);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.iconChip;
    }

    public final ChipState getState() {
        return this.state;
    }

    public final Style getStyle() {
        return this.style;
    }

    public int hashCode() {
        Style style = this.style;
        int hashCode = (style == null ? 0 : style.hashCode()) * 31;
        ChipState chipState = this.state;
        int a11 = C2971a.a(this.icon, (hashCode + (chipState == null ? 0 : chipState.hashCode())) * 31, 31);
        CommonControlSettings commonControlSettings = this.common;
        int hashCode2 = (a11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        String str = this.context;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Style style = this.style;
        ChipState chipState = this.state;
        IconDTO iconDTO = this.icon;
        CommonControlSettings commonControlSettings = this.common;
        String str = this.context;
        StringBuilder sb2 = new StringBuilder("IconChipDTO(style=");
        sb2.append(style);
        sb2.append(", state=");
        sb2.append(chipState);
        sb2.append(", icon=");
        sb2.append(iconDTO);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(", context=");
        return o0.c(sb2, str, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Style style = this.style;
        if (style == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(style.name());
        }
        ChipState chipState = this.state;
        if (chipState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(chipState.name());
        }
        this.icon.writeToParcel(dest, flags);
        CommonControlSettings commonControlSettings = this.common;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
        dest.writeString(this.context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconChipDTO(Style style, ChipState chipState, @NotNull IconDTO icon, CommonControlSettings commonControlSettings, String str) {
        super(DsAtomsType.ICON_CHIP, str, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null, commonControlSettings != null ? commonControlSettings.getTestInfo() : null);
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.style = style;
        this.state = chipState;
        this.icon = icon;
        this.common = commonControlSettings;
        this.context = str;
    }
}
