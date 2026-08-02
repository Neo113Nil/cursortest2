package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import defpackage.xka;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2 extends xka implements Function1<KotlinTypeRefiner, SimpleType> {
    final /* synthetic */ JavaTypeAttributes $attr;
    final /* synthetic */ ClassDescriptor $declaration;
    final /* synthetic */ SimpleType $type;
    final /* synthetic */ RawSubstitution this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2(ClassDescriptor classDescriptor, RawSubstitution rawSubstitution, SimpleType simpleType, JavaTypeAttributes javaTypeAttributes) {
        super(1);
        this.$declaration = classDescriptor;
        this.this$0 = rawSubstitution;
        this.$type = simpleType;
        this.$attr = javaTypeAttributes;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final SimpleType invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        ClassId classId;
        ClassDescriptor findClassAcrossModuleDependencies;
        Pair eraseInflexibleBasedOnClassDescriptor;
        kotlinTypeRefiner.getClass();
        ClassDescriptor classDescriptor = this.$declaration;
        if (classDescriptor == null) {
            classDescriptor = null;
        }
        if (classDescriptor == null || (classId = DescriptorUtilsKt.getClassId(classDescriptor)) == null || (findClassAcrossModuleDependencies = kotlinTypeRefiner.findClassAcrossModuleDependencies(classId)) == null || findClassAcrossModuleDependencies.equals(this.$declaration)) {
            return null;
        }
        eraseInflexibleBasedOnClassDescriptor = this.this$0.eraseInflexibleBasedOnClassDescriptor(this.$type, findClassAcrossModuleDependencies, this.$attr);
        return (SimpleType) eraseInflexibleBasedOnClassDescriptor.a;
    }
}
