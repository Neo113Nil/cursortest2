package kotlin.reflect.jvm.internal.impl.types;

import defpackage.km5;
import defpackage.xka;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AbstractTypeConstructor$supertypes$3 extends xka implements Function1<AbstractTypeConstructor.Supertypes, Unit> {
    final /* synthetic */ AbstractTypeConstructor this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$2, reason: invalid class name */
    public static final class AnonymousClass2 extends xka implements Function1<TypeConstructor, Iterable<? extends KotlinType>> {
        final /* synthetic */ AbstractTypeConstructor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractTypeConstructor abstractTypeConstructor) {
            super(1);
            this.this$0 = abstractTypeConstructor;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Iterable<KotlinType> invoke(@NotNull TypeConstructor typeConstructor) {
            Collection computeNeighbours;
            typeConstructor.getClass();
            computeNeighbours = this.this$0.computeNeighbours(typeConstructor, true);
            return computeNeighbours;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$3(AbstractTypeConstructor abstractTypeConstructor) {
        super(1);
        this.this$0 = abstractTypeConstructor;
    }

    public final void invoke(@NotNull AbstractTypeConstructor.Supertypes supertypes) {
        supertypes.getClass();
        Collection<KotlinType> findLoopsInSupertypesAndDisconnect = this.this$0.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(this.this$0, supertypes.getAllSupertypes(), new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1(this.this$0), new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2(this.this$0));
        if (findLoopsInSupertypesAndDisconnect.isEmpty()) {
            KotlinType defaultSupertypeIfEmpty = this.this$0.defaultSupertypeIfEmpty();
            findLoopsInSupertypesAndDisconnect = defaultSupertypeIfEmpty != null ? a.c(defaultSupertypeIfEmpty) : null;
            if (findLoopsInSupertypesAndDisconnect == null) {
                findLoopsInSupertypesAndDisconnect = km5.a;
            }
        }
        if (this.this$0.getShouldReportCyclicScopeWithCompanionWarning()) {
            SupertypeLoopChecker supertypeLoopChecker = this.this$0.getSupertypeLoopChecker();
            AbstractTypeConstructor abstractTypeConstructor = this.this$0;
            supertypeLoopChecker.findLoopsInSupertypesAndDisconnect(abstractTypeConstructor, findLoopsInSupertypesAndDisconnect, new AnonymousClass2(abstractTypeConstructor), new AnonymousClass3(this.this$0));
        }
        AbstractTypeConstructor abstractTypeConstructor2 = this.this$0;
        List<KotlinType> list = findLoopsInSupertypesAndDisconnect instanceof List ? (List) findLoopsInSupertypesAndDisconnect : null;
        if (list == null) {
            list = CollectionsKt.S0(findLoopsInSupertypesAndDisconnect);
        }
        supertypes.setSupertypesWithoutCycles(abstractTypeConstructor2.processSupertypesWithoutCycles(list));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$3, reason: invalid class name */
    public static final class AnonymousClass3 extends xka implements Function1<KotlinType, Unit> {
        final /* synthetic */ AbstractTypeConstructor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AbstractTypeConstructor abstractTypeConstructor) {
            super(1);
            this.this$0 = abstractTypeConstructor;
        }

        public final void invoke(@NotNull KotlinType kotlinType) {
            kotlinType.getClass();
            this.this$0.reportScopesLoopError(kotlinType);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((KotlinType) obj);
            return Unit.a;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractTypeConstructor.Supertypes) obj);
        return Unit.a;
    }
}
