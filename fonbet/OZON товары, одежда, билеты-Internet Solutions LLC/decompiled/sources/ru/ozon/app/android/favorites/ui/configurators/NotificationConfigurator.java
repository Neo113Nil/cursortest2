package ru.ozon.app.android.favorites.ui.configurators;

import RZ.c;
import WZ.l;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.BaseActionHandler;
import ru.ozon.app.android.action.analytics.ActionUsageAnalyticsTracking;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.ui.notification.NotificationBundle;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/favorites/ui/configurators/NotificationConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "favoritesComposerActionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;LWZ/l;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "createActionHandler", "()Lkotlin/jvm/functions/Function1;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "LWZ/l;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final FavoritesComposerActionHandler favoritesComposerActionHandler;

    @NotNull
    private final l tokenizedAnalytics;
    public static final int $stable = 8;

    public NotificationConfigurator(@NotNull FavoritesComposerActionHandler favoritesComposerActionHandler, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(favoritesComposerActionHandler, "favoritesComposerActionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.favoritesComposerActionHandler = favoritesComposerActionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    private final Function1<AtomAction, Unit> createActionHandler() {
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return null;
        }
        return BaseActionHandler.Builder.INSTANCE.invoke(references.getNavigator(), new ActionUsageAnalyticsTracking.ByComponentStorage(references.getComposerWidgetComponentStorage())).onComposerAction(new NotificationConfigurator$createActionHandler$1(this.favoritesComposerActionHandler)).buildHandler();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        NotificationBundle notificationBundle;
        if (requestCode != 12513 || data == null || (notificationBundle = (NotificationBundle) data.getParcelableExtra("bundle")) == null) {
            return;
        }
        if (notificationBundle.getWidgetId() != null && notificationBundle.getTrackingData().d() != null) {
            this.tokenizedAnalytics.b(U.i(new Pair(notificationBundle.getWidgetId(), new c(notificationBundle.getTrackingData().d()))));
        }
        Map<String, String> payloads = notificationBundle.getPayloads();
        if (payloads != null) {
            this.tokenizedAnalytics.e(payloads);
        }
        ComponentCallbacksC5392m c11 = getContainer().c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            r a11 = getContainer().a();
            viewGroup = a11 != null ? ContextExtKt.getRootView(a11) : null;
            if (viewGroup == null) {
                return;
            }
        }
        this.favoritesComposerActionHandler.setContainer(new WeakReference<>(getContainer()));
        this.favoritesComposerActionHandler.setTrackingData(notificationBundle.getTrackingData());
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(notificationBundle.getNotification()));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager, notificationBundle.getNotification(), getContainer().i(), createActionHandler()).show();
    }
}
