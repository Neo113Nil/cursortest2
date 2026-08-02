package y8;

import android.content.Context;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y3;
import java.util.Set;
import java.util.concurrent.Executor;
import o8.l;
import w7.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements e, f {

    /* renamed from: a, reason: collision with root package name */
    public final l f25723a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f25724b;

    /* renamed from: c, reason: collision with root package name */
    public final a9.a f25725c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f25726d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f25727e;

    public c(Context context, String str, Set set, a9.a aVar, Executor executor) {
        this.f25723a = new l(new h8.c(context, str));
        this.f25726d = set;
        this.f25727e = executor;
        this.f25725c = aVar;
        this.f25724b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        g gVar = (g) this.f25723a.get();
        if (!gVar.i(currentTimeMillis)) {
            return 1;
        }
        gVar.g();
        return 3;
    }

    public final m b() {
        if (!y3.u(this.f25724b)) {
            return d5.q("");
        }
        return d5.d(this.f25727e, new b(this, 0));
    }

    public final void c() {
        if (this.f25726d.size() <= 0) {
            d5.q(null);
        } else if (!y3.u(this.f25724b)) {
            d5.q(null);
        } else {
            d5.d(this.f25727e, new b(this, 1));
        }
    }
}
