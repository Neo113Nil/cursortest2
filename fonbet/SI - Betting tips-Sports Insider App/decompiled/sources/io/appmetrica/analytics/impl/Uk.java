package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Uk {

    /* renamed from: d, reason: collision with root package name */
    public static final String f12984d = "SESSION_SLEEP_START";

    /* renamed from: e, reason: collision with root package name */
    public static final String f12985e = "SESSION_LAST_EVENT_OFFSET";

    /* renamed from: f, reason: collision with root package name */
    public static final String f12986f = "SESSION_ID";

    /* renamed from: g, reason: collision with root package name */
    public static final String f12987g = "SESSION_COUNTER_ID";

    /* renamed from: h, reason: collision with root package name */
    public static final String f12988h = "SESSION_INIT_TIME";

    /* renamed from: i, reason: collision with root package name */
    public static final String f12989i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* renamed from: a, reason: collision with root package name */
    public final String f12990a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    protected final We f12991b;

    /* renamed from: c, reason: collision with root package name */
    public C0150fb f12992c;

    public Uk(@NonNull We we2, @NonNull String str) {
        this.f12991b = we2;
        this.f12990a = str;
        C0150fb c0150fb = new C0150fb();
        try {
            String h10 = we2.h(str);
            if (!TextUtils.isEmpty(h10)) {
                c0150fb = new C0150fb(h10);
            }
        } catch (Throwable unused) {
        }
        this.f12992c = c0150fb;
    }

    public final Uk a(long j) {
        a(f12988h, Long.valueOf(j));
        return this;
    }

    public final Uk b(long j) {
        a(f12985e, Long.valueOf(j));
        return this;
    }

    public final Long c() {
        return this.f12992c.a(f12988h);
    }

    public final Uk d(long j) {
        a(f12986f, Long.valueOf(j));
        return this;
    }

    public final Long e() {
        return this.f12992c.a(f12987g);
    }

    public final Long f() {
        return this.f12992c.a(f12986f);
    }

    public final Long g() {
        return this.f12992c.a(f12984d);
    }

    public final boolean h() {
        return this.f12992c.length() > 0;
    }

    public final Boolean i() {
        C0150fb c0150fb = this.f12992c;
        c0150fb.getClass();
        try {
            return Boolean.valueOf(c0150fb.getBoolean(f12989i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Uk a(boolean z5) {
        a(f12989i, Boolean.valueOf(z5));
        return this;
    }

    public final void b() {
        this.f12991b.e(this.f12990a, this.f12992c.toString());
        this.f12991b.b();
    }

    public final Uk c(long j) {
        a(f12987g, Long.valueOf(j));
        return this;
    }

    public final Long d() {
        return this.f12992c.a(f12985e);
    }

    public final Uk e(long j) {
        a(f12984d, Long.valueOf(j));
        return this;
    }

    public final void a(String str, Object obj) {
        try {
            this.f12992c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        this.f12992c = new C0150fb();
        b();
    }
}
