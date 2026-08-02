package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TravelAddNewPassengerFormV2WidgetViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ View $containerView;
    final /* synthetic */ TravelAddNewPassengerFormV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelAddNewPassengerFormV2WidgetViewHolder$actionHandler$1(TravelAddNewPassengerFormV2WidgetViewHolder travelAddNewPassengerFormV2WidgetViewHolder, View view) {
        super(1);
        this.this$0 = travelAddNewPassengerFormV2WidgetViewHolder;
        this.$containerView = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TravelAddNewPassengerFormV2WidgetViewHolder travelAddNewPassengerFormV2WidgetViewHolder = this.this$0;
        View view = this.$containerView;
        Intrinsics.g(view, "null cannot be cast to non-null type android.view.ViewGroup");
        travelAddNewPassengerFormV2WidgetViewHolder.clearFocus((ViewGroup) view);
        return Boolean.FALSE;
    }
}
