package s7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public final r3 f22968a;

    /* renamed from: b, reason: collision with root package name */
    public int f22969b = 1;

    /* renamed from: c, reason: collision with root package name */
    public long f22970c = a();

    public q3(r3 r3Var) {
        this.f22968a = r3Var;
    }

    public final long a() {
        r3 r3Var = this.f22968a;
        g6.v.h(r3Var);
        long longValue = ((Long) x.f23221v.a(null)).longValue();
        long longValue2 = ((Long) x.f23223w.a(null)).longValue();
        for (int i5 = 1; i5 < this.f22969b; i5++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        r3Var.f().getClass();
        return Math.min(longValue, longValue2) + System.currentTimeMillis();
    }
}
