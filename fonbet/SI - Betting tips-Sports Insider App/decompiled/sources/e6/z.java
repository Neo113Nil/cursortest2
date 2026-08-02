package e6;

import android.os.Trace;
import com.google.android.gms.internal.measurement.l4;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ z f8769b = new z(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ z f8770c = new z(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8771a;

    public /* synthetic */ z(int i5) {
        this.f8771a = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8771a) {
            case 0:
                return;
            case 1:
                try {
                    Method method = l0.k.f19312b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (j1.j.f18201k != null) {
                        j1.j.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th2) {
                    Method method2 = l0.k.f19312b;
                    Trace.endSection();
                    throw th2;
                }
            default:
                l4.f5119i.incrementAndGet();
                return;
        }
    }

    private final /* synthetic */ void a() {
    }
}
