package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AbstractTypeAliasDescriptor$computeDefaultType$1 extends xka implements Function1<KotlinTypeRefiner, SimpleType> {
    final /* synthetic */ AbstractTypeAliasDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeAliasDescriptor$computeDefaultType$1(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        super(1);
        this.this$0 = abstractTypeAliasDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SimpleType invoke(KotlinTypeRefiner kotlinTypeRefiner) {
        ClassifierDescriptor refineDescriptor = kotlinTypeRefiner.refineDescriptor(this.this$0);
        if (refineDescriptor != null) {
            return refineDescriptor.getDefaultType();
        }
        return null;
    }
}
