package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class E5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0367o f12182a;

    /* renamed from: b, reason: collision with root package name */
    public final IReporter f12183b;

    /* renamed from: c, reason: collision with root package name */
    public Context f12184c;

    /* renamed from: d, reason: collision with root package name */
    public final D5 f12185d;

    public E5(C0367o c0367o) {
        this(c0367o, 0);
    }

    public final synchronized void a(Context context) {
        if (this.f12184c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f12182a.a(applicationContext);
            this.f12182a.registerListener(this.f12185d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.f12184c = applicationContext;
        }
    }

    public E5(C0367o c0367o, IReporter iReporter) {
        this.f12182a = c0367o;
        this.f12183b = iReporter;
        this.f12185d = new D5(this);
    }

    public /* synthetic */ E5(C0367o c0367o, int i5) {
        this(c0367o, AbstractC0593x1.a());
    }

    public final synchronized Context a() {
        return this.f12184c;
    }
}
