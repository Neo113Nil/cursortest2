package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.presentation;

import A00.a;
import Pc.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import h20.InterfaceC6786a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.data.AdditionalReturnServiceCellV2DTO;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.di.AdditionalReturnServiceCellV2Component;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.view.AdditionalReturnServiceCellV2View;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR&\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2ViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/data/AdditionalReturnServiceCellV2DTO;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/di/AdditionalReturnServiceCellV2Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/di/AdditionalReturnServiceCellV2Component;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/data/AdditionalReturnServiceCellV2DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI;)Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/di/AdditionalReturnServiceCellV2Component;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2Update;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "LPc/a;", "Lh20/a;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalReturnServiceCellV2ViewMapper extends g<AdditionalReturnServiceCellV2DTO, AdditionalReturnServiceCellV2VI> {

    @NotNull
    private final AdditionalReturnServiceCellV2Component component;

    @NotNull
    private final List<Class<AdditionalReturnServiceCellV2Update>> supportedUpdates;

    public AdditionalReturnServiceCellV2ViewMapper(@NotNull AdditionalReturnServiceCellV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.supportedUpdates = C7714v.a0(AdditionalReturnServiceCellV2Update.class);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<AdditionalReturnServiceCellV2VI> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new AdditionalReturnServiceCellV2WidgetViewHolder((AdditionalReturnServiceCellV2View) view, container, this.component.getCustomActionHandlersStoreFactory());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AdditionalReturnServiceCellV2View additionalReturnServiceCellV2View = new AdditionalReturnServiceCellV2View(context);
        additionalReturnServiceCellV2View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return additionalReturnServiceCellV2View;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<AdditionalReturnServiceCellV2Update>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return this.component.getWidgetViewModelProvider();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    public AdditionalReturnServiceCellV2VI handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AdditionalReturnServiceCellV2VI oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof AdditionalReturnServiceCellV2Update)) {
            return null;
        }
        AdditionalReturnServiceCellV2Update additionalReturnServiceCellV2Update = (AdditionalReturnServiceCellV2Update) update;
        if (additionalReturnServiceCellV2Update.getId() == oldItem.getId()) {
            return AdditionalReturnServiceCellV2VI.copy$default(oldItem, 0L, null, additionalReturnServiceCellV2Update.getContent(), 3, null);
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<AdditionalReturnServiceCellV2VI> map(@NotNull AdditionalReturnServiceCellV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getAdditionalReturnServiceCellMapper().invoke(state, info);
    }
}
