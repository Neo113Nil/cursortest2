package xg;

import java.util.Hashtable;

/* renamed from: xg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6824a {

    /* renamed from: a, reason: collision with root package name */
    public String f68155a;

    /* renamed from: b, reason: collision with root package name */
    public String f68156b;

    /* renamed from: c, reason: collision with root package name */
    public Hashtable f68157c = new Hashtable();

    /* renamed from: d, reason: collision with root package name */
    public String f68158d;

    /* renamed from: e, reason: collision with root package name */
    public String f68159e;

    /* renamed from: f, reason: collision with root package name */
    public int f68160f;

    /* renamed from: g, reason: collision with root package name */
    public String f68161g;

    public AbstractC6824a(String str, int i10) {
        this.f68155a = str;
        this.f68160f = i10;
    }

    public void a(String str, Object obj) {
        this.f68157c.put(str, obj);
    }

    public Object b(String str) {
        return this.f68157c.get(str);
    }

    public String c() {
        return this.f68158d;
    }

    public String d() {
        return this.f68155a;
    }

    public int e() {
        return this.f68160f;
    }

    public String f() {
        return this.f68159e;
    }

    public String g() {
        return this.f68161g;
    }

    public String h() {
        return this.f68156b;
    }

    public void i(String str) {
        this.f68158d = str;
    }

    public void j(String str) {
        a("useragent", str);
        this.f68159e = str;
    }

    public void k(String str) {
        this.f68161g = str;
    }
}
