package ru.ozon.app.android.pdp.ui.configurators.ugc.commentsList;

import Sc.InterfaceC4008j;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReportAbuseResultNotificationBinder;
import ru.ozon.app.android.pdp.utils.DelegatesKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/commentsList/CommentsListConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResultNotificationBinder;", "reportAbuseResultNotificationBinder$delegate", "LSc/j;", "getReportAbuseResultNotificationBinder", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResultNotificationBinder;", "reportAbuseResultNotificationBinder", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommentsListConfigurator extends ComposerScreenConfig.PageConfigurator {

    /* renamed from: reportAbuseResultNotificationBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j reportAbuseResultNotificationBinder = DelegatesKt.lazyUnsafe(new CommentsListConfigurator$reportAbuseResultNotificationBinder$2(this));

    private final ReportAbuseResultNotificationBinder getReportAbuseResultNotificationBinder() {
        return (ReportAbuseResultNotificationBinder) this.reportAbuseResultNotificationBinder.getValue();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        getReportAbuseResultNotificationBinder().setupFragmentResultListener(true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        getReportAbuseResultNotificationBinder().clearFragmentResultListener();
    }
}
