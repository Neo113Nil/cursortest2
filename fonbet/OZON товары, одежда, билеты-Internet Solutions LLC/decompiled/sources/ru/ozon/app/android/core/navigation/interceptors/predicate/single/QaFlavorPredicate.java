package ru.ozon.app.android.core.navigation.interceptors.predicate.single;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.interceptors.predicate.core.InterceptorPredicate;
import ru.ozon.app.android.platform.flavor.FlavorType;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/core/navigation/interceptors/predicate/single/QaFlavorPredicate;", "Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorPredicate;", "flavorType", "Lru/ozon/app/android/platform/flavor/FlavorType;", "<init>", "(Lru/ozon/app/android/platform/flavor/FlavorType;)V", "invoke", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class QaFlavorPredicate implements InterceptorPredicate {

    @NotNull
    private final FlavorType flavorType;

    public QaFlavorPredicate(@NotNull FlavorType flavorType) {
        Intrinsics.checkNotNullParameter(flavorType, "flavorType");
        this.flavorType = flavorType;
    }

    @Override // ru.ozon.app.android.navigation.interceptors.predicate.core.InterceptorPredicate
    public boolean invoke() {
        return this.flavorType == FlavorType.f93213QA;
    }
}
