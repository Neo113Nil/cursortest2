package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view;

import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5TariffView$special$$inlined$preCreationViewPool$default$4 extends AbstractC7737t implements Function1<BadgeView, Unit> {
    final /* synthetic */ HotelsRoomsListV5TariffView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsRoomsListV5TariffView$special$$inlined$preCreationViewPool$default$4(HotelsRoomsListV5TariffView hotelsRoomsListV5TariffView) {
        super(1);
        this.this$0 = hotelsRoomsListV5TariffView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BadgeView badgeView) {
        invoke(badgeView);
        return Unit.f71690a;
    }

    public final void invoke(BadgeView PreCreationViewPoolDelegate) {
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        BadgeView badgeView = PreCreationViewPoolDelegate;
        badgeView.setId(R$id.hotelsRoomsListV5ServiceBv);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        i11 = this.this$0.dp10;
        layoutParams.setMarginStart(i11);
        i12 = this.this$0.dp10;
        layoutParams.setMarginEnd(i12);
        i13 = this.this$0.dp6;
        layoutParams.topMargin = i13;
        badgeView.setLayoutParams(layoutParams);
    }
}
