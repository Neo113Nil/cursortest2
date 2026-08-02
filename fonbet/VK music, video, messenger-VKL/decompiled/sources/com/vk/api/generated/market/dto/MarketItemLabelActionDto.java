package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.pmi0;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketItemLabelActionDto.kt */
/* loaded from: classes15.dex */
public abstract class MarketItemLabelActionDto implements Parcelable {

    /* compiled from: MarketItemLabelActionDto.kt */
    public static final class Deserializer implements a9y<MarketItemLabelActionDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "open_url")) {
                return (MarketItemLabelActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MarketItemLabelActionOpenUrlDto.class);
            }
            if (epx.f(f, "open_modal")) {
                return (MarketItemLabelActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MarketItemLabelActionOpenModalDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: MarketItemLabelActionDto.kt */
    public static final class MarketItemLabelActionOpenModalDto extends MarketItemLabelActionDto implements Parcelable {
        public static final Parcelable.Creator<MarketItemLabelActionOpenModalDto> CREATOR = new a();

        @pmi0("modal")
        private final MarketModalDto modal;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MarketItemLabelActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("open_modal")
            public static final TypeDto OPEN_MODAL;
            private final String value;

            /* compiled from: MarketItemLabelActionDto.kt */
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
                TypeDto typeDto = new TypeDto("OPEN_MODAL", 0, "open_modal");
                OPEN_MODAL = typeDto;
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

        /* compiled from: MarketItemLabelActionDto.kt */
        public static final class a implements Parcelable.Creator<MarketItemLabelActionOpenModalDto> {
            @Override // android.os.Parcelable.Creator
            public final MarketItemLabelActionOpenModalDto createFromParcel(Parcel parcel) {
                return new MarketItemLabelActionOpenModalDto(TypeDto.CREATOR.createFromParcel(parcel), (MarketModalDto) parcel.readParcelable(MarketItemLabelActionOpenModalDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final MarketItemLabelActionOpenModalDto[] newArray(int i) {
                return new MarketItemLabelActionOpenModalDto[i];
            }
        }

        public MarketItemLabelActionOpenModalDto(TypeDto typeDto, MarketModalDto marketModalDto) {
            super(null);
            this.type = typeDto;
            this.modal = marketModalDto;
        }

        public final MarketModalDto d() {
            return this.modal;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketItemLabelActionOpenModalDto)) {
                return false;
            }
            MarketItemLabelActionOpenModalDto marketItemLabelActionOpenModalDto = (MarketItemLabelActionOpenModalDto) obj;
            return this.type == marketItemLabelActionOpenModalDto.type && epx.f(this.modal, marketItemLabelActionOpenModalDto.modal);
        }

        public final int hashCode() {
            return this.modal.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "MarketItemLabelActionOpenModalDto(type=" + this.type + ", modal=" + this.modal + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.modal, i);
        }
    }

    /* compiled from: MarketItemLabelActionDto.kt */
    public static final class MarketItemLabelActionOpenUrlDto extends MarketItemLabelActionDto implements Parcelable {
        public static final Parcelable.Creator<MarketItemLabelActionOpenUrlDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MarketItemLabelActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("open_url")
            public static final TypeDto OPEN_URL;
            private final String value;

            /* compiled from: MarketItemLabelActionDto.kt */
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
                TypeDto typeDto = new TypeDto("OPEN_URL", 0, "open_url");
                OPEN_URL = typeDto;
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

        /* compiled from: MarketItemLabelActionDto.kt */
        public static final class a implements Parcelable.Creator<MarketItemLabelActionOpenUrlDto> {
            @Override // android.os.Parcelable.Creator
            public final MarketItemLabelActionOpenUrlDto createFromParcel(Parcel parcel) {
                return new MarketItemLabelActionOpenUrlDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MarketItemLabelActionOpenUrlDto[] newArray(int i) {
                return new MarketItemLabelActionOpenUrlDto[i];
            }
        }

        public MarketItemLabelActionOpenUrlDto(TypeDto typeDto, String str) {
            super(null);
            this.type = typeDto;
            this.url = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketItemLabelActionOpenUrlDto)) {
                return false;
            }
            MarketItemLabelActionOpenUrlDto marketItemLabelActionOpenUrlDto = (MarketItemLabelActionOpenUrlDto) obj;
            return this.type == marketItemLabelActionOpenUrlDto.type && epx.f(this.url, marketItemLabelActionOpenUrlDto.url);
        }

        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            return this.url.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarketItemLabelActionOpenUrlDto(type=");
            sb.append(this.type);
            sb.append(", url=");
            return ho8.a(sb, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.url);
        }
    }

    public /* synthetic */ MarketItemLabelActionDto(zcl zclVar) {
        this();
    }

    private MarketItemLabelActionDto() {
    }
}
