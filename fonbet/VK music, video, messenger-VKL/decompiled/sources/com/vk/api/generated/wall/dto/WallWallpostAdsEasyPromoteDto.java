package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: WallWallpostAdsEasyPromoteDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostAdsEasyPromoteDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostAdsEasyPromoteDto> CREATOR = new a();

    @pmi0("ad_id")
    private final Integer adId;

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("code")
    private final String code;

    @pmi0("is_ad_not_easy")
    private final boolean isAdNotEasy;

    @pmi0("label_text")
    private final String labelText;

    @pmi0("text")
    private final String text;

    @pmi0("top_union_id")
    private final Integer topUnionId;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallWallpostAdsEasyPromoteDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("1")
        public static final TypeDto AVAILABLE;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("3")
        public static final TypeDto DISABLED;

        @pmi0("6")
        public static final TypeDto DISAPPROVED;

        @pmi0("4")
        public static final TypeDto ENABLED;

        @pmi0(CampaignEx.CLICKMODE_ON)
        public static final TypeDto ENABLING;

        @pmi0("0")
        public static final TypeDto NOT_APPLICABLE;

        @pmi0(Gc.e)
        public static final TypeDto STOPPED;

        @pmi0("2")
        public static final TypeDto UNAVAILABLE;
        private final int value;

        /* compiled from: WallWallpostAdsEasyPromoteDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("NOT_APPLICABLE", 0, 0);
            NOT_APPLICABLE = typeDto;
            TypeDto typeDto2 = new TypeDto("AVAILABLE", 1, 1);
            AVAILABLE = typeDto2;
            TypeDto typeDto3 = new TypeDto("UNAVAILABLE", 2, 2);
            UNAVAILABLE = typeDto3;
            TypeDto typeDto4 = new TypeDto("DISABLED", 3, 3);
            DISABLED = typeDto4;
            TypeDto typeDto5 = new TypeDto("ENABLED", 4, 4);
            ENABLED = typeDto5;
            TypeDto typeDto6 = new TypeDto("ENABLING", 5, 5);
            ENABLING = typeDto6;
            TypeDto typeDto7 = new TypeDto("DISAPPROVED", 6, 6);
            DISAPPROVED = typeDto7;
            TypeDto typeDto8 = new TypeDto("STOPPED", 7, 7);
            STOPPED = typeDto8;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: WallWallpostAdsEasyPromoteDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostAdsEasyPromoteDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostAdsEasyPromoteDto createFromParcel(Parcel parcel) {
            return new WallWallpostAdsEasyPromoteDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostAdsEasyPromoteDto[] newArray(int i) {
            return new WallWallpostAdsEasyPromoteDto[i];
        }
    }

    public WallWallpostAdsEasyPromoteDto(TypeDto typeDto, String str, String str2, String str3, boolean z, String str4, Integer num, Integer num2) {
        this.type = typeDto;
        this.text = str;
        this.labelText = str2;
        this.buttonText = str3;
        this.isAdNotEasy = z;
        this.code = str4;
        this.adId = num;
        this.topUnionId = num2;
    }

    public final Integer d() {
        return this.adId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.buttonText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallpostAdsEasyPromoteDto)) {
            return false;
        }
        WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto = (WallWallpostAdsEasyPromoteDto) obj;
        return this.type == wallWallpostAdsEasyPromoteDto.type && epx.f(this.text, wallWallpostAdsEasyPromoteDto.text) && epx.f(this.labelText, wallWallpostAdsEasyPromoteDto.labelText) && epx.f(this.buttonText, wallWallpostAdsEasyPromoteDto.buttonText) && this.isAdNotEasy == wallWallpostAdsEasyPromoteDto.isAdNotEasy && epx.f(this.code, wallWallpostAdsEasyPromoteDto.code) && epx.f(this.adId, wallWallpostAdsEasyPromoteDto.adId) && epx.f(this.topUnionId, wallWallpostAdsEasyPromoteDto.topUnionId);
    }

    public final String f() {
        return this.labelText;
    }

    public final TypeDto g() {
        return this.type;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.text), 31, this.labelText), 31, this.buttonText), 31, this.isAdNotEasy);
        String str = this.code;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.adId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.topUnionId;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallWallpostAdsEasyPromoteDto(type=");
        sb.append(this.type);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", labelText=");
        sb.append(this.labelText);
        sb.append(", buttonText=");
        sb.append(this.buttonText);
        sb.append(", isAdNotEasy=");
        sb.append(this.isAdNotEasy);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", adId=");
        sb.append(this.adId);
        sb.append(", topUnionId=");
        return uqi.b(sb, this.topUnionId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.text);
        parcel.writeString(this.labelText);
        parcel.writeString(this.buttonText);
        parcel.writeInt(this.isAdNotEasy ? 1 : 0);
        parcel.writeString(this.code);
        Integer num = this.adId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.topUnionId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ WallWallpostAdsEasyPromoteDto(TypeDto typeDto, String str, String str2, String str3, boolean z, String str4, Integer num, Integer num2, int i, zcl zclVar) {
        this(typeDto, str, str2, str3, z, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2);
    }
}
