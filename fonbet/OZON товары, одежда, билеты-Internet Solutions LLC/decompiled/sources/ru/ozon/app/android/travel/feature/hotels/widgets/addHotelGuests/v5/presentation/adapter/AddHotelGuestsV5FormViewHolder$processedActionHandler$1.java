package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.adapter;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AddHotelGuestsV5FormViewHolder$processedActionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ AddHotelGuestsV5FormViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddHotelGuestsV5FormViewHolder$processedActionHandler$1(AddHotelGuestsV5FormViewHolder addHotelGuestsV5FormViewHolder) {
        super(1);
        this.this$0 = addHotelGuestsV5FormViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        Function1 function1;
        AddHotelGuestsV5VO.GuestFormVO guestFormVO;
        String num;
        Intrinsics.checkNotNullParameter(action, "action");
        AtomAction.Click click = null;
        AtomAction.Click click2 = action instanceof AtomAction.Click ? (AtomAction.Click) action : null;
        if (click2 != null) {
            AddHotelGuestsV5FormViewHolder addHotelGuestsV5FormViewHolder = this.this$0;
            Map<String, String> params = click2.getParams();
            LinkedHashMap u11 = params != null ? U.u(params) : new LinkedHashMap();
            guestFormVO = addHotelGuestsV5FormViewHolder.boundedData;
            if (guestFormVO != null && (num = Integer.valueOf(guestFormVO.getId()).toString()) != null) {
                u11.put("formId", num);
                click = AtomAction.Click.copy$default(click2, null, null, null, u11, null, null, 55, null);
            }
            if (click != null) {
                action = click;
            }
        }
        function1 = this.this$0.actionHandler;
        if (function1 != null) {
            function1.invoke(action);
        }
    }
}
