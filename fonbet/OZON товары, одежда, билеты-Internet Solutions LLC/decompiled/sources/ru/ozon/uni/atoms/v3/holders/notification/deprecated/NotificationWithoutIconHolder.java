package ru.ozon.uni.atoms.v3.holders.notification.deprecated;

import EJ.a;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.notification.view.deprecated.NotificationView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.timer.TimerHolderKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/notification/deprecated/NotificationWithoutIconHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/notification/NotificationAtom$Notification;", "Lru/ozon/uni/android/atom/notification/view/deprecated/NotificationView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/notification/view/deprecated/NotificationView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationWithoutIconHolder extends AtomV3<NotificationAtom.Notification, NotificationView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationWithoutIconHolder(@NotNull NotificationView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        getContainerView().setOnClickListener(new a(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(NotificationWithoutIconHolder notificationWithoutIconHolder, View view) {
        AtomAction atomAction;
        NotificationAtom.Notification notification = (NotificationAtom.Notification) notificationWithoutIconHolder.getData();
        AtomActionDTO action = notification.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, notification.getTrackingInfo())) == null) {
            return;
        }
        notificationWithoutIconHolder.handleAction(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull NotificationAtom.Notification item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((NotificationWithoutIconHolder) item);
        NotificationView containerView = getContainerView();
        TimerHolderKt.bindOrGone(containerView.getTimer(), item.getTimer(), getOnAction());
        WrappedButtonHolderKt.bindOrGone(containerView.getButton(), item.getButton(), getOnAction());
        containerView.setTitle(item.getTitle());
        containerView.setSubtitle(item.getSubtitle());
        Boolean showDisclosure = item.getShowDisclosure();
        containerView.showDisclosure(showDisclosure != null ? showDisclosure.booleanValue() : false);
        getContainerView().setClickable(item.getAction() != null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationWithoutIconHolder(@NotNull Context context, String str) {
        this(new NotificationView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
