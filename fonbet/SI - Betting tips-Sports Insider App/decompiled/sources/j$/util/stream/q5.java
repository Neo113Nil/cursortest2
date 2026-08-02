package j$.util.stream;

import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public final class q5 extends h5 {

    /* renamed from: b, reason: collision with root package name */
    public long f18051b;

    /* renamed from: c, reason: collision with root package name */
    public long f18052c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r5 f18053d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(r5 r5Var, n5 n5Var) {
        super(n5Var);
        this.f18053d = r5Var;
        this.f18051b = r5Var.f18064s;
        long j = r5Var.f18065t;
        this.f18052c = j < 0 ? LongCompanionObject.MAX_VALUE : j;
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void c(long j) {
        this.f17920a.c(x3.W(j, this.f18053d.f18064s, this.f18052c));
    }

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i5) {
        long j = this.f18051b;
        if (j == 0) {
            long j6 = this.f18052c;
            if (j6 > 0) {
                this.f18052c = j6 - 1;
                this.f17920a.accept(i5);
                return;
            }
            return;
        }
        this.f18051b = j - 1;
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final boolean e() {
        return this.f18052c == 0 || this.f17920a.e();
    }
}
