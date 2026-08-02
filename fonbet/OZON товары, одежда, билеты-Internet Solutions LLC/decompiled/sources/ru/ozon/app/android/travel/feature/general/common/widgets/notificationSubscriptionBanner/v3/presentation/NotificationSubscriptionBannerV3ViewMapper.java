package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.data.NotificationSubscriptionBannerV3DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.di.NotificationSubscriptionBannerV3Component;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020$2\b\u0010\u001e\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/di/NotificationSubscriptionBannerV3Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/di/NotificationSubscriptionBannerV3Component;)V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Lru/ozon/composer/ui/widget/l;", "viewItem", "", "constructLayout", "(Ll10/i;Lru/ozon/composer/ui/widget/l;)V", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "state", "Ll20/d;", "info", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/di/NotificationSubscriptionBannerV3Component;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionBannerV3ViewMapper extends g<NotificationSubscriptionBannerV3DTO, NotificationSubscriptionBannerV3VI> {

    @NotNull
    private final NotificationSubscriptionBannerV3Component component;

    public NotificationSubscriptionBannerV3ViewMapper(@NotNull NotificationSubscriptionBannerV3Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof NotificationSubscriptionBannerV3DTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public void constructLayout(@NotNull i container, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        w0 a11 = new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3ViewMapper$constructLayout$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                NotificationSubscriptionBannerV3Component notificationSubscriptionBannerV3Component;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                notificationSubscriptionBannerV3Component = NotificationSubscriptionBannerV3ViewMapper.this.component;
                NotificationSubscriptionBannerV3ViewModel notificationSubscriptionBannerV3ViewModel = notificationSubscriptionBannerV3Component.getViewModelProvider().get();
                Intrinsics.g(notificationSubscriptionBannerV3ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return notificationSubscriptionBannerV3ViewModel;
            }
        }).a(NotificationSubscriptionBannerV3ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        new NotificationSubscriptionBannerV3Delegate(container, (NotificationSubscriptionBannerV3ViewModel) a11).observeViewEffects();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<NotificationSubscriptionBannerV3VI> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        NotificationSubscriptionBannerV3View notificationSubscriptionBannerV3View = (NotificationSubscriptionBannerV3View) view;
        WZ.l X9 = container.X();
        w0 a11 = new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3ViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                NotificationSubscriptionBannerV3Component notificationSubscriptionBannerV3Component;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                notificationSubscriptionBannerV3Component = NotificationSubscriptionBannerV3ViewMapper.this.component;
                NotificationSubscriptionBannerV3ViewModel notificationSubscriptionBannerV3ViewModel = notificationSubscriptionBannerV3Component.getViewModelProvider().get();
                Intrinsics.g(notificationSubscriptionBannerV3ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return notificationSubscriptionBannerV3ViewModel;
            }
        }).a(NotificationSubscriptionBannerV3ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new NotificationSubscriptionBannerV3WidgetViewHolder(container, notificationSubscriptionBannerV3View, X9, (NotificationSubscriptionBannerV3ViewModel) a11, this.component.getHandlersInhibitor());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        NotificationSubscriptionBannerV3View notificationSubscriptionBannerV3View = new NotificationSubscriptionBannerV3View(context);
        notificationSubscriptionBannerV3View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return notificationSubscriptionBannerV3View;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(this.component.getDecoration());
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<NotificationSubscriptionBannerV3VI> map(@NotNull NotificationSubscriptionBannerV3DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
