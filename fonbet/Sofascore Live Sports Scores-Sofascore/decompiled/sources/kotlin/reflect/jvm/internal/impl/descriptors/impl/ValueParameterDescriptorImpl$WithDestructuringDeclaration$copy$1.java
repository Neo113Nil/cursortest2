package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import defpackage.xka;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1 extends xka implements Function0<List<? extends VariableDescriptor>> {
    final /* synthetic */ ValueParameterDescriptorImpl.WithDestructuringDeclaration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1(ValueParameterDescriptorImpl.WithDestructuringDeclaration withDestructuringDeclaration) {
        super(0);
        this.this$0 = withDestructuringDeclaration;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<VariableDescriptor> invoke() {
        return this.this$0.getDestructuringVariables();
    }
}
