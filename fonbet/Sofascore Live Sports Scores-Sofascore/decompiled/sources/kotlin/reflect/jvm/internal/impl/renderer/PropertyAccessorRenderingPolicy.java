package kotlin.reflect.jvm.internal.impl.renderer;

import defpackage.gz8;
import defpackage.jp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class PropertyAccessorRenderingPolicy {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ PropertyAccessorRenderingPolicy[] $VALUES;
    public static final PropertyAccessorRenderingPolicy PRETTY = new PropertyAccessorRenderingPolicy("PRETTY", 0);
    public static final PropertyAccessorRenderingPolicy DEBUG = new PropertyAccessorRenderingPolicy("DEBUG", 1);
    public static final PropertyAccessorRenderingPolicy NONE = new PropertyAccessorRenderingPolicy("NONE", 2);

    private static final /* synthetic */ PropertyAccessorRenderingPolicy[] $values() {
        return new PropertyAccessorRenderingPolicy[]{PRETTY, DEBUG, NONE};
    }

    static {
        PropertyAccessorRenderingPolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private PropertyAccessorRenderingPolicy(String str, int i) {
    }

    public static PropertyAccessorRenderingPolicy valueOf(String str) {
        return (PropertyAccessorRenderingPolicy) Enum.valueOf(PropertyAccessorRenderingPolicy.class, str);
    }

    public static PropertyAccessorRenderingPolicy[] values() {
        return (PropertyAccessorRenderingPolicy[]) $VALUES.clone();
    }
}
