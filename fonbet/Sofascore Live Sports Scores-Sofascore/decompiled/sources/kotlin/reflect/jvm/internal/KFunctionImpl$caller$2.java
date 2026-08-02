package kotlin.reflect.jvm.internal;

import defpackage.k13;
import defpackage.xka;
import defpackage.zzl;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Executable;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KFunctionImpl$caller$2 extends xka implements Function0<Caller<? extends Executable>> {
    final /* synthetic */ KFunctionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl$caller$2(KFunctionImpl kFunctionImpl) {
        super(0);
        this.this$0 = kFunctionImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Caller<Executable> invoke() {
        Object constructor;
        Caller createJvmStaticInObjectCaller;
        JvmFunctionSignature mapSignature = RuntimeTypeMapper.INSTANCE.mapSignature(this.this$0.getDescriptor());
        if (mapSignature instanceof JvmFunctionSignature.KotlinConstructor) {
            boolean isAnnotationConstructor = this.this$0.isAnnotationConstructor();
            KFunctionImpl kFunctionImpl = this.this$0;
            if (isAnnotationConstructor) {
                Class jClass = kFunctionImpl.getContainer().getJClass();
                List<KParameter> parameters = this.this$0.getParameters();
                ArrayList arrayList = new ArrayList(k13.r(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((KParameter) it.next()).getName();
                    name.getClass();
                    arrayList.add(name);
                }
                return new AnnotationConstructorCaller(jClass, arrayList, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
            }
            constructor = kFunctionImpl.getContainer().findConstructorBySignature(((JvmFunctionSignature.KotlinConstructor) mapSignature).getConstructorDesc());
        } else if (mapSignature instanceof JvmFunctionSignature.KotlinFunction) {
            FunctionDescriptor descriptor = this.this$0.getDescriptor();
            DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
            containingDeclaration.getClass();
            if (InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration) && (descriptor instanceof ConstructorDescriptor) && ((ConstructorDescriptor) descriptor).isPrimary()) {
                FunctionDescriptor descriptor2 = this.this$0.getDescriptor();
                KDeclarationContainerImpl container = this.this$0.getContainer();
                String methodDesc = ((JvmFunctionSignature.KotlinFunction) mapSignature).getMethodDesc();
                List<ValueParameterDescriptor> valueParameters = this.this$0.getDescriptor().getValueParameters();
                valueParameters.getClass();
                return new ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller(descriptor2, container, methodDesc, valueParameters);
            }
            JvmFunctionSignature.KotlinFunction kotlinFunction = (JvmFunctionSignature.KotlinFunction) mapSignature;
            constructor = this.this$0.getContainer().findMethodBySignature(kotlinFunction.getMethodName(), kotlinFunction.getMethodDesc());
        } else if (mapSignature instanceof JvmFunctionSignature.JavaMethod) {
            constructor = ((JvmFunctionSignature.JavaMethod) mapSignature).getMethod();
        } else {
            if (!(mapSignature instanceof JvmFunctionSignature.JavaConstructor)) {
                if (!(mapSignature instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor)) {
                    zzl.b();
                    return null;
                }
                List<Method> methods = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) mapSignature).getMethods();
                Class jClass2 = this.this$0.getContainer().getJClass();
                ArrayList arrayList2 = new ArrayList(k13.r(methods, 10));
                Iterator<T> it2 = methods.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new AnnotationConstructorCaller(jClass2, arrayList2, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.JAVA, methods);
            }
            constructor = ((JvmFunctionSignature.JavaConstructor) mapSignature).getConstructor();
        }
        if (constructor instanceof Constructor) {
            KFunctionImpl kFunctionImpl2 = this.this$0;
            createJvmStaticInObjectCaller = kFunctionImpl2.createConstructorCaller((Constructor) constructor, kFunctionImpl2.getDescriptor(), false);
        } else {
            if (!(constructor instanceof Method)) {
                throw new KotlinReflectionInternalError("Could not compute caller for function: " + this.this$0.getDescriptor() + " (member = " + constructor + ')');
            }
            Method method = (Method) constructor;
            boolean isStatic = Modifier.isStatic(method.getModifiers());
            KFunctionImpl kFunctionImpl3 = this.this$0;
            if (isStatic) {
                AnnotationDescriptor mo887findAnnotation = kFunctionImpl3.getDescriptor().getAnnotations().mo887findAnnotation(UtilKt.getJVM_STATIC());
                KFunctionImpl kFunctionImpl4 = this.this$0;
                createJvmStaticInObjectCaller = mo887findAnnotation != null ? kFunctionImpl4.createJvmStaticInObjectCaller(method) : kFunctionImpl4.createStaticMethodCaller(method);
            } else {
                createJvmStaticInObjectCaller = kFunctionImpl3.createInstanceMethodCaller(method);
            }
        }
        return ValueClassAwareCallerKt.createValueClassAwareCallerIfNeeded$default(createJvmStaticInObjectCaller, this.this$0.getDescriptor(), false, 2, null);
    }
}
