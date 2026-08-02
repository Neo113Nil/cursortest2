package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JavaLoadingKt {
    private static final boolean isMethodWithOneObjectParameter(JavaMethod javaMethod) {
        FqName fqName;
        JavaValueParameter javaValueParameter = (JavaValueParameter) CollectionsKt.F0(javaMethod.getValueParameters());
        JavaType type = javaValueParameter != null ? javaValueParameter.getType() : null;
        JavaClassifierType javaClassifierType = type instanceof JavaClassifierType ? (JavaClassifierType) type : null;
        if (javaClassifierType == null) {
            return false;
        }
        JavaClassifier classifier = javaClassifierType.getClassifier();
        return (classifier instanceof JavaClass) && (fqName = ((JavaClass) classifier).getFqName()) != null && Intrinsics.c(fqName.asString(), "java.lang.Object");
    }

    private static final boolean isObjectMethod(JavaMethod javaMethod) {
        String asString = javaMethod.getName().asString();
        int hashCode = asString.hashCode();
        if (hashCode != -1776922004) {
            if (hashCode == -1295482945) {
                if (asString.equals("equals")) {
                    return isMethodWithOneObjectParameter(javaMethod);
                }
                return false;
            }
            if (hashCode != 147696667 || !asString.equals("hashCode")) {
                return false;
            }
        } else if (!asString.equals("toString")) {
            return false;
        }
        return javaMethod.getValueParameters().isEmpty();
    }

    public static final boolean isObjectMethodInInterface(@NotNull JavaMember javaMember) {
        javaMember.getClass();
        return javaMember.getContainingClass().isInterface() && (javaMember instanceof JavaMethod) && isObjectMethod((JavaMethod) javaMember);
    }
}
