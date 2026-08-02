package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.dto.common.id.UserId;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.epx;
import xsna.go9;
import xsna.k73;
import xsna.pmi0;
import xsna.shy;
import xsna.up;
import xsna.vu5;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ChannelsGetPaymentStatusResponseDataDto.kt */
/* loaded from: classes14.dex */
public abstract class ChannelsGetPaymentStatusResponseDataDto implements Parcelable {

    /* compiled from: ChannelsGetPaymentStatusResponseDataDto.kt */
    public static final class ChannelsPaymentResultMessagesPaidReactionsDto extends ChannelsGetPaymentStatusResponseDataDto implements Parcelable {
        public static final Parcelable.Creator<ChannelsPaymentResultMessagesPaidReactionsDto> CREATOR = new a();

        @pmi0("channel_id")
        private final UserId channelId;

        @pmi0("cmid")
        private final int cmid;

        @pmi0("total_reaction_count")
        private final int totalReactionCount;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ChannelsGetPaymentStatusResponseDataDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("channel_messages_paid_reactions")
            public static final TypeDto CHANNEL_MESSAGES_PAID_REACTIONS;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: ChannelsGetPaymentStatusResponseDataDto.kt */
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
                TypeDto typeDto = new TypeDto("CHANNEL_MESSAGES_PAID_REACTIONS", 0, "channel_messages_paid_reactions");
                CHANNEL_MESSAGES_PAID_REACTIONS = typeDto;
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

        /* compiled from: ChannelsGetPaymentStatusResponseDataDto.kt */
        public static final class a implements Parcelable.Creator<ChannelsPaymentResultMessagesPaidReactionsDto> {
            @Override // android.os.Parcelable.Creator
            public final ChannelsPaymentResultMessagesPaidReactionsDto createFromParcel(Parcel parcel) {
                return new ChannelsPaymentResultMessagesPaidReactionsDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(ChannelsPaymentResultMessagesPaidReactionsDto.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final ChannelsPaymentResultMessagesPaidReactionsDto[] newArray(int i) {
                return new ChannelsPaymentResultMessagesPaidReactionsDto[i];
            }
        }

        public ChannelsPaymentResultMessagesPaidReactionsDto(TypeDto typeDto, UserId userId, int i, int i2) {
            super(null);
            this.type = typeDto;
            this.channelId = userId;
            this.cmid = i;
            this.totalReactionCount = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChannelsPaymentResultMessagesPaidReactionsDto)) {
                return false;
            }
            ChannelsPaymentResultMessagesPaidReactionsDto channelsPaymentResultMessagesPaidReactionsDto = (ChannelsPaymentResultMessagesPaidReactionsDto) obj;
            return this.type == channelsPaymentResultMessagesPaidReactionsDto.type && epx.f(this.channelId, channelsPaymentResultMessagesPaidReactionsDto.channelId) && this.cmid == channelsPaymentResultMessagesPaidReactionsDto.cmid && this.totalReactionCount == channelsPaymentResultMessagesPaidReactionsDto.totalReactionCount;
        }

        public final int hashCode() {
            return Integer.hashCode(this.totalReactionCount) + shy.a(this.cmid, bh10.a(this.type.hashCode() * 31, 31, this.channelId.b), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChannelsPaymentResultMessagesPaidReactionsDto(type=");
            sb.append(this.type);
            sb.append(", channelId=");
            sb.append(this.channelId);
            sb.append(", cmid=");
            sb.append(this.cmid);
            sb.append(", totalReactionCount=");
            return vu5.b(sb, this.totalReactionCount, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.channelId, i);
            parcel.writeInt(this.cmid);
            parcel.writeInt(this.totalReactionCount);
        }
    }

    /* compiled from: ChannelsGetPaymentStatusResponseDataDto.kt */
    public static final class Deserializer implements a9y<ChannelsGetPaymentStatusResponseDataDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "channel_messages_paid_reactions")) {
                return (ChannelsGetPaymentStatusResponseDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ChannelsPaymentResultMessagesPaidReactionsDto.class);
            }
            if (epx.f(f, "untyped")) {
                return (ChannelsGetPaymentStatusResponseDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, DonutPaymentResultUntypedDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: ChannelsGetPaymentStatusResponseDataDto.kt */
    public static final class DonutPaymentResultUntypedDto extends ChannelsGetPaymentStatusResponseDataDto implements Parcelable {
        public static final Parcelable.Creator<DonutPaymentResultUntypedDto> CREATOR = new a();

        @pmi0("data")
        private final Object data;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ChannelsGetPaymentStatusResponseDataDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("untyped")
            public static final TypeDto UNTYPED;
            private final String value;

            /* compiled from: ChannelsGetPaymentStatusResponseDataDto.kt */
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
                TypeDto typeDto = new TypeDto("UNTYPED", 0, "untyped");
                UNTYPED = typeDto;
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

        /* compiled from: ChannelsGetPaymentStatusResponseDataDto.kt */
        public static final class a implements Parcelable.Creator<DonutPaymentResultUntypedDto> {
            @Override // android.os.Parcelable.Creator
            public final DonutPaymentResultUntypedDto createFromParcel(Parcel parcel) {
                return new DonutPaymentResultUntypedDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readValue(DonutPaymentResultUntypedDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final DonutPaymentResultUntypedDto[] newArray(int i) {
                return new DonutPaymentResultUntypedDto[i];
            }
        }

        public /* synthetic */ DonutPaymentResultUntypedDto(TypeDto typeDto, Object obj, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : obj);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DonutPaymentResultUntypedDto)) {
                return false;
            }
            DonutPaymentResultUntypedDto donutPaymentResultUntypedDto = (DonutPaymentResultUntypedDto) obj;
            return this.type == donutPaymentResultUntypedDto.type && epx.f(this.data, donutPaymentResultUntypedDto.data);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            Object obj = this.data;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DonutPaymentResultUntypedDto(type=");
            sb.append(this.type);
            sb.append(", data=");
            return k73.c(sb, this.data, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeValue(this.data);
        }

        public DonutPaymentResultUntypedDto(TypeDto typeDto, Object obj) {
            super(null);
            this.type = typeDto;
            this.data = obj;
        }
    }

    public /* synthetic */ ChannelsGetPaymentStatusResponseDataDto(zcl zclVar) {
        this();
    }

    private ChannelsGetPaymentStatusResponseDataDto() {
    }
}
