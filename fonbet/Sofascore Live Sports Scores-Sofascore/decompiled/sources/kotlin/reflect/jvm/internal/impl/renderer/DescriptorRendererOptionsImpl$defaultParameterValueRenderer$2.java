package kotlin.reflect.jvm.internal.impl.renderer;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2 extends xka implements Function1<ValueParameterDescriptor, String> {
    public static final DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2 INSTANCE = new DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2();

    public DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final String invoke(@NotNull ValueParameterDescriptor valueParameterDescriptor) {
        valueParameterDescriptor.getClass();
        return "...";
    }
}
