package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.ProfileIconButtonVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProfileIconButtonView$bind$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ Function2<AtomAction, String, Unit> $indicatorRemoveCallback;
    final /* synthetic */ ProfileIconButtonVO $item;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ ProfileIconButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProfileIconButtonView$bind$1(ProfileIconButtonView profileIconButtonView, Function1<? super AtomAction, Unit> function1, Function2<? super AtomAction, ? super String, Unit> function2, ProfileIconButtonVO profileIconButtonVO) {
        super(1);
        this.this$0 = profileIconButtonView;
        this.$onAction = function1;
        this.$indicatorRemoveCallback = function2;
        this.$item = profileIconButtonVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.ViewAction)) {
            this.this$0.dismissTooltip();
        }
        Function1<AtomAction, Unit> function1 = this.$onAction;
        if (function1 != null) {
            function1.invoke(action);
        }
        Function2<AtomAction, String, Unit> function2 = this.$indicatorRemoveCallback;
        if (function2 != null) {
            function2.invoke(action, this.$item.getIndicatorKey());
        }
    }
}
