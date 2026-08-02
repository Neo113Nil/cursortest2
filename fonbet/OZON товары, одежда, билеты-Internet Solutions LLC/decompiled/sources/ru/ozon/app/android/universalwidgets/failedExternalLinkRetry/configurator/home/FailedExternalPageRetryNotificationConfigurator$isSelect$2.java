package ru.ozon.app.android.universalwidgets.failedExternalLinkRetry.configurator.home;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.version.AppVersionService;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FailedExternalPageRetryNotificationConfigurator$isSelect$2 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ FailedExternalPageRetryNotificationConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FailedExternalPageRetryNotificationConfigurator$isSelect$2(FailedExternalPageRetryNotificationConfigurator failedExternalPageRetryNotificationConfigurator) {
        super(0);
        this.this$0 = failedExternalPageRetryNotificationConfigurator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        AppVersionService appVersionService;
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references = this.this$0.getReferences();
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) ((references == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(NetworkComponentApi.class));
        return Boolean.valueOf((networkComponentApi == null || (appVersionService = networkComponentApi.getAppVersionService()) == null) ? false : AppVersionService.INSTANCE.isSelect(appVersionService));
    }
}
