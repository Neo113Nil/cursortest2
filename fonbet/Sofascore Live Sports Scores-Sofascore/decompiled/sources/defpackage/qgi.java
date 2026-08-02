package defpackage;

import com.google.android.gms.internal.ads.zzeu;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class qgi {
    public final /* synthetic */ int a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long g;
    public boolean h;
    public boolean i;
    public final Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    public qgi(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.j = new vnd(1);
                this.n = new y3g(19, false);
                break;
            case 2:
                this.j = new vnd(2);
                this.n = new c0l(11, false);
                break;
            default:
                this.j = new vnd(0);
                this.n = new y3g(18, false);
                break;
        }
    }

    public void a(long j) {
        switch (this.a) {
            case 0:
                this.d = j;
                break;
            default:
                this.d = j;
                break;
        }
    }

    public abstract long b(j9e j9eVar);

    public abstract long c(nkk nkkVar);

    public abstract boolean d(j9e j9eVar, long j, y3g y3gVar);

    public abstract boolean e(nkk nkkVar, long j, y3g y3gVar);

    public void f(boolean z) {
        switch (this.a) {
            case 0:
                if (z) {
                    this.n = new y3g(18, false);
                    this.c = 0L;
                    this.e = 0;
                } else {
                    this.e = 1;
                }
                this.b = -1L;
                this.d = 0L;
                break;
            default:
                if (z) {
                    this.n = new y3g(19, false);
                    this.c = 0L;
                    this.e = 0;
                } else {
                    this.e = 1;
                }
                this.b = -1L;
                this.d = 0L;
                break;
        }
    }

    public void g(boolean z) {
        int i;
        if (z) {
            this.n = new c0l(11, false);
            this.c = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.e = i;
        this.b = -1L;
        this.d = 0L;
    }

    public abstract long h(zzeu zzeuVar);

    public abstract boolean i(zzeu zzeuVar, long j, c0l c0lVar);

    public void j(long j) {
        this.d = j;
    }
}
