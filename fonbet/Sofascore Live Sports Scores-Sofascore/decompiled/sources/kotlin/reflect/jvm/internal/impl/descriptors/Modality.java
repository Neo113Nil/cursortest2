package kotlin.reflect.jvm.internal.impl.descriptors;

import defpackage.gz8;
import defpackage.jp5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class Modality {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ Modality[] $VALUES;

    @NotNull
    public static final Companion Companion;
    public static final Modality FINAL = new Modality("FINAL", 0);
    public static final Modality SEALED = new Modality("SEALED", 1);
    public static final Modality OPEN = new Modality("OPEN", 2);
    public static final Modality ABSTRACT = new Modality("ABSTRACT", 3);

    private static final /* synthetic */ Modality[] $values() {
        return new Modality[]{FINAL, SEALED, OPEN, ABSTRACT};
    }

    static {
        Modality[] $values = $values();
        $VALUES = $values;
        Companion = new Companion(null);
        $ENTRIES = gz8.G($values);
    }

    private Modality(String str, int i) {
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Modality convertFromFlags(boolean z, boolean z2, boolean z3) {
            return z ? Modality.SEALED : z2 ? Modality.ABSTRACT : z3 ? Modality.OPEN : Modality.FINAL;
        }

        private Companion() {
        }
    }
}
