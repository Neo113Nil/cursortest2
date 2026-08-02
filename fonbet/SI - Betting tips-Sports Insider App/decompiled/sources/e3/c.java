package e3;

import android.os.Build;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f8475a;

    /* renamed from: b, reason: collision with root package name */
    public final lg.e f8476b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f8477c;

    /* renamed from: d, reason: collision with root package name */
    public final l f8478d;

    /* renamed from: e, reason: collision with root package name */
    public final l f8479e;

    /* renamed from: f, reason: collision with root package name */
    public final l f8480f;

    /* renamed from: g, reason: collision with root package name */
    public final f3.b f8481g;

    /* renamed from: h, reason: collision with root package name */
    public final da.q f8482h;

    /* renamed from: i, reason: collision with root package name */
    public final da.q f8483i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8484k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8485l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8486m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8487n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f8488o;

    /* renamed from: p, reason: collision with root package name */
    public final l f8489p;

    public c(b6.p builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f8475a = m4.g.a(false);
        this.f8476b = eg.m0.f9201a;
        this.f8477c = m4.g.a(true);
        this.f8478d = new l();
        this.f8479e = l.f8535a;
        this.f8480f = l.f8536b;
        this.f8481g = new f3.b(0);
        this.f8484k = 4;
        this.f8485l = builder.f3078a;
        this.f8487n = Build.VERSION.SDK_INT == 23 ? 10 : 20;
        this.f8482h = (da.q) builder.f3079b;
        this.f8483i = (da.q) builder.f3080c;
        this.j = (String) builder.f3081d;
        this.f8486m = 8;
        this.f8488o = true;
        this.f8489p = new l();
    }
}
