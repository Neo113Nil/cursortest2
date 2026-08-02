package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.presentation;

import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.di.HotelsPageRoomsSearchFormComponent;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/presentation/HotelsPageRoomsSearchFormNoUiViewMapper;", "Lc20/r;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/presentation/HotelsPageRoomsSearchFormVI;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/di/HotelsPageRoomsSearchFormComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/di/HotelsPageRoomsSearchFormComponent;)V", "state", "Ll20/d;", "info", "", "map", "(Lkotlin/Unit;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/di/HotelsPageRoomsSearchFormComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageRoomsSearchFormNoUiViewMapper extends r<Unit, HotelsPageRoomsSearchFormVI> {

    @NotNull
    private final HotelsPageRoomsSearchFormComponent component;

    @NotNull
    private final r.a viewType;

    public HotelsPageRoomsSearchFormNoUiViewMapper(@NotNull HotelsPageRoomsSearchFormComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<HotelsPageRoomsSearchFormVI> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        HotelsPageRoomsSearchFormWidgetViewModel hotelsPageRoomsSearchFormWidgetViewModel = this.component.getWidgetViewModelProvider().get();
        Intrinsics.checkNotNullExpressionValue(hotelsPageRoomsSearchFormWidgetViewModel, "get(...)");
        return new HotelsPageRoomsSearchFormNoUiWidgetHolder(container, hotelsPageRoomsSearchFormWidgetViewModel);
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsPageRoomsSearchFormVI> map(@NotNull Unit state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
