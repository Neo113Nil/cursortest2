package wg;

import ug.AbstractC6574b;

/* renamed from: wg.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6753h {

    /* renamed from: a, reason: collision with root package name */
    public int f67731a;

    /* renamed from: b, reason: collision with root package name */
    public Object f67732b;

    /* renamed from: c, reason: collision with root package name */
    public String f67733c;

    /* renamed from: d, reason: collision with root package name */
    public Object f67734d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f67735e;

    /* renamed from: f, reason: collision with root package name */
    public long f67736f;

    public C6753h(Object obj, boolean z10) {
        this.f67731a = C6752g.f67724b.a();
        this.f67736f = 0L;
        this.f67735e = z10;
        if (z10) {
            this.f67733c = AbstractC6574b.g(obj);
            this.f67734d = obj;
        }
        this.f67732b = obj;
    }

    public void a(Object obj) {
        if (!this.f67735e || obj == null) {
            return;
        }
        this.f67733c += "," + AbstractC6574b.g(obj);
        this.f67734d = AbstractC6574b.d("[" + this.f67733c + "]");
        this.f67732b = obj;
    }

    public void b(String str) {
        if (!this.f67735e || str.length() <= 0) {
            return;
        }
        if (str.endsWith(",")) {
            str = str.substring(0, str.length() - 1);
        }
        String str2 = this.f67733c + "," + str;
        this.f67733c = str2;
        this.f67734d = AbstractC6574b.d(str2);
        this.f67732b = AbstractC6574b.d(str);
    }

    public boolean c() {
        return this.f67735e;
    }

    public void d(long j10) {
        this.f67736f = j10;
    }

    public String toString() {
        return "Now:" + this.f67732b + ", All:" + this.f67734d;
    }

    public C6753h(String str, boolean z10) {
        this.f67731a = C6752g.f67724b.a();
        this.f67736f = 0L;
        this.f67735e = z10;
        if (z10) {
            if (str.length() <= 0) {
                return;
            }
            str = str.endsWith(",") ? str.substring(0, str.length() - 1) : str;
            this.f67733c = str;
            this.f67734d = AbstractC6574b.d(str);
        }
        this.f67732b = str;
    }

    public C6753h(Object obj) {
        this(obj, false);
    }
}
