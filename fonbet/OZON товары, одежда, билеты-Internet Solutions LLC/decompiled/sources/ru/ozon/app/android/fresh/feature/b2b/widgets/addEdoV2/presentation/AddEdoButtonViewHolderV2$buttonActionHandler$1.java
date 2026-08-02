package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddEdoButtonViewHolderV2$buttonActionHandler$1 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ AddEdoButtonViewHolderV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEdoButtonViewHolderV2$buttonActionHandler$1(AddEdoButtonViewHolderV2 addEdoButtonViewHolderV2) {
        super(1);
        this.this$0 = addEdoButtonViewHolderV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction it) {
        AddEdoButtonVOV2 addEdoButtonVOV2;
        AddEdoViewModelV2 addEdoViewModelV2;
        ButtonV3DTO button;
        CommonControlSettings common;
        AtomActionDTO action;
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(it, "it");
        addEdoButtonVOV2 = this.this$0.item;
        String str = (addEdoButtonVOV2 == null || (button = addEdoButtonVOV2.getButton()) == null || (common = button.getCommon()) == null || (action = common.getAction()) == null || (params = action.getParams()) == null) ? null : params.get("clientId");
        if (str == null) {
            str = "";
        }
        addEdoViewModelV2 = this.this$0.viewModel;
        addEdoViewModelV2.onViewIntent(new AddEdoViewModelV2.ViewIntent.OnContinueButtonClick(it.getActionName(), str));
    }
}
