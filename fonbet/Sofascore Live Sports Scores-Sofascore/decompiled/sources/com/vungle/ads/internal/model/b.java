package com.vungle.ads.internal.model;

import defpackage.bf3;
import defpackage.dmi;
import defpackage.me4;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Integer e;
    public a f;
    public String g;
    public long h;
    public long i;
    public long j;
    public Long k;
    public final Object l;
    public final AtomicBoolean m;

    public b(String str, String str2, String str3, boolean z, Integer num) {
        me4.p(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = num;
        this.f = a.NEW;
        this.g = "application/octet-stream";
        this.l = new Object();
        this.m = new AtomicBoolean(false);
    }

    public final void a(a aVar) {
        aVar.getClass();
        this.f = aVar;
    }

    public final void b(long j) {
        this.h = j;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.g;
    }

    public final Integer e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !b.class.equals(obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f == bVar.f && this.h == bVar.h && this.d == bVar.d && Intrinsics.c(this.a, bVar.a) && Intrinsics.c(this.b, bVar.b) && this.i == bVar.i && Intrinsics.c(this.e, bVar.e)) {
            return Intrinsics.c(this.c, bVar.c);
        }
        return false;
    }

    public final Long f() {
        return this.k;
    }

    public final long g() {
        return this.j;
    }

    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        long j = this.h;
        int e = dmi.e((hashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.d);
        long j2 = this.i;
        int i = (e + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Integer num = this.e;
        return i + (num != null ? num.hashCode() : 0);
    }

    public final boolean i() {
        return this.f == a.DOWNLOAD_SUCCESS;
    }

    public final boolean j() {
        return Intrinsics.c(this.a, "vmURL");
    }

    public final boolean k() {
        return Intrinsics.c(this.a, "MAIN_IMAGE") || Intrinsics.c(this.a, "MAIN_VIDEO");
    }

    public final boolean l() {
        return Intrinsics.c(this.a, "MAIN_VIDEO");
    }

    public final boolean m() {
        return Intrinsics.c(this.a, "VUNGLE_PRIVACY_ICON_URL");
    }

    public final boolean n() {
        return this.d;
    }

    public final boolean o() {
        return this.m.get();
    }

    public final void p() {
        if (this.m.getAndSet(false)) {
            synchronized (this.l) {
                this.l.notifyAll();
                Unit unit = Unit.a;
            }
        }
    }

    public final void q() {
        Object u2gVar;
        this.m.set(true);
        synchronized (this.l) {
            try {
                p2g p2gVar = w2g.b;
                this.l.wait();
                u2gVar = Unit.a;
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            Throwable a = w2g.a(u2gVar);
            if (a != null) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AdAsset", "Interrupted while waiting for file download: " + this, a);
            }
        }
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("AdAsset(adIdentifier=");
        a.append(this.a);
        a.append(", serverPath=");
        a.append(this.b);
        a.append(", localPath=");
        a.append(this.c);
        a.append(", status=");
        a.append(this.f);
        a.append(", fileSize=");
        a.append(this.h);
        a.append(", contentLength=");
        a.append(this.i);
        a.append(", isRequired=");
        a.append(this.d);
        a.append(", percentage=");
        return bf3.n(a, this.e, ')');
    }

    public final long b() {
        return this.i;
    }

    public final void c(long j) {
        this.j = j;
    }

    public final String a() {
        return this.a;
    }

    public final void a(String str) {
        str.getClass();
        this.g = str;
    }

    public final void a(long j) {
        this.i = j;
    }

    public final void a(Long l) {
        this.k = l;
    }

    public /* synthetic */ b(String str, String str2) {
        this("vmURL", str, str2, true, null);
    }
}
