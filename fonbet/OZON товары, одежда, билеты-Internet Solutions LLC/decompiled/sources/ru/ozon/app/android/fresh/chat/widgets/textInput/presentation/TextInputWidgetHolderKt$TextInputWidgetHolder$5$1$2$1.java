package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation;

import B0.C2454a;
import D0.e;
import S0.InterfaceC3978p0;
import WZ.l;
import WZ.m;
import WZ.t;
import androidx.compose.ui.platform.P1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class TextInputWidgetHolderKt$TextInputWidgetHolder$5$1$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ TextInputVO $item;
    final /* synthetic */ P1 $keyboardController;
    final /* synthetic */ Function1<String, Unit> $onTextChanged;
    final /* synthetic */ InterfaceC3978p0<Boolean> $showLoader$delegate;
    final /* synthetic */ e $textState;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TextInputWidgetHolderKt$TextInputWidgetHolder$5$1$2$1(e eVar, Function1<? super String, Unit> function1, P1 p12, TextInputVO textInputVO, Function1<? super AtomAction, Unit> function12, l lVar, InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(0);
        this.$textState = eVar;
        this.$onTextChanged = function1;
        this.$keyboardController = p12;
        this.$item = textInputVO;
        this.$actionHandler = function12;
        this.$tokenizedAnalytics = lVar;
        this.$showLoader$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AtomActionDTO copy$default;
        TextInputWidgetHolderKt.TextInputWidgetHolder_Ow1X5yo$lambda$6(this.$showLoader$delegate, true);
        String obj = this.$textState.e().toString();
        this.$onTextChanged.invoke(obj);
        P1 p12 = this.$keyboardController;
        if (p12 != null) {
            p12.hide();
        }
        Map b11 = C2454a.b("text", obj);
        AtomActionDTO sendAction = this.$item.getSendAction();
        AtomAction atomAction = (sendAction == null || (copy$default = AtomActionDTO.copy$default(sendAction, null, null, null, b11, null, 23, null)) == null) ? null : AtomActionMapperKt.toAtomAction(copy$default, null);
        if (atomAction != null) {
            this.$actionHandler.invoke(atomAction);
        }
        t tokenizedEvent = this.$item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.a(this.$tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
