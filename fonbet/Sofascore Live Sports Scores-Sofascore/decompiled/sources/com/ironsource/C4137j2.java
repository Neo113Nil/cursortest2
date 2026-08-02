package com.ironsource;

import com.ironsource.mediationsdk.e;
import java.net.URL;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.j2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4137j2 extends e.a {
    public C4137j2(S1 s1, URL url, JSONObject jSONObject, boolean z, C4263q2 c4263q2) {
        super(s1, url, jSONObject, z, c4263q2);
    }

    @Override // com.ironsource.mediationsdk.e.a
    public void a(boolean z, S1 s1, long j) {
        try {
            if (z) {
                ((InterfaceC4012c2) s1).a(this.b, this.f + 1, j, this.j, this.i);
            } else {
                s1.a(this.c, this.d, this.f + 1, this.g, j);
            }
        } catch (Exception e) {
            C4157k4.d().a(e);
            s1.a(1009, e.getMessage(), this.f + 1, this.g, j);
        }
    }
}
