package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: d, reason: collision with root package name */
    public static WeakReference f6100d;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6101a;

    /* renamed from: b, reason: collision with root package name */
    public c4.d f6102b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f6103c;

    public c0(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f6103c = scheduledThreadPoolExecutor;
        this.f6101a = sharedPreferences;
    }

    public final synchronized b0 a() {
        b0 b0Var;
        String k6 = this.f6102b.k();
        Pattern pattern = b0.f6095d;
        b0Var = null;
        if (!TextUtils.isEmpty(k6)) {
            String[] split = k6.split("!", -1);
            if (split.length == 2) {
                b0Var = new b0(split[0], split[1]);
            }
        }
        return b0Var;
    }

    public final synchronized void b() {
        this.f6102b = c4.d.e(this.f6101a, this.f6103c);
    }

    public final synchronized void c(b0 b0Var) {
        this.f6102b.m(b0Var.f6098c);
    }
}
