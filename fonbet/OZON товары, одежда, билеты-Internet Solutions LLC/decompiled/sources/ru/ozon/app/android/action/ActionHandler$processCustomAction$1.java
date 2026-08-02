package ru.ozon.app.android.action;

import Vg.f;
import a00.C4911f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ActionHandler$processCustomAction$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ f $customHandler;
    final /* synthetic */ ActionHandler this$0;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.action.ActionHandler$processCustomAction$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Map<String, ? extends String>> {
        final /* synthetic */ l $widgetViewItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(l lVar) {
            super(0);
            this.$widgetViewItem = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends String> invoke() {
            l lVar = this.$widgetViewItem;
            if (lVar != null) {
                return lVar.h();
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionHandler$processCustomAction$1(AtomAction atomAction, ActionHandler actionHandler, f fVar) {
        super(0);
        this.$action = atomAction;
        this.this$0 = actionHandler;
        this.$customHandler = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0 function0;
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        ComposerReferences composerReferences3;
        ComposerReferences composerReferences4;
        String str;
        AtomAction atomAction = this.$action;
        if (atomAction instanceof AtomAction.Click) {
            Map<String, String> params = ((AtomAction.Click) atomAction).getParams();
            if ((params == null || (str = params.get("needDismissAfterPerform")) == null) ? false : Intrinsics.d(h.t0(str), Boolean.TRUE)) {
                this.this$0.dismiss();
            }
        }
        function0 = this.this$0.widgetViewItemProvider;
        l lVar = (l) function0.invoke();
        f fVar = this.$customHandler;
        if (fVar instanceof CustomActionHandler) {
            CustomActionHandler customActionHandler = (CustomActionHandler) fVar;
            AtomAction atomAction2 = this.$action;
            composerReferences4 = this.this$0.ref;
            customActionHandler.processAction(atomAction2, new CustomActionHandler.HandlerReferences(composerReferences4, new AnonymousClass1(lVar), lVar, lVar != null ? lVar.n() : null));
        } else {
            AtomAction atomAction3 = this.$action;
            composerReferences = this.this$0.ref;
            a00.h viewModelOwnerProvider = composerReferences.getViewModelOwnerProvider();
            composerReferences2 = this.this$0.ref;
            C4911f container = composerReferences2.getContainer();
            if (lVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            f.a aVar = new f.a(viewModelOwnerProvider, container, lVar);
            composerReferences3 = this.this$0.ref;
            fVar.processWidgetAction(atomAction3, aVar, composerReferences3.getComposerWidgetComponentStorage());
        }
        if (this.$customHandler.getManualAnalyticTracking()) {
            return;
        }
        this.this$0.sendAnalytics(this.$action);
    }
}
