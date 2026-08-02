package kotlin.reflect.jvm.internal.impl.renderer;

import defpackage.gz8;
import defpackage.jp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ParameterNameRenderingPolicy {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ ParameterNameRenderingPolicy[] $VALUES;
    public static final ParameterNameRenderingPolicy ALL = new ParameterNameRenderingPolicy("ALL", 0);
    public static final ParameterNameRenderingPolicy ONLY_NON_SYNTHESIZED = new ParameterNameRenderingPolicy("ONLY_NON_SYNTHESIZED", 1);
    public static final ParameterNameRenderingPolicy NONE = new ParameterNameRenderingPolicy("NONE", 2);

    private static final /* synthetic */ ParameterNameRenderingPolicy[] $values() {
        return new ParameterNameRenderingPolicy[]{ALL, ONLY_NON_SYNTHESIZED, NONE};
    }

    static {
        ParameterNameRenderingPolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private ParameterNameRenderingPolicy(String str, int i) {
    }

    public static ParameterNameRenderingPolicy valueOf(String str) {
        return (ParameterNameRenderingPolicy) Enum.valueOf(ParameterNameRenderingPolicy.class, str);
    }

    public static ParameterNameRenderingPolicy[] values() {
        return (ParameterNameRenderingPolicy[]) $VALUES.clone();
    }
}
