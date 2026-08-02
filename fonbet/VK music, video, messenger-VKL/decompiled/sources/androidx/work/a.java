package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import xsna.bdn;
import xsna.dzi;
import xsna.i7o0;
import xsna.m370;
import xsna.ovj;
import xsna.p7i;
import xsna.qu5;
import xsna.rll;
import xsna.srl;

/* compiled from: Configuration.kt */
/* loaded from: classes.dex */
public final class a {
    public final Executor a;
    public final ovj b;
    public final Executor c;
    public final i7o0 d;
    public final srl e;
    public final m370 f;
    public final rll g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final p7i m;

    /* compiled from: Configuration.kt */
    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    public static final class C0091a {
        public ExecutorService a;
        public ExecutorService b;
        public int c = 4;
    }

    /* compiled from: Configuration.kt */
    public interface b {
        a a();
    }

    public a(C0091a c0091a) {
        ExecutorService executorService = c0091a.a;
        executorService = executorService == null ? Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new dzi(false)) : executorService;
        this.a = executorService;
        this.b = c0091a.a != null ? qu5.b(executorService) : bdn.b;
        ExecutorService executorService2 = c0091a.b;
        this.c = executorService2 == null ? Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new dzi(true)) : executorService2;
        this.d = new i7o0();
        this.e = srl.a;
        this.f = m370.c;
        this.g = new rll();
        this.h = c0091a.c;
        this.i = Integer.MAX_VALUE;
        this.k = 20;
        this.j = 8;
        this.l = true;
        this.m = new p7i();
    }
}
