package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qwd {
    public final int b;
    public int c;
    public int d;
    public final kod e;
    public final /* synthetic */ axn g;
    public final x52 a = new x52();
    public boolean f = false;

    public qwd(axn axnVar, int i, int i2, kod kodVar) {
        this.g = axnVar;
        this.b = i;
        this.c = i2;
        this.e = kodVar;
    }

    public final int a(int i) {
        if (i > 0 && Integer.MAX_VALUE - i < this.c) {
            hg6.d(this.b, "Window size overflow for stream: ");
            return 0;
        }
        int i2 = this.c + i;
        this.c = i2;
        return i2;
    }

    public final void b(int i, x52 x52Var, boolean z) {
        boolean g;
        do {
            int min = Math.min(i, ((zd6) this.g.c).b.a.d);
            int i2 = -min;
            ((qwd) this.g.d).a(i2);
            a(i2);
            try {
                boolean z2 = false;
                ((zd6) this.g.c).e(x52Var.b == ((long) min) && z, this.b, x52Var, min);
                kod kodVar = this.e;
                synchronized (kodVar.b) {
                    z1a.D("onStreamAllocated was not called, but it seems the stream is active", kodVar.f);
                    int i3 = kodVar.e;
                    boolean z3 = i3 < 32768;
                    int i4 = i3 - min;
                    kodVar.e = i4;
                    boolean z4 = i4 < 32768;
                    if (!z3 && z4) {
                        z2 = true;
                    }
                }
                if (z2) {
                    synchronized (kodVar.b) {
                        g = kodVar.g();
                    }
                    if (g) {
                        kodVar.j.B();
                    }
                }
                i -= min;
            } catch (IOException e) {
                is8.h(e);
                return;
            }
        } while (i > 0);
    }

    public final void c(int i, zid zidVar) {
        int i2 = this.c;
        axn axnVar = this.g;
        int min = Math.min(i, Math.min(i2, ((qwd) axnVar.d).c));
        int i3 = 0;
        while (true) {
            x52 x52Var = this.a;
            long j = x52Var.b;
            if (j <= 0 || min <= 0) {
                return;
            }
            if (min >= j) {
                int i4 = (int) j;
                i3 += i4;
                b(i4, x52Var, this.f);
            } else {
                i3 += min;
                b(min, x52Var, false);
            }
            zidVar.b++;
            min = Math.min(i - i3, Math.min(this.c, ((qwd) axnVar.d).c));
        }
    }
}
