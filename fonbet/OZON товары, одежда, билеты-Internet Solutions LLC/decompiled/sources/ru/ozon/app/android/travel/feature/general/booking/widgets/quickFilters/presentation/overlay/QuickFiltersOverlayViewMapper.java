package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.overlay;

import A00.a;
import ER.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTOKt;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.di.QuickFiltersComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersUpdate;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.view.QuickFiltersView;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionVO;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R&\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/overlay/QuickFiltersOverlayViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/di/QuickFiltersComponent;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO;", "<init>", "()V", "state", "", "isOverlayWidget", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO;)Z", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO;", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO;Ll20/d;)Ljava/util/List;", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class QuickFiltersOverlayViewMapper extends OverlayWidgetScreenViewItemMapper2<QuickFiltersComponent, QuickFiltersDTO, QuickFiltersVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<QuickFiltersUpdate>> supportedUpdates = C7714v.a0(QuickFiltersUpdate.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        QuickFiltersView quickFiltersView = new QuickFiltersView(context);
        quickFiltersView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return quickFiltersView;
    }

    private final boolean isOverlayWidget(QuickFiltersDTO state) {
        return QuickFiltersDTOKt.getBehaviour(state) == QuickFiltersDTO.StickyBehavior.STATIC_HEADER || state.getStickyBehavior() == QuickFiltersDTO.StickyBehavior.STATIC_STICKY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuickFiltersComponent widgetComponent$lambda$2(C7475g c7475g) {
        return new QuickFiltersComponent(c7475g);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof QuickFiltersDTO) && isOverlayWidget((QuickFiltersDTO) state);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<QuickFiltersVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new QuickFiltersOverlayWidgetViewHolder(container, component().getAsyncActionWidgetViewModel(), component().getCustomActionHandlersStoreFactory(), new a(1));
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<QuickFiltersUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<QuickFiltersComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(QuickFiltersComponent.class), new BV.a(storage, 3));
    }

    @Override // c20.r, I00.d
    public QuickFiltersVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull QuickFiltersVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        AsyncActionVO asyncActionVO = null;
        if (!(update instanceof QuickFiltersUpdate)) {
            return null;
        }
        QuickFiltersUpdate quickFiltersUpdate = (QuickFiltersUpdate) update;
        QuickFiltersVO.QuickFiltersState state = quickFiltersUpdate.getState();
        AsyncActionVO asyncAction = quickFiltersUpdate.getState().getAsyncAction();
        if (asyncAction != null) {
            AsyncActionVO asyncAction2 = oldItem.getState().getAsyncAction();
            asyncActionVO = AsyncActionVO.copy$default(asyncAction, null, asyncAction2 != null ? asyncAction2.getAsyncData() : null, null, null, 13, null);
        }
        return QuickFiltersVO.copy$default(oldItem, 0L, QuickFiltersVO.QuickFiltersState.copy$default(state, asyncActionVO, null, null, null, null, false, null, null, null, 0, null, false, 4094, null), 1, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<QuickFiltersVO> map(@NotNull QuickFiltersDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
