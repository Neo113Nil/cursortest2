package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class B2bFormWidgetKt$withInputs$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ Map<String, String> $inputValues;
    final /* synthetic */ Function1<AtomAction, Unit> $this_withInputs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    B2bFormWidgetKt$withInputs$1(Map<String, String> map, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$inputValues = map;
        this.$this_withInputs = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.ComposerAction) {
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            Map<String, String> params = composerAction.getParams();
            LinkedHashMap u11 = params != null ? U.u(params) : new LinkedHashMap();
            u11.putAll(this.$inputValues);
            action = AtomAction.ComposerAction.copy$default(composerAction, null, null, u11, null, null, 27, null);
        }
        this.$this_withInputs.invoke(action);
    }
}
