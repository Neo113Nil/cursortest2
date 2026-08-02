package ru.ozon.app.android.orderdetails.notificationbarrestriction.core;

import EN.a;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.orderdetails.notificationbarrestriction.data.NotificationBarRestrictionDTO;
import ru.ozon.app.android.orderdetails.notificationbarrestriction.di.NotificationBarRestrictionComponent;
import ru.ozon.app.android.orderdetails.notificationbarrestriction.presentation.NotificationBarRestrictionVI;
import ru.ozon.app.android.orderdetails.notificationbarrestriction.presentation.NotificationBarRestrictionViewHolder;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/orderdetails/notificationbarrestriction/core/NotificationBarRestrictionViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/orderdetails/notificationbarrestriction/di/NotificationBarRestrictionComponent;", "Lru/ozon/app/android/orderdetails/notificationbarrestriction/data/NotificationBarRestrictionDTO;", "Lru/ozon/app/android/orderdetails/notificationbarrestriction/presentation/NotificationBarRestrictionVI;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/orderdetails/notificationbarrestriction/data/NotificationBarRestrictionDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationBarRestrictionViewMapper extends OverlayWidgetScreenViewItemMapper2<NotificationBarRestrictionComponent, NotificationBarRestrictionDTO, NotificationBarRestrictionVI> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationBarRestrictionComponent widgetComponent$lambda$0(C7475g c7475g) {
        return NotificationBarRestrictionComponent.INSTANCE.create(c7475g);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<NotificationBarRestrictionVI> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new NotificationBarRestrictionViewHolder(container);
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<NotificationBarRestrictionComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(NotificationBarRestrictionComponent.class), new a(storage, 12));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<NotificationBarRestrictionVI> map(@NotNull NotificationBarRestrictionDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
