package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class n extends j5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17999b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18000c;

    /* renamed from: d, reason: collision with root package name */
    public Object f18001d;

    public /* synthetic */ n(n5 n5Var) {
        super(n5Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l8 l8Var, n5 n5Var) {
        super(n5Var);
        this.f18001d = l8Var;
        this.f18000c = true;
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void c(long j) {
        switch (this.f17999b) {
            case 0:
                this.f18000c = false;
                this.f18001d = null;
                this.f17941a.c(-1L);
                break;
            case 1:
                this.f17941a.c(-1L);
                break;
            default:
                this.f17941a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        switch (this.f17999b) {
            case 0:
                n5 n5Var = this.f17941a;
                if (obj == null) {
                    if (this.f18000c) {
                        return;
                    }
                    this.f18000c = true;
                    this.f18001d = null;
                    n5Var.n((n5) null);
                    return;
                }
                Object obj2 = this.f18001d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.f18001d = obj;
                    n5Var.n((n5) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((j$.util.p) ((s) this.f18001d).f18068t).apply((j$.util.p) obj);
                if (stream != null) {
                    try {
                        boolean z5 = this.f18000c;
                        n5 n5Var2 = this.f17941a;
                        if (!z5) {
                            ((Stream) stream.sequential()).forEach(n5Var2);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!n5Var2.e() && spliterator.tryAdvance(n5Var2)) {
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            stream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f18000c) {
                    boolean test = ((l8) this.f18001d).f17981t.test(obj);
                    this.f18000c = test;
                    if (test) {
                        this.f17941a.n((n5) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public boolean e() {
        switch (this.f17999b) {
            case 1:
                this.f18000c = true;
                return this.f17941a.e();
            case 2:
                return !this.f18000c || this.f17941a.e();
            default:
                return super.e();
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public void end() {
        switch (this.f17999b) {
            case 0:
                this.f18000c = false;
                this.f18001d = null;
                this.f17941a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, n5 n5Var) {
        super(n5Var);
        this.f18001d = sVar;
    }
}
