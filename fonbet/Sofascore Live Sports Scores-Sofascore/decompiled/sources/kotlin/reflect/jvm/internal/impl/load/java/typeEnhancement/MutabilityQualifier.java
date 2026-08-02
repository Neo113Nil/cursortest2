package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import defpackage.gz8;
import defpackage.jp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class MutabilityQualifier {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ MutabilityQualifier[] $VALUES;
    public static final MutabilityQualifier READ_ONLY = new MutabilityQualifier("READ_ONLY", 0);
    public static final MutabilityQualifier MUTABLE = new MutabilityQualifier("MUTABLE", 1);

    private static final /* synthetic */ MutabilityQualifier[] $values() {
        return new MutabilityQualifier[]{READ_ONLY, MUTABLE};
    }

    static {
        MutabilityQualifier[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private MutabilityQualifier(String str, int i) {
    }

    public static MutabilityQualifier valueOf(String str) {
        return (MutabilityQualifier) Enum.valueOf(MutabilityQualifier.class, str);
    }

    public static MutabilityQualifier[] values() {
        return (MutabilityQualifier[]) $VALUES.clone();
    }
}
