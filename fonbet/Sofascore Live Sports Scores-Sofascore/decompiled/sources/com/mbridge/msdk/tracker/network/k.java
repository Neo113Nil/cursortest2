package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.network.v;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class k extends h<String> implements v.a {
    private final j<String> C;

    public k(int i, String str, String str2, long j, j<String> jVar) {
        super(i, str, 0, str2, j);
        this.C = jVar;
        a((v.a) this);
    }

    private void b(v<String> vVar) {
        j<String> jVar = this.C;
        if (jVar != null) {
            try {
                jVar.b(this, vVar, vVar.c.a);
            } catch (Exception e) {
                q0.b(h.B, "parseNetworkResponse error: ", e);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public v<String> a(q qVar) {
        try {
            v<String> a = v.a(new String(qVar.b, StandardCharsets.UTF_8), com.mbridge.msdk.tracker.network.toolbox.f.a(qVar));
            a(a, qVar);
            return a;
        } catch (Throwable th) {
            q0.b(h.B, "parseNetworkResponse error: ", th);
            v<String> a2 = v.a(new a0(th));
            b(a2);
            return a2;
        }
    }

    @Override // com.mbridge.msdk.tracker.network.t
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a(String str) {
    }

    private void a(v<String> vVar, q qVar) {
        j<String> jVar = this.C;
        if (jVar != null) {
            try {
                jVar.a(this, vVar, qVar);
            } catch (Exception e) {
                q0.b(h.B, "parseNetworkResponse error: ", e);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.v.a
    public void a(b0 b0Var) {
        b(v.a(b0Var));
    }
}
