package ru.ozon.android.messenger.blocks.input.messagesender;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ATTACHMENTS_ISSUE;
    public static final a EMPTY_TEXT_ISSUE;
    public static final a MESSAGES_SENT;

    static {
        a aVar = new a("MESSAGES_SENT", 0);
        MESSAGES_SENT = aVar;
        a aVar2 = new a("ATTACHMENTS_ISSUE", 1);
        ATTACHMENTS_ISSUE = aVar2;
        a aVar3 = new a("EMPTY_TEXT_ISSUE", 2);
        EMPTY_TEXT_ISSUE = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = Xc.b.a(aVarArr);
    }

    private a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
