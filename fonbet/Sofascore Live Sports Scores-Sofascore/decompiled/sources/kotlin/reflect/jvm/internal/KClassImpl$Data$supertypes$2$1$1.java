package kotlin.reflect.jvm.internal;

import defpackage.ph0;
import defpackage.sw9;
import defpackage.xka;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KClassImpl$Data$supertypes$2$1$1 extends xka implements Function0<Type> {
    final /* synthetic */ KotlinType $kotlinType;
    final /* synthetic */ KClassImpl<T>.Data this$0;
    final /* synthetic */ KClassImpl<T> this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$supertypes$2$1$1(KotlinType kotlinType, KClassImpl<T>.Data data, KClassImpl<T> kClassImpl) {
        super(0);
        this.$kotlinType = kotlinType;
        this.this$0 = data;
        this.this$1 = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Type invoke() {
        ClassifierDescriptor mo893getDeclarationDescriptor = this.$kotlinType.getConstructor().mo893getDeclarationDescriptor();
        if (!(mo893getDeclarationDescriptor instanceof ClassDescriptor)) {
            sw9.u(mo893getDeclarationDescriptor, "Supertype not a class: ");
            return null;
        }
        Class<?> javaClass = UtilKt.toJavaClass((ClassDescriptor) mo893getDeclarationDescriptor);
        if (javaClass == null) {
            throw new KotlinReflectionInternalError("Unsupported superclass of " + this.this$0 + ": " + mo893getDeclarationDescriptor);
        }
        boolean c = Intrinsics.c(this.this$1.getJClass().getSuperclass(), javaClass);
        KDeclarationContainerImpl kDeclarationContainerImpl = this.this$1;
        if (c) {
            Type genericSuperclass = kDeclarationContainerImpl.getJClass().getGenericSuperclass();
            genericSuperclass.getClass();
            return genericSuperclass;
        }
        Class<?>[] interfaces = kDeclarationContainerImpl.getJClass().getInterfaces();
        interfaces.getClass();
        int G = ph0.G(javaClass, interfaces);
        if (G >= 0) {
            Type type = this.this$1.getJClass().getGenericInterfaces()[G];
            type.getClass();
            return type;
        }
        throw new KotlinReflectionInternalError("No superclass of " + this.this$0 + " in Java reflection for " + mo893getDeclarationDescriptor);
    }
}
