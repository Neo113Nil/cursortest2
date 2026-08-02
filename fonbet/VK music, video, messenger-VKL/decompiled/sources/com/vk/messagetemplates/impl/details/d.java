package com.vk.messagetemplates.impl.details;

import com.vk.messagetemplates.impl.details.b;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.d230;
import xsna.ezv;
import xsna.f040;
import xsna.rdi;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.y160;
import xsna.yvj;

/* compiled from: TemplateDetailsInlineActor.kt */
@b6l(c = "com.vk.messagetemplates.impl.details.TemplateDetailsInlineActor$saveChanges$1", f = "TemplateDetailsInlineActor.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, spj<? super d> spjVar) {
        super(2, spjVar);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        d dVar = new d(this.this$0, spjVar);
        dVar.L$0 = obj;
        return dVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                rdi.y(this.this$0, new y160(14));
                Integer num = ((TemplateDetailsState) this.this$0.b.getCurrentState()).b;
                String str = ((TemplateDetailsState) this.this$0.b.getCurrentState()).c;
                if (str == null) {
                    str = "";
                }
                String str2 = ((TemplateDetailsState) this.this$0.b.getCurrentState()).d;
                String str3 = str2 != null ? str2 : "";
                ezv ezvVar = this.this$0.d;
                f040 f040Var = new f040(num, str, str3);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = 0;
                this.label = 1;
                if (ezvVar.a(yvjVar, f040Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        c cVar = this.this$0;
        Throwable a = Result.a(failure);
        if (a != null) {
            rdi.y(cVar, new d230(18));
            cVar.c(new b.C1272b(a));
        }
        c cVar2 = this.this$0;
        if (!(failure instanceof Result.Failure)) {
            cVar2.c(b.a.a);
        }
        return s3q0.a;
    }
}
