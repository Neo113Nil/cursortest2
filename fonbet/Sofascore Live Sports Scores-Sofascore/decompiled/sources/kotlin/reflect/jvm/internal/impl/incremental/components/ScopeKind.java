package kotlin.reflect.jvm.internal.impl.incremental.components;

import defpackage.gz8;
import defpackage.jp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ScopeKind {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ ScopeKind[] $VALUES;
    public static final ScopeKind PACKAGE = new ScopeKind("PACKAGE", 0);
    public static final ScopeKind CLASSIFIER = new ScopeKind("CLASSIFIER", 1);

    private static final /* synthetic */ ScopeKind[] $values() {
        return new ScopeKind[]{PACKAGE, CLASSIFIER};
    }

    static {
        ScopeKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private ScopeKind(String str, int i) {
    }

    public static ScopeKind valueOf(String str) {
        return (ScopeKind) Enum.valueOf(ScopeKind.class, str);
    }

    public static ScopeKind[] values() {
        return (ScopeKind[]) $VALUES.clone();
    }
}
