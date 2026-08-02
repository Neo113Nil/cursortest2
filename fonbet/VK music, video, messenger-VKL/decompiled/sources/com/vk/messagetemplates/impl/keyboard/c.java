package com.vk.messagetemplates.impl.keyboard;

import com.vk.messagetemplates.impl.keyboard.a;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.ezv;
import xsna.h040;
import xsna.qso;
import xsna.rdi;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: TemplatesKeyboardInlineActor.kt */
@b6l(c = "com.vk.messagetemplates.impl.keyboard.TemplatesKeyboardInlineActor$deleteTemplate$1", f = "TemplatesKeyboardInlineActor.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $templateId;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, int i, spj<? super c> spjVar) {
        super(2, spjVar);
        this.this$0 = dVar;
        this.$templateId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        c cVar = new c(this.this$0, this.$templateId, spjVar);
        cVar.L$0 = obj;
        return cVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
                d dVar = this.this$0;
                int i2 = this.$templateId;
                ezv ezvVar = dVar.e;
                h040 h040Var = new h040(i2);
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                if (ezvVar.a(yvjVar, h040Var, this) == coroutineSingletons) {
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
        d dVar2 = this.this$0;
        int i3 = this.$templateId;
        if (!(failure instanceof Result.Failure)) {
            rdi.y(dVar2, new qso(i3, 2));
        }
        d dVar3 = this.this$0;
        Throwable a = Result.a(failure);
        if (a != null) {
            dVar3.c(new a.C1273a(a));
        }
        return s3q0.a;
    }
}
