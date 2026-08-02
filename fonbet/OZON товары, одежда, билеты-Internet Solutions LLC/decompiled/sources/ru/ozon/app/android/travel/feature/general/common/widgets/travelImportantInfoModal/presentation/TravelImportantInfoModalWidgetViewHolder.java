package ru.ozon.app.android.travel.feature.general.common.widgets.travelImportantInfoModal.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.databinding.WidgetTravelImportantInfoModalBinding;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelImportantInfoModal.presentation.adapter.TravelImportantInfoModalAdapter;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelImportantInfoModal/presentation/TravelImportantInfoModalWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelImportantInfoModal/presentation/TravelImportantInfoModalVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelImportantInfoModal/presentation/TravelImportantInfoModalVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetTravelImportantInfoModalBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetTravelImportantInfoModalBinding;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelImportantInfoModal/presentation/adapter/TravelImportantInfoModalAdapter;", "adapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelImportantInfoModal/presentation/adapter/TravelImportantInfoModalAdapter;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelImportantInfoModalWidgetViewHolder extends k<TravelImportantInfoModalVO> {

    @NotNull
    private final TravelImportantInfoModalAdapter adapter;

    @NotNull
    private final WidgetTravelImportantInfoModalBinding binding;

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelImportantInfoModalWidgetViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        WidgetTravelImportantInfoModalBinding bind = WidgetTravelImportantInfoModalBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        TravelImportantInfoModalAdapter travelImportantInfoModalAdapter = new TravelImportantInfoModalAdapter();
        this.adapter = travelImportantInfoModalAdapter;
        bind.importantInfoModalRV.setAdapter(travelImportantInfoModalAdapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelImportantInfoModalVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.adapter.setItems(item.getInfo());
    }
}
