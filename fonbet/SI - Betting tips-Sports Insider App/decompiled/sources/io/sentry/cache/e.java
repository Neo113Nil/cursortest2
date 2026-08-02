package io.sentry.cache;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b6;
import io.sentry.u0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final b6 f16249a;

    public e(SentryAndroidOptions sentryAndroidOptions) {
        this.f16249a = sentryAndroidOptions;
    }

    public final void a(String str) {
        a.a(this.f16249a, ".options-cache", str);
    }

    public final void b(Object obj, String str) {
        a.d(this.f16249a, obj, ".options-cache", str);
    }
}
