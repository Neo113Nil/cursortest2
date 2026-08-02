package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import defpackage.km5;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ReflectJavaArrayType extends ReflectJavaType implements JavaArrayType {

    @NotNull
    private final Collection<JavaAnnotation> annotations;

    @NotNull
    private final ReflectJavaType componentType;
    private final boolean isDeprecatedInJavaDoc;

    @NotNull
    private final Type reflectType;

    public ReflectJavaArrayType(@NotNull Type type) {
        ReflectJavaType create;
        type.getClass();
        this.reflectType = type;
        Type reflectType = getReflectType();
        if (!(reflectType instanceof GenericArrayType)) {
            if (reflectType instanceof Class) {
                Class cls = (Class) reflectType;
                if (cls.isArray()) {
                    ReflectJavaType.Factory factory = ReflectJavaType.Factory;
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    create = factory.create(componentType);
                }
            }
            StringBuilder sb = new StringBuilder("Not an array type (");
            sb.append(getReflectType().getClass());
            Type reflectType2 = getReflectType();
            sb.append("): ");
            sb.append(reflectType2);
            throw new IllegalArgumentException(sb.toString());
        }
        ReflectJavaType.Factory factory2 = ReflectJavaType.Factory;
        Type genericComponentType = ((GenericArrayType) reflectType).getGenericComponentType();
        genericComponentType.getClass();
        create = factory2.create(genericComponentType);
        this.componentType = create;
        this.annotations = km5.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection<JavaAnnotation> getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    @NotNull
    public Type getReflectType() {
        return this.reflectType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return this.isDeprecatedInJavaDoc;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
    @NotNull
    public ReflectJavaType getComponentType() {
        return this.componentType;
    }
}
