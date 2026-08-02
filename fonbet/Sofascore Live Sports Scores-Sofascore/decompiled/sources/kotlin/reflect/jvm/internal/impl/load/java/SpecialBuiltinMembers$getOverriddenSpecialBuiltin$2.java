package kotlin.reflect.jvm.internal.impl.load.java;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2 extends xka implements Function1<CallableMemberDescriptor, Boolean> {
    public static final SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2 INSTANCE = new SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2();

    public SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return Boolean.valueOf(KotlinBuiltIns.isBuiltIn(callableMemberDescriptor) && BuiltinMethodsWithSpecialGenericSignature.getSpecialSignatureInfo(callableMemberDescriptor) != null);
    }
}
