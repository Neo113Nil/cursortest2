package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class CompanionObjectMappingUtilsKt {
    public static final boolean isMappedIntrinsicCompanionObject(@NotNull CompanionObjectMapping companionObjectMapping, @NotNull ClassDescriptor classDescriptor) {
        companionObjectMapping.getClass();
        classDescriptor.getClass();
        if (!DescriptorUtils.isCompanionObject(classDescriptor)) {
            return false;
        }
        Set<ClassId> classIds = companionObjectMapping.getClassIds();
        ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
        return CollectionsKt.R(classIds, classId != null ? classId.getOuterClassId() : null);
    }
}
