package wg;

import i3.C4527h;
import java.util.Hashtable;
import yg.AbstractC6891a;

/* renamed from: wg.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6749d {

    /* renamed from: a, reason: collision with root package name */
    public int f67712a;

    /* renamed from: e, reason: collision with root package name */
    public Object f67716e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC6750e f67717f;

    /* renamed from: i, reason: collision with root package name */
    public long f67720i;

    /* renamed from: j, reason: collision with root package name */
    public C6753h f67721j;

    /* renamed from: g, reason: collision with root package name */
    public int f67718g = 0;

    /* renamed from: b, reason: collision with root package name */
    public String f67713b = AbstractC6891a.a();

    /* renamed from: h, reason: collision with root package name */
    public long f67719h = System.currentTimeMillis();

    /* renamed from: c, reason: collision with root package name */
    public Hashtable f67714c = new Hashtable();

    /* renamed from: d, reason: collision with root package name */
    public Hashtable f67715d = new Hashtable();

    public AbstractC6749d(int i10, Object obj) {
        this.f67712a = -1;
        this.f67712a = i10;
        this.f67716e = obj;
    }

    public void a(String str, String str2) {
        this.f67714c.put(str, str2);
    }

    public long b() {
        return this.f67719h;
    }

    public InterfaceC6750e c() {
        return this.f67717f;
    }

    public String d() {
        return this.f67713b;
    }

    public Hashtable e() {
        Hashtable hashtable = new Hashtable();
        hashtable.put(com.google.android.material.shape.i.f35755A, this.f67713b);
        hashtable.put("o", f());
        if (!this.f67714c.isEmpty()) {
            hashtable.put(C4527h.f48087o, this.f67714c);
        }
        Object obj = this.f67716e;
        if (obj != null) {
            hashtable.put(W9.d.f13160a, obj);
        }
        if (!this.f67715d.isEmpty()) {
            hashtable.put("c", this.f67715d);
        }
        return hashtable;
    }

    public abstract String f();

    public C6753h g() {
        return this.f67721j;
    }

    public int h() {
        return this.f67718g;
    }

    public boolean i() {
        return this.f67712a == 4;
    }

    public boolean j() {
        return this.f67712a == 2;
    }

    public boolean k() {
        return this.f67712a == 1;
    }

    public void l(InterfaceC6750e interfaceC6750e) {
        this.f67717f = interfaceC6750e;
    }

    public void m(C6753h c6753h) {
        long currentTimeMillis = System.currentTimeMillis() - this.f67719h;
        this.f67720i = currentTimeMillis;
        c6753h.d(currentTimeMillis);
        this.f67721j = c6753h;
    }

    public void n(int i10) {
        this.f67718g = i10;
    }

    public String toString() {
        return "" + e();
    }
}
