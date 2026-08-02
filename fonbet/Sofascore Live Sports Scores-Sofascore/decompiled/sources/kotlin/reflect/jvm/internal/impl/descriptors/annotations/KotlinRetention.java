package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import defpackage.gz8;
import defpackage.jp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class KotlinRetention {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ KotlinRetention[] $VALUES;
    public static final KotlinRetention RUNTIME = new KotlinRetention("RUNTIME", 0);
    public static final KotlinRetention BINARY = new KotlinRetention("BINARY", 1);
    public static final KotlinRetention SOURCE = new KotlinRetention("SOURCE", 2);

    private static final /* synthetic */ KotlinRetention[] $values() {
        return new KotlinRetention[]{RUNTIME, BINARY, SOURCE};
    }

    static {
        KotlinRetention[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private KotlinRetention(String str, int i) {
    }

    public static KotlinRetention valueOf(String str) {
        return (KotlinRetention) Enum.valueOf(KotlinRetention.class, str);
    }

    public static KotlinRetention[] values() {
        return (KotlinRetention[]) $VALUES.clone();
    }
}
