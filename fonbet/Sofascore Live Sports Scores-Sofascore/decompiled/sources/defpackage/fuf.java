package defpackage;

import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class fuf {
    private static final String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";

    public KClass createKotlinClass(Class cls) {
        return new uv2(cls);
    }

    public KClass getOrCreateKotlinClass(Class cls) {
        return new uv2(cls);
    }

    public KDeclarationContainer getOrCreateKotlinPackage(Class cls, String str) {
        return new j3e(cls, str);
    }

    public KType mutableCollectionType(KType kType) {
        o5k o5kVar = (o5k) kType;
        KClassifier classifier = kType.getClassifier();
        List<KTypeProjection> arguments = kType.getArguments();
        o5kVar.getClass();
        return new o5k(classifier, arguments, o5kVar.c | 2);
    }

    public String renderLambdaToString(mt8 mt8Var) {
        String obj = mt8Var.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith(KOTLIN_JVM_FUNCTIONS) ? obj.substring(21) : obj;
    }

    public void setUpperBounds(KTypeParameter kTypeParameter, List list) {
        l5k l5kVar = (l5k) kTypeParameter;
        l5kVar.getClass();
        list.getClass();
        if (l5kVar.e == null) {
            l5kVar.e = list;
        } else {
            pvd.p(l5kVar, "' have already been initialized.", "Upper bounds of type parameter '");
        }
    }

    public KType typeOf(KClassifier kClassifier, List list, boolean z) {
        kClassifier.getClass();
        list.getClass();
        return new o5k(kClassifier, list, z ? 1 : 0);
    }

    public KTypeParameter typeParameter(Object obj, String str, KVariance kVariance, boolean z) {
        return new l5k(obj, kVariance);
    }

    public String renderLambdaToString(xka xkaVar) {
        return renderLambdaToString((mt8) xkaVar);
    }

    public KFunction function(nt8 nt8Var) {
        return nt8Var;
    }

    public KMutableProperty0 mutableProperty0(q0d q0dVar) {
        return q0dVar;
    }

    public KMutableProperty1 mutableProperty1(s0d s0dVar) {
        return s0dVar;
    }

    public KMutableProperty2 mutableProperty2(u0d u0dVar) {
        return u0dVar;
    }

    public KProperty0 property0(hef hefVar) {
        return hefVar;
    }

    public KProperty1 property1(jef jefVar) {
        return jefVar;
    }

    public KProperty2 property2(lef lefVar) {
        return lefVar;
    }
}
