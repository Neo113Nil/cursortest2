package com.vk.im.ui.components.common;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotifyId.kt */
/* loaded from: classes2.dex */
public final class NotifyId {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotifyId[] $VALUES;
    public static final NotifyId ACCOUNT_INVALID_OLD_PASSWORD;
    public static final NotifyId AUTH_CODE_INCORRECT;
    public static final NotifyId AUTH_PHONE_PARAM_PHONE;
    public static final NotifyId CHANNEL_INVALID_TITLE;
    public static final NotifyId CHAT_ACCESS_DENIED;
    public static final NotifyId CHAT_CANNOT_BE_JOINED_AS_ORG_MEMBER;
    public static final NotifyId CHAT_CANNOT_CREATE_DUE_TO_SPAM_BLOCK;
    public static final NotifyId CHAT_CHANGE_AVATAR_PERMISSION_DENIED;
    public static final NotifyId CHAT_CHANGE_TITLE_EMPTY;
    public static final NotifyId CHAT_CHANGE_TITLE_PERMISSION_DENIED;
    public static final NotifyId CHAT_COMMUNITY_CANT_INTERACT_WITH_THIS_PEER;
    public static final NotifyId CHAT_CONTACT_NOT_FOUND;
    public static final NotifyId CHAT_DELETED_WITH_HISTORY;
    public static final NotifyId CHAT_DOES_NOT_EXIST;
    public static final NotifyId CHAT_ETC_PERMISSION_DENIED;
    public static final NotifyId CHAT_INCORRECT_AVATAR;
    public static final NotifyId CHAT_INVITATION_ERROR_ALL_USERS;
    public static final NotifyId CHAT_INVITATION_ERROR_ONE_FEMALE;
    public static final NotifyId CHAT_INVITATION_ERROR_ONE_MALE;
    public static final NotifyId CHAT_INVITATION_ERROR_SOME_USERS;
    public static final NotifyId CHAT_INVITATION_FORBIDDEN;
    public static final NotifyId CHAT_INVITE_GROUP_INACCESSIBLE;
    public static final NotifyId CHAT_INVITE_INVALID_LINK;
    public static final NotifyId CHAT_INVITE_PERMISSION_DENIED;
    public static final NotifyId CHAT_KICK_PERMISSION_DENIED;
    public static final NotifyId CHAT_MAKE_LINK_DENIED;
    public static final NotifyId CHAT_NOT_SUPPORTED;
    public static final NotifyId CHAT_PIN_PERMISSION_DENIED;
    public static final NotifyId CHAT_PREVIEW_FLOOD_CONTROL;
    public static final NotifyId CHAT_PREVIEW_INVALID_LINK;
    public static final NotifyId CHAT_TOO_MANY_MEMBERS;
    public static final NotifyId CHAT_UNPIN_PERMISSION_DENIED;
    public static final NotifyId CHAT_USER_ALREADY_IN_CHAT;
    public static final NotifyId CHAT_USER_CANNOT_BE_INVITED;
    public static final NotifyId CHAT_USER_CANT_BE_ADDED_TO_WORK_CHAT_NOT_EMPLOYEE;
    public static final NotifyId CHAT_USER_PROHIBITED_INVITATION_TO_CHATS;
    public static final NotifyId CHAT_WAS_DISABLED;
    public static final NotifyId CODE_CHAT_MR_ALREADY_SEND;
    public static final NotifyId COPY_TO_CLIPBOARD_DONE;
    public static final NotifyId ERROR_AUTH;
    public static final NotifyId ERROR_TYPE_API;
    public static final NotifyId ERROR_TYPE_INTERNAL;
    public static final NotifyId ERROR_TYPE_NETWORK;
    public static final NotifyId ERROR_TYPE_UNRECOVERABLE;
    public static final NotifyId INVALID_FILE_EXTENSION;
    public static final NotifyId MSG_AUDIO_TRANSCRIPT_EDIT_FAILED;
    public static final NotifyId MSG_DELETE_FOR_ALL_FAILED;
    public static final NotifyId MSG_SEND_DENIED;
    public static final NotifyId MSG_UPLOAD_PHOTO_DECODE_FAILED;
    public static final NotifyId MSG_UPLOAD_PHOTO_PREPROCESS_FAILED;
    public static final NotifyId MSG_UPLOAD_PHOTO_WRONG_IMAGE_SIZE;
    public static final NotifyId NOT_IMPLEMENTED;
    public static final NotifyId SCREEN_NAME_FORMAT_ERROR;
    public static final NotifyId TOO_LARGE_FILE;
    public static final NotifyId TOO_MANY_SIMILAR_REQUESTS;
    private final int id;

    static {
        NotifyId notifyId = new NotifyId("NOT_IMPLEMENTED", 0, R.string.vkim_error_internal);
        NOT_IMPLEMENTED = notifyId;
        NotifyId notifyId2 = new NotifyId("COPY_TO_CLIPBOARD_DONE", 1, R.string.vkim_copy_to_clipboard_done);
        COPY_TO_CLIPBOARD_DONE = notifyId2;
        NotifyId notifyId3 = new NotifyId("ERROR_TYPE_NETWORK", 2, R.string.vkim_error_no_network);
        ERROR_TYPE_NETWORK = notifyId3;
        NotifyId notifyId4 = new NotifyId("ERROR_TYPE_API", 3, R.string.vkim_error_api);
        ERROR_TYPE_API = notifyId4;
        NotifyId notifyId5 = new NotifyId("ERROR_TYPE_INTERNAL", 4, R.string.vkim_error_internal);
        ERROR_TYPE_INTERNAL = notifyId5;
        NotifyId notifyId6 = new NotifyId("ERROR_TYPE_UNRECOVERABLE", 5, R.string.vkim_error_unrecoverable);
        ERROR_TYPE_UNRECOVERABLE = notifyId6;
        NotifyId notifyId7 = new NotifyId("ACCOUNT_INVALID_OLD_PASSWORD", 6, R.string.vkim_error_account_invalid_old_password);
        ACCOUNT_INVALID_OLD_PASSWORD = notifyId7;
        NotifyId notifyId8 = new NotifyId("CHAT_USER_CANNOT_BE_INVITED", 7, R.string.vkim_error_chat_user_cannot_be_invited);
        CHAT_USER_CANNOT_BE_INVITED = notifyId8;
        NotifyId notifyId9 = new NotifyId("CHAT_INVITATION_ERROR_ALL_USERS", 8, R.string.vkim_error_chat_invitation_failed_all_users);
        CHAT_INVITATION_ERROR_ALL_USERS = notifyId9;
        NotifyId notifyId10 = new NotifyId("CHAT_INVITATION_ERROR_SOME_USERS", 9, R.string.vkim_error_chat_invitation_failed_some_users);
        CHAT_INVITATION_ERROR_SOME_USERS = notifyId10;
        NotifyId notifyId11 = new NotifyId("CHAT_INVITATION_ERROR_ONE_MALE", 10, R.string.vkim_error_chat_invitation_failed_one_male);
        CHAT_INVITATION_ERROR_ONE_MALE = notifyId11;
        NotifyId notifyId12 = new NotifyId("CHAT_INVITATION_ERROR_ONE_FEMALE", 11, R.string.vkim_error_chat_invitation_failed_one_female);
        CHAT_INVITATION_ERROR_ONE_FEMALE = notifyId12;
        NotifyId notifyId13 = new NotifyId("CHAT_INVITATION_FORBIDDEN", 12, R.string.vkim_error_chat_invitation_forbidden);
        CHAT_INVITATION_FORBIDDEN = notifyId13;
        NotifyId notifyId14 = new NotifyId("CHAT_USER_PROHIBITED_INVITATION_TO_CHATS", 13, R.string.vkim_error_chat_user_prohibited_invitation_to_chats);
        CHAT_USER_PROHIBITED_INVITATION_TO_CHATS = notifyId14;
        NotifyId notifyId15 = new NotifyId("CHAT_USER_ALREADY_IN_CHAT", 14, R.string.vkim_error_chat_user_already_in_chat);
        CHAT_USER_ALREADY_IN_CHAT = notifyId15;
        NotifyId notifyId16 = new NotifyId("CHAT_INCORRECT_AVATAR", 15, R.string.vkim_error_chat_incorrect_avatar);
        CHAT_INCORRECT_AVATAR = notifyId16;
        NotifyId notifyId17 = new NotifyId("CHAT_TOO_MANY_MEMBERS", 16, R.string.vkim_error_chat_too_many_users);
        CHAT_TOO_MANY_MEMBERS = notifyId17;
        NotifyId notifyId18 = new NotifyId("CHAT_INVITE_INVALID_LINK", 17, R.string.vkim_error_chat_invite_invalid_link);
        CHAT_INVITE_INVALID_LINK = notifyId18;
        NotifyId notifyId19 = new NotifyId("CHAT_PREVIEW_INVALID_LINK", 18, R.string.vkim_error_chat_preview_invalid_link);
        CHAT_PREVIEW_INVALID_LINK = notifyId19;
        NotifyId notifyId20 = new NotifyId("CHAT_ACCESS_DENIED", 19, R.string.vkim_error_chat_access_denied);
        CHAT_ACCESS_DENIED = notifyId20;
        NotifyId notifyId21 = new NotifyId("CHAT_DOES_NOT_EXIST", 20, R.string.vkim_error_chat_does_not_exist);
        CHAT_DOES_NOT_EXIST = notifyId21;
        NotifyId notifyId22 = new NotifyId("CHAT_CANNOT_BE_JOINED_AS_ORG_MEMBER", 21, R.string.vkim_error_chat_cannot_be_joined_as_org_member);
        CHAT_CANNOT_BE_JOINED_AS_ORG_MEMBER = notifyId22;
        NotifyId notifyId23 = new NotifyId("CHAT_DELETED_WITH_HISTORY", 22, R.string.vkim_error_chat_deleted_with_history);
        CHAT_DELETED_WITH_HISTORY = notifyId23;
        NotifyId notifyId24 = new NotifyId("CHAT_MAKE_LINK_DENIED", 23, R.string.vkim_error_chat_make_link_denied);
        CHAT_MAKE_LINK_DENIED = notifyId24;
        NotifyId notifyId25 = new NotifyId("CHAT_COMMUNITY_CANT_INTERACT_WITH_THIS_PEER", 24, R.string.vkim_error_community_cant_interact_with_this_peer);
        CHAT_COMMUNITY_CANT_INTERACT_WITH_THIS_PEER = notifyId25;
        NotifyId notifyId26 = new NotifyId("CHAT_CONTACT_NOT_FOUND", 25, R.string.vkim_error_contact_not_found);
        CHAT_CONTACT_NOT_FOUND = notifyId26;
        NotifyId notifyId27 = new NotifyId("CHAT_WAS_DISABLED", 26, R.string.vkim_error_chat_was_disabled);
        CHAT_WAS_DISABLED = notifyId27;
        NotifyId notifyId28 = new NotifyId("CHAT_NOT_SUPPORTED", 27, R.string.vkim_error_chat_not_supported);
        CHAT_NOT_SUPPORTED = notifyId28;
        NotifyId notifyId29 = new NotifyId("CHAT_USER_CANT_BE_ADDED_TO_WORK_CHAT_NOT_EMPLOYEE", 28, R.string.vkim_error_user_cant_be_added_to_work_chat_not_employee);
        CHAT_USER_CANT_BE_ADDED_TO_WORK_CHAT_NOT_EMPLOYEE = notifyId29;
        NotifyId notifyId30 = new NotifyId("CHAT_CANNOT_CREATE_DUE_TO_SPAM_BLOCK", 29, R.string.vkim_error_chat_cannot_create_due_to_spam_block);
        CHAT_CANNOT_CREATE_DUE_TO_SPAM_BLOCK = notifyId30;
        NotifyId notifyId31 = new NotifyId("CHAT_PREVIEW_FLOOD_CONTROL", 30, R.string.vkim_error_chat_preview_flood_control);
        CHAT_PREVIEW_FLOOD_CONTROL = notifyId31;
        NotifyId notifyId32 = new NotifyId("MSG_SEND_DENIED", 31, R.string.vkim_error_send_message_denied);
        MSG_SEND_DENIED = notifyId32;
        NotifyId notifyId33 = new NotifyId("MSG_DELETE_FOR_ALL_FAILED", 32, R.string.vkim_error_delete_for_all_failed);
        MSG_DELETE_FOR_ALL_FAILED = notifyId33;
        NotifyId notifyId34 = new NotifyId("MSG_AUDIO_TRANSCRIPT_EDIT_FAILED", 33, R.string.vkim_error_msg_audio_edit_failed_transcript_too_long);
        MSG_AUDIO_TRANSCRIPT_EDIT_FAILED = notifyId34;
        NotifyId notifyId35 = new NotifyId("MSG_UPLOAD_PHOTO_DECODE_FAILED", 34, R.string.vkim_error_msg_photo_upload_decode_failed);
        MSG_UPLOAD_PHOTO_DECODE_FAILED = notifyId35;
        NotifyId notifyId36 = new NotifyId("MSG_UPLOAD_PHOTO_WRONG_IMAGE_SIZE", 35, R.string.vkim_error_msg_photo_upload_wrong_size);
        MSG_UPLOAD_PHOTO_WRONG_IMAGE_SIZE = notifyId36;
        NotifyId notifyId37 = new NotifyId("MSG_UPLOAD_PHOTO_PREPROCESS_FAILED", 36, R.string.vkim_error_msg_photo_upload_preprocess_failed);
        MSG_UPLOAD_PHOTO_PREPROCESS_FAILED = notifyId37;
        NotifyId notifyId38 = new NotifyId("CHAT_CHANGE_TITLE_PERMISSION_DENIED", 37, R.string.vkim_error_chat_change_title_permission_denied);
        CHAT_CHANGE_TITLE_PERMISSION_DENIED = notifyId38;
        NotifyId notifyId39 = new NotifyId("CHAT_CHANGE_TITLE_EMPTY", 38, R.string.vkim_error_chat_change_title_empty);
        CHAT_CHANGE_TITLE_EMPTY = notifyId39;
        NotifyId notifyId40 = new NotifyId("CHAT_CHANGE_AVATAR_PERMISSION_DENIED", 39, R.string.vkim_error_chat_change_avatar_permission_denied);
        CHAT_CHANGE_AVATAR_PERMISSION_DENIED = notifyId40;
        NotifyId notifyId41 = new NotifyId("CHAT_INVITE_PERMISSION_DENIED", 40, R.string.vkim_error_chat_invite_permission_denied);
        CHAT_INVITE_PERMISSION_DENIED = notifyId41;
        NotifyId notifyId42 = new NotifyId("CHAT_KICK_PERMISSION_DENIED", 41, R.string.vkim_error_chat_kick_permission_denied);
        CHAT_KICK_PERMISSION_DENIED = notifyId42;
        NotifyId notifyId43 = new NotifyId("CHAT_PIN_PERMISSION_DENIED", 42, R.string.vkim_error_chat_pin_permission_denied);
        CHAT_PIN_PERMISSION_DENIED = notifyId43;
        NotifyId notifyId44 = new NotifyId("CHAT_UNPIN_PERMISSION_DENIED", 43, R.string.vkim_error_chat_unpin_permission_denied);
        CHAT_UNPIN_PERMISSION_DENIED = notifyId44;
        NotifyId notifyId45 = new NotifyId("CHAT_ETC_PERMISSION_DENIED", 44, R.string.vkim_error_chat_etc_permission_denied);
        CHAT_ETC_PERMISSION_DENIED = notifyId45;
        NotifyId notifyId46 = new NotifyId("CHAT_INVITE_GROUP_INACCESSIBLE", 45, R.string.vkim_error_chat_invite_group_inaccessible);
        CHAT_INVITE_GROUP_INACCESSIBLE = notifyId46;
        NotifyId notifyId47 = new NotifyId("CHANNEL_INVALID_TITLE", 46, R.string.vkim_error_channel_invalid_title);
        CHANNEL_INVALID_TITLE = notifyId47;
        NotifyId notifyId48 = new NotifyId("AUTH_PHONE_PARAM_PHONE", 47, R.string.vkim_error_auth_invalid_phone_format);
        AUTH_PHONE_PARAM_PHONE = notifyId48;
        NotifyId notifyId49 = new NotifyId("AUTH_CODE_INCORRECT", 48, R.string.vkim_error_auth_code_incorrect);
        AUTH_CODE_INCORRECT = notifyId49;
        NotifyId notifyId50 = new NotifyId("TOO_MANY_SIMILAR_REQUESTS", 49, R.string.vkim_error_too_many_similar_requests);
        TOO_MANY_SIMILAR_REQUESTS = notifyId50;
        NotifyId notifyId51 = new NotifyId("SCREEN_NAME_FORMAT_ERROR", 50, R.string.vkim_screen_name_status_illegal);
        SCREEN_NAME_FORMAT_ERROR = notifyId51;
        NotifyId notifyId52 = new NotifyId("CODE_CHAT_MR_ALREADY_SEND", 51, R.string.vkim_error_mr_already_sent);
        CODE_CHAT_MR_ALREADY_SEND = notifyId52;
        NotifyId notifyId53 = new NotifyId("ERROR_AUTH", 52, R.string.vkim_error_auth);
        ERROR_AUTH = notifyId53;
        NotifyId notifyId54 = new NotifyId("TOO_LARGE_FILE", 53, R.string.vkim_error_large_file);
        TOO_LARGE_FILE = notifyId54;
        NotifyId notifyId55 = new NotifyId("INVALID_FILE_EXTENSION", 54, R.string.vkim_error_invalid_file_extension);
        INVALID_FILE_EXTENSION = notifyId55;
        NotifyId[] notifyIdArr = {notifyId, notifyId2, notifyId3, notifyId4, notifyId5, notifyId6, notifyId7, notifyId8, notifyId9, notifyId10, notifyId11, notifyId12, notifyId13, notifyId14, notifyId15, notifyId16, notifyId17, notifyId18, notifyId19, notifyId20, notifyId21, notifyId22, notifyId23, notifyId24, notifyId25, notifyId26, notifyId27, notifyId28, notifyId29, notifyId30, notifyId31, notifyId32, notifyId33, notifyId34, notifyId35, notifyId36, notifyId37, notifyId38, notifyId39, notifyId40, notifyId41, notifyId42, notifyId43, notifyId44, notifyId45, notifyId46, notifyId47, notifyId48, notifyId49, notifyId50, notifyId51, notifyId52, notifyId53, notifyId54, notifyId55};
        $VALUES = notifyIdArr;
        $ENTRIES = new asp(notifyIdArr);
    }

    public NotifyId(String str, int i, int i2) {
        this.id = i2;
    }

    public static NotifyId valueOf(String str) {
        return (NotifyId) Enum.valueOf(NotifyId.class, str);
    }

    public static NotifyId[] values() {
        return (NotifyId[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
