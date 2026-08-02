package kotlin.reflect.jvm.internal.impl.types;

import defpackage.xka;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AbstractTypeConstructor$ModuleViewTypeConstructor$refinedSupertypes$2 extends xka implements Function0<List<? extends KotlinType>> {
    final /* synthetic */ AbstractTypeConstructor.ModuleViewTypeConstructor this$0;
    final /* synthetic */ AbstractTypeConstructor this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$ModuleViewTypeConstructor$refinedSupertypes$2(AbstractTypeConstructor.ModuleViewTypeConstructor moduleViewTypeConstructor, AbstractTypeConstructor abstractTypeConstructor) {
        super(0);
        this.this$0 = moduleViewTypeConstructor;
        this.this$1 = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<KotlinType> invoke() {
        KotlinTypeRefiner kotlinTypeRefiner;
        kotlinTypeRefiner = this.this$0.kotlinTypeRefiner;
        return KotlinTypeRefinerKt.refineTypes(kotlinTypeRefiner, this.this$1.mo894getSupertypes());
    }
}
