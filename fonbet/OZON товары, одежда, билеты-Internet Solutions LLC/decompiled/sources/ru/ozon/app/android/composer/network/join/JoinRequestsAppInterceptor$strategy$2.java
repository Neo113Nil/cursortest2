package ru.ozon.app.android.composer.network.join;

import Pc.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.network.join.JoinRequestsStrategy;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.join.RequestsJoinEnabledFlag;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/composer/network/join/JoinRequestsStrategy;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/composer/network/join/JoinRequestsStrategy;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class JoinRequestsAppInterceptor$strategy$2 extends AbstractC7737t implements Function0<JoinRequestsStrategy> {
    final /* synthetic */ a<FeatureChecker> $featureCheckerProvider;
    final /* synthetic */ JoinRequestsAppInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JoinRequestsAppInterceptor$strategy$2(a<FeatureChecker> aVar, JoinRequestsAppInterceptor joinRequestsAppInterceptor) {
        super(0);
        this.$featureCheckerProvider = aVar;
        this.this$0 = joinRequestsAppInterceptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final JoinRequestsStrategy invoke() {
        a aVar;
        if (!this.$featureCheckerProvider.get().isEnabled(RequestsJoinEnabledFlag.INSTANCE)) {
            return JoinRequestsStrategy.Disabled.INSTANCE;
        }
        aVar = this.this$0.enabledStrategyProvider;
        return (JoinRequestsStrategy) aVar.get();
    }
}
