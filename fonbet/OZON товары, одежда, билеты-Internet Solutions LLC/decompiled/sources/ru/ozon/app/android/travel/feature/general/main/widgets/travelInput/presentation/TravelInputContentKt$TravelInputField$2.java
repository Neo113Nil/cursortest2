package ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import j1.r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelInputContentKt$TravelInputField$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Pair<Integer, Integer> $captionNumbers;
    final /* synthetic */ r $focusRequester;
    final /* synthetic */ CommonInputV2VO.TextInputV2 $input;
    final /* synthetic */ String $inputText;
    final /* synthetic */ Function0<Unit> $onDone;
    final /* synthetic */ Function1<String, Unit> $onValueChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelInputContentKt$TravelInputField$2(String str, CommonInputV2VO.TextInputV2 textInputV2, Pair<Integer, Integer> pair, r rVar, Function1<? super String, Unit> function1, Function0<Unit> function0, int i11) {
        super(2);
        this.$inputText = str;
        this.$input = textInputV2;
        this.$captionNumbers = pair;
        this.$focusRequester = rVar;
        this.$onValueChange = function1;
        this.$onDone = function0;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        TravelInputContentKt.TravelInputField(this.$inputText, this.$input, this.$captionNumbers, this.$focusRequester, this.$onValueChange, this.$onDone, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
