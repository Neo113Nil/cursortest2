package kotlin.reflect.jvm.internal;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.a70;
import defpackage.is8;
import defpackage.joa;
import defpackage.k13;
import defpackage.ph0;
import defpackage.pvd;
import defpackage.rq3;
import defpackage.sha;
import defpackage.sw9;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00028\u00002\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0012J3\u0010!\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f2\f\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 R.\u0010&\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020$ %*\n\u0012\u0004\u0012\u00020$\u0018\u00010#0#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'RD\u0010*\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\n %*\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010(j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`)0(j\b\u0012\u0004\u0012\u00020\n`)0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\"\u0010,\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010+0+0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010'R.\u0010.\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020- %*\n\u0012\u0004\u0012\u00020-\u0018\u00010#0#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010'R2\u0010/\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 %*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00060\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010'R\u001a\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0006\u0012\u0002\b\u0003048&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0002\b\u0003\u0018\u0001048&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020$0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010AR\u0014\u0010G\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020H0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010AR\u0016\u0010N\u001a\u0004\u0018\u00010K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010O\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010?R\u0014\u0010P\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010?R\u0014\u0010Q\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010?R\u0014\u0010R\u001a\u0002018DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bR\u0010?R\u0014\u0010V\u001a\u00020S8&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", PlayerKt.ICE_HOCKEY_RIGHT_WING, "Lkotlin/reflect/KCallable;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "<init>", "()V", "", "", "getAbsentArguments", "()[Ljava/lang/Object;", "Lkotlin/reflect/KParameter;", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "", "getParameterTypeSize", "(Lkotlin/reflect/KParameter;)I", "", "args", "callAnnotationConstructor", "(Ljava/util/Map;)Ljava/lang/Object;", "Lkotlin/reflect/KType;", "type", "defaultEmptyArray", "(Lkotlin/reflect/KType;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "extractContinuationArgument", "()Ljava/lang/reflect/Type;", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "callBy", "Lrq3;", "continuationArgument", "callDefaultMethod$kotlin_reflection", "(Ljava/util/Map;Lrq3;)Ljava/lang/Object;", "callDefaultMethod", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "", "", "kotlin.jvm.PlatformType", "_annotations", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "_parameters", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "_returnType", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "_typeParameters", "_absentArguments", "Ljoa;", "", "parametersNeedMFVCFlattening", "Ljoa;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "getDefaultCaller", "defaultCaller", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "isBound", "()Z", "getAnnotations", "()Ljava/util/List;", "annotations", "getParameters", "parameters", "getReturnType", "()Lkotlin/reflect/KType;", "returnType", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "visibility", "isFinal", "isOpen", "isAbstract", "isAnnotationConstructor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class KCallableImpl<R> implements KCallable<R>, KTypeParameterOwnerImpl {

    @NotNull
    private final ReflectProperties.LazySoftVal<Object[]> _absentArguments;

    @NotNull
    private final ReflectProperties.LazySoftVal<List<Annotation>> _annotations;

    @NotNull
    private final ReflectProperties.LazySoftVal<ArrayList<KParameter>> _parameters;

    @NotNull
    private final ReflectProperties.LazySoftVal<KTypeImpl> _returnType;

    @NotNull
    private final ReflectProperties.LazySoftVal<List<KTypeParameterImpl>> _typeParameters;

    @NotNull
    private final joa parametersNeedMFVCFlattening;

    public KCallableImpl() {
        ReflectProperties.LazySoftVal<List<Annotation>> lazySoft = ReflectProperties.lazySoft(new KCallableImpl$_annotations$1(this));
        lazySoft.getClass();
        this._annotations = lazySoft;
        ReflectProperties.LazySoftVal<ArrayList<KParameter>> lazySoft2 = ReflectProperties.lazySoft(new KCallableImpl$_parameters$1(this));
        lazySoft2.getClass();
        this._parameters = lazySoft2;
        ReflectProperties.LazySoftVal<KTypeImpl> lazySoft3 = ReflectProperties.lazySoft(new KCallableImpl$_returnType$1(this));
        lazySoft3.getClass();
        this._returnType = lazySoft3;
        ReflectProperties.LazySoftVal<List<KTypeParameterImpl>> lazySoft4 = ReflectProperties.lazySoft(new KCallableImpl$_typeParameters$1(this));
        lazySoft4.getClass();
        this._typeParameters = lazySoft4;
        ReflectProperties.LazySoftVal<Object[]> lazySoft5 = ReflectProperties.lazySoft(new KCallableImpl$_absentArguments$1(this));
        lazySoft5.getClass();
        this._absentArguments = lazySoft5;
        this.parametersNeedMFVCFlattening = ypa.a(ysa.b, new KCallableImpl$parametersNeedMFVCFlattening$1(this));
    }

    private final R callAnnotationConstructor(Map<KParameter, ? extends Object> args) {
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(k13.r(parameters, 10));
        Iterator<T> it = parameters.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                Caller<?> defaultCaller = getDefaultCaller();
                if (defaultCaller == null) {
                    sw9.s(getDescriptor(), "This callable does not support a default call: ");
                    return null;
                }
                try {
                    return (R) defaultCaller.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e) {
                    throw new IllegalCallableAccessException(e);
                }
            }
            KParameter kParameter = (KParameter) it.next();
            if (args.containsKey(kParameter)) {
                Object obj2 = args.get(kParameter);
                if (obj2 == null) {
                    pvd.k(41, kParameter, "Annotation argument value cannot be null (");
                    return null;
                }
                obj = obj2;
            } else if (kParameter.isOptional()) {
                continue;
            } else {
                if (!kParameter.isVararg()) {
                    is8.c(kParameter, "No argument provided for a required parameter: ");
                    return null;
                }
                obj = defaultEmptyArray(kParameter.getType());
            }
            arrayList.add(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object defaultEmptyArray(KType type) {
        Class x = sha.x(KTypesJvm.getJvmErasure(type));
        if (x.isArray()) {
            Object newInstance = Array.newInstance(x.getComponentType(), 0);
            newInstance.getClass();
            return newInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + x.getSimpleName() + ", because it is not an array type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Type extractContinuationArgument() {
        Type[] lowerBounds;
        if (isSuspend()) {
            Object j0 = CollectionsKt.j0(getCaller().getParameterTypes());
            ParameterizedType parameterizedType = j0 instanceof ParameterizedType ? (ParameterizedType) j0 : null;
            if (Intrinsics.c(parameterizedType != null ? parameterizedType.getRawType() : null, rq3.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                actualTypeArguments.getClass();
                Object Q = ph0.Q(actualTypeArguments);
                WildcardType wildcardType = Q instanceof WildcardType ? (WildcardType) Q : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) ph0.z(lowerBounds);
                }
            }
        }
        return null;
    }

    private final Object[] getAbsentArguments() {
        return (Object[]) this._absentArguments.invoke().clone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getParameterTypeSize(KParameter parameter) {
        if (!((Boolean) this.parametersNeedMFVCFlattening.getValue()).booleanValue()) {
            a70.p("Check if parametersNeedMFVCFlattening is true before");
            return 0;
        }
        if (!UtilKt.getNeedsMultiFieldValueClassFlattening(parameter.getType())) {
            return 1;
        }
        KType type = parameter.getType();
        type.getClass();
        List<Method> mfvcUnboxMethods = ValueClassAwareCallerKt.getMfvcUnboxMethods(TypeSubstitutionKt.asSimpleType(((KTypeImpl) type).getType()));
        mfvcUnboxMethods.getClass();
        return mfvcUnboxMethods.size();
    }

    @Override // kotlin.reflect.KCallable
    public R call(@NotNull Object... args) {
        args.getClass();
        try {
            return (R) getCaller().call(args);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    @Override // kotlin.reflect.KCallable
    public R callBy(@NotNull Map<KParameter, ? extends Object> args) {
        args.getClass();
        return isAnnotationConstructor() ? callAnnotationConstructor(args) : callDefaultMethod$kotlin_reflection(args, null);
    }

    public final R callDefaultMethod$kotlin_reflection(@NotNull Map<KParameter, ? extends Object> args, @Nullable rq3<?> continuationArgument) {
        args.getClass();
        List<KParameter> parameters = getParameters();
        boolean z = false;
        if (parameters.isEmpty()) {
            try {
                return (R) getCaller().call(isSuspend() ? new rq3[]{continuationArgument} : new rq3[0]);
            } catch (IllegalAccessException e) {
                throw new IllegalCallableAccessException(e);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters.size();
        Object[] absentArguments = getAbsentArguments();
        if (isSuspend()) {
            absentArguments[parameters.size()] = continuationArgument;
        }
        boolean booleanValue = ((Boolean) this.parametersNeedMFVCFlattening.getValue()).booleanValue();
        int i = 0;
        for (KParameter kParameter : parameters) {
            int parameterTypeSize = booleanValue ? getParameterTypeSize(kParameter) : 1;
            if (args.containsKey(kParameter)) {
                absentArguments[kParameter.getIndex()] = args.get(kParameter);
            } else if (kParameter.isOptional()) {
                if (booleanValue) {
                    int i2 = i + parameterTypeSize;
                    for (int i3 = i; i3 < i2; i3++) {
                        int i4 = (i3 / 32) + size;
                        Object obj = absentArguments[i4];
                        obj.getClass();
                        absentArguments[i4] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i3 % 32)));
                    }
                } else {
                    int i5 = (i / 32) + size;
                    Object obj2 = absentArguments[i5];
                    obj2.getClass();
                    absentArguments[i5] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i % 32)));
                }
                z = true;
            } else if (!kParameter.isVararg()) {
                is8.c(kParameter, "No argument provided for a required parameter: ");
                return null;
            }
            if (kParameter.getKind() == KParameter.Kind.VALUE) {
                i += parameterTypeSize;
            }
        }
        if (!z) {
            try {
                return (R) getCaller().call(Arrays.copyOf(absentArguments, size));
            } catch (IllegalAccessException e2) {
                throw new IllegalCallableAccessException(e2);
            }
        }
        Caller<?> defaultCaller = getDefaultCaller();
        if (defaultCaller == null) {
            sw9.s(getDescriptor(), "This callable does not support a default call: ");
            return null;
        }
        try {
            return (R) defaultCaller.call(absentArguments);
        } catch (IllegalAccessException e3) {
            throw new IllegalCallableAccessException(e3);
        }
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        List<Annotation> invoke = this._annotations.invoke();
        invoke.getClass();
        return invoke;
    }

    @NotNull
    public abstract Caller<?> getCaller();

    @NotNull
    public abstract KDeclarationContainerImpl getContainer();

    @Nullable
    public abstract Caller<?> getDefaultCaller();

    @NotNull
    public abstract CallableMemberDescriptor getDescriptor();

    @Override // kotlin.reflect.KCallable
    @NotNull
    public List<KParameter> getParameters() {
        ArrayList<KParameter> invoke = this._parameters.invoke();
        invoke.getClass();
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public KType getReturnType() {
        KTypeImpl invoke = this._returnType.invoke();
        invoke.getClass();
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        List<KTypeParameterImpl> invoke = this._typeParameters.invoke();
        invoke.getClass();
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    @Nullable
    public KVisibility getVisibility() {
        DescriptorVisibility visibility = getDescriptor().getVisibility();
        visibility.getClass();
        return UtilKt.toKVisibility(visibility);
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return getDescriptor().getModality() == Modality.ABSTRACT;
    }

    public final boolean isAnnotationConstructor() {
        return Intrinsics.c(getName(), "<init>") && getContainer().getJClass().isAnnotation();
    }

    public abstract boolean isBound();

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        return getDescriptor().getModality() == Modality.FINAL;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return getDescriptor().getModality() == Modality.OPEN;
    }
}
