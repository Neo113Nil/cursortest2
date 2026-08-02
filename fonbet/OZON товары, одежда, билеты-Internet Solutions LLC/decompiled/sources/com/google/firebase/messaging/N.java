package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class N {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f59625a;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f59629e;

    /* renamed from: d, reason: collision with root package name */
    final ArrayDeque<String> f59628d = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    private final String f59626b = "topic_operation_queue";

    /* renamed from: c, reason: collision with root package name */
    private final String f59627c = ",";

    private N(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
        this.f59625a = sharedPreferences;
        this.f59629e = scheduledExecutorService;
    }

    public static void a(N n11) {
        synchronized (n11.f59628d) {
            SharedPreferences.Editor edit = n11.f59625a.edit();
            String str = n11.f59626b;
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it = n11.f59628d.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(n11.f59627c);
            }
            edit.putString(str, sb2.toString()).commit();
        }
    }

    static N b(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
        N n11 = new N(sharedPreferences, scheduledExecutorService);
        synchronized (n11.f59628d) {
            try {
                n11.f59628d.clear();
                String string = n11.f59625a.getString(n11.f59626b, "");
                if (!TextUtils.isEmpty(string) && string.contains(n11.f59627c)) {
                    String[] split = string.split(n11.f59627c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            n11.f59628d.add(str);
                        }
                    }
                    return n11;
                }
                return n11;
            } finally {
            }
        }
    }

    public final boolean c(String str) {
        boolean remove;
        synchronized (this.f59628d) {
            remove = this.f59628d.remove(str);
            if (remove) {
                this.f59629e.execute(new Runnable() { // from class: com.google.firebase.messaging.M
                    @Override // java.lang.Runnable
                    public final void run() {
                        N.a(N.this);
                    }
                });
            }
        }
        return remove;
    }
}
