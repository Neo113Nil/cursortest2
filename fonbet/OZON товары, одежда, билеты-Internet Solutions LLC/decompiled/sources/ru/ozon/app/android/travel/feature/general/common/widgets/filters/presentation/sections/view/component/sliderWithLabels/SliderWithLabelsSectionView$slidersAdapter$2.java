package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels;

import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "event", "", "", "params", "", "invoke", "(LWZ/t;Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class SliderWithLabelsSectionView$slidersAdapter$2 extends AbstractC7737t implements Function2<t, Map<String, ? extends String>, Unit> {
    final /* synthetic */ SliderWithLabelsSectionView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderWithLabelsSectionView$slidersAdapter$2(SliderWithLabelsSectionView sliderWithLabelsSectionView) {
        super(2);
        this.this$0 = sliderWithLabelsSectionView;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(t tVar, Map<String, ? extends String> map) {
        invoke2(tVar, (Map<String, String>) map);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t event, Map<String, String> params) {
        Function2 function2;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        function2 = this.this$0.trackClickEvent;
        if (function2 != null) {
            function2.invoke(event, params);
        }
    }
}
