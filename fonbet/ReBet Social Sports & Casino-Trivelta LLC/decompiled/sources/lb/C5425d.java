package lb;

import kb.AbstractC5232q;

/* renamed from: lb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5425d extends AbstractC5232q {

    /* renamed from: a, reason: collision with root package name */
    public String f55745a;

    /* renamed from: b, reason: collision with root package name */
    public String f55746b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f55747c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f55748d = false;

    @Override // kb.AbstractC5232q
    public final void a(boolean z10) {
        this.f55748d = z10;
    }

    @Override // kb.AbstractC5232q
    public final void b(boolean z10) {
        this.f55747c = z10;
    }

    @Override // kb.AbstractC5232q
    public final void c(String str, String str2) {
        this.f55745a = str;
        this.f55746b = str2;
    }

    public final String d() {
        return this.f55745a;
    }

    public final String e() {
        return this.f55746b;
    }

    public final boolean f() {
        return this.f55748d;
    }

    public final boolean g() {
        return (this.f55745a == null || this.f55746b == null) ? false : true;
    }

    public final boolean h() {
        return this.f55747c;
    }
}
