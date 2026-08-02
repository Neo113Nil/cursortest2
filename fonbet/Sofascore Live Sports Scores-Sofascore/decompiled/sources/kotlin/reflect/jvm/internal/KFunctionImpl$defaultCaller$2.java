package kotlin.reflect.jvm.internal;

import defpackage.k13;
import defpackage.xka;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.GenericDeclaration;
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
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Executable;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KFunctionImpl$defaultCaller$2 extends xka implements Function0<Caller<? extends Executable>> {
    final /* synthetic */ KFunctionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl$defaultCaller$2(KFunctionImpl kFunctionImpl) {
        super(0);
        this.this$0 = kFunctionImpl;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.lang.reflect.Member] */
    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Caller<Executable> invoke() {
        GenericDeclaration genericDeclaration;
        Caller caller;
        JvmFunctionSignature mapSignature = RuntimeTypeMapper.INSTANCE.mapSignature(this.this$0.getDescriptor());
        if (mapSignature instanceof JvmFunctionSignature.KotlinFunction) {
            FunctionDescriptor descriptor = this.this$0.getDescriptor();
            DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
            containingDeclaration.getClass();
            if (InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration) && (descriptor instanceof ConstructorDescriptor) && ((ConstructorDescriptor) descriptor).isPrimary()) {
                throw new KotlinReflectionInternalError(this.this$0.getDescriptor().getContainingDeclaration() + " cannot have default arguments");
            }
            KDeclarationContainerImpl container = this.this$0.getContainer();
            JvmFunctionSignature.KotlinFunction kotlinFunction = (JvmFunctionSignature.KotlinFunction) mapSignature;
            String methodName = kotlinFunction.getMethodName();
            String methodDesc = kotlinFunction.getMethodDesc();
            this.this$0.getCaller().mo884getMember().getClass();
            genericDeclaration = container.findDefaultMethod(methodName, methodDesc, !Modifier.isStatic(r5.getModifiers()));
        } else if (mapSignature instanceof JvmFunctionSignature.KotlinConstructor) {
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
                return new AnnotationConstructorCaller(jClass, arrayList, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
            }
            genericDeclaration = kFunctionImpl.getContainer().findDefaultConstructor(((JvmFunctionSignature.KotlinConstructor) mapSignature).getConstructorDesc());
        } else {
            if (mapSignature instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor) {
                List<Method> methods = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) mapSignature).getMethods();
                Class jClass2 = this.this$0.getContainer().getJClass();
                ArrayList arrayList2 = new ArrayList(k13.r(methods, 10));
                Iterator<T> it2 = methods.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new AnnotationConstructorCaller(jClass2, arrayList2, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.JAVA, methods);
            }
            genericDeclaration = null;
        }
        if (genericDeclaration instanceof Constructor) {
            KFunctionImpl kFunctionImpl2 = this.this$0;
            caller = kFunctionImpl2.createConstructorCaller((Constructor) genericDeclaration, kFunctionImpl2.getDescriptor(), true);
        } else if (genericDeclaration instanceof Method) {
            if (this.this$0.getDescriptor().getAnnotations().mo887findAnnotation(UtilKt.getJVM_STATIC()) != null) {
                DeclarationDescriptor containingDeclaration2 = this.this$0.getDescriptor().getContainingDeclaration();
                containingDeclaration2.getClass();
                if (!((ClassDescriptor) containingDeclaration2).isCompanionObject()) {
                    caller = this.this$0.createJvmStaticInObjectCaller((Method) genericDeclaration);
                }
            }
            caller = this.this$0.createStaticMethodCaller((Method) genericDeclaration);
        } else {
            caller = null;
        }
        if (caller != null) {
            return ValueClassAwareCallerKt.createValueClassAwareCallerIfNeeded(caller, this.this$0.getDescriptor(), true);
        }
        return null;
    }
}
