package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JvmBuiltInsCustomizer$createMockJavaIoSerializableType$superTypes$1 extends xka implements Function0<KotlinType> {
    final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$createMockJavaIoSerializableType$superTypes$1(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(0);
        this.this$0 = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final KotlinType invoke() {
        ModuleDescriptor moduleDescriptor;
        moduleDescriptor = this.this$0.moduleDescriptor;
        SimpleType anyType = moduleDescriptor.getBuiltIns().getAnyType();
        anyType.getClass();
        return anyType;
    }
}
