package ru.ozon.app.android.storefront.core.atoms.holders.timeRangeFilter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.core.atoms.data.TimeRangeFilter;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "fromValue", "", "toValue", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TimeRangeFilterHolder$onBind$1$1 extends AbstractC7737t implements Function2<Integer, Integer, Unit> {
    final /* synthetic */ TimeRangeFilter $item;
    final /* synthetic */ TimeRangeFilterHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimeRangeFilterHolder$onBind$1$1(TimeRangeFilter timeRangeFilter, TimeRangeFilterHolder timeRangeFilterHolder) {
        super(2);
        this.$item = timeRangeFilter;
        this.this$0 = timeRangeFilterHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke(num.intValue(), num2.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11, int i12) {
        AtomAction extractAction = TimeRangeFilterMapperKt.extractAction(this.$item, i11, i12);
        if (extractAction != null) {
            this.this$0.handleAction(extractAction);
        }
    }
}
