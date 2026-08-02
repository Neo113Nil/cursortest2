package io.sentry.android.core.performance;

import android.os.Looper;
import io.sentry.i1;
import io.sentry.k4;
import io.sentry.p1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f15790a;

    /* renamed from: b, reason: collision with root package name */
    public k4 f15791b = null;

    /* renamed from: c, reason: collision with root package name */
    public k4 f15792c = null;

    /* renamed from: d, reason: collision with root package name */
    public i1 f15793d = null;

    /* renamed from: e, reason: collision with root package name */
    public i1 f15794e = null;

    public b(String str) {
        this.f15790a = str;
    }

    public static i1 a(i1 i1Var, String str, k4 k4Var) {
        i1 k6 = i1Var.k("activity.load", str, k4Var, p1.SENTRY);
        k6.m(Long.valueOf(Looper.getMainLooper().getThread().getId()), "thread.id");
        k6.m("main", "thread.name");
        Boolean bool = Boolean.TRUE;
        k6.m(bool, "ui.contributes_to_ttid");
        k6.m(bool, "ui.contributes_to_ttfd");
        return k6;
    }
}
