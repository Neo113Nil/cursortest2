package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.datastore.WebviewConfigurationStore;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", f = "WebviewConfigurationDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class WebviewConfigurationDataSource$set$2 extends hoi implements Function2<WebviewConfigurationStore.WebViewConfigurationStore, rq3<? super WebviewConfigurationStore.WebViewConfigurationStore>, Object> {
    final /* synthetic */ WebviewConfigurationStore.WebViewConfigurationStore $data;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebviewConfigurationDataSource$set$2(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, rq3<? super WebviewConfigurationDataSource$set$2> rq3Var) {
        super(2, rq3Var);
        this.$data = webViewConfigurationStore;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new WebviewConfigurationDataSource$set$2(this.$data, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, rq3<? super WebviewConfigurationStore.WebViewConfigurationStore> rq3Var) {
        return ((WebviewConfigurationDataSource$set$2) create(webViewConfigurationStore, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        if (this.label == 0) {
            y6a.M(obj);
            return this.$data;
        }
        a70.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
