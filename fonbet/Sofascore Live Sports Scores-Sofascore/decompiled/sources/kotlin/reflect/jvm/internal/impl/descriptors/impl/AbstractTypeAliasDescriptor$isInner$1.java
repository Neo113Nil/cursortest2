package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AbstractTypeAliasDescriptor$isInner$1 extends xka implements Function1<UnwrappedType, Boolean> {
    final /* synthetic */ AbstractTypeAliasDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeAliasDescriptor$isInner$1(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        super(1);
        this.this$0 = abstractTypeAliasDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(UnwrappedType unwrappedType) {
        boolean z;
        unwrappedType.getClass();
        if (!KotlinTypeKt.isError(unwrappedType)) {
            AbstractTypeAliasDescriptor abstractTypeAliasDescriptor = this.this$0;
            ClassifierDescriptor mo893getDeclarationDescriptor = unwrappedType.getConstructor().mo893getDeclarationDescriptor();
            if ((mo893getDeclarationDescriptor instanceof TypeParameterDescriptor) && !Intrinsics.c(((TypeParameterDescriptor) mo893getDeclarationDescriptor).getContainingDeclaration(), abstractTypeAliasDescriptor)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
