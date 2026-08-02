package ru.ozon.app.android.universalwidgets.failedExternalLinkRetry.configurator.home;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.analytics.FailedExternalLinkRetryAnalytics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FailedExternalPageRetryNotificationConfigurator$showNotificationIfNeed$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ String $retryLink;
    final /* synthetic */ FailedExternalPageRetryNotificationConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FailedExternalPageRetryNotificationConfigurator$showNotificationIfNeed$1(FailedExternalPageRetryNotificationConfigurator failedExternalPageRetryNotificationConfigurator, String str) {
        super(1);
        this.this$0 = failedExternalPageRetryNotificationConfigurator;
        this.$retryLink = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        r4 = r3.this$0.getAnalytics();
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(AtomAction it) {
        FailedExternalLinkRetryAnalytics analytics;
        NotificationDTO notification;
        FailedExternalLinkRetryAnalytics analytics2;
        ComposerNavigator navigator;
        NotificationDTO notification2;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof AtomAction.Move)) {
            if (!(it instanceof AtomAction.ViewAction) || analytics == null) {
                return;
            }
            notification = this.this$0.getNotification();
            analytics.sendViewEvent(notification.getTitle());
            return;
        }
        analytics2 = this.this$0.getAnalytics();
        if (analytics2 != null) {
            notification2 = this.this$0.getNotification();
            analytics2.sendClickEvent(notification2.getTitle(), this.$retryLink);
        }
        ConfiguratorReferences references = this.this$0.getReferences();
        if (references == null || (navigator = references.getNavigator()) == null) {
            return;
        }
        ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, this.$retryLink, null, 2, null);
    }
}
