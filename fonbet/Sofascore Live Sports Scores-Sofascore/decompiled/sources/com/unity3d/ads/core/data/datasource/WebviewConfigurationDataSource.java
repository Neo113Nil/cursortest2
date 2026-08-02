package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.datastore.WebviewConfigurationStore;
import defpackage.lu3;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.t98;
import defpackage.ye4;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "", "Lye4;", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "webviewConfigurationStore", "<init>", "(Lye4;)V", "get", "(Lrq3;)Ljava/lang/Object;", "data", "", "set", "(Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;Lrq3;)Ljava/lang/Object;", "Lye4;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebviewConfigurationDataSource {

    @NotNull
    private final ye4 webviewConfigurationStore;

    public WebviewConfigurationDataSource(@NotNull ye4 ye4Var) {
        ye4Var.getClass();
        this.webviewConfigurationStore = ye4Var;
    }

    @Nullable
    public final Object get(@NotNull rq3<? super WebviewConfigurationStore.WebViewConfigurationStore> rq3Var) {
        return rd0.y(new t98(this.webviewConfigurationStore.getData(), new WebviewConfigurationDataSource$get$2(null), 1), rq3Var);
    }

    @Nullable
    public final Object set(@NotNull WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, @NotNull rq3<? super Unit> rq3Var) {
        Object a = this.webviewConfigurationStore.a(new WebviewConfigurationDataSource$set$2(webViewConfigurationStore, null), rq3Var);
        return a == lu3.a ? a : Unit.a;
    }
}
