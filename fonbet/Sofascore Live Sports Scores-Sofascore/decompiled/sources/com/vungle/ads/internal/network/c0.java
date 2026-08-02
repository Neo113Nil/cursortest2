package com.vungle.ads.internal.network;

import com.ironsource.C4094gc;
import com.ironsource.C4427z5;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.p1;
import com.vungle.ads.internal.model.t1;
import com.vungle.ads.internal.model.v2;
import defpackage.cga;
import defpackage.duf;
import defpackage.il9;
import defpackage.jl9;
import defpackage.jod;
import defpackage.ktm;
import defpackage.pof;
import defpackage.pzf;
import defpackage.q89;
import defpackage.qzf;
import defpackage.sha;
import defpackage.vha;
import defpackage.wzf;
import defpackage.xzf;
import defpackage.yea;
import defpackage.yg2;
import defpackage.yzf;
import defpackage.zzl;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c0 {
    public static final yea c = cga.c(b0.a);
    public final yg2 a;
    public final com.vungle.ads.internal.network.converters.b b;

    public c0(jod jodVar) {
        jodVar.getClass();
        this.a = jodVar;
        this.b = new com.vungle.ads.internal.network.converters.b();
    }

    public final m a(String str, String str2, t1 t1Var) {
        List a;
        str.getClass();
        str2.getClass();
        t1Var.getClass();
        try {
            yea yeaVar = c;
            String c2 = yeaVar.c(sha.Q(yeaVar.b, duf.b(t1.class)), t1Var);
            p1 c3 = t1Var.c();
            pzf a2 = a(this, str, str2, (c3 == null || (a = c3.a()) == null) ? null : (String) CollectionsKt.firstOrNull(a), null, 8);
            yzf.Companion.getClass();
            wzf b = xzf.b(c2, null);
            a2.getClass();
            a2.e(C4094gc.b, b);
            qzf qzfVar = new qzf(a2);
            jod jodVar = (jod) this.a;
            jodVar.getClass();
            return new m(new pof(jodVar, qzfVar), new com.vungle.ads.internal.network.converters.d(duf.b(h0.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    public final m b(String str, String str2, yzf yzfVar) {
        str.getClass();
        str2.getClass();
        yzfVar.getClass();
        il9 il9Var = new il9(0);
        il9Var.h(null, str2);
        jl9 c2 = il9Var.c().g().c();
        pzf pzfVar = new pzf();
        pzfVar.a = c2;
        pzfVar.a(Command.HTTP_HEADER_USER_AGENT, str);
        pzfVar.a("Vungle-Version", "7.1.0");
        pzfVar.a("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        String b = d0.b();
        if (b != null) {
            pzfVar.a("X-Vungle-App-Id", b);
        }
        String c3 = d0.c();
        if (c3 != null) {
            pzfVar.a("X-VUNGLE-APP-VERSION", c3);
        }
        pzfVar.e(C4094gc.b, yzfVar);
        qzf qzfVar = new qzf(pzfVar);
        jod jodVar = (jod) this.a;
        jodVar.getClass();
        return new m(new pof(jodVar, qzfVar), this.b);
    }

    public final m c(String str, String str2, t1 t1Var) {
        str.getClass();
        str2.getClass();
        t1Var.getClass();
        try {
            yea yeaVar = c;
            String c2 = yeaVar.c(sha.Q(yeaVar.b, duf.b(t1.class)), t1Var);
            pzf a = a(this, str, str2, null, null, 12);
            yzf.Companion.getClass();
            wzf b = xzf.b(c2, null);
            a.getClass();
            a.e(C4094gc.b, b);
            qzf qzfVar = new qzf(a);
            jod jodVar = (jod) this.a;
            jodVar.getClass();
            return new m(new pof(jodVar, qzfVar), this.b);
        } catch (Exception unused) {
            return null;
        }
    }

    public final m b(String str, String str2, t1 t1Var) {
        str.getClass();
        str2.getClass();
        t1Var.getClass();
        try {
            yea yeaVar = c;
            String c2 = yeaVar.c(sha.Q(yeaVar.b, duf.b(t1.class)), t1Var);
            pzf a = a(this, str, str2, null, null, 12);
            yzf.Companion.getClass();
            wzf b = xzf.b(c2, null);
            a.getClass();
            a.e(C4094gc.b, b);
            qzf qzfVar = new qzf(a);
            jod jodVar = (jod) this.a;
            jodVar.getClass();
            return new m(new pof(jodVar, qzfVar), new com.vungle.ads.internal.network.converters.d(duf.b(v2.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static pzf a(c0 c0Var, String str, String str2, String str3, Map map, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        c0Var.getClass();
        pzf pzfVar = new pzf();
        pzfVar.f(str2);
        pzfVar.a(Command.HTTP_HEADER_USER_AGENT, str);
        pzfVar.a("Vungle-Version", "7.1.0");
        pzfVar.a("Content-Type", C4427z5.M);
        if (map != null) {
            q89 q89Var = q89.b;
            pzfVar.c = vha.k(ktm.E(map));
        }
        if (str3 != null) {
            pzfVar.a("X-Vungle-Placement-Ref-Id", str3);
        }
        String c2 = d0.c();
        if (c2 != null) {
            pzfVar.a("X-VUNGLE-APP-VERSION", c2);
        }
        String b = d0.b();
        if (b != null) {
            pzfVar.a("X-Vungle-App-Id", b);
        }
        return pzfVar;
    }

    public final m a(String str, String str2, g gVar, Map map, yzf yzfVar) {
        qzf qzfVar;
        str.getClass();
        str2.getClass();
        gVar.getClass();
        pzf a = a(this, str, str2, null, map, 4);
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            a.e(C4094gc.a, null);
            qzfVar = new qzf(a);
        } else if (ordinal == 1) {
            if (yzfVar == null) {
                yzfVar = xzf.d(yzf.Companion, new byte[0], null, 0, 6);
            }
            a.getClass();
            a.e(C4094gc.b, yzfVar);
            qzfVar = new qzf(a);
        } else {
            zzl.b();
            return null;
        }
        jod jodVar = (jod) this.a;
        jodVar.getClass();
        return new m(new pof(jodVar, qzfVar), this.b);
    }

    public final m a(yzf yzfVar) {
        yzfVar.getClass();
        il9 il9Var = new il9(0);
        il9Var.h(null, "https://events.ads.vungle.com/rtadebugging");
        pzf a = a(this, "debug", il9Var.c().g().c().i, null, null, 12);
        a.getClass();
        a.e(C4094gc.b, yzfVar);
        qzf qzfVar = new qzf(a);
        jod jodVar = (jod) this.a;
        jodVar.getClass();
        return new m(new pof(jodVar, qzfVar), this.b);
    }

    public final m a(String str, String str2, yzf yzfVar) {
        str.getClass();
        str2.getClass();
        yzfVar.getClass();
        il9 il9Var = new il9(0);
        il9Var.h(null, str2);
        jl9 c2 = il9Var.c().g().c();
        pzf pzfVar = new pzf();
        pzfVar.a = c2;
        pzfVar.a(Command.HTTP_HEADER_USER_AGENT, str);
        pzfVar.a("Vungle-Version", "7.1.0");
        pzfVar.a("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        String b = d0.b();
        if (b != null) {
            pzfVar.a("X-Vungle-App-Id", b);
        }
        String c3 = d0.c();
        if (c3 != null) {
            pzfVar.a("X-VUNGLE-APP-VERSION", c3);
        }
        pzfVar.e(C4094gc.b, yzfVar);
        qzf qzfVar = new qzf(pzfVar);
        jod jodVar = (jod) this.a;
        jodVar.getClass();
        return new m(new pof(jodVar, qzfVar), this.b);
    }
}
