package kotlin.reflect.jvm.internal.impl.builtins;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ReflectionTypes$kotlinReflectScope$2 extends xka implements Function0<MemberScope> {
    final /* synthetic */ ModuleDescriptor $module;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectionTypes$kotlinReflectScope$2(ModuleDescriptor moduleDescriptor) {
        super(0);
        this.$module = moduleDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final MemberScope invoke() {
        return this.$module.getPackage(StandardNames.KOTLIN_REFLECT_FQ_NAME).getMemberScope();
    }
}
