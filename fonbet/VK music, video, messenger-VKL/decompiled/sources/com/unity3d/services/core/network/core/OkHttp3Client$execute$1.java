package com.unity3d.services.core.network.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: OkHttp3Client.kt */
@b6l(c = "com.unity3d.services.core.network.core.OkHttp3Client", f = "OkHttp3Client.kt", l = {134}, m = "execute")
/* loaded from: classes14.dex */
public final class OkHttp3Client$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OkHttp3Client this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttp3Client$execute$1(OkHttp3Client okHttp3Client, spj<? super OkHttp3Client$execute$1> spjVar) {
        super(spjVar);
        this.this$0 = okHttp3Client;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, false, this);
    }
}
