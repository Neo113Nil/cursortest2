package ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.presentation;

import JL.b;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7471c;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.data.TravelSortingV2DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.data.TravelSortingV2Mapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.view.TravelSortingV2View;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelSorting/v2/presentation/TravelSortingV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelSorting/v2/data/TravelSortingV2DTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelSorting/v2/presentation/TravelSortingV2VO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelSorting/v2/data/TravelSortingV2DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "storage", "Lk20/c;", "widgetComponent", "(Lk20/g;)Lk20/c;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelSorting/v2/data/TravelSortingV2Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/travelSorting/v2/data/TravelSortingV2Mapper;", "mapper", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelSortingV2ViewMapper extends OverlayWidgetScreenViewItemMapper2 {

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper = k.b(TravelSortingV2ViewMapper$mapper$2.INSTANCE);

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TravelSortingV2View travelSortingV2View = new TravelSortingV2View(context);
        travelSortingV2View.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return travelSortingV2View;
    }

    private final TravelSortingV2Mapper getMapper() {
        return (TravelSortingV2Mapper) this.mapper.getValue();
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<TravelSortingV2VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new TravelSortingV2WidgetViewHolder(container, new b(1));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<TravelSortingV2VO> map(@NotNull TravelSortingV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7471c widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return C7471c.f70357c;
    }
}
