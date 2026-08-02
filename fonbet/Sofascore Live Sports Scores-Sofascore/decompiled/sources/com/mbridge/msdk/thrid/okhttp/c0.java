package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.yhk;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c0 {
    final a a;
    final Proxy b;
    final InetSocketAddress c;

    public c0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            yhk.s("address == null");
            throw null;
        }
        if (proxy == null) {
            yhk.s("proxy == null");
            throw null;
        }
        if (inetSocketAddress == null) {
            yhk.s("inetSocketAddress == null");
            throw null;
        }
        this.a = aVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public a a() {
        return this.a;
    }

    public Proxy b() {
        return this.b;
    }

    public boolean c() {
        return this.a.i != null && this.b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return c0Var.a.equals(this.a) && c0Var.b.equals(this.b) && c0Var.c.equals(this.c);
    }

    public int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public String toString() {
        return "Route{" + this.c + "}";
    }
}
