package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.button;

import Sc.o;
import Tg.b;
import a00.C4911f;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.ChangeErrorVisibility;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.OwnerContainerExtKt;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.PickerViewModel;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ButtonViewMapperKt$buttonViewMapper$1$3$1$2$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ C4911f $container;
    final /* synthetic */ Context $context;
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ Function1<b, Unit> $onAction;
    final /* synthetic */ i<ButtonVI> $this_content;
    final /* synthetic */ PickerViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ButtonViewMapperKt$buttonViewMapper$1$3$1$2$1(PickerViewModel pickerViewModel, i<ButtonVI> iVar, C4911f c4911f, Function1<? super b, Unit> function1, Context context, InterfaceC7851b interfaceC7851b) {
        super(1);
        this.$viewModel = pickerViewModel;
        this.$this_content = iVar;
        this.$container = c4911f;
        this.$onAction = function1;
        this.$context = context;
        this.$controller = interfaceC7851b;
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
        PickerViewModel.ValidationResult validate = this.$viewModel.validate(this.$this_content.b().getMinCounts());
        if (Intrinsics.d(validate, PickerViewModel.ValidationResult.Loading.INSTANCE)) {
            OwnerContainerExtKt.showNotification(this.$container, this.$this_content.b().getNotifications().getUploadInProgress(), this.$onAction);
            return;
        }
        if (validate instanceof PickerViewModel.ValidationResult.RequiredMinimalCount) {
            PickerViewModel.ValidationResult.RequiredMinimalCount requiredMinimalCount = (PickerViewModel.ValidationResult.RequiredMinimalCount) validate;
            Integer num = (Integer) C7714v.M(requiredMinimalCount.getGroupIds());
            if (num != null) {
                InterfaceC7851b.a.b(this.$controller, num.intValue(), ResourceExtKt.getStatusBarHeight(this.$context), true, 8);
            }
            List<Integer> groupIds = requiredMinimalCount.getGroupIds();
            InterfaceC7851b interfaceC7851b = this.$controller;
            Iterator<T> it2 = groupIds.iterator();
            while (it2.hasNext()) {
                interfaceC7851b.update(new ChangeErrorVisibility(((Number) it2.next()).intValue(), true));
            }
            return;
        }
        if (!(validate instanceof PickerViewModel.ValidationResult.Success)) {
            throw new o();
        }
        CommonControlSettings common = this.$this_content.b().getButton().getCommon();
        AtomAction atomAction = null;
        atomAction = null;
        if (common != null && (action = common.getAction()) != null) {
            i<ButtonVI> iVar = this.$this_content;
            Map<String, String> params = action.getParams();
            if (params == null) {
                params = U.c();
            }
            AtomActionDTO copy$default = AtomActionDTO.copy$default(action, null, null, null, U.m(params, ((PickerViewModel.ValidationResult.Success) validate).getParams()), null, 23, null);
            CommonControlSettings common2 = iVar.b().getButton().getCommon();
            atomAction = AtomActionMapperKt.toAtomAction(copy$default, common2 != null ? common2.getTrackingInfo() : null);
        }
        if (atomAction != null) {
            this.$onAction.invoke(atomAction);
        }
    }
}
