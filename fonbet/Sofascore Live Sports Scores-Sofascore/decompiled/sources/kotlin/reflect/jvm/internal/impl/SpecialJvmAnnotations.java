package kotlin.reflect.jvm.internal.impl;

import defpackage.asf;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class SpecialJvmAnnotations {

    @NotNull
    public static final SpecialJvmAnnotations INSTANCE = new SpecialJvmAnnotations();

    @NotNull
    private static final ClassId JAVA_LANG_ANNOTATION_REPEATABLE;

    @NotNull
    private static final Set<ClassId> SPECIAL_ANNOTATIONS;

    static {
        List j = b.j(JvmAnnotationNames.METADATA_FQ_NAME, JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION, JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION, JvmAnnotationNames.TARGET_ANNOTATION, JvmAnnotationNames.RETENTION_ANNOTATION, JvmAnnotationNames.DOCUMENTED_ANNOTATION);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = j.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(ClassId.topLevel((FqName) it.next()));
        }
        SPECIAL_ANNOTATIONS = linkedHashSet;
        ClassId classId = ClassId.topLevel(JvmAnnotationNames.REPEATABLE_ANNOTATION);
        classId.getClass();
        JAVA_LANG_ANNOTATION_REPEATABLE = classId;
    }

    private SpecialJvmAnnotations() {
    }

    @NotNull
    public final ClassId getJAVA_LANG_ANNOTATION_REPEATABLE() {
        return JAVA_LANG_ANNOTATION_REPEATABLE;
    }

    @NotNull
    public final Set<ClassId> getSPECIAL_ANNOTATIONS() {
        return SPECIAL_ANNOTATIONS;
    }

    public final boolean isAnnotatedWithContainerMetaAnnotation(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlinJvmBinaryClass.getClass();
        final asf asfVar = new asf();
        kotlinJvmBinaryClass.loadClassAnnotations(new KotlinJvmBinaryClass.AnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations$isAnnotatedWithContainerMetaAnnotation$1
            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            @Nullable
            public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId, @NotNull SourceElement sourceElement) {
                classId.getClass();
                sourceElement.getClass();
                if (!Intrinsics.c(classId, JvmAbi.INSTANCE.getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION())) {
                    return null;
                }
                asf.this.a = true;
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public void visitEnd() {
            }
        }, null);
        return asfVar.a;
    }
}
