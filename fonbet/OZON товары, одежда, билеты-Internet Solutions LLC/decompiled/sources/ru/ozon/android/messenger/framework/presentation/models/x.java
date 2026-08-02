package ru.ozon.android.messenger.framework.presentation.models;

import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class x {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x ALERT;
    public static final x CHATS;
    public static final x CURTAIN;
    public static final x FOOTER;
    public static final x GROUP;
    public static final x MESSAGES;

    static {
        x xVar = new x("CHATS", 0);
        CHATS = xVar;
        x xVar2 = new x("MESSAGES", 1);
        MESSAGES = xVar2;
        x xVar3 = new x(CommentV3DTO.FOOTER_NAME, 2);
        FOOTER = xVar3;
        x xVar4 = new x("GROUP", 3);
        GROUP = xVar4;
        x xVar5 = new x("ALERT", 4);
        ALERT = xVar5;
        x xVar6 = new x("CURTAIN", 5);
        CURTAIN = xVar6;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4, xVar5, xVar6};
        $VALUES = xVarArr;
        $ENTRIES = Xc.b.a(xVarArr);
    }

    private x() {
        throw null;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
