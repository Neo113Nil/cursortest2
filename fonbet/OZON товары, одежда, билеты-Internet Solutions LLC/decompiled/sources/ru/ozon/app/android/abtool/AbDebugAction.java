package ru.ozon.app.android.abtool;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/abtool/AbDebugAction;", "", "<init>", "(Ljava/lang/String;I)V", "APPEND", "DELETE", "REPLACE", "abzone-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AbDebugAction {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AbDebugAction[] $VALUES;
    public static final AbDebugAction APPEND = new AbDebugAction("APPEND", 0);
    public static final AbDebugAction DELETE = new AbDebugAction("DELETE", 1);
    public static final AbDebugAction REPLACE = new AbDebugAction("REPLACE", 2);

    private static final /* synthetic */ AbDebugAction[] $values() {
        return new AbDebugAction[]{APPEND, DELETE, REPLACE};
    }

    static {
        AbDebugAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AbDebugAction(String str, int i11) {
    }

    @NotNull
    public static a<AbDebugAction> getEntries() {
        return $ENTRIES;
    }

    public static AbDebugAction valueOf(String str) {
        return (AbDebugAction) Enum.valueOf(AbDebugAction.class, str);
    }

    public static AbDebugAction[] values() {
        return (AbDebugAction[]) $VALUES.clone();
    }
}
