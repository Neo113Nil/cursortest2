package h6;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import g6.C4331C;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: h6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4477d {

    /* renamed from: a, reason: collision with root package name */
    public static final C4477d f47759a = new C4477d();

    /* renamed from: b, reason: collision with root package name */
    public static final String f47760b = C4477d.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantReadWriteLock f47761c = new ReentrantReadWriteLock();

    /* renamed from: d, reason: collision with root package name */
    public static String f47762d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f47763e;

    public static final String c() {
        if (!f47763e) {
            Log.w(f47760b, "initStore should have been called before calling setUserID");
            f47759a.d();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f47761c;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str = f47762d;
            reentrantReadWriteLock.readLock().unlock();
            return str;
        } catch (Throwable th2) {
            f47761c.readLock().unlock();
            throw th2;
        }
    }

    public static final void e() {
        if (f47763e) {
            return;
        }
        C4470F.f47729b.c().execute(new Runnable() { // from class: h6.c
            @Override // java.lang.Runnable
            public final void run() {
                C4477d.f();
            }
        });
    }

    public static final void f() {
        f47759a.d();
    }

    public static final void g(final String str) {
        p6.g.b();
        if (!f47763e) {
            Log.w(f47760b, "initStore should have been called before calling setUserID");
            f47759a.d();
        }
        C4470F.f47729b.c().execute(new Runnable() { // from class: h6.b
            @Override // java.lang.Runnable
            public final void run() {
                C4477d.h(str);
            }
        });
    }

    public static final void h(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = f47761c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            f47762d = str;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C4331C.l()).edit();
            edit.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", f47762d);
            edit.apply();
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th2) {
            f47761c.writeLock().unlock();
            throw th2;
        }
    }

    public final void d() {
        if (f47763e) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f47761c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!f47763e) {
                f47762d = PreferenceManager.getDefaultSharedPreferences(C4331C.l()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                f47763e = true;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th2) {
            f47761c.writeLock().unlock();
            throw th2;
        }
    }
}
