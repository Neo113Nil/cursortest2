package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.tabs;

import NM.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.data.AviaDetailedInfoV3DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.di.AviaDetailedInfoV3Component;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.AviaDetailedInfoV3ViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.view.AviaDetailedInfoV3TabsView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0019j\b\u0012\u0004\u0012\u00020\u0002`\u001a2\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/tabs/AviaDetailedInfoV3TabsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/di/AviaDetailedInfoV3Component;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/tabs/AviaDetailedInfoV3TabsVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AviaDetailedInfoV3TabsViewMapper extends OverlayWidgetScreenViewItemMapper2<AviaDetailedInfoV3Component, AviaDetailedInfoV3DTO, AviaDetailedInfoV3TabsVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$3(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FrameLayout frameLayout = new FrameLayout(parent.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        frameLayout.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        View aviaDetailedInfoV3TabsView = new AviaDetailedInfoV3TabsView(context2, null, 0, 0, 14, null);
        Context context3 = aviaDetailedInfoV3TabsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px = ResourceExtKt.toPx(8, context3);
        Context context4 = aviaDetailedInfoV3TabsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int px2 = ResourceExtKt.toPx(20, context4);
        Context context5 = aviaDetailedInfoV3TabsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, ResourceExtKt.toPx(44, context5));
        layoutParams.setMargins(px2, px, px2, 0);
        aviaDetailedInfoV3TabsView.setLayoutParams(layoutParams);
        frameLayout.addView(aviaDetailedInfoV3TabsView);
        return frameLayout;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof AviaDetailedInfoV3DTO) && ((AviaDetailedInfoV3DTO) state).getItems().size() > 1;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<AviaDetailedInfoV3TabsVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new AviaDetailedInfoV3TabsWidgetViewHolder(container, new a(2), (AviaDetailedInfoV3ViewModel) new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.tabs.AviaDetailedInfoV3TabsViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AviaDetailedInfoV3ViewModel viewModel = AviaDetailedInfoV3TabsViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(AviaDetailedInfoV3ViewModel.class));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AviaDetailedInfoV3Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AviaDetailedInfoV3Component.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<AviaDetailedInfoV3TabsVO> map(@NotNull AviaDetailedInfoV3DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getAviaDetailedInfoV3TabsMapper().invoke(state, info);
    }
}
