package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: CronetClient.kt */
@b6l(c = "com.unity3d.services.core.network.core.CronetClient$executeBlocking$1", f = "CronetClient.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class CronetClient$executeBlocking$1 extends SuspendLambda implements wzs<yvj, spj<? super HttpResponse>, Object> {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ CronetClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronetClient$executeBlocking$1(CronetClient cronetClient, HttpRequest httpRequest, spj<? super CronetClient$executeBlocking$1> spjVar) {
        super(2, spjVar);
        this.this$0 = cronetClient;
        this.$request = httpRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new CronetClient$executeBlocking$1(this.this$0, this.$request, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
            return obj;
        }
        a.a(obj);
        CronetClient cronetClient = this.this$0;
        HttpRequest httpRequest = this.$request;
        this.label = 1;
        Object execute$default = HttpClient.DefaultImpls.execute$default(cronetClient, httpRequest, false, this, 2, null);
        return execute$default == coroutineSingletons ? coroutineSingletons : execute$default;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super HttpResponse> spjVar) {
        return ((CronetClient$executeBlocking$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
