package ru.ozon.app.android.account.orders.cancel.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CancelReasonFragment$handleButton$1$action$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ CancelReasonFragment this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonFragment$handleButton$1$action$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ AtomAction $atomAction;
        final /* synthetic */ CancelReasonFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CancelReasonFragment cancelReasonFragment, AtomAction atomAction) {
            super(0);
            this.this$0 = cancelReasonFragment;
            this.$atomAction = atomAction;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CancelReasonVM vm;
            CancelReasonVM vm2;
            vm = this.this$0.getVm();
            if (vm.getShowPriceUpDialogData() != null) {
                this.this$0.handleShowPriceUpDialog();
            } else {
                vm2 = this.this$0.getVm();
                vm2.handleAction(this.$atomAction);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelReasonFragment$handleButton$1$action$1(CancelReasonFragment cancelReasonFragment) {
        super(1);
        this.this$0 = cancelReasonFragment;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        this.this$0.getHandlersInhibitor$cs_orders_prodGoogleAllVendorsRelease().run(600L, new AnonymousClass1(this.this$0, atomAction));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }
}
