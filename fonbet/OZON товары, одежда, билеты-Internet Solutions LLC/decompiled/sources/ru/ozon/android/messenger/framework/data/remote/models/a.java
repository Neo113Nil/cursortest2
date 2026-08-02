package ru.ozon.android.messenger.framework.data.remote.models;

import com.squareup.moshi.i;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @i(name = "addItem")
    public static final a ADD_ITEM;

    @i(name = "notify")
    public static final a NOTIFY;

    @i(name = "pinItems")
    public static final a PIN_ITEMS;

    @i(name = "redirectToChatList")
    public static final a REDIRECT_TO_CHAT_LIST;

    @i(name = "removeItem")
    public static final a REMOVE_ITEM;

    @i(name = "resetCache")
    public static final a RESET_CACHE;

    @i(name = "updateGlobalCounter")
    public static final a UPDATE_GLOBAL_COUNTER;

    @i(name = "updateItem")
    public static final a UPDATE_ITEM;

    @i(name = "userIsTyping")
    public static final a USER_IS_TYPING;

    @NotNull
    private final String dtoName;

    static {
        a aVar = new a("ADD_ITEM", 0, "addItem");
        ADD_ITEM = aVar;
        a aVar2 = new a("UPDATE_ITEM", 1, "updateItem");
        UPDATE_ITEM = aVar2;
        a aVar3 = new a("REMOVE_ITEM", 2, "removeItem");
        REMOVE_ITEM = aVar3;
        a aVar4 = new a("PIN_ITEMS", 3, "pinItems");
        PIN_ITEMS = aVar4;
        a aVar5 = new a("USER_IS_TYPING", 4, "userIsTyping");
        USER_IS_TYPING = aVar5;
        a aVar6 = new a("RESET_CACHE", 5, "resetCache");
        RESET_CACHE = aVar6;
        a aVar7 = new a("UPDATE_GLOBAL_COUNTER", 6, "updateGlobalCounter");
        UPDATE_GLOBAL_COUNTER = aVar7;
        a aVar8 = new a("REDIRECT_TO_CHAT_LIST", 7, "redirectToChatList");
        REDIRECT_TO_CHAT_LIST = aVar8;
        a aVar9 = new a("NOTIFY", 8, "notify");
        NOTIFY = aVar9;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
        $VALUES = aVarArr;
        $ENTRIES = Xc.b.a(aVarArr);
    }

    private a(String str, int i11, String str2) {
        this.dtoName = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.dtoName;
    }
}
