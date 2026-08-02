package ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.buttons;

import Sc.o;
import Tg.b;
import a00.C4911f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.OwnerContainerExtKt;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.PickerViewModel;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ButtonsViewMapperKt$buttonsViewMapper$1$3$1$2$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ C4911f $container;
    final /* synthetic */ Function1<b, Unit> $onAction;
    final /* synthetic */ i<ButtonsVI> $this_content;
    final /* synthetic */ PickerViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ButtonsViewMapperKt$buttonsViewMapper$1$3$1$2$1(PickerViewModel pickerViewModel, i<ButtonsVI> iVar, C4911f c4911f, Function1<? super b, Unit> function1) {
        super(1);
        this.$viewModel = pickerViewModel;
        this.$this_content = iVar;
        this.$container = c4911f;
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction it) {
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(it, "it");
        PickerViewModel.ValidationResult validate = this.$viewModel.validate(this.$this_content.b().getSettings().getMinCount());
        if (Intrinsics.d(validate, PickerViewModel.ValidationResult.Loading.INSTANCE)) {
            OwnerContainerExtKt.showNotification(this.$container, this.$this_content.b().getNotifications().getUploadInProgress(), this.$onAction);
            return;
        }
        if (Intrinsics.d(validate, PickerViewModel.ValidationResult.RequiredMinimalCount.INSTANCE)) {
            OwnerContainerExtKt.showNotification(this.$container, this.$this_content.b().getNotifications().getMinCountRestriction(), this.$onAction);
            return;
        }
        if (!(validate instanceof PickerViewModel.ValidationResult.Success)) {
            throw new o();
        }
        CommonControlSettings common = this.$this_content.b().getContinueButton().getCommon();
        if (common == null || (action = common.getAction()) == null) {
            return;
        }
        Map<String, String> params = action.getParams();
        if (params == null) {
            params = U.c();
        }
        AtomActionDTO copy$default = AtomActionDTO.copy$default(action, null, null, null, U.m(params, ((PickerViewModel.ValidationResult.Success) validate).getParams()), null, 23, null);
        if (copy$default != null) {
            CommonControlSettings common2 = this.$this_content.b().getContinueButton().getCommon();
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(copy$default, common2 != null ? common2.getTrackingInfo() : null);
            if (atomAction != null) {
                this.$onAction.invoke(atomAction);
            }
        }
    }
}
