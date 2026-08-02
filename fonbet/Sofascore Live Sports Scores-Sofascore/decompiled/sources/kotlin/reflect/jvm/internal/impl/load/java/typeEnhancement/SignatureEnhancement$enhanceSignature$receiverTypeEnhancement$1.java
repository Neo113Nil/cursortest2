package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 extends xka implements Function1<CallableMemberDescriptor, KotlinType> {
    public static final SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 INSTANCE = new SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1();

    public SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final KotlinType invoke(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        extensionReceiverParameter.getClass();
        KotlinType type = extensionReceiverParameter.getType();
        type.getClass();
        return type;
    }
}
