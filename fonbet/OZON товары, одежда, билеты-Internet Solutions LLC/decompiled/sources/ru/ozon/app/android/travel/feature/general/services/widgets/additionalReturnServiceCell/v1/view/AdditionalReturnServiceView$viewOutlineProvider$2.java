package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.view;

import Hj.C3143a;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/view/AdditionalReturnServiceView$viewOutlineProvider$2$1", "invoke", "()Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/view/AdditionalReturnServiceView$viewOutlineProvider$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AdditionalReturnServiceView$viewOutlineProvider$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    final /* synthetic */ AdditionalReturnServiceView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalReturnServiceView$viewOutlineProvider$2(AdditionalReturnServiceView additionalReturnServiceView) {
        super(0);
        this.this$0 = additionalReturnServiceView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.view.AdditionalReturnServiceView$viewOutlineProvider$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        final AdditionalReturnServiceView additionalReturnServiceView = this.this$0;
        return new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.view.AdditionalReturnServiceView$viewOutlineProvider$2.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                float f7;
                int f11 = C3143a.f(view, "view", outline, "outline");
                int height = view.getHeight();
                f7 = AdditionalReturnServiceView.this.innerRadius;
                outline.setRoundRect(0, 0, f11, height, f7);
            }
        };
    }
}
