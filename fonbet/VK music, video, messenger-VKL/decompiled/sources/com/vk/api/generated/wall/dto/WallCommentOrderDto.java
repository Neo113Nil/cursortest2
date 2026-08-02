package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: WallCommentOrderDto.kt */
/* loaded from: classes15.dex */
public final class WallCommentOrderDto implements Parcelable {
    public static final Parcelable.Creator<WallCommentOrderDto> CREATOR = new a();

    @pmi0("id")
    private final IdDto id;

    @pmi0("name")
    private final String name;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallCommentOrderDto.kt */
    public static final class IdDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IdDto[] $VALUES;

        @pmi0("asc")
        public static final IdDto ASC;
        public static final Parcelable.Creator<IdDto> CREATOR;

        @pmi0(CampaignEx.JSON_KEY_DESC)
        public static final IdDto DESC;

        @pmi0("smart")
        public static final IdDto SMART;
        private final String value;

        /* compiled from: WallCommentOrderDto.kt */
        public static final class a implements Parcelable.Creator<IdDto> {
            @Override // android.os.Parcelable.Creator
            public final IdDto createFromParcel(Parcel parcel) {
                return IdDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IdDto[] newArray(int i) {
                return new IdDto[i];
            }
        }

        static {
            IdDto idDto = new IdDto("SMART", 0, "smart");
            SMART = idDto;
            IdDto idDto2 = new IdDto("ASC", 1, "asc");
            ASC = idDto2;
            IdDto idDto3 = new IdDto("DESC", 2, CampaignEx.JSON_KEY_DESC);
            DESC = idDto3;
            IdDto[] idDtoArr = {idDto, idDto2, idDto3};
            $VALUES = idDtoArr;
            $ENTRIES = new asp(idDtoArr);
            CREATOR = new a();
        }

        private IdDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static IdDto valueOf(String str) {
            return (IdDto) Enum.valueOf(IdDto.class, str);
        }

        public static IdDto[] values() {
            return (IdDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: WallCommentOrderDto.kt */
    public static final class a implements Parcelable.Creator<WallCommentOrderDto> {
        @Override // android.os.Parcelable.Creator
        public final WallCommentOrderDto createFromParcel(Parcel parcel) {
            return new WallCommentOrderDto(parcel.readInt() == 0 ? null : IdDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallCommentOrderDto[] newArray(int i) {
            return new WallCommentOrderDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallCommentOrderDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final IdDto d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallCommentOrderDto)) {
            return false;
        }
        WallCommentOrderDto wallCommentOrderDto = (WallCommentOrderDto) obj;
        return this.id == wallCommentOrderDto.id && epx.f(this.name, wallCommentOrderDto.name);
    }

    public final int hashCode() {
        IdDto idDto = this.id;
        int hashCode = (idDto == null ? 0 : idDto.hashCode()) * 31;
        String str = this.name;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallCommentOrderDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IdDto idDto = this.id;
        if (idDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            idDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.name);
    }

    public WallCommentOrderDto(IdDto idDto, String str) {
        this.id = idDto;
        this.name = str;
    }

    public /* synthetic */ WallCommentOrderDto(IdDto idDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : idDto, (i & 2) != 0 ? null : str);
    }
}
