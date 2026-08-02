package com.vk.photo.editor.ivm.filter;

import com.vk.photo.editor.domain.LowMemoryException;
import com.vk.photo.editor.ivm.filter.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.n4p;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: FilterStore.kt */
@b6l(c = "com.vk.photo.editor.ivm.filter.FilterStore$updatePreviewRepository$3", f = "FilterStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class h extends SuspendLambda implements wzs<Exception, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, spj<? super h> spjVar) {
        super(2, spjVar);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        h hVar = new h(this.this$0, spjVar);
        hVar.L$0 = obj;
        return hVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Exception exc, spj<? super s3q0> spjVar) {
        return ((h) create(exc, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n4p invoke;
        Exception exc = (Exception) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (exc != null && (invoke = this.this$0.g.invoke()) != null) {
            invoke.a(exc);
        }
        if (exc instanceof LowMemoryException) {
            this.this$0.a.d(a.C1468a.a);
        }
        return s3q0.a;
    }
}
