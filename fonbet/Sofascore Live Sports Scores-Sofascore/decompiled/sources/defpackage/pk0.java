package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pk0 {
    public final j25 a;
    public final sz8 b;
    public final CoroutineContext c;
    public final CoroutineContext d;
    public int f;
    public final lk0 h;
    public final AtomicInteger i;
    public final z88 j;
    public final AtomicReference k;
    public final CopyOnWriteArrayList l;
    public final u2 m;
    public final mqi n;
    public final a8p o;
    public final fdi e = gdi.a(Boolean.FALSE);
    public final AtomicReference g = new AtomicReference(null);

    public pk0(j25 j25Var, sz8 sz8Var, CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.a = j25Var;
        this.b = sz8Var;
        this.c = coroutineContext;
        this.d = coroutineContext2;
        lk0 lk0Var = new lk0(this, coroutineContext);
        this.h = lk0Var;
        this.i = new AtomicInteger(0);
        pog pogVar = new pog(new g2(k53.W(new wj0(lk0Var.k, 3), -1), (rq3) null, this));
        hs4 hs4Var = z45.a;
        this.j = k53.g0(pogVar, rob.a);
        un0.t(lk0Var.l);
        this.k = new AtomicReference(null);
        this.l = new CopyOnWriteArrayList();
        this.m = new u2(this, 10);
        this.n = ypa.b(new st(22));
        this.o = new a8p(this);
    }
}
