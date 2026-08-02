package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.header;

import A00.a;
import Ap.C2441a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
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
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.data.FiltersDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.di.FiltersComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.FiltersEmptyStateUpdate;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.FiltersUpdate;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.header.FiltersHeaderStickyViewMapper;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\r\u001a\u00020\u00032\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001fj\b\u0012\u0004\u0012\u00020\u0002` 2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R(\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070(0\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderStickyViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/di/FiltersComponent;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderVO;)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderVO;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FiltersHeaderStickyViewMapper extends OverlayWidgetScreenViewItemMapper2<FiltersComponent, FiltersDTO, FiltersHeaderVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(FiltersUpdate.class, FiltersEmptyStateUpdate.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$2(boolean z11, LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FiltersHeaderView filtersHeaderView = new FiltersHeaderView(context);
        Context context2 = filtersHeaderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        filtersHeaderView.setLayoutParams(new LinearLayout.LayoutParams(-1, ResourceExtKt.toPx(z11 ? 52 : 44, context2)));
        Context context3 = filtersHeaderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px = ResourceExtKt.toPx(8, context3);
        Context context4 = filtersHeaderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int px2 = ResourceExtKt.toPx(16, context4);
        if (z11) {
            px = px2;
        }
        filtersHeaderView.setPadding(0, px, 0, 0);
        return filtersHeaderView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiltersComponent widgetComponent$lambda$3(C7475g c7475g) {
        return new FiltersComponent(c7475g);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof FiltersDTO;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<FiltersHeaderVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        ComponentCallbacksC5392m b11 = container.K().b();
        final boolean z11 = false;
        if (b11 != null && (b11 instanceof ComposerFragment) && ((ComposerFragment) b11).getConfig().getBottomSheetConfig() != null) {
            z11 = true;
        }
        return new FiltersHeaderStickyViewHolder(container, component().getComposerStore(), component().getComposerUpdateMapper(), component().getTokenizedAnalytics(), component().getHandlersInhibitor(), component().getAsyncActionWidgetViewModel(), component().getAsyncMapper(), new InterfaceC6068e() { // from class: HO.a
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$2;
                createHolder$lambda$2 = FiltersHeaderStickyViewMapper.createHolder$lambda$2(z11, (LinearLayout) viewGroup);
                return createHolder$lambda$2;
            }
        });
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<FiltersComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(FiltersComponent.class), new C2441a(storage, 3));
    }

    @Override // c20.r, I00.d
    public FiltersHeaderVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull FiltersHeaderVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof FiltersUpdate) {
            return ((FiltersUpdate) update).getState().getHeader();
        }
        if (!(update instanceof FiltersEmptyStateUpdate)) {
            return null;
        }
        AsyncActionVO asyncAction = oldItem.getAsyncAction();
        return FiltersHeaderVO.copy$default(oldItem, 0L, asyncAction != null ? AsyncActionVO.copy$default(asyncAction, AsyncActionVO.AsyncBehaviorType.NO_ACTION, null, null, null, 14, null) : null, null, null, null, false, false, null, null, 509, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<FiltersHeaderVO> map(@NotNull FiltersDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getHeaderMapper().invoke(state, info);
    }
}
