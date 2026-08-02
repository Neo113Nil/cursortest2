package mi;

import li.AbstractC5469c;
import net.time4j.Y;
import net.time4j.a0;
import oi.InterfaceC5911g;
import oi.InterfaceC5915k;
import oi.t;
import oi.z;

/* loaded from: classes5.dex */
public class q implements z {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f56698a;

    /* renamed from: b, reason: collision with root package name */
    public final t f56699b;

    public q(a0 a0Var, t tVar) {
        this.f56698a = a0Var;
        this.f56699b = tVar;
    }

    public static Y k(long j10) {
        return Y.f(AbstractC5469c.d(j10 + 5, 7) + 1);
    }

    @Override // oi.z
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public oi.p b(InterfaceC5911g interfaceC5911g) {
        return null;
    }

    @Override // oi.z
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public oi.p d(InterfaceC5911g interfaceC5911g) {
        return null;
    }

    @Override // oi.z
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Y e(InterfaceC5911g interfaceC5911g) {
        InterfaceC5915k interfaceC5915k = (InterfaceC5915k) this.f56699b.apply(interfaceC5911g);
        return (interfaceC5911g.b() + 7) - ((long) p(interfaceC5911g).c(this.f56698a)) > interfaceC5915k.a() ? k(interfaceC5915k.a()) : this.f56698a.f().d(6);
    }

    @Override // oi.z
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Y i(InterfaceC5911g interfaceC5911g) {
        InterfaceC5915k interfaceC5915k = (InterfaceC5915k) this.f56699b.apply(interfaceC5911g);
        return (interfaceC5911g.b() + 1) - ((long) p(interfaceC5911g).c(this.f56698a)) < interfaceC5915k.d() ? k(interfaceC5915k.d()) : this.f56698a.f();
    }

    @Override // oi.z
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Y p(InterfaceC5911g interfaceC5911g) {
        return k(interfaceC5911g.b());
    }

    @Override // oi.z
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public InterfaceC5911g q(InterfaceC5911g interfaceC5911g, Y y10, boolean z10) {
        if (y10 == null) {
            throw new IllegalArgumentException("Missing weekday.");
        }
        long b10 = (interfaceC5911g.b() + y10.c(this.f56698a)) - p(interfaceC5911g).c(this.f56698a);
        InterfaceC5915k interfaceC5915k = (InterfaceC5915k) this.f56699b.apply(interfaceC5911g);
        if (b10 < interfaceC5915k.d() || b10 > interfaceC5915k.a()) {
            throw new IllegalArgumentException("New day out of supported range.");
        }
        return (InterfaceC5911g) interfaceC5915k.b(b10);
    }

    @Override // oi.z
    public boolean isValid(InterfaceC5911g interfaceC5911g, Y y10) {
        if (y10 == null) {
            return false;
        }
        long b10 = (interfaceC5911g.b() + y10.c(this.f56698a)) - p(interfaceC5911g).c(this.f56698a);
        InterfaceC5915k interfaceC5915k = (InterfaceC5915k) this.f56699b.apply(interfaceC5911g);
        return b10 >= interfaceC5915k.d() && b10 <= interfaceC5915k.a();
    }
}
