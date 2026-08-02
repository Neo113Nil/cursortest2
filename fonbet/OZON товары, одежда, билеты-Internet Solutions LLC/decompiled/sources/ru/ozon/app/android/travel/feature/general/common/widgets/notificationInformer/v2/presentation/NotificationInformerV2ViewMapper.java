package ru.ozon.app.android.travel.feature.general.common.widgets.notificationInformer.v2.presentation;

import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7471c;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationInformer.v2.data.NotificationInformerV2DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationInformer.v2.data.NotificationInformerV2Mapper;
import ru.ozon.app.android.travel.utils.viewParentProvider.provider.ViewParentProvider;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0016j\b\u0012\u0004\u0012\u00020\u0002`\u00172\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationInformer/v2/presentation/NotificationInformerV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationInformer/v2/data/NotificationInformerV2DTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationInformer/v2/presentation/NotificationInformerV2VO;", "<init>", "()V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationInformer/v2/data/NotificationInformerV2DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Lru/ozon/app/android/travel/utils/viewParentProvider/provider/ViewParentProvider;", "viewParentProvider", "Lru/ozon/app/android/travel/utils/viewParentProvider/provider/ViewParentProvider;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NotificationInformerV2ViewMapper extends OverlayWidgetScreenViewItemMapper2 {
    public static final int $stable = ViewParentProvider.$stable;

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final ViewParentProvider viewParentProvider = new ViewParentProvider();

    @Override // c20.r
    @NotNull
    public AbstractC6065b<NotificationInformerV2VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(container.Z(), null, 1, null);
        if (asNotificationLayoutManager$default != null) {
            return new NotificationInformerV2WidgetHolder(container, this.viewParentProvider.provideParentViewGroup(container.Y()), asNotificationLayoutManager$default);
        }
        AbstractC6065b.INSTANCE.getClass();
        return AbstractC6065b.Companion.a();
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return C7471c.f70357c;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<NotificationInformerV2VO> map(@NotNull NotificationInformerV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return new NotificationInformerV2Mapper().invoke(state, info);
    }
}
