package v7;

import D6.k;
import java.util.List;

/* renamed from: v7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6650e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6648c f67055a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67056b;

    /* renamed from: c, reason: collision with root package name */
    public String f67057c;

    /* renamed from: d, reason: collision with root package name */
    public H6.a f67058d;

    /* renamed from: e, reason: collision with root package name */
    public List f67059e;

    public C6650e(C6651f c6651f) {
        this.f67055a = (InterfaceC6648c) k.g(c6651f.e());
        this.f67056b = c6651f.d();
        this.f67058d = c6651f.f();
        this.f67059e = c6651f.c();
        c6651f.b();
        this.f67057c = c6651f.g();
    }

    public static C6650e b(InterfaceC6648c interfaceC6648c) {
        return new C6650e(interfaceC6648c);
    }

    public static C6651f f(InterfaceC6648c interfaceC6648c) {
        return new C6651f(interfaceC6648c);
    }

    public synchronized void a() {
        H6.a.U(this.f67058d);
        this.f67058d = null;
        H6.a.w0(this.f67059e);
        this.f67059e = null;
    }

    public P7.a c() {
        return null;
    }

    public InterfaceC6648c d() {
        return this.f67055a;
    }

    public String e() {
        return this.f67057c;
    }

    public C6650e(InterfaceC6648c interfaceC6648c) {
        this.f67055a = (InterfaceC6648c) k.g(interfaceC6648c);
        this.f67056b = 0;
    }
}
