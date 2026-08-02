package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.mapper.overlay;

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
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.data.EmptyStateV2WidgetDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.di.EmptyStateV2Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.EmptyStateV2WidgetVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.holder.EmptyStateV2NoFiltersWidgetOverlayViewHolder;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\b\u001a\u00020\u00032\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001aj\b\u0012\u0004\u0012\u00020\u0002`\u001b2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/presentation/mapper/overlay/EmptyStateV2OverlayNoFiltersWidgetViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/di/EmptyStateV2Component;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/presentation/EmptyStateV2WidgetVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmptyStateV2OverlayNoFiltersWidgetViewMapper extends OverlayWidgetScreenViewItemMapper2<EmptyStateV2Component, EmptyStateV2WidgetDTO, EmptyStateV2WidgetVO> {
    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof EmptyStateV2WidgetDTO)) {
            return false;
        }
        EmptyStateV2WidgetDTO emptyStateV2WidgetDTO = (EmptyStateV2WidgetDTO) state;
        return emptyStateV2WidgetDTO.getAppearance() == EmptyStateV2WidgetDTO.WidgetAppearance.VIEW_APPEARANCE_OVERLAY && emptyStateV2WidgetDTO.getFiltersBlock() == null;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<EmptyStateV2WidgetVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new EmptyStateV2NoFiltersWidgetOverlayViewHolder(container);
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return r.a.SINGLE;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<EmptyStateV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return EmptyStateV2Component.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<EmptyStateV2WidgetVO> map(@NotNull EmptyStateV2WidgetDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
