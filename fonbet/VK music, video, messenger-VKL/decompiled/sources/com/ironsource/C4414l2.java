package com.ironsource;

import com.ironsource.mediationsdk.e;
import java.net.URL;
import org.json.JSONObject;

/* renamed from: com.ironsource.l2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4414l2 extends e.a {
    public C4414l2(U1 u1, URL url, JSONObject jSONObject, boolean z, C4539s2 c4539s2) {
        super(u1, url, jSONObject, z, c4539s2);
    }

    @Override // com.ironsource.mediationsdk.e.a
    public void a(boolean z, U1 u1, long j) {
        try {
            if (z) {
                ((InterfaceC4289e2) u1).a(this.b, this.f + 1, j, this.j, this.i);
            } else {
                u1.a(this.c, this.d, this.f + 1, this.g, j);
            }
        } catch (Exception e) {
            C4452n4.d().a(e);
            u1.a(1009, e.getMessage(), this.f + 1, this.g, j);
        }
    }
}
