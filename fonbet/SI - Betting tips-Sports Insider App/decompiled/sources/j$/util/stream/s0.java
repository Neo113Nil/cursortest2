package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class s0 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    public final x3 f18069a;

    /* renamed from: b, reason: collision with root package name */
    public Spliterator f18070b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18071c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f18072d;

    /* renamed from: e, reason: collision with root package name */
    public final r0 f18073e;

    /* renamed from: f, reason: collision with root package name */
    public final s0 f18074f;

    /* renamed from: g, reason: collision with root package name */
    public i2 f18075g;

    public s0(x3 x3Var, Spliterator spliterator, r0 r0Var) {
        super(null);
        this.f18069a = x3Var;
        this.f18070b = spliterator;
        this.f18071c = e.e(spliterator.estimateSize());
        this.f18072d = new ConcurrentHashMap(Math.max(16, e.f17866g << 1));
        this.f18073e = r0Var;
        this.f18074f = null;
    }

    public s0(s0 s0Var, Spliterator spliterator, s0 s0Var2) {
        super(s0Var);
        this.f18069a = s0Var.f18069a;
        this.f18070b = spliterator;
        this.f18071c = s0Var.f18071c;
        this.f18072d = s0Var.f18072d;
        this.f18073e = s0Var.f18073e;
        this.f18074f = s0Var2;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f18070b;
        long j = this.f18071c;
        boolean z5 = false;
        s0 s0Var = this;
        while (spliterator.estimateSize() > j && (trySplit = spliterator.trySplit()) != null) {
            s0 s0Var2 = new s0(s0Var, trySplit, s0Var.f18074f);
            s0 s0Var3 = new s0(s0Var, spliterator, s0Var2);
            s0Var.addToPendingCount(1);
            s0Var3.addToPendingCount(1);
            s0Var.f18072d.put(s0Var2, s0Var3);
            if (s0Var.f18074f != null) {
                s0Var2.addToPendingCount(1);
                if (s0Var.f18072d.replace(s0Var.f18074f, s0Var, s0Var2)) {
                    s0Var.addToPendingCount(-1);
                } else {
                    s0Var2.addToPendingCount(-1);
                }
            }
            if (z5) {
                spliterator = trySplit;
                s0Var = s0Var2;
                s0Var2 = s0Var3;
            } else {
                s0Var = s0Var3;
            }
            z5 = !z5;
            s0Var2.fork();
        }
        if (s0Var.getPendingCount() > 0) {
            j$.time.x xVar = new j$.time.x(28);
            x3 x3Var = s0Var.f18069a;
            a2 z0 = x3Var.z0(x3Var.k0(spliterator), xVar);
            s0Var.f18069a.D0(spliterator, z0);
            s0Var.f18075g = z0.build();
            s0Var.f18070b = null;
        }
        s0Var.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        i2 i2Var = this.f18075g;
        if (i2Var != null) {
            i2Var.forEach(this.f18073e);
            this.f18075g = null;
        } else {
            Spliterator spliterator = this.f18070b;
            if (spliterator != null) {
                this.f18069a.D0(spliterator, this.f18073e);
                this.f18070b = null;
            }
        }
        s0 s0Var = (s0) this.f18072d.remove(this);
        if (s0Var != null) {
            s0Var.tryComplete();
        }
    }
}
