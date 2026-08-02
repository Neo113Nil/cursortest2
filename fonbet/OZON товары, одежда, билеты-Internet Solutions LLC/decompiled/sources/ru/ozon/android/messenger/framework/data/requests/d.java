package ru.ozon.android.messenger.framework.data.requests;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class d {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CHAT_ENTER;
    public static final d GET_CHATS;
    public static final d GET_MESSAGES;
    public static final d INITIALIZE_CHAT;
    public static final d SEARCH_CHATS;
    public static final d SEND_MESSAGE;
    public static final d SET_READ_MESSAGES;
    public static final d SET_SSO_TOKEN;
    public static final d SET_STATE;
    public static final d START_OR_GET_CHAT;
    public static final d UPDATE_MESSAGE;
    public static final d USER_IS_TYPING;

    @NotNull
    private final String methodName;

    static {
        d dVar = new d("GET_CHATS", 0, "getChats");
        GET_CHATS = dVar;
        d dVar2 = new d("START_OR_GET_CHAT", 1, "startOrGetChat");
        START_OR_GET_CHAT = dVar2;
        d dVar3 = new d("SEND_MESSAGE", 2, "sendMessage");
        SEND_MESSAGE = dVar3;
        d dVar4 = new d("GET_MESSAGES", 3, "getMessages");
        GET_MESSAGES = dVar4;
        d dVar5 = new d("SET_READ_MESSAGES", 4, "setReadMessages");
        SET_READ_MESSAGES = dVar5;
        d dVar6 = new d("CHAT_ENTER", 5, "chatEnter");
        CHAT_ENTER = dVar6;
        d dVar7 = new d("INITIALIZE_CHAT", 6, "initializeChat");
        INITIALIZE_CHAT = dVar7;
        d dVar8 = new d("SET_STATE", 7, "setState");
        SET_STATE = dVar8;
        d dVar9 = new d("USER_IS_TYPING", 8, "userIsTyping");
        USER_IS_TYPING = dVar9;
        d dVar10 = new d("SET_SSO_TOKEN", 9, "setSSOToken");
        SET_SSO_TOKEN = dVar10;
        d dVar11 = new d("SEARCH_CHATS", 10, "search");
        SEARCH_CHATS = dVar11;
        d dVar12 = new d("UPDATE_MESSAGE", 11, "updateMessage");
        UPDATE_MESSAGE = dVar12;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12};
        $VALUES = dVarArr;
        $ENTRIES = Xc.b.a(dVarArr);
    }

    private d(String str, int i11, String str2) {
        this.methodName = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.methodName;
    }
}
