package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import defpackage.xka;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class GivenFunctionsMemberScope$allDescriptors$2 extends xka implements Function0<List<? extends DeclarationDescriptor>> {
    final /* synthetic */ GivenFunctionsMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GivenFunctionsMemberScope$allDescriptors$2(GivenFunctionsMemberScope givenFunctionsMemberScope) {
        super(0);
        this.this$0 = givenFunctionsMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<DeclarationDescriptor> invoke() {
        List createFakeOverrides;
        List<FunctionDescriptor> computeDeclaredFunctions = this.this$0.computeDeclaredFunctions();
        createFakeOverrides = this.this$0.createFakeOverrides(computeDeclaredFunctions);
        return CollectionsKt.w0(createFakeOverrides, computeDeclaredFunctions);
    }
}
