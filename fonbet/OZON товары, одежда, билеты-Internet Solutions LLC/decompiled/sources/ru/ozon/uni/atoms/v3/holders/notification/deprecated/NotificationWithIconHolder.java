package ru.ozon.uni.atoms.v3.holders.notification.deprecated;

import EI.a;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.notification.view.deprecated.NotificationWithIconView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;

@InterfaceC3999a
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0006H\u0002¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/notification/deprecated/NotificationWithIconHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "Lru/ozon/uni/android/atom/notification/view/deprecated/NotificationWithIconView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/notification/view/deprecated/NotificationWithIconView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "bindIcon", "isLocalIcon", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationWithIconHolder extends AtomV3<NotificationAtom.NotificationWithIcon, NotificationWithIconView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationWithIconHolder(@NotNull NotificationWithIconView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        getContainerView().setOnClickListener(new a(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(NotificationWithIconHolder notificationWithIconHolder, View view) {
        AtomAction atomAction;
        NotificationAtom.NotificationWithIcon notificationWithIcon = (NotificationAtom.NotificationWithIcon) notificationWithIconHolder.getData();
        AtomActionDTO action = notificationWithIcon.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, notificationWithIcon.getTrackingInfo())) == null) {
            return;
        }
        notificationWithIconHolder.handleAction(atomAction);
    }

    private final void bindIcon(NotificationAtom.NotificationWithIcon item) {
        NotificationWithIconView containerView = getContainerView();
        AtomConfig.INSTANCE.getImageLoader().load(containerView.getIcon(), item.getIcon());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setIconBackgroundColor(styleParser.parseColor(context, item.getIconBackgroundColor()));
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        containerView.setIconTintColor(styleParser.parseColor(context2, item.getIconTintColor()));
        containerView.setIconScale(isLocalIcon(item.getIcon()));
    }

    private final boolean isLocalIcon(String str) {
        return h.e0(str, "ic_", false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull NotificationAtom.NotificationWithIcon item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((NotificationWithIconHolder) item);
        NotificationWithIconView containerView = getContainerView();
        bindIcon(item);
        WrappedButtonHolderKt.bindOrGone(containerView.getButton(), item.getButton(), getOnAction());
        containerView.setTitle(item.getTitle());
        containerView.setSubtitle(item.getSubtitle());
        Boolean showDisclosure = item.getShowDisclosure();
        containerView.showDisclosure(showDisclosure != null ? showDisclosure.booleanValue() : false);
        containerView.setClickable(item.getAction() != null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationWithIconHolder(@NotNull Context context, String str) {
        this(new NotificationWithIconView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
