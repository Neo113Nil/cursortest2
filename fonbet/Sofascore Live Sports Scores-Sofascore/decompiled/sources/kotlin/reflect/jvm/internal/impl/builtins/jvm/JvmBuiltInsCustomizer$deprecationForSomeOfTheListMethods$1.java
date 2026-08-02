package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import defpackage.bf3;
import defpackage.dmi;
import defpackage.xka;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JvmBuiltInsCustomizer$deprecationForSomeOfTheListMethods$1 extends xka implements Function1<Pair<? extends String, ? extends String>, Annotations> {
    final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$deprecationForSomeOfTheListMethods$1(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(1);
        this.this$0 = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Annotations invoke(@NotNull Pair<String, String> pair) {
        ModuleDescriptor moduleDescriptor;
        pair.getClass();
        String str = (String) pair.a;
        String str2 = (String) pair.b;
        moduleDescriptor = this.this$0.moduleDescriptor;
        return Annotations.Companion.create(a.c(AnnotationUtilKt.createDeprecatedAnnotation$default(moduleDescriptor.getBuiltIns(), bf3.k("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), dmi.y(str2, "()"), null, true, 4, null)));
    }
}
