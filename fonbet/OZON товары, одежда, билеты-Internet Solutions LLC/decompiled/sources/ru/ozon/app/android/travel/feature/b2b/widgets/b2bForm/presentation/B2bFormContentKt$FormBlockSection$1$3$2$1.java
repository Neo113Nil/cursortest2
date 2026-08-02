package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class B2bFormContentKt$FormBlockSection$1$3$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ CommonInputV2VO $input;
    final /* synthetic */ Function1<String, Unit> $onClearError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    B2bFormContentKt$FormBlockSection$1$3$2$1(Function1<? super String, Unit> function1, CommonInputV2VO commonInputV2VO) {
        super(0);
        this.$onClearError = function1;
        this.$input = commonInputV2VO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onClearError.invoke(((CommonInputV2VO.TextInputV2) this.$input).getName());
    }
}
