package io.sentry.android.core;

import android.content.Context;
import io.sentry.K1;
import io.sentry.W2;

/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements K1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C7113n f67270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f67271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K1.a f67272c;

    public /* synthetic */ j0(C7113n c7113n, Context context, K1.a aVar) {
        this.f67270a = c7113n;
        this.f67271b = context;
        this.f67272c = aVar;
    }

    @Override // io.sentry.K1.a
    public final void a(W2 w22) {
        k0.a(this.f67270a, this.f67271b, this.f67272c, (SentryAndroidOptions) w22);
    }
}
