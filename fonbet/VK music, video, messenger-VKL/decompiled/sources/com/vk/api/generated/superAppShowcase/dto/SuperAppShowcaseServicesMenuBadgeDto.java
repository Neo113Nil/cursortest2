package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.go9;
import xsna.pmi0;
import xsna.up;
import xsna.vu5;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppShowcaseServicesMenuBadgeDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppShowcaseServicesMenuBadgeDto implements Parcelable {

    /* compiled from: SuperAppShowcaseServicesMenuBadgeDto.kt */
    public static final class Deserializer implements a9y<SuperAppShowcaseServicesMenuBadgeDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                int hashCode = f.hashCode();
                if (hashCode != 99657) {
                    if (hashCode != 108960) {
                        if (hashCode == 957830652 && f.equals("counter")) {
                            return (SuperAppShowcaseServicesMenuBadgeDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseServicesMenuBadgeCounterDto.class);
                        }
                    } else if (f.equals("new")) {
                        return (SuperAppShowcaseServicesMenuBadgeDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseServicesMenuBadgeNewDto.class);
                    }
                } else if (f.equals("dot")) {
                    return (SuperAppShowcaseServicesMenuBadgeDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseServicesMenuBadgeDotDto.class);
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppShowcaseServicesMenuBadgeDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseServicesMenuBadgeCounterDto extends SuperAppShowcaseServicesMenuBadgeDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseServicesMenuBadgeCounterDto> CREATOR = new a();

        @pmi0("count")
        private final int count;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseServicesMenuBadgeDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("counter")
            public static final TypeDto COUNTER;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: SuperAppShowcaseServicesMenuBadgeDto.kt */
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

        /* compiled from: SuperAppShowcaseServicesMenuBadgeDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseServicesMenuBadgeCounterDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseServicesMenuBadgeCounterDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseServicesMenuBadgeCounterDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseServicesMenuBadgeCounterDto[] newArray(int i) {
                return new SuperAppShowcaseServicesMenuBadgeCounterDto[i];
            }
        }

        public SuperAppShowcaseServicesMenuBadgeCounterDto(TypeDto typeDto, int i) {
            super(null);
            this.type = typeDto;
            this.count = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseServicesMenuBadgeCounterDto)) {
                return false;
            }
            SuperAppShowcaseServicesMenuBadgeCounterDto superAppShowcaseServicesMenuBadgeCounterDto = (SuperAppShowcaseServicesMenuBadgeCounterDto) obj;
            return this.type == superAppShowcaseServicesMenuBadgeCounterDto.type && this.count == superAppShowcaseServicesMenuBadgeCounterDto.count;
        }

        public final int getCount() {
            return this.count;
        }

        public final int hashCode() {
            return Integer.hashCode(this.count) + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseServicesMenuBadgeCounterDto(type=");
            sb.append(this.type);
            sb.append(", count=");
            return vu5.b(sb, this.count, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeInt(this.count);
        }
    }

    /* compiled from: SuperAppShowcaseServicesMenuBadgeDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseServicesMenuBadgeDotDto extends SuperAppShowcaseServicesMenuBadgeDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseServicesMenuBadgeDotDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseServicesMenuBadgeDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("dot")
            public static final TypeDto DOT;
            private final String value;

            /* compiled from: SuperAppShowcaseServicesMenuBadgeDto.kt */
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
                TypeDto typeDto = new TypeDto("DOT", 0, "dot");
                DOT = typeDto;
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

        /* compiled from: SuperAppShowcaseServicesMenuBadgeDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseServicesMenuBadgeDotDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseServicesMenuBadgeDotDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseServicesMenuBadgeDotDto(TypeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseServicesMenuBadgeDotDto[] newArray(int i) {
                return new SuperAppShowcaseServicesMenuBadgeDotDto[i];
            }
        }

        public SuperAppShowcaseServicesMenuBadgeDotDto(TypeDto typeDto) {
            super(null);
            this.type = typeDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuperAppShowcaseServicesMenuBadgeDotDto) && this.type == ((SuperAppShowcaseServicesMenuBadgeDotDto) obj).type;
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final String toString() {
            return "SuperAppShowcaseServicesMenuBadgeDotDto(type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
        }
    }

    /* compiled from: SuperAppShowcaseServicesMenuBadgeDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseServicesMenuBadgeNewDto extends SuperAppShowcaseServicesMenuBadgeDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseServicesMenuBadgeNewDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseServicesMenuBadgeDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("new")
            public static final TypeDto NEW;
            private final String value;

            /* compiled from: SuperAppShowcaseServicesMenuBadgeDto.kt */
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
                TypeDto typeDto = new TypeDto("NEW", 0, "new");
                NEW = typeDto;
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

        /* compiled from: SuperAppShowcaseServicesMenuBadgeDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseServicesMenuBadgeNewDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseServicesMenuBadgeNewDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseServicesMenuBadgeNewDto(TypeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseServicesMenuBadgeNewDto[] newArray(int i) {
                return new SuperAppShowcaseServicesMenuBadgeNewDto[i];
            }
        }

        public SuperAppShowcaseServicesMenuBadgeNewDto(TypeDto typeDto) {
            super(null);
            this.type = typeDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuperAppShowcaseServicesMenuBadgeNewDto) && this.type == ((SuperAppShowcaseServicesMenuBadgeNewDto) obj).type;
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final String toString() {
            return "SuperAppShowcaseServicesMenuBadgeNewDto(type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppShowcaseServicesMenuBadgeDto(zcl zclVar) {
        this();
    }

    private SuperAppShowcaseServicesMenuBadgeDto() {
    }
}
