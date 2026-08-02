package ru.ozon.app.android.push.handlers.teensmode;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/push/handlers/teensmode/TeensMode;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TEENS_MODE_ADULT_ONLY", "TEENS_MODE_KIDS_ONLY", "TEENS_MODE_ALL", "push_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TeensMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TeensMode[] $VALUES;

    @NotNull
    private final String value;
    public static final TeensMode TEENS_MODE_ADULT_ONLY = new TeensMode("TEENS_MODE_ADULT_ONLY", 0, "TEENS_MODE_ADULT_ONLY");
    public static final TeensMode TEENS_MODE_KIDS_ONLY = new TeensMode("TEENS_MODE_KIDS_ONLY", 1, "TEENS_MODE_KIDS_ONLY");
    public static final TeensMode TEENS_MODE_ALL = new TeensMode("TEENS_MODE_ALL", 2, "TEENS_MODE_ALL");

    private static final /* synthetic */ TeensMode[] $values() {
        return new TeensMode[]{TEENS_MODE_ADULT_ONLY, TEENS_MODE_KIDS_ONLY, TEENS_MODE_ALL};
    }

    static {
        TeensMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TeensMode(String str, int i11, String str2) {
        this.value = str2;
    }

    @NotNull
    public static a<TeensMode> getEntries() {
        return $ENTRIES;
    }

    public static TeensMode valueOf(String str) {
        return (TeensMode) Enum.valueOf(TeensMode.class, str);
    }

    public static TeensMode[] values() {
        return (TeensMode[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
