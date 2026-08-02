package com.moloco.sdk.internal.services;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j {
    public final Context a;
    public final com.moloco.sdk.acm.recorder.c b;

    public j(Context context, com.moloco.sdk.acm.recorder.c cVar) {
        this.a = context;
        this.b = cVar;
    }

    public final void a(String str) {
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("webview_not_available");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
        dVar.a("reason", str);
        this.b.a(dVar);
    }
}
