package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.epx;
import xsna.go9;
import xsna.pmi0;
import xsna.up;
import xsna.urd0;
import xsna.vu5;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SpacesRelatedEntityDto.kt */
/* loaded from: classes15.dex */
public abstract class SpacesRelatedEntityDto implements Parcelable {

    /* compiled from: SpacesRelatedEntityDto.kt */
    public static final class Deserializer implements a9y<SpacesRelatedEntityDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -1060027019:
                        if (f.equals("tribune")) {
                            return (SpacesRelatedEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SpacesRelatedEntityTribuneDto.class);
                        }
                        break;
                    case 3045982:
                        if (f.equals(NotificationCompat.CATEGORY_CALL)) {
                            return (SpacesRelatedEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SpacesRelatedEntityCallDto.class);
                        }
                        break;
                    case 738950403:
                        if (f.equals("channel")) {
                            return (SpacesRelatedEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SpacesRelatedEntityChannelDto.class);
                        }
                        break;
                    case 740154499:
                        if (f.equals(SignalingProtocol.KEY_CONVERSATION)) {
                            return (SpacesRelatedEntityDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SpacesRelatedEntityConversationDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SpacesRelatedEntityDto.kt */
    public static final class SpacesRelatedEntityCallDto extends SpacesRelatedEntityDto implements Parcelable {
        public static final Parcelable.Creator<SpacesRelatedEntityCallDto> CREATOR = new a();

        @pmi0("call_id")
        private final String callId;

        @pmi0("peer_id")
        private final long peerId;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SpacesRelatedEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0(NotificationCompat.CATEGORY_CALL)
            public static final TypeDto CALL;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: SpacesRelatedEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("CALL", 0, NotificationCompat.CATEGORY_CALL);
                CALL = typeDto;
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

        /* compiled from: SpacesRelatedEntityDto.kt */
        public static final class a implements Parcelable.Creator<SpacesRelatedEntityCallDto> {
            @Override // android.os.Parcelable.Creator
            public final SpacesRelatedEntityCallDto createFromParcel(Parcel parcel) {
                return new SpacesRelatedEntityCallDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final SpacesRelatedEntityCallDto[] newArray(int i) {
                return new SpacesRelatedEntityCallDto[i];
            }
        }

        public SpacesRelatedEntityCallDto(TypeDto typeDto, String str, long j) {
            super(null);
            this.type = typeDto;
            this.callId = str;
            this.peerId = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpacesRelatedEntityCallDto)) {
                return false;
            }
            SpacesRelatedEntityCallDto spacesRelatedEntityCallDto = (SpacesRelatedEntityCallDto) obj;
            return this.type == spacesRelatedEntityCallDto.type && epx.f(this.callId, spacesRelatedEntityCallDto.callId) && this.peerId == spacesRelatedEntityCallDto.peerId;
        }

        public final int hashCode() {
            return Long.hashCode(this.peerId) + urd0.a(this.type.hashCode() * 31, 31, this.callId);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SpacesRelatedEntityCallDto(type=");
            sb.append(this.type);
            sb.append(", callId=");
            sb.append(this.callId);
            sb.append(", peerId=");
            return vu5.a(')', this.peerId, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.callId);
            parcel.writeLong(this.peerId);
        }
    }

    /* compiled from: SpacesRelatedEntityDto.kt */
    public static final class SpacesRelatedEntityChannelDto extends SpacesRelatedEntityDto implements Parcelable {
        public static final Parcelable.Creator<SpacesRelatedEntityChannelDto> CREATOR = new a();

        @pmi0("channel_id")
        private final UserId channelId;

        @pmi0("peer_id")
        private final long peerId;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SpacesRelatedEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("channel")
            public static final TypeDto CHANNEL;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: SpacesRelatedEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("CHANNEL", 0, "channel");
                CHANNEL = typeDto;
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

        /* compiled from: SpacesRelatedEntityDto.kt */
        public static final class a implements Parcelable.Creator<SpacesRelatedEntityChannelDto> {
            @Override // android.os.Parcelable.Creator
            public final SpacesRelatedEntityChannelDto createFromParcel(Parcel parcel) {
                return new SpacesRelatedEntityChannelDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(SpacesRelatedEntityChannelDto.class.getClassLoader()), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final SpacesRelatedEntityChannelDto[] newArray(int i) {
                return new SpacesRelatedEntityChannelDto[i];
            }
        }

        public SpacesRelatedEntityChannelDto(TypeDto typeDto, UserId userId, long j) {
            super(null);
            this.type = typeDto;
            this.channelId = userId;
            this.peerId = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpacesRelatedEntityChannelDto)) {
                return false;
            }
            SpacesRelatedEntityChannelDto spacesRelatedEntityChannelDto = (SpacesRelatedEntityChannelDto) obj;
            return this.type == spacesRelatedEntityChannelDto.type && epx.f(this.channelId, spacesRelatedEntityChannelDto.channelId) && this.peerId == spacesRelatedEntityChannelDto.peerId;
        }

        public final int hashCode() {
            return Long.hashCode(this.peerId) + bh10.a(this.type.hashCode() * 31, 31, this.channelId.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SpacesRelatedEntityChannelDto(type=");
            sb.append(this.type);
            sb.append(", channelId=");
            sb.append(this.channelId);
            sb.append(", peerId=");
            return vu5.a(')', this.peerId, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.channelId, i);
            parcel.writeLong(this.peerId);
        }
    }

    /* compiled from: SpacesRelatedEntityDto.kt */
    public static final class SpacesRelatedEntityConversationDto extends SpacesRelatedEntityDto implements Parcelable {
        public static final Parcelable.Creator<SpacesRelatedEntityConversationDto> CREATOR = new a();

        @pmi0("peer_id")
        private final long peerId;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SpacesRelatedEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0(SignalingProtocol.KEY_CONVERSATION)
            public static final TypeDto CONVERSATION;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: SpacesRelatedEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("CONVERSATION", 0, SignalingProtocol.KEY_CONVERSATION);
                CONVERSATION = typeDto;
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

        /* compiled from: SpacesRelatedEntityDto.kt */
        public static final class a implements Parcelable.Creator<SpacesRelatedEntityConversationDto> {
            @Override // android.os.Parcelable.Creator
            public final SpacesRelatedEntityConversationDto createFromParcel(Parcel parcel) {
                return new SpacesRelatedEntityConversationDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final SpacesRelatedEntityConversationDto[] newArray(int i) {
                return new SpacesRelatedEntityConversationDto[i];
            }
        }

        public SpacesRelatedEntityConversationDto(TypeDto typeDto, long j) {
            super(null);
            this.type = typeDto;
            this.peerId = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpacesRelatedEntityConversationDto)) {
                return false;
            }
            SpacesRelatedEntityConversationDto spacesRelatedEntityConversationDto = (SpacesRelatedEntityConversationDto) obj;
            return this.type == spacesRelatedEntityConversationDto.type && this.peerId == spacesRelatedEntityConversationDto.peerId;
        }

        public final int hashCode() {
            return Long.hashCode(this.peerId) + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SpacesRelatedEntityConversationDto(type=");
            sb.append(this.type);
            sb.append(", peerId=");
            return vu5.a(')', this.peerId, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeLong(this.peerId);
        }
    }

    /* compiled from: SpacesRelatedEntityDto.kt */
    public static final class SpacesRelatedEntityTribuneDto extends SpacesRelatedEntityDto implements Parcelable {
        public static final Parcelable.Creator<SpacesRelatedEntityTribuneDto> CREATOR = new a();

        @pmi0("call_id")
        private final String callId;

        @pmi0("peer_id")
        private final long peerId;

        @pmi0("tribune_id")
        private final String tribuneId;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SpacesRelatedEntityDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("tribune")
            public static final TypeDto TRIBUNE;
            private final String value;

            /* compiled from: SpacesRelatedEntityDto.kt */
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
                TypeDto typeDto = new TypeDto("TRIBUNE", 0, "tribune");
                TRIBUNE = typeDto;
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

        /* compiled from: SpacesRelatedEntityDto.kt */
        public static final class a implements Parcelable.Creator<SpacesRelatedEntityTribuneDto> {
            @Override // android.os.Parcelable.Creator
            public final SpacesRelatedEntityTribuneDto createFromParcel(Parcel parcel) {
                return new SpacesRelatedEntityTribuneDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final SpacesRelatedEntityTribuneDto[] newArray(int i) {
                return new SpacesRelatedEntityTribuneDto[i];
            }
        }

        public SpacesRelatedEntityTribuneDto(TypeDto typeDto, String str, String str2, long j) {
            super(null);
            this.type = typeDto;
            this.tribuneId = str;
            this.callId = str2;
            this.peerId = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpacesRelatedEntityTribuneDto)) {
                return false;
            }
            SpacesRelatedEntityTribuneDto spacesRelatedEntityTribuneDto = (SpacesRelatedEntityTribuneDto) obj;
            return this.type == spacesRelatedEntityTribuneDto.type && epx.f(this.tribuneId, spacesRelatedEntityTribuneDto.tribuneId) && epx.f(this.callId, spacesRelatedEntityTribuneDto.callId) && this.peerId == spacesRelatedEntityTribuneDto.peerId;
        }

        public final int hashCode() {
            return Long.hashCode(this.peerId) + urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.tribuneId), 31, this.callId);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SpacesRelatedEntityTribuneDto(type=");
            sb.append(this.type);
            sb.append(", tribuneId=");
            sb.append(this.tribuneId);
            sb.append(", callId=");
            sb.append(this.callId);
            sb.append(", peerId=");
            return vu5.a(')', this.peerId, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.tribuneId);
            parcel.writeString(this.callId);
            parcel.writeLong(this.peerId);
        }
    }

    public /* synthetic */ SpacesRelatedEntityDto(zcl zclVar) {
        this();
    }

    private SpacesRelatedEntityDto() {
    }
}
