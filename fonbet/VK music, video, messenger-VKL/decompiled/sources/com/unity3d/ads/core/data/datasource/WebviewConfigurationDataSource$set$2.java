package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.datastore.WebviewConfigurationStore;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: WebviewConfigurationDataSource.kt */
@b6l(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", f = "WebviewConfigurationDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class WebviewConfigurationDataSource$set$2 extends SuspendLambda implements wzs<WebviewConfigurationStore.WebViewConfigurationStore, spj<? super WebviewConfigurationStore.WebViewConfigurationStore>, Object> {
    final /* synthetic */ WebviewConfigurationStore.WebViewConfigurationStore $data;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebviewConfigurationDataSource$set$2(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, spj<? super WebviewConfigurationDataSource$set$2> spjVar) {
        super(2, spjVar);
        this.$data = webViewConfigurationStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new WebviewConfigurationDataSource$set$2(this.$data, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, spj<? super WebviewConfigurationStore.WebViewConfigurationStore> spjVar) {
        return ((WebviewConfigurationDataSource$set$2) create(webViewConfigurationStore, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        return this.$data;
    }
}
