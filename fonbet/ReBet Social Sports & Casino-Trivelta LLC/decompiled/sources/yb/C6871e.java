package yb;

import com.google.firebase.installations.p;
import java.util.concurrent.TimeUnit;

/* renamed from: yb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6871e {

    /* renamed from: d, reason: collision with root package name */
    public static final long f68325d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f68326e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final p f68327a = p.c();

    /* renamed from: b, reason: collision with root package name */
    public long f68328b;

    /* renamed from: c, reason: collision with root package name */
    public int f68329c;

    public static boolean c(int i10) {
        if (i10 != 429) {
            return i10 >= 500 && i10 < 600;
        }
        return true;
    }

    public static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    public final synchronized long a(int i10) {
        if (c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f68329c) + this.f68327a.e(), f68326e);
        }
        return f68325d;
    }

    public synchronized boolean b() {
        boolean z10;
        if (this.f68329c != 0) {
            z10 = this.f68327a.a() > this.f68328b;
        }
        return z10;
    }

    public final synchronized void e() {
        this.f68329c = 0;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f68329c++;
        this.f68328b = this.f68327a.a() + a(i10);
    }
}
