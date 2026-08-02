package kotlin.reflect.jvm.internal.impl.types;

import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2 extends xka implements Function1<KotlinType, Unit> {
    final /* synthetic */ AbstractTypeConstructor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2(AbstractTypeConstructor abstractTypeConstructor) {
        super(1);
        this.this$0 = abstractTypeConstructor;
    }

    public final void invoke(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        this.this$0.reportSupertypeLoopError(kotlinType);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KotlinType) obj);
        return Unit.a;
    }
}
