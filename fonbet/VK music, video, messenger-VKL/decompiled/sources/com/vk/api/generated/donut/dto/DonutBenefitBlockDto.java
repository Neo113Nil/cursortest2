package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: DonutBenefitBlockDto.kt */
/* loaded from: classes14.dex */
public final class DonutBenefitBlockDto implements Parcelable {
    public static final Parcelable.Creator<DonutBenefitBlockDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DonutBenefitBlockDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("article")
        public static final TypeDto ARTICLE;

        @pmi0("chat")
        public static final TypeDto CHAT;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("podcast")
        public static final TypeDto PODCAST;

        @pmi0("post")
        public static final TypeDto POST;

        @pmi0("video")
        public static final TypeDto VIDEO;
        private final String value;

        /* compiled from: DonutBenefitBlockDto.kt */
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
            TypeDto typeDto = new TypeDto("ARTICLE", 0, "article");
            ARTICLE = typeDto;
            TypeDto typeDto2 = new TypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 1, "video");
            VIDEO = typeDto2;
            TypeDto typeDto3 = new TypeDto("PODCAST", 2, "podcast");
            PODCAST = typeDto3;
            TypeDto typeDto4 = new TypeDto("POST", 3, "post");
            POST = typeDto4;
            TypeDto typeDto5 = new TypeDto("CHAT", 4, "chat");
            CHAT = typeDto5;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5};
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: DonutBenefitBlockDto.kt */
    public static final class a implements Parcelable.Creator<DonutBenefitBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutBenefitBlockDto createFromParcel(Parcel parcel) {
            return new DonutBenefitBlockDto(parcel.readString(), TypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DonutBenefitBlockDto[] newArray(int i) {
            return new DonutBenefitBlockDto[i];
        }
    }

    public DonutBenefitBlockDto(String str, TypeDto typeDto) {
        this.description = str;
        this.type = typeDto;
    }

    public final TypeDto d() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutBenefitBlockDto)) {
            return false;
        }
        DonutBenefitBlockDto donutBenefitBlockDto = (DonutBenefitBlockDto) obj;
        return epx.f(this.description, donutBenefitBlockDto.description) && this.type == donutBenefitBlockDto.type;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        return this.type.hashCode() + (this.description.hashCode() * 31);
    }

    public final String toString() {
        return "DonutBenefitBlockDto(description=" + this.description + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.description);
        this.type.writeToParcel(parcel, i);
    }
}
