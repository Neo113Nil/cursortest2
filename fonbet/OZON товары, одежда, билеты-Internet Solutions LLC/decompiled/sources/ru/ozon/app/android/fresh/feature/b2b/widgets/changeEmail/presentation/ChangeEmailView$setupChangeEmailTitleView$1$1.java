package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ChangeEmailView$setupChangeEmailTitleView$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ AtomActionDTO $atomActionDTO;
    final /* synthetic */ CommonControlSettings $common;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChangeEmailView$setupChangeEmailTitleView$1$1(Function1<? super AtomAction, Unit> function1, AtomActionDTO atomActionDTO, CommonControlSettings commonControlSettings) {
        super(0);
        this.$actionHandler = function1;
        this.$atomActionDTO = atomActionDTO;
        this.$common = commonControlSettings;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function1<AtomAction, Unit> function1 = this.$actionHandler;
        AtomActionDTO atomActionDTO = this.$atomActionDTO;
        CommonControlSettings commonControlSettings = this.$common;
        function1.invoke(AtomActionMapperKt.toAtomAction(atomActionDTO, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null));
    }
}
