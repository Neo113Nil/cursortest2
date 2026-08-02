package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class vm2 implements nli {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public rm2 d;
    public long e;
    public long f;
    public long g;

    public vm2() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new rm2(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            l1 l1Var = new l1(this, 13);
            tm2 tm2Var = new tm2();
            tm2Var.l = l1Var;
            arrayDeque.add(tm2Var);
        }
        this.c = new ArrayDeque();
        this.g = C.TIME_UNSET;
    }

    @Override // defpackage.cm4
    public final void a(uli uliVar) {
        z1a.s(uliVar == this.d);
        rm2 rm2Var = (rm2) uliVar;
        if (!rm2Var.i(4)) {
            long j = rm2Var.k;
            if (j != Long.MIN_VALUE) {
                long j2 = this.g;
                if (j2 != C.TIME_UNSET && j < j2) {
                    rm2Var.A();
                    this.a.add(rm2Var);
                    this.d = null;
                }
            }
        }
        long j3 = this.f;
        this.f = 1 + j3;
        rm2Var.o = j3;
        this.c.add(rm2Var);
        this.d = null;
    }

    @Override // defpackage.cm4
    public final void b(long j) {
        this.g = j;
    }

    public abstract t9d c();

    public abstract void d(rm2 rm2Var);

    @Override // defpackage.cm4
    public final Object dequeueInputBuffer() {
        z1a.E(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        rm2 rm2Var = (rm2) arrayDeque.pollFirst();
        this.d = rm2Var;
        return rm2Var;
    }

    @Override // defpackage.cm4
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public tm2 dequeueOutputBuffer() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            rm2 rm2Var = (rm2) arrayDeque2.peek();
            String str = nik.a;
            if (rm2Var.k > this.e) {
                return null;
            }
            rm2 rm2Var2 = (rm2) arrayDeque2.poll();
            boolean i = rm2Var2.i(4);
            ArrayDeque arrayDeque3 = this.a;
            if (i) {
                tm2 tm2Var = (tm2) arrayDeque.pollFirst();
                tm2Var.b(4);
                rm2Var2.A();
                arrayDeque3.add(rm2Var2);
                return tm2Var;
            }
            d(rm2Var2);
            if (f()) {
                t9d c = c();
                tm2 tm2Var2 = (tm2) arrayDeque.pollFirst();
                long j = rm2Var2.k;
                tm2Var2.g = j;
                tm2Var2.i = c;
                tm2Var2.j = j;
                rm2Var2.A();
                arrayDeque3.add(rm2Var2);
                return tm2Var2;
            }
            rm2Var2.A();
            arrayDeque3.add(rm2Var2);
        }
    }

    public abstract boolean f();

    @Override // defpackage.cm4
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            rm2 rm2Var = (rm2) arrayDeque2.poll();
            String str = nik.a;
            rm2Var.A();
            arrayDeque.add(rm2Var);
        }
        rm2 rm2Var2 = this.d;
        if (rm2Var2 != null) {
            rm2Var2.A();
            arrayDeque.add(rm2Var2);
            this.d = null;
        }
    }

    @Override // defpackage.nli
    public final void setPositionUs(long j) {
        this.e = j;
    }

    @Override // defpackage.cm4
    public void release() {
    }
}
