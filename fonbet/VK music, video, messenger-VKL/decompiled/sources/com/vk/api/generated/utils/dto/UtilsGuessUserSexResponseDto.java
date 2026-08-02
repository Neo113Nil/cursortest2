package com.vk.api.generated.utils.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: UtilsGuessUserSexResponseDto.kt */
/* loaded from: classes15.dex */
public final class UtilsGuessUserSexResponseDto implements Parcelable {
    public static final Parcelable.Creator<UtilsGuessUserSexResponseDto> CREATOR = new a();

    @pmi0("sex")
    private final SexDto sex;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UtilsGuessUserSexResponseDto.kt */
    public static final class SexDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SexDto[] $VALUES;
        public static final Parcelable.Creator<SexDto> CREATOR;

        @pmi0(IronSourceConstants.a.c)
        public static final SexDto FEMALE;

        @pmi0(IronSourceConstants.a.b)
        public static final SexDto MALE;

        @pmi0(StringUtils.UNDEFINED)
        public static final SexDto UNDEFINED;
        private final String value;

        /* compiled from: UtilsGuessUserSexResponseDto.kt */
        public static final class a implements Parcelable.Creator<SexDto> {
            @Override // android.os.Parcelable.Creator
            public final SexDto createFromParcel(Parcel parcel) {
                return SexDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SexDto[] newArray(int i) {
                return new SexDto[i];
            }
        }

        static {
            SexDto sexDto = new SexDto("UNDEFINED", 0, StringUtils.UNDEFINED);
            UNDEFINED = sexDto;
            SexDto sexDto2 = new SexDto("FEMALE", 1, IronSourceConstants.a.c);
            FEMALE = sexDto2;
            SexDto sexDto3 = new SexDto("MALE", 2, IronSourceConstants.a.b);
            MALE = sexDto3;
            SexDto[] sexDtoArr = {sexDto, sexDto2, sexDto3};
            $VALUES = sexDtoArr;
            $ENTRIES = new asp(sexDtoArr);
            CREATOR = new a();
        }

        private SexDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SexDto valueOf(String str) {
            return (SexDto) Enum.valueOf(SexDto.class, str);
        }

        public static SexDto[] values() {
            return (SexDto[]) $VALUES.clone();
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

    /* compiled from: UtilsGuessUserSexResponseDto.kt */
    public static final class a implements Parcelable.Creator<UtilsGuessUserSexResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final UtilsGuessUserSexResponseDto createFromParcel(Parcel parcel) {
            return new UtilsGuessUserSexResponseDto(SexDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final UtilsGuessUserSexResponseDto[] newArray(int i) {
            return new UtilsGuessUserSexResponseDto[i];
        }
    }

    public UtilsGuessUserSexResponseDto(SexDto sexDto) {
        this.sex = sexDto;
    }

    public final SexDto d() {
        return this.sex;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UtilsGuessUserSexResponseDto) && this.sex == ((UtilsGuessUserSexResponseDto) obj).sex;
    }

    public final int hashCode() {
        return this.sex.hashCode();
    }

    public final String toString() {
        return "UtilsGuessUserSexResponseDto(sex=" + this.sex + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.sex.writeToParcel(parcel, i);
    }
}
