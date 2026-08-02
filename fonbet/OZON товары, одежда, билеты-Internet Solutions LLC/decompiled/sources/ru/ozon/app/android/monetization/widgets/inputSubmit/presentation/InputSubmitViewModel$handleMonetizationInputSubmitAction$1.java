package ru.ozon.app.android.monetization.widgets.inputSubmit.presentation;

import Ae.w0;
import Ae.x0;
import Sc.o;
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
import ru.ozon.app.android.monetization.widgets.inputSubmit.data.InputSubmitResponse;
import ru.ozon.app.android.monetization.widgets.inputSubmit.presentation.InputSubmitViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.M;
import z00.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.monetization.widgets.inputSubmit.presentation.InputSubmitViewModel$handleMonetizationInputSubmitAction$1", f = "InputSubmitViewModel.kt", l = {176, 69, 86, 90}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class InputSubmitViewModel$handleMonetizationInputSubmitAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ String $uploadKey;
    Object L$0;
    int label;
    final /* synthetic */ InputSubmitViewModel this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputSubmitResponse.ResponseType.values().length];
            try {
                iArr[InputSubmitResponse.ResponseType.RESPONSE_TYPE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputSubmitResponse.ResponseType.RESPONSE_TYPE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InputSubmitViewModel$handleMonetizationInputSubmitAction$1(InputSubmitViewModel inputSubmitViewModel, AtomAction.ComposerAction composerAction, String str, d<? super InputSubmitViewModel$handleMonetizationInputSubmitAction$1> dVar) {
        super(2, dVar);
        this.this$0 = inputSubmitViewModel;
        this.$action = composerAction;
        this.$uploadKey = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new InputSubmitViewModel$handleMonetizationInputSubmitAction$1(this.this$0, this.$action, this.$uploadKey, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f1, code lost:
    
        if (r10.emit(r4, r9) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r10.emit(r3, r9) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        if (r10.emit(r4, r9) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x004b, code lost:
    
        if (r10 == r0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dc  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        ActionV2Request actionV2Request;
        Object mo479requestActionResult0E7RQCE;
        Object obj2;
        AtomAction atomAction;
        x0 x0Var;
        x0 x0Var2;
        w0 w0Var;
        w0 w0Var2;
        Throwable b11;
        w0 w0Var3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            actionV2Request = this.this$0.toActionV2Request(this.$action, this.$uploadKey);
            this.label = 1;
            mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, InputSubmitResponse.class, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                obj2 = this.L$0;
                s.b(obj);
                InputSubmitViewModel inputSubmitViewModel = this.this$0;
                b11 = r.b(obj2);
                if (b11 != null) {
                    w0Var3 = inputSubmitViewModel._error;
                    InputSubmitViewModel.Error.ResponseFailed responseFailed = new InputSubmitViewModel.Error.ResponseFailed(g.c(b11));
                    this.L$0 = obj2;
                    this.label = 4;
                }
                return Unit.f71690a;
            }
            s.b(obj);
            mo479requestActionResult0E7RQCE = ((r) obj).getF26106a();
        }
        r.Companion companion = r.INSTANCE;
        if (!(mo479requestActionResult0E7RQCE instanceof r.b)) {
            mo479requestActionResult0E7RQCE = (InputSubmitResponse) ((ActionV2Response) mo479requestActionResult0E7RQCE).getData();
        }
        obj2 = mo479requestActionResult0E7RQCE;
        InputSubmitViewModel inputSubmitViewModel2 = this.this$0;
        if (!(obj2 instanceof r.b)) {
            InputSubmitResponse inputSubmitResponse = (InputSubmitResponse) obj2;
            if (inputSubmitResponse == null) {
                w0Var2 = inputSubmitViewModel2._error;
                InputSubmitViewModel.Error.ResponseFailed responseFailed2 = new InputSubmitViewModel.Error.ResponseFailed(false);
                this.L$0 = obj2;
                this.label = 2;
            } else {
                int i12 = WhenMappings.$EnumSwitchMapping$0[inputSubmitResponse.getType().ordinal()];
                if (i12 == 1) {
                    AtomActionDTO action = inputSubmitResponse.getAction();
                    if (action != null && (atomAction = AtomActionMapperKt.toAtomAction(action, null)) != null) {
                        x0Var = inputSubmitViewModel2._screenState;
                        x0Var.tryEmit(InputSubmitViewModel.ScreenState.SuccessWithRefreshRequests.INSTANCE.create(atomAction, inputSubmitResponse));
                        x0Var2 = inputSubmitViewModel2._inputValue;
                        x0Var2.setValue("");
                    }
                } else {
                    if (i12 != 2) {
                        throw new o();
                    }
                    w0Var = inputSubmitViewModel2._error;
                    String error = inputSubmitResponse.getError();
                    InputSubmitViewModel.Error.InputFieldError inputFieldError = new InputSubmitViewModel.Error.InputFieldError(error != null ? error : "");
                    this.L$0 = obj2;
                    this.label = 3;
                }
            }
            return Unit.f71690a;
        }
        InputSubmitViewModel inputSubmitViewModel3 = this.this$0;
        b11 = r.b(obj2);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((InputSubmitViewModel$handleMonetizationInputSubmitAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
