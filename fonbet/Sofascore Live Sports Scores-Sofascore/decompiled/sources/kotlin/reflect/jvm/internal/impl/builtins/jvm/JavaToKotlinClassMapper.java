package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import defpackage.rm5;
import defpackage.sw9;
import defpackage.w9h;
import java.util.Collection;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JavaToKotlinClassMapper {

    @NotNull
    public static final JavaToKotlinClassMapper INSTANCE = new JavaToKotlinClassMapper();

    private JavaToKotlinClassMapper() {
    }

    public static /* synthetic */ ClassDescriptor mapJavaToKotlin$default(JavaToKotlinClassMapper javaToKotlinClassMapper, FqName fqName, KotlinBuiltIns kotlinBuiltIns, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return javaToKotlinClassMapper.mapJavaToKotlin(fqName, kotlinBuiltIns, num);
    }

    @NotNull
    public final ClassDescriptor convertMutableToReadOnly(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        FqName mutableToReadOnly = JavaToKotlinClassMap.INSTANCE.mutableToReadOnly(DescriptorUtils.getFqName(classDescriptor));
        if (mutableToReadOnly == null) {
            sw9.o(classDescriptor, " is not a mutable collection", "Given class ");
            return null;
        }
        ClassDescriptor builtInClassByFqName = DescriptorUtilsKt.getBuiltIns(classDescriptor).getBuiltInClassByFqName(mutableToReadOnly);
        builtInClassByFqName.getClass();
        return builtInClassByFqName;
    }

    @NotNull
    public final ClassDescriptor convertReadOnlyToMutable(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        FqName readOnlyToMutable = JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(DescriptorUtils.getFqName(classDescriptor));
        if (readOnlyToMutable == null) {
            sw9.o(classDescriptor, " is not a read-only collection", "Given class ");
            return null;
        }
        ClassDescriptor builtInClassByFqName = DescriptorUtilsKt.getBuiltIns(classDescriptor).getBuiltInClassByFqName(readOnlyToMutable);
        builtInClassByFqName.getClass();
        return builtInClassByFqName;
    }

    public final boolean isMutable(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        return JavaToKotlinClassMap.INSTANCE.isMutable(DescriptorUtils.getFqName(classDescriptor));
    }

    public final boolean isReadOnly(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        return JavaToKotlinClassMap.INSTANCE.isReadOnly(DescriptorUtils.getFqName(classDescriptor));
    }

    @Nullable
    public final ClassDescriptor mapJavaToKotlin(@NotNull FqName fqName, @NotNull KotlinBuiltIns kotlinBuiltIns, @Nullable Integer num) {
        fqName.getClass();
        kotlinBuiltIns.getClass();
        ClassId mapJavaToKotlin = (num == null || !Intrinsics.c(fqName, JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME())) ? JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(fqName) : StandardNames.getFunctionClassId(num.intValue());
        if (mapJavaToKotlin != null) {
            return kotlinBuiltIns.getBuiltInClassByFqName(mapJavaToKotlin.asSingleFqName());
        }
        return null;
    }

    @NotNull
    public final Collection<ClassDescriptor> mapPlatformClass(@NotNull FqName fqName, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        fqName.getClass();
        kotlinBuiltIns.getClass();
        ClassDescriptor mapJavaToKotlin$default = mapJavaToKotlin$default(this, fqName, kotlinBuiltIns, null, 4, null);
        if (mapJavaToKotlin$default == null) {
            return rm5.a;
        }
        FqName readOnlyToMutable = JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(DescriptorUtilsKt.getFqNameUnsafe(mapJavaToKotlin$default));
        if (readOnlyToMutable == null) {
            return w9h.b(mapJavaToKotlin$default);
        }
        ClassDescriptor builtInClassByFqName = kotlinBuiltIns.getBuiltInClassByFqName(readOnlyToMutable);
        builtInClassByFqName.getClass();
        return b.j(mapJavaToKotlin$default, builtInClassByFqName);
    }
}
