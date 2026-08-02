package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: NotificationsActualFriendEntityPostMediaTypeDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsActualFriendEntityPostMediaTypeDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsActualFriendEntityPostMediaTypeDto> CREATOR = new a();

    @pmi0("object_id")
    private final int objectId;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NotificationsActualFriendEntityPostMediaTypeDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("clip")
        public static final TypeDto CLIP;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("photo")
        public static final TypeDto PHOTO;

        @pmi0("video")
        public static final TypeDto VIDEO;
        private final String value;

        /* compiled from: NotificationsActualFriendEntityPostMediaTypeDto.kt */
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
            TypeDto typeDto = new TypeDto("PHOTO", 0, "photo");
            PHOTO = typeDto;
            TypeDto typeDto2 = new TypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 1, "video");
            VIDEO = typeDto2;
            TypeDto typeDto3 = new TypeDto("CLIP", 2, "clip");
            CLIP = typeDto3;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
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

    /* compiled from: NotificationsActualFriendEntityPostMediaTypeDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsActualFriendEntityPostMediaTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsActualFriendEntityPostMediaTypeDto createFromParcel(Parcel parcel) {
            return new NotificationsActualFriendEntityPostMediaTypeDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsActualFriendEntityPostMediaTypeDto.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsActualFriendEntityPostMediaTypeDto[] newArray(int i) {
            return new NotificationsActualFriendEntityPostMediaTypeDto[i];
        }
    }

    public NotificationsActualFriendEntityPostMediaTypeDto(TypeDto typeDto, UserId userId, int i) {
        this.type = typeDto;
        this.ownerId = userId;
        this.objectId = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsActualFriendEntityPostMediaTypeDto)) {
            return false;
        }
        NotificationsActualFriendEntityPostMediaTypeDto notificationsActualFriendEntityPostMediaTypeDto = (NotificationsActualFriendEntityPostMediaTypeDto) obj;
        return this.type == notificationsActualFriendEntityPostMediaTypeDto.type && epx.f(this.ownerId, notificationsActualFriendEntityPostMediaTypeDto.ownerId) && this.objectId == notificationsActualFriendEntityPostMediaTypeDto.objectId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.objectId) + bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsActualFriendEntityPostMediaTypeDto(type=");
        sb.append(this.type);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", objectId=");
        return vu5.b(sb, this.objectId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.objectId);
    }
}
