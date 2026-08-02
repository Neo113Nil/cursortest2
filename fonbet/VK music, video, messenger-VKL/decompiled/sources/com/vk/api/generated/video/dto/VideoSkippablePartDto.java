package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoSkippablePartDto.kt */
/* loaded from: classes15.dex */
public final class VideoSkippablePartDto implements Parcelable {
    public static final Parcelable.Creator<VideoSkippablePartDto> CREATOR = new a();

    @pmi0("finish_at")
    private final Integer finishAt;

    @pmi0("start_at")
    private final int startAt;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoSkippablePartDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("ending")
        public static final TypeDto ENDING;

        @pmi0("opening")
        public static final TypeDto OPENING;
        private final String value;

        /* compiled from: VideoSkippablePartDto.kt */
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
            TypeDto typeDto = new TypeDto("OPENING", 0, "opening");
            OPENING = typeDto;
            TypeDto typeDto2 = new TypeDto("ENDING", 1, "ending");
            ENDING = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
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

    /* compiled from: VideoSkippablePartDto.kt */
    public static final class a implements Parcelable.Creator<VideoSkippablePartDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSkippablePartDto createFromParcel(Parcel parcel) {
            return new VideoSkippablePartDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSkippablePartDto[] newArray(int i) {
            return new VideoSkippablePartDto[i];
        }
    }

    public VideoSkippablePartDto(TypeDto typeDto, int i, Integer num) {
        this.type = typeDto;
        this.startAt = i;
        this.finishAt = num;
    }

    public final Integer d() {
        return this.finishAt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.startAt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSkippablePartDto)) {
            return false;
        }
        VideoSkippablePartDto videoSkippablePartDto = (VideoSkippablePartDto) obj;
        return this.type == videoSkippablePartDto.type && this.startAt == videoSkippablePartDto.startAt && epx.f(this.finishAt, videoSkippablePartDto.finishAt);
    }

    public final TypeDto f() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = shy.a(this.startAt, this.type.hashCode() * 31, 31);
        Integer num = this.finishAt;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSkippablePartDto(type=");
        sb.append(this.type);
        sb.append(", startAt=");
        sb.append(this.startAt);
        sb.append(", finishAt=");
        return uqi.b(sb, this.finishAt, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeInt(this.startAt);
        Integer num = this.finishAt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ VideoSkippablePartDto(TypeDto typeDto, int i, Integer num, int i2, zcl zclVar) {
        this(typeDto, i, (i2 & 4) != 0 ? null : num);
    }
}
