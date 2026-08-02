package ru.ozon.app.android.scanit.scanit;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/scanit/scanit/CloseAction;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BACK_PRESSED", "OPEN_SCAN_INTRO", "scanit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CloseAction {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ CloseAction[] $VALUES;
    public static final CloseAction NONE = new CloseAction("NONE", 0);
    public static final CloseAction BACK_PRESSED = new CloseAction("BACK_PRESSED", 1);
    public static final CloseAction OPEN_SCAN_INTRO = new CloseAction("OPEN_SCAN_INTRO", 2);

    private static final /* synthetic */ CloseAction[] $values() {
        return new CloseAction[]{NONE, BACK_PRESSED, OPEN_SCAN_INTRO};
    }

    static {
        CloseAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
    }

    private CloseAction(String str, int i11) {
    }

    public static CloseAction valueOf(String str) {
        return (CloseAction) Enum.valueOf(CloseAction.class, str);
    }

    public static CloseAction[] values() {
        return (CloseAction[]) $VALUES.clone();
    }
}
