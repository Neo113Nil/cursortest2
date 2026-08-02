package ru.ozon.app.android.pdp.widgets.helpfulHints.presentation;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.t;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class HelpfulHintsViewHolder$observeNotification$1$1 extends AbstractC7737t implements Function1<NotificationAtom.NotificationWithIcon, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ t $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HelpfulHintsViewHolder$observeNotification$1$1(t tVar, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$this_with = tVar;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NotificationAtom.NotificationWithIcon notificationWithIcon) {
        invoke2(notificationWithIcon);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NotificationAtom.NotificationWithIcon notificationWithIcon) {
        ComponentCallbacksC5392m b11 = this.$this_with.b();
        View view = b11 != null ? b11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        Intrinsics.f(notificationWithIcon);
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(notificationWithIcon));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager, notificationWithIcon, this.$this_with.d(), this.$actionHandler).show();
    }
}
