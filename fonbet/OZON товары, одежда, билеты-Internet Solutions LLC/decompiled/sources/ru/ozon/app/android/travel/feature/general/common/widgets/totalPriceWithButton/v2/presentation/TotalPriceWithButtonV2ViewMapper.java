package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation;

import a00.j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l10.v;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.data.storage.utils.TravelPageStorageUtilsKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.data.TotalPriceWithButtonV2DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.di.TotalPriceWithButtonV2Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.view.TotalPriceWithButtonV2View;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0013j\b\u0012\u0004\u0012\u00020\u0003`\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2ViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2DTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2VO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/di/TotalPriceWithButtonV2Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/di/TotalPriceWithButtonV2Component;)V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/di/TotalPriceWithButtonV2Component;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TotalPriceWithButtonV2ViewMapper extends g<TotalPriceWithButtonV2DTO, TotalPriceWithButtonV2VO> {

    @NotNull
    private final TotalPriceWithButtonV2Component component;

    public TotalPriceWithButtonV2ViewMapper(@NotNull TotalPriceWithButtonV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<TotalPriceWithButtonV2VO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        TotalPriceWithButtonV2View totalPriceWithButtonV2View = (TotalPriceWithButtonV2View) view;
        TravelPageKeyValueStorage pageStorage = TravelPageStorageUtilsKt.getTravelPageStorageHolder(container).getPageStorage();
        v b02 = container.b0();
        final TotalPriceWithButtonV2Component totalPriceWithButtonV2Component = this.component;
        return new TotalPriceWithButtonV2WidgetViewHolder(totalPriceWithButtonV2View, container, pageStorage, (TotalPriceWithButtonV2ViewModel) ((w0) j.a(b02.a(), N.b(TotalPriceWithButtonV2ViewModel.class), new C(totalPriceWithButtonV2Component) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.TotalPriceWithButtonV2ViewMapper$createHolder$1
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                return ((TotalPriceWithButtonV2Component) this.receiver).getWidgetViewModel();
            }
        }).getValue()), this.component.getCustomActionHandlersStoreFactory());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TotalPriceWithButtonV2View totalPriceWithButtonV2View = new TotalPriceWithButtonV2View(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        Context context2 = totalPriceWithButtonV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context2);
        Context context3 = totalPriceWithButtonV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        totalPriceWithButtonV2View.setPadding(px, px, px, ResourceExtKt.toPx(12, context3));
        totalPriceWithButtonV2View.setLayoutParams(layoutParams);
        return totalPriceWithButtonV2View;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<TotalPriceWithButtonV2VO> map(@NotNull TotalPriceWithButtonV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
