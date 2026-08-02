package kotlin.reflect.jvm.internal.impl.renderer;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DescriptorRendererImpl$renderTypeConstructor$1 extends xka implements Function1<KotlinType, Object> {
    public static final DescriptorRendererImpl$renderTypeConstructor$1 INSTANCE = new DescriptorRendererImpl$renderTypeConstructor$1();

    public DescriptorRendererImpl$renderTypeConstructor$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Object invoke(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType instanceof StubTypeForBuilderInference ? ((StubTypeForBuilderInference) kotlinType).getOriginalTypeVariable() : kotlinType;
    }
}
