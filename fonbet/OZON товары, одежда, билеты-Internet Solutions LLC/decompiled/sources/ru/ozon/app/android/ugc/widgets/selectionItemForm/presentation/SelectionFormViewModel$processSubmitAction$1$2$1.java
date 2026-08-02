package ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.actionHandlers.ugc.submitSelectionFormMobile.SubmitSelectionResponse;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SingleEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SelectionFormViewModel$processSubmitAction$1$2$1", f = "SelectionFormViewModel.kt", l = {181, 183, 185}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SelectionFormViewModel$processSubmitAction$1$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ SubmitSelectionResponse $response;
    int label;
    final /* synthetic */ SelectionFormViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormViewModel$processSubmitAction$1$2$1(SelectionFormViewModel selectionFormViewModel, SubmitSelectionResponse submitSelectionResponse, AtomAction.ComposerAction composerAction, d<? super SelectionFormViewModel$processSubmitAction$1$2$1> dVar) {
        super(2, dVar);
        this.this$0 = selectionFormViewModel;
        this.$response = submitSelectionResponse;
        this.$action = composerAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SelectionFormViewModel$processSubmitAction$1$2$1(this.this$0, this.$response, this.$action, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        if (r4.emit(r5, r6) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r1.emit(r4, r6) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        String str;
        w0 w0Var2;
        AtomActionDTO action;
        w0 w0Var3;
        Map customTrackingInfo;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0Var = this.this$0._singleEvent;
            SingleEvent.UpdateLoader updateLoader = new SingleEvent.UpdateLoader(false);
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
                action = this.$response.getAction();
                if (action != null) {
                    SelectionFormViewModel selectionFormViewModel = this.this$0;
                    AtomAction.ComposerAction composerAction = this.$action;
                    w0Var3 = selectionFormViewModel._singleEvent;
                    Map<String, TokenizedTrackingInfo> trackingInfo = composerAction.getTrackingInfo();
                    customTrackingInfo = selectionFormViewModel.getCustomTrackingInfo();
                    SingleEvent.HandleResponseAction handleResponseAction = new SingleEvent.HandleResponseAction(action, trackingInfo, customTrackingInfo);
                    this.label = 3;
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        str = this.this$0.selectionUuid;
        if (str == null) {
            this.this$0.selectionUuid = this.$response.getSelectionUuid();
        }
        NotificationDTO notification = this.$response.getNotification();
        if (notification != null) {
            w0Var2 = this.this$0._singleEvent;
            SingleEvent.ShowNotification showNotification = new SingleEvent.ShowNotification(notification);
            this.label = 2;
        }
        action = this.$response.getAction();
        if (action != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SelectionFormViewModel$processSubmitAction$1$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
