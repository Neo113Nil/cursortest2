package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation;

import S0.A1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class B2bFormContentKt$DsTextInput$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ A1<Function1<AtomAction, Unit>> $currentActionHandler$delegate;
    final /* synthetic */ CommonInputV2VO.TextInputV2 $input;
    final /* synthetic */ Function0<Unit> $onHideKeyboard;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    B2bFormContentKt$DsTextInput$2$1(Function0<Unit> function0, CommonInputV2VO.TextInputV2 textInputV2, A1<? extends Function1<? super AtomAction, Unit>> a12) {
        super(0);
        this.$onHideKeyboard = function0;
        this.$input = textInputV2;
        this.$currentActionHandler$delegate = a12;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function1 DsTextInput$lambda$19;
        this.$onHideKeyboard.invoke();
        AtomAction onClick = this.$input.getOnClick();
        if (onClick != null) {
            DsTextInput$lambda$19 = B2bFormContentKt.DsTextInput$lambda$19(this.$currentActionHandler$delegate);
            DsTextInput$lambda$19.invoke(onClick);
        }
    }
}
