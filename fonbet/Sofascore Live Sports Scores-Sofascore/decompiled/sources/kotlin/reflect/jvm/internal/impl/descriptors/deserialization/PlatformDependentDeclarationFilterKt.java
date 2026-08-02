package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class PlatformDependentDeclarationFilterKt {

    @NotNull
    private static final FqName PLATFORM_DEPENDENT_ANNOTATION_FQ_NAME = new FqName("kotlin.internal.PlatformDependent");

    @NotNull
    public static final FqName getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME() {
        return PLATFORM_DEPENDENT_ANNOTATION_FQ_NAME;
    }
}
