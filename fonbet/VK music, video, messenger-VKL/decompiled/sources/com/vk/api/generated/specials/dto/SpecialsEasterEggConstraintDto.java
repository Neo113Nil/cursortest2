package com.vk.api.generated.specials.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SpecialsEasterEggConstraintDto.kt */
/* loaded from: classes15.dex */
public final class SpecialsEasterEggConstraintDto implements Parcelable {
    public static final Parcelable.Creator<SpecialsEasterEggConstraintDto> CREATOR = new a();

    @pmi0("constraint_type")
    private final ConstraintTypeDto constraintType;

    @pmi0("end_time")
    private final float endTime;

    @pmi0("start_time")
    private final float startTime;

    @pmi0("use_server_time")
    private final Boolean useServerTime;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpecialsEasterEggConstraintDto.kt */
    public static final class ConstraintTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ConstraintTypeDto[] $VALUES;
        public static final Parcelable.Creator<ConstraintTypeDto> CREATOR;

        @pmi0("show_on_time")
        public static final ConstraintTypeDto SHOW_ON_TIME;

        @pmi0("show_on_time_daily")
        public static final ConstraintTypeDto SHOW_ON_TIME_DAILY;
        private final String value;

        /* compiled from: SpecialsEasterEggConstraintDto.kt */
        public static final class a implements Parcelable.Creator<ConstraintTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ConstraintTypeDto createFromParcel(Parcel parcel) {
                return ConstraintTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ConstraintTypeDto[] newArray(int i) {
                return new ConstraintTypeDto[i];
            }
        }

        static {
            ConstraintTypeDto constraintTypeDto = new ConstraintTypeDto("SHOW_ON_TIME", 0, "show_on_time");
            SHOW_ON_TIME = constraintTypeDto;
            ConstraintTypeDto constraintTypeDto2 = new ConstraintTypeDto("SHOW_ON_TIME_DAILY", 1, "show_on_time_daily");
            SHOW_ON_TIME_DAILY = constraintTypeDto2;
            ConstraintTypeDto[] constraintTypeDtoArr = {constraintTypeDto, constraintTypeDto2};
            $VALUES = constraintTypeDtoArr;
            $ENTRIES = new asp(constraintTypeDtoArr);
            CREATOR = new a();
        }

        private ConstraintTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ConstraintTypeDto valueOf(String str) {
            return (ConstraintTypeDto) Enum.valueOf(ConstraintTypeDto.class, str);
        }

        public static ConstraintTypeDto[] values() {
            return (ConstraintTypeDto[]) $VALUES.clone();
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

    /* compiled from: SpecialsEasterEggConstraintDto.kt */
    public static final class a implements Parcelable.Creator<SpecialsEasterEggConstraintDto> {
        @Override // android.os.Parcelable.Creator
        public final SpecialsEasterEggConstraintDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ConstraintTypeDto createFromParcel = ConstraintTypeDto.CREATOR.createFromParcel(parcel);
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SpecialsEasterEggConstraintDto(createFromParcel, readFloat, readFloat2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SpecialsEasterEggConstraintDto[] newArray(int i) {
            return new SpecialsEasterEggConstraintDto[i];
        }
    }

    public SpecialsEasterEggConstraintDto(ConstraintTypeDto constraintTypeDto, float f, float f2, Boolean bool) {
        this.constraintType = constraintTypeDto;
        this.startTime = f;
        this.endTime = f2;
        this.useServerTime = bool;
    }

    public final ConstraintTypeDto d() {
        return this.constraintType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e() {
        return this.endTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialsEasterEggConstraintDto)) {
            return false;
        }
        SpecialsEasterEggConstraintDto specialsEasterEggConstraintDto = (SpecialsEasterEggConstraintDto) obj;
        return this.constraintType == specialsEasterEggConstraintDto.constraintType && Float.compare(this.startTime, specialsEasterEggConstraintDto.startTime) == 0 && Float.compare(this.endTime, specialsEasterEggConstraintDto.endTime) == 0 && epx.f(this.useServerTime, specialsEasterEggConstraintDto.useServerTime);
    }

    public final float f() {
        return this.startTime;
    }

    public final Boolean g() {
        return this.useServerTime;
    }

    public final int hashCode() {
        int a2 = b.a(this.endTime, b.a(this.startTime, this.constraintType.hashCode() * 31, 31), 31);
        Boolean bool = this.useServerTime;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialsEasterEggConstraintDto(constraintType=");
        sb.append(this.constraintType);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", useServerTime=");
        return tn.a(sb, this.useServerTime, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.constraintType.writeToParcel(parcel, i);
        parcel.writeFloat(this.startTime);
        parcel.writeFloat(this.endTime);
        Boolean bool = this.useServerTime;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ SpecialsEasterEggConstraintDto(ConstraintTypeDto constraintTypeDto, float f, float f2, Boolean bool, int i, zcl zclVar) {
        this(constraintTypeDto, f, f2, (i & 8) != 0 ? null : bool);
    }
}
