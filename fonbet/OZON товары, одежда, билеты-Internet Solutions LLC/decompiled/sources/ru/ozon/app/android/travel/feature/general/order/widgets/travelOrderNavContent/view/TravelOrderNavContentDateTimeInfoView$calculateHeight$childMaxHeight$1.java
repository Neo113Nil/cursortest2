package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelOrderNavContentDateTimeInfoView$calculateHeight$childMaxHeight$1 extends AbstractC7737t implements Function1<View, Boolean> {
    public static final TravelOrderNavContentDateTimeInfoView$calculateHeight$childMaxHeight$1 INSTANCE = new TravelOrderNavContentDateTimeInfoView$calculateHeight$childMaxHeight$1();

    TravelOrderNavContentDateTimeInfoView$calculateHeight$childMaxHeight$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!(it.getVisibility() == 8));
    }
}
