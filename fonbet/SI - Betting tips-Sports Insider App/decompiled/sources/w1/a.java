package w1;

import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.f0;
import java.util.concurrent.atomic.AtomicBoolean;
import s7.w0;
import x5.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static Handler f24946f;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f24951e;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f24948b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f24949c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f24950d = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final b f24947a = new b(this, new f0(3, this));

    public a(c cVar) {
        this.f24951e = cVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f24946f == null) {
                    f24946f = new Handler(Looper.getMainLooper());
                }
                handler = f24946f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new w0(13, this, obj));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24951e.b();
    }
}
