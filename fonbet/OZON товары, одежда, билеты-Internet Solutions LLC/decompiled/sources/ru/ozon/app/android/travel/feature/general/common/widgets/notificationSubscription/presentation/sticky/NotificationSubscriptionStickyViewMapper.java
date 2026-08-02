package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.sticky;

import A00.a;
import WZ.l;
import androidx.core.app.n;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.data.NotificationSubscriptionDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.di.NotificationSubscriptionComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionUpdateEvent;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionViewModel;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionWidgetViewModel;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/sticky/NotificationSubscriptionStickyViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/di/NotificationSubscriptionComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/di/NotificationSubscriptionComponent;)V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/di/NotificationSubscriptionComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionUpdateEvent;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionStickyViewMapper extends r<NotificationSubscriptionDTO, NotificationSubscriptionVO> {

    @NotNull
    private final NotificationSubscriptionComponent component;

    @NotNull
    private final List<Class<NotificationSubscriptionUpdateEvent>> supportedUpdates;

    @NotNull
    private final r.a viewType;

    public NotificationSubscriptionStickyViewMapper(@NotNull NotificationSubscriptionComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
        this.supportedUpdates = C7714v.a0(NotificationSubscriptionUpdateEvent.class);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof NotificationSubscriptionDTO)) {
            return false;
        }
        NotificationSubscriptionDTO notificationSubscriptionDTO = (NotificationSubscriptionDTO) state;
        if (notificationSubscriptionDTO.isSticky()) {
            return notificationSubscriptionDTO.getShouldSkipPermissionCheck() || n.e(this.component.getContext()).a();
        }
        return false;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<NotificationSubscriptionVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        NotificationSubscriptionStickyViewMapper$sam$ru_ozon_composer_ui_widget_overlay_holder_ViewFactory$0 notificationSubscriptionStickyViewMapper$sam$ru_ozon_composer_ui_widget_overlay_holder_ViewFactory$0 = new NotificationSubscriptionStickyViewMapper$sam$ru_ozon_composer_ui_widget_overlay_holder_ViewFactory$0(NotificationSubscriptionStickyViewMapper$createHolder$viewFactory$1.INSTANCE);
        l X9 = container.X();
        NotificationSubscriptionWidgetViewModel notificationSubscriptionWidgetViewModel = this.component.getWidgetViewModelProvider().get();
        Intrinsics.checkNotNullExpressionValue(notificationSubscriptionWidgetViewModel, "get(...)");
        NotificationSubscriptionWidgetViewModel notificationSubscriptionWidgetViewModel2 = notificationSubscriptionWidgetViewModel;
        InterfaceC7851b M11 = container.M();
        w0 a11 = new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.sticky.NotificationSubscriptionStickyViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                NotificationSubscriptionComponent notificationSubscriptionComponent;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                notificationSubscriptionComponent = NotificationSubscriptionStickyViewMapper.this.component;
                NotificationSubscriptionViewModel notificationSubscriptionViewModel = notificationSubscriptionComponent.getViewModelProvider().get();
                Intrinsics.g(notificationSubscriptionViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return notificationSubscriptionViewModel;
            }
        }).a(NotificationSubscriptionViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new NotificationSubscriptionStickyWidgetViewHolder(container, notificationSubscriptionStickyViewMapper$sam$ru_ozon_composer_ui_widget_overlay_holder_ViewFactory$0, X9, notificationSubscriptionWidgetViewModel2, M11, (NotificationSubscriptionViewModel) a11);
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<NotificationSubscriptionUpdateEvent>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // c20.r, I00.d
    public NotificationSubscriptionVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull NotificationSubscriptionVO oldItem) {
        NotificationSubscriptionVO.State newState;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        NotificationSubscriptionUpdateEvent notificationSubscriptionUpdateEvent = update instanceof NotificationSubscriptionUpdateEvent ? (NotificationSubscriptionUpdateEvent) update : null;
        if (notificationSubscriptionUpdateEvent == null || (newState = notificationSubscriptionUpdateEvent.getNewState()) == null) {
            return null;
        }
        return NotificationSubscriptionVO.copy$default(oldItem, 0L, newState, 1, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<NotificationSubscriptionVO> map(@NotNull NotificationSubscriptionDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
