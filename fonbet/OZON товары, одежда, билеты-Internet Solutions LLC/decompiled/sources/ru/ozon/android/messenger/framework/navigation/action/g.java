package ru.ozon.android.messenger.framework.navigation.action;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class g {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final g DELETE_ON_HIDE_CALLBACK;
    public static final g HIDE;
    public static final g HIDE_POP_UP_ALERT;
    public static final g READ_ALL_CHATS_ACTION;
    public static final g READ_ALL_IN_CHAT_ACTION;
    public static final g REMOVE_POP_UP_BLOCKS;
    public static final g REQUEST_HEIGHT;
    public static final g SEND_RATE_MESSENGER;
    public static final g SEND_RATE_MESSENGER_ON_DISMISS;
    public static final g SET_ON_HIDE_CALLBACK;
    public static final g SHOW_POP_UP_ALERT;
    public static final g UPDATE_POP_UP_CONTENT;

    /* renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f89172id;

    public static final class a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b BLOCKS_MAP;
        public static final b LOADING_TTL;
        public static final b NEW_HEIGHT;
        public static final b ON_HIDE_ACTION;
        public static final b POP_UP_ALERT_TITLE;
        public static final b READ_ALL_ERROR_MESSAGE;

        @NotNull
        private final String key;

        static {
            b bVar = new b("ON_HIDE_ACTION", 0, "ON_HIDE_ACTION");
            ON_HIDE_ACTION = bVar;
            b bVar2 = new b("NEW_HEIGHT", 1, "NEW_HEIGHT");
            NEW_HEIGHT = bVar2;
            b bVar3 = new b("BLOCKS_MAP", 2, "BLOCKS_MAP");
            BLOCKS_MAP = bVar3;
            b bVar4 = new b("POP_UP_ALERT_TITLE", 3, "ALERT_TITLE");
            POP_UP_ALERT_TITLE = bVar4;
            b bVar5 = new b("READ_ALL_ERROR_MESSAGE", 4, "error_message");
            READ_ALL_ERROR_MESSAGE = bVar5;
            b bVar6 = new b("LOADING_TTL", 5, "loading_ttl");
            LOADING_TTL = bVar6;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b(String str, int i11, String str2) {
            this.key = str2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @NotNull
        public final String a() {
            return this.key;
        }
    }

    static {
        g gVar = new g("SEND_RATE_MESSENGER", 0, "rateMessenger");
        SEND_RATE_MESSENGER = gVar;
        g gVar2 = new g("SEND_RATE_MESSENGER_ON_DISMISS", 1, "rateMessengerOnDismiss");
        SEND_RATE_MESSENGER_ON_DISMISS = gVar2;
        g gVar3 = new g("SET_ON_HIDE_CALLBACK", 2, "setOnHideCallback");
        SET_ON_HIDE_CALLBACK = gVar3;
        g gVar4 = new g("DELETE_ON_HIDE_CALLBACK", 3, "deleteOnHideCallback");
        DELETE_ON_HIDE_CALLBACK = gVar4;
        g gVar5 = new g("HIDE", 4, "hide");
        HIDE = gVar5;
        g gVar6 = new g("UPDATE_POP_UP_CONTENT", 5, "updatePopUpContent");
        UPDATE_POP_UP_CONTENT = gVar6;
        g gVar7 = new g("REMOVE_POP_UP_BLOCKS", 6, "removePopUpBlocks");
        REMOVE_POP_UP_BLOCKS = gVar7;
        g gVar8 = new g("REQUEST_HEIGHT", 7, "requestHeight");
        REQUEST_HEIGHT = gVar8;
        g gVar9 = new g("SHOW_POP_UP_ALERT", 8, "showPopUpAlert");
        SHOW_POP_UP_ALERT = gVar9;
        g gVar10 = new g("HIDE_POP_UP_ALERT", 9, "hidePopUpAlert");
        HIDE_POP_UP_ALERT = gVar10;
        g gVar11 = new g("READ_ALL_CHATS_ACTION", 10, "readAllChats");
        READ_ALL_CHATS_ACTION = gVar11;
        g gVar12 = new g("READ_ALL_IN_CHAT_ACTION", 11, "setReadMessage");
        READ_ALL_IN_CHAT_ACTION = gVar12;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12};
        $VALUES = gVarArr;
        $ENTRIES = Xc.b.a(gVarArr);
        Companion = new a();
    }

    private g(String str, int i11, String str2) {
        this.f89172id = str2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.f89172id;
    }
}
