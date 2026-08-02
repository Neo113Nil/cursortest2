package kotlin.reflect.jvm.internal.impl.resolve;

import defpackage.xka;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1$1 extends xka implements Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean> {
    final /* synthetic */ CallableDescriptor $a;
    final /* synthetic */ CallableDescriptor $b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1$1(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        super(2);
        this.$a = callableDescriptor;
        this.$b = callableDescriptor2;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Boolean invoke(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2) {
        return Boolean.valueOf(Intrinsics.c(declarationDescriptor, this.$a) && Intrinsics.c(declarationDescriptor2, this.$b));
    }
}
