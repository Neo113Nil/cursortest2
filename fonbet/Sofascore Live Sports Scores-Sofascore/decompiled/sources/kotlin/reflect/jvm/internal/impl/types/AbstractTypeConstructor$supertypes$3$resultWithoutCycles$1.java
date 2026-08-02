package kotlin.reflect.jvm.internal.impl.types;

import defpackage.xka;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1 extends xka implements Function1<TypeConstructor, Iterable<? extends KotlinType>> {
    final /* synthetic */ AbstractTypeConstructor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1(AbstractTypeConstructor abstractTypeConstructor) {
        super(1);
        this.this$0 = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Iterable<KotlinType> invoke(@NotNull TypeConstructor typeConstructor) {
        Collection computeNeighbours;
        typeConstructor.getClass();
        computeNeighbours = this.this$0.computeNeighbours(typeConstructor, false);
        return computeNeighbours;
    }
}
