package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import defpackage.gz8;
import defpackage.jp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DeserializedContainerAbiStability {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ DeserializedContainerAbiStability[] $VALUES;
    public static final DeserializedContainerAbiStability STABLE = new DeserializedContainerAbiStability("STABLE", 0);
    public static final DeserializedContainerAbiStability FIR_UNSTABLE = new DeserializedContainerAbiStability("FIR_UNSTABLE", 1);
    public static final DeserializedContainerAbiStability IR_UNSTABLE = new DeserializedContainerAbiStability("IR_UNSTABLE", 2);

    private static final /* synthetic */ DeserializedContainerAbiStability[] $values() {
        return new DeserializedContainerAbiStability[]{STABLE, FIR_UNSTABLE, IR_UNSTABLE};
    }

    static {
        DeserializedContainerAbiStability[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private DeserializedContainerAbiStability(String str, int i) {
    }

    public static DeserializedContainerAbiStability valueOf(String str) {
        return (DeserializedContainerAbiStability) Enum.valueOf(DeserializedContainerAbiStability.class, str);
    }

    public static DeserializedContainerAbiStability[] values() {
        return (DeserializedContainerAbiStability[]) $VALUES.clone();
    }
}
