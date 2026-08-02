package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.sentry.W2;
import io.sentry.util.l;
import j3.y;
import java.util.concurrent.ScheduledFuture;
import m3.r;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements OnCompleteListener, l.a, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f59697a;

    public /* synthetic */ b0(Object obj) {
        this.f59697a = obj;
    }

    @Override // io.sentry.util.l.a
    public Object g() {
        io.sentry.M lambda$new$2;
        lambda$new$2 = ((W2) this.f59697a).lambda$new$2();
        return lambda$new$2;
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((y.c) obj).e0((j3.s) this.f59697a);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((ScheduledFuture) this.f59697a).cancel(false);
    }
}
