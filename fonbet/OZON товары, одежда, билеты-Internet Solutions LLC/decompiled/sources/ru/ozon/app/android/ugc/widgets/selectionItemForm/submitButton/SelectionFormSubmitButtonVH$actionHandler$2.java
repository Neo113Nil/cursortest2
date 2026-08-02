package ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton;

import Vg.c;
import Vg.d;
import a00.C4911f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.e;
import l10.i;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.doubleDismissAndRedirect.DoubleDismissAndRedirectActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.doubleDismissAndRefresh.DoubleDismissAndRefreshActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectionFormSubmitButtonVH$actionHandler$2 extends AbstractC7737t implements Function0<Function1<? super AtomAction, ? extends Unit>> {
    final /* synthetic */ SelectionFormSubmitButtonVH this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton.SelectionFormSubmitButtonVH$actionHandler$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
        final /* synthetic */ SelectionFormSubmitButtonVH this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SelectionFormSubmitButtonVH selectionFormSubmitButtonVH) {
            super(1);
            this.this$0 = selectionFormSubmitButtonVH;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AtomAction action) {
            i iVar;
            Intrinsics.checkNotNullParameter(action, "action");
            if (!(action instanceof AtomAction.DismissRefresh)) {
                return Boolean.FALSE;
            }
            iVar = this.this$0.container;
            e V11 = iVar.V();
            Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
            C4911f container = ((ComposerReferences) V11).getContainer();
            if (!ComposerExtKt.isFlow(container)) {
                return Boolean.FALSE;
            }
            ComposerExtKt.setResult$default(container, null, 0, null, 7, null);
            ComposerExtKt.closeFlow(container);
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton.SelectionFormSubmitButtonVH$actionHandler$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<c> {
        final /* synthetic */ SelectionFormSubmitButtonVH this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SelectionFormSubmitButtonVH selectionFormSubmitButtonVH) {
            super(0);
            this.this$0 = selectionFormSubmitButtonVH;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final c invoke() {
            d dVar;
            dVar = this.this$0.customActionHandlersStoreFactory;
            return dVar.create(DoubleDismissAndRedirectActionHandler.class, DoubleDismissAndRefreshActionHandler.class);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormSubmitButtonVH$actionHandler$2(SelectionFormSubmitButtonVH selectionFormSubmitButtonVH) {
        super(0);
        this.this$0 = selectionFormSubmitButtonVH;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function1<? super AtomAction, ? extends Unit> invoke() {
        i iVar;
        iVar = this.this$0.container;
        return new ActionHandler.Builder(iVar, this.this$0).onPreProcess(new AnonymousClass1(this.this$0)).customActionHandlers(new AnonymousClass2(this.this$0)).buildHandler();
    }
}
