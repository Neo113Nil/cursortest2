package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import defpackage.xka;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JvmBuiltInsCustomizer$notConsideredDeprecation$2 extends xka implements Function0<Annotations> {
    final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$notConsideredDeprecation$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(0);
        this.this$0 = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Annotations invoke() {
        ModuleDescriptor moduleDescriptor;
        moduleDescriptor = this.this$0.moduleDescriptor;
        return Annotations.Companion.create(a.c(AnnotationUtilKt.createDeprecatedAnnotation$default(moduleDescriptor.getBuiltIns(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
    }
}
