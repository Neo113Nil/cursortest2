package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation;

import A00.a;
import Pc.a;
import WZ.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.n;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import h20.InterfaceC6786a;
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
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.view.NotificationSubscriptionView;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020*0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/di/NotificationSubscriptionComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/di/NotificationSubscriptionComponent;)V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO;Ll20/d;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/di/NotificationSubscriptionComponent;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionUpdateEvent;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "LPc/a;", "Lh20/a;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionViewMapper extends g<NotificationSubscriptionDTO, NotificationSubscriptionVO> {

    @NotNull
    private final NotificationSubscriptionComponent component;

    @NotNull
    private final List<Class<NotificationSubscriptionUpdateEvent>> supportedUpdates;

    public NotificationSubscriptionViewMapper(@NotNull NotificationSubscriptionComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.supportedUpdates = C7714v.a0(NotificationSubscriptionUpdateEvent.class);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof NotificationSubscriptionDTO)) {
            return false;
        }
        NotificationSubscriptionDTO notificationSubscriptionDTO = (NotificationSubscriptionDTO) state;
        if (notificationSubscriptionDTO.isSticky()) {
            return false;
        }
        return notificationSubscriptionDTO.getShouldSkipPermissionCheck() || n.e(this.component.getContext()).a();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<NotificationSubscriptionVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        NotificationSubscriptionView notificationSubscriptionView = (NotificationSubscriptionView) view;
        l X9 = container.X();
        InterfaceC7851b M11 = container.M();
        w0 a11 = new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                NotificationSubscriptionComponent notificationSubscriptionComponent;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                notificationSubscriptionComponent = NotificationSubscriptionViewMapper.this.component;
                NotificationSubscriptionViewModel notificationSubscriptionViewModel = notificationSubscriptionComponent.getViewModelProvider().get();
                Intrinsics.g(notificationSubscriptionViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return notificationSubscriptionViewModel;
            }
        }).a(NotificationSubscriptionViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new NotificationSubscriptionWidgetViewHolder(container, notificationSubscriptionView, X9, M11, (NotificationSubscriptionViewModel) a11);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        NotificationSubscriptionView notificationSubscriptionView = new NotificationSubscriptionView(context);
        notificationSubscriptionView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return notificationSubscriptionView;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<NotificationSubscriptionUpdateEvent>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return this.component.getWidgetViewModelProvider();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
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
