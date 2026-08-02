package ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.data.SupportBenefitsBannerDTO;
import ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.di.SupportBenefitsBannerComponent;
import ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.presentation.view.SupportBenefitsBannerView;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0013j\b\u0012\u0004\u0012\u00020\u0003`\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/SupportBenefitsBannerViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/data/SupportBenefitsBannerDTO;", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/SupportBenefitsBannerVO;", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/di/SupportBenefitsBannerComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/di/SupportBenefitsBannerComponent;)V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/data/SupportBenefitsBannerDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/di/SupportBenefitsBannerComponent;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SupportBenefitsBannerViewMapper extends g<SupportBenefitsBannerDTO, SupportBenefitsBannerVO> {

    @NotNull
    private final SupportBenefitsBannerComponent component;

    public SupportBenefitsBannerViewMapper(@NotNull SupportBenefitsBannerComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<SupportBenefitsBannerVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new SupportBenefitsBannerWidgetViewHolder((SupportBenefitsBannerView) view, container);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SupportBenefitsBannerView supportBenefitsBannerView = new SupportBenefitsBannerView(context);
        supportBenefitsBannerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return supportBenefitsBannerView;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<SupportBenefitsBannerVO> map(@NotNull SupportBenefitsBannerDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
