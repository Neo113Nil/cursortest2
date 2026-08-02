package kotlin.reflect.jvm.internal.impl.renderer;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DescriptorRendererImpl$appendTypeProjections$1 extends xka implements Function1<TypeProjection, CharSequence> {
    final /* synthetic */ DescriptorRendererImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$appendTypeProjections$1(DescriptorRendererImpl descriptorRendererImpl) {
        super(1);
        this.this$0 = descriptorRendererImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull TypeProjection typeProjection) {
        typeProjection.getClass();
        if (typeProjection.isStarProjection()) {
            return "*";
        }
        DescriptorRendererImpl descriptorRendererImpl = this.this$0;
        KotlinType type = typeProjection.getType();
        type.getClass();
        String renderType = descriptorRendererImpl.renderType(type);
        if (typeProjection.getProjectionKind() == Variance.INVARIANT) {
            return renderType;
        }
        return typeProjection.getProjectionKind() + ' ' + renderType;
    }
}
