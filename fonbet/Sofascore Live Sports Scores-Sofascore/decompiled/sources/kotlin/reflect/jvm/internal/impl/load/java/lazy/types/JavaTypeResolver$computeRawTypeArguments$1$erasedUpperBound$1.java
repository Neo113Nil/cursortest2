package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1 extends xka implements Function0<KotlinType> {
    final /* synthetic */ JavaTypeAttributes $attr;
    final /* synthetic */ TypeConstructor $constructor;
    final /* synthetic */ JavaClassifierType $javaType;
    final /* synthetic */ TypeParameterDescriptor $parameter;
    final /* synthetic */ JavaTypeResolver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1(JavaTypeResolver javaTypeResolver, TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor, JavaClassifierType javaClassifierType) {
        super(0);
        this.this$0 = javaTypeResolver;
        this.$parameter = typeParameterDescriptor;
        this.$attr = javaTypeAttributes;
        this.$constructor = typeConstructor;
        this.$javaType = javaClassifierType;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final KotlinType invoke() {
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser;
        typeParameterUpperBoundEraser = this.this$0.typeParameterUpperBoundEraser;
        TypeParameterDescriptor typeParameterDescriptor = this.$parameter;
        JavaTypeAttributes javaTypeAttributes = this.$attr;
        ClassifierDescriptor mo893getDeclarationDescriptor = this.$constructor.mo893getDeclarationDescriptor();
        return typeParameterUpperBoundEraser.getErasedUpperBound(typeParameterDescriptor, javaTypeAttributes.withDefaultType(mo893getDeclarationDescriptor != null ? mo893getDeclarationDescriptor.getDefaultType() : null).markIsRaw(this.$javaType.isRaw()));
    }
}
