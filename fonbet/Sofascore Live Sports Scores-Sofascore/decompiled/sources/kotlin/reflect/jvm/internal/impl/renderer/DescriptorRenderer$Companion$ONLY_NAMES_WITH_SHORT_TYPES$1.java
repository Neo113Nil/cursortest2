package kotlin.reflect.jvm.internal.impl.renderer;

import defpackage.rm5;
import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1 extends xka implements Function1<DescriptorRendererOptions, Unit> {
    public static final DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1 INSTANCE = new DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1();

    public DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1() {
        super(1);
    }

    public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRendererOptions.getClass();
        descriptorRendererOptions.setWithDefinedIn(false);
        descriptorRendererOptions.setModifiers(rm5.a);
        descriptorRendererOptions.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
        descriptorRendererOptions.setWithoutTypeParameters(true);
        descriptorRendererOptions.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.NONE);
        descriptorRendererOptions.setReceiverAfterName(true);
        descriptorRendererOptions.setRenderCompanionObjectName(true);
        descriptorRendererOptions.setWithoutSuperTypes(true);
        descriptorRendererOptions.setStartFromName(true);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DescriptorRendererOptions) obj);
        return Unit.a;
    }
}
