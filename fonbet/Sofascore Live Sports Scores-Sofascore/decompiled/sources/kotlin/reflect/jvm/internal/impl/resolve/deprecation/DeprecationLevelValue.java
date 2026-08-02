package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import defpackage.gz8;
import defpackage.jp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeprecationLevelValue {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ DeprecationLevelValue[] $VALUES;
    public static final DeprecationLevelValue WARNING = new DeprecationLevelValue("WARNING", 0);
    public static final DeprecationLevelValue ERROR = new DeprecationLevelValue("ERROR", 1);
    public static final DeprecationLevelValue HIDDEN = new DeprecationLevelValue("HIDDEN", 2);

    private static final /* synthetic */ DeprecationLevelValue[] $values() {
        return new DeprecationLevelValue[]{WARNING, ERROR, HIDDEN};
    }

    static {
        DeprecationLevelValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private DeprecationLevelValue(String str, int i) {
    }

    public static DeprecationLevelValue valueOf(String str) {
        return (DeprecationLevelValue) Enum.valueOf(DeprecationLevelValue.class, str);
    }

    public static DeprecationLevelValue[] values() {
        return (DeprecationLevelValue[]) $VALUES.clone();
    }
}
