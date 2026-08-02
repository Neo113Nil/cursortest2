package kotlin.reflect.jvm.internal;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.dmi;
import defpackage.duf;
import defpackage.fuf;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.kef;
import defpackage.mz1;
import defpackage.pvd;
import defpackage.rv2;
import defpackage.sxb;
import defpackage.txb;
import defpackage.wt3;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000 J2\u00020\u0001:\u0003JKLB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\r\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000f\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012*\u0006\u0012\u0002\b\u00030\u00042\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u001a\u001a\u00020\u00192\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00152\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00112\u0006\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010!\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u0006\u001a\u00020%H&¢\u0006\u0004\b(\u0010)J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020*0&2\u0006\u0010\u0006\u001a\u00020%H&¢\u0006\u0004\b+\u0010)J\u0019\u0010-\u001a\u0004\u0018\u00010'2\u0006\u0010,\u001a\u00020\u001eH&¢\u0006\u0004\b-\u0010.J)\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003030&2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0004¢\u0006\u0004\b4\u00105J\u001d\u00107\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b;\u0010<J'\u0010>\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\n¢\u0006\u0004\b>\u0010?J\u001b\u0010@\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b@\u0010AJ\u001b\u0010B\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\bB\u0010AR\u0018\u0010E\u001a\u0006\u0012\u0002\b\u00030\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020F0&8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006M"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lrv2;", "<init>", "()V", "Ljava/lang/Class;", "", "name", "", "parameterTypes", "returnType", "", "isStaticDefault", "Ljava/lang/reflect/Method;", "lookupMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "tryGetMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "Ljava/lang/reflect/Constructor;", "tryGetConstructor", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "", "result", CampaignEx.JSON_KEY_DESC, "isConstructor", "", "addParametersAndMasks", "(Ljava/util/List;Ljava/lang/String;Z)V", "loadParameterTypes", "(Ljava/lang/String;)Ljava/util/List;", "", "begin", TtmlNode.END, "parseType", "(Ljava/lang/String;II)Ljava/lang/Class;", "loadReturnType", "(Ljava/lang/String;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getProperties", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "getFunctions", "index", "getLocalProperty", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "scope", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "belonginess", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getMembers", "(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;)Ljava/util/Collection;", InAppPurchaseMetaData.KEY_SIGNATURE, "findPropertyDescriptor", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "findFunctionDescriptor", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "findMethodBySignature", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;", "isMember", "findDefaultMethod", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;", "findConstructorBySignature", "(Ljava/lang/String;)Ljava/lang/reflect/Constructor;", "findDefaultConstructor", "getMethodOwner", "()Ljava/lang/Class;", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "constructorDescriptors", "Companion", "Data", "MemberBelonginess", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class KDeclarationContainerImpl implements rv2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Class<?> DEFAULT_CONSTRUCTOR_MARKER = DefaultConstructorMarker.class;

    @NotNull
    private static final Regex LOCAL_PROPERTY_SIGNATURE = new Regex("<v#(\\d+)>");

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b¦\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "moduleData", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public abstract class Data {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;

        /* renamed from: moduleData$delegate, reason: from kotlin metadata */
        @NotNull
        private final ReflectProperties.LazySoftVal moduleData;

        static {
            fuf fufVar = duf.a;
            $$delegatedProperties = new KProperty[]{fufVar.property1(new kef(fufVar.getOrCreateKotlinClass(Data.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};
        }

        public Data() {
            this.moduleData = ReflectProperties.lazySoft(new KDeclarationContainerImpl$Data$moduleData$2(KDeclarationContainerImpl.this));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final RuntimeModuleData getModuleData() {
            T value = this.moduleData.getValue(this, $$delegatedProperties[0]);
            value.getClass();
            return (RuntimeModuleData) value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "(Ljava/lang/String;I)V", "accept", "", "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "DECLARED", "INHERITED", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MemberBelonginess {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ MemberBelonginess[] $VALUES;
        public static final MemberBelonginess DECLARED = new MemberBelonginess("DECLARED", 0);
        public static final MemberBelonginess INHERITED = new MemberBelonginess("INHERITED", 1);

        private static final /* synthetic */ MemberBelonginess[] $values() {
            return new MemberBelonginess[]{DECLARED, INHERITED};
        }

        static {
            MemberBelonginess[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private MemberBelonginess(String str, int i) {
        }

        public static MemberBelonginess valueOf(String str) {
            return (MemberBelonginess) Enum.valueOf(MemberBelonginess.class, str);
        }

        public static MemberBelonginess[] values() {
            return (MemberBelonginess[]) $VALUES.clone();
        }

        public final boolean accept(@NotNull CallableMemberDescriptor member) {
            member.getClass();
            return member.getKind().isReal() == (this == DECLARED);
        }
    }

    private final void addParametersAndMasks(List<Class<?>> result, String desc, boolean isConstructor) {
        List<Class<?>> loadParameterTypes = loadParameterTypes(desc);
        result.addAll(loadParameterTypes);
        int size = (loadParameterTypes.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            Class<?> cls = Integer.TYPE;
            cls.getClass();
            result.add(cls);
        }
        if (!isConstructor) {
            result.add(Object.class);
            return;
        }
        Class<?> cls2 = DEFAULT_CONSTRUCTOR_MARKER;
        result.remove(cls2);
        cls2.getClass();
        result.add(cls2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int findPropertyDescriptor$lambda$3(Function2 function2, Object obj, Object obj2) {
        function2.getClass();
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    private final List<Class<?>> loadParameterTypes(String desc) {
        int O;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (desc.charAt(i) != ')') {
            int i2 = i;
            while (desc.charAt(i2) == '[') {
                i2++;
            }
            char charAt = desc.charAt(i2);
            if (StringsKt.K("VZCBSIFJD", charAt)) {
                O = i2 + 1;
            } else {
                if (charAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(desc));
                }
                O = StringsKt.O(desc, ';', i, 4) + 1;
            }
            arrayList.add(parseType(desc, i, O));
            i = O;
        }
        return arrayList;
    }

    private final Class<?> loadReturnType(String desc) {
        return parseType(desc, StringsKt.O(desc, ')', 0, 6) + 1, desc.length());
    }

    private final Method lookupMethod(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z) {
        KDeclarationContainerImpl kDeclarationContainerImpl;
        String str2;
        Class<?>[] clsArr2;
        Class<?> cls3;
        boolean z2;
        Class<?> tryLoadClass;
        if (z) {
            clsArr[0] = cls;
        }
        Method tryGetMethod = tryGetMethod(cls, str, clsArr, cls2);
        if (tryGetMethod != null) {
            return tryGetMethod;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            Method lookupMethod = lookupMethod(superclass, str, clsArr, cls2, z);
            kDeclarationContainerImpl = this;
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z2 = z;
            if (lookupMethod != null) {
                return lookupMethod;
            }
        } else {
            kDeclarationContainerImpl = this;
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z2 = z;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        interfaces.getClass();
        for (Class<?> cls4 : interfaces) {
            cls4.getClass();
            Method lookupMethod2 = kDeclarationContainerImpl.lookupMethod(cls4, str2, clsArr2, cls3, z2);
            if (lookupMethod2 != null) {
                return lookupMethod2;
            }
            if (z2 && (tryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(ReflectClassUtilKt.getSafeClassLoader(cls4), cls4.getName().concat("$DefaultImpls"))) != null) {
                clsArr2[0] = cls4;
                Method tryGetMethod2 = kDeclarationContainerImpl.tryGetMethod(tryLoadClass, str2, clsArr2, cls3);
                if (tryGetMethod2 != null) {
                    return tryGetMethod2;
                }
            }
        }
        return null;
    }

    private final Class<?> parseType(String desc, int begin, int end) {
        char charAt = desc.charAt(begin);
        if (charAt == 'L') {
            ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(getJClass());
            String replace = desc.substring(begin + 1, end - 1).replace('/', '.');
            replace.getClass();
            Class<?> loadClass = safeClassLoader.loadClass(replace);
            loadClass.getClass();
            return loadClass;
        }
        if (charAt == '[') {
            return UtilKt.createArrayType(parseType(desc, begin + 1, end));
        }
        if (charAt == 'V') {
            Class<?> cls = Void.TYPE;
            cls.getClass();
            return cls;
        }
        if (charAt == 'Z') {
            return Boolean.TYPE;
        }
        if (charAt == 'C') {
            return Character.TYPE;
        }
        if (charAt == 'B') {
            return Byte.TYPE;
        }
        if (charAt == 'S') {
            return Short.TYPE;
        }
        if (charAt == 'I') {
            return Integer.TYPE;
        }
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'J') {
            return Long.TYPE;
        }
        if (charAt == 'D') {
            return Double.TYPE;
        }
        throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(desc));
    }

    private final Constructor<?> tryGetConstructor(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method tryGetMethod(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        Method declaredMethod;
        try {
            declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
        }
        if (Intrinsics.c(declaredMethod.getReturnType(), cls2)) {
            return declaredMethod;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (Intrinsics.c(method.getName(), str) && Intrinsics.c(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    @Nullable
    public final Constructor<?> findConstructorBySignature(@NotNull String desc) {
        desc.getClass();
        return tryGetConstructor(getJClass(), loadParameterTypes(desc));
    }

    @Nullable
    public final Constructor<?> findDefaultConstructor(@NotNull String desc) {
        desc.getClass();
        Class jClass = getJClass();
        ArrayList arrayList = new ArrayList();
        addParametersAndMasks(arrayList, desc, true);
        Unit unit = Unit.a;
        return tryGetConstructor(jClass, arrayList);
    }

    @Nullable
    public final Method findDefaultMethod(@NotNull String name, @NotNull String desc, boolean isMember) {
        name.getClass();
        desc.getClass();
        if (Intrinsics.c(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (isMember) {
            arrayList.add(getJClass());
        }
        addParametersAndMasks(arrayList, desc, false);
        return lookupMethod(getMethodOwner(), dmi.y(name, "$default"), (Class[]) arrayList.toArray(new Class[0]), loadReturnType(desc), isMember);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0021 A[SYNTHETIC] */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FunctionDescriptor findFunctionDescriptor(@NotNull String name, @NotNull String signature) {
        Collection<FunctionDescriptor> functions;
        ArrayList arrayList;
        String str;
        name.getClass();
        signature.getClass();
        if (name.equals("<init>")) {
            functions = CollectionsKt.S0(getConstructorDescriptors());
            arrayList = new ArrayList();
            for (Object obj : functions) {
                ConstructorDescriptor constructorDescriptor = (ConstructorDescriptor) obj;
                if (constructorDescriptor.isPrimary()) {
                    ClassifierDescriptorWithTypeParameters containingDeclaration = constructorDescriptor.getContainingDeclaration();
                    containingDeclaration.getClass();
                    if (InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration)) {
                        String str2 = RuntimeTypeMapper.INSTANCE.mapSignature(constructorDescriptor).get_signature();
                        if (!c.v(str2, "constructor-impl", false) || !c.n(str2, ")V", false)) {
                            pvd.s("Invalid signature of ", constructorDescriptor, ": ", str2);
                            return null;
                        }
                        StringBuilder sb = new StringBuilder(StringsKt.W(str2, "V"));
                        ClassifierDescriptorWithTypeParameters containingDeclaration2 = constructorDescriptor.getContainingDeclaration();
                        containingDeclaration2.getClass();
                        sb.append(ValueClassAwareCallerKt.toJvmDescriptor(containingDeclaration2));
                        str = sb.toString();
                        if (!Intrinsics.c(str, signature)) {
                            arrayList.add(obj);
                        }
                    }
                }
                str = RuntimeTypeMapper.INSTANCE.mapSignature(constructorDescriptor).get_signature();
                if (!Intrinsics.c(str, signature)) {
                }
            }
        } else {
            Name identifier = Name.identifier(name);
            identifier.getClass();
            functions = getFunctions(identifier);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : functions) {
                if (Intrinsics.c(RuntimeTypeMapper.INSTANCE.mapSignature((FunctionDescriptor) obj2).get_signature(), signature)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList.size() == 1) {
            return (FunctionDescriptor) CollectionsKt.D0(arrayList);
        }
        String f0 = CollectionsKt.f0(functions, "\n", null, null, KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1.INSTANCE, 30);
        StringBuilder s = mz1.s("Function '", name, "' (JVM signature: ", signature, ") not resolved in ");
        s.append(this);
        s.append(':');
        s.append(f0.length() == 0 ? " no members found" : "\n".concat(f0));
        throw new KotlinReflectionInternalError(s.toString());
    }

    @Nullable
    public final Method findMethodBySignature(@NotNull String name, @NotNull String desc) {
        Method lookupMethod;
        name.getClass();
        desc.getClass();
        if (Intrinsics.c(name, "<init>")) {
            return null;
        }
        Class<?>[] clsArr = (Class[]) loadParameterTypes(desc).toArray(new Class[0]);
        Class<?> loadReturnType = loadReturnType(desc);
        Method lookupMethod2 = lookupMethod(getMethodOwner(), name, clsArr, loadReturnType, false);
        if (lookupMethod2 != null) {
            return lookupMethod2;
        }
        if (!getMethodOwner().isInterface() || (lookupMethod = lookupMethod(Object.class, name, clsArr, loadReturnType, false)) == null) {
            return null;
        }
        return lookupMethod;
    }

    @NotNull
    public final PropertyDescriptor findPropertyDescriptor(@NotNull String name, @NotNull String signature) {
        name.getClass();
        signature.getClass();
        txb e = LOCAL_PROPERTY_SIGNATURE.e(signature);
        if (e != null) {
            String str = (String) ((sxb) e.a()).get(1);
            PropertyDescriptor localProperty = getLocalProperty(Integer.parseInt(str));
            if (localProperty != null) {
                return localProperty;
            }
            StringBuilder q = wt3.q("Local property #", str, " not found in ");
            q.append(getJClass());
            throw new KotlinReflectionInternalError(q.toString());
        }
        Name identifier = Name.identifier(name);
        identifier.getClass();
        Collection<PropertyDescriptor> properties = getProperties(identifier);
        ArrayList arrayList = new ArrayList();
        for (Object obj : properties) {
            if (Intrinsics.c(RuntimeTypeMapper.INSTANCE.mapPropertySignature((PropertyDescriptor) obj).getString(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            StringBuilder s = mz1.s("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
            s.append(this);
            throw new KotlinReflectionInternalError(s.toString());
        }
        if (arrayList.size() == 1) {
            return (PropertyDescriptor) CollectionsKt.D0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            DescriptorVisibility visibility = ((PropertyDescriptor) next).getVisibility();
            Object obj2 = linkedHashMap.get(visibility);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(visibility, obj2);
            }
            ((List) obj2).add(next);
        }
        final KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2 kDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2 = KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2.INSTANCE;
        TreeMap treeMap = new TreeMap(new Comparator(kDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2) { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$$Lambda$0
            private final Function2 arg$0;

            {
                this.arg$0 = kDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2;
            }

            @Override // java.util.Comparator
            public int compare(Object obj3, Object obj4) {
                int findPropertyDescriptor$lambda$3;
                findPropertyDescriptor$lambda$3 = KDeclarationContainerImpl.findPropertyDescriptor$lambda$3(this.arg$0, obj3, obj4);
                return findPropertyDescriptor$lambda$3;
            }
        });
        treeMap.putAll(linkedHashMap);
        Collection values = treeMap.values();
        values.getClass();
        List list = (List) CollectionsKt.g0(values);
        if (list.size() == 1) {
            return (PropertyDescriptor) CollectionsKt.Y(list);
        }
        Name identifier2 = Name.identifier(name);
        identifier2.getClass();
        String f0 = CollectionsKt.f0(getProperties(identifier2), "\n", null, null, KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1.INSTANCE, 30);
        StringBuilder s2 = mz1.s("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
        s2.append(this);
        s2.append(':');
        s2.append(f0.length() == 0 ? " no members found" : "\n".concat(f0));
        throw new KotlinReflectionInternalError(s2.toString());
    }

    @NotNull
    public abstract Collection<ConstructorDescriptor> getConstructorDescriptors();

    @NotNull
    public abstract Collection<FunctionDescriptor> getFunctions(@NotNull Name name);

    @Override // defpackage.rv2
    @NotNull
    public abstract /* synthetic */ Class getJClass();

    @Nullable
    public abstract PropertyDescriptor getLocalProperty(int index);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001c A[SYNTHETIC] */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection<KCallableImpl<?>> getMembers(@NotNull MemberScope scope, @NotNull MemberBelonginess belonginess) {
        KCallableImpl kCallableImpl;
        scope.getClass();
        belonginess.getClass();
        CreateKCallableVisitor createKCallableVisitor = new CreateKCallableVisitor(this) { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$getMembers$visitor$1
            {
                super(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
            @NotNull
            public KCallableImpl<?> visitConstructorDescriptor(@NotNull ConstructorDescriptor constructorDescriptor, @NotNull Unit unit) {
                constructorDescriptor.getClass();
                unit.getClass();
                throw new IllegalStateException("No constructors should appear here: " + constructorDescriptor);
            }
        };
        Collection<DeclarationDescriptor> contributedDescriptors$default = ResolutionScope.DefaultImpls.getContributedDescriptors$default(scope, null, null, 3, null);
        ArrayList arrayList = new ArrayList();
        for (DeclarationDescriptor declarationDescriptor : contributedDescriptors$default) {
            if (declarationDescriptor instanceof CallableMemberDescriptor) {
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) declarationDescriptor;
                if (!Intrinsics.c(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.INVISIBLE_FAKE) && belonginess.accept(callableMemberDescriptor)) {
                    kCallableImpl = (KCallableImpl) declarationDescriptor.accept(createKCallableVisitor, Unit.a);
                    if (kCallableImpl == null) {
                        arrayList.add(kCallableImpl);
                    }
                }
            }
            kCallableImpl = null;
            if (kCallableImpl == null) {
            }
        }
        return CollectionsKt.S0(arrayList);
    }

    @NotNull
    public Class<?> getMethodOwner() {
        Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(getJClass());
        return wrapperByPrimitive == null ? getJClass() : wrapperByPrimitive;
    }

    @NotNull
    public abstract Collection<PropertyDescriptor> getProperties(@NotNull Name name);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "()V", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection", "()Lkotlin/text/Regex;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Regex getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection() {
            return KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE;
        }

        private Companion() {
        }
    }
}
