package kotlin.reflect.jvm.internal.impl.types;

import defpackage.xka;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4 extends xka implements Function1<TypeCheckerState.ForkPointContext, Unit> {
    final /* synthetic */ TypeCheckerState $state;
    final /* synthetic */ SimpleTypeMarker $superType;
    final /* synthetic */ List<SimpleTypeMarker> $supertypesWithSameConstructor;
    final /* synthetic */ TypeSystemContext $this_with;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends xka implements Function0<Boolean> {
        final /* synthetic */ TypeCheckerState $state;
        final /* synthetic */ SimpleTypeMarker $subTypeArguments;
        final /* synthetic */ SimpleTypeMarker $superType;
        final /* synthetic */ TypeSystemContext $this_with;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
            super(0);
            this.$state = typeCheckerState;
            this.$this_with = typeSystemContext;
            this.$subTypeArguments = simpleTypeMarker;
            this.$superType = simpleTypeMarker2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(AbstractTypeChecker.INSTANCE.isSubtypeForSameConstructor(this.$state, this.$this_with.asArgumentList(this.$subTypeArguments), this.$superType));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4(List<? extends SimpleTypeMarker> list, TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker) {
        super(1);
        this.$supertypesWithSameConstructor = list;
        this.$state = typeCheckerState;
        this.$this_with = typeSystemContext;
        this.$superType = simpleTypeMarker;
    }

    public final void invoke(@NotNull TypeCheckerState.ForkPointContext forkPointContext) {
        forkPointContext.getClass();
        Iterator<SimpleTypeMarker> it = this.$supertypesWithSameConstructor.iterator();
        while (it.hasNext()) {
            forkPointContext.fork(new AnonymousClass1(this.$state, this.$this_with, it.next(), this.$superType));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TypeCheckerState.ForkPointContext) obj);
        return Unit.a;
    }
}
