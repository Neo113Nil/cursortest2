package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import defpackage.duf;
import defpackage.nt8;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public /* synthetic */ class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends nt8 implements Function1<ValueParameterDescriptor, Boolean> {
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 INSTANCE = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2();

    public DescriptorUtilsKt$declaresOrInheritsDefaultValue$2() {
        super(1);
    }

    @Override // defpackage.nh2, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "declaresDefaultValue";
    }

    @Override // defpackage.nh2
    @NotNull
    public final KDeclarationContainer getOwner() {
        return duf.a.getOrCreateKotlinClass(ValueParameterDescriptor.class);
    }

    @Override // defpackage.nh2
    @NotNull
    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull ValueParameterDescriptor valueParameterDescriptor) {
        valueParameterDescriptor.getClass();
        return Boolean.valueOf(valueParameterDescriptor.declaresDefaultValue());
    }
}
