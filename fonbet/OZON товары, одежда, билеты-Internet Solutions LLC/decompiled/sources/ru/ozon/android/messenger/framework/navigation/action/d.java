package ru.ozon.android.messenger.framework.navigation.action;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class d {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ACCEPT_ACTION;
    public static final d ADD_NEW_FAST_ANSWER;
    public static final d AI_DISLIKE_ANSWER;
    public static final d AI_LIKE_ANSWER;
    public static final d AI_OPEN_SOURCES_CURTAIN;
    public static final d AI_REFRESH;
    public static final d AI_RETRY_SEND_MESSAGE;
    public static final d AI_SEND_MESSAGE;
    public static final d CANCEL_EDIT_CHAT_MESSAGE;
    public static final d CANCEL_REPLY_CHAT_MESSAGE;
    public static final d CHAT_ACTION_WITH_SUCCESS_MESSAGE;
    public static final d CHAT_GET_ACTION_CURTAIN_MODAL;
    public static final d CHAT_GET_CURTAIN_MODAL;
    public static final d CHAT_GET_SUSPICIOUS_LINK_MODAL;
    public static final d CHAT_GROUP_SELECTED;
    public static final d CLOSE_ALERT;
    public static final d COPY_MESSAGE;
    public static final d COPY_TEXT;

    @NotNull
    public static final a Companion;
    public static final d DISMISS_MESSENGER_DISCLAIMER_MODAL;
    public static final d DISMISS_POPUP_MENU;
    public static final d EDIT_CHAT_MESSAGE;
    public static final d ENABLE_NOTIFICATIONS;
    public static final d ENABLE_NOTIFICATIONS_V2;
    public static final d FAST_ANSWER;
    public static final d GO_TO_SETTINGS;
    public static final d ONBOARDING_HIDDEN;
    public static final d ON_APPLY_COUPON;
    public static final d ON_CHAT_BUTTONS_CLICK;
    public static final d ON_CHAT_BUTTONS_CLICK_OLD;
    public static final d ON_CHAT_HEADER_CLICK;
    public static final d ON_CHAT_UPDATE_BLOCK;
    public static final d ON_HIDE_COUPON;
    public static final d ON_MSG_COUNTER_CLICK;
    public static final d ON_SEND_RATE_OPERATOR;
    public static final d ON_SHOW_ORIGINAL_TEXT;
    public static final d ON_UNREAD_MSG_DISPLAYED;
    public static final d OPEN_MESSENGER_DISCLAIMER_MODAL;
    public static final d OPEN_SEARCH;
    public static final d PICK_FILE;
    public static final d PICK_IMAGE;
    public static final d RELOAD;
    public static final d REMOVE_MESSAGE;
    public static final d REPLY_CHAT_MESSAGE;
    public static final d REPORT;
    public static final d REPORT_ABUSE_FORM;
    public static final d REPORT_BUYER;
    public static final d RESEND_UNDELIVERED_MESSAGE;
    public static final d SCROLL_TO_BOTTOM;
    public static final d SEARCH_QUERY_CHANGED;
    public static final d SEND_MESSAGE_AFTER_CONFIRMATION;
    public static final d SEND_UPDATE_CHAT_MESSAGE;
    public static final d SHOW_CHAT_LIST;
    public static final d SHOW_TEXT_BUTTON;
    public static final d STUB_ACTION;
    public static final d TAKE_PHOTO;
    public static final d UNPIN_HEADER_ITEM;

    /* renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f89169id;

    public static final class a {
        public static d a(String str) {
            for (d dVar : d.values()) {
                if (Intrinsics.d(dVar.a(), str)) {
                    return dVar;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b ON_EXTERNAL_BUTTON_CLICK;

        /* renamed from: id, reason: collision with root package name */
        @NotNull
        private final String f89170id = "external_button";

        static {
            b bVar = new b();
            ON_EXTERNAL_BUTTON_CLICK = bVar;
            b[] bVarArr = {bVar};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b() {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @NotNull
        public final String a() {
            return this.f89170id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c ACTION_ERROR_FLASHBAR;
        public static final c AI_MESSAGE_ACTION_MENU_INFO;
        public static final c AI_MESSAGE_ACTION_TOGGLE_ID;
        public static final c COPY_MESSAGE;
        public static final c ERROR_SUBTITLE;
        public static final c ERROR_TITLE;
        public static final c FILES_MAX_COUNT;
        public static final c FILE_MAX_SIZE;
        public static final c ITEM_ID;
        public static final c LINK;
        public static final c MESSAGE_ID;
        public static final c MIME_TYPES;
        public static final c NOTIFICATION_SUBTITLE;
        public static final c NOTIFICATION_TITLE;
        public static final c RATE;
        public static final c REASONS;
        public static final c REDIRECT_URL;
        public static final c REMOVE_MESSAGE;
        public static final c REPORT_ERROR_FLASHBAR;
        public static final c REPORT_SUCCESS_FLASHBAR;
        public static final c RETRY_MESSAGE;
        public static final c SELECTED_CHAT_GROUP_ID;
        public static final c TEXT;
        public static final c UNREAD_MESSAGE_ID;
        public static final c UPLOAD_URL;

        @NotNull
        private final String key;

        static {
            c cVar = new c("UNREAD_MESSAGE_ID", 0, "UNREAD_MESSAGE_ID");
            UNREAD_MESSAGE_ID = cVar;
            c cVar2 = new c("SELECTED_CHAT_GROUP_ID", 1, "SELECTED_CHAT_GROUP");
            SELECTED_CHAT_GROUP_ID = cVar2;
            c cVar3 = new c("REPORT_SUCCESS_FLASHBAR", 2, "REPORT_SUCCESS_MESSAGE");
            REPORT_SUCCESS_FLASHBAR = cVar3;
            c cVar4 = new c("REPORT_ERROR_FLASHBAR", 3, "REPORT_ERROR_MESSAGE");
            REPORT_ERROR_FLASHBAR = cVar4;
            c cVar5 = new c("ACTION_ERROR_FLASHBAR", 4, "ACTION_ERROR_FLASHBAR");
            ACTION_ERROR_FLASHBAR = cVar5;
            c cVar6 = new c("RATE", 5, "rate");
            RATE = cVar6;
            c cVar7 = new c("REASONS", 6, "reasons");
            REASONS = cVar7;
            c cVar8 = new c("TEXT", 7, "text");
            TEXT = cVar8;
            c cVar9 = new c("FILES_MAX_COUNT", 8, "ATTACHMENTS_MAX_COUNT");
            FILES_MAX_COUNT = cVar9;
            c cVar10 = new c("FILE_MAX_SIZE", 9, "FILE_MAX_SIZE");
            FILE_MAX_SIZE = cVar10;
            c cVar11 = new c("MIME_TYPES", 10, "MIME_TYPES");
            MIME_TYPES = cVar11;
            c cVar12 = new c("UPLOAD_URL", 11, "UPLOAD_URL");
            UPLOAD_URL = cVar12;
            c cVar13 = new c("REMOVE_MESSAGE", 12, "REMOVE_MESSAGE");
            REMOVE_MESSAGE = cVar13;
            c cVar14 = new c("COPY_MESSAGE", 13, "COPY_MESSAGE");
            COPY_MESSAGE = cVar14;
            c cVar15 = new c("ERROR_TITLE", 14, "errorTitle");
            ERROR_TITLE = cVar15;
            c cVar16 = new c("ERROR_SUBTITLE", 15, "errorSubtitle");
            ERROR_SUBTITLE = cVar16;
            c cVar17 = new c("NOTIFICATION_TITLE", 16, "notificationTitle");
            NOTIFICATION_TITLE = cVar17;
            c cVar18 = new c("NOTIFICATION_SUBTITLE", 17, "notificationSubtitle");
            NOTIFICATION_SUBTITLE = cVar18;
            c cVar19 = new c("RETRY_MESSAGE", 18, "retryMessage");
            RETRY_MESSAGE = cVar19;
            c cVar20 = new c("LINK", 19, "link");
            LINK = cVar20;
            c cVar21 = new c("REDIRECT_URL", 20, "redirectUrl");
            REDIRECT_URL = cVar21;
            c cVar22 = new c("AI_MESSAGE_ACTION_TOGGLE_ID", 21, "aiMessageActionToggleId");
            AI_MESSAGE_ACTION_TOGGLE_ID = cVar22;
            c cVar23 = new c("AI_MESSAGE_ACTION_MENU_INFO", 22, "aiMessageActionMenuInfo");
            AI_MESSAGE_ACTION_MENU_INFO = cVar23;
            c cVar24 = new c("ITEM_ID", 23, "itemId");
            ITEM_ID = cVar24;
            c cVar25 = new c("MESSAGE_ID", 24, "messageId");
            MESSAGE_ID = cVar25;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, cVar25};
            $VALUES = cVarArr;
            $ENTRIES = Xc.b.a(cVarArr);
        }

        private c(String str, int i11, String str2) {
            this.key = str2;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        @NotNull
        public final String a() {
            return this.key;
        }
    }

    static {
        d dVar = new d("PICK_IMAGE", 0, "selectFromGalleryMenuAction");
        PICK_IMAGE = dVar;
        d dVar2 = new d("PICK_FILE", 1, "selectFileMenuAction");
        PICK_FILE = dVar2;
        d dVar3 = new d("TAKE_PHOTO", 2, "takePhotoMenuAction");
        TAKE_PHOTO = dVar3;
        d dVar4 = new d("FAST_ANSWER", 3, "fastAnswerMenuAction");
        FAST_ANSWER = dVar4;
        d dVar5 = new d("RESEND_UNDELIVERED_MESSAGE", 4, "resendMessages");
        RESEND_UNDELIVERED_MESSAGE = dVar5;
        d dVar6 = new d("REMOVE_MESSAGE", 5, "removeMessage");
        REMOVE_MESSAGE = dVar6;
        d dVar7 = new d("COPY_MESSAGE", 6, "copyMessage");
        COPY_MESSAGE = dVar7;
        d dVar8 = new d("ADD_NEW_FAST_ANSWER", 7, "chatGetFastAnswersAddAction");
        ADD_NEW_FAST_ANSWER = dVar8;
        d dVar9 = new d("DISMISS_POPUP_MENU", 8, "dismissPopupMenu");
        DISMISS_POPUP_MENU = dVar9;
        d dVar10 = new d("EDIT_CHAT_MESSAGE", 9, "editChatMessage");
        EDIT_CHAT_MESSAGE = dVar10;
        d dVar11 = new d("REPLY_CHAT_MESSAGE", 10, "replyChatMessage");
        REPLY_CHAT_MESSAGE = dVar11;
        d dVar12 = new d("SEND_MESSAGE_AFTER_CONFIRMATION", 11, "sendMessage");
        SEND_MESSAGE_AFTER_CONFIRMATION = dVar12;
        d dVar13 = new d("ON_CHAT_BUTTONS_CLICK_OLD", 12, "cb_buttons_click");
        ON_CHAT_BUTTONS_CLICK_OLD = dVar13;
        d dVar14 = new d("ON_CHAT_BUTTONS_CLICK", 13, "buttons_v1_click");
        ON_CHAT_BUTTONS_CLICK = dVar14;
        d dVar15 = new d("ON_SEND_RATE_OPERATOR", 14, "rateoperator_v1_sendrate");
        ON_SEND_RATE_OPERATOR = dVar15;
        d dVar16 = new d("ON_APPLY_COUPON", 15, "messengercoupon_v1_apply");
        ON_APPLY_COUPON = dVar16;
        d dVar17 = new d("ON_HIDE_COUPON", 16, "messengercoupon_v1_hide");
        ON_HIDE_COUPON = dVar17;
        d dVar18 = new d("ON_CHAT_HEADER_CLICK", 17, "onChatHeaderClick");
        ON_CHAT_HEADER_CLICK = dVar18;
        d dVar19 = new d("ON_CHAT_UPDATE_BLOCK", 18, "messenger_v1_updateblock");
        ON_CHAT_UPDATE_BLOCK = dVar19;
        d dVar20 = new d("ON_SHOW_ORIGINAL_TEXT", 19, "originaltext_v1_showoriginaltext");
        ON_SHOW_ORIGINAL_TEXT = dVar20;
        d dVar21 = new d("OPEN_MESSENGER_DISCLAIMER_MODAL", 20, "messengerdisclaimer_v1_openmodal");
        OPEN_MESSENGER_DISCLAIMER_MODAL = dVar21;
        d dVar22 = new d("DISMISS_MESSENGER_DISCLAIMER_MODAL", 21, "close");
        DISMISS_MESSENGER_DISCLAIMER_MODAL = dVar22;
        d dVar23 = new d("ONBOARDING_HIDDEN", 22, "onboarding_v1_hide_onboarding");
        ONBOARDING_HIDDEN = dVar23;
        d dVar24 = new d("CHAT_GET_SUSPICIOUS_LINK_MODAL", 23, "chatGetSuspiciousLinkModal");
        CHAT_GET_SUSPICIOUS_LINK_MODAL = dVar24;
        d dVar25 = new d("CHAT_GET_CURTAIN_MODAL", 24, "getChatCurtain");
        CHAT_GET_CURTAIN_MODAL = dVar25;
        d dVar26 = new d("CHAT_GET_ACTION_CURTAIN_MODAL", 25, "chatGetActionCurtain");
        CHAT_GET_ACTION_CURTAIN_MODAL = dVar26;
        d dVar27 = new d("REPORT_ABUSE_FORM", 26, "reportAbuseForm");
        REPORT_ABUSE_FORM = dVar27;
        d dVar28 = new d("UNPIN_HEADER_ITEM", 27, "unpinHeaderItem");
        UNPIN_HEADER_ITEM = dVar28;
        d dVar29 = new d("STUB_ACTION", 28, "stubAction");
        STUB_ACTION = dVar29;
        d dVar30 = new d("COPY_TEXT", 29, "copyText");
        COPY_TEXT = dVar30;
        d dVar31 = new d("SHOW_TEXT_BUTTON", 30, "showTextButton");
        SHOW_TEXT_BUTTON = dVar31;
        d dVar32 = new d("ON_UNREAD_MSG_DISPLAYED", 31, "onUnreadMessageDisplayed");
        ON_UNREAD_MSG_DISPLAYED = dVar32;
        d dVar33 = new d("RELOAD", 32, DeleteAccountApiResponse.Error.TYPE_RELOAD);
        RELOAD = dVar33;
        d dVar34 = new d("ON_MSG_COUNTER_CLICK", 33, "onScrollToLastMessageClick");
        ON_MSG_COUNTER_CLICK = dVar34;
        d dVar35 = new d("GO_TO_SETTINGS", 34, "goToSettings");
        GO_TO_SETTINGS = dVar35;
        d dVar36 = new d("OPEN_SEARCH", 35, "openSearch");
        OPEN_SEARCH = dVar36;
        d dVar37 = new d("CHAT_GROUP_SELECTED", 36, "chatGroupSelected");
        CHAT_GROUP_SELECTED = dVar37;
        d dVar38 = new d("SHOW_CHAT_LIST", 37, "showChatsList");
        SHOW_CHAT_LIST = dVar38;
        d dVar39 = new d("ENABLE_NOTIFICATIONS", 38, "enable_notifications");
        ENABLE_NOTIFICATIONS = dVar39;
        d dVar40 = new d("ENABLE_NOTIFICATIONS_V2", 39, "enable_notifications_v2");
        ENABLE_NOTIFICATIONS_V2 = dVar40;
        d dVar41 = new d("CLOSE_ALERT", 40, "closeAlert");
        CLOSE_ALERT = dVar41;
        d dVar42 = new d("REPORT_BUYER", 41, "report_buyer");
        REPORT_BUYER = dVar42;
        d dVar43 = new d("REPORT", 42, "report");
        REPORT = dVar43;
        d dVar44 = new d("ACCEPT_ACTION", 43, "accept");
        ACCEPT_ACTION = dVar44;
        d dVar45 = new d("CHAT_ACTION_WITH_SUCCESS_MESSAGE", 44, "chatActionWithSuccessMessage");
        CHAT_ACTION_WITH_SUCCESS_MESSAGE = dVar45;
        d dVar46 = new d("SEARCH_QUERY_CHANGED", 45, "searchQueryChanged");
        SEARCH_QUERY_CHANGED = dVar46;
        d dVar47 = new d("AI_SEND_MESSAGE", 46, "aiSendMessage");
        AI_SEND_MESSAGE = dVar47;
        d dVar48 = new d("AI_REFRESH", 47, "aiRefresh");
        AI_REFRESH = dVar48;
        d dVar49 = new d("AI_RETRY_SEND_MESSAGE", 48, "aiRetrySendMessage");
        AI_RETRY_SEND_MESSAGE = dVar49;
        d dVar50 = new d("AI_OPEN_SOURCES_CURTAIN", 49, "aiOpenSourcesCurtain");
        AI_OPEN_SOURCES_CURTAIN = dVar50;
        d dVar51 = new d("AI_LIKE_ANSWER", 50, "aiLikeAnswer");
        AI_LIKE_ANSWER = dVar51;
        d dVar52 = new d("AI_DISLIKE_ANSWER", 51, "aiDislikeAnswer");
        AI_DISLIKE_ANSWER = dVar52;
        d dVar53 = new d("SCROLL_TO_BOTTOM", 52, "scrollToBottom");
        SCROLL_TO_BOTTOM = dVar53;
        d dVar54 = new d("CANCEL_EDIT_CHAT_MESSAGE", 53, "cancelEditChatMessage");
        CANCEL_EDIT_CHAT_MESSAGE = dVar54;
        d dVar55 = new d("CANCEL_REPLY_CHAT_MESSAGE", 54, "cancelReplyChatMessage");
        CANCEL_REPLY_CHAT_MESSAGE = dVar55;
        d dVar56 = new d("SEND_UPDATE_CHAT_MESSAGE", 55, "sendUpdateChatMessage");
        SEND_UPDATE_CHAT_MESSAGE = dVar56;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16, dVar17, dVar18, dVar19, dVar20, dVar21, dVar22, dVar23, dVar24, dVar25, dVar26, dVar27, dVar28, dVar29, dVar30, dVar31, dVar32, dVar33, dVar34, dVar35, dVar36, dVar37, dVar38, dVar39, dVar40, dVar41, dVar42, dVar43, dVar44, dVar45, dVar46, dVar47, dVar48, dVar49, dVar50, dVar51, dVar52, dVar53, dVar54, dVar55, dVar56};
        $VALUES = dVarArr;
        $ENTRIES = Xc.b.a(dVarArr);
        Companion = new a();
    }

    private d(String str, int i11, String str2) {
        this.f89169id = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.f89169id;
    }
}
