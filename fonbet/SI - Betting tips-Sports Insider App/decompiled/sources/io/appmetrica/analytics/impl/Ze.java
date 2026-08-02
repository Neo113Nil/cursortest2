package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ze extends AbstractC0630yd implements Bo {

    /* renamed from: d, reason: collision with root package name */
    public static final Ye f13293d = new Ye("LOCATION_TRACKING_ENABLED", null);

    /* renamed from: e, reason: collision with root package name */
    public static final Ye f13294e = new Ye("PREF_KEY_OFFSET", null);

    /* renamed from: f, reason: collision with root package name */
    public static final Ye f13295f = new Ye("UNCHECKED_TIME", null);

    /* renamed from: g, reason: collision with root package name */
    public static final Ye f13296g = new Ye("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* renamed from: h, reason: collision with root package name */
    public static final Ye f13297h = new Ye("LAST_IDENTITY_LIGHT_SEND_TIME", null);

    /* renamed from: i, reason: collision with root package name */
    public static final Ye f13298i = new Ye("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);
    public static final Ye j = new Ye("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: k, reason: collision with root package name */
    public static final Ye f13299k = new Ye("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: l, reason: collision with root package name */
    public static final Ye f13300l = new Ye("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* renamed from: m, reason: collision with root package name */
    public static final Ye f13301m = new Ye("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* renamed from: n, reason: collision with root package name */
    public static final Ye f13302n = new Ye("LAST_STARTUP_SEND_ATTEMPT_TIME", null);

    /* renamed from: o, reason: collision with root package name */
    public static final Ye f13303o = new Ye("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* renamed from: p, reason: collision with root package name */
    public static final Ye f13304p = new Ye("SATELLITE_CLIDS_CHECKED", null);
    public static final Ye q = new Ye("VITAL_DATA", null);

    /* renamed from: r, reason: collision with root package name */
    public static final Ye f13305r = new Ye("LAST_KOTLIN_VERSION_SEND_TIME", null);

    /* renamed from: s, reason: collision with root package name */
    public static final Ye f13306s = new Ye("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public Ze(Ha ha2) {
        super(ha2);
    }

    public final long a(int i5) {
        return this.f13187a.getLong(f13294e.f13227b, i5);
    }

    public final boolean b(boolean z5) {
        return this.f13187a.getBoolean(f13295f.f13227b, z5);
    }

    public final Ze c(boolean z5) {
        return (Ze) b(f13296g.f13227b, z5);
    }

    public final Ze d(long j6) {
        return (Ze) b(f13294e.f13227b, j6);
    }

    public final boolean e() {
        return this.f13187a.getBoolean(f13293d.f13227b, false);
    }

    public final void f(boolean z5) {
        b(f13293d.f13227b, z5).b();
    }

    public final Ze g() {
        return (Ze) b(f13304p.f13227b, true);
    }

    public final Ze h() {
        return (Ze) b(f13303o.f13227b, true);
    }

    public final boolean i() {
        return this.f13187a.getBoolean(f13303o.f13227b, false);
    }

    public final boolean j() {
        return this.f13187a.getBoolean(f13304p.f13227b, false);
    }

    public final long a(long j6) {
        return this.f13187a.getLong(f13297h.f13227b, j6);
    }

    public final Ze b(long j6) {
        return (Ze) b(f13297h.f13227b, j6);
    }

    public final Ze c(long j6) {
        return (Ze) b(f13305r.f13227b, j6);
    }

    public final Ze d(boolean z5) {
        return (Ze) b(f13295f.f13227b, z5);
    }

    public final void e(boolean z5) {
        b(f13306s.f13227b, z5).b();
    }

    public final long f() {
        return this.f13187a.getLong(f13305r.f13227b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final String a() {
        return this.f13187a.getString(q.f13227b, null);
    }

    public final Ze b(@NonNull Td td2, int i5) {
        Ye ye2;
        int ordinal = td2.ordinal();
        if (ordinal == 0) {
            ye2 = f13298i;
        } else if (ordinal != 1) {
            ye2 = ordinal != 2 ? null : f13299k;
        } else {
            ye2 = j;
        }
        return ye2 != null ? (Ze) b(ye2.f13227b, i5) : this;
    }

    @Override // io.appmetrica.analytics.impl.Xe
    @NonNull
    public final Set<String> c() {
        return this.f13187a.a();
    }

    public final Boolean d() {
        Ye ye2 = f13296g;
        if (!this.f13187a.a(ye2.f13227b)) {
            return null;
        }
        return Boolean.valueOf(this.f13187a.getBoolean(ye2.f13227b, true));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0630yd
    @NonNull
    public final String f(@NonNull String str) {
        return new Ye(str, null).f13227b;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final void a(@NonNull String str) {
        b(q.f13227b, str).b();
    }

    public final boolean a(boolean z5) {
        return this.f13187a.getBoolean(f13306s.f13227b, z5);
    }

    public final Ze b(@NonNull Td td2, long j6) {
        Ye ye2;
        int ordinal = td2.ordinal();
        if (ordinal == 0) {
            ye2 = f13300l;
        } else if (ordinal != 1) {
            ye2 = ordinal != 2 ? null : f13302n;
        } else {
            ye2 = f13301m;
        }
        return ye2 != null ? (Ze) b(ye2.f13227b, j6) : this;
    }

    public final int a(@NonNull Td td2, int i5) {
        Ye ye2;
        int ordinal = td2.ordinal();
        if (ordinal == 0) {
            ye2 = f13298i;
        } else if (ordinal != 1) {
            ye2 = ordinal != 2 ? null : f13299k;
        } else {
            ye2 = j;
        }
        if (ye2 == null) {
            return i5;
        }
        return this.f13187a.getInt(ye2.f13227b, i5);
    }

    public final long a(@NonNull Td td2, long j6) {
        Ye ye2;
        int ordinal = td2.ordinal();
        if (ordinal == 0) {
            ye2 = f13300l;
        } else if (ordinal != 1) {
            ye2 = ordinal != 2 ? null : f13302n;
        } else {
            ye2 = f13301m;
        }
        if (ye2 == null) {
            return j6;
        }
        return this.f13187a.getLong(ye2.f13227b, j6);
    }
}
