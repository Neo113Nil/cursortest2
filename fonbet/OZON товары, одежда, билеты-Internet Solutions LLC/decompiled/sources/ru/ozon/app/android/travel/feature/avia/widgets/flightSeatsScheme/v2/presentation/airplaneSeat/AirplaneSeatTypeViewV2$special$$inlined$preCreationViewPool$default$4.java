package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
public final class AirplaneSeatTypeViewV2$special$$inlined$preCreationViewPool$default$4 extends AbstractC7737t implements Function1<AppCompatTextView, Unit> {
    public AirplaneSeatTypeViewV2$special$$inlined$preCreationViewPool$default$4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AppCompatTextView appCompatTextView) {
        invoke(appCompatTextView);
        return Unit.f71690a;
    }

    public final void invoke(AppCompatTextView PreCreationViewPoolDelegate) {
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        AppCompatTextView appCompatTextView = PreCreationViewPoolDelegate;
        appCompatTextView.setGravity(17);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        appCompatTextView.setTextAppearance(UniTextStyles.BODY_ACCENT_250_CAPTION.getResId());
    }
}
