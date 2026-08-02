package com.vungle.ads.internal.network;

import defpackage.lnb;
import defpackage.oea;
import defpackage.q79;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wv8;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();
    public final g a;
    public final Map b;
    public final String c;
    public int d;
    public int e;
    public String f;

    public /* synthetic */ d(int i, g gVar, Map map, String str, int i2, int i3, String str2) {
        if (16 != (i & 16)) {
            oea.z(i, 16, b.a.getDescriptor());
            throw null;
        }
        this.a = (i & 1) == 0 ? g.GET : gVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i2;
        }
        this.e = i3;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
    }

    public static final void a(d dVar, wf3 wf3Var, uye uyeVar) {
        dVar.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || dVar.a != g.GET) {
            wf3Var.f(uyeVar, 0, e.a, dVar.a);
        }
        if (wf3Var.o(uyeVar) || dVar.b != null) {
            uhi uhiVar = uhi.a;
            wf3Var.h(uyeVar, 1, new q79(uhiVar, uhiVar, 1), dVar.b);
        }
        if (wf3Var.o(uyeVar) || dVar.c != null) {
            wf3Var.h(uyeVar, 2, uhi.a, dVar.c);
        }
        if (wf3Var.o(uyeVar) || dVar.d != 0) {
            wf3Var.u(3, dVar.d, uyeVar);
        }
        wf3Var.u(4, dVar.e, uyeVar);
        if (!wf3Var.o(uyeVar) && dVar.f == null) {
            return;
        }
        wf3Var.h(uyeVar, 5, uhi.a, dVar.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && Intrinsics.c(this.b, dVar.b) && Intrinsics.c(this.c, dVar.c) && this.d == dVar.d && this.e == dVar.e && Intrinsics.c(this.f, dVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.c;
        int a = wv8.a(this.e, wv8.a(this.d, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.f;
        return a + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("FailedTpat(method=");
        a.append(this.a);
        a.append(", headers=");
        a.append(this.b);
        a.append(", body=");
        a.append(this.c);
        a.append(", retryAttempt=");
        a.append(this.d);
        a.append(", retryCount=");
        a.append(this.e);
        a.append(", tpatKey=");
        return lnb.q(a, this.f, ')');
    }

    public d(g gVar, Map map, String str, int i, int i2, String str2) {
        gVar.getClass();
        this.a = gVar;
        this.b = map;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = str2;
    }

    public static d a(d dVar, int i) {
        g gVar = dVar.a;
        Map map = dVar.b;
        String str = dVar.c;
        int i2 = dVar.e;
        String str2 = dVar.f;
        gVar.getClass();
        return new d(gVar, map, str, i, i2, str2);
    }

    public final int a() {
        return this.d;
    }
}
