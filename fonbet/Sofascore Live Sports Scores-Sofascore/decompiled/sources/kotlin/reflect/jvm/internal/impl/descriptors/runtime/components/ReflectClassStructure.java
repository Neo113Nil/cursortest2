package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import defpackage.ph0;
import defpackage.sha;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
final class ReflectClassStructure {

    @NotNull
    public static final ReflectClassStructure INSTANCE = new ReflectClassStructure();

    private ReflectClassStructure() {
    }

    private final ClassLiteralValue classLiteralValue(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (!cls.isPrimitive()) {
            ClassId classId = ReflectClassUtilKt.getClassId(cls);
            JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
            FqName asSingleFqName = classId.asSingleFqName();
            asSingleFqName.getClass();
            ClassId mapJavaToKotlin = javaToKotlinClassMap.mapJavaToKotlin(asSingleFqName);
            if (mapJavaToKotlin != null) {
                classId = mapJavaToKotlin;
            }
            return new ClassLiteralValue(classId, i);
        }
        if (cls.equals(Void.TYPE)) {
            ClassId classId2 = ClassId.topLevel(StandardNames.FqNames.unit.toSafe());
            classId2.getClass();
            return new ClassLiteralValue(classId2, i);
        }
        PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
        primitiveType.getClass();
        if (i > 0) {
            ClassId classId3 = ClassId.topLevel(primitiveType.getArrayTypeFqName());
            classId3.getClass();
            return new ClassLiteralValue(classId3, i - 1);
        }
        ClassId classId4 = ClassId.topLevel(primitiveType.getTypeFqName());
        classId4.getClass();
        return new ClassLiteralValue(classId4, i);
    }

    private final void loadConstructorAnnotations(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        Constructor<?>[] constructorArr;
        int i;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        declaredConstructors.getClass();
        int length = declaredConstructors.length;
        int i2 = 0;
        while (i2 < length) {
            Constructor<?> constructor = declaredConstructors[i2];
            Name name = SpecialNames.INIT;
            SignatureSerializer signatureSerializer = SignatureSerializer.INSTANCE;
            constructor.getClass();
            KotlinJvmBinaryClass.MethodAnnotationVisitor visitMethod = memberVisitor.visitMethod(name, signatureSerializer.constructorDesc(constructor));
            if (visitMethod == null) {
                constructorArr = declaredConstructors;
                i = length;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                declaredAnnotations.getClass();
                for (Annotation annotation : declaredAnnotations) {
                    annotation.getClass();
                    processAnnotation(visitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                parameterAnnotations.getClass();
                if (!(parameterAnnotations.length == 0)) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        Annotation[] annotationArr = parameterAnnotations[i3];
                        annotationArr.getClass();
                        int length4 = annotationArr.length;
                        int i4 = 0;
                        while (i4 < length4) {
                            Annotation annotation2 = annotationArr[i4];
                            Class<?> x = sha.x(sha.v(annotation2));
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            int i5 = length;
                            KotlinJvmBinaryClass.AnnotationArgumentVisitor visitParameterAnnotation = visitMethod.visitParameterAnnotation(i3 + length2, ReflectClassUtilKt.getClassId(x), new ReflectAnnotationSource(annotation2));
                            if (visitParameterAnnotation != null) {
                                INSTANCE.processAnnotationArguments(visitParameterAnnotation, annotation2, x);
                            }
                            i4++;
                            declaredConstructors = constructorArr2;
                            length = i5;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i = length;
                visitMethod.visitEnd();
            }
            i2++;
            declaredConstructors = constructorArr;
            length = i;
        }
    }

    private final void loadFieldAnnotations(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        for (Field field : declaredFields) {
            Name identifier = Name.identifier(field.getName());
            identifier.getClass();
            KotlinJvmBinaryClass.AnnotationVisitor visitField = memberVisitor.visitField(identifier, SignatureSerializer.INSTANCE.fieldDesc(field), null);
            if (visitField != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                declaredAnnotations.getClass();
                for (Annotation annotation : declaredAnnotations) {
                    annotation.getClass();
                    processAnnotation(visitField, annotation);
                }
                visitField.visitEnd();
            }
        }
    }

    private final void loadMethodAnnotations(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            Name identifier = Name.identifier(method.getName());
            identifier.getClass();
            KotlinJvmBinaryClass.MethodAnnotationVisitor visitMethod = memberVisitor.visitMethod(identifier, SignatureSerializer.INSTANCE.methodDesc(method));
            if (visitMethod != null) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                declaredAnnotations.getClass();
                for (Annotation annotation : declaredAnnotations) {
                    annotation.getClass();
                    processAnnotation(visitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                parameterAnnotations.getClass();
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i = 0; i < length; i++) {
                    Annotation[] annotationArr2 = annotationArr[i];
                    annotationArr2.getClass();
                    for (Annotation annotation2 : annotationArr2) {
                        Class<?> x = sha.x(sha.v(annotation2));
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor visitParameterAnnotation = visitMethod.visitParameterAnnotation(i, ReflectClassUtilKt.getClassId(x), new ReflectAnnotationSource(annotation2));
                        if (visitParameterAnnotation != null) {
                            INSTANCE.processAnnotationArguments(visitParameterAnnotation, annotation2, x);
                        }
                    }
                }
                visitMethod.visitEnd();
            }
        }
    }

    private final void processAnnotation(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, Annotation annotation) {
        Class<?> x = sha.x(sha.v(annotation));
        KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation = annotationVisitor.visitAnnotation(ReflectClassUtilKt.getClassId(x), new ReflectAnnotationSource(annotation));
        if (visitAnnotation != null) {
            INSTANCE.processAnnotationArguments(visitAnnotation, annotation, x);
        }
    }

    private final void processAnnotationArgumentValue(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Name name, Object obj) {
        Set set;
        Class<?> cls = obj.getClass();
        if (cls.equals(Class.class)) {
            annotationArgumentVisitor.visitClassLiteral(name, classLiteralValue((Class) obj));
            return;
        }
        set = ReflectKotlinClassKt.TYPES_ELIGIBLE_FOR_SIMPLE_VISIT;
        if (set.contains(cls)) {
            annotationArgumentVisitor.visit(name, obj);
            return;
        }
        if (ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(cls)) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            cls.getClass();
            ClassId classId = ReflectClassUtilKt.getClassId(cls);
            Name identifier = Name.identifier(((Enum) obj).name());
            identifier.getClass();
            annotationArgumentVisitor.visitEnum(name, classId, identifier);
            return;
        }
        if (Annotation.class.isAssignableFrom(cls)) {
            Class<?>[] interfaces = cls.getInterfaces();
            interfaces.getClass();
            Class<?> cls2 = (Class) ph0.Q(interfaces);
            cls2.getClass();
            KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation = annotationArgumentVisitor.visitAnnotation(name, ReflectClassUtilKt.getClassId(cls2));
            if (visitAnnotation == null) {
                return;
            }
            processAnnotationArguments(visitAnnotation, (Annotation) obj, cls2);
            return;
        }
        if (!cls.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls + "): " + obj);
        }
        KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray = annotationArgumentVisitor.visitArray(name);
        if (visitArray == null) {
            return;
        }
        Class<?> componentType = cls.getComponentType();
        int i = 0;
        if (componentType.isEnum()) {
            ClassId classId2 = ReflectClassUtilKt.getClassId(componentType);
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i < length) {
                Object obj2 = objArr[i];
                obj2.getClass();
                Name identifier2 = Name.identifier(((Enum) obj2).name());
                identifier2.getClass();
                visitArray.visitEnum(classId2, identifier2);
                i++;
            }
        } else if (componentType.equals(Class.class)) {
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i < length2) {
                Object obj3 = objArr2[i];
                obj3.getClass();
                visitArray.visitClassLiteral(classLiteralValue((Class) obj3));
                i++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i < length3) {
                Object obj4 = objArr3[i];
                KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation2 = visitArray.visitAnnotation(ReflectClassUtilKt.getClassId(componentType));
                if (visitAnnotation2 != null) {
                    obj4.getClass();
                    processAnnotationArguments(visitAnnotation2, (Annotation) obj4, componentType);
                }
                i++;
            }
        } else {
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i < length4) {
                visitArray.visit(objArr4[i]);
                i++;
            }
        }
        visitArray.visitEnd();
    }

    private final void processAnnotationArguments(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, null);
                invoke.getClass();
                Name identifier = Name.identifier(method.getName());
                identifier.getClass();
                processAnnotationArgumentValue(annotationArgumentVisitor, identifier, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        annotationArgumentVisitor.visitEnd();
    }

    public final void loadClassAnnotations(@NotNull Class<?> cls, @NotNull KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor) {
        cls.getClass();
        annotationVisitor.getClass();
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            processAnnotation(annotationVisitor, annotation);
        }
        annotationVisitor.visitEnd();
    }

    public final void visitMembers(@NotNull Class<?> cls, @NotNull KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        cls.getClass();
        memberVisitor.getClass();
        loadMethodAnnotations(cls, memberVisitor);
        loadConstructorAnnotations(cls, memberVisitor);
        loadFieldAnnotations(cls, memberVisitor);
    }
}
