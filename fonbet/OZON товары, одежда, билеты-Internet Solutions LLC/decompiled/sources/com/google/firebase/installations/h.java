package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final long f59578b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f59579c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    private static h f59580d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f59581e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final D8.a f59582a;

    private h(D8.a aVar) {
        this.f59582a = aVar;
    }

    public static h b() {
        D8.a a11 = D8.a.a();
        if (f59580d == null) {
            f59580d = new h(a11);
        }
        return f59580d;
    }

    static boolean d(String str) {
        return f59579c.matcher(str).matches();
    }

    public final long a() {
        this.f59582a.getClass();
        return System.currentTimeMillis();
    }

    public final boolean c(@NonNull B8.d dVar) {
        if (TextUtils.isEmpty(dVar.a())) {
            return true;
        }
        return dVar.b() + dVar.g() < TimeUnit.MILLISECONDS.toSeconds(a()) + f59578b;
    }
}
