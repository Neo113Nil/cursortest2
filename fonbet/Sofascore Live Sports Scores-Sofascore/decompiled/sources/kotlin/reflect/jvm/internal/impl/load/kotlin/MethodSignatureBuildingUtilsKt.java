package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class MethodSignatureBuildingUtilsKt {
    @NotNull
    public static final String signature(@NotNull SignatureBuildingComponents signatureBuildingComponents, @NotNull ClassDescriptor classDescriptor, @NotNull String str) {
        signatureBuildingComponents.getClass();
        classDescriptor.getClass();
        str.getClass();
        return signatureBuildingComponents.signature(MethodSignatureMappingKt.getInternalName(classDescriptor), str);
    }
}
