package ru.ozon.app.android.composer.network.join;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import We.B;
import We.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.join.JoinRequestsStrategy;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.interceptors.BXInterceptor;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B%\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/composer/network/join/JoinRequestsAppInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "LPc/a;", "Lru/ozon/app/android/composer/network/join/JoinRequestsStrategy$Enabled;", "enabledStrategyProvider", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureCheckerProvider", "<init>", "(LPc/a;LPc/a;)V", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "LPc/a;", "Lru/ozon/app/android/composer/network/join/JoinRequestsStrategy;", "strategy$delegate", "LSc/j;", "getStrategy", "()Lru/ozon/app/android/composer/network/join/JoinRequestsStrategy;", "strategy", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JoinRequestsAppInterceptor extends BXInterceptor {

    @NotNull
    private final a<JoinRequestsStrategy.Enabled> enabledStrategyProvider;

    /* renamed from: strategy$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j strategy;

    public JoinRequestsAppInterceptor(@NotNull a<JoinRequestsStrategy.Enabled> enabledStrategyProvider, @NotNull a<FeatureChecker> featureCheckerProvider) {
        Intrinsics.checkNotNullParameter(enabledStrategyProvider, "enabledStrategyProvider");
        Intrinsics.checkNotNullParameter(featureCheckerProvider, "featureCheckerProvider");
        this.enabledStrategyProvider = enabledStrategyProvider;
        this.strategy = k.b(new JoinRequestsAppInterceptor$strategy$2(featureCheckerProvider, this));
    }

    private final JoinRequestsStrategy getStrategy() {
        Object value = this.strategy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (JoinRequestsStrategy) value;
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return getStrategy().execute(chain);
    }
}
