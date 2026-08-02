package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.adapter;

import WZ.t;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.SliderWithLabelsSectionVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.SliderWithLabelsView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012(\u0010\r\u001a$\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R6\u0010\r\u001a$\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/adapter/SliderWithLabelsSectionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function2;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "", "trackClickEvent", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO;", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsView;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SliderWithLabelsSectionViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function2<t, Map<String, String>, Unit> trackClickEvent;

    @NotNull
    private final SliderWithLabelsView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderWithLabelsSectionViewHolder(@NotNull SliderWithLabelsView view, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function2<? super t, ? super Map<String, String>, Unit> trackClickEvent) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(trackClickEvent, "trackClickEvent");
        this.view = view;
        this.actionHandler = actionHandler;
        this.trackClickEvent = trackClickEvent;
    }

    public final void bind(@NotNull SliderWithLabelsSectionVO.SliderWithLabelsControlVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.view.bind(item, this.actionHandler, this.trackClickEvent);
    }
}
