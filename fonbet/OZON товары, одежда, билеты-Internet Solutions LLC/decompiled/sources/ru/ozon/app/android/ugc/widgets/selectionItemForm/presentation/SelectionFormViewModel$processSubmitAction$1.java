package ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation;

import Ae.w0;
import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.actionHandlers.ugc.submitSelectionFormMobile.SubmitSelectionResponse;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SingleEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SelectionFormViewModel$processSubmitAction$1", f = "SelectionFormViewModel.kt", l = {172, 175, 180, 195, 199}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SelectionFormViewModel$processSubmitAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SelectionFormViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormViewModel$processSubmitAction$1(SelectionFormViewModel selectionFormViewModel, AtomAction.ComposerAction composerAction, d<? super SelectionFormViewModel$processSubmitAction$1> dVar) {
        super(2, dVar);
        this.this$0 = selectionFormViewModel;
        this.$action = composerAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SelectionFormViewModel$processSubmitAction$1 selectionFormViewModel$processSubmitAction$1 = new SelectionFormViewModel$processSubmitAction$1(this.this$0, this.$action, dVar);
        selectionFormViewModel$processSubmitAction$1.L$0 = obj;
        return selectionFormViewModel$processSubmitAction$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c9, code lost:
    
        if (xe.C10727i.f(r4, r5, r9) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        if (xe.C10727i.f(r3, r8, r9) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r10 == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0052, code lost:
    
        if (r1.emit(r8, r9) == r0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Object obj2;
        Object onFailure;
        Throwable b11;
        w0 w0Var;
        ActionV2Repository actionV2Repository;
        ActionV2Request actionV2Request;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            w0Var = this.this$0._singleEvent;
            SingleEvent.UpdateLoader updateLoader = new SingleEvent.UpdateLoader(true);
            this.L$0 = m11;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3 && i11 != 4) {
                        if (i11 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    obj2 = this.L$0;
                    s.b(obj);
                    SelectionFormViewModel selectionFormViewModel = this.this$0;
                    b11 = r.b(obj2);
                    if (b11 != null) {
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        L0 l02 = De.s.f6650a;
                        SelectionFormViewModel$processSubmitAction$1$3$1 selectionFormViewModel$processSubmitAction$1$3$1 = new SelectionFormViewModel$processSubmitAction$1$3$1(b11, selectionFormViewModel, null);
                        this.L$0 = obj2;
                        this.label = 5;
                    }
                    return Unit.f71690a;
                }
                s.b(obj);
                a11 = (SubmitSelectionResponse) ((ActionV2Response) obj).getData();
                r.Companion companion2 = r.INSTANCE;
                obj2 = a11;
                SelectionFormViewModel selectionFormViewModel2 = this.this$0;
                AtomAction.ComposerAction composerAction = this.$action;
                if (!(obj2 instanceof r.b)) {
                    SubmitSelectionResponse submitSelectionResponse = (SubmitSelectionResponse) obj2;
                    if (submitSelectionResponse != null) {
                        C10720e0 c10720e02 = C10720e0.f105451a;
                        L0 l03 = De.s.f6650a;
                        SelectionFormViewModel$processSubmitAction$1$2$1 selectionFormViewModel$processSubmitAction$1$2$1 = new SelectionFormViewModel$processSubmitAction$1$2$1(selectionFormViewModel2, submitSelectionResponse, composerAction, null);
                        this.L$0 = obj2;
                        this.label = 3;
                    } else {
                        this.L$0 = obj2;
                        this.label = 4;
                        onFailure = selectionFormViewModel2.onFailure(this);
                    }
                    return Unit.f71690a;
                }
                SelectionFormViewModel selectionFormViewModel3 = this.this$0;
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        SelectionFormViewModel selectionFormViewModel4 = this.this$0;
        AtomAction.ComposerAction composerAction2 = this.$action;
        r.Companion companion3 = r.INSTANCE;
        actionV2Repository = selectionFormViewModel4.actionV2Repository;
        actionV2Request = selectionFormViewModel4.toActionV2Request(composerAction2);
        this.L$0 = null;
        this.label = 2;
        obj = actionV2Repository.callActionSuspend(actionV2Request, SubmitSelectionResponse.class, this);
        if (obj == aVar) {
            return aVar;
        }
        a11 = (SubmitSelectionResponse) ((ActionV2Response) obj).getData();
        r.Companion companion22 = r.INSTANCE;
        obj2 = a11;
        SelectionFormViewModel selectionFormViewModel22 = this.this$0;
        AtomAction.ComposerAction composerAction3 = this.$action;
        if (!(obj2 instanceof r.b)) {
        }
        SelectionFormViewModel selectionFormViewModel32 = this.this$0;
        b11 = r.b(obj2);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SelectionFormViewModel$processSubmitAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
