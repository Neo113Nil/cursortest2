package ru.ozon.app.android.initializers.lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.flags.TrackerBackgroundModeFlags$TrackerForceSendingPerfAnalyticsOnMinimizeFlag;
import ru.ozon.app.android.logger.ForceSendingPerfAnalyticsUtilsKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storage.user.UserStatusStorage;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "countEvents", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ApplicationLifecycleObserver$onStop$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ ApplicationLifecycleObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApplicationLifecycleObserver$onStop$1(ApplicationLifecycleObserver applicationLifecycleObserver) {
        super(1);
        this.this$0 = applicationLifecycleObserver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        UserStatusStorage userStatusStorage;
        FeatureChecker featureChecker;
        userStatusStorage = this.this$0.userStatusStorage;
        if (userStatusStorage.getIsAutoTestUser()) {
            featureChecker = this.this$0.featureChecker;
            if (featureChecker.isEnabled(TrackerBackgroundModeFlags$TrackerForceSendingPerfAnalyticsOnMinimizeFlag.INSTANCE)) {
                return;
            }
            ForceSendingPerfAnalyticsUtilsKt.printForcedSendingAnalyticsLog(i11);
        }
    }
}
