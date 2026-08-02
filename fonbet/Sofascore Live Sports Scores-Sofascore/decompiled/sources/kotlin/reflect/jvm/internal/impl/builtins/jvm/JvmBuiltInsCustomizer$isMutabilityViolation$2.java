package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JvmBuiltInsCustomizer$isMutabilityViolation$2 extends xka implements Function1<CallableMemberDescriptor, Boolean> {
    final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$isMutabilityViolation$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(1);
        this.this$0 = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        boolean z;
        JavaToKotlinClassMapper javaToKotlinClassMapper;
        if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.DECLARATION) {
            javaToKotlinClassMapper = this.this$0.j2kClassMapper;
            DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
            containingDeclaration.getClass();
            if (javaToKotlinClassMapper.isMutable((ClassDescriptor) containingDeclaration)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
