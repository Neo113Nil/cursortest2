package ru.ozon.app.android.favorites.domain.notification;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0011\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00040\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/favorites/domain/notification/NotificationDelegate;", "", "Landroid/view/ViewGroup;", "parent", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroid/view/ViewGroup;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "", "", "trackingPayloads", "handle", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/util/Map;)V", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "parentRef", "Ljava/lang/ref/WeakReference;", "lifecycleOwnerRef", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationDelegate {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WeakReference<J> lifecycleOwnerRef;

    @NotNull
    private final WeakReference<ViewGroup> parentRef;

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationDelegate(@NotNull ViewGroup parent, @NotNull J lifecycleOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        this.parentRef = new WeakReference<>(parent);
        this.lifecycleOwnerRef = new WeakReference<>(lifecycleOwner);
    }

    public final void handle(NotificationModelWrapper notification, Map<String, String> trackingPayloads) {
        J j11;
        if (notification == null) {
            return;
        }
        if (trackingPayloads != null) {
            this.actionHandler.invoke(new AtomAction.AppendPayloads(trackingPayloads, null, 2, null));
        }
        ViewGroup viewGroup = this.parentRef.get();
        if (viewGroup == null || (j11 = this.lifecycleOwnerRef.get()) == null) {
            return;
        }
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(notification));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager, notification, j11, this.actionHandler).show();
    }
}
