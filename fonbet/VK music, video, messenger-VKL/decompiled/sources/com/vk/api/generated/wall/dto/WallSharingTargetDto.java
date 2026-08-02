package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: WallSharingTargetDto.kt */
/* loaded from: classes15.dex */
public final class WallSharingTargetDto implements Parcelable {
    public static final Parcelable.Creator<WallSharingTargetDto> CREATOR = new a();

    @pmi0("name")
    private final NameDto name;

    @pmi0("track_code")
    private final String trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallSharingTargetDto.kt */
    public static final class NameDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NameDto[] $VALUES;
        public static final Parcelable.Creator<NameDto> CREATOR;

        @pmi0("telegram")
        public static final NameDto TELEGRAM;

        @pmi0("whatsapp")
        public static final NameDto WHATSAPP;
        private final String value;

        /* compiled from: WallSharingTargetDto.kt */
        public static final class a implements Parcelable.Creator<NameDto> {
            @Override // android.os.Parcelable.Creator
            public final NameDto createFromParcel(Parcel parcel) {
                return NameDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NameDto[] newArray(int i) {
                return new NameDto[i];
            }
        }

        static {
            NameDto nameDto = new NameDto("TELEGRAM", 0, "telegram");
            TELEGRAM = nameDto;
            NameDto nameDto2 = new NameDto("WHATSAPP", 1, "whatsapp");
            WHATSAPP = nameDto2;
            NameDto[] nameDtoArr = {nameDto, nameDto2};
            $VALUES = nameDtoArr;
            $ENTRIES = new asp(nameDtoArr);
            CREATOR = new a();
        }

        private NameDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static NameDto valueOf(String str) {
            return (NameDto) Enum.valueOf(NameDto.class, str);
        }

        public static NameDto[] values() {
            return (NameDto[]) $VALUES.clone();
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

    /* compiled from: WallSharingTargetDto.kt */
    public static final class a implements Parcelable.Creator<WallSharingTargetDto> {
        @Override // android.os.Parcelable.Creator
        public final WallSharingTargetDto createFromParcel(Parcel parcel) {
            return new WallSharingTargetDto(parcel.readInt() == 0 ? null : NameDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallSharingTargetDto[] newArray(int i) {
            return new WallSharingTargetDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallSharingTargetDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallSharingTargetDto)) {
            return false;
        }
        WallSharingTargetDto wallSharingTargetDto = (WallSharingTargetDto) obj;
        return this.name == wallSharingTargetDto.name && epx.f(this.trackCode, wallSharingTargetDto.trackCode);
    }

    public final int hashCode() {
        NameDto nameDto = this.name;
        int hashCode = (nameDto == null ? 0 : nameDto.hashCode()) * 31;
        String str = this.trackCode;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallSharingTargetDto(name=");
        sb.append(this.name);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        NameDto nameDto = this.name;
        if (nameDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nameDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
    }

    public WallSharingTargetDto(NameDto nameDto, String str) {
        this.name = nameDto;
        this.trackCode = str;
    }

    public /* synthetic */ WallSharingTargetDto(NameDto nameDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : nameDto, (i & 2) != 0 ? null : str);
    }
}
