package p8;

import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f21546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f21547c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i2.d f21548d;

    public /* synthetic */ d(e eVar, Runnable runnable, i2.d dVar, int i5) {
        this.f21545a = i5;
        this.f21546b = eVar;
        this.f21547c = runnable;
        this.f21548d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21545a) {
            case 0:
                ExecutorService executorService = this.f21546b.f21549a;
                final int i5 = 0;
                final Runnable runnable = this.f21547c;
                final i2.d dVar = this.f21548d;
                executorService.execute(new Runnable() { // from class: p8.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((g) dVar.f10882b).l(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e9) {
                                    ((g) dVar.f10882b).l(e9);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                g gVar = (g) dVar.f10882b;
                                try {
                                    runnable2.run();
                                    gVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    gVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f21546b.f21549a;
                final int i10 = 2;
                final Runnable runnable2 = this.f21547c;
                final i2.d dVar2 = this.f21548d;
                executorService2.execute(new Runnable() { // from class: p8.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((g) dVar2.f10882b).l(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e9) {
                                    ((g) dVar2.f10882b).l(e9);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                g gVar = (g) dVar2.f10882b;
                                try {
                                    runnable22.run();
                                    gVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    gVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f21546b.f21549a;
                final int i11 = 1;
                final Runnable runnable3 = this.f21547c;
                final i2.d dVar3 = this.f21548d;
                executorService3.execute(new Runnable() { // from class: p8.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((g) dVar3.f10882b).l(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e9) {
                                    ((g) dVar3.f10882b).l(e9);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                g gVar = (g) dVar3.f10882b;
                                try {
                                    runnable22.run();
                                    gVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    gVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
