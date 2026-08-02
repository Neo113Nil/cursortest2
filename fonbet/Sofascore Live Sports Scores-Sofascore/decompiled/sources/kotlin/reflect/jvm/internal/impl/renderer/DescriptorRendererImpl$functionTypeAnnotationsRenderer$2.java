package kotlin.reflect.jvm.internal.impl.renderer;

import defpackage.xka;
import defpackage.y9h;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DescriptorRendererImpl$functionTypeAnnotationsRenderer$2 extends xka implements Function0<DescriptorRendererImpl> {
    final /* synthetic */ DescriptorRendererImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$functionTypeAnnotationsRenderer$2(DescriptorRendererImpl descriptorRendererImpl) {
        super(0);
        this.this$0 = descriptorRendererImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final DescriptorRendererImpl invoke() {
        DescriptorRenderer withOptions = this.this$0.withOptions(AnonymousClass1.INSTANCE);
        withOptions.getClass();
        return (DescriptorRendererImpl) withOptions;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends xka implements Function1<DescriptorRendererOptions, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
            descriptorRendererOptions.getClass();
            descriptorRendererOptions.setExcludedTypeAnnotationClasses(y9h.f(descriptorRendererOptions.getExcludedTypeAnnotationClasses(), b.j(StandardNames.FqNames.extensionFunctionType, StandardNames.FqNames.contextFunctionTypeParams)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((DescriptorRendererOptions) obj);
            return Unit.a;
        }
    }
}
