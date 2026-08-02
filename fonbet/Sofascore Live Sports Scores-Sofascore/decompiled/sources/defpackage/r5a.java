package defpackage;

import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzeu;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r5a implements s5a {
    public int a;
    public long b;

    public r5a(int i, long j) {
        z1a.s(j >= 0);
        this.a = i;
        this.b = j;
    }

    public static r5a c(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            j = (j * 10) + (charAt - '0');
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new r5a(j, i3);
    }

    public static r5a d(ml6 ml6Var, nkk nkkVar) {
        ml6Var.peekFully(nkkVar.a, 0, 8);
        nkkVar.E(0);
        int f = nkkVar.f();
        return new r5a(nkkVar.j(), f, false);
    }

    public static r5a e(nl6 nl6Var, j9e j9eVar) {
        nl6Var.peekFully(j9eVar.a, 0, 8);
        j9eVar.N(0);
        int m = j9eVar.m();
        return new r5a(j9eVar.r(), m, false);
    }

    public static r5a g(zzagi zzagiVar, zzeu zzeuVar) {
        zzagiVar.h(0, 8, zzeuVar.a);
        zzeuVar.D(0);
        int b = zzeuVar.b();
        return new r5a(zzeuVar.a(), b, false);
    }

    public synchronized boolean a() {
        boolean z;
        if (this.a != 0) {
            z = System.currentTimeMillis() > this.b;
        }
        return z;
    }

    public boolean b() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public synchronized void f(int i) {
        long min;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.a = 0;
            }
            return;
        }
        this.a++;
        synchronized (this) {
            if (i != 429 && (i < 500 || i >= 600)) {
                min = 86400000;
                this.b = System.currentTimeMillis() + min;
            }
            min = (long) Math.min(Math.pow(2.0d, this.a) + ((long) (Math.random() * 1000.0d)), 1800000.0d);
            this.b = System.currentTimeMillis() + min;
        }
        return;
    }

    @Override // defpackage.s5a
    public o5a toInstant() {
        long j = this.b;
        o5a o5aVar = o5a.c;
        if (j >= o5a.c.a && j <= o5a.d.a) {
            return uic.l(this.a, j);
        }
        throw new gk4("The parsed date is outside the range representable by Instant (Unix epoch second " + j + ')');
    }

    public /* synthetic */ r5a(long j, int i, boolean z) {
        this.a = i;
        this.b = j;
    }

    public /* synthetic */ r5a(long j, int i) {
        this.b = j;
        this.a = i;
    }
}
