package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class NewKotlinTypeCheckerImpl implements NewKotlinTypeChecker {

    @NotNull
    private final KotlinTypePreparator kotlinTypePreparator;

    @NotNull
    private final KotlinTypeRefiner kotlinTypeRefiner;

    @NotNull
    private final OverridingUtil overridingUtil;

    public NewKotlinTypeCheckerImpl(@NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull KotlinTypePreparator kotlinTypePreparator) {
        kotlinTypeRefiner.getClass();
        kotlinTypePreparator.getClass();
        this.kotlinTypeRefiner = kotlinTypeRefiner;
        this.kotlinTypePreparator = kotlinTypePreparator;
        OverridingUtil createWithTypeRefiner = OverridingUtil.createWithTypeRefiner(getKotlinTypeRefiner());
        createWithTypeRefiner.getClass();
        this.overridingUtil = createWithTypeRefiner;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    public boolean equalTypes(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        kotlinType.getClass();
        kotlinType2.getClass();
        return equalTypes(ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(false, false, null, getKotlinTypePreparator(), getKotlinTypeRefiner(), 6, null), kotlinType.unwrap(), kotlinType2.unwrap());
    }

    @NotNull
    public KotlinTypePreparator getKotlinTypePreparator() {
        return this.kotlinTypePreparator;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    @NotNull
    public KotlinTypeRefiner getKotlinTypeRefiner() {
        return this.kotlinTypeRefiner;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    @NotNull
    public OverridingUtil getOverridingUtil() {
        return this.overridingUtil;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    public boolean isSubtypeOf(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        kotlinType.getClass();
        kotlinType2.getClass();
        return isSubtypeOf(ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(true, false, null, getKotlinTypePreparator(), getKotlinTypeRefiner(), 6, null), kotlinType.unwrap(), kotlinType2.unwrap());
    }

    public /* synthetic */ NewKotlinTypeCheckerImpl(KotlinTypeRefiner kotlinTypeRefiner, KotlinTypePreparator kotlinTypePreparator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinTypeRefiner, (i & 2) != 0 ? KotlinTypePreparator.Default.INSTANCE : kotlinTypePreparator);
    }

    public final boolean equalTypes(@NotNull TypeCheckerState typeCheckerState, @NotNull UnwrappedType unwrappedType, @NotNull UnwrappedType unwrappedType2) {
        typeCheckerState.getClass();
        unwrappedType.getClass();
        unwrappedType2.getClass();
        return AbstractTypeChecker.INSTANCE.equalTypes(typeCheckerState, unwrappedType, unwrappedType2);
    }

    public final boolean isSubtypeOf(@NotNull TypeCheckerState typeCheckerState, @NotNull UnwrappedType unwrappedType, @NotNull UnwrappedType unwrappedType2) {
        typeCheckerState.getClass();
        unwrappedType.getClass();
        unwrappedType2.getClass();
        return AbstractTypeChecker.isSubtypeOf$default(AbstractTypeChecker.INSTANCE, typeCheckerState, unwrappedType, unwrappedType2, false, 8, null);
    }
}
