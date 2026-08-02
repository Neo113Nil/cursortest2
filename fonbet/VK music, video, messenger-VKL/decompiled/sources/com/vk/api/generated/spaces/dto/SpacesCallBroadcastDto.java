package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SpacesCallBroadcastDto.kt */
/* loaded from: classes15.dex */
public final class SpacesCallBroadcastDto implements Parcelable {
    public static final Parcelable.Creator<SpacesCallBroadcastDto> CREATOR = new a();

    @pmi0("initiator_id")
    private final UserId initiatorId;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("video_id")
    private final Integer videoId;

    @pmi0("video_owner_id")
    private final UserId videoOwnerId;

    @pmi0("video_title")
    private final String videoTitle;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpacesCallBroadcastDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("screen")
        public static final TypeDto SCREEN;

        @pmi0("video")
        public static final TypeDto VIDEO;
        private final String value;

        /* compiled from: SpacesCallBroadcastDto.kt */
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
            TypeDto typeDto = new TypeDto("SCREEN", 0, "screen");
            SCREEN = typeDto;
            TypeDto typeDto2 = new TypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 1, "video");
            VIDEO = typeDto2;
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

    /* compiled from: SpacesCallBroadcastDto.kt */
    public static final class a implements Parcelable.Creator<SpacesCallBroadcastDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesCallBroadcastDto createFromParcel(Parcel parcel) {
            return new SpacesCallBroadcastDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(SpacesCallBroadcastDto.class.getClassLoader()), (UserId) parcel.readParcelable(SpacesCallBroadcastDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesCallBroadcastDto[] newArray(int i) {
            return new SpacesCallBroadcastDto[i];
        }
    }

    public SpacesCallBroadcastDto(TypeDto typeDto, UserId userId, UserId userId2, Integer num, String str) {
        this.type = typeDto;
        this.initiatorId = userId;
        this.videoOwnerId = userId2;
        this.videoId = num;
        this.videoTitle = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesCallBroadcastDto)) {
            return false;
        }
        SpacesCallBroadcastDto spacesCallBroadcastDto = (SpacesCallBroadcastDto) obj;
        return this.type == spacesCallBroadcastDto.type && epx.f(this.initiatorId, spacesCallBroadcastDto.initiatorId) && epx.f(this.videoOwnerId, spacesCallBroadcastDto.videoOwnerId) && epx.f(this.videoId, spacesCallBroadcastDto.videoId) && epx.f(this.videoTitle, spacesCallBroadcastDto.videoTitle);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        UserId userId = this.initiatorId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        UserId userId2 = this.videoOwnerId;
        int hashCode3 = (hashCode2 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        Integer num = this.videoId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.videoTitle;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesCallBroadcastDto(type=");
        sb.append(this.type);
        sb.append(", initiatorId=");
        sb.append(this.initiatorId);
        sb.append(", videoOwnerId=");
        sb.append(this.videoOwnerId);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", videoTitle=");
        return ho8.a(sb, this.videoTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.initiatorId, i);
        parcel.writeParcelable(this.videoOwnerId, i);
        Integer num = this.videoId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.videoTitle);
    }

    public /* synthetic */ SpacesCallBroadcastDto(TypeDto typeDto, UserId userId, UserId userId2, Integer num, String str, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : userId2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str);
    }
}
