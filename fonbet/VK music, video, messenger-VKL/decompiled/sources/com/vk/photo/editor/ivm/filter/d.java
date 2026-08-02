package com.vk.photo.editor.ivm.filter;

import android.content.Context;
import com.vk.photo.editor.domain.LowMemoryException;
import com.vk.photo.editor.ivm.filter.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.mdr;
import xsna.n4p;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: FilterStore.kt */
@b6l(c = "com.vk.photo.editor.ivm.filter.FilterStore$loadFilters$1", f = "FilterStore.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, Context context, spj<? super d> spjVar) {
        super(2, spjVar);
        this.this$0 = iVar;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new d(this.this$0, this.$context, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                mdr mdrVar = this.this$0.f;
                Context context = this.$context;
                this.label = 1;
                if (mdrVar.f(context, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
        } catch (LowMemoryException e) {
            n4p invoke = this.this$0.g.invoke();
            if (invoke != null) {
                invoke.a(e);
            }
            this.this$0.a.d(a.C1468a.a);
        }
        return s3q0.a;
    }
}
