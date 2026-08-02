package com.vk.api.generated.atum.dto;

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

/* compiled from: AtumVkuiAnyBadgeDto.kt */
/* loaded from: classes.dex */
public abstract class AtumVkuiAnyBadgeDto implements Parcelable {

    /* compiled from: AtumVkuiAnyBadgeDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiBadgeDto extends AtumVkuiAnyBadgeDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiBadgeDto> CREATOR = new a();

        @pmi0("props")
        private final AtumVkuiBadgePropsDto props;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiAnyBadgeDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("badge")
            public static final TypeDto BADGE;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AtumVkuiAnyBadgeDto.kt */
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
                TypeDto typeDto = new TypeDto("BADGE", 0, "badge");
                BADGE = typeDto;
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

        /* compiled from: AtumVkuiAnyBadgeDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiBadgeDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiBadgeDto createFromParcel(Parcel parcel) {
                return new AtumVkuiBadgeDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiBadgePropsDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiBadgeDto[] newArray(int i) {
                return new AtumVkuiBadgeDto[i];
            }
        }

        public AtumVkuiBadgeDto(TypeDto typeDto, AtumVkuiBadgePropsDto atumVkuiBadgePropsDto) {
            super(null);
            this.type = typeDto;
            this.props = atumVkuiBadgePropsDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiBadgeDto)) {
                return false;
            }
            AtumVkuiBadgeDto atumVkuiBadgeDto = (AtumVkuiBadgeDto) obj;
            return this.type == atumVkuiBadgeDto.type && epx.f(this.props, atumVkuiBadgeDto.props);
        }

        public final int hashCode() {
            return this.props.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "AtumVkuiBadgeDto(type=" + this.type + ", props=" + this.props + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AtumVkuiAnyBadgeDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiContentBadgeDto extends AtumVkuiAnyBadgeDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiContentBadgeDto> CREATOR = new a();

        @pmi0("props")
        private final AtumVkuiContentBadgePropsDto props;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiAnyBadgeDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("contentBadge")
            public static final TypeDto CONTENTBADGE;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AtumVkuiAnyBadgeDto.kt */
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
                TypeDto typeDto = new TypeDto("CONTENTBADGE", 0, "contentBadge");
                CONTENTBADGE = typeDto;
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

        /* compiled from: AtumVkuiAnyBadgeDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiContentBadgeDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiContentBadgeDto createFromParcel(Parcel parcel) {
                return new AtumVkuiContentBadgeDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiContentBadgePropsDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiContentBadgeDto[] newArray(int i) {
                return new AtumVkuiContentBadgeDto[i];
            }
        }

        public AtumVkuiContentBadgeDto(TypeDto typeDto, AtumVkuiContentBadgePropsDto atumVkuiContentBadgePropsDto) {
            super(null);
            this.type = typeDto;
            this.props = atumVkuiContentBadgePropsDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiContentBadgeDto)) {
                return false;
            }
            AtumVkuiContentBadgeDto atumVkuiContentBadgeDto = (AtumVkuiContentBadgeDto) obj;
            return this.type == atumVkuiContentBadgeDto.type && epx.f(this.props, atumVkuiContentBadgeDto.props);
        }

        public final int hashCode() {
            return this.props.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "AtumVkuiContentBadgeDto(type=" + this.type + ", props=" + this.props + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AtumVkuiAnyBadgeDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiCounterDto extends AtumVkuiAnyBadgeDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiCounterDto> CREATOR = new a();

        @pmi0("props")
        private final AtumVkuiCounterPropsDto props;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiAnyBadgeDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("counter")
            public static final TypeDto COUNTER;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AtumVkuiAnyBadgeDto.kt */
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
                TypeDto typeDto = new TypeDto("COUNTER", 0, "counter");
                COUNTER = typeDto;
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

        /* compiled from: AtumVkuiAnyBadgeDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiCounterDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiCounterDto createFromParcel(Parcel parcel) {
                return new AtumVkuiCounterDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiCounterPropsDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiCounterDto[] newArray(int i) {
                return new AtumVkuiCounterDto[i];
            }
        }

        public AtumVkuiCounterDto(TypeDto typeDto, AtumVkuiCounterPropsDto atumVkuiCounterPropsDto) {
            super(null);
            this.type = typeDto;
            this.props = atumVkuiCounterPropsDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiCounterDto)) {
                return false;
            }
            AtumVkuiCounterDto atumVkuiCounterDto = (AtumVkuiCounterDto) obj;
            return this.type == atumVkuiCounterDto.type && epx.f(this.props, atumVkuiCounterDto.props);
        }

        public final int hashCode() {
            return this.props.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "AtumVkuiCounterDto(type=" + this.type + ", props=" + this.props + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AtumVkuiAnyBadgeDto.kt */
    public static final class Deserializer implements a9y<AtumVkuiAnyBadgeDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                int hashCode = f.hashCode();
                if (hashCode != 93494179) {
                    if (hashCode != 804477610) {
                        if (hashCode == 957830652 && f.equals("counter")) {
                            return (AtumVkuiAnyBadgeDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiCounterDto.class);
                        }
                    } else if (f.equals("contentBadge")) {
                        return (AtumVkuiAnyBadgeDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiContentBadgeDto.class);
                    }
                } else if (f.equals("badge")) {
                    return (AtumVkuiAnyBadgeDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiBadgeDto.class);
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    public /* synthetic */ AtumVkuiAnyBadgeDto(zcl zclVar) {
        this();
    }

    private AtumVkuiAnyBadgeDto() {
    }
}
