package com.google.firebase.messaging;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.l;
import m3.r;
import n8.InterfaceC8452b;
import u3.InterfaceC9928b;

/* renamed from: com.google.firebase.messaging.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5939u implements n8.e, l.a, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f59741a;

    @Override // n8.e
    public Object a(InterfaceC8452b interfaceC8452b) {
        FirebaseMessaging lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0((n8.w) this.f59741a, interfaceC8452b);
        return lambda$getComponents$0;
    }

    @Override // io.sentry.util.l.a
    public Object g() {
        return Boolean.valueOf(io.sentry.util.m.a((SentryAndroidOptions) this.f59741a, "androidx.core.view.ScrollingView"));
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }

    public /* synthetic */ C5939u(n8.w wVar) {
        this.f59741a = wVar;
    }

    public /* synthetic */ C5939u(InterfaceC9928b.a aVar, Object obj, long j11) {
        this.f59741a = obj;
    }
}
