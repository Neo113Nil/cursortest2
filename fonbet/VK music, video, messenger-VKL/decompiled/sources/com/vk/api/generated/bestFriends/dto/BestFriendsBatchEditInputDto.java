package com.vk.api.generated.bestFriends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BestFriendsBatchEditInputDto.kt */
/* loaded from: classes14.dex */
public final class BestFriendsBatchEditInputDto implements Parcelable {
    public static final Parcelable.Creator<BestFriendsBatchEditInputDto> CREATOR = new a();

    @pmi0("op")
    private final OpDto op;

    @pmi0("user_id")
    private final UserId userId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BestFriendsBatchEditInputDto.kt */
    public static final class OpDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OpDto[] $VALUES;

        @pmi0("add")
        public static final OpDto ADD;
        public static final Parcelable.Creator<OpDto> CREATOR;

        @pmi0("delete")
        public static final OpDto DELETE;
        private final String value;

        /* compiled from: BestFriendsBatchEditInputDto.kt */
        public static final class a implements Parcelable.Creator<OpDto> {
            @Override // android.os.Parcelable.Creator
            public final OpDto createFromParcel(Parcel parcel) {
                return OpDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpDto[] newArray(int i) {
                return new OpDto[i];
            }
        }

        static {
            OpDto opDto = new OpDto("ADD", 0, "add");
            ADD = opDto;
            OpDto opDto2 = new OpDto("DELETE", 1, "delete");
            DELETE = opDto2;
            OpDto[] opDtoArr = {opDto, opDto2};
            $VALUES = opDtoArr;
            $ENTRIES = new asp(opDtoArr);
            CREATOR = new a();
        }

        private OpDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static OpDto valueOf(String str) {
            return (OpDto) Enum.valueOf(OpDto.class, str);
        }

        public static OpDto[] values() {
            return (OpDto[]) $VALUES.clone();
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

    /* compiled from: BestFriendsBatchEditInputDto.kt */
    public static final class a implements Parcelable.Creator<BestFriendsBatchEditInputDto> {
        @Override // android.os.Parcelable.Creator
        public final BestFriendsBatchEditInputDto createFromParcel(Parcel parcel) {
            return new BestFriendsBatchEditInputDto(parcel.readInt() == 0 ? null : OpDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(BestFriendsBatchEditInputDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BestFriendsBatchEditInputDto[] newArray(int i) {
            return new BestFriendsBatchEditInputDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BestFriendsBatchEditInputDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BestFriendsBatchEditInputDto)) {
            return false;
        }
        BestFriendsBatchEditInputDto bestFriendsBatchEditInputDto = (BestFriendsBatchEditInputDto) obj;
        return this.op == bestFriendsBatchEditInputDto.op && epx.f(this.userId, bestFriendsBatchEditInputDto.userId);
    }

    public final int hashCode() {
        OpDto opDto = this.op;
        int hashCode = (opDto == null ? 0 : opDto.hashCode()) * 31;
        UserId userId = this.userId;
        return hashCode + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BestFriendsBatchEditInputDto(op=");
        sb.append(this.op);
        sb.append(", userId=");
        return gp.b(sb, this.userId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OpDto opDto = this.op;
        if (opDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            opDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.userId, i);
    }

    public BestFriendsBatchEditInputDto(OpDto opDto, UserId userId) {
        this.op = opDto;
        this.userId = userId;
    }

    public /* synthetic */ BestFriendsBatchEditInputDto(OpDto opDto, UserId userId, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : opDto, (i & 2) != 0 ? null : userId);
    }
}
