package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: FriendsDeleteResponseDto.kt */
/* loaded from: classes14.dex */
public final class FriendsDeleteResponseDto implements Parcelable {
    public static final Parcelable.Creator<FriendsDeleteResponseDto> CREATOR = new a();

    @pmi0("friend_deleted")
    private final FriendDeletedDto friendDeleted;

    @pmi0("in_request_deleted")
    private final InRequestDeletedDto inRequestDeleted;

    @pmi0("out_request_deleted")
    private final OutRequestDeletedDto outRequestDeleted;

    @pmi0("success")
    private final int success;

    @pmi0("suggestion_deleted")
    private final SuggestionDeletedDto suggestionDeleted;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FriendsDeleteResponseDto.kt */
    public static final class FriendDeletedDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FriendDeletedDto[] $VALUES;
        public static final Parcelable.Creator<FriendDeletedDto> CREATOR;

        @pmi0("1")
        public static final FriendDeletedDto OK;
        private final int value;

        /* compiled from: FriendsDeleteResponseDto.kt */
        public static final class a implements Parcelable.Creator<FriendDeletedDto> {
            @Override // android.os.Parcelable.Creator
            public final FriendDeletedDto createFromParcel(Parcel parcel) {
                return FriendDeletedDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FriendDeletedDto[] newArray(int i) {
                return new FriendDeletedDto[i];
            }
        }

        static {
            FriendDeletedDto friendDeletedDto = new FriendDeletedDto("OK", 0, 1);
            OK = friendDeletedDto;
            FriendDeletedDto[] friendDeletedDtoArr = {friendDeletedDto};
            $VALUES = friendDeletedDtoArr;
            $ENTRIES = new asp(friendDeletedDtoArr);
            CREATOR = new a();
        }

        private FriendDeletedDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static FriendDeletedDto valueOf(String str) {
            return (FriendDeletedDto) Enum.valueOf(FriendDeletedDto.class, str);
        }

        public static FriendDeletedDto[] values() {
            return (FriendDeletedDto[]) $VALUES.clone();
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
    /* compiled from: FriendsDeleteResponseDto.kt */
    public static final class InRequestDeletedDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InRequestDeletedDto[] $VALUES;
        public static final Parcelable.Creator<InRequestDeletedDto> CREATOR;

        @pmi0("1")
        public static final InRequestDeletedDto OK;
        private final int value;

        /* compiled from: FriendsDeleteResponseDto.kt */
        public static final class a implements Parcelable.Creator<InRequestDeletedDto> {
            @Override // android.os.Parcelable.Creator
            public final InRequestDeletedDto createFromParcel(Parcel parcel) {
                return InRequestDeletedDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InRequestDeletedDto[] newArray(int i) {
                return new InRequestDeletedDto[i];
            }
        }

        static {
            InRequestDeletedDto inRequestDeletedDto = new InRequestDeletedDto("OK", 0, 1);
            OK = inRequestDeletedDto;
            InRequestDeletedDto[] inRequestDeletedDtoArr = {inRequestDeletedDto};
            $VALUES = inRequestDeletedDtoArr;
            $ENTRIES = new asp(inRequestDeletedDtoArr);
            CREATOR = new a();
        }

        private InRequestDeletedDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static InRequestDeletedDto valueOf(String str) {
            return (InRequestDeletedDto) Enum.valueOf(InRequestDeletedDto.class, str);
        }

        public static InRequestDeletedDto[] values() {
            return (InRequestDeletedDto[]) $VALUES.clone();
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
    /* compiled from: FriendsDeleteResponseDto.kt */
    public static final class OutRequestDeletedDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OutRequestDeletedDto[] $VALUES;
        public static final Parcelable.Creator<OutRequestDeletedDto> CREATOR;

        @pmi0("1")
        public static final OutRequestDeletedDto OK;
        private final int value;

        /* compiled from: FriendsDeleteResponseDto.kt */
        public static final class a implements Parcelable.Creator<OutRequestDeletedDto> {
            @Override // android.os.Parcelable.Creator
            public final OutRequestDeletedDto createFromParcel(Parcel parcel) {
                return OutRequestDeletedDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OutRequestDeletedDto[] newArray(int i) {
                return new OutRequestDeletedDto[i];
            }
        }

        static {
            OutRequestDeletedDto outRequestDeletedDto = new OutRequestDeletedDto("OK", 0, 1);
            OK = outRequestDeletedDto;
            OutRequestDeletedDto[] outRequestDeletedDtoArr = {outRequestDeletedDto};
            $VALUES = outRequestDeletedDtoArr;
            $ENTRIES = new asp(outRequestDeletedDtoArr);
            CREATOR = new a();
        }

        private OutRequestDeletedDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static OutRequestDeletedDto valueOf(String str) {
            return (OutRequestDeletedDto) Enum.valueOf(OutRequestDeletedDto.class, str);
        }

        public static OutRequestDeletedDto[] values() {
            return (OutRequestDeletedDto[]) $VALUES.clone();
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
    /* compiled from: FriendsDeleteResponseDto.kt */
    public static final class SuggestionDeletedDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SuggestionDeletedDto[] $VALUES;
        public static final Parcelable.Creator<SuggestionDeletedDto> CREATOR;

        @pmi0("1")
        public static final SuggestionDeletedDto OK;
        private final int value;

        /* compiled from: FriendsDeleteResponseDto.kt */
        public static final class a implements Parcelable.Creator<SuggestionDeletedDto> {
            @Override // android.os.Parcelable.Creator
            public final SuggestionDeletedDto createFromParcel(Parcel parcel) {
                return SuggestionDeletedDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuggestionDeletedDto[] newArray(int i) {
                return new SuggestionDeletedDto[i];
            }
        }

        static {
            SuggestionDeletedDto suggestionDeletedDto = new SuggestionDeletedDto("OK", 0, 1);
            OK = suggestionDeletedDto;
            SuggestionDeletedDto[] suggestionDeletedDtoArr = {suggestionDeletedDto};
            $VALUES = suggestionDeletedDtoArr;
            $ENTRIES = new asp(suggestionDeletedDtoArr);
            CREATOR = new a();
        }

        private SuggestionDeletedDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static SuggestionDeletedDto valueOf(String str) {
            return (SuggestionDeletedDto) Enum.valueOf(SuggestionDeletedDto.class, str);
        }

        public static SuggestionDeletedDto[] values() {
            return (SuggestionDeletedDto[]) $VALUES.clone();
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

    /* compiled from: FriendsDeleteResponseDto.kt */
    public static final class a implements Parcelable.Creator<FriendsDeleteResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsDeleteResponseDto createFromParcel(Parcel parcel) {
            return new FriendsDeleteResponseDto(parcel.readInt(), parcel.readInt() == 0 ? null : FriendDeletedDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OutRequestDeletedDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InRequestDeletedDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuggestionDeletedDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsDeleteResponseDto[] newArray(int i) {
            return new FriendsDeleteResponseDto[i];
        }
    }

    public FriendsDeleteResponseDto(int i, FriendDeletedDto friendDeletedDto, OutRequestDeletedDto outRequestDeletedDto, InRequestDeletedDto inRequestDeletedDto, SuggestionDeletedDto suggestionDeletedDto) {
        this.success = i;
        this.friendDeleted = friendDeletedDto;
        this.outRequestDeleted = outRequestDeletedDto;
        this.inRequestDeleted = inRequestDeletedDto;
        this.suggestionDeleted = suggestionDeletedDto;
    }

    public final FriendDeletedDto d() {
        return this.friendDeleted;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final InRequestDeletedDto e() {
        return this.inRequestDeleted;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsDeleteResponseDto)) {
            return false;
        }
        FriendsDeleteResponseDto friendsDeleteResponseDto = (FriendsDeleteResponseDto) obj;
        return this.success == friendsDeleteResponseDto.success && this.friendDeleted == friendsDeleteResponseDto.friendDeleted && this.outRequestDeleted == friendsDeleteResponseDto.outRequestDeleted && this.inRequestDeleted == friendsDeleteResponseDto.inRequestDeleted && this.suggestionDeleted == friendsDeleteResponseDto.suggestionDeleted;
    }

    public final OutRequestDeletedDto f() {
        return this.outRequestDeleted;
    }

    public final int g() {
        return this.success;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.success) * 31;
        FriendDeletedDto friendDeletedDto = this.friendDeleted;
        int hashCode2 = (hashCode + (friendDeletedDto == null ? 0 : friendDeletedDto.hashCode())) * 31;
        OutRequestDeletedDto outRequestDeletedDto = this.outRequestDeleted;
        int hashCode3 = (hashCode2 + (outRequestDeletedDto == null ? 0 : outRequestDeletedDto.hashCode())) * 31;
        InRequestDeletedDto inRequestDeletedDto = this.inRequestDeleted;
        int hashCode4 = (hashCode3 + (inRequestDeletedDto == null ? 0 : inRequestDeletedDto.hashCode())) * 31;
        SuggestionDeletedDto suggestionDeletedDto = this.suggestionDeleted;
        return hashCode4 + (suggestionDeletedDto != null ? suggestionDeletedDto.hashCode() : 0);
    }

    public final String toString() {
        return "FriendsDeleteResponseDto(success=" + this.success + ", friendDeleted=" + this.friendDeleted + ", outRequestDeleted=" + this.outRequestDeleted + ", inRequestDeleted=" + this.inRequestDeleted + ", suggestionDeleted=" + this.suggestionDeleted + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.success);
        FriendDeletedDto friendDeletedDto = this.friendDeleted;
        if (friendDeletedDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            friendDeletedDto.writeToParcel(parcel, i);
        }
        OutRequestDeletedDto outRequestDeletedDto = this.outRequestDeleted;
        if (outRequestDeletedDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            outRequestDeletedDto.writeToParcel(parcel, i);
        }
        InRequestDeletedDto inRequestDeletedDto = this.inRequestDeleted;
        if (inRequestDeletedDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inRequestDeletedDto.writeToParcel(parcel, i);
        }
        SuggestionDeletedDto suggestionDeletedDto = this.suggestionDeleted;
        if (suggestionDeletedDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            suggestionDeletedDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ FriendsDeleteResponseDto(int i, FriendDeletedDto friendDeletedDto, OutRequestDeletedDto outRequestDeletedDto, InRequestDeletedDto inRequestDeletedDto, SuggestionDeletedDto suggestionDeletedDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : friendDeletedDto, (i2 & 4) != 0 ? null : outRequestDeletedDto, (i2 & 8) != 0 ? null : inRequestDeletedDto, (i2 & 16) != 0 ? null : suggestionDeletedDto);
    }
}
