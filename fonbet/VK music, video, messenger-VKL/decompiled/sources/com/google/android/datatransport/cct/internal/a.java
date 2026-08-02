package com.google.android.datatransport.cct.internal;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import xsna.am5;
import xsna.bm5;
import xsna.cjp;
import xsna.cm5;
import xsna.f000;
import xsna.f7r;
import xsna.fn5;
import xsna.g52;
import xsna.gv6;
import xsna.gzi;
import xsna.hn5;
import xsna.i9q;
import xsna.lfq;
import xsna.mfq;
import xsna.mp70;
import xsna.np70;
import xsna.ok5;
import xsna.q000;
import xsna.rk5;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* loaded from: classes.dex */
public final class a implements gzi {
    public static final a a = new a();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.internal.a$a, reason: collision with other inner class name */
    public static final class C0109a implements mp70<g52> {
        public static final C0109a a = new C0109a();
        public static final f7r b = f7r.b("sdkVersion");
        public static final f7r c = f7r.b("model");
        public static final f7r d = f7r.b("hardware");
        public static final f7r e = f7r.b("device");
        public static final f7r f = f7r.b("product");
        public static final f7r g = f7r.b("osBuild");
        public static final f7r h = f7r.b("manufacturer");
        public static final f7r i = f7r.b(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT);
        public static final f7r j = f7r.b("locale");
        public static final f7r k = f7r.b("country");
        public static final f7r l = f7r.b("mccMnc");
        public static final f7r m = f7r.b("applicationBuild");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            g52 g52Var = (g52) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, g52Var.l());
            np70Var2.add(c, g52Var.i());
            np70Var2.add(d, g52Var.e());
            np70Var2.add(e, g52Var.c());
            np70Var2.add(f, g52Var.k());
            np70Var2.add(g, g52Var.j());
            np70Var2.add(h, g52Var.g());
            np70Var2.add(i, g52Var.d());
            np70Var2.add(j, g52Var.f());
            np70Var2.add(k, g52Var.b());
            np70Var2.add(l, g52Var.h());
            np70Var2.add(m, g52Var.a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class b implements mp70<gv6> {
        public static final b a = new b();
        public static final f7r b = f7r.b("logRequest");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            np70Var.add(b, ((gv6) obj).a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class c implements mp70<ClientInfo> {
        public static final c a = new c();
        public static final f7r b = f7r.b("clientType");
        public static final f7r c = f7r.b("androidClientInfo");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            ClientInfo clientInfo = (ClientInfo) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, clientInfo.b());
            np70Var2.add(c, clientInfo.a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class d implements mp70<ComplianceData> {
        public static final d a = new d();
        public static final f7r b = f7r.b("privacyContext");
        public static final f7r c = f7r.b("productIdOrigin");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            ComplianceData complianceData = (ComplianceData) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, complianceData.a());
            np70Var2.add(c, complianceData.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class e implements mp70<i9q> {
        public static final e a = new e();
        public static final f7r b = f7r.b("clearBlob");
        public static final f7r c = f7r.b("encryptedBlob");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            i9q i9qVar = (i9q) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, i9qVar.a());
            np70Var2.add(c, i9qVar.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class f implements mp70<lfq> {
        public static final f a = new f();
        public static final f7r b = f7r.b("originAssociatedProductId");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            np70Var.add(b, ((lfq) obj).a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class g implements mp70<mfq> {
        public static final g a = new g();
        public static final f7r b = f7r.b("prequest");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            np70Var.add(b, ((mfq) obj).a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class h implements mp70<f000> {
        public static final h a = new h();
        public static final f7r b = f7r.b("eventTimeMs");
        public static final f7r c = f7r.b("eventCode");
        public static final f7r d = f7r.b("complianceData");
        public static final f7r e = f7r.b("eventUptimeMs");
        public static final f7r f = f7r.b("sourceExtension");
        public static final f7r g = f7r.b("sourceExtensionJsonProto3");
        public static final f7r h = f7r.b("timezoneOffsetSeconds");
        public static final f7r i = f7r.b("networkConnectionInfo");
        public static final f7r j = f7r.b("experimentIds");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            f000 f000Var = (f000) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, f000Var.c());
            np70Var2.add(c, f000Var.b());
            np70Var2.add(d, f000Var.a());
            np70Var2.add(e, f000Var.d());
            np70Var2.add(f, f000Var.g());
            np70Var2.add(g, f000Var.h());
            np70Var2.add(h, f000Var.i());
            np70Var2.add(i, f000Var.f());
            np70Var2.add(j, f000Var.e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class i implements mp70<q000> {
        public static final i a = new i();
        public static final f7r b = f7r.b("requestTimeMs");
        public static final f7r c = f7r.b("requestUptimeMs");
        public static final f7r d = f7r.b("clientInfo");
        public static final f7r e = f7r.b("logSource");
        public static final f7r f = f7r.b("logSourceName");
        public static final f7r g = f7r.b("logEvent");
        public static final f7r h = f7r.b("qosTier");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            q000 q000Var = (q000) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, q000Var.f());
            np70Var2.add(c, q000Var.g());
            np70Var2.add(d, q000Var.a());
            np70Var2.add(e, q000Var.c());
            np70Var2.add(f, q000Var.d());
            np70Var2.add(g, q000Var.b());
            np70Var2.add(h, q000Var.e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class j implements mp70<NetworkConnectionInfo> {
        public static final j a = new j();
        public static final f7r b = f7r.b("networkType");
        public static final f7r c = f7r.b("mobileSubtype");

        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) throws IOException {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            np70 np70Var2 = np70Var;
            np70Var2.add(b, networkConnectionInfo.b());
            np70Var2.add(c, networkConnectionInfo.a());
        }
    }

    @Override // xsna.gzi
    public final void configure(cjp<?> cjpVar) {
        b bVar = b.a;
        cjpVar.registerEncoder(gv6.class, bVar);
        cjpVar.registerEncoder(rk5.class, bVar);
        i iVar = i.a;
        cjpVar.registerEncoder(q000.class, iVar);
        cjpVar.registerEncoder(hn5.class, iVar);
        c cVar = c.a;
        cjpVar.registerEncoder(ClientInfo.class, cVar);
        cjpVar.registerEncoder(com.google.android.datatransport.cct.internal.b.class, cVar);
        C0109a c0109a = C0109a.a;
        cjpVar.registerEncoder(g52.class, c0109a);
        cjpVar.registerEncoder(ok5.class, c0109a);
        h hVar = h.a;
        cjpVar.registerEncoder(f000.class, hVar);
        cjpVar.registerEncoder(fn5.class, hVar);
        d dVar = d.a;
        cjpVar.registerEncoder(ComplianceData.class, dVar);
        cjpVar.registerEncoder(com.google.android.datatransport.cct.internal.c.class, dVar);
        g gVar = g.a;
        cjpVar.registerEncoder(mfq.class, gVar);
        cjpVar.registerEncoder(cm5.class, gVar);
        f fVar = f.a;
        cjpVar.registerEncoder(lfq.class, fVar);
        cjpVar.registerEncoder(bm5.class, fVar);
        j jVar = j.a;
        cjpVar.registerEncoder(NetworkConnectionInfo.class, jVar);
        cjpVar.registerEncoder(com.google.android.datatransport.cct.internal.d.class, jVar);
        e eVar = e.a;
        cjpVar.registerEncoder(i9q.class, eVar);
        cjpVar.registerEncoder(am5.class, eVar);
    }
}
