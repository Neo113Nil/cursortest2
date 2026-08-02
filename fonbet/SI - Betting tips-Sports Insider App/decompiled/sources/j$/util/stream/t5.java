package j$.util.stream;

import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public final class t5 extends i5 {

    /* renamed from: b, reason: collision with root package name */
    public long f18092b;

    /* renamed from: c, reason: collision with root package name */
    public long f18093c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u5 f18094d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(u5 u5Var, n5 n5Var) {
        super(n5Var);
        this.f18094d = u5Var;
        this.f18092b = u5Var.f18101s;
        long j = u5Var.f18102t;
        this.f18093c = j < 0 ? LongCompanionObject.MAX_VALUE : j;
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final void c(long j) {
        this.f17931a.c(x3.W(j, this.f18094d.f18101s, this.f18093c));
    }

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) {
        long j6 = this.f18092b;
        if (j6 == 0) {
            long j10 = this.f18093c;
            if (j10 > 0) {
                this.f18093c = j10 - 1;
                this.f17931a.accept(j);
                return;
            }
            return;
        }
        this.f18092b = j6 - 1;
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final boolean e() {
        return this.f18093c == 0 || this.f17931a.e();
    }
}
