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
import java.util.List;
import kotlin.reflect.KTypeProjection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class ReflectionFactory {
    private static final String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";

    public c createKotlinClass(Class cls) {
        return new ClassReference(cls);
    }

    public c getOrCreateKotlinClass(Class cls) {
        return new ClassReference(cls);
    }

    public e getOrCreateKotlinPackage(Class cls, String str) {
        return new PackageReference(cls, str);
    }

    public v mutableCollectionType(v vVar) {
        TypeReference typeReference = (TypeReference) vVar;
        return new TypeReference(vVar.getClassifier(), vVar.getArguments(), typeReference.getPlatformTypeUpperBound(), typeReference.getFlags() | 2);
    }

    public v nothingType(v vVar) {
        TypeReference typeReference = (TypeReference) vVar;
        return new TypeReference(vVar.getClassifier(), vVar.getArguments(), typeReference.getPlatformTypeUpperBound(), typeReference.getFlags() | 4);
    }

    public v platformType(v vVar, v vVar2) {
        return new TypeReference(vVar.getClassifier(), vVar.getArguments(), vVar2, ((TypeReference) vVar).getFlags());
    }

    public String renderLambdaToString(Lambda lambda) {
        return renderLambdaToString((FunctionBase) lambda);
    }

    public void setUpperBounds(w wVar, List<v> list) {
        ((TypeParameterReference) wVar).setUpperBounds(list);
    }

    public v typeOf(d dVar, List<KTypeProjection> list, boolean z5) {
        return new TypeReference(dVar, list, z5);
    }

    public w typeParameter(Object obj, String str, y yVar, boolean z5) {
        return new TypeParameterReference(obj, str, yVar, z5);
    }

    public c createKotlinClass(Class cls, String str) {
        return new ClassReference(cls);
    }

    public c getOrCreateKotlinClass(Class cls, String str) {
        return new ClassReference(cls);
    }

    public String renderLambdaToString(FunctionBase functionBase) {
        String obj = functionBase.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith(KOTLIN_JVM_FUNCTIONS) ? obj.substring(21) : obj;
    }

    public f function(FunctionReference functionReference) {
        return functionReference;
    }

    public i mutableProperty0(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public k mutableProperty1(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public m mutableProperty2(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public p property0(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public r property1(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public t property2(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }
}
