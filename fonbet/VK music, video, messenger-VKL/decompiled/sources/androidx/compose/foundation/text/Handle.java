package androidx.compose.foundation.text;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CoreTextField.kt */
/* loaded from: classes11.dex */
public final class Handle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Handle[] $VALUES;
    public static final Handle Cursor;
    public static final Handle SelectionEnd;
    public static final Handle SelectionStart;

    static {
        Handle handle = new Handle("Cursor", 0);
        Cursor = handle;
        Handle handle2 = new Handle("SelectionStart", 1);
        SelectionStart = handle2;
        Handle handle3 = new Handle("SelectionEnd", 2);
        SelectionEnd = handle3;
        Handle[] handleArr = {handle, handle2, handle3};
        $VALUES = handleArr;
        $ENTRIES = new asp(handleArr);
    }

    public Handle() {
        throw null;
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) $VALUES.clone();
    }
}
