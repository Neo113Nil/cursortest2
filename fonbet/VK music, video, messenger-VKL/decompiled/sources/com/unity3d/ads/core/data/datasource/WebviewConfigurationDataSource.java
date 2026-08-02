package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.datastore.WebviewConfigurationStore;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import xsna.fvk;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;

/* compiled from: WebviewConfigurationDataSource.kt */
/* loaded from: classes14.dex */
public final class WebviewConfigurationDataSource {
    private final fvk<WebviewConfigurationStore.WebViewConfigurationStore> webviewConfigurationStore;

    public WebviewConfigurationDataSource(fvk<WebviewConfigurationStore.WebViewConfigurationStore> fvkVar) {
        this.webviewConfigurationStore = fvkVar;
    }

    public final Object get(spj<? super WebviewConfigurationStore.WebViewConfigurationStore> spjVar) {
        return rsr.n(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(this.webviewConfigurationStore.getData(), new WebviewConfigurationDataSource$get$2(null)), spjVar);
    }

    public final Object set(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, spj<? super s3q0> spjVar) {
        Object a = this.webviewConfigurationStore.a(new WebviewConfigurationDataSource$set$2(webViewConfigurationStore, null), spjVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }
}
