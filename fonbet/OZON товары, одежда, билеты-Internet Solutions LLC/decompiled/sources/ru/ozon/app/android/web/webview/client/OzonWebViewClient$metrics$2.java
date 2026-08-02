package ru.ozon.app.android.web.webview.client;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class OzonWebViewClient$metrics$2 extends C7735q implements Function2<String, Long, Unit> {
    OzonWebViewClient$metrics$2(Object obj) {
        super(2, obj, OzonWebViewClient.class, "pageLoadedMetricCalculatedHandler", "pageLoadedMetricCalculatedHandler(Ljava/lang/String;J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Long l11) {
        invoke(str, l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(String p02, long j11) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((OzonWebViewClient) this.receiver).pageLoadedMetricCalculatedHandler(p02, j11);
    }
}
