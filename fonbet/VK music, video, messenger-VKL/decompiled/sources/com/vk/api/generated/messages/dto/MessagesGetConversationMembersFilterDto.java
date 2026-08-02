package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetConversationMembersFilterDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetConversationMembersFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetConversationMembersFilterDto[] $VALUES;

    @pmi0("all")
    public static final MessagesGetConversationMembersFilterDto ALL;
    public static final Parcelable.Creator<MessagesGetConversationMembersFilterDto> CREATOR;

    @pmi0("friends")
    public static final MessagesGetConversationMembersFilterDto FRIENDS;
    private final String value;

    /* compiled from: MessagesGetConversationMembersFilterDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetConversationMembersFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetConversationMembersFilterDto createFromParcel(Parcel parcel) {
            return MessagesGetConversationMembersFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetConversationMembersFilterDto[] newArray(int i) {
            return new MessagesGetConversationMembersFilterDto[i];
        }
    }

    static {
        MessagesGetConversationMembersFilterDto messagesGetConversationMembersFilterDto = new MessagesGetConversationMembersFilterDto("ALL", 0, "all");
        ALL = messagesGetConversationMembersFilterDto;
        MessagesGetConversationMembersFilterDto messagesGetConversationMembersFilterDto2 = new MessagesGetConversationMembersFilterDto(Privacy.FRIENDS, 1, "friends");
        FRIENDS = messagesGetConversationMembersFilterDto2;
        MessagesGetConversationMembersFilterDto[] messagesGetConversationMembersFilterDtoArr = {messagesGetConversationMembersFilterDto, messagesGetConversationMembersFilterDto2};
        $VALUES = messagesGetConversationMembersFilterDtoArr;
        $ENTRIES = new asp(messagesGetConversationMembersFilterDtoArr);
        CREATOR = new a();
    }

    private MessagesGetConversationMembersFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetConversationMembersFilterDto valueOf(String str) {
        return (MessagesGetConversationMembersFilterDto) Enum.valueOf(MessagesGetConversationMembersFilterDto.class, str);
    }

    public static MessagesGetConversationMembersFilterDto[] values() {
        return (MessagesGetConversationMembersFilterDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
