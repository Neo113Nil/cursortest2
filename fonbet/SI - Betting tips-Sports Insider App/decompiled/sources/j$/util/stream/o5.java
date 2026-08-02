package j$.util.stream;

import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public final class o5 extends j5 {

    /* renamed from: b, reason: collision with root package name */
    public long f18019b;

    /* renamed from: c, reason: collision with root package name */
    public long f18020c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5 f18021d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(p5 p5Var, n5 n5Var) {
        super(n5Var);
        this.f18021d = p5Var;
        this.f18019b = p5Var.f18033s;
        long j = p5Var.f18034t;
        this.f18020c = j < 0 ? LongCompanionObject.MAX_VALUE : j;
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void c(long j) {
        this.f17941a.c(x3.W(j, this.f18021d.f18033s, this.f18020c));
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        long j = this.f18019b;
        if (j == 0) {
            long j6 = this.f18020c;
            if (j6 > 0) {
                this.f18020c = j6 - 1;
                this.f17941a.n((n5) obj);
                return;
            }
            return;
        }
        this.f18019b = j - 1;
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final boolean e() {
        return this.f18020c == 0 || this.f17941a.e();
    }
}
