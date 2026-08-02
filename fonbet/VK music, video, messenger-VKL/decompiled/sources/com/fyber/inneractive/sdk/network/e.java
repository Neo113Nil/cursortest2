package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public final class e implements f0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ JSONArray b;
    public final /* synthetic */ long c;

    public e(String str, JSONArray jSONArray, long j) {
        this.a = str;
        this.b = jSONArray;
        this.c = j;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.a("Event Request: Hitting URL finished: %s, body: %s", this.a, this.b);
        if (exc == null) {
            IAlog.a("Event Request: Hitting URL response code: %s", str);
        } else {
            IAlog.a("Event Request: Hitting URL failed: %s", exc);
        }
        IAlog.a("Event Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.c));
    }
}
