package io.sentry.android.core;

import io.sentry.b5;
import io.sentry.k1;
import io.sentry.r3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements r3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15571c;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3) {
        this.f15569a = obj;
        this.f15570b = obj2;
        this.f15571c = obj3;
    }

    @Override // io.sentry.r3
    public void b(k1 k1Var) {
        ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) this.f15569a;
        io.sentry.z0 z0Var = (io.sentry.z0) this.f15570b;
        k1 k1Var2 = (k1) this.f15571c;
        if (k1Var == null) {
            z0Var.M(k1Var2);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f15451d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(b5.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", k1Var2.getName());
        }
    }
}
