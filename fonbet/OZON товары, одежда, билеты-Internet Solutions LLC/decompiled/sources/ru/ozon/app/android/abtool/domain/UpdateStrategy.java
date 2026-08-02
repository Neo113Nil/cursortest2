package ru.ozon.app.android.abtool.domain;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/abtool/domain/UpdateStrategy;", "", "<init>", "(Ljava/lang/String;I)V", "PER_PROCESS", "AS_FETCHED", "DELETE", "EXCEPTION", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UpdateStrategy {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UpdateStrategy[] $VALUES;
    public static final UpdateStrategy PER_PROCESS = new UpdateStrategy("PER_PROCESS", 0);
    public static final UpdateStrategy AS_FETCHED = new UpdateStrategy("AS_FETCHED", 1);
    public static final UpdateStrategy DELETE = new UpdateStrategy("DELETE", 2);
    public static final UpdateStrategy EXCEPTION = new UpdateStrategy("EXCEPTION", 3);

    private static final /* synthetic */ UpdateStrategy[] $values() {
        return new UpdateStrategy[]{PER_PROCESS, AS_FETCHED, DELETE, EXCEPTION};
    }

    static {
        UpdateStrategy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UpdateStrategy(String str, int i11) {
    }

    @NotNull
    public static a<UpdateStrategy> getEntries() {
        return $ENTRIES;
    }

    public static UpdateStrategy valueOf(String str) {
        return (UpdateStrategy) Enum.valueOf(UpdateStrategy.class, str);
    }

    public static UpdateStrategy[] values() {
        return (UpdateStrategy[]) $VALUES.clone();
    }
}
