package kotlin.reflect.jvm.internal.impl.types;

import defpackage.duf;
import defpackage.fuf;
import defpackage.kef;
import defpackage.xnf;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AnnotationsTypeAttributeKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;

    @NotNull
    private static final xnf annotationsAttribute$delegate;

    static {
        fuf fufVar = duf.a;
        $$delegatedProperties = new KProperty[]{fufVar.property1(new kef(fufVar.getOrCreateKotlinPackage(AnnotationsTypeAttributeKt.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};
        xnf generateNullableAccessor = TypeAttributes.Companion.generateNullableAccessor(fufVar.getOrCreateKotlinClass(AnnotationsTypeAttribute.class));
        generateNullableAccessor.getClass();
        annotationsAttribute$delegate = generateNullableAccessor;
    }

    @NotNull
    public static final Annotations getAnnotations(@NotNull TypeAttributes typeAttributes) {
        Annotations annotations;
        typeAttributes.getClass();
        AnnotationsTypeAttribute annotationsAttribute = getAnnotationsAttribute(typeAttributes);
        return (annotationsAttribute == null || (annotations = annotationsAttribute.getAnnotations()) == null) ? Annotations.Companion.getEMPTY() : annotations;
    }

    @Nullable
    public static final AnnotationsTypeAttribute getAnnotationsAttribute(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return (AnnotationsTypeAttribute) annotationsAttribute$delegate.getValue(typeAttributes, $$delegatedProperties[0]);
    }
}
