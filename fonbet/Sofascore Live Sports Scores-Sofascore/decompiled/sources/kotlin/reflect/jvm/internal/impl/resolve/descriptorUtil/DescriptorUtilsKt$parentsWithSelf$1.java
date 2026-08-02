package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DescriptorUtilsKt$parentsWithSelf$1 extends xka implements Function1<DeclarationDescriptor, DeclarationDescriptor> {
    public static final DescriptorUtilsKt$parentsWithSelf$1 INSTANCE = new DescriptorUtilsKt$parentsWithSelf$1();

    public DescriptorUtilsKt$parentsWithSelf$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final DeclarationDescriptor invoke(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return declarationDescriptor.getContainingDeclaration();
    }
}
