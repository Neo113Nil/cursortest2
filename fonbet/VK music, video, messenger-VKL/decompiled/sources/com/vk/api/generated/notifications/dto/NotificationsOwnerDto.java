package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: NotificationsOwnerDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsOwnerDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsOwnerDto> CREATOR = new a();

    @pmi0("id")
    private final UserId id;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NotificationsOwnerDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("group")
        public static final TypeDto GROUP;

        @pmi0("user")
        public static final TypeDto USER;
        private final String value;

        /* compiled from: NotificationsOwnerDto.kt */
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
            TypeDto typeDto = new TypeDto("USER", 0, "user");
            USER = typeDto;
            TypeDto typeDto2 = new TypeDto("GROUP", 1, "group");
            GROUP = typeDto2;
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

    /* compiled from: NotificationsOwnerDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsOwnerDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsOwnerDto createFromParcel(Parcel parcel) {
            return new NotificationsOwnerDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsOwnerDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsOwnerDto[] newArray(int i) {
            return new NotificationsOwnerDto[i];
        }
    }

    public NotificationsOwnerDto(TypeDto typeDto, UserId userId) {
        this.type = typeDto;
        this.id = userId;
    }

    public final UserId d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final TypeDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsOwnerDto)) {
            return false;
        }
        NotificationsOwnerDto notificationsOwnerDto = (NotificationsOwnerDto) obj;
        return this.type == notificationsOwnerDto.type && epx.f(this.id, notificationsOwnerDto.id);
    }

    public final int hashCode() {
        return Long.hashCode(this.id.b) + (this.type.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsOwnerDto(type=");
        sb.append(this.type);
        sb.append(", id=");
        return gp.b(sb, this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.id, i);
    }
}
