package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AtumVkuiIconButtonPropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiIconButtonPropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiIconButtonPropsDto> CREATOR = new a();

    @pmi0("accessory_type")
    private final AtumVkuiAnyBadgeDto accessoryType;

    @pmi0("actions")
    private final List<AtumVkuiAnyActionDto> actions;

    @pmi0("appearance")
    private final AppearanceDto appearance;

    @pmi0("background_type")
    private final AtumVkuiBackgroundTypeDto backgroundType;

    @pmi0("icon")
    private final AtumVkuiAnyImageDto icon;

    @pmi0("size")
    private final AtumVkuiSizeDto size;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumVkuiIconButtonPropsDto.kt */
    public static final class AppearanceDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AppearanceDto[] $VALUES;

        @pmi0("0")
        public static final AppearanceDto ACCENT;
        public static final Parcelable.Creator<AppearanceDto> CREATOR;

        @pmi0("2")
        public static final AppearanceDto NEGATIVE;

        @pmi0("3")
        public static final AppearanceDto NEUTRAL;

        @pmi0("4")
        public static final AppearanceDto OVERLAY;

        @pmi0("1")
        public static final AppearanceDto POSITIVE;
        private final int value;

        /* compiled from: AtumVkuiIconButtonPropsDto.kt */
        public static final class a implements Parcelable.Creator<AppearanceDto> {
            @Override // android.os.Parcelable.Creator
            public final AppearanceDto createFromParcel(Parcel parcel) {
                return AppearanceDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AppearanceDto[] newArray(int i) {
                return new AppearanceDto[i];
            }
        }

        static {
            AppearanceDto appearanceDto = new AppearanceDto("ACCENT", 0, 0);
            ACCENT = appearanceDto;
            AppearanceDto appearanceDto2 = new AppearanceDto("POSITIVE", 1, 1);
            POSITIVE = appearanceDto2;
            AppearanceDto appearanceDto3 = new AppearanceDto("NEGATIVE", 2, 2);
            NEGATIVE = appearanceDto3;
            AppearanceDto appearanceDto4 = new AppearanceDto("NEUTRAL", 3, 3);
            NEUTRAL = appearanceDto4;
            AppearanceDto appearanceDto5 = new AppearanceDto("OVERLAY", 4, 4);
            OVERLAY = appearanceDto5;
            AppearanceDto[] appearanceDtoArr = {appearanceDto, appearanceDto2, appearanceDto3, appearanceDto4, appearanceDto5};
            $VALUES = appearanceDtoArr;
            $ENTRIES = new asp(appearanceDtoArr);
            CREATOR = new a();
        }

        private AppearanceDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static AppearanceDto valueOf(String str) {
            return (AppearanceDto) Enum.valueOf(AppearanceDto.class, str);
        }

        public static AppearanceDto[] values() {
            return (AppearanceDto[]) $VALUES.clone();
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

    /* compiled from: AtumVkuiIconButtonPropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiIconButtonPropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiIconButtonPropsDto createFromParcel(Parcel parcel) {
            AtumVkuiAnyImageDto atumVkuiAnyImageDto = (AtumVkuiAnyImageDto) parcel.readParcelable(AtumVkuiIconButtonPropsDto.class.getClassLoader());
            ArrayList arrayList = null;
            AtumVkuiSizeDto createFromParcel = parcel.readInt() == 0 ? null : AtumVkuiSizeDto.CREATOR.createFromParcel(parcel);
            AppearanceDto createFromParcel2 = parcel.readInt() == 0 ? null : AppearanceDto.CREATOR.createFromParcel(parcel);
            AtumVkuiBackgroundTypeDto createFromParcel3 = parcel.readInt() == 0 ? null : AtumVkuiBackgroundTypeDto.CREATOR.createFromParcel(parcel);
            AtumVkuiAnyBadgeDto atumVkuiAnyBadgeDto = (AtumVkuiAnyBadgeDto) parcel.readParcelable(AtumVkuiIconButtonPropsDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AtumVkuiAnyActionDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new AtumVkuiIconButtonPropsDto(atumVkuiAnyImageDto, createFromParcel, createFromParcel2, createFromParcel3, atumVkuiAnyBadgeDto, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiIconButtonPropsDto[] newArray(int i) {
            return new AtumVkuiIconButtonPropsDto[i];
        }
    }

    public AtumVkuiIconButtonPropsDto(AtumVkuiAnyImageDto atumVkuiAnyImageDto, AtumVkuiSizeDto atumVkuiSizeDto, AppearanceDto appearanceDto, AtumVkuiBackgroundTypeDto atumVkuiBackgroundTypeDto, AtumVkuiAnyBadgeDto atumVkuiAnyBadgeDto, List<AtumVkuiAnyActionDto> list) {
        this.icon = atumVkuiAnyImageDto;
        this.size = atumVkuiSizeDto;
        this.appearance = appearanceDto;
        this.backgroundType = atumVkuiBackgroundTypeDto;
        this.accessoryType = atumVkuiAnyBadgeDto;
        this.actions = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiIconButtonPropsDto)) {
            return false;
        }
        AtumVkuiIconButtonPropsDto atumVkuiIconButtonPropsDto = (AtumVkuiIconButtonPropsDto) obj;
        return epx.f(this.icon, atumVkuiIconButtonPropsDto.icon) && this.size == atumVkuiIconButtonPropsDto.size && this.appearance == atumVkuiIconButtonPropsDto.appearance && this.backgroundType == atumVkuiIconButtonPropsDto.backgroundType && epx.f(this.accessoryType, atumVkuiIconButtonPropsDto.accessoryType) && epx.f(this.actions, atumVkuiIconButtonPropsDto.actions);
    }

    public final int hashCode() {
        int hashCode = this.icon.hashCode() * 31;
        AtumVkuiSizeDto atumVkuiSizeDto = this.size;
        int hashCode2 = (hashCode + (atumVkuiSizeDto == null ? 0 : atumVkuiSizeDto.hashCode())) * 31;
        AppearanceDto appearanceDto = this.appearance;
        int hashCode3 = (hashCode2 + (appearanceDto == null ? 0 : appearanceDto.hashCode())) * 31;
        AtumVkuiBackgroundTypeDto atumVkuiBackgroundTypeDto = this.backgroundType;
        int hashCode4 = (hashCode3 + (atumVkuiBackgroundTypeDto == null ? 0 : atumVkuiBackgroundTypeDto.hashCode())) * 31;
        AtumVkuiAnyBadgeDto atumVkuiAnyBadgeDto = this.accessoryType;
        int hashCode5 = (hashCode4 + (atumVkuiAnyBadgeDto == null ? 0 : atumVkuiAnyBadgeDto.hashCode())) * 31;
        List<AtumVkuiAnyActionDto> list = this.actions;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumVkuiIconButtonPropsDto(icon=");
        sb.append(this.icon);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", appearance=");
        sb.append(this.appearance);
        sb.append(", backgroundType=");
        sb.append(this.backgroundType);
        sb.append(", accessoryType=");
        sb.append(this.accessoryType);
        sb.append(", actions=");
        return ms9.a(')', sb, this.actions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.icon, i);
        AtumVkuiSizeDto atumVkuiSizeDto = this.size;
        if (atumVkuiSizeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiSizeDto.writeToParcel(parcel, i);
        }
        AppearanceDto appearanceDto = this.appearance;
        if (appearanceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appearanceDto.writeToParcel(parcel, i);
        }
        AtumVkuiBackgroundTypeDto atumVkuiBackgroundTypeDto = this.backgroundType;
        if (atumVkuiBackgroundTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiBackgroundTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.accessoryType, i);
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

    public /* synthetic */ AtumVkuiIconButtonPropsDto(AtumVkuiAnyImageDto atumVkuiAnyImageDto, AtumVkuiSizeDto atumVkuiSizeDto, AppearanceDto appearanceDto, AtumVkuiBackgroundTypeDto atumVkuiBackgroundTypeDto, AtumVkuiAnyBadgeDto atumVkuiAnyBadgeDto, List list, int i, zcl zclVar) {
        this(atumVkuiAnyImageDto, (i & 2) != 0 ? null : atumVkuiSizeDto, (i & 4) != 0 ? null : appearanceDto, (i & 8) != 0 ? null : atumVkuiBackgroundTypeDto, (i & 16) != 0 ? null : atumVkuiAnyBadgeDto, (i & 32) != 0 ? null : list);
    }
}
