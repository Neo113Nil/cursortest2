package kotlin.reflect.jvm.internal.impl.renderer;

import defpackage.gz8;
import defpackage.jp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class OverrideRenderingPolicy {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ OverrideRenderingPolicy[] $VALUES;
    public static final OverrideRenderingPolicy RENDER_OVERRIDE = new OverrideRenderingPolicy("RENDER_OVERRIDE", 0);
    public static final OverrideRenderingPolicy RENDER_OPEN = new OverrideRenderingPolicy("RENDER_OPEN", 1);
    public static final OverrideRenderingPolicy RENDER_OPEN_OVERRIDE = new OverrideRenderingPolicy("RENDER_OPEN_OVERRIDE", 2);

    private static final /* synthetic */ OverrideRenderingPolicy[] $values() {
        return new OverrideRenderingPolicy[]{RENDER_OVERRIDE, RENDER_OPEN, RENDER_OPEN_OVERRIDE};
    }

    static {
        OverrideRenderingPolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private OverrideRenderingPolicy(String str, int i) {
    }

    public static OverrideRenderingPolicy valueOf(String str) {
        return (OverrideRenderingPolicy) Enum.valueOf(OverrideRenderingPolicy.class, str);
    }

    public static OverrideRenderingPolicy[] values() {
        return (OverrideRenderingPolicy[]) $VALUES.clone();
    }
}
