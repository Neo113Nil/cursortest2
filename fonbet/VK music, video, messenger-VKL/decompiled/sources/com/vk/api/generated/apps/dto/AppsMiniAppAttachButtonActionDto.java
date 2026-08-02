package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: AppsMiniAppAttachButtonActionDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniAppAttachButtonActionDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniAppAttachButtonActionDto> CREATOR = new a();

    @pmi0("coupon_id")
    private final String couponId;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsMiniAppAttachButtonActionDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("take_coupon")
        public static final TypeDto TAKE_COUPON;
        private final String value;

        /* compiled from: AppsMiniAppAttachButtonActionDto.kt */
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
            TypeDto typeDto = new TypeDto("TAKE_COUPON", 0, "take_coupon");
            TAKE_COUPON = typeDto;
            TypeDto[] typeDtoArr = {typeDto};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AppsMiniAppAttachButtonActionDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniAppAttachButtonActionDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniAppAttachButtonActionDto createFromParcel(Parcel parcel) {
            return new AppsMiniAppAttachButtonActionDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniAppAttachButtonActionDto[] newArray(int i) {
            return new AppsMiniAppAttachButtonActionDto[i];
        }
    }

    public AppsMiniAppAttachButtonActionDto(TypeDto typeDto, String str) {
        this.type = typeDto;
        this.couponId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniAppAttachButtonActionDto)) {
            return false;
        }
        AppsMiniAppAttachButtonActionDto appsMiniAppAttachButtonActionDto = (AppsMiniAppAttachButtonActionDto) obj;
        return this.type == appsMiniAppAttachButtonActionDto.type && epx.f(this.couponId, appsMiniAppAttachButtonActionDto.couponId);
    }

    public final int hashCode() {
        return this.couponId.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMiniAppAttachButtonActionDto(type=");
        sb.append(this.type);
        sb.append(", couponId=");
        return ho8.a(sb, this.couponId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.couponId);
    }
}
