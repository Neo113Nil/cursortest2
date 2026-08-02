package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AtumVkuiButtonPropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiButtonPropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiButtonPropsDto> CREATOR = new a();

    @pmi0("actions")
    private final List<AtumVkuiAnyActionDto> actions;

    @pmi0("badge_content")
    private final AtumVkuiAnyBadgeDto badgeContent;

    @pmi0("button_appearance")
    private final ButtonAppearanceDto buttonAppearance;

    @pmi0("button_size")
    private final ButtonSizeDto buttonSize;

    @pmi0("is_enabled")
    private final Boolean isEnabled;

    @pmi0("is_rounded")
    private final Boolean isRounded;

    @pmi0("is_stretched")
    private final Boolean isStretched;

    @pmi0("leading_icon")
    private final AtumVkuiLocalImageDto leadingIcon;

    @pmi0("left_accessory")
    private final AtumVkuiButtonAccessoryDto leftAccessory;

    @pmi0(X3.a.t)
    private final ModeDto mode;

    @pmi0("right_accessory")
    private final AtumVkuiButtonAccessoryDto rightAccessory;

    @pmi0("title")
    private final String title;

    @pmi0("trailing_icon")
    private final AtumVkuiLocalImageDto trailingIcon;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumVkuiButtonPropsDto.kt */
    public static final class ButtonAppearanceDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonAppearanceDto[] $VALUES;

        @pmi0("0")
        public static final ButtonAppearanceDto ACCENT;
        public static final Parcelable.Creator<ButtonAppearanceDto> CREATOR;

        @pmi0("2")
        public static final ButtonAppearanceDto NEGATIVE;

        @pmi0("3")
        public static final ButtonAppearanceDto NEUTRAL;

        @pmi0("4")
        public static final ButtonAppearanceDto OVERLAY;

        @pmi0("1")
        public static final ButtonAppearanceDto POSITIVE;
        private final int value;

        /* compiled from: AtumVkuiButtonPropsDto.kt */
        public static final class a implements Parcelable.Creator<ButtonAppearanceDto> {
            @Override // android.os.Parcelable.Creator
            public final ButtonAppearanceDto createFromParcel(Parcel parcel) {
                return ButtonAppearanceDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ButtonAppearanceDto[] newArray(int i) {
                return new ButtonAppearanceDto[i];
            }
        }

        static {
            ButtonAppearanceDto buttonAppearanceDto = new ButtonAppearanceDto("ACCENT", 0, 0);
            ACCENT = buttonAppearanceDto;
            ButtonAppearanceDto buttonAppearanceDto2 = new ButtonAppearanceDto("POSITIVE", 1, 1);
            POSITIVE = buttonAppearanceDto2;
            ButtonAppearanceDto buttonAppearanceDto3 = new ButtonAppearanceDto("NEGATIVE", 2, 2);
            NEGATIVE = buttonAppearanceDto3;
            ButtonAppearanceDto buttonAppearanceDto4 = new ButtonAppearanceDto("NEUTRAL", 3, 3);
            NEUTRAL = buttonAppearanceDto4;
            ButtonAppearanceDto buttonAppearanceDto5 = new ButtonAppearanceDto("OVERLAY", 4, 4);
            OVERLAY = buttonAppearanceDto5;
            ButtonAppearanceDto[] buttonAppearanceDtoArr = {buttonAppearanceDto, buttonAppearanceDto2, buttonAppearanceDto3, buttonAppearanceDto4, buttonAppearanceDto5};
            $VALUES = buttonAppearanceDtoArr;
            $ENTRIES = new asp(buttonAppearanceDtoArr);
            CREATOR = new a();
        }

        private ButtonAppearanceDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static ButtonAppearanceDto valueOf(String str) {
            return (ButtonAppearanceDto) Enum.valueOf(ButtonAppearanceDto.class, str);
        }

        public static ButtonAppearanceDto[] values() {
            return (ButtonAppearanceDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumVkuiButtonPropsDto.kt */
    public static final class ButtonSizeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonSizeDto[] $VALUES;
        public static final Parcelable.Creator<ButtonSizeDto> CREATOR;

        @pmi0("0")
        public static final ButtonSizeDto EXTRA_SMALL;

        @pmi0("3")
        public static final ButtonSizeDto LARGE;

        @pmi0("2")
        public static final ButtonSizeDto MEDIUM;

        @pmi0("1")
        public static final ButtonSizeDto SMALL;
        private final int value;

        /* compiled from: AtumVkuiButtonPropsDto.kt */
        public static final class a implements Parcelable.Creator<ButtonSizeDto> {
            @Override // android.os.Parcelable.Creator
            public final ButtonSizeDto createFromParcel(Parcel parcel) {
                return ButtonSizeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ButtonSizeDto[] newArray(int i) {
                return new ButtonSizeDto[i];
            }
        }

        static {
            ButtonSizeDto buttonSizeDto = new ButtonSizeDto("EXTRA_SMALL", 0, 0);
            EXTRA_SMALL = buttonSizeDto;
            ButtonSizeDto buttonSizeDto2 = new ButtonSizeDto("SMALL", 1, 1);
            SMALL = buttonSizeDto2;
            ButtonSizeDto buttonSizeDto3 = new ButtonSizeDto("MEDIUM", 2, 2);
            MEDIUM = buttonSizeDto3;
            ButtonSizeDto buttonSizeDto4 = new ButtonSizeDto("LARGE", 3, 3);
            LARGE = buttonSizeDto4;
            ButtonSizeDto[] buttonSizeDtoArr = {buttonSizeDto, buttonSizeDto2, buttonSizeDto3, buttonSizeDto4};
            $VALUES = buttonSizeDtoArr;
            $ENTRIES = new asp(buttonSizeDtoArr);
            CREATOR = new a();
        }

        private ButtonSizeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static ButtonSizeDto valueOf(String str) {
            return (ButtonSizeDto) Enum.valueOf(ButtonSizeDto.class, str);
        }

        public static ButtonSizeDto[] values() {
            return (ButtonSizeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumVkuiButtonPropsDto.kt */
    public static final class ModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ModeDto[] $VALUES;
        public static final Parcelable.Creator<ModeDto> CREATOR;

        @pmi0("4")
        public static final ModeDto LINK;

        @pmi0("3")
        public static final ModeDto OUTLINE;

        @pmi0("0")
        public static final ModeDto PRIMARY;

        @pmi0("1")
        public static final ModeDto SECONDARY;

        @pmi0("2")
        public static final ModeDto TERTIARY;
        private final int value;

        /* compiled from: AtumVkuiButtonPropsDto.kt */
        public static final class a implements Parcelable.Creator<ModeDto> {
            @Override // android.os.Parcelable.Creator
            public final ModeDto createFromParcel(Parcel parcel) {
                return ModeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ModeDto[] newArray(int i) {
                return new ModeDto[i];
            }
        }

        static {
            ModeDto modeDto = new ModeDto("PRIMARY", 0, 0);
            PRIMARY = modeDto;
            ModeDto modeDto2 = new ModeDto("SECONDARY", 1, 1);
            SECONDARY = modeDto2;
            ModeDto modeDto3 = new ModeDto("TERTIARY", 2, 2);
            TERTIARY = modeDto3;
            ModeDto modeDto4 = new ModeDto("OUTLINE", 3, 3);
            OUTLINE = modeDto4;
            ModeDto modeDto5 = new ModeDto("LINK", 4, 4);
            LINK = modeDto5;
            ModeDto[] modeDtoArr = {modeDto, modeDto2, modeDto3, modeDto4, modeDto5};
            $VALUES = modeDtoArr;
            $ENTRIES = new asp(modeDtoArr);
            CREATOR = new a();
        }

        private ModeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static ModeDto valueOf(String str) {
            return (ModeDto) Enum.valueOf(ModeDto.class, str);
        }

        public static ModeDto[] values() {
            return (ModeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AtumVkuiButtonPropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiButtonPropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiButtonPropsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            ModeDto createFromParcel = ModeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            ArrayList arrayList = null;
            ButtonSizeDto createFromParcel2 = parcel.readInt() == 0 ? null : ButtonSizeDto.CREATOR.createFromParcel(parcel);
            ButtonAppearanceDto createFromParcel3 = parcel.readInt() == 0 ? null : ButtonAppearanceDto.CREATOR.createFromParcel(parcel);
            AtumVkuiLocalImageDto createFromParcel4 = parcel.readInt() == 0 ? null : AtumVkuiLocalImageDto.CREATOR.createFromParcel(parcel);
            AtumVkuiLocalImageDto createFromParcel5 = parcel.readInt() == 0 ? null : AtumVkuiLocalImageDto.CREATOR.createFromParcel(parcel);
            AtumVkuiButtonAccessoryDto atumVkuiButtonAccessoryDto = (AtumVkuiButtonAccessoryDto) parcel.readParcelable(AtumVkuiButtonPropsDto.class.getClassLoader());
            AtumVkuiButtonAccessoryDto atumVkuiButtonAccessoryDto2 = (AtumVkuiButtonAccessoryDto) parcel.readParcelable(AtumVkuiButtonPropsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            AtumVkuiAnyBadgeDto atumVkuiAnyBadgeDto = (AtumVkuiAnyBadgeDto) parcel.readParcelable(AtumVkuiButtonPropsDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AtumVkuiAnyActionDto.CREATOR, parcel, arrayList2, i, 1);
                    atumVkuiAnyBadgeDto = atumVkuiAnyBadgeDto;
                    readInt = readInt;
                }
                arrayList = arrayList2;
            }
            return new AtumVkuiButtonPropsDto(createFromParcel, readString, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, atumVkuiButtonAccessoryDto, atumVkuiButtonAccessoryDto2, valueOf, valueOf2, valueOf3, atumVkuiAnyBadgeDto, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiButtonPropsDto[] newArray(int i) {
            return new AtumVkuiButtonPropsDto[i];
        }
    }

    public AtumVkuiButtonPropsDto(ModeDto modeDto, String str, ButtonSizeDto buttonSizeDto, ButtonAppearanceDto buttonAppearanceDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto2, AtumVkuiButtonAccessoryDto atumVkuiButtonAccessoryDto, AtumVkuiButtonAccessoryDto atumVkuiButtonAccessoryDto2, Boolean bool, Boolean bool2, Boolean bool3, AtumVkuiAnyBadgeDto atumVkuiAnyBadgeDto, List<AtumVkuiAnyActionDto> list) {
        this.mode = modeDto;
        this.title = str;
        this.buttonSize = buttonSizeDto;
        this.buttonAppearance = buttonAppearanceDto;
        this.leadingIcon = atumVkuiLocalImageDto;
        this.trailingIcon = atumVkuiLocalImageDto2;
        this.leftAccessory = atumVkuiButtonAccessoryDto;
        this.rightAccessory = atumVkuiButtonAccessoryDto2;
        this.isRounded = bool;
        this.isStretched = bool2;
        this.isEnabled = bool3;
        this.badgeContent = atumVkuiAnyBadgeDto;
        this.actions = list;
    }

    public final List<AtumVkuiAnyActionDto> d() {
        return this.actions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiButtonPropsDto)) {
            return false;
        }
        AtumVkuiButtonPropsDto atumVkuiButtonPropsDto = (AtumVkuiButtonPropsDto) obj;
        return this.mode == atumVkuiButtonPropsDto.mode && epx.f(this.title, atumVkuiButtonPropsDto.title) && this.buttonSize == atumVkuiButtonPropsDto.buttonSize && this.buttonAppearance == atumVkuiButtonPropsDto.buttonAppearance && this.leadingIcon == atumVkuiButtonPropsDto.leadingIcon && this.trailingIcon == atumVkuiButtonPropsDto.trailingIcon && epx.f(this.leftAccessory, atumVkuiButtonPropsDto.leftAccessory) && epx.f(this.rightAccessory, atumVkuiButtonPropsDto.rightAccessory) && epx.f(this.isRounded, atumVkuiButtonPropsDto.isRounded) && epx.f(this.isStretched, atumVkuiButtonPropsDto.isStretched) && epx.f(this.isEnabled, atumVkuiButtonPropsDto.isEnabled) && epx.f(this.badgeContent, atumVkuiButtonPropsDto.badgeContent) && epx.f(this.actions, atumVkuiButtonPropsDto.actions);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.mode.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ButtonSizeDto buttonSizeDto = this.buttonSize;
        int hashCode3 = (hashCode2 + (buttonSizeDto == null ? 0 : buttonSizeDto.hashCode())) * 31;
        ButtonAppearanceDto buttonAppearanceDto = this.buttonAppearance;
        int hashCode4 = (hashCode3 + (buttonAppearanceDto == null ? 0 : buttonAppearanceDto.hashCode())) * 31;
        AtumVkuiLocalImageDto atumVkuiLocalImageDto = this.leadingIcon;
        int hashCode5 = (hashCode4 + (atumVkuiLocalImageDto == null ? 0 : atumVkuiLocalImageDto.hashCode())) * 31;
        AtumVkuiLocalImageDto atumVkuiLocalImageDto2 = this.trailingIcon;
        int hashCode6 = (hashCode5 + (atumVkuiLocalImageDto2 == null ? 0 : atumVkuiLocalImageDto2.hashCode())) * 31;
        AtumVkuiButtonAccessoryDto atumVkuiButtonAccessoryDto = this.leftAccessory;
        int hashCode7 = (hashCode6 + (atumVkuiButtonAccessoryDto == null ? 0 : atumVkuiButtonAccessoryDto.hashCode())) * 31;
        AtumVkuiButtonAccessoryDto atumVkuiButtonAccessoryDto2 = this.rightAccessory;
        int hashCode8 = (hashCode7 + (atumVkuiButtonAccessoryDto2 == null ? 0 : atumVkuiButtonAccessoryDto2.hashCode())) * 31;
        Boolean bool = this.isRounded;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isStretched;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isEnabled;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        AtumVkuiAnyBadgeDto atumVkuiAnyBadgeDto = this.badgeContent;
        int hashCode12 = (hashCode11 + (atumVkuiAnyBadgeDto == null ? 0 : atumVkuiAnyBadgeDto.hashCode())) * 31;
        List<AtumVkuiAnyActionDto> list = this.actions;
        return hashCode12 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumVkuiButtonPropsDto(mode=");
        sb.append(this.mode);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", buttonSize=");
        sb.append(this.buttonSize);
        sb.append(", buttonAppearance=");
        sb.append(this.buttonAppearance);
        sb.append(", leadingIcon=");
        sb.append(this.leadingIcon);
        sb.append(", trailingIcon=");
        sb.append(this.trailingIcon);
        sb.append(", leftAccessory=");
        sb.append(this.leftAccessory);
        sb.append(", rightAccessory=");
        sb.append(this.rightAccessory);
        sb.append(", isRounded=");
        sb.append(this.isRounded);
        sb.append(", isStretched=");
        sb.append(this.isStretched);
        sb.append(", isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", badgeContent=");
        sb.append(this.badgeContent);
        sb.append(", actions=");
        return ms9.a(')', sb, this.actions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.mode.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        ButtonSizeDto buttonSizeDto = this.buttonSize;
        if (buttonSizeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonSizeDto.writeToParcel(parcel, i);
        }
        ButtonAppearanceDto buttonAppearanceDto = this.buttonAppearance;
        if (buttonAppearanceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonAppearanceDto.writeToParcel(parcel, i);
        }
        AtumVkuiLocalImageDto atumVkuiLocalImageDto = this.leadingIcon;
        if (atumVkuiLocalImageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiLocalImageDto.writeToParcel(parcel, i);
        }
        AtumVkuiLocalImageDto atumVkuiLocalImageDto2 = this.trailingIcon;
        if (atumVkuiLocalImageDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiLocalImageDto2.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.leftAccessory, i);
        parcel.writeParcelable(this.rightAccessory, i);
        Boolean bool = this.isRounded;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isStretched;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isEnabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeParcelable(this.badgeContent, i);
        List<AtumVkuiAnyActionDto> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AtumVkuiAnyActionDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AtumVkuiButtonPropsDto(ModeDto modeDto, String str, ButtonSizeDto buttonSizeDto, ButtonAppearanceDto buttonAppearanceDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto2, AtumVkuiButtonAccessoryDto atumVkuiButtonAccessoryDto, AtumVkuiButtonAccessoryDto atumVkuiButtonAccessoryDto2, Boolean bool, Boolean bool2, Boolean bool3, AtumVkuiAnyBadgeDto atumVkuiAnyBadgeDto, List list, int i, zcl zclVar) {
        this(modeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : buttonSizeDto, (i & 8) != 0 ? null : buttonAppearanceDto, (i & 16) != 0 ? null : atumVkuiLocalImageDto, (i & 32) != 0 ? null : atumVkuiLocalImageDto2, (i & 64) != 0 ? null : atumVkuiButtonAccessoryDto, (i & 128) != 0 ? null : atumVkuiButtonAccessoryDto2, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : bool3, (i & 2048) != 0 ? null : atumVkuiAnyBadgeDto, (i & 4096) != 0 ? null : list);
    }
}
