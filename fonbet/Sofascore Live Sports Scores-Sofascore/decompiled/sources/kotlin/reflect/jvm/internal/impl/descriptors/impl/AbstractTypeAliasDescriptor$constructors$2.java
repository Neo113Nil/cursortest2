package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import defpackage.xka;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AbstractTypeAliasDescriptor$constructors$2 extends xka implements Function0<Collection<? extends TypeAliasConstructorDescriptor>> {
    final /* synthetic */ AbstractTypeAliasDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeAliasDescriptor$constructors$2(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        super(0);
        this.this$0 = abstractTypeAliasDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Collection<TypeAliasConstructorDescriptor> invoke() {
        return this.this$0.getTypeAliasConstructors();
    }
}
