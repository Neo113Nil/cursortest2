package kotlin.reflect;

import defpackage.a70;
import defpackage.e5h;
import defpackage.i5h;
import defpackage.is8;
import defpackage.k13;
import defpackage.kia;
import defpackage.l5k;
import defpackage.ogj;
import defpackage.sha;
import defpackage.zzl;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001c\u0010\f\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0083\u0080\u0004b\u0002\b\n\u001a(\u0010\u000f\u001a\u00020\u00012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0083\u0080\u0004b\u0002\b\n\u001a\u0012\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0001H\u0082\u0080\u0004\"5\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0084\br\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tr\u0002\b\nr\u0002\b\u000b¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"#\u0010\u0000\u001a\u00020\u0001*\u00020\u00148BX\u0083\u0084\br\u0002\b\n¢\u0006\f\u0012\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u001a"}, d2 = {"javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "Lkotlin/SinceKotlin;", "version", "1.4", "Lkotlin/ExperimentalStdlibApi;", "Lkotlin/internal/LowPriorityInOverloadResolution;", "computeJavaType", "forceWrapper", "", "createPossiblyInnerType", "jClass", "Ljava/lang/Class;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "(Lkotlin/reflect/KTypeProjection;)V", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "typeToString", "", "type", "kotlin-stdlib"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TypesJVMKt {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type computeJavaType(KType kType, boolean z) {
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KTypeParameter) {
            if (!(classifier instanceof l5k)) {
                return new ObsoleteFallbackTypeVariableImpl((KTypeParameter) classifier);
            }
            l5k l5kVar = (l5k) classifier;
            GenericDeclaration genericDeclaration = (GenericDeclaration) l5kVar.b.getValue();
            if (genericDeclaration == null) {
                ogj.i(kType, "javaType is not supported for this type: ");
                return null;
            }
            TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
            typeParameters.getClass();
            TypeVariable<?> typeVariable = null;
            boolean z2 = false;
            for (TypeVariable<?> typeVariable2 : typeParameters) {
                if (Intrinsics.c(typeVariable2.getName(), l5kVar.c)) {
                    if (z2) {
                        a70.p("Array contains more than one matching element.");
                        return null;
                    }
                    z2 = true;
                    typeVariable = typeVariable2;
                }
            }
            if (z2) {
                typeVariable.getClass();
                return typeVariable;
            }
            ogj.m("Array contains no element matching the predicate.");
            return null;
        }
        if (!(classifier instanceof KClass)) {
            ogj.i(kType, "Unsupported type classifier: ");
            return null;
        }
        KClass kClass = (KClass) classifier;
        Class y = z ? sha.y(kClass) : sha.x(kClass);
        List<KTypeProjection> arguments = kType.getArguments();
        if (arguments.isEmpty()) {
            return y;
        }
        if (!y.isArray()) {
            return createPossiblyInnerType(y, arguments);
        }
        if (y.getComponentType().isPrimitive()) {
            return y;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.F0(arguments);
        if (kTypeProjection == null) {
            is8.c(kType, "kotlin.Array must have exactly one type argument: ");
            return null;
        }
        KVariance variance = kTypeProjection.getVariance();
        KType type = kTypeProjection.getType();
        int i = variance == null ? -1 : WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i == -1 || i == 1) {
            return y;
        }
        if (i != 2 && i != 3) {
            zzl.b();
            return null;
        }
        type.getClass();
        Type computeJavaType$default = computeJavaType$default(type, false, 1, null);
        return computeJavaType$default instanceof Class ? y : new GenericArrayTypeImpl(computeJavaType$default);
    }

    public static /* synthetic */ Type computeJavaType$default(KType kType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return computeJavaType(kType, z);
    }

    private static final Type createPossiblyInnerType(Class<?> cls, List<KTypeProjection> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(getJavaType((KTypeProjection) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(getJavaType((KTypeProjection) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type createPossiblyInnerType = createPossiblyInnerType(declaringClass, list.subList(length, list.size()));
        List<KTypeProjection> subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(k13.r(subList, 10));
        Iterator<T> it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(getJavaType((KTypeProjection) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, createPossiblyInnerType, arrayList3);
    }

    private static final Type getJavaType(KTypeProjection kTypeProjection) {
        KVariance variance = kTypeProjection.getVariance();
        if (variance == null) {
            return WildcardTypeImpl.Companion.getSTAR();
        }
        KType type = kTypeProjection.getType();
        type.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i == 1) {
            return new WildcardTypeImpl(null, computeJavaType(type, true));
        }
        if (i == 2) {
            return computeJavaType(type, true);
        }
        if (i == 3) {
            return new WildcardTypeImpl(computeJavaType(type, true), null);
        }
        zzl.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String typeToString(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        Sequence e = e5h.e(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
        StringBuilder sb = new StringBuilder(((Class) i5h.m(e)).getName());
        Iterator it = e.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                b.p();
                throw null;
            }
        }
        sb.append(c.q(i, "[]"));
        return sb.toString();
    }

    private static /* synthetic */ void getJavaType$annotations(KTypeProjection kTypeProjection) {
    }

    public static /* synthetic */ void getJavaType$annotations(KType kType) {
    }

    @NotNull
    public static final Type getJavaType(@NotNull KType kType) {
        Type javaType;
        kType.getClass();
        return (!(kType instanceof kia) || (javaType = ((kia) kType).getJavaType()) == null) ? computeJavaType$default(kType, false, 1, null) : javaType;
    }
}
