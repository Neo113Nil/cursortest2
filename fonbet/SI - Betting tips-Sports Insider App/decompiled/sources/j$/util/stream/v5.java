package j$.util.stream;

import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public final class v5 extends g5 {

    /* renamed from: b, reason: collision with root package name */
    public long f18110b;

    /* renamed from: c, reason: collision with root package name */
    public long f18111c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w5 f18112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(w5 w5Var, n5 n5Var) {
        super(n5Var);
        this.f18112d = w5Var;
        this.f18110b = w5Var.f18126s;
        long j = w5Var.f18127t;
        this.f18111c = j < 0 ? LongCompanionObject.MAX_VALUE : j;
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final void c(long j) {
        this.f17912a.c(x3.W(j, this.f18112d.f18126s, this.f18111c));
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        long j = this.f18110b;
        if (j == 0) {
            long j6 = this.f18111c;
            if (j6 > 0) {
                this.f18111c = j6 - 1;
                this.f17912a.accept(d10);
                return;
            }
            return;
        }
        this.f18110b = j - 1;
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final boolean e() {
        return this.f18111c == 0 || this.f17912a.e();
    }
}
