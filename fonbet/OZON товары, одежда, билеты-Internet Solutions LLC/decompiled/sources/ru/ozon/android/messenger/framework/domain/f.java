package ru.ozon.android.messenger.framework.domain;

import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.b;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

/* loaded from: classes10.dex */
public interface f {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a implements f {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a AI_DIVIDER;
        public static final a AI_EMPTY_STATE;
        public static final a AI_FLOATING_BUTTONS;
        public static final a AI_HEADER;
        public static final a AI_INPUT;
        public static final a AI_MESSAGE_ACTIONS;
        public static final a AI_TAP_TAGS;
        public static final a AI_THINKING_INDICATOR;
        public static final a SEARCH_CHAT;

        @NotNull
        private final String blockName;

        static {
            a aVar = new a("AI_EMPTY_STATE", 0, "aiEmptyState");
            AI_EMPTY_STATE = aVar;
            a aVar2 = new a("AI_INPUT", 1, "aiInput");
            AI_INPUT = aVar2;
            a aVar3 = new a("AI_HEADER", 2, "aiHeader");
            AI_HEADER = aVar3;
            a aVar4 = new a("AI_THINKING_INDICATOR", 3, "thinkingIndicator");
            AI_THINKING_INDICATOR = aVar4;
            a aVar5 = new a("AI_DIVIDER", 4, "divider");
            AI_DIVIDER = aVar5;
            a aVar6 = new a("AI_TAP_TAGS", 5, "aiTapTags");
            AI_TAP_TAGS = aVar6;
            a aVar7 = new a("AI_MESSAGE_ACTIONS", 6, "aiMessageActions");
            AI_MESSAGE_ACTIONS = aVar7;
            a aVar8 = new a("AI_FLOATING_BUTTONS", 7, "aiFloatingButtons");
            AI_FLOATING_BUTTONS = aVar8;
            a aVar9 = new a("SEARCH_CHAT", 8, "searchChat");
            SEARCH_CHAT = aVar9;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a(String str, int i11, String str2) {
            this.blockName = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // ru.ozon.android.messenger.framework.domain.f
        @NotNull
        public final String a() {
            return b.a.a("messenger", this.blockName);
        }

        @NotNull
        public final String b() {
            return this.blockName;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b implements f {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b CELL;
        public static final b CHAT_GROUP_LIST;
        public static final b DATE;
        public static final b LOADING;
        public static final b PAGINATION_ERROR;
        public static final b STUB;
        public static final b UNREAD;

        @NotNull
        private final String blockName;

        static {
            b bVar = new b("DATE", 0, "date");
            DATE = bVar;
            b bVar2 = new b("LOADING", 1, "loading");
            LOADING = bVar2;
            b bVar3 = new b("PAGINATION_ERROR", 2, "paginationError");
            PAGINATION_ERROR = bVar3;
            b bVar4 = new b("UNREAD", 3, "unread");
            UNREAD = bVar4;
            b bVar5 = new b("CHAT_GROUP_LIST", 4, "chatGroupList");
            CHAT_GROUP_LIST = bVar5;
            b bVar6 = new b("CELL", 5, "cell");
            CELL = bVar6;
            b bVar7 = new b("STUB", 6, "stub");
            STUB = bVar7;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b(String str, int i11, String str2) {
            this.blockName = str2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @Override // ru.ozon.android.messenger.framework.domain.f
        @NotNull
        public final String a() {
            return b.a.a("internal", this.blockName);
        }

        @NotNull
        public final String b() {
            return this.blockName;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c implements f {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c ACTION_BUTTON;
        public static final c AI_CELL_WRAPPER;
        public static final c ALERT;
        public static final c BUTTONS;
        public static final c BX_CHAT;
        public static final c CHAT;
        public static final c CHAT_GROUP;
        public static final c CHAT_LIST_HEADER;
        public static final c COUPON;
        public static final c COURIER_HEADER;
        public static final c CURTAIN;
        public static final c DANGEROUS_TEXT;
        public static final c DISCLAIMER;
        public static final c EMPTY_STATE;
        public static final c ERROR;
        public static final c FILE;
        public static final c FLOAT_BUTTON;
        public static final c FOOTER_INPUT;
        public static final c HEADER;
        public static final c IMAGE;
        public static final c NOTIFICATION;
        public static final c ONBOARDING;
        public static final c ORDER;
        public static final c ORIGINAL_TEXT;
        public static final c PINNED_ITEM;
        public static final c PRODUCT_SHELF;
        public static final c RATE_MESSENGER;
        public static final c RATE_OPERATOR;
        public static final c RECOMMENDATIONS;
        public static final c REPLY_MESSAGE;
        public static final c REPLY_OR_EDIT;
        public static final c SEARCH_CHAT;
        public static final c SHOW_TEXT_BUTTON;
        public static final c SNACKBAR;
        public static final c SX_CHAT;
        public static final c SYSTEM_TEXT;
        public static final c TEXT;
        public static final c TRAVEL_ORDERS;
        public static final c USER_IS_TYPING;

        @NotNull
        private final String blockName;

        static {
            c cVar = new c("TEXT", 0, "text");
            TEXT = cVar;
            c cVar2 = new c("FILE", 1, "file");
            FILE = cVar2;
            c cVar3 = new c("IMAGE", 2, "image");
            IMAGE = cVar3;
            c cVar4 = new c("FOOTER_INPUT", 3, "footerInput");
            FOOTER_INPUT = cVar4;
            c cVar5 = new c(CommentV3DTO.HEADER_NAME, 4, CommentV3DTO.HEADER_FIELD_NAME);
            HEADER = cVar5;
            c cVar6 = new c("PINNED_ITEM", 5, "pinnedItem");
            PINNED_ITEM = cVar6;
            c cVar7 = new c("ALERT", 6, "alert");
            ALERT = cVar7;
            c cVar8 = new c("ERROR", 7, "error");
            ERROR = cVar8;
            c cVar9 = new c("EMPTY_STATE", 8, "emptyStateBlock");
            EMPTY_STATE = cVar9;
            c cVar10 = new c("CHAT", 9, "chat");
            CHAT = cVar10;
            c cVar11 = new c("BX_CHAT", 10, "bxChat");
            BX_CHAT = cVar11;
            c cVar12 = new c("SX_CHAT", 11, "sxChat");
            SX_CHAT = cVar12;
            c cVar13 = new c("BUTTONS", 12, "buttons");
            BUTTONS = cVar13;
            c cVar14 = new c("RATE_OPERATOR", 13, "rateOperator");
            RATE_OPERATOR = cVar14;
            c cVar15 = new c("NOTIFICATION", 14, "notification");
            NOTIFICATION = cVar15;
            c cVar16 = new c("CHAT_LIST_HEADER", 15, "chatListHeader");
            CHAT_LIST_HEADER = cVar16;
            c cVar17 = new c("DISCLAIMER", 16, "messengerDisclaimer");
            DISCLAIMER = cVar17;
            c cVar18 = new c("CHAT_GROUP", 17, "chatGroup");
            CHAT_GROUP = cVar18;
            c cVar19 = new c("SNACKBAR", 18, "snackbar");
            SNACKBAR = cVar19;
            c cVar20 = new c("RATE_MESSENGER", 19, "rateMessenger");
            RATE_MESSENGER = cVar20;
            c cVar21 = new c("ONBOARDING", 20, "onboardingPopup");
            ONBOARDING = cVar21;
            c cVar22 = new c("COUPON", 21, "coupon");
            COUPON = cVar22;
            c cVar23 = new c("ORDER", 22, "order");
            ORDER = cVar23;
            c cVar24 = new c("RECOMMENDATIONS", 23, "recommendations");
            RECOMMENDATIONS = cVar24;
            c cVar25 = new c("PRODUCT_SHELF", 24, "productShelf");
            PRODUCT_SHELF = cVar25;
            c cVar26 = new c("ACTION_BUTTON", 25, "actionButton");
            ACTION_BUTTON = cVar26;
            c cVar27 = new c("ORIGINAL_TEXT", 26, "originalText");
            ORIGINAL_TEXT = cVar27;
            c cVar28 = new c("USER_IS_TYPING", 27, "isTypingBlock");
            USER_IS_TYPING = cVar28;
            c cVar29 = new c("COURIER_HEADER", 28, "courierHeader");
            COURIER_HEADER = cVar29;
            c cVar30 = new c("SYSTEM_TEXT", 29, "systemText");
            SYSTEM_TEXT = cVar30;
            c cVar31 = new c("CURTAIN", 30, "curtain");
            CURTAIN = cVar31;
            c cVar32 = new c("DANGEROUS_TEXT", 31, "dangerousText");
            DANGEROUS_TEXT = cVar32;
            c cVar33 = new c("AI_CELL_WRAPPER", 32, "aiCellWrapper");
            AI_CELL_WRAPPER = cVar33;
            c cVar34 = new c("SHOW_TEXT_BUTTON", 33, "showTextButton");
            SHOW_TEXT_BUTTON = cVar34;
            c cVar35 = new c("FLOAT_BUTTON", 34, "floatButton");
            FLOAT_BUTTON = cVar35;
            c cVar36 = new c("SEARCH_CHAT", 35, "searchChat");
            SEARCH_CHAT = cVar36;
            c cVar37 = new c("REPLY_MESSAGE", 36, "replyMessageBlock");
            REPLY_MESSAGE = cVar37;
            c cVar38 = new c("REPLY_OR_EDIT", 37, "replyInputBlock");
            REPLY_OR_EDIT = cVar38;
            c cVar39 = new c("TRAVEL_ORDERS", 38, "travelOrdersHeader");
            TRAVEL_ORDERS = cVar39;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, cVar25, cVar26, cVar27, cVar28, cVar29, cVar30, cVar31, cVar32, cVar33, cVar34, cVar35, cVar36, cVar37, cVar38, cVar39};
            $VALUES = cVarArr;
            $ENTRIES = Xc.b.a(cVarArr);
        }

        private c(String str, int i11, String str2) {
            this.blockName = str2;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        @Override // ru.ozon.android.messenger.framework.domain.f
        @NotNull
        public final String a() {
            return b.a.a("messenger", this.blockName);
        }

        @NotNull
        public final String b() {
            return this.blockName;
        }
    }

    @NotNull
    String a();
}
