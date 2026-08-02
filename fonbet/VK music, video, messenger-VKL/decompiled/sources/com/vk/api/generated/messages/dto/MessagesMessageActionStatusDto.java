package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesMessageActionStatusDto.kt */
/* loaded from: classes15.dex */
public final class MessagesMessageActionStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesMessageActionStatusDto[] $VALUES;

    @pmi0("accepted_message_request")
    public static final MessagesMessageActionStatusDto ACCEPTED_MESSAGE_REQUEST;

    @pmi0("call_transcription_failed")
    public static final MessagesMessageActionStatusDto CALL_TRANSCRIPTION_FAILED;

    @pmi0("cannot_call_privacy_settings")
    public static final MessagesMessageActionStatusDto CANNOT_CALL_PRIVACY_SETTINGS;

    @pmi0("chat_create")
    public static final MessagesMessageActionStatusDto CHAT_CREATE;

    @pmi0("chat_group_call_started")
    public static final MessagesMessageActionStatusDto CHAT_GROUP_CALL_STARTED;

    @pmi0("chat_invite_user")
    public static final MessagesMessageActionStatusDto CHAT_INVITE_USER;

    @pmi0("chat_invite_user_by_call")
    public static final MessagesMessageActionStatusDto CHAT_INVITE_USER_BY_CALL;

    @pmi0("chat_invite_user_by_call_join_link")
    public static final MessagesMessageActionStatusDto CHAT_INVITE_USER_BY_CALL_JOIN_LINK;

    @pmi0("chat_invite_user_by_link")
    public static final MessagesMessageActionStatusDto CHAT_INVITE_USER_BY_LINK;

    @pmi0("chat_invite_user_by_message_request")
    public static final MessagesMessageActionStatusDto CHAT_INVITE_USER_BY_MESSAGE_REQUEST;

    @pmi0("chat_kick_don")
    public static final MessagesMessageActionStatusDto CHAT_KICK_DON;

    @pmi0("chat_kick_user")
    public static final MessagesMessageActionStatusDto CHAT_KICK_USER;

    @pmi0("chat_kick_user_call_block")
    public static final MessagesMessageActionStatusDto CHAT_KICK_USER_CALL_BLOCK;

    @pmi0("chat_owner_changed")
    public static final MessagesMessageActionStatusDto CHAT_OWNER_CHANGED;

    @pmi0("chat_photo_remove")
    public static final MessagesMessageActionStatusDto CHAT_PHOTO_REMOVE;

    @pmi0("chat_photo_update")
    public static final MessagesMessageActionStatusDto CHAT_PHOTO_UPDATE;

    @pmi0("chat_pin_message")
    public static final MessagesMessageActionStatusDto CHAT_PIN_MESSAGE;

    @pmi0("chat_screenshot")
    public static final MessagesMessageActionStatusDto CHAT_SCREENSHOT;

    @pmi0("chat_title_update")
    public static final MessagesMessageActionStatusDto CHAT_TITLE_UPDATE;

    @pmi0("chat_unpin_message")
    public static final MessagesMessageActionStatusDto CHAT_UNPIN_MESSAGE;

    @pmi0("chat_without_owner_admin")
    public static final MessagesMessageActionStatusDto CHAT_WITHOUT_OWNER_ADMIN;

    @pmi0("chat_without_owner_admins")
    public static final MessagesMessageActionStatusDto CHAT_WITHOUT_OWNER_ADMINS;

    @pmi0("chat_without_owner_all")
    public static final MessagesMessageActionStatusDto CHAT_WITHOUT_OWNER_ALL;

    @pmi0("conversation_style_update")
    public static final MessagesMessageActionStatusDto CONVERSATION_STYLE_UPDATE;

    @pmi0("conversation_style_update_action")
    public static final MessagesMessageActionStatusDto CONVERSATION_STYLE_UPDATE_ACTION;
    public static final Parcelable.Creator<MessagesMessageActionStatusDto> CREATOR;

    @pmi0("custom")
    public static final MessagesMessageActionStatusDto CUSTOM;

    @pmi0("rejected_message_request")
    public static final MessagesMessageActionStatusDto REJECTED_MESSAGE_REQUEST;

    @pmi0("sent_message_request")
    public static final MessagesMessageActionStatusDto SENT_MESSAGE_REQUEST;
    private final String value;

    /* compiled from: MessagesMessageActionStatusDto.kt */
    public static final class a implements Parcelable.Creator<MessagesMessageActionStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesMessageActionStatusDto createFromParcel(Parcel parcel) {
            return MessagesMessageActionStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesMessageActionStatusDto[] newArray(int i) {
            return new MessagesMessageActionStatusDto[i];
        }
    }

    static {
        MessagesMessageActionStatusDto messagesMessageActionStatusDto = new MessagesMessageActionStatusDto("CHAT_PHOTO_UPDATE", 0, "chat_photo_update");
        CHAT_PHOTO_UPDATE = messagesMessageActionStatusDto;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto2 = new MessagesMessageActionStatusDto("CHAT_PHOTO_REMOVE", 1, "chat_photo_remove");
        CHAT_PHOTO_REMOVE = messagesMessageActionStatusDto2;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto3 = new MessagesMessageActionStatusDto("CHAT_CREATE", 2, "chat_create");
        CHAT_CREATE = messagesMessageActionStatusDto3;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto4 = new MessagesMessageActionStatusDto("CHAT_TITLE_UPDATE", 3, "chat_title_update");
        CHAT_TITLE_UPDATE = messagesMessageActionStatusDto4;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto5 = new MessagesMessageActionStatusDto("CHAT_INVITE_USER", 4, "chat_invite_user");
        CHAT_INVITE_USER = messagesMessageActionStatusDto5;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto6 = new MessagesMessageActionStatusDto("CHAT_KICK_USER", 5, "chat_kick_user");
        CHAT_KICK_USER = messagesMessageActionStatusDto6;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto7 = new MessagesMessageActionStatusDto("CHAT_PIN_MESSAGE", 6, "chat_pin_message");
        CHAT_PIN_MESSAGE = messagesMessageActionStatusDto7;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto8 = new MessagesMessageActionStatusDto("CHAT_UNPIN_MESSAGE", 7, "chat_unpin_message");
        CHAT_UNPIN_MESSAGE = messagesMessageActionStatusDto8;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto9 = new MessagesMessageActionStatusDto("CHAT_KICK_DON", 8, "chat_kick_don");
        CHAT_KICK_DON = messagesMessageActionStatusDto9;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto10 = new MessagesMessageActionStatusDto("CONVERSATION_STYLE_UPDATE", 9, "conversation_style_update");
        CONVERSATION_STYLE_UPDATE = messagesMessageActionStatusDto10;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto11 = new MessagesMessageActionStatusDto("CONVERSATION_STYLE_UPDATE_ACTION", 10, "conversation_style_update_action");
        CONVERSATION_STYLE_UPDATE_ACTION = messagesMessageActionStatusDto11;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto12 = new MessagesMessageActionStatusDto("CALL_TRANSCRIPTION_FAILED", 11, "call_transcription_failed");
        CALL_TRANSCRIPTION_FAILED = messagesMessageActionStatusDto12;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto13 = new MessagesMessageActionStatusDto("CUSTOM", 12, "custom");
        CUSTOM = messagesMessageActionStatusDto13;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto14 = new MessagesMessageActionStatusDto("SENT_MESSAGE_REQUEST", 13, "sent_message_request");
        SENT_MESSAGE_REQUEST = messagesMessageActionStatusDto14;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto15 = new MessagesMessageActionStatusDto("REJECTED_MESSAGE_REQUEST", 14, "rejected_message_request");
        REJECTED_MESSAGE_REQUEST = messagesMessageActionStatusDto15;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto16 = new MessagesMessageActionStatusDto("CHAT_OWNER_CHANGED", 15, "chat_owner_changed");
        CHAT_OWNER_CHANGED = messagesMessageActionStatusDto16;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto17 = new MessagesMessageActionStatusDto("CHAT_WITHOUT_OWNER_ALL", 16, "chat_without_owner_all");
        CHAT_WITHOUT_OWNER_ALL = messagesMessageActionStatusDto17;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto18 = new MessagesMessageActionStatusDto("CHAT_WITHOUT_OWNER_ADMIN", 17, "chat_without_owner_admin");
        CHAT_WITHOUT_OWNER_ADMIN = messagesMessageActionStatusDto18;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto19 = new MessagesMessageActionStatusDto("CHAT_WITHOUT_OWNER_ADMINS", 18, "chat_without_owner_admins");
        CHAT_WITHOUT_OWNER_ADMINS = messagesMessageActionStatusDto19;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto20 = new MessagesMessageActionStatusDto("CHAT_INVITE_USER_BY_LINK", 19, "chat_invite_user_by_link");
        CHAT_INVITE_USER_BY_LINK = messagesMessageActionStatusDto20;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto21 = new MessagesMessageActionStatusDto("CHAT_INVITE_USER_BY_MESSAGE_REQUEST", 20, "chat_invite_user_by_message_request");
        CHAT_INVITE_USER_BY_MESSAGE_REQUEST = messagesMessageActionStatusDto21;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto22 = new MessagesMessageActionStatusDto("CHAT_SCREENSHOT", 21, "chat_screenshot");
        CHAT_SCREENSHOT = messagesMessageActionStatusDto22;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto23 = new MessagesMessageActionStatusDto("CHAT_GROUP_CALL_STARTED", 22, "chat_group_call_started");
        CHAT_GROUP_CALL_STARTED = messagesMessageActionStatusDto23;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto24 = new MessagesMessageActionStatusDto("ACCEPTED_MESSAGE_REQUEST", 23, "accepted_message_request");
        ACCEPTED_MESSAGE_REQUEST = messagesMessageActionStatusDto24;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto25 = new MessagesMessageActionStatusDto("CHAT_INVITE_USER_BY_CALL", 24, "chat_invite_user_by_call");
        CHAT_INVITE_USER_BY_CALL = messagesMessageActionStatusDto25;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto26 = new MessagesMessageActionStatusDto("CHAT_INVITE_USER_BY_CALL_JOIN_LINK", 25, "chat_invite_user_by_call_join_link");
        CHAT_INVITE_USER_BY_CALL_JOIN_LINK = messagesMessageActionStatusDto26;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto27 = new MessagesMessageActionStatusDto("CHAT_KICK_USER_CALL_BLOCK", 26, "chat_kick_user_call_block");
        CHAT_KICK_USER_CALL_BLOCK = messagesMessageActionStatusDto27;
        MessagesMessageActionStatusDto messagesMessageActionStatusDto28 = new MessagesMessageActionStatusDto("CANNOT_CALL_PRIVACY_SETTINGS", 27, "cannot_call_privacy_settings");
        CANNOT_CALL_PRIVACY_SETTINGS = messagesMessageActionStatusDto28;
        MessagesMessageActionStatusDto[] messagesMessageActionStatusDtoArr = {messagesMessageActionStatusDto, messagesMessageActionStatusDto2, messagesMessageActionStatusDto3, messagesMessageActionStatusDto4, messagesMessageActionStatusDto5, messagesMessageActionStatusDto6, messagesMessageActionStatusDto7, messagesMessageActionStatusDto8, messagesMessageActionStatusDto9, messagesMessageActionStatusDto10, messagesMessageActionStatusDto11, messagesMessageActionStatusDto12, messagesMessageActionStatusDto13, messagesMessageActionStatusDto14, messagesMessageActionStatusDto15, messagesMessageActionStatusDto16, messagesMessageActionStatusDto17, messagesMessageActionStatusDto18, messagesMessageActionStatusDto19, messagesMessageActionStatusDto20, messagesMessageActionStatusDto21, messagesMessageActionStatusDto22, messagesMessageActionStatusDto23, messagesMessageActionStatusDto24, messagesMessageActionStatusDto25, messagesMessageActionStatusDto26, messagesMessageActionStatusDto27, messagesMessageActionStatusDto28};
        $VALUES = messagesMessageActionStatusDtoArr;
        $ENTRIES = new asp(messagesMessageActionStatusDtoArr);
        CREATOR = new a();
    }

    private MessagesMessageActionStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesMessageActionStatusDto valueOf(String str) {
        return (MessagesMessageActionStatusDto) Enum.valueOf(MessagesMessageActionStatusDto.class, str);
    }

    public static MessagesMessageActionStatusDto[] values() {
        return (MessagesMessageActionStatusDto[]) $VALUES.clone();
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
