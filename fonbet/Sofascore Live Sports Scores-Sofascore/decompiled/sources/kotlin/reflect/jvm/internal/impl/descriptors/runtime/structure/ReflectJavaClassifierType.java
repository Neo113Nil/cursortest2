package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import defpackage.ilg;
import defpackage.k13;
import defpackage.km5;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ReflectJavaClassifierType extends ReflectJavaType implements JavaClassifierType {

    @NotNull
    private final JavaClassifier classifier;

    @NotNull
    private final Type reflectType;

    public ReflectJavaClassifierType(@NotNull Type type) {
        JavaClassifier reflectJavaClass;
        type.getClass();
        this.reflectType = type;
        Type reflectType = getReflectType();
        if (reflectType instanceof Class) {
            reflectJavaClass = new ReflectJavaClass((Class) reflectType);
        } else if (reflectType instanceof TypeVariable) {
            reflectJavaClass = new ReflectJavaTypeParameter((TypeVariable) reflectType);
        } else {
            if (!(reflectType instanceof ParameterizedType)) {
                ilg.j("Not a classifier type (", reflectType.getClass(), "): ", reflectType);
                throw null;
            }
            Type rawType = ((ParameterizedType) reflectType).getRawType();
            rawType.getClass();
            reflectJavaClass = new ReflectJavaClass((Class) rawType);
        }
        this.classifier = reflectJavaClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    public JavaAnnotation findAnnotation(@NotNull FqName fqName) {
        fqName.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection<JavaAnnotation> getAnnotations() {
        return km5.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    public JavaClassifier getClassifier() {
        return this.classifier;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    public String getClassifierQualifiedName() {
        throw new UnsupportedOperationException("Type not found: " + getReflectType());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    public String getPresentableText() {
        return getReflectType().toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    @NotNull
    public Type getReflectType() {
        return this.reflectType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    public List<JavaType> getTypeArguments() {
        List<Type> parameterizedTypeArguments = ReflectClassUtilKt.getParameterizedTypeArguments(getReflectType());
        ReflectJavaType.Factory factory = ReflectJavaType.Factory;
        ArrayList arrayList = new ArrayList(k13.r(parameterizedTypeArguments, 10));
        Iterator<T> it = parameterizedTypeArguments.iterator();
        while (it.hasNext()) {
            arrayList.add(factory.create((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public boolean isRaw() {
        Type reflectType = getReflectType();
        if (reflectType instanceof Class) {
            TypeVariable[] typeParameters = ((Class) reflectType).getTypeParameters();
            typeParameters.getClass();
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }
}
