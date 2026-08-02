package r6;

import T7.Y;
import android.content.Context;
import android.content.SharedPreferences;
import g6.C4331C;
import h6.C4478e;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f64044a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final Set f64045b = SetsKt.setOf((Object[]) new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});

    public static final boolean d() {
        if (Y7.a.d(c.class)) {
            return false;
        }
        try {
            if (!C4331C.z(C4331C.l()) && !Y.a0()) {
                if (e.b()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            Y7.a.b(th2, c.class);
            return false;
        }
    }

    public static final void e(final String applicationId, final C4478e event) {
        if (Y7.a.d(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(event, "event");
            if (f64044a.c(event)) {
                C4331C.t().execute(new Runnable() { // from class: r6.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.f(applicationId, event);
                    }
                });
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, c.class);
        }
    }

    public static final void f(String applicationId, C4478e event) {
        if (Y7.a.d(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
            Intrinsics.checkNotNullParameter(event, "$event");
            e eVar = e.f64048a;
            e.c(applicationId, CollectionsKt.listOf(event));
        } catch (Throwable th2) {
            Y7.a.b(th2, c.class);
        }
    }

    public static final void g(final String str, final String str2) {
        if (Y7.a.d(c.class)) {
            return;
        }
        try {
            final Context l10 = C4331C.l();
            if (l10 == null || str == null || str2 == null) {
                return;
            }
            C4331C.t().execute(new Runnable() { // from class: r6.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.h(l10, str2, str);
                }
            });
        } catch (Throwable th2) {
            Y7.a.b(th2, c.class);
        }
    }

    public static final void h(Context context, String str, String str2) {
        if (Y7.a.d(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "$context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            String stringPlus = Intrinsics.stringPlus(str2, "pingForOnDevice");
            if (sharedPreferences.getLong(stringPlus, 0L) == 0) {
                e.e(str2);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(stringPlus, System.currentTimeMillis());
                edit.apply();
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, c.class);
        }
    }

    public final boolean c(C4478e c4478e) {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            return !c4478e.h() || (c4478e.h() && f64045b.contains(c4478e.f()));
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }
}
