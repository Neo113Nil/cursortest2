package ru.ozon.app.android.actionHandlers.ugc.updateCellSelectionFormMobile;

import Sc.r;
import Sc.s;
import Wc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.actionHandlers.ugc.updateCellSelectionFormMobile.data.UpdateCellActionResponse;
import ru.ozon.app.android.composer.ComposerReferences;
import xe.C10720e0;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.actionHandlers.ugc.updateCellSelectionFormMobile.UpdateCellSelectionFormActionHandler$processAction$1", f = "UpdateCellSelectionFormActionHandler.kt", l = {59, UserVerificationMethods.USER_VERIFY_EYEPRINT, 67, 81}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class UpdateCellSelectionFormActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ ComposerReferences $refs;
    final /* synthetic */ ActionV2Request $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UpdateCellSelectionFormActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateCellSelectionFormActionHandler$processAction$1(InterfaceC7851b interfaceC7851b, UpdateCellSelectionFormActionHandler updateCellSelectionFormActionHandler, ActionV2Request actionV2Request, ComposerReferences composerReferences, CustomActionHandler.HandlerReferences handlerReferences, d<? super UpdateCellSelectionFormActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.$controller = interfaceC7851b;
        this.this$0 = updateCellSelectionFormActionHandler;
        this.$request = actionV2Request;
        this.$refs = composerReferences;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        UpdateCellSelectionFormActionHandler$processAction$1 updateCellSelectionFormActionHandler$processAction$1 = new UpdateCellSelectionFormActionHandler$processAction$1(this.$controller, this.this$0, this.$request, this.$refs, this.$handlerRefs, dVar);
        updateCellSelectionFormActionHandler$processAction$1.L$0 = obj;
        return updateCellSelectionFormActionHandler$processAction$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if (r10 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r10 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (xe.C10727i.f(r10, r4, r9) == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Object obj2;
        Object handleError;
        Throwable b11;
        Object handleError2;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            this.$controller.e(new l.a.C1079a(0L, null, 3));
            UpdateCellSelectionFormActionHandler updateCellSelectionFormActionHandler = this.this$0;
            ActionV2Request actionV2Request = this.$request;
            r.Companion companion2 = r.INSTANCE;
            actionV2Repository = updateCellSelectionFormActionHandler.actionV2Repository;
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, UpdateCellActionResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
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
                UpdateCellSelectionFormActionHandler updateCellSelectionFormActionHandler2 = this.this$0;
                InterfaceC7851b interfaceC7851b = this.$controller;
                ComposerReferences composerReferences = this.$refs;
                b11 = r.b(obj2);
                if (b11 != null) {
                    Lm0.a.f17149a.e(b11);
                    this.L$0 = obj2;
                    this.label = 4;
                    handleError2 = updateCellSelectionFormActionHandler2.handleError(interfaceC7851b, composerReferences, this);
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        a11 = (UpdateCellActionResponse) ((ActionV2Response) obj).getData();
        r.Companion companion3 = r.INSTANCE;
        obj2 = a11;
        UpdateCellSelectionFormActionHandler updateCellSelectionFormActionHandler3 = this.this$0;
        InterfaceC7851b interfaceC7851b2 = this.$controller;
        ComposerReferences composerReferences2 = this.$refs;
        CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
        if (!(obj2 instanceof r.b)) {
            UpdateCellActionResponse updateCellActionResponse = (UpdateCellActionResponse) obj2;
            if (updateCellActionResponse == null) {
                this.L$0 = obj2;
                this.label = 2;
                handleError = updateCellSelectionFormActionHandler3.handleError(interfaceC7851b2, composerReferences2, this);
            } else {
                interfaceC7851b2.hideLoader();
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 l02 = De.s.f6650a;
                UpdateCellSelectionFormActionHandler$processAction$1$2$1 updateCellSelectionFormActionHandler$processAction$1$2$1 = new UpdateCellSelectionFormActionHandler$processAction$1$2$1(handlerReferences, composerReferences2, updateCellActionResponse, null);
                this.L$0 = obj2;
                this.label = 3;
            }
            return Unit.f71690a;
        }
        UpdateCellSelectionFormActionHandler updateCellSelectionFormActionHandler22 = this.this$0;
        InterfaceC7851b interfaceC7851b3 = this.$controller;
        ComposerReferences composerReferences3 = this.$refs;
        b11 = r.b(obj2);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((UpdateCellSelectionFormActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
