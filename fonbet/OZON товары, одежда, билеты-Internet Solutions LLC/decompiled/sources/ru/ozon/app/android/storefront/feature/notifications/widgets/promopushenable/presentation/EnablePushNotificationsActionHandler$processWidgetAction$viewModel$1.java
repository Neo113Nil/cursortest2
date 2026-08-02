package ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation;

import Pc.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableViewModel;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableViewModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class EnablePushNotificationsActionHandler$processWidgetAction$viewModel$1 extends AbstractC7737t implements Function0<PromoPushEnableViewModel> {
    final /* synthetic */ EnablePushNotificationsActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnablePushNotificationsActionHandler$processWidgetAction$viewModel$1(EnablePushNotificationsActionHandler enablePushNotificationsActionHandler) {
        super(0);
        this.this$0 = enablePushNotificationsActionHandler;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PromoPushEnableViewModel invoke() {
        a aVar;
        aVar = this.this$0.viewModelProvider;
        return (PromoPushEnableViewModel) aVar.get();
    }
}
