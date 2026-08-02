package ru.ozon.app.android.atoms.data.button;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/atoms/data/button/UpdateMode;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "UPDATE_MODE_INVALID", "UPDATE_MODE_MIN_ITEMS", "UPDATE_MODE_STEP", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UpdateMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UpdateMode[] $VALUES;

    @i(name = "UPDATE_MODE_INVALID")
    public static final UpdateMode UPDATE_MODE_INVALID = new UpdateMode("UPDATE_MODE_INVALID", 0, "UPDATE_MODE_INVALID");

    @i(name = "UPDATE_MODE_MIN_ITEMS")
    public static final UpdateMode UPDATE_MODE_MIN_ITEMS = new UpdateMode("UPDATE_MODE_MIN_ITEMS", 1, "UPDATE_MODE_MIN_ITEMS");

    @i(name = "UPDATE_MODE_STEP")
    public static final UpdateMode UPDATE_MODE_STEP = new UpdateMode("UPDATE_MODE_STEP", 2, "UPDATE_MODE_STEP");

    private static final /* synthetic */ UpdateMode[] $values() {
        return new UpdateMode[]{UPDATE_MODE_INVALID, UPDATE_MODE_MIN_ITEMS, UPDATE_MODE_STEP};
    }

    static {
        UpdateMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UpdateMode(String str, int i11, String str2) {
    }

    @NotNull
    public static a<UpdateMode> getEntries() {
        return $ENTRIES;
    }

    public static UpdateMode valueOf(String str) {
        return (UpdateMode) Enum.valueOf(UpdateMode.class, str);
    }

    public static UpdateMode[] values() {
        return (UpdateMode[]) $VALUES.clone();
    }
}
