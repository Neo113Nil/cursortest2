package com.facebook.appevents;

import android.preference.PreferenceManager;
import com.facebook.w;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class c {
    public static final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    public static String b;
    public static volatile boolean c;

    public static void a() {
        if (c) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!c) {
                b = PreferenceManager.getDefaultSharedPreferences(w.a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                c = true;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            a.writeLock().unlock();
            throw th;
        }
    }
}
