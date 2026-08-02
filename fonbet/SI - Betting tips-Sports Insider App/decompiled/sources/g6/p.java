package g6;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static volatile p f9859b;

    /* renamed from: c, reason: collision with root package name */
    public static Context f9860c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ p f9861d = new p(1);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ p f9862e = new p(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9863a;

    public /* synthetic */ p(int i5) {
        this.f9863a = i5;
    }

    public static p a(Context context) {
        p pVar;
        p pVar2 = f9859b;
        if (pVar2 != null) {
            return pVar2;
        }
        synchronized (p.class) {
            try {
                pVar = f9859b;
                if (pVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    v.h(applicationContext);
                    f9860c = applicationContext;
                    pVar = new p(0);
                    f9859b = pVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f9863a) {
            case 0:
                o.f9858a.post(runnable);
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
