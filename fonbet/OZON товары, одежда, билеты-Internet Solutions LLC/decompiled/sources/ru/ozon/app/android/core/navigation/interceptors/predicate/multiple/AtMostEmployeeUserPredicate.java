package ru.ozon.app.android.core.navigation.interceptors.predicate.multiple;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.interceptors.predicate.core.InterceptorMultiplePredicate;
import ru.ozon.app.android.navigation.interceptors.predicate.core.InterceptorPredicate;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fX\u0096\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/core/navigation/interceptors/predicate/multiple/AtMostEmployeeUserPredicate;", "Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorMultiplePredicate;", "atMostQaUserPredicate", "employeeUserPredicate", "Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorPredicate;", "<init>", "(Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorMultiplePredicate;Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorPredicate;)V", "mode", "Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorMultiplePredicate$Mode;", "getMode", "()Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorMultiplePredicate$Mode;", "predicates", "", "getPredicates", "()[Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorPredicate;", "[Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorPredicate;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AtMostEmployeeUserPredicate implements InterceptorMultiplePredicate {

    @NotNull
    private final InterceptorMultiplePredicate atMostQaUserPredicate;

    @NotNull
    private final InterceptorPredicate employeeUserPredicate;

    @NotNull
    private final InterceptorMultiplePredicate.Mode mode;

    @NotNull
    private final InterceptorPredicate[] predicates;

    public AtMostEmployeeUserPredicate(@NotNull InterceptorMultiplePredicate atMostQaUserPredicate, @NotNull InterceptorPredicate employeeUserPredicate) {
        Intrinsics.checkNotNullParameter(atMostQaUserPredicate, "atMostQaUserPredicate");
        Intrinsics.checkNotNullParameter(employeeUserPredicate, "employeeUserPredicate");
        this.atMostQaUserPredicate = atMostQaUserPredicate;
        this.employeeUserPredicate = employeeUserPredicate;
        this.mode = InterceptorMultiplePredicate.Mode.ANY;
        this.predicates = new InterceptorPredicate[]{atMostQaUserPredicate, employeeUserPredicate};
    }

    @Override // ru.ozon.app.android.navigation.interceptors.predicate.core.InterceptorMultiplePredicate
    @NotNull
    public InterceptorMultiplePredicate.Mode getMode() {
        return this.mode;
    }

    @Override // ru.ozon.app.android.navigation.interceptors.predicate.core.InterceptorMultiplePredicate
    @NotNull
    public InterceptorPredicate[] getPredicates() {
        return this.predicates;
    }

    @Override // ru.ozon.app.android.navigation.interceptors.predicate.core.InterceptorMultiplePredicate, ru.ozon.app.android.navigation.interceptors.predicate.core.InterceptorPredicate
    public boolean invoke() {
        return InterceptorMultiplePredicate.DefaultImpls.invoke(this);
    }
}
