package ru.ozon.app.android.abtool.presentation.debug;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/abtool/presentation/debug/ActionType;", "", "<init>", "(Ljava/lang/String;I)V", "APPEND", "REMOVE", "REPLACE", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ActionType[] $VALUES;
    public static final ActionType APPEND = new ActionType("APPEND", 0);
    public static final ActionType REMOVE = new ActionType("REMOVE", 1);
    public static final ActionType REPLACE = new ActionType("REPLACE", 2);

    private static final /* synthetic */ ActionType[] $values() {
        return new ActionType[]{APPEND, REMOVE, REPLACE};
    }

    static {
        ActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ActionType(String str, int i11) {
    }

    @NotNull
    public static a<ActionType> getEntries() {
        return $ENTRIES;
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) $VALUES.clone();
    }
}
