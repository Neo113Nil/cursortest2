package ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.presentation;

import a00.j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l10.v;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.data.NightsRangeSelectorV3DTO;
import ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.di.NightsRangeSelectorV3Component;
import ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.presentation.view.NightsRangeSelectorV3View;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3ViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/data/NightsRangeSelectorV3DTO;", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3VO;", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/di/NightsRangeSelectorV3Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/di/NightsRangeSelectorV3Component;)V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/data/NightsRangeSelectorV3DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3WidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3WidgetViewHolder;", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/view/NightsRangeSelectorV3View;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/view/NightsRangeSelectorV3View;", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/di/NightsRangeSelectorV3Component;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NightsRangeSelectorV3ViewMapper extends g<NightsRangeSelectorV3DTO, NightsRangeSelectorV3VO> {

    @NotNull
    private final NightsRangeSelectorV3Component component;

    public NightsRangeSelectorV3ViewMapper(@NotNull NightsRangeSelectorV3Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder, reason: merged with bridge method [inline-methods] */
    public k<NightsRangeSelectorV3VO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        v b02 = container.b0();
        return new NightsRangeSelectorV3WidgetViewHolder((NightsRangeSelectorV3View) view, (NightsRangeSelectorV3ViewModel) ((w0) j.a(b02.a(), N.b(NightsRangeSelectorV3ViewModel.class), new NightsRangeSelectorV3ViewMapper$createHolder$1(this)).getValue()), container, this.component.getCustomActionHandlersStoreFactory());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public NightsRangeSelectorV3View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        NightsRangeSelectorV3View nightsRangeSelectorV3View = new NightsRangeSelectorV3View(context);
        nightsRangeSelectorV3View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return nightsRangeSelectorV3View;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<NightsRangeSelectorV3VO> map(@NotNull NightsRangeSelectorV3DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
