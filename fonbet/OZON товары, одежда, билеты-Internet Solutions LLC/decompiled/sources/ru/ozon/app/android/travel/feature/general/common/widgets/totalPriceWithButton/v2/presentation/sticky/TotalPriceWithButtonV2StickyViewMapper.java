package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.sticky;

import AP.a;
import Vg.d;
import a00.j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l10.v;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.data.storage.utils.TravelPageStorageUtilsKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.data.TotalPriceWithButtonV2DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.di.TotalPriceWithButtonV2Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.TotalPriceWithButtonV2ViewModel;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.view.TotalPriceWithButtonV2StickyView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/sticky/TotalPriceWithButtonV2StickyViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2DTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/sticky/TotalPriceWithButtonV2StickyVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/di/TotalPriceWithButtonV2Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/di/TotalPriceWithButtonV2Component;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/di/TotalPriceWithButtonV2Component;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TotalPriceWithButtonV2StickyViewMapper extends r<TotalPriceWithButtonV2DTO, TotalPriceWithButtonV2StickyVO> {

    @NotNull
    private final TotalPriceWithButtonV2Component component;

    @NotNull
    private final r.a viewType;

    public TotalPriceWithButtonV2StickyViewMapper(@NotNull TotalPriceWithButtonV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$2(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TotalPriceWithButtonV2StickyView totalPriceWithButtonV2StickyView = new TotalPriceWithButtonV2StickyView(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        Context context2 = totalPriceWithButtonV2StickyView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(8, context2);
        Context context3 = totalPriceWithButtonV2StickyView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        totalPriceWithButtonV2StickyView.setPadding(px, 0, px, ResourceExtKt.toPx(12, context3));
        totalPriceWithButtonV2StickyView.setLayoutParams(layoutParams);
        return totalPriceWithButtonV2StickyView;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<TotalPriceWithButtonV2StickyVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        d customActionHandlersStoreFactory = this.component.getCustomActionHandlersStoreFactory();
        HandlersInhibitor inhibitor = this.component.getInhibitor();
        v b02 = container.b0();
        final TotalPriceWithButtonV2Component totalPriceWithButtonV2Component = this.component;
        return new TotalPriceWithButtonV2StickyWidgetViewHolder(container, customActionHandlersStoreFactory, inhibitor, (TotalPriceWithButtonV2ViewModel) ((w0) j.a(b02.a(), N.b(TotalPriceWithButtonV2ViewModel.class), new C(totalPriceWithButtonV2Component) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.sticky.TotalPriceWithButtonV2StickyViewMapper$createHolder$1
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                return ((TotalPriceWithButtonV2Component) this.receiver).getWidgetViewModel();
            }
        }).getValue()), TravelPageStorageUtilsKt.getTravelPageStorageHolder(container).getPageStorage(), new a(0));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<TotalPriceWithButtonV2StickyVO> map(@NotNull TotalPriceWithButtonV2DTO state, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getStickyMapper().invoke(state, info);
    }
}
