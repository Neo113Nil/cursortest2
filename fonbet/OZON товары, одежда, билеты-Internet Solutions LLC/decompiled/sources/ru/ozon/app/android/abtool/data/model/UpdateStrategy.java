package ru.ozon.app.android.abtool.data.model;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/abtool/data/model/UpdateStrategy;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PER_PROCESS", "AS_FETCHED", "DELETE", "EXCEPTION", "abzone-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpdateStrategy {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UpdateStrategy[] $VALUES;
    private final int value;
    public static final UpdateStrategy PER_PROCESS = new UpdateStrategy("PER_PROCESS", 0, 0);
    public static final UpdateStrategy AS_FETCHED = new UpdateStrategy("AS_FETCHED", 1, 1);
    public static final UpdateStrategy DELETE = new UpdateStrategy("DELETE", 2, 2);
    public static final UpdateStrategy EXCEPTION = new UpdateStrategy("EXCEPTION", 3, -1);

    private static final /* synthetic */ UpdateStrategy[] $values() {
        return new UpdateStrategy[]{PER_PROCESS, AS_FETCHED, DELETE, EXCEPTION};
    }

    static {
        UpdateStrategy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UpdateStrategy(String str, int i11, int i12) {
        this.value = i12;
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

    public final int getValue() {
        return this.value;
    }
}
