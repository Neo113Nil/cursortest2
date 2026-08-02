package da;

import hg.d1;
import hg.u0;
import j$.time.Instant;
import kotlin.Pair;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final d1 f8343a = u0.b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final d1 f8344b = u0.b(404);

    /* renamed from: c, reason: collision with root package name */
    public static final d1 f8345c = u0.b(0L);

    /* renamed from: d, reason: collision with root package name */
    public static final d1 f8346d = u0.b(0L);

    /* renamed from: e, reason: collision with root package name */
    public static final d1 f8347e = u0.b(0L);

    /* renamed from: f, reason: collision with root package name */
    public static final d1 f8348f = u0.b(0L);

    /* renamed from: g, reason: collision with root package name */
    public static final d1 f8349g = u0.b(0);

    /* renamed from: h, reason: collision with root package name */
    public static final d1 f8350h = u0.b(new Pair(0, 0));

    public static void a(int i5) {
        Integer valueOf = Integer.valueOf(i5);
        d1 d1Var = f8349g;
        d1Var.getClass();
        d1Var.k(null, valueOf);
    }

    public static void b(int i5) {
        Integer valueOf = Integer.valueOf(i5);
        d1 d1Var = f8344b;
        d1Var.getClass();
        d1Var.k(null, valueOf);
    }

    public static boolean c() {
        return ((Number) f8346d.getValue()).longValue() > Instant.now().getEpochSecond();
    }

    public static boolean d() {
        return ((Number) f8347e.getValue()).longValue() > Instant.now().getEpochSecond();
    }

    public static boolean e() {
        return ((Number) f8345c.getValue()).longValue() > Instant.now().getEpochSecond();
    }

    public static boolean f() {
        return ((Number) f8348f.getValue()).longValue() > Instant.now().getEpochSecond();
    }
}
