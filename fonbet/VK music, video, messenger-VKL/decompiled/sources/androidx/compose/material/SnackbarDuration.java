package androidx.compose.material;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SnackbarHost.kt */
/* loaded from: classes11.dex */
public final class SnackbarDuration {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SnackbarDuration[] $VALUES;
    public static final SnackbarDuration Indefinite;
    public static final SnackbarDuration Long;
    public static final SnackbarDuration Short;

    static {
        SnackbarDuration snackbarDuration = new SnackbarDuration("Short", 0);
        Short = snackbarDuration;
        SnackbarDuration snackbarDuration2 = new SnackbarDuration("Long", 1);
        Long = snackbarDuration2;
        SnackbarDuration snackbarDuration3 = new SnackbarDuration("Indefinite", 2);
        Indefinite = snackbarDuration3;
        SnackbarDuration[] snackbarDurationArr = {snackbarDuration, snackbarDuration2, snackbarDuration3};
        $VALUES = snackbarDurationArr;
        $ENTRIES = new asp(snackbarDurationArr);
    }

    public SnackbarDuration() {
        throw null;
    }

    public static SnackbarDuration valueOf(String str) {
        return (SnackbarDuration) Enum.valueOf(SnackbarDuration.class, str);
    }

    public static SnackbarDuration[] values() {
        return (SnackbarDuration[]) $VALUES.clone();
    }
}
