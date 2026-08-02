package D1;

import b1.z;
import com.google.common.collect.A;
import e1.AbstractC4134a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2343a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2344b;

    /* renamed from: c, reason: collision with root package name */
    public final b f2345c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2346d;

    public interface a {
        e a(z zVar);
    }

    public interface b {
        default boolean a(String str) {
            return true;
        }

        default int b(int i10) {
            return -2147483647;
        }

        A c();
    }

    public e(String str, String str2, b bVar, int i10) {
        boolean z10 = true;
        AbstractC4134a.a(str == null || str.length() <= 64);
        if (str2 != null && str2.length() > 64) {
            z10 = false;
        }
        AbstractC4134a.a(z10);
        AbstractC4134a.e(bVar);
        this.f2343a = str;
        this.f2344b = str2;
        this.f2345c = bVar;
        this.f2346d = i10;
    }

    public boolean a() {
        return this.f2345c.a("br");
    }

    public boolean b() {
        return this.f2345c.a("bl");
    }

    public boolean c() {
        return this.f2345c.a("bs");
    }

    public boolean d() {
        return this.f2345c.a("cid");
    }

    public boolean e() {
        return this.f2345c.a("dl");
    }

    public boolean f() {
        return this.f2345c.a("rtp");
    }

    public boolean g() {
        return this.f2345c.a("mtp");
    }

    public boolean h() {
        return this.f2345c.a("nor");
    }

    public boolean i() {
        return this.f2345c.a("nrr");
    }

    public boolean j() {
        return this.f2345c.a(W9.d.f13160a);
    }

    public boolean k() {
        return this.f2345c.a("ot");
    }

    public boolean l() {
        return this.f2345c.a("pr");
    }

    public boolean m() {
        return this.f2345c.a("sid");
    }

    public boolean n() {
        return this.f2345c.a("su");
    }

    public boolean o() {
        return this.f2345c.a("st");
    }

    public boolean p() {
        return this.f2345c.a("sf");
    }

    public boolean q() {
        return this.f2345c.a("tb");
    }
}
