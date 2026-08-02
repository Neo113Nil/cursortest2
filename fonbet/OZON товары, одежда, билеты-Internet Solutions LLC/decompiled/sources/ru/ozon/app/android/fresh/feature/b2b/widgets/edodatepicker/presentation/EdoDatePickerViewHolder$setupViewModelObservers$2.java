package ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.presentation;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.presentation.EdoDateSingleEvent;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDateSingleEvent;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDateSingleEvent;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class EdoDatePickerViewHolder$setupViewModelObservers$2 extends AbstractC7737t implements Function1<EdoDateSingleEvent, Unit> {
    final /* synthetic */ EdoDatePickerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EdoDatePickerViewHolder$setupViewModelObservers$2(EdoDatePickerViewHolder edoDatePickerViewHolder) {
        super(1);
        this.this$0 = edoDatePickerViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(EdoDateSingleEvent edoDateSingleEvent) {
        invoke2(edoDateSingleEvent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(EdoDateSingleEvent edoDateSingleEvent) {
        if (edoDateSingleEvent instanceof EdoDateSingleEvent.OpenStartDatePicker) {
            this.this$0.openStartDatePicker();
        } else {
            if (!(edoDateSingleEvent instanceof EdoDateSingleEvent.OpenEndDatePicker)) {
                throw new o();
            }
            this.this$0.openEndDatePicker();
        }
    }
}
