package e6;

import android.content.Context;
import android.os.Looper;
import io.appmetrica.analytics.impl.ap;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8718a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f8719b;

    public j(Looper looper, Object obj, String str) {
        this.f8718a = new e5.p(looper);
        g6.v.i(obj, "Listener must not be null");
        g6.v.e(str);
        this.f8719b = new i(obj, str);
    }

    public Object a(Context context) {
        if (this.f8719b == null) {
            synchronized (this) {
                try {
                    if (this.f8719b == null) {
                        this.f8719b = ((ap) this.f8718a).e(context);
                    }
                } finally {
                }
            }
        }
        return this.f8719b;
    }

    public void b(i2.d dVar) {
        ((e5.p) this.f8718a).execute(new g8.a(16, this, dVar));
    }

    public j(ap apVar) {
        this.f8719b = null;
        this.f8718a = apVar;
    }

    public j() {
        this.f8718a = new CopyOnWriteArraySet();
    }
}
