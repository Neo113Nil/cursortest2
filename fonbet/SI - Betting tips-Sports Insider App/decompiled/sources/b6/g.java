package b6;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ g f3047b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g f3048c = new g(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3049a;

    public /* synthetic */ g(int i5) {
        this.f3049a = i5;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3049a) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
