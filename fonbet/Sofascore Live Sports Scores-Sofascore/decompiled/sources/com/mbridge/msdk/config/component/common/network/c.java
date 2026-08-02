package com.mbridge.msdk.config.component.common.network;

import com.mbridge.msdk.foundation.tools.q0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {
    private com.mbridge.msdk.config.component.common.network.a a;
    private com.mbridge.msdk.config.component.common.network.result.a b;
    private com.mbridge.msdk.config.component.nori.model.a c;
    private com.mbridge.msdk.config.component.nori.monitor.b d;
    private String e;
    private String f = "HTTP";
    private com.mbridge.msdk.config.component.common.network.connect.socket.a g = null;
    private com.mbridge.msdk.config.component.common.network.connect.okhttp.a h = null;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements com.mbridge.msdk.config.component.common.network.b {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.b
        public void a() {
            if (c.this.g != null) {
                c.this.g.a();
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements com.mbridge.msdk.config.component.common.network.b {
        public b() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.b
        public void a() {
            if (c.this.h != null) {
                c.this.h.a();
            }
        }
    }

    public c(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2) {
        this.c = aVar;
        this.b = aVar2;
        this.d = aVar2.a();
    }

    private void a() {
        try {
            com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar = new com.mbridge.msdk.config.component.common.network.connect.okhttp.a(this.c, this.b, this.a);
            this.h = aVar;
            aVar.a(this.e);
            this.d.a(new b());
        } catch (Exception e) {
            q0.b("NetworkRequestTask", e.getMessage(), e);
        }
    }

    private void c() {
        try {
            com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = new com.mbridge.msdk.config.component.common.network.connect.socket.a(this.c, this.b, this.a);
            this.g = aVar;
            aVar.a(this.e);
            this.d.a(new a());
        } catch (Exception e) {
            q0.b("NetworkRequestTask", e.getMessage(), e);
        }
    }

    public void b() {
        com.mbridge.msdk.config.component.common.network.a aVar = this.a;
        if (aVar != null) {
            aVar.a(this.b);
        }
        if (this.f.equals("TCP")) {
            c();
        } else {
            a();
        }
    }

    public void a(String str, com.mbridge.msdk.config.component.common.network.a aVar) {
        this.e = str;
        this.a = aVar;
        this.f = this.c.i();
    }
}
