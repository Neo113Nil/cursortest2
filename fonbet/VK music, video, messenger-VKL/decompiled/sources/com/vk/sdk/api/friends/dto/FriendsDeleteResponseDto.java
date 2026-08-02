package com.vk.sdk.api.friends.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: FriendsDeleteResponseDto.kt */
/* loaded from: classes5.dex */
public final class FriendsDeleteResponseDto {

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
    public static final class FriendDeletedDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FriendDeletedDto[] $VALUES;

        @pmi0("1")
        public static final FriendDeletedDto OK;
        private final int value;

        static {
            FriendDeletedDto friendDeletedDto = new FriendDeletedDto("OK", 0, 1);
            OK = friendDeletedDto;
            FriendDeletedDto[] friendDeletedDtoArr = {friendDeletedDto};
            $VALUES = friendDeletedDtoArr;
            $ENTRIES = new asp(friendDeletedDtoArr);
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
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FriendsDeleteResponseDto.kt */
    public static final class InRequestDeletedDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InRequestDeletedDto[] $VALUES;

        @pmi0("1")
        public static final InRequestDeletedDto OK;
        private final int value;

        static {
            InRequestDeletedDto inRequestDeletedDto = new InRequestDeletedDto("OK", 0, 1);
            OK = inRequestDeletedDto;
            InRequestDeletedDto[] inRequestDeletedDtoArr = {inRequestDeletedDto};
            $VALUES = inRequestDeletedDtoArr;
            $ENTRIES = new asp(inRequestDeletedDtoArr);
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
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FriendsDeleteResponseDto.kt */
    public static final class OutRequestDeletedDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OutRequestDeletedDto[] $VALUES;

        @pmi0("1")
        public static final OutRequestDeletedDto OK;
        private final int value;

        static {
            OutRequestDeletedDto outRequestDeletedDto = new OutRequestDeletedDto("OK", 0, 1);
            OK = outRequestDeletedDto;
            OutRequestDeletedDto[] outRequestDeletedDtoArr = {outRequestDeletedDto};
            $VALUES = outRequestDeletedDtoArr;
            $ENTRIES = new asp(outRequestDeletedDtoArr);
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
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FriendsDeleteResponseDto.kt */
    public static final class SuggestionDeletedDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SuggestionDeletedDto[] $VALUES;

        @pmi0("1")
        public static final SuggestionDeletedDto OK;
        private final int value;

        static {
            SuggestionDeletedDto suggestionDeletedDto = new SuggestionDeletedDto("OK", 0, 1);
            OK = suggestionDeletedDto;
            SuggestionDeletedDto[] suggestionDeletedDtoArr = {suggestionDeletedDto};
            $VALUES = suggestionDeletedDtoArr;
            $ENTRIES = new asp(suggestionDeletedDtoArr);
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
    }

    public FriendsDeleteResponseDto(int i, FriendDeletedDto friendDeletedDto, OutRequestDeletedDto outRequestDeletedDto, InRequestDeletedDto inRequestDeletedDto, SuggestionDeletedDto suggestionDeletedDto) {
        this.success = i;
        this.friendDeleted = friendDeletedDto;
        this.outRequestDeleted = outRequestDeletedDto;
        this.inRequestDeleted = inRequestDeletedDto;
        this.suggestionDeleted = suggestionDeletedDto;
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
        return "FriendsDeleteResponseDto(success=" + this.success + ", friendDeleted=" + this.friendDeleted + ", outRequestDeleted=" + this.outRequestDeleted + ", inRequestDeleted=" + this.inRequestDeleted + ", suggestionDeleted=" + this.suggestionDeleted + ")";
    }

    public /* synthetic */ FriendsDeleteResponseDto(int i, FriendDeletedDto friendDeletedDto, OutRequestDeletedDto outRequestDeletedDto, InRequestDeletedDto inRequestDeletedDto, SuggestionDeletedDto suggestionDeletedDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : friendDeletedDto, (i2 & 4) != 0 ? null : outRequestDeletedDto, (i2 & 8) != 0 ? null : inRequestDeletedDto, (i2 & 16) != 0 ? null : suggestionDeletedDto);
    }
}
