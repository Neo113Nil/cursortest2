package ru.ozon.app.android.cart.ui.cartActionProcessor.actionHandlers;

import B0.A0;
import Lm0.a;
import Vg.f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartActionHandler$processCustomAction$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ f $customHandler;
    final /* synthetic */ CartActionHandler this$0;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cart.ui.cartActionProcessor.actionHandlers.CartActionHandler$processCustomAction$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Map<String, ? extends String>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends String> invoke() {
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartActionHandler$processCustomAction$1(AtomAction atomAction, CartActionHandler cartActionHandler, f fVar) {
        super(0);
        this.$action = atomAction;
        this.this$0 = cartActionHandler;
        this.$customHandler = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ComposerReferences composerReferences;
        String str;
        AtomAction atomAction = this.$action;
        if (atomAction instanceof AtomAction.Click) {
            Map<String, String> params = ((AtomAction.Click) atomAction).getParams();
            if ((params == null || (str = params.get("needDismissAfterPerform")) == null) ? false : Intrinsics.d(h.t0(str), Boolean.TRUE)) {
                this.this$0.dismiss();
            }
        }
        f fVar = this.$customHandler;
        if (!(fVar instanceof CustomActionHandler)) {
            a.f17149a.w(A0.b("WidgetCustomActionHandler ", fVar.getActionId(), " is not supported in CartActionHandler"), new Object[0]);
            return;
        }
        AtomAction atomAction2 = this.$action;
        composerReferences = this.this$0.ref;
        ((CustomActionHandler) fVar).processAction(atomAction2, new CustomActionHandler.HandlerReferences(composerReferences, AnonymousClass1.INSTANCE, null, null));
        if (this.$customHandler.getManualAnalyticTracking()) {
            return;
        }
        this.this$0.sendAnalytics(this.$action);
    }
}
