package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class gw4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iw4 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ t9d d;

    public /* synthetic */ gw4(iw4 iw4Var, Runnable runnable, t9d t9dVar, int i) {
        this.a = i;
        this.b = iw4Var;
        this.c = runnable;
        this.d = t9dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        final t9d t9dVar = this.d;
        final Runnable runnable = this.c;
        iw4 iw4Var = this.b;
        switch (i) {
            case 0:
                final int i2 = 0;
                iw4Var.a.execute(new Runnable() { // from class: ew4
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        t9d t9dVar2 = t9dVar;
                        Runnable runnable2 = runnable;
                        switch (i3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((kw4) t9dVar2.a).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((kw4) t9dVar2.a).k(e2);
                                    return;
                                }
                            default:
                                kw4 kw4Var = (kw4) t9dVar2.a;
                                try {
                                    runnable2.run();
                                    kw4Var.j(null);
                                    return;
                                } catch (Exception e3) {
                                    kw4Var.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i3 = 2;
                iw4Var.a.execute(new Runnable() { // from class: ew4
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i3;
                        t9d t9dVar2 = t9dVar;
                        Runnable runnable2 = runnable;
                        switch (i32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((kw4) t9dVar2.a).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((kw4) t9dVar2.a).k(e2);
                                    return;
                                }
                            default:
                                kw4 kw4Var = (kw4) t9dVar2.a;
                                try {
                                    runnable2.run();
                                    kw4Var.j(null);
                                    return;
                                } catch (Exception e3) {
                                    kw4Var.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final int i4 = 1;
                iw4Var.a.execute(new Runnable() { // from class: ew4
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i4;
                        t9d t9dVar2 = t9dVar;
                        Runnable runnable2 = runnable;
                        switch (i32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((kw4) t9dVar2.a).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((kw4) t9dVar2.a).k(e2);
                                    return;
                                }
                            default:
                                kw4 kw4Var = (kw4) t9dVar2.a;
                                try {
                                    runnable2.run();
                                    kw4Var.j(null);
                                    return;
                                } catch (Exception e3) {
                                    kw4Var.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
