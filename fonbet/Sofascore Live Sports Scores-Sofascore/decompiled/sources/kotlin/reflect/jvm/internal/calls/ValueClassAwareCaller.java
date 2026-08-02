package kotlin.reflect.jvm.internal.calls;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.k13;
import defpackage.llf;
import defpackage.o13;
import defpackage.ph0;
import defpackage.v6a;
import defpackage.xbb;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002%&B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001bH\u0016¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001d¨\u0006'"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller;", PlayerKt.FOOTBALL_MIDFIELDER, "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "oldCaller", "isDefault", "", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "caller", "data", "Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$BoxUnboxData;", "hasMfvcParameters", "member", "getMember", "()Ljava/lang/reflect/Member;", "Ljava/lang/reflect/Member;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "slices", "", "Lkotlin/ranges/IntRange;", "[Lkotlin/ranges/IntRange;", NotificationCompat.CATEGORY_CALL, "", "args", "([Ljava/lang/Object;)Ljava/lang/Object;", "getRealSlicesOfParameters", "index", "", "BoxUnboxData", "MultiFieldValueClassPrimaryConstructorCaller", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ValueClassAwareCaller<M extends Member> implements Caller<M> {

    @NotNull
    private final Caller<M> caller;

    @NotNull
    private final BoxUnboxData data;
    private final boolean hasMfvcParameters;
    private final boolean isDefault;
    private final M member;

    @NotNull
    private final IntRange[] slices;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR!\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$BoxUnboxData;", "", "argumentRange", "Lkotlin/ranges/IntRange;", "unboxParameters", "", "", "Ljava/lang/reflect/Method;", "box", "(Lkotlin/ranges/IntRange;[Ljava/util/List;Ljava/lang/reflect/Method;)V", "getArgumentRange", "()Lkotlin/ranges/IntRange;", "getBox", "()Ljava/lang/reflect/Method;", "getUnboxParameters", "()[Ljava/util/List;", "[Ljava/util/List;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BoxUnboxData {

        @NotNull
        private final IntRange argumentRange;

        @Nullable
        private final Method box;

        @NotNull
        private final List<Method>[] unboxParameters;

        public BoxUnboxData(@NotNull IntRange intRange, @NotNull List<Method>[] listArr, @Nullable Method method) {
            intRange.getClass();
            listArr.getClass();
            this.argumentRange = intRange;
            this.unboxParameters = listArr;
            this.box = method;
        }

        @NotNull
        public final IntRange getArgumentRange() {
            return this.argumentRange;
        }

        @Nullable
        public final Method getBox() {
            return this.box;
        }

        @NotNull
        public final List<Method>[] getUnboxParameters() {
            return this.unboxParameters;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b6, code lost:
    
        if ((r12 instanceof kotlin.reflect.jvm.internal.calls.BoundCaller) != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ValueClassAwareCaller(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull Caller<? extends M> caller, boolean z) {
        Class inlineClass;
        List makeKotlinParameterTypes;
        int i;
        BoxUnboxData boxUnboxData;
        callableMemberDescriptor.getClass();
        caller.getClass();
        this.isDefault = z;
        boolean z2 = false;
        if (caller instanceof CallerImpl.Method.BoundStatic) {
            ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
            extensionReceiverParameter = extensionReceiverParameter == null ? callableMemberDescriptor.getDispatchReceiverParameter() : extensionReceiverParameter;
            KotlinType type = extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null;
            if (type != null && InlineClassesUtilsKt.needsMfvcFlattening(type)) {
                List<Method> mfvcUnboxMethods = ValueClassAwareCallerKt.getMfvcUnboxMethods(TypeSubstitutionKt.asSimpleType(type));
                mfvcUnboxMethods.getClass();
                ArrayList arrayList = new ArrayList(k13.r(mfvcUnboxMethods, 10));
                Iterator<T> it = mfvcUnboxMethods.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Method) it.next()).invoke(((CallerImpl.Method.BoundStatic) caller).getBoundReceiver(), null));
                }
                caller = new CallerImpl.Method.BoundStaticMultiFieldValueClass(((CallerImpl.Method.BoundStatic) caller).mo884getMember(), arrayList.toArray(new Object[0]));
            }
        }
        this.caller = (Caller<M>) caller;
        this.member = caller.mo884getMember();
        KotlinType returnType = callableMemberDescriptor.getReturnType();
        returnType.getClass();
        inlineClass = ValueClassAwareCallerKt.toInlineClass(returnType);
        Method boxMethod = inlineClass != null ? ValueClassAwareCallerKt.getBoxMethod(inlineClass, callableMemberDescriptor) : null;
        if (InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfValueClass(callableMemberDescriptor)) {
            IntRange.e.getClass();
            boxUnboxData = new BoxUnboxData(IntRange.f, new List[0], boxMethod);
        } else {
            int i2 = -1;
            if (!(caller instanceof CallerImpl.Method.BoundStatic) && !(caller instanceof CallerImpl.Method.BoundStaticMultiFieldValueClass)) {
                if (!(callableMemberDescriptor instanceof ConstructorDescriptor)) {
                    if (callableMemberDescriptor.getDispatchReceiverParameter() != null && !(caller instanceof BoundCaller)) {
                        DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
                        containingDeclaration.getClass();
                        if (!InlineClassesUtilsKt.isValueClass(containingDeclaration)) {
                            i2 = 1;
                        }
                    }
                    i2 = 0;
                }
            }
            int i3 = caller instanceof CallerImpl.Method.BoundStaticMultiFieldValueClass ? -((CallerImpl.Method.BoundStaticMultiFieldValueClass) caller).getReceiverComponentsCount() : i2;
            makeKotlinParameterTypes = ValueClassAwareCallerKt.makeKotlinParameterTypes(callableMemberDescriptor, ValueClassAwareCaller$data$1$kotlinParameterTypes$1.INSTANCE);
            if (this.isDefault) {
                Iterator it2 = makeKotlinParameterTypes.iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    i4 += data$lambda$2$typeSize((KotlinType) it2.next());
                }
                i = ((i4 + 31) / 32) + 1;
            } else {
                i = 0;
            }
            int i5 = i + (((callableMemberDescriptor instanceof FunctionDescriptor) && ((FunctionDescriptor) callableMemberDescriptor).isSuspend()) ? 1 : 0);
            Iterator it3 = makeKotlinParameterTypes.iterator();
            int i6 = 0;
            while (it3.hasNext()) {
                i6 += data$lambda$2$typeSize((KotlinType) it3.next());
            }
            int i7 = i6 + i3 + i5;
            ValueClassAwareCallerKt.checkParametersSize(this, i7, callableMemberDescriptor, this.isDefault);
            IntRange j = llf.j(Math.max(i2, 0), makeKotlinParameterTypes.size() + i2);
            List[] listArr = new List[i7];
            int i8 = 0;
            while (i8 < i7) {
                listArr[i8] = (i8 > j.b || j.a > i8) ? null : ValueClassAwareCallerKt.getValueClassUnboxMethods(TypeSubstitutionKt.asSimpleType((KotlinType) makeKotlinParameterTypes.get(i8 - i2)), callableMemberDescriptor);
                i8++;
            }
            boxUnboxData = new BoxUnboxData(j, listArr, boxMethod);
        }
        this.data = boxUnboxData;
        xbb b = a.b();
        Caller<M> caller2 = this.caller;
        int length = caller2 instanceof CallerImpl.Method.BoundStaticMultiFieldValueClass ? ((CallerImpl.Method.BoundStaticMultiFieldValueClass) caller2).getBoundReceiverComponents().length : caller2 instanceof CallerImpl.Method.BoundStatic ? 1 : 0;
        if (length > 0) {
            b.add(llf.j(0, length));
        }
        List<Method>[] unboxParameters = boxUnboxData.getUnboxParameters();
        int length2 = unboxParameters.length;
        int i9 = 0;
        while (i9 < length2) {
            List<Method> list = unboxParameters[i9];
            int size = (list != null ? list.size() : 1) + length;
            b.add(llf.j(length, size));
            i9++;
            length = size;
        }
        this.slices = (IntRange[]) a.a(b).toArray(new IntRange[0]);
        Iterable argumentRange = this.data.getArgumentRange();
        if (!(argumentRange instanceof Collection) || !((Collection) argumentRange).isEmpty()) {
            v6a it4 = argumentRange.iterator();
            while (true) {
                if (!it4.c) {
                    break;
                }
                List<Method> list2 = this.data.getUnboxParameters()[it4.nextInt()];
                if (list2 != null && list2.size() > 1) {
                    z2 = true;
                    break;
                }
            }
        }
        this.hasMfvcParameters = z2;
    }

    private static final int data$lambda$2$typeSize(KotlinType kotlinType) {
        List<Method> mfvcUnboxMethods = ValueClassAwareCallerKt.getMfvcUnboxMethods(TypeSubstitutionKt.asSimpleType(kotlinType));
        if (mfvcUnboxMethods != null) {
            return mfvcUnboxMethods.size();
        }
        return 1;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @Nullable
    public Object call(@NotNull Object[] args) {
        Object invoke;
        Object obj;
        Object defaultPrimitiveValue;
        args.getClass();
        IntRange argumentRange = this.data.getArgumentRange();
        List<Method>[] unboxParameters = this.data.getUnboxParameters();
        Method box = this.data.getBox();
        boolean isEmpty = argumentRange.isEmpty();
        int i = argumentRange.b;
        int i2 = argumentRange.a;
        if (!isEmpty) {
            if (this.hasMfvcParameters) {
                xbb xbbVar = new xbb(args.length);
                for (int i3 = 0; i3 < i2; i3++) {
                    xbbVar.add(args[i3]);
                }
                if (i2 <= i) {
                    while (true) {
                        List<Method> list = unboxParameters[i2];
                        Object obj2 = args[i2];
                        if (list != null) {
                            for (Method method : list) {
                                if (obj2 != null) {
                                    defaultPrimitiveValue = method.invoke(obj2, null);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    returnType.getClass();
                                    defaultPrimitiveValue = UtilKt.defaultPrimitiveValue(returnType);
                                }
                                xbbVar.add(defaultPrimitiveValue);
                            }
                        } else {
                            xbbVar.add(obj2);
                        }
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                int i4 = i + 1;
                int length = args.length - 1;
                if (i4 <= length) {
                    while (true) {
                        xbbVar.add(args[i4]);
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
                args = a.a(xbbVar).toArray(new Object[0]);
            } else {
                int length2 = args.length;
                Object[] objArr = new Object[length2];
                for (int i5 = 0; i5 < length2; i5++) {
                    if (i5 > i || i2 > i5) {
                        obj = args[i5];
                    } else {
                        List<Method> list2 = unboxParameters[i5];
                        Method method2 = list2 != null ? (Method) CollectionsKt.D0(list2) : null;
                        obj = args[i5];
                        if (method2 != null) {
                            if (obj != null) {
                                obj = method2.invoke(obj, null);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                returnType2.getClass();
                                obj = UtilKt.defaultPrimitiveValue(returnType2);
                            }
                        }
                    }
                    objArr[i5] = obj;
                }
                args = objArr;
            }
        }
        Object call = this.caller.call(args);
        return (box == null || (invoke = box.invoke(null, call)) == null) ? call : invoke;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* renamed from: getMember */
    public M mo884getMember() {
        return this.member;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public List<Type> getParameterTypes() {
        return this.caller.getParameterTypes();
    }

    @NotNull
    public final IntRange getRealSlicesOfParameters(int index) {
        if (index >= 0) {
            IntRange[] intRangeArr = this.slices;
            if (index < intRangeArr.length) {
                return intRangeArr[index];
            }
        }
        IntRange[] intRangeArr2 = this.slices;
        if (intRangeArr2.length == 0) {
            return new IntRange(index, index, 1);
        }
        int length = ((IntRange) ph0.M(intRangeArr2)).b + 1 + (index - intRangeArr2.length);
        return new IntRange(length, length, 1);
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public Type getReturnType() {
        return this.caller.getReturnType();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030!H\u0016¢\u0006\u0002\u0010\"R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0013\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\n0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "constructorDesc", "", "originalParameters", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/util/List;)V", "boxMethod", "Ljava/lang/reflect/Method;", "constructorImpl", "member", "getMember", "()Ljava/lang/Void;", "originalParametersGroups", "Ljava/lang/Class;", "getOriginalParametersGroups", "()Ljava/util/List;", "parameterTypes", "Ljava/lang/reflect/Type;", "getParameterTypes", "parameterUnboxMethods", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MultiFieldValueClassPrimaryConstructorCaller implements Caller {

        @NotNull
        private final Method boxMethod;

        @NotNull
        private final Method constructorImpl;

        @NotNull
        private final List<List<Class<?>>> originalParametersGroups;

        @NotNull
        private final List<Type> parameterTypes;

        @NotNull
        private final List<List<Method>> parameterUnboxMethods;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList] */
        public MultiFieldValueClassPrimaryConstructorCaller(@NotNull FunctionDescriptor functionDescriptor, @NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull String str, @NotNull List<? extends ParameterDescriptor> list) {
            ?? c;
            List valueClassUnboxMethods;
            functionDescriptor.getClass();
            kDeclarationContainerImpl.getClass();
            str.getClass();
            list.getClass();
            Method findMethodBySignature = kDeclarationContainerImpl.findMethodBySignature("constructor-impl", str);
            findMethodBySignature.getClass();
            this.constructorImpl = findMethodBySignature;
            Method findMethodBySignature2 = kDeclarationContainerImpl.findMethodBySignature("box-impl", StringsKt.W(str, "V") + ReflectClassUtilKt.getDesc(kDeclarationContainerImpl.getJClass()));
            findMethodBySignature2.getClass();
            this.boxMethod = findMethodBySignature2;
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                KotlinType type = ((ParameterDescriptor) it.next()).getType();
                type.getClass();
                valueClassUnboxMethods = ValueClassAwareCallerKt.getValueClassUnboxMethods(TypeSubstitutionKt.asSimpleType(type), functionDescriptor);
                arrayList.add(valueClassUnboxMethods);
            }
            this.parameterUnboxMethods = arrayList;
            ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                ClassifierDescriptor mo893getDeclarationDescriptor = ((ParameterDescriptor) obj).getType().getConstructor().mo893getDeclarationDescriptor();
                mo893getDeclarationDescriptor.getClass();
                ClassDescriptor classDescriptor = (ClassDescriptor) mo893getDeclarationDescriptor;
                List<Method> list2 = this.parameterUnboxMethods.get(i);
                if (list2 != null) {
                    c = new ArrayList(k13.r(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        c.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class<?> javaClass = UtilKt.toJavaClass(classDescriptor);
                    javaClass.getClass();
                    c = a.c(javaClass);
                }
                arrayList2.add(c);
                i = i2;
            }
            this.originalParametersGroups = arrayList2;
            this.parameterTypes = k13.s(arrayList2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            ?? c;
            args.getClass();
            ArrayList b0 = ph0.b0(args, this.parameterUnboxMethods);
            ArrayList arrayList = new ArrayList();
            Iterator it = b0.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = pair.a;
                List list = (List) pair.b;
                if (list != null) {
                    c = new ArrayList(k13.r(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        c.add(((Method) it2.next()).invoke(obj, null));
                    }
                } else {
                    c = a.c(obj);
                }
                o13.v(c, arrayList);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.constructorImpl.invoke(null, Arrays.copyOf(array, array.length));
            return this.boxMethod.invoke(null, Arrays.copyOf(array, array.length));
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        /* renamed from: getMember */
        public /* bridge */ /* synthetic */ Member mo884getMember() {
            return (Member) getMember();
        }

        @NotNull
        public final List<List<Class<?>>> getOriginalParametersGroups() {
            return this.originalParametersGroups;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @NotNull
        public List<Type> getParameterTypes() {
            return this.parameterTypes;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @NotNull
        public Type getReturnType() {
            Class<?> returnType = this.boxMethod.getReturnType();
            returnType.getClass();
            return returnType;
        }

        @Nullable
        public Void getMember() {
            return null;
        }
    }
}
