package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.presentation.overlay;

import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c20.r;
import com.google.android.material.appbar.AppBarLayout;
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
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.data.EmptyStateWidgetDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.di.EmptyStateComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.presentation.EmptyStateWidgetVO;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\b\u001a\u00020\u00032\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001aj\b\u0012\u0004\u0012\u00020\u0002`\u001b2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/presentation/overlay/EmptyStateOverlayWidgetViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/di/EmptyStateComponent;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/presentation/EmptyStateWidgetVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmptyStateOverlayWidgetViewMapper extends OverlayWidgetScreenViewItemMapper2<EmptyStateComponent, EmptyStateWidgetDTO, EmptyStateWidgetVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof EmptyStateWidgetDTO) && ((EmptyStateWidgetDTO) state).getAppearance() == EmptyStateWidgetDTO.ViewAppearance.VIEW_APPEARANCE_OVERLAY;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<EmptyStateWidgetVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        EmptyStateView emptyStateView = new EmptyStateView(L11, null, 0, 0, 14, null);
        Context context = emptyStateView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context);
        emptyStateView.setPadding(px, 0, px, 0);
        Context context2 = emptyStateView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        emptyStateView.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor1));
        emptyStateView.setFocusable(true);
        emptyStateView.setClickable(true);
        emptyStateView.setGravity(16);
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
        fVar.i(new AppBarLayout.ScrollingViewBehavior());
        emptyStateView.setLayoutParams(fVar);
        return new EmptyStateOverlayWidgetHolder(container, emptyStateView);
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<EmptyStateComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return EmptyStateComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<EmptyStateWidgetVO> map(@NotNull EmptyStateWidgetDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
