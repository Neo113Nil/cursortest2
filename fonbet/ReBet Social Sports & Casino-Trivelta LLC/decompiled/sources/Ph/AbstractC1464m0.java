package Ph;

import Sh.AbstractC1576n;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: Ph.m0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1464m0 extends L {

    /* renamed from: b, reason: collision with root package name */
    public long f9107b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9108c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayDeque f9109d;

    public static /* synthetic */ void f2(AbstractC1464m0 abstractC1464m0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC1464m0.e2(z10);
    }

    public static /* synthetic */ void k2(AbstractC1464m0 abstractC1464m0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC1464m0.j2(z10);
    }

    @Override // Ph.L
    public final L c2(int i10, String str) {
        AbstractC1576n.a(i10);
        return AbstractC1576n.b(this, str);
    }

    public final void e2(boolean z10) {
        long g22 = this.f9107b - g2(z10);
        this.f9107b = g22;
        if (g22 <= 0 && this.f9108c) {
            shutdown();
        }
    }

    public final long g2(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public final void h2(AbstractC1446d0 abstractC1446d0) {
        ArrayDeque arrayDeque = this.f9109d;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            this.f9109d = arrayDeque;
        }
        arrayDeque.addLast(abstractC1446d0);
    }

    public long i2() {
        ArrayDeque arrayDeque = this.f9109d;
        if (arrayDeque == null || arrayDeque.isEmpty()) {
            return LongCompanionObject.MAX_VALUE;
        }
        return 0L;
    }

    public final void j2(boolean z10) {
        this.f9107b += g2(z10);
        if (z10) {
            return;
        }
        this.f9108c = true;
    }

    public final boolean l2() {
        return this.f9107b >= g2(true);
    }

    public final boolean m2() {
        ArrayDeque arrayDeque = this.f9109d;
        if (arrayDeque != null) {
            return arrayDeque.isEmpty();
        }
        return true;
    }

    public abstract long n2();

    public final boolean o2() {
        AbstractC1446d0 abstractC1446d0;
        ArrayDeque arrayDeque = this.f9109d;
        if (arrayDeque == null || (abstractC1446d0 = (AbstractC1446d0) arrayDeque.removeFirstOrNull()) == null) {
            return false;
        }
        abstractC1446d0.run();
        return true;
    }

    public boolean p2() {
        return false;
    }

    public abstract void shutdown();
}
