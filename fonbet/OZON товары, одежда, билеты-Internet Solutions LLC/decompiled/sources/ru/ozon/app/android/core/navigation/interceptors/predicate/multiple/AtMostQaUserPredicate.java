package ru.ozon.app.android.core.navigation.interceptors.predicate.multiple;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.interceptors.predicate.core.InterceptorMultiplePredicate;
import ru.ozon.app.android.navigation.interceptors.predicate.core.InterceptorPredicate;
import ru.ozon.app.android.network.abtool.NetworkAtMostQaUserPredicate;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/core/navigation/interceptors/predicate/multiple/AtMostQaUserPredicate;", "Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorMultiplePredicate;", "Lru/ozon/app/android/network/abtool/NetworkAtMostQaUserPredicate;", "debugBuildPredicate", "Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorPredicate;", "qaFlavorPredicate", "autoTestUserPredicate", "qaUserPredicate", "<init>", "(Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorPredicate;Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorPredicate;Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorPredicate;Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorPredicate;)V", "mode", "Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorMultiplePredicate$Mode;", "getMode", "()Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorMultiplePredicate$Mode;", "predicates", "", "getPredicates", "()[Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorPredicate;", "[Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorPredicate;", "isDebugOrQaUser", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AtMostQaUserPredicate implements InterceptorMultiplePredicate, NetworkAtMostQaUserPredicate {

    @NotNull
    private final InterceptorPredicate autoTestUserPredicate;

    @NotNull
    private final InterceptorPredicate debugBuildPredicate;

    @NotNull
    private final InterceptorMultiplePredicate.Mode mode;

    @NotNull
    private final InterceptorPredicate[] predicates;

    @NotNull
    private final InterceptorPredicate qaFlavorPredicate;

    @NotNull
    private final InterceptorPredicate qaUserPredicate;

    public AtMostQaUserPredicate(@NotNull InterceptorPredicate debugBuildPredicate, @NotNull InterceptorPredicate qaFlavorPredicate, @NotNull InterceptorPredicate autoTestUserPredicate, @NotNull InterceptorPredicate qaUserPredicate) {
        Intrinsics.checkNotNullParameter(debugBuildPredicate, "debugBuildPredicate");
        Intrinsics.checkNotNullParameter(qaFlavorPredicate, "qaFlavorPredicate");
        Intrinsics.checkNotNullParameter(autoTestUserPredicate, "autoTestUserPredicate");
        Intrinsics.checkNotNullParameter(qaUserPredicate, "qaUserPredicate");
        this.debugBuildPredicate = debugBuildPredicate;
        this.qaFlavorPredicate = qaFlavorPredicate;
        this.autoTestUserPredicate = autoTestUserPredicate;
        this.qaUserPredicate = qaUserPredicate;
        this.mode = InterceptorMultiplePredicate.Mode.ANY;
        this.predicates = new InterceptorPredicate[]{debugBuildPredicate, qaFlavorPredicate, autoTestUserPredicate, qaUserPredicate};
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

    @Override // ru.ozon.app.android.network.abtool.NetworkAtMostQaUserPredicate
    public boolean isDebugOrQaUser() {
        return invoke();
    }
}
