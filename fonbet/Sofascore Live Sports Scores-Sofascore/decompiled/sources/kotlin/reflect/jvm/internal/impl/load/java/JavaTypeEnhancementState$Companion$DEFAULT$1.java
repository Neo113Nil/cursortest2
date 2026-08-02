package kotlin.reflect.jvm.internal.impl.load.java;

import defpackage.duf;
import defpackage.nt8;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public /* synthetic */ class JavaTypeEnhancementState$Companion$DEFAULT$1 extends nt8 implements Function1<FqName, ReportLevel> {
    public static final JavaTypeEnhancementState$Companion$DEFAULT$1 INSTANCE = new JavaTypeEnhancementState$Companion$DEFAULT$1();

    public JavaTypeEnhancementState$Companion$DEFAULT$1() {
        super(1);
    }

    @Override // defpackage.nh2, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // defpackage.nh2
    @NotNull
    public final KDeclarationContainer getOwner() {
        return duf.a.getOrCreateKotlinPackage(JavaNullabilityAnnotationSettingsKt.class, "compiler.common.jvm");
    }

    @Override // defpackage.nh2
    @NotNull
    public final String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final ReportLevel invoke(@NotNull FqName fqName) {
        fqName.getClass();
        return JavaNullabilityAnnotationSettingsKt.getDefaultReportLevelForAnnotation(fqName);
    }
}
