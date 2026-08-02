package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation.ExternalVerificationViewModel$handleMessage$1", f = "ExternalVerificationViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ExternalVerificationViewModel$handleMessage$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $message;
    final /* synthetic */ ExternalVerificationVO $vo;
    int label;
    final /* synthetic */ ExternalVerificationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExternalVerificationViewModel$handleMessage$1(ExternalVerificationVO externalVerificationVO, ExternalVerificationViewModel externalVerificationViewModel, String str, d<? super ExternalVerificationViewModel$handleMessage$1> dVar) {
        super(2, dVar);
        this.$vo = externalVerificationVO;
        this.this$0 = externalVerificationViewModel;
        this.$message = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ExternalVerificationViewModel$handleMessage$1(this.$vo, this.this$0, this.$message, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String action = this.$vo.getAction();
        if (action == null || action.length() == 0) {
            this.this$0.verificationFlowV1(this.$message, this.$vo);
        } else {
            this.this$0.verificationOtpFlowV2(this.$message, this.$vo);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ExternalVerificationViewModel$handleMessage$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
