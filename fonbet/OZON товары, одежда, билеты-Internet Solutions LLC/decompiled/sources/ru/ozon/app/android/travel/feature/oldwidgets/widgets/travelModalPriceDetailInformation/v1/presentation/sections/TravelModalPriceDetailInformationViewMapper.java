package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelModalPriceDetailInformation.v1.presentation.sections;

import android.content.Context;
import android.view.View;
import java.util.List;
import k20.C7471c;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.oldwidgets.R$layout;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelModalPriceDetailInformation.v1.data.TravelModalPriceDetailInformationMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0010j\b\u0012\u0004\u0012\u00020\u0002`\u00112\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR<\u0010#\u001a$\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040!j\b\u0012\u0004\u0012\u00020\u0004`\"0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationDTO;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO;", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationDecoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationMapper;", "mapper", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationMapper;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelModalPriceDetailInformationViewMapper extends WidgetViewMapper2 {

    @NotNull
    private final TravelModalPriceDetailInformationMapper mapper = new TravelModalPriceDetailInformationMapper();
    private final int layout = R$layout.widget_travel_modal_price_detail_information;

    @NotNull
    private final Function2<View, ComposerReferences, k<TravelModalPriceDetailInformationVO>> holderProducer = TravelModalPriceDetailInformationViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<TravelModalPriceDetailInformationDecoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new TravelModalPriceDetailInformationDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<TravelModalPriceDetailInformationVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return C7471c.f70357c;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public TravelModalPriceDetailInformationMapper getMapper() {
        return this.mapper;
    }
}
