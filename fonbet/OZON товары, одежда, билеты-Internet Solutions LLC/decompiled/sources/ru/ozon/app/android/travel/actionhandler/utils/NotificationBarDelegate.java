package ru.ozon.app.android.travel.actionhandler.utils;

import android.view.ViewGroup;
import androidx.lifecycle.J;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$string;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00020\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00040\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/utils/NotificationBarDelegate;", "", "Landroid/view/ViewGroup;", "parent", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroid/view/ViewGroup;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationDTO", "show", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "showDefaultError", "()V", "", "message", "showError", "(Ljava/lang/String;)V", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "parentRef", "Ljava/lang/ref/WeakReference;", "lifecycleOwnerRef", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotificationBarDelegate {
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WeakReference<J> lifecycleOwnerRef;

    @NotNull
    private final WeakReference<ViewGroup> parentRef;

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationBarDelegate(@NotNull ViewGroup parent, @NotNull J lifecycleOwner, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.actionHandler = function1;
        this.parentRef = new WeakReference<>(parent);
        this.lifecycleOwnerRef = new WeakReference<>(lifecycleOwner);
    }

    public final void show(@NotNull NotificationDTO notificationDTO) {
        J j11;
        NotificationLayoutManager asNotificationLayoutManager$default;
        Intrinsics.checkNotNullParameter(notificationDTO, "notificationDTO");
        ViewGroup viewGroup = this.parentRef.get();
        if (viewGroup == null || (j11 = this.lifecycleOwnerRef.get()) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notificationDTO, j11, this.actionHandler).show();
    }

    public final void showDefaultError() {
        show(new NotificationDTO(StringProvider.getString(R$string.error_flashbar_universal_network_error), null, null, null, null, null, null, null, null, NotificationDTO.Preset.WARNING, 510, null));
    }

    public final void showError(String message) {
        if (message == null) {
            message = StringProvider.getString(R$string.error_flashbar_universal_network_error);
        }
        show(new NotificationDTO(message, null, null, null, null, null, null, null, null, NotificationDTO.Preset.WARNING, 510, null));
    }

    public /* synthetic */ NotificationBarDelegate(ViewGroup viewGroup, J j11, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, j11, (i11 & 4) != 0 ? null : function1);
    }
}
