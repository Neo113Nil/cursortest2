package M1;

import H1.AbstractC1172e;
import H1.InterfaceC1184q;
import H1.v;
import H1.y;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b extends AbstractC1172e {

    /* renamed from: M1.b$b, reason: collision with other inner class name */
    public static final class C0147b implements AbstractC1172e.f {

        /* renamed from: a, reason: collision with root package name */
        public final y f7399a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7400b;

        /* renamed from: c, reason: collision with root package name */
        public final v.a f7401c;

        @Override // H1.AbstractC1172e.f
        public AbstractC1172e.C0097e a(InterfaceC1184q interfaceC1184q, long j10) {
            long position = interfaceC1184q.getPosition();
            long c10 = c(interfaceC1184q);
            long i10 = interfaceC1184q.i();
            interfaceC1184q.j(Math.max(6, this.f7399a.f4485c));
            long c11 = c(interfaceC1184q);
            return (c10 > j10 || c11 <= j10) ? c11 <= j10 ? AbstractC1172e.C0097e.f(c11, interfaceC1184q.i()) : AbstractC1172e.C0097e.d(c10, position) : AbstractC1172e.C0097e.e(i10);
        }

        public final long c(InterfaceC1184q interfaceC1184q) {
            while (interfaceC1184q.i() < interfaceC1184q.getLength() - 6 && !v.h(interfaceC1184q, this.f7399a, this.f7400b, this.f7401c)) {
                interfaceC1184q.j(1);
            }
            if (interfaceC1184q.i() < interfaceC1184q.getLength() - 6) {
                return this.f7401c.f4479a;
            }
            interfaceC1184q.j((int) (interfaceC1184q.getLength() - interfaceC1184q.i()));
            return this.f7399a.f4492j;
        }

        public C0147b(y yVar, int i10) {
            this.f7399a = yVar;
            this.f7400b = i10;
            this.f7401c = new v.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final y yVar, int i10, long j10, long j11) {
        super(new AbstractC1172e.d() { // from class: M1.a
            @Override // H1.AbstractC1172e.d
            public final long a(long j12) {
                return y.this.i(j12);
            }
        }, new C0147b(yVar, i10), yVar.f(), 0L, yVar.f4492j, j10, j11, yVar.d(), Math.max(6, yVar.f4485c));
        Objects.requireNonNull(yVar);
    }
}
