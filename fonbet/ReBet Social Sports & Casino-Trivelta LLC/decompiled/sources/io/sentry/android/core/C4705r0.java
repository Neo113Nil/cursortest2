package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: io.sentry.android.core.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4705r0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C4705r0 f51278b = new C4705r0();

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f51279a;

    public static C4705r0 c() {
        return f51278b;
    }

    public void a(Activity activity) {
        WeakReference weakReference = this.f51279a;
        if (weakReference == null || weakReference.get() == activity) {
            this.f51279a = null;
        }
    }

    public Activity b() {
        WeakReference weakReference = this.f51279a;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public void d(Activity activity) {
        WeakReference weakReference = this.f51279a;
        if (weakReference == null || weakReference.get() != activity) {
            this.f51279a = new WeakReference(activity);
        }
    }
}
