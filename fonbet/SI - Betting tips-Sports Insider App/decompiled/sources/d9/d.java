package d9;

import b9.k;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final long f8321d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f8322e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final k f8323a;

    /* renamed from: b, reason: collision with root package name */
    public long f8324b;

    /* renamed from: c, reason: collision with root package name */
    public int f8325c;

    public d() {
        if (y8.d.f25728a == null) {
            Pattern pattern = k.f3117c;
            y8.d.f25728a = new y8.d();
        }
        y8.d dVar = y8.d.f25728a;
        if (k.f3118d == null) {
            k.f3118d = new k(dVar);
        }
        this.f8323a = k.f3118d;
    }

    public final synchronized long a(int i5) {
        if (!(i5 == 429 || (i5 >= 500 && i5 < 600))) {
            return f8321d;
        }
        double pow = Math.pow(2.0d, this.f8325c);
        this.f8323a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f8322e);
    }

    public final synchronized boolean b() {
        boolean z5;
        if (this.f8325c != 0) {
            this.f8323a.f3119a.getClass();
            z5 = System.currentTimeMillis() > this.f8324b;
        }
        return z5;
    }

    public final synchronized void c() {
        this.f8325c = 0;
    }

    public final synchronized void d(int i5) {
        if ((i5 >= 200 && i5 < 300) || i5 == 401 || i5 == 404) {
            c();
            return;
        }
        this.f8325c++;
        long a7 = a(i5);
        this.f8323a.f3119a.getClass();
        this.f8324b = System.currentTimeMillis() + a7;
    }
}
