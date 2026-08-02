package ru.ozon.uni.atoms.v3.holders.notification;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.atom.notification.view.NotificationBarView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/v3/holders/notification/NotificationHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NotificationHolderKt$bind$provider$1 extends AbstractC7737t implements Function0<NotificationHolder> {
    final /* synthetic */ NotificationBarView $this_bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationHolderKt$bind$provider$1(NotificationBarView notificationBarView) {
        super(0);
        this.$this_bind = notificationBarView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NotificationHolder invoke() {
        return new NotificationHolder(this.$this_bind, (String) null);
    }
}
