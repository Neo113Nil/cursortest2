package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public class w3 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f18122a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18124c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18125d;

    public w3(i2 i2Var, Object obj, int i5) {
        this.f18124c = i5;
        this.f18122a = i2Var;
        this.f18123b = 0;
        this.f18125d = obj;
    }

    public w3(w3 w3Var, i2 i2Var, int i5, byte b10) {
        super(w3Var);
        this.f18122a = i2Var;
        this.f18123b = i5;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        w3 w3Var = this;
        while (w3Var.f18122a.o() != 0) {
            w3Var.setPendingCount(w3Var.f18122a.o() - 1);
            int i5 = 0;
            int i10 = 0;
            while (i5 < w3Var.f18122a.o() - 1) {
                w3 a7 = w3Var.a(i5, w3Var.f18123b + i10);
                i10 = (int) (a7.f18122a.count() + i10);
                a7.fork();
                i5++;
            }
            w3Var = w3Var.a(i5, w3Var.f18123b + i10);
        }
        switch (w3Var.f18124c) {
            case 0:
                ((h2) w3Var.f18122a).f(w3Var.f18123b, w3Var.f18125d);
                break;
            default:
                w3Var.f18122a.k((Object[]) w3Var.f18125d, w3Var.f18123b);
                break;
        }
        w3Var.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w3(w3 w3Var, i2 i2Var, int i5) {
        this(w3Var, i2Var, i5, (byte) 0);
        this.f18124c = 1;
        this.f18125d = (Object[]) w3Var.f18125d;
    }

    public final w3 a(int i5, int i10) {
        switch (this.f18124c) {
            case 0:
                return new w3(this, ((h2) this.f18122a).a(i5), i10);
            default:
                return new w3(this, this.f18122a.a(i5), i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w3(w3 w3Var, h2 h2Var, int i5) {
        this(w3Var, h2Var, i5, (byte) 0);
        this.f18124c = 0;
        this.f18125d = w3Var.f18125d;
    }
}
