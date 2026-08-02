package zg;

import java.util.HashMap;

/* renamed from: zg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6991a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f69122a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f69123b = false;

    /* renamed from: c, reason: collision with root package name */
    public String f69124c = null;

    public abstract void a(String str, String str2);

    public void b(HashMap hashMap) {
        for (String str : hashMap.keySet()) {
            a(str, (String) hashMap.get(str));
        }
    }

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract boolean f();

    public abstract void g();

    public abstract void h();

    public abstract void i(boolean z10);

    public abstract void j(c cVar);

    public abstract void k();

    public abstract void l();

    public abstract boolean m(String str);
}
