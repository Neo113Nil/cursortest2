package ru.ozon.app.android.travel.feature.general.main.widgets.referralMilesBanner.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.referralMilesBanner.data.ReferralMilesBannerDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.referralMilesBanner.di.ReferralMilesBannerComponent;
import ru.ozon.app.android.travel.feature.general.main.widgets.referralMilesBanner.presentation.view.ReferralMilesBannerView;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/presentation/ReferralMilesBannerViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/data/ReferralMilesBannerDTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/presentation/ReferralMilesBannerVO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/di/ReferralMilesBannerComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/di/ReferralMilesBannerComponent;)V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/data/ReferralMilesBannerDTO;Ll20/d;)Ljava/util/List;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/di/ReferralMilesBannerComponent;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReferralMilesBannerViewMapper extends g<ReferralMilesBannerDTO, ReferralMilesBannerVO> {

    @NotNull
    private final ReferralMilesBannerComponent component;

    public ReferralMilesBannerViewMapper(@NotNull ReferralMilesBannerComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<ReferralMilesBannerVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new ReferralMilesBannerWidgetViewHolder((ReferralMilesBannerView) view, container);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ReferralMilesBannerView referralMilesBannerView = new ReferralMilesBannerView(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        Context context2 = referralMilesBannerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        referralMilesBannerView.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor1));
        referralMilesBannerView.setLayoutParams(layoutParams);
        return referralMilesBannerView;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ReferralMilesBannerVO> map(@NotNull ReferralMilesBannerDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
