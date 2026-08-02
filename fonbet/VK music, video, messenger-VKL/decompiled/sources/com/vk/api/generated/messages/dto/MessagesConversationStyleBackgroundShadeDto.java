package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.pmi0;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesConversationStyleBackgroundShadeDto.kt */
/* loaded from: classes15.dex */
public abstract class MessagesConversationStyleBackgroundShadeDto implements Parcelable {

    /* compiled from: MessagesConversationStyleBackgroundShadeDto.kt */
    public static final class Deserializer implements a9y<MessagesConversationStyleBackgroundShadeDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "vector")) {
                return (MessagesConversationStyleBackgroundShadeDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MessagesConversationStyleBackgroundShadeVectorDto.class);
            }
            if (epx.f(f, "raster")) {
                return (MessagesConversationStyleBackgroundShadeDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MessagesConversationStyleBackgroundShadeRasterDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: MessagesConversationStyleBackgroundShadeDto.kt */
    public static final class MessagesConversationStyleBackgroundShadeRasterDto extends MessagesConversationStyleBackgroundShadeDto implements Parcelable {
        public static final Parcelable.Creator<MessagesConversationStyleBackgroundShadeRasterDto> CREATOR = new a();

        @pmi0("raster")
        private final MessagesConversationStyleBackgroundRasterDto raster;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MessagesConversationStyleBackgroundShadeDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("raster")
            public static final TypeDto RASTER;
            private final String value;

            /* compiled from: MessagesConversationStyleBackgroundShadeDto.kt */
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
                TypeDto typeDto = new TypeDto("RASTER", 0, "raster");
                RASTER = typeDto;
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

        /* compiled from: MessagesConversationStyleBackgroundShadeDto.kt */
        public static final class a implements Parcelable.Creator<MessagesConversationStyleBackgroundShadeRasterDto> {
            @Override // android.os.Parcelable.Creator
            public final MessagesConversationStyleBackgroundShadeRasterDto createFromParcel(Parcel parcel) {
                return new MessagesConversationStyleBackgroundShadeRasterDto(TypeDto.CREATOR.createFromParcel(parcel), MessagesConversationStyleBackgroundRasterDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final MessagesConversationStyleBackgroundShadeRasterDto[] newArray(int i) {
                return new MessagesConversationStyleBackgroundShadeRasterDto[i];
            }
        }

        public MessagesConversationStyleBackgroundShadeRasterDto(TypeDto typeDto, MessagesConversationStyleBackgroundRasterDto messagesConversationStyleBackgroundRasterDto) {
            super(null);
            this.type = typeDto;
            this.raster = messagesConversationStyleBackgroundRasterDto;
        }

        public final MessagesConversationStyleBackgroundRasterDto d() {
            return this.raster;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessagesConversationStyleBackgroundShadeRasterDto)) {
                return false;
            }
            MessagesConversationStyleBackgroundShadeRasterDto messagesConversationStyleBackgroundShadeRasterDto = (MessagesConversationStyleBackgroundShadeRasterDto) obj;
            return this.type == messagesConversationStyleBackgroundShadeRasterDto.type && epx.f(this.raster, messagesConversationStyleBackgroundShadeRasterDto.raster);
        }

        public final int hashCode() {
            return this.raster.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "MessagesConversationStyleBackgroundShadeRasterDto(type=" + this.type + ", raster=" + this.raster + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.raster.writeToParcel(parcel, i);
        }
    }

    /* compiled from: MessagesConversationStyleBackgroundShadeDto.kt */
    public static final class MessagesConversationStyleBackgroundShadeVectorDto extends MessagesConversationStyleBackgroundShadeDto implements Parcelable {
        public static final Parcelable.Creator<MessagesConversationStyleBackgroundShadeVectorDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        @pmi0("vector")
        private final MessagesConversationStyleBackgroundVectorDto vector;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MessagesConversationStyleBackgroundShadeDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("vector")
            public static final TypeDto VECTOR;
            private final String value;

            /* compiled from: MessagesConversationStyleBackgroundShadeDto.kt */
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
                TypeDto typeDto = new TypeDto("VECTOR", 0, "vector");
                VECTOR = typeDto;
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

        /* compiled from: MessagesConversationStyleBackgroundShadeDto.kt */
        public static final class a implements Parcelable.Creator<MessagesConversationStyleBackgroundShadeVectorDto> {
            @Override // android.os.Parcelable.Creator
            public final MessagesConversationStyleBackgroundShadeVectorDto createFromParcel(Parcel parcel) {
                return new MessagesConversationStyleBackgroundShadeVectorDto(TypeDto.CREATOR.createFromParcel(parcel), MessagesConversationStyleBackgroundVectorDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final MessagesConversationStyleBackgroundShadeVectorDto[] newArray(int i) {
                return new MessagesConversationStyleBackgroundShadeVectorDto[i];
            }
        }

        public MessagesConversationStyleBackgroundShadeVectorDto(TypeDto typeDto, MessagesConversationStyleBackgroundVectorDto messagesConversationStyleBackgroundVectorDto) {
            super(null);
            this.type = typeDto;
            this.vector = messagesConversationStyleBackgroundVectorDto;
        }

        public final MessagesConversationStyleBackgroundVectorDto d() {
            return this.vector;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessagesConversationStyleBackgroundShadeVectorDto)) {
                return false;
            }
            MessagesConversationStyleBackgroundShadeVectorDto messagesConversationStyleBackgroundShadeVectorDto = (MessagesConversationStyleBackgroundShadeVectorDto) obj;
            return this.type == messagesConversationStyleBackgroundShadeVectorDto.type && epx.f(this.vector, messagesConversationStyleBackgroundShadeVectorDto.vector);
        }

        public final int hashCode() {
            return this.vector.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "MessagesConversationStyleBackgroundShadeVectorDto(type=" + this.type + ", vector=" + this.vector + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.vector.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesConversationStyleBackgroundShadeDto(zcl zclVar) {
        this();
    }

    private MessagesConversationStyleBackgroundShadeDto() {
    }
}
