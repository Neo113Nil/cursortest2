package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.c1;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r0 implements s0 {
    public String a;
    public String b;
    public l0 c;
    public o0 d;
    public p0 e;
    public t0 f;
    public u0 g;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "id", this.a);
        c1.a(jSONObject, "spotId", this.b);
        c1.a(jSONObject, U3.i.d, this.c);
        c1.a(jSONObject, "monitor", this.d);
        c1.a(jSONObject, IronSourceConstants.EVENTS_NATIVE, this.e);
        c1.a(jSONObject, "video", this.f);
        c1.a(jSONObject, "viewability", this.g);
        return jSONObject.toString();
    }
}
