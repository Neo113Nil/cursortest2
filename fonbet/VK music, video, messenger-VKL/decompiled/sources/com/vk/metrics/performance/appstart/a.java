package com.vk.metrics.performance.appstart;

import com.vk.lifecycle.ProcessStateProvider;
import com.vk.metrics.performance.appstart.IdleStateHandler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.b63;
import xsna.dx90;
import xsna.jw90;
import xsna.ow90;
import xsna.v0f;
import xsna.wgd0;

/* compiled from: AppStartDurationChecker.kt */
/* loaded from: classes.dex */
public final class a implements IdleStateHandler.AppStartListener {
    public final wgd0 a;
    public final v0f b;
    public boolean c = true;
    public final CopyOnWriteArrayList<InterfaceC1278a> d = new CopyOnWriteArrayList<>();
    public ProcessStateProvider.ProcessState e;

    /* compiled from: AppStartDurationChecker.kt */
    /* renamed from: com.vk.metrics.performance.appstart.a$a, reason: collision with other inner class name */
    public interface InterfaceC1278a {
        void a();

        void b(jw90 jw90Var);

        void c();

        void d();
    }

    /* compiled from: AppStartDurationChecker.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdleStateHandler.AppStartListener.StartType.values().length];
            try {
                iArr[IdleStateHandler.AppStartListener.StartType.COLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdleStateHandler.AppStartListener.StartType.WARM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(b63 b63Var, wgd0 wgd0Var, v0f v0fVar) {
        this.a = wgd0Var;
        this.b = v0fVar;
        IdleStateHandler idleStateHandler = IdleStateHandler.a;
        IdleStateHandler.b.add(this);
    }

    @Override // com.vk.metrics.performance.appstart.IdleStateHandler.AppStartListener
    public final void a(IdleStateHandler.AppStartListener.StartType startType) {
        int i = b.$EnumSwitchMapping$0[startType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        dx90 dx90Var = ow90.e;
        dx90Var.getClass();
        if (this.c) {
            dx90Var.a = System.currentTimeMillis();
            int i2 = dx90.W;
            dx90.b.b("coldStart");
            long j = dx90Var.a;
            dx90Var.f = j;
            long j2 = dx90Var.b;
            long j3 = dx90Var.c;
            long j4 = dx90Var.e;
            long j5 = dx90Var.j;
            long j6 = dx90Var.k;
            long j7 = dx90Var.l;
            long j8 = dx90Var.m;
            long j9 = dx90Var.p;
            long j10 = dx90Var.n;
            long j11 = dx90Var.o;
            long j12 = dx90Var.q;
            jw90 jw90Var = new jw90(Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(dx90Var.g), 0L, Long.valueOf(dx90Var.h), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j8), 0L, 0L, Long.valueOf(j), 0L, Long.valueOf(j9), Long.valueOf(j11), Long.valueOf(j10), Long.valueOf(dx90Var.i), Long.valueOf(j12), Integer.valueOf((int) dx90Var.r), Integer.valueOf((int) dx90Var.s), Integer.valueOf((int) 0), 0L, 0L, 0L);
            dx90Var.r();
            Iterator<InterfaceC1278a> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().b(jw90Var);
            }
            this.d.clear();
        }
        this.b.invoke();
    }
}
