package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1 extends xka implements Function1<CallableMemberDescriptor, KotlinType> {
    final /* synthetic */ ValueParameterDescriptor $p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1(ValueParameterDescriptor valueParameterDescriptor) {
        super(1);
        this.$p = valueParameterDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final KotlinType invoke(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        KotlinType type = callableMemberDescriptor.getValueParameters().get(this.$p.getIndex()).getType();
        type.getClass();
        return type;
    }
}
