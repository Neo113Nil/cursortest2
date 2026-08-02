package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: DonutBannerDto.kt */
/* loaded from: classes14.dex */
public final class DonutBannerDto implements Parcelable {
    public static final Parcelable.Creator<DonutBannerDto> CREATOR = new a();

    @pmi0("icon")
    private final IconDto icon;

    @pmi0("subhead")
    private final String subhead;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DonutBannerDto.kt */
    public static final class IconDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconDto[] $VALUES;
        public static final Parcelable.Creator<IconDto> CREATOR;

        @pmi0("error")
        public static final IconDto ERROR;
        private final String value;

        /* compiled from: DonutBannerDto.kt */
        public static final class a implements Parcelable.Creator<IconDto> {
            @Override // android.os.Parcelable.Creator
            public final IconDto createFromParcel(Parcel parcel) {
                return IconDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IconDto[] newArray(int i) {
                return new IconDto[i];
            }
        }

        static {
            IconDto iconDto = new IconDto("ERROR", 0, "error");
            ERROR = iconDto;
            IconDto[] iconDtoArr = {iconDto};
            $VALUES = iconDtoArr;
            $ENTRIES = new asp(iconDtoArr);
            CREATOR = new a();
        }

        private IconDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static IconDto valueOf(String str) {
            return (IconDto) Enum.valueOf(IconDto.class, str);
        }

        public static IconDto[] values() {
            return (IconDto[]) $VALUES.clone();
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

    /* compiled from: DonutBannerDto.kt */
    public static final class a implements Parcelable.Creator<DonutBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutBannerDto createFromParcel(Parcel parcel) {
            return new DonutBannerDto(IconDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutBannerDto[] newArray(int i) {
            return new DonutBannerDto[i];
        }
    }

    public DonutBannerDto(IconDto iconDto, String str) {
        this.icon = iconDto;
        this.subhead = str;
    }

    public final IconDto d() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.subhead;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutBannerDto)) {
            return false;
        }
        DonutBannerDto donutBannerDto = (DonutBannerDto) obj;
        return this.icon == donutBannerDto.icon && epx.f(this.subhead, donutBannerDto.subhead);
    }

    public final int hashCode() {
        return this.subhead.hashCode() + (this.icon.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutBannerDto(icon=");
        sb.append(this.icon);
        sb.append(", subhead=");
        return ho8.a(sb, this.subhead, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.icon.writeToParcel(parcel, i);
        parcel.writeString(this.subhead);
    }
}
