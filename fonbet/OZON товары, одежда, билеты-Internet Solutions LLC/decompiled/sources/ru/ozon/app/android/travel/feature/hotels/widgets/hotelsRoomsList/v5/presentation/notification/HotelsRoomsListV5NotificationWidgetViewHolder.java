package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.notification;

import android.view.View;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/notification/HotelsRoomsListV5NotificationWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/notification/HotelsRoomsListV5NotificationVO;", "Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "layoutManager", "Ll10/i;", "container", "<init>", "(Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;Ll10/i;)V", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/notification/HotelsRoomsListV5NotificationVO;)V", "Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "Ll10/i;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5NotificationWidgetViewHolder extends AbstractC6065b<HotelsRoomsListV5NotificationVO> {

    @NotNull
    private final i container;

    @NotNull
    private final NotificationLayoutManager layoutManager;
    private final View metricView;

    public HotelsRoomsListV5NotificationWidgetViewHolder(@NotNull NotificationLayoutManager layoutManager, @NotNull i container) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(container, "container");
        this.layoutManager = layoutManager;
        this.container = container;
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull HotelsRoomsListV5NotificationVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        NotificationBar make = NotificationBar.INSTANCE.make(this.layoutManager, item.getNotification(), this.container.K().f(), new HotelsRoomsListV5NotificationWidgetViewHolder$bind$1$notificationBar$1(item, this));
        make.addCallback(new NotificationBar.Callback() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.notification.HotelsRoomsListV5NotificationWidgetViewHolder$bind$1$1
            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onDismissed(NotificationBar notificationBar, NotificationBar.DismissReason dismissReason) {
                NotificationBar.Callback.DefaultImpls.onDismissed(this, notificationBar, dismissReason);
            }

            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onShown(NotificationBar notificationBar) {
                i iVar;
                Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
                NotificationBar.Callback.DefaultImpls.onShown(this, notificationBar);
                HotelsRoomsListV5NotificationVO boundData = HotelsRoomsListV5NotificationWidgetViewHolder.this.getBoundData();
                if (boundData != null) {
                    long id2 = boundData.getId();
                    iVar = HotelsRoomsListV5NotificationWidgetViewHolder.this.container;
                    iVar.M().m(id2);
                }
            }
        });
        make.show();
    }
}
