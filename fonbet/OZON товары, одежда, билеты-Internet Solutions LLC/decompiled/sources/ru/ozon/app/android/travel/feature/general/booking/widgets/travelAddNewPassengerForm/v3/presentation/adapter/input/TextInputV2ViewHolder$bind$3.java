package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.adapter.input;

import Em0.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "item", "LEm0/c;", "invoke", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)LEm0/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class TextInputV2ViewHolder$bind$3 extends AbstractC7737t implements Function1<CommonInputV2VO.TextInputV2, c> {
    final /* synthetic */ TextInputV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextInputV2ViewHolder$bind$3(TextInputV2ViewHolder textInputV2ViewHolder) {
        super(1);
        this.this$0 = textInputV2ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final c invoke(CommonInputV2VO.TextInputV2 item) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(item, "item");
        function1 = this.this$0.onSetFormatWatcher;
        if (function1 != null) {
            return (c) function1.invoke(item);
        }
        return null;
    }
}
