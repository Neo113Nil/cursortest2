package com.unity3d.ads.core.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidHttpClientProvider.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", f = "AndroidHttpClientProvider.kt", l = {68}, m = "createHttpClient")
/* loaded from: classes14.dex */
public final class AndroidHttpClientProvider$createHttpClient$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidHttpClientProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHttpClientProvider$createHttpClient$1(AndroidHttpClientProvider androidHttpClientProvider, spj<? super AndroidHttpClientProvider$createHttpClient$1> spjVar) {
        super(spjVar);
        this.this$0 = androidHttpClientProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object createHttpClient;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        createHttpClient = this.this$0.createHttpClient(this);
        return createHttpClient;
    }
}
