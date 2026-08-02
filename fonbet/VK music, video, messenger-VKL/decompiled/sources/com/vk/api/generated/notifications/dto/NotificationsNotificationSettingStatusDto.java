package com.vk.api.generated.notifications.dto;

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

/* compiled from: NotificationsNotificationSettingStatusDto.kt */
/* loaded from: classes15.dex */
public abstract class NotificationsNotificationSettingStatusDto implements Parcelable {

    /* compiled from: NotificationsNotificationSettingStatusDto.kt */
    public static final class Deserializer implements a9y<NotificationsNotificationSettingStatusDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "enum")) {
                return (NotificationsNotificationSettingStatusDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsNotificationSettingStatusEnumDto.class);
            }
            if (epx.f(f, "string")) {
                return (NotificationsNotificationSettingStatusDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NotificationsNotificationSettingStatusStringDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: NotificationsNotificationSettingStatusDto.kt */
    public static final class NotificationsNotificationSettingStatusEnumDto extends NotificationsNotificationSettingStatusDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsNotificationSettingStatusEnumDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        @pmi0("value")
        private final ValueDto value;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsNotificationSettingStatusDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("enum")
            public static final TypeDto ENUM;
            private final String value;

            /* compiled from: NotificationsNotificationSettingStatusDto.kt */
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
                TypeDto typeDto = new TypeDto("ENUM", 0, "enum");
                ENUM = typeDto;
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsNotificationSettingStatusDto.kt */
        public static final class ValueDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ValueDto[] $VALUES;
            public static final Parcelable.Creator<ValueDto> CREATOR;

            @pmi0("off")
            public static final ValueDto OFF;

            @pmi0("on")
            public static final ValueDto ON;

            @pmi0("only_bell")
            public static final ValueDto ONLY_BELL;

            @pmi0("only_push")
            public static final ValueDto ONLY_PUSH;
            private final String value;

            /* compiled from: NotificationsNotificationSettingStatusDto.kt */
            public static final class a implements Parcelable.Creator<ValueDto> {
                @Override // android.os.Parcelable.Creator
                public final ValueDto createFromParcel(Parcel parcel) {
                    return ValueDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ValueDto[] newArray(int i) {
                    return new ValueDto[i];
                }
            }

            static {
                ValueDto valueDto = new ValueDto("ON", 0, "on");
                ON = valueDto;
                ValueDto valueDto2 = new ValueDto("OFF", 1, "off");
                OFF = valueDto2;
                ValueDto valueDto3 = new ValueDto("ONLY_BELL", 2, "only_bell");
                ONLY_BELL = valueDto3;
                ValueDto valueDto4 = new ValueDto("ONLY_PUSH", 3, "only_push");
                ONLY_PUSH = valueDto4;
                ValueDto[] valueDtoArr = {valueDto, valueDto2, valueDto3, valueDto4};
                $VALUES = valueDtoArr;
                $ENTRIES = new asp(valueDtoArr);
                CREATOR = new a();
            }

            private ValueDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static ValueDto valueOf(String str) {
                return (ValueDto) Enum.valueOf(ValueDto.class, str);
            }

            public static ValueDto[] values() {
                return (ValueDto[]) $VALUES.clone();
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

        /* compiled from: NotificationsNotificationSettingStatusDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsNotificationSettingStatusEnumDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationSettingStatusEnumDto createFromParcel(Parcel parcel) {
                return new NotificationsNotificationSettingStatusEnumDto(TypeDto.CREATOR.createFromParcel(parcel), ValueDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationSettingStatusEnumDto[] newArray(int i) {
                return new NotificationsNotificationSettingStatusEnumDto[i];
            }
        }

        public NotificationsNotificationSettingStatusEnumDto(TypeDto typeDto, ValueDto valueDto) {
            super(null);
            this.type = typeDto;
            this.value = valueDto;
        }

        public final ValueDto d() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsNotificationSettingStatusEnumDto)) {
                return false;
            }
            NotificationsNotificationSettingStatusEnumDto notificationsNotificationSettingStatusEnumDto = (NotificationsNotificationSettingStatusEnumDto) obj;
            return this.type == notificationsNotificationSettingStatusEnumDto.type && this.value == notificationsNotificationSettingStatusEnumDto.value;
        }

        public final int hashCode() {
            return this.value.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "NotificationsNotificationSettingStatusEnumDto(type=" + this.type + ", value=" + this.value + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.value.writeToParcel(parcel, i);
        }
    }

    /* compiled from: NotificationsNotificationSettingStatusDto.kt */
    public static final class NotificationsNotificationSettingStatusStringDto extends NotificationsNotificationSettingStatusDto implements Parcelable {
        public static final Parcelable.Creator<NotificationsNotificationSettingStatusStringDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        @pmi0("value")
        private final String value;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NotificationsNotificationSettingStatusDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("string")
            public static final TypeDto STRING;
            private final String value;

            /* compiled from: NotificationsNotificationSettingStatusDto.kt */
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
                TypeDto typeDto = new TypeDto("STRING", 0, "string");
                STRING = typeDto;
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

        /* compiled from: NotificationsNotificationSettingStatusDto.kt */
        public static final class a implements Parcelable.Creator<NotificationsNotificationSettingStatusStringDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationSettingStatusStringDto createFromParcel(Parcel parcel) {
                return new NotificationsNotificationSettingStatusStringDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationsNotificationSettingStatusStringDto[] newArray(int i) {
                return new NotificationsNotificationSettingStatusStringDto[i];
            }
        }

        public NotificationsNotificationSettingStatusStringDto(TypeDto typeDto, String str) {
            super(null);
            this.type = typeDto;
            this.value = str;
        }

        public final String d() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationsNotificationSettingStatusStringDto)) {
                return false;
            }
            NotificationsNotificationSettingStatusStringDto notificationsNotificationSettingStatusStringDto = (NotificationsNotificationSettingStatusStringDto) obj;
            return this.type == notificationsNotificationSettingStatusStringDto.type && epx.f(this.value, notificationsNotificationSettingStatusStringDto.value);
        }

        public final int hashCode() {
            return this.value.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationsNotificationSettingStatusStringDto(type=");
            sb.append(this.type);
            sb.append(", value=");
            return ho8.a(sb, this.value, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.value);
        }
    }

    public /* synthetic */ NotificationsNotificationSettingStatusDto(zcl zclVar) {
        this();
    }

    private NotificationsNotificationSettingStatusDto() {
    }
}
