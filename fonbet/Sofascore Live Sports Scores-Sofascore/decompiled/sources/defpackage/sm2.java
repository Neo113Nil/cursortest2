package defpackage;

import java.util.ArrayDeque;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sm2 extends ffb implements kli {
    public long g;
    public kli h;
    public long i;
    public final /* synthetic */ int j;
    public Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sm2(mli mliVar, int i) {
        super(2);
        this.j = i;
        this.k = mliVar;
    }

    public final void A() {
        switch (this.j) {
            case 0:
                um2 um2Var = (um2) ((l1) this.k).b;
                this.b = 0;
                this.h = null;
                um2Var.b.add(this);
                return;
            case 1:
                ArrayDeque arrayDeque = (ArrayDeque) ((a02) this.k).e;
                qx9.t(arrayDeque.size() < 2);
                qx9.r(!arrayDeque.contains(this));
                this.b = 0;
                this.h = null;
                arrayDeque.addFirst(this);
                return;
            default:
                qhh qhhVar = (qhh) this.k;
                synchronized (qhhVar.b) {
                    this.b = 0;
                    this.h = null;
                    sm2[] sm2VarArr = qhhVar.f;
                    int i = qhhVar.h;
                    qhhVar.h = i + 1;
                    sm2VarArr[i] = this;
                    if (!qhhVar.c.isEmpty() && qhhVar.h > 0) {
                        qhhVar.b.notify();
                    }
                }
                return;
        }
    }

    public final void B(long j, kli kliVar, long j2) {
        this.g = j;
        this.h = kliVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.i = j;
    }

    @Override // defpackage.kli
    public final List getCues(long j) {
        kli kliVar = this.h;
        kliVar.getClass();
        return kliVar.getCues(j - this.i);
    }

    @Override // defpackage.kli
    public final long getEventTime(int i) {
        kli kliVar = this.h;
        kliVar.getClass();
        return kliVar.getEventTime(i) + this.i;
    }

    @Override // defpackage.kli
    public final int getEventTimeCount() {
        kli kliVar = this.h;
        kliVar.getClass();
        return kliVar.getEventTimeCount();
    }

    @Override // defpackage.kli
    public final int getNextEventTimeIndex(long j) {
        kli kliVar = this.h;
        kliVar.getClass();
        return kliVar.getNextEventTimeIndex(j - this.i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sm2() {
        super(2);
        this.j = 0;
    }
}
