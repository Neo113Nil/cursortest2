package Ai;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import zi.InterfaceC7015a;

/* loaded from: classes5.dex */
public class e implements InterfaceC7015a {

    /* renamed from: a, reason: collision with root package name */
    public final String f470a;

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC7015a f471b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f472c;

    /* renamed from: d, reason: collision with root package name */
    public Method f473d;

    /* renamed from: e, reason: collision with root package name */
    public org.slf4j.event.a f474e;

    /* renamed from: f, reason: collision with root package name */
    public Queue f475f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f476g;

    public e(String str, Queue queue, boolean z10) {
        this.f470a = str;
        this.f475f = queue;
        this.f476g = z10;
    }

    @Override // zi.InterfaceC7015a
    public void a(String str) {
        c().a(str);
    }

    @Override // zi.InterfaceC7015a
    public void b(String str) {
        c().b(str);
    }

    public InterfaceC7015a c() {
        return this.f471b != null ? this.f471b : this.f476g ? b.f469a : d();
    }

    public final InterfaceC7015a d() {
        if (this.f474e == null) {
            this.f474e = new org.slf4j.event.a(this, this.f475f);
        }
        return this.f474e;
    }

    public boolean e() {
        Boolean bool = this.f472c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f473d = this.f471b.getClass().getMethod("log", org.slf4j.event.c.class);
            this.f472c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f472c = Boolean.FALSE;
        }
        return this.f472c.booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f470a.equals(((e) obj).f470a);
    }

    public boolean f() {
        return this.f471b instanceof b;
    }

    public boolean g() {
        return this.f471b == null;
    }

    @Override // zi.InterfaceC7015a
    public String getName() {
        return this.f470a;
    }

    public void h(org.slf4j.event.c cVar) {
        if (e()) {
            try {
                this.f473d.invoke(this.f471b, cVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public int hashCode() {
        return this.f470a.hashCode();
    }

    public void i(InterfaceC7015a interfaceC7015a) {
        this.f471b = interfaceC7015a;
    }
}
