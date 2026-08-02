package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class um2 implements mli {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public qm2 d;
    public long e;
    public long f;

    public um2() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new qm2(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            l1 l1Var = new l1(this, 12);
            sm2 sm2Var = new sm2();
            sm2Var.k = l1Var;
            arrayDeque.add(sm2Var);
        }
        this.c = new PriorityQueue();
    }

    @Override // defpackage.bm4
    public final void a(tli tliVar) {
        qx9.r(tliVar == this.d);
        qm2 qm2Var = (qm2) tliVar;
        if (qm2Var.i(Integer.MIN_VALUE)) {
            qm2Var.A();
            this.a.add(qm2Var);
        } else {
            long j = this.f;
            this.f = 1 + j;
            qm2Var.n = j;
            this.c.add(qm2Var);
        }
        this.d = null;
    }

    public abstract wm2 b();

    public abstract void c(qm2 qm2Var);

    @Override // defpackage.bm4
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public sm2 dequeueOutputBuffer() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.c;
            if (priorityQueue.isEmpty()) {
                return null;
            }
            qm2 qm2Var = (qm2) priorityQueue.peek();
            int i = lik.a;
            if (qm2Var.j > this.e) {
                return null;
            }
            qm2 qm2Var2 = (qm2) priorityQueue.poll();
            boolean i2 = qm2Var2.i(4);
            ArrayDeque arrayDeque2 = this.a;
            if (i2) {
                sm2 sm2Var = (sm2) arrayDeque.pollFirst();
                sm2Var.b(4);
                qm2Var2.A();
                arrayDeque2.add(qm2Var2);
                return sm2Var;
            }
            c(qm2Var2);
            if (e()) {
                wm2 b = b();
                sm2 sm2Var2 = (sm2) arrayDeque.pollFirst();
                sm2Var2.B(qm2Var2.j, b, Long.MAX_VALUE);
                qm2Var2.A();
                arrayDeque2.add(qm2Var2);
                return sm2Var2;
            }
            qm2Var2.A();
            arrayDeque2.add(qm2Var2);
        }
    }

    @Override // defpackage.bm4
    public final Object dequeueInputBuffer() {
        qx9.t(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        qm2 qm2Var = (qm2) arrayDeque.pollFirst();
        this.d = qm2Var;
        return qm2Var;
    }

    public abstract boolean e();

    @Override // defpackage.bm4
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            qm2 qm2Var = (qm2) priorityQueue.poll();
            int i = lik.a;
            qm2Var.A();
            arrayDeque.add(qm2Var);
        }
        qm2 qm2Var2 = this.d;
        if (qm2Var2 != null) {
            qm2Var2.A();
            arrayDeque.add(qm2Var2);
            this.d = null;
        }
    }

    @Override // defpackage.mli
    public final void setPositionUs(long j) {
        this.e = j;
    }

    @Override // defpackage.bm4
    public void release() {
    }
}
