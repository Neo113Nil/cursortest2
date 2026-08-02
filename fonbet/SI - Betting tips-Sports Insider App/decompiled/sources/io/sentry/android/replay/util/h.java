package io.sentry.android.replay.util;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ nf.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h SOC_MODEL = new h("SOC_MODEL", 0);
    public static final h SOC_MANUFACTURER = new h("SOC_MANUFACTURER", 1);

    private static final /* synthetic */ h[] $values() {
        return new h[]{SOC_MODEL, SOC_MANUFACTURER};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = com.google.android.play.core.appupdate.b.l($values);
    }

    private h(String str, int i5) {
    }

    @NotNull
    public static nf.a getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
