package ru.ozon.android.messenger.framework.data.remote.models;

import com.squareup.moshi.i;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @i(name = "alert")
    public static final b ALERT;

    @i(name = "chat")
    public static final b CHATS;

    @i(name = "curtain")
    public static final b CURTAIN;

    @i(name = CommentV3DTO.FOOTER_FIELD_NAME)
    public static final b FOOTER;

    @i(name = "group")
    public static final b GROUP;

    @i(name = "messages")
    public static final b MESSAGES;

    static {
        b bVar = new b("CHATS", 0);
        CHATS = bVar;
        b bVar2 = new b("MESSAGES", 1);
        MESSAGES = bVar2;
        b bVar3 = new b(CommentV3DTO.FOOTER_NAME, 2);
        FOOTER = bVar3;
        b bVar4 = new b("GROUP", 3);
        GROUP = bVar4;
        b bVar5 = new b("ALERT", 4);
        ALERT = bVar5;
        b bVar6 = new b("CURTAIN", 5);
        CURTAIN = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        $VALUES = bVarArr;
        $ENTRIES = Xc.b.a(bVarArr);
    }

    private b() {
        throw null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
