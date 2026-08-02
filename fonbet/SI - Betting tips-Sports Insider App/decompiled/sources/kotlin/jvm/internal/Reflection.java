package kotlin.jvm.internal;

import ag.c;
import ag.d;
import ag.e;
import ag.f;
import ag.i;
import ag.k;
import ag.m;
import ag.p;
import ag.r;
import ag.t;
import ag.v;
import ag.w;
import ag.y;
import java.util.Arrays;
import java.util.Collections;
import kotlin.reflect.KTypeProjection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class Reflection {
    private static final c[] EMPTY_K_CLASS_ARRAY;
    static final String REFLECTION_NOT_AVAILABLE = " (Kotlin reflection is not available)";
    private static final ReflectionFactory factory;

    static {
        ReflectionFactory reflectionFactory = null;
        try {
            reflectionFactory = (ReflectionFactory) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (reflectionFactory == null) {
            reflectionFactory = new ReflectionFactory();
        }
        factory = reflectionFactory;
        EMPTY_K_CLASS_ARRAY = new c[0];
    }

    public static c createKotlinClass(Class cls) {
        return factory.createKotlinClass(cls);
    }

    public static f function(FunctionReference functionReference) {
        return factory.function(functionReference);
    }

    public static c getOrCreateKotlinClass(Class cls) {
        return factory.getOrCreateKotlinClass(cls);
    }

    public static c[] getOrCreateKotlinClasses(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return EMPTY_K_CLASS_ARRAY;
        }
        c[] cVarArr = new c[length];
        for (int i5 = 0; i5 < length; i5++) {
            cVarArr[i5] = getOrCreateKotlinClass(clsArr[i5]);
        }
        return cVarArr;
    }

    public static e getOrCreateKotlinPackage(Class cls) {
        return factory.getOrCreateKotlinPackage(cls, "");
    }

    public static v mutableCollectionType(v vVar) {
        return factory.mutableCollectionType(vVar);
    }

    public static i mutableProperty0(MutablePropertyReference0 mutablePropertyReference0) {
        return factory.mutableProperty0(mutablePropertyReference0);
    }

    public static k mutableProperty1(MutablePropertyReference1 mutablePropertyReference1) {
        return factory.mutableProperty1(mutablePropertyReference1);
    }

    public static m mutableProperty2(MutablePropertyReference2 mutablePropertyReference2) {
        return factory.mutableProperty2(mutablePropertyReference2);
    }

    public static v nothingType(v vVar) {
        return factory.nothingType(vVar);
    }

    public static v nullableTypeOf(d dVar) {
        return factory.typeOf(dVar, Collections.EMPTY_LIST, true);
    }

    public static v platformType(v vVar, v vVar2) {
        return factory.platformType(vVar, vVar2);
    }

    public static p property0(PropertyReference0 propertyReference0) {
        return factory.property0(propertyReference0);
    }

    public static r property1(PropertyReference1 propertyReference1) {
        return factory.property1(propertyReference1);
    }

    public static t property2(PropertyReference2 propertyReference2) {
        return factory.property2(propertyReference2);
    }

    public static String renderLambdaToString(Lambda lambda) {
        return factory.renderLambdaToString(lambda);
    }

    public static void setUpperBounds(w wVar, v vVar) {
        factory.setUpperBounds(wVar, Collections.singletonList(vVar));
    }

    public static v typeOf(d dVar) {
        return factory.typeOf(dVar, Collections.EMPTY_LIST, false);
    }

    public static w typeParameter(Object obj, String str, y yVar, boolean z5) {
        return factory.typeParameter(obj, str, yVar, z5);
    }

    public static c createKotlinClass(Class cls, String str) {
        return factory.createKotlinClass(cls, str);
    }

    public static c getOrCreateKotlinClass(Class cls, String str) {
        return factory.getOrCreateKotlinClass(cls, str);
    }

    public static e getOrCreateKotlinPackage(Class cls, String str) {
        return factory.getOrCreateKotlinPackage(cls, str);
    }

    public static v nullableTypeOf(Class cls) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Collections.EMPTY_LIST, true);
    }

    public static String renderLambdaToString(FunctionBase functionBase) {
        return factory.renderLambdaToString(functionBase);
    }

    public static void setUpperBounds(w wVar, v... vVarArr) {
        factory.setUpperBounds(wVar, kotlin.collections.p.z(vVarArr));
    }

    public static v typeOf(Class cls) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Collections.EMPTY_LIST, false);
    }

    public static v nullableTypeOf(Class cls, KTypeProjection kTypeProjection) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Collections.singletonList(kTypeProjection), true);
    }

    public static v typeOf(Class cls, KTypeProjection kTypeProjection) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Collections.singletonList(kTypeProjection), false);
    }

    public static v nullableTypeOf(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Arrays.asList(kTypeProjection, kTypeProjection2), true);
    }

    public static v typeOf(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return factory.typeOf(getOrCreateKotlinClass(cls), Arrays.asList(kTypeProjection, kTypeProjection2), false);
    }

    public static v nullableTypeOf(Class cls, KTypeProjection... kTypeProjectionArr) {
        return factory.typeOf(getOrCreateKotlinClass(cls), kotlin.collections.p.z(kTypeProjectionArr), true);
    }

    public static v typeOf(Class cls, KTypeProjection... kTypeProjectionArr) {
        return factory.typeOf(getOrCreateKotlinClass(cls), kotlin.collections.p.z(kTypeProjectionArr), false);
    }
}
