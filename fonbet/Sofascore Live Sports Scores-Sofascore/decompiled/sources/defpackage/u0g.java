package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u0g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0g b;

    public /* synthetic */ u0g(v0g v0gVar, int i) {
        this.a = i;
        this.b = v0gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 0;
        v0g v0gVar = this.b;
        switch (i) {
            case 0:
                if (!v0gVar.f) {
                    v0gVar.g = null;
                    break;
                } else {
                    long a = v0gVar.e - v0gVar.d.a();
                    if (a <= 0) {
                        v0gVar.f = false;
                        v0gVar.g = null;
                        v0gVar.c.run();
                        break;
                    } else {
                        v0gVar.g = v0gVar.a.schedule(new u0g(v0gVar, 1), a, TimeUnit.NANOSECONDS);
                        break;
                    }
                }
            default:
                v0gVar.b.execute(new u0g(v0gVar, i2));
                break;
        }
    }
}
