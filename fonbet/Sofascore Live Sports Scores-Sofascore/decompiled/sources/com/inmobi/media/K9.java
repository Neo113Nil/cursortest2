package com.inmobi.media;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class K9 implements Runnable {
    public final /* synthetic */ JSONObject a;

    public K9(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC3633nl.c()) {
            return;
        }
        Q9.a(this.a);
    }
}
