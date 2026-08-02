package P1;

import H1.A;
import H1.J;
import H1.K;
import H1.O;
import H1.r;

/* loaded from: classes.dex */
public final class e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final long f8707a;

    /* renamed from: b, reason: collision with root package name */
    public final r f8708b;

    public class a extends A {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f8709b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J j10, J j11) {
            super(j10);
            this.f8709b = j11;
        }

        @Override // H1.A, H1.J
        public J.a e(long j10) {
            J.a e10 = this.f8709b.e(j10);
            K k10 = e10.f4334a;
            K k11 = new K(k10.f4339a, k10.f4340b + e.this.f8707a);
            K k12 = e10.f4335b;
            return new J.a(k11, new K(k12.f4339a, k12.f4340b + e.this.f8707a));
        }
    }

    public e(long j10, r rVar) {
        this.f8707a = j10;
        this.f8708b = rVar;
    }

    @Override // H1.r
    public O c(int i10, int i11) {
        return this.f8708b.c(i10, i11);
    }

    @Override // H1.r
    public void q(J j10) {
        this.f8708b.q(new a(j10, j10));
    }

    @Override // H1.r
    public void s() {
        this.f8708b.s();
    }
}
