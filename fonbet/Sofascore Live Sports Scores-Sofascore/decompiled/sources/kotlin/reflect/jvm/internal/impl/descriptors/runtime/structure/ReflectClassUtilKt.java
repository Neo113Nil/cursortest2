package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.a70;
import defpackage.at8;
import defpackage.ct8;
import defpackage.dt8;
import defpackage.duf;
import defpackage.e5h;
import defpackage.et8;
import defpackage.ft8;
import defpackage.fuf;
import defpackage.gt8;
import defpackage.ht8;
import defpackage.i5h;
import defpackage.it8;
import defpackage.jt8;
import defpackage.k13;
import defpackage.km5;
import defpackage.ljg;
import defpackage.ns8;
import defpackage.os8;
import defpackage.ph0;
import defpackage.ps8;
import defpackage.qs8;
import defpackage.rs8;
import defpackage.sha;
import defpackage.ss8;
import defpackage.ts8;
import defpackage.tub;
import defpackage.us8;
import defpackage.vs8;
import defpackage.ws8;
import defpackage.ys8;
import defpackage.zs8;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ReflectClassUtilKt {

    @NotNull
    private static final Map<Class<? extends dt8>, Integer> FUNCTION_CLASSES;

    @NotNull
    private static final List<KClass<? extends Object>> PRIMITIVE_CLASSES;

    @NotNull
    private static final Map<Class<? extends Object>, Class<? extends Object>> PRIMITIVE_TO_WRAPPER;

    @NotNull
    private static final Map<Class<? extends Object>, Class<? extends Object>> WRAPPER_TO_PRIMITIVE;

    static {
        fuf fufVar = duf.a;
        int i = 0;
        List<KClass<? extends Object>> j = b.j(fufVar.getOrCreateKotlinClass(Boolean.TYPE), fufVar.getOrCreateKotlinClass(Byte.TYPE), fufVar.getOrCreateKotlinClass(Character.TYPE), fufVar.getOrCreateKotlinClass(Double.TYPE), fufVar.getOrCreateKotlinClass(Float.TYPE), fufVar.getOrCreateKotlinClass(Integer.TYPE), fufVar.getOrCreateKotlinClass(Long.TYPE), fufVar.getOrCreateKotlinClass(Short.TYPE));
        PRIMITIVE_CLASSES = j;
        ArrayList arrayList = new ArrayList(k13.r(j, 10));
        Iterator<T> it = j.iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            arrayList.add(new Pair(sha.y(kClass), sha.z(kClass)));
        }
        WRAPPER_TO_PRIMITIVE = tub.o(arrayList);
        List<KClass<? extends Object>> list = PRIMITIVE_CLASSES;
        ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            KClass kClass2 = (KClass) it2.next();
            arrayList2.add(new Pair(sha.z(kClass2), sha.y(kClass2)));
        }
        PRIMITIVE_TO_WRAPPER = tub.o(arrayList2);
        List j2 = b.j(Function0.class, Function1.class, Function2.class, ct8.class, et8.class, ft8.class, gt8.class, ht8.class, it8.class, jt8.class, ns8.class, os8.class, ps8.class, qs8.class, rs8.class, ss8.class, ts8.class, us8.class, vs8.class, ws8.class, ys8.class, zs8.class, at8.class);
        ArrayList arrayList3 = new ArrayList(k13.r(j2, 10));
        for (Object obj : j2) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        FUNCTION_CLASSES = tub.o(arrayList3);
    }

    @NotNull
    public static final ClassId getClassId(@NotNull Class<?> cls) {
        ClassId classId;
        ClassId classId2;
        cls.getClass();
        if (cls.isPrimitive()) {
            a70.p(ljg.l(cls, "Can't compute ClassId for primitive type: "));
            return null;
        }
        if (cls.isArray()) {
            a70.p(ljg.l(cls, "Can't compute ClassId for array type: "));
            return null;
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            FqName fqName = new FqName(cls.getName());
            return new ClassId(fqName.parent(), FqName.topLevel(fqName.shortName()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null || (classId2 = getClassId(declaringClass)) == null || (classId = classId2.createNestedClassId(Name.identifier(cls.getSimpleName()))) == null) {
            classId = ClassId.topLevel(new FqName(cls.getName()));
        }
        classId.getClass();
        return classId;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @NotNull
    public static final String getDesc(@NotNull Class<?> cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String replace = cls.getName().replace('.', '/');
                replace.getClass();
                return replace;
            }
            StringBuilder sb = new StringBuilder("L");
            String replace2 = cls.getName().replace('.', '/');
            replace2.getClass();
            sb.append(replace2);
            sb.append(';');
            return sb.toString();
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return PlayerKt.VOLLEYBALL_SETTER;
                }
                break;
        }
        a70.p(ljg.l(cls, "Unsupported primitive type: "));
        return null;
    }

    @Nullable
    public static final Integer getFunctionClassArity(@NotNull Class<?> cls) {
        cls.getClass();
        return FUNCTION_CLASSES.get(cls);
    }

    @NotNull
    public static final List<Type> getParameterizedTypeArguments(@NotNull Type type) {
        type.getClass();
        if (!(type instanceof ParameterizedType)) {
            return km5.a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return i5h.q(i5h.k(e5h.e(type, ReflectClassUtilKt$parameterizedTypeArguments$1.INSTANCE), ReflectClassUtilKt$parameterizedTypeArguments$2.INSTANCE));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return ph0.X(actualTypeArguments);
    }

    @Nullable
    public static final Class<?> getPrimitiveByWrapper(@NotNull Class<?> cls) {
        cls.getClass();
        return WRAPPER_TO_PRIMITIVE.get(cls);
    }

    @NotNull
    public static final ClassLoader getSafeClassLoader(@NotNull Class<?> cls) {
        cls.getClass();
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        systemClassLoader.getClass();
        return systemClassLoader;
    }

    @Nullable
    public static final Class<?> getWrapperByPrimitive(@NotNull Class<?> cls) {
        cls.getClass();
        return PRIMITIVE_TO_WRAPPER.get(cls);
    }

    public static final boolean isEnumClassOrSpecializedEnumEntryClass(@NotNull Class<?> cls) {
        cls.getClass();
        return Enum.class.isAssignableFrom(cls);
    }
}
