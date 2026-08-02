package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation;

import Ae.x0;
import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.ReconciliationActsDeclinerRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.api.Message;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.api.RejectReconciliationActRequestDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.api.RejectReconciliationActResponseDTO;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerViewModel$submitDecline$1", f = "ReconciliationActsDeclinerViewModel.kt", l = {81, 89}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ReconciliationActsDeclinerViewModel$submitDecline$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ JsonParser $jsonDeserializer;
    final /* synthetic */ String $postData;
    int label;
    final /* synthetic */ ReconciliationActsDeclinerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReconciliationActsDeclinerViewModel$submitDecline$1(ReconciliationActsDeclinerViewModel reconciliationActsDeclinerViewModel, String str, JsonParser jsonParser, String str2, d<? super ReconciliationActsDeclinerViewModel$submitDecline$1> dVar) {
        super(2, dVar);
        this.this$0 = reconciliationActsDeclinerViewModel;
        this.$postData = str;
        this.$jsonDeserializer = jsonParser;
        this.$actionName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReconciliationActsDeclinerViewModel$submitDecline$1(this.this$0, this.$postData, this.$jsonDeserializer, this.$actionName, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0068, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x002b, code lost:
    
        if (r6 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        ReconciliationActsDeclinerRepository reconciliationActsDeclinerRepository;
        RejectReconciliationActRequestDTO rejectReconciliationActRequest;
        x0 x0Var2;
        x0 x0Var3;
        x0 x0Var4;
        x0 x0Var5;
        x0 x0Var6;
        x0 x0Var7;
        x0 x0Var8;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ReconciliationActsDeclinerViewModel reconciliationActsDeclinerViewModel = this.this$0;
            String str = this.$postData;
            JsonParser jsonParser = this.$jsonDeserializer;
            this.label = 1;
            obj = reconciliationActsDeclinerViewModel.getDocumentId(str, jsonParser, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                Result result = (Result) obj;
                if (result instanceof Result.Success) {
                    x0Var5 = this.this$0._showGeneralLoader;
                    x0Var5.setValue(Boolean.FALSE);
                    Result.Success success = (Result.Success) result;
                    Message message = ((RejectReconciliationActResponseDTO) success.getValue()).getMessage();
                    String text = message != null ? message.getText() : null;
                    if (text != null) {
                        x0Var8 = this.this$0._flashbarErrorMessage;
                        x0Var8.setValue(new FlashBarErrorWrapper(text));
                    }
                    if (Intrinsics.d(((RejectReconciliationActResponseDTO) success.getValue()).isSuccess(), Boolean.TRUE)) {
                        String deeplink = ((RejectReconciliationActResponseDTO) success.getValue()).getDeeplink();
                        if (deeplink != null) {
                            x0Var7 = this.this$0._deepLinkAction;
                            x0Var7.setValue(deeplink);
                        }
                    } else {
                        String error = ((RejectReconciliationActResponseDTO) success.getValue()).getError();
                        if (error != null) {
                            x0Var6 = this.this$0._flashbarErrorMessage;
                            x0Var6.setValue(new FlashBarErrorWrapper(error));
                        }
                    }
                } else {
                    if (!(result instanceof Result.Failure)) {
                        throw new o();
                    }
                    x0Var3 = this.this$0._flashbarErrorMessage;
                    x0Var3.setValue(new FlashBarErrorWrapper(StringProvider.getString(R$string.error_common_message_service_error)));
                    x0Var4 = this.this$0._showGeneralLoader;
                    x0Var4.setValue(Boolean.FALSE);
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        String str2 = (String) obj;
        if (str2 == null) {
            x0Var2 = this.this$0._flashbarErrorMessage;
            x0Var2.setValue(new FlashBarErrorWrapper(StringProvider.getString(R$string.error_common_message_service_error)));
            return Unit.f71690a;
        }
        x0Var = this.this$0._showGeneralLoader;
        x0Var.setValue(Boolean.TRUE);
        reconciliationActsDeclinerRepository = this.this$0.repository;
        String str3 = this.$actionName;
        rejectReconciliationActRequest = this.this$0.getRejectReconciliationActRequest(str2);
        this.label = 2;
        obj = reconciliationActsDeclinerRepository.rejectReconciliationAct(str3, rejectReconciliationActRequest, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReconciliationActsDeclinerViewModel$submitDecline$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
