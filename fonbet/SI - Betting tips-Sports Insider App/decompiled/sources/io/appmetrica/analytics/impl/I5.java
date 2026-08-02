package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class I5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final List f12370a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f12371b = C0353na.k().w().a();

    /* renamed from: c, reason: collision with root package name */
    public final WaitForActivationDelayBarrier f12372c = C0353na.k().a();

    public I5(List list) {
        this.f12370a = list;
    }

    public static final void a(I5 i5) {
        Iterator it = i5.f12370a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12372c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.f12371b, new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(21, this));
    }
}
