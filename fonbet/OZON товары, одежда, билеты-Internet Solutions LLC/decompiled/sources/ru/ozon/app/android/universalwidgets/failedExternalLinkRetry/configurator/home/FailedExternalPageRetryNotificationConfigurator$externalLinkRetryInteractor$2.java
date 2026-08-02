package ru.ozon.app.android.universalwidgets.failedExternalLinkRetry.configurator.home;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.FailedExternalLinkRetryInteractor;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.di.FailedExternalLinkRetryComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/FailedExternalLinkRetryInteractor;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FailedExternalPageRetryNotificationConfigurator$externalLinkRetryInteractor$2 extends AbstractC7737t implements Function0<FailedExternalLinkRetryInteractor> {
    final /* synthetic */ FailedExternalPageRetryNotificationConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FailedExternalPageRetryNotificationConfigurator$externalLinkRetryInteractor$2(FailedExternalPageRetryNotificationConfigurator failedExternalPageRetryNotificationConfigurator) {
        super(0);
        this.this$0 = failedExternalPageRetryNotificationConfigurator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FailedExternalLinkRetryInteractor invoke() {
        FailedExternalLinkRetryComponentApi failedExternalLinkRetryComponentApi;
        failedExternalLinkRetryComponentApi = this.this$0.getFailedExternalLinkRetryComponentApi();
        if (failedExternalLinkRetryComponentApi != null) {
            return failedExternalLinkRetryComponentApi.getFailedExternalLinkRetryInteractor();
        }
        return null;
    }
}
