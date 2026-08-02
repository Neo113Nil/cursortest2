package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation;

import A00.a;
import ER.a;
import a00.h;
import a00.j;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
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
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.data.HotelsPageButtonV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.di.HotelsPageButtonV5Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.view.HotelsPageButtonView;
import ru.ozon.app.android.travel.map.viewModel.HotelMapInfoViewModel;
import ru.ozon.app.android.travel.utils.scrollAnchor.ScrollAnchorViewModel;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5OverlayViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/di/HotelsPageButtonV5Component;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5Update;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsPageButtonV5OverlayViewMapper extends OverlayWidgetScreenViewItemMapper2<HotelsPageButtonV5Component, HotelsPageButtonV5DTO, HotelsPageButtonV5VO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<HotelsPageButtonV5Update>> supportedUpdates = C7714v.a0(HotelsPageButtonV5Update.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new HotelsPageButtonView(context);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<HotelsPageButtonV5VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        HotelsPageButtonV5WidgetAsyncViewModel hotelsPageButtonV5WidgetAsyncViewModel = component().getWidgetViewModelProvider().get();
        Intrinsics.checkNotNullExpressionValue(hotelsPageButtonV5WidgetAsyncViewModel, "get(...)");
        HotelsPageButtonV5WidgetAsyncViewModel hotelsPageButtonV5WidgetAsyncViewModel2 = hotelsPageButtonV5WidgetAsyncViewModel;
        h a02 = container.a0();
        ScrollAnchorViewModel scrollAnchorViewModel = (ScrollAnchorViewModel) ((w0) j.a(a02.a(), N.b(ScrollAnchorViewModel.class), new HotelsPageButtonV5OverlayViewMapper$createHolder$1(this)).getValue());
        h a03 = container.a0();
        HotelsPageButtonV5ViewModel hotelsPageButtonV5ViewModel = (HotelsPageButtonV5ViewModel) ((w0) j.a(a03.a(), N.b(HotelsPageButtonV5ViewModel.class), new HotelsPageButtonV5OverlayViewMapper$createHolder$2(this)).getValue());
        h a04 = container.a0();
        return new HotelsPageButtonV5WidgetViewHolder(hotelsPageButtonV5ViewModel, (HotelMapInfoViewModel) ((w0) j.a(a04.a(), N.b(HotelMapInfoViewModel.class), new HotelsPageButtonV5OverlayViewMapper$createHolder$3(this)).getValue()), hotelsPageButtonV5WidgetAsyncViewModel2, scrollAnchorViewModel, container, component().getCustomActionHandlersStoreFactory(), new a(2));
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<HotelsPageButtonV5Update>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<HotelsPageButtonV5Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return HotelsPageButtonV5Component.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    public HotelsPageButtonV5VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull HotelsPageButtonV5VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((update instanceof HotelsPageButtonV5Update ? (HotelsPageButtonV5Update) update : null) != null) {
            return HotelsPageButtonV5VO.copy$default(oldItem, 0L, ((HotelsPageButtonV5Update) update).getNewState(), null, 5, null);
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsPageButtonV5VO> map(@NotNull HotelsPageButtonV5DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
