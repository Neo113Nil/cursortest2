package ru.ozon.app.android.ugc.core.configurator;

import Sc.InterfaceC4008j;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReportAbuseResultNotificationBinder;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.ScrollDirectionHandler;
import ru.ozon.app.android.pdp.utils.ScrollDirectionHandlerKt;
import ru.ozon.app.android.ugc.core.widgets.avatarAchievements.di.AvatarAchievementsComponent;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/configurator/SocialProfileConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/pdp/utils/ScrollDirectionHandler;", "scrollHandler", "Lru/ozon/app/android/pdp/utils/ScrollDirectionHandler;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResultNotificationBinder;", "reportAbuseResultNotificationBinder$delegate", "LSc/j;", "getReportAbuseResultNotificationBinder", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResultNotificationBinder;", "reportAbuseResultNotificationBinder", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SocialProfileConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final ScrollDirectionHandler scrollHandler = new ScrollDirectionHandler();

    /* renamed from: reportAbuseResultNotificationBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j reportAbuseResultNotificationBinder = DelegatesKt.lazyUnsafe(new SocialProfileConfigurator$reportAbuseResultNotificationBinder$2(this));

    private final ReportAbuseResultNotificationBinder getReportAbuseResultNotificationBinder() {
        return (ReportAbuseResultNotificationBinder) this.reportAbuseResultNotificationBinder.getValue();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references = getReferences();
        if (references != null && (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) != null) {
            AvatarAchievementsComponent avatarAchievementsComponent = (AvatarAchievementsComponent) composerWidgetComponentStorage.getComponent(AvatarAchievementsComponent.class);
            r a11 = getContainer().a();
            avatarAchievementsComponent.setDarkTheme(a11 != null ? ThemeExtKt.isDarkThemeActive(a11) : false);
        }
        getOwner().getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.ugc.core.configurator.SocialProfileConfigurator$onComposerInitialized$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                owner.getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner) {
                ViewGroup rootView;
                RecyclerView composerRecyclerViewOrNull;
                ScrollDirectionHandler scrollDirectionHandler;
                Intrinsics.checkNotNullParameter(owner, "owner");
                ComponentCallbacksC5392m c11 = SocialProfileConfigurator.this.getContainer().c();
                if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null || (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(rootView)) == null) {
                    return;
                }
                scrollDirectionHandler = SocialProfileConfigurator.this.scrollHandler;
                ScrollDirectionHandlerKt.removeScrollDirectionHandler(composerRecyclerViewOrNull, scrollDirectionHandler);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                ViewGroup rootView;
                RecyclerView composerRecyclerViewOrNull;
                ScrollDirectionHandler scrollDirectionHandler;
                Intrinsics.checkNotNullParameter(owner, "owner");
                ComponentCallbacksC5392m c11 = SocialProfileConfigurator.this.getContainer().c();
                if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null || (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(rootView)) == null) {
                    return;
                }
                scrollDirectionHandler = SocialProfileConfigurator.this.scrollHandler;
                ScrollDirectionHandlerKt.addScrollDirectionHandler(composerRecyclerViewOrNull, scrollDirectionHandler);
            }
        });
        getReportAbuseResultNotificationBinder().setupFragmentResultListener(true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        getReportAbuseResultNotificationBinder().clearFragmentResultListener();
    }
}
