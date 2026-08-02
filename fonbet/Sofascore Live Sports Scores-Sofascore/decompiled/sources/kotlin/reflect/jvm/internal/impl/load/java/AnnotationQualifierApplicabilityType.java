package kotlin.reflect.jvm.internal.impl.load.java;

import defpackage.gz8;
import defpackage.jp5;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AnnotationQualifierApplicabilityType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ AnnotationQualifierApplicabilityType[] $VALUES;

    @NotNull
    private final String javaTarget;
    public static final AnnotationQualifierApplicabilityType METHOD_RETURN_TYPE = new AnnotationQualifierApplicabilityType("METHOD_RETURN_TYPE", 0, "METHOD");
    public static final AnnotationQualifierApplicabilityType VALUE_PARAMETER = new AnnotationQualifierApplicabilityType("VALUE_PARAMETER", 1, "PARAMETER");
    public static final AnnotationQualifierApplicabilityType FIELD = new AnnotationQualifierApplicabilityType("FIELD", 2, "FIELD");
    public static final AnnotationQualifierApplicabilityType TYPE_USE = new AnnotationQualifierApplicabilityType("TYPE_USE", 3, "TYPE_USE");
    public static final AnnotationQualifierApplicabilityType TYPE_PARAMETER_BOUNDS = new AnnotationQualifierApplicabilityType("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
    public static final AnnotationQualifierApplicabilityType TYPE_PARAMETER = new AnnotationQualifierApplicabilityType("TYPE_PARAMETER", 5, "TYPE_PARAMETER");

    private static final /* synthetic */ AnnotationQualifierApplicabilityType[] $values() {
        return new AnnotationQualifierApplicabilityType[]{METHOD_RETURN_TYPE, VALUE_PARAMETER, FIELD, TYPE_USE, TYPE_PARAMETER_BOUNDS, TYPE_PARAMETER};
    }

    static {
        AnnotationQualifierApplicabilityType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private AnnotationQualifierApplicabilityType(String str, int i, String str2) {
        this.javaTarget = str2;
    }

    public static AnnotationQualifierApplicabilityType valueOf(String str) {
        return (AnnotationQualifierApplicabilityType) Enum.valueOf(AnnotationQualifierApplicabilityType.class, str);
    }

    public static AnnotationQualifierApplicabilityType[] values() {
        return (AnnotationQualifierApplicabilityType[]) $VALUES.clone();
    }

    @NotNull
    public final String getJavaTarget() {
        return this.javaTarget;
    }
}
