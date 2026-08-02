package ru.ozon.app.android.account.orders.changeDeliveryTimeButton.presentation;

import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cscore.buttonv2.viewmodel.ActionButtonViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ChangeDeliveryTimeButtonWidgetHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ ChangeDeliveryTimeButtonWidgetHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeDeliveryTimeButtonWidgetHolder$actionHandler$1(ChangeDeliveryTimeButtonWidgetHolder changeDeliveryTimeButtonWidgetHolder) {
        super(1);
        this.this$0 = changeDeliveryTimeButtonWidgetHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction it) {
        ButtonV3Atom.LargeButton button;
        AtomActionDTO action;
        ActionButtonViewModel actionButtonViewModel;
        JsonAdapter jsonAdapter;
        Intrinsics.checkNotNullParameter(it, "it");
        ChangeDeliveryTimeButtonVO changeDeliveryTimeButtonVO = (ChangeDeliveryTimeButtonVO) this.this$0.getBoundData();
        if (changeDeliveryTimeButtonVO == null || (button = changeDeliveryTimeButtonVO.getButton()) == null || (action = button.getAction()) == null) {
            return;
        }
        ChangeDeliveryTimeButtonWidgetHolder changeDeliveryTimeButtonWidgetHolder = this.this$0;
        actionButtonViewModel = changeDeliveryTimeButtonWidgetHolder.viewModel;
        String link = action.getLink();
        if (link == null) {
            link = "";
        }
        jsonAdapter = changeDeliveryTimeButtonWidgetHolder.moshiAdapter;
        actionButtonViewModel.onButtonClick(link, jsonAdapter.toJson(action.getParams()));
    }
}
