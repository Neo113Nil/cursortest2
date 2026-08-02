package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g35 implements Executor {
    public static final g35 b = new g35(0);
    public static final /* synthetic */ g35 c = new g35(4);
    public static final /* synthetic */ g35 d = new g35(5);
    public static final /* synthetic */ g35 e = new g35(6);
    public static final /* synthetic */ g35 f = new g35(7);
    public final /* synthetic */ int a;

    public /* synthetic */ g35(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            case 1:
                new Thread(runnable).start();
                break;
            case 2:
                kik.B().post(runnable);
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                break;
            case 5:
                runnable.run();
                break;
            case 6:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }

    private final /* synthetic */ void a(Runnable runnable) {
    }
}
