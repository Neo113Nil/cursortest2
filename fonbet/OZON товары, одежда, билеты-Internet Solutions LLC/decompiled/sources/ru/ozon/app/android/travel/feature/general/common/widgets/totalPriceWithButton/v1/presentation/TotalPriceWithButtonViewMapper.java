package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v1.presentation;

import JL.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v1.data.TotalPriceWithButtonDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v1.di.TotalPriceWithButtonComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v1.view.TotalPriceWithButtonView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v1/presentation/TotalPriceWithButtonViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v1/data/TotalPriceWithButtonDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v1/presentation/TotalPriceWithButtonVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v1/di/TotalPriceWithButtonComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v1/di/TotalPriceWithButtonComponent;)V", "state", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v1/data/TotalPriceWithButtonDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v1/di/TotalPriceWithButtonComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TotalPriceWithButtonViewMapper extends r<TotalPriceWithButtonDTO, TotalPriceWithButtonVO> {

    @NotNull
    private final TotalPriceWithButtonComponent component;

    @NotNull
    private final r.a viewType;

    public TotalPriceWithButtonViewMapper(@NotNull TotalPriceWithButtonComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$2(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TotalPriceWithButtonView totalPriceWithButtonView = new TotalPriceWithButtonView(context);
        Context context2 = totalPriceWithButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        totalPriceWithButtonView.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor1));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        Context context3 = totalPriceWithButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context3);
        Context context4 = totalPriceWithButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        totalPriceWithButtonView.setPadding(px, px, px, ResourceExtKt.toPx(12, context4));
        totalPriceWithButtonView.setLayoutParams(layoutParams);
        return totalPriceWithButtonView;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<TotalPriceWithButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new TotalPriceWithButtonWidgetViewHolder(container, this.component.getCustomActionHandlersStoreFactory(), this.component.getInhibitor(), new b(3));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<TotalPriceWithButtonVO> map(@NotNull TotalPriceWithButtonDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
