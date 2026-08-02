package ru.ozon.app.android.pdp.ui.configurators.ugc.selections;

import B90.B;
import Sc.InterfaceC4008j;
import Sc.k;
import android.os.Bundle;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReportAbuseResultNotificationBinder;
import ru.ozon.app.android.pdp.utils.DelegatesKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/RefreshSelectionConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "setRefreshResultListener", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", "", "requestKey$delegate", "LSc/j;", "getRequestKey", "()Ljava/lang/String;", "requestKey", "Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResultNotificationBinder;", "reportAbuseResultNotificationBinder$delegate", "getReportAbuseResultNotificationBinder", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResultNotificationBinder;", "reportAbuseResultNotificationBinder", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshSelectionConfigurator extends ComposerScreenConfig.PageConfigurator {

    /* renamed from: requestKey$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j requestKey = k.b(new RefreshSelectionConfigurator$requestKey$2(this));

    /* renamed from: reportAbuseResultNotificationBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j reportAbuseResultNotificationBinder = DelegatesKt.lazyUnsafe(new RefreshSelectionConfigurator$reportAbuseResultNotificationBinder$2(this));

    private final ReportAbuseResultNotificationBinder getReportAbuseResultNotificationBinder() {
        return (ReportAbuseResultNotificationBinder) this.reportAbuseResultNotificationBinder.getValue();
    }

    private final String getRequestKey() {
        return (String) this.requestKey.getValue();
    }

    private final void setRefreshResultListener() {
        G supportFragmentManager;
        r a11 = getContainer().a();
        if (a11 == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.n1(getRequestKey(), getContainer().f(), new B(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRefreshResultListener$lambda$0(RefreshSelectionConfigurator refreshSelectionConfigurator, String str, Bundle data) {
        InterfaceC7851b controller;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(data, "data");
        ConfiguratorReferences references = refreshSelectionConfigurator.getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.a(controller, null, null, null, null, 15);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        setRefreshResultListener();
        ReportAbuseResultNotificationBinder.setupFragmentResultListener$default(getReportAbuseResultNotificationBinder(), false, 1, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        G supportFragmentManager;
        Intrinsics.checkNotNullParameter(owner, "owner");
        r a11 = getContainer().a();
        if (a11 != null && (supportFragmentManager = a11.getSupportFragmentManager()) != null) {
            supportFragmentManager.s(getRequestKey());
        }
        getReportAbuseResultNotificationBinder().clearFragmentResultListener();
    }
}
