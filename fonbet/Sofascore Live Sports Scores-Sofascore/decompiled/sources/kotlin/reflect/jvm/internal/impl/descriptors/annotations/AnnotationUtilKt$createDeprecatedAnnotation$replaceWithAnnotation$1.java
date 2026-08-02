package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1 extends xka implements Function1<ModuleDescriptor, KotlinType> {
    final /* synthetic */ KotlinBuiltIns $this_createDeprecatedAnnotation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1(KotlinBuiltIns kotlinBuiltIns) {
        super(1);
        this.$this_createDeprecatedAnnotation = kotlinBuiltIns;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final KotlinType invoke(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        SimpleType arrayType = moduleDescriptor.getBuiltIns().getArrayType(Variance.INVARIANT, this.$this_createDeprecatedAnnotation.getStringType());
        arrayType.getClass();
        return arrayType;
    }
}
