package ru.ozon.app.android.web.webview.cache.service;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class LocalStateActualizer$loadResources$1 extends C7735q implements Function1<String, Boolean> {
    LocalStateActualizer$loadResources$1(Object obj) {
        super(1, obj, ResourcesLoader.class, "loadResource", "loadResource(Ljava/lang/String;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return Boolean.valueOf(((ResourcesLoader) this.receiver).loadResource(p02));
    }
}
