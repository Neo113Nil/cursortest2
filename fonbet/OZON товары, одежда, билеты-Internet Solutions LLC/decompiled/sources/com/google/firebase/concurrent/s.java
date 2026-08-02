package com.google.firebase.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import y8.InterfaceC10861a;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements InterfaceC10861a {
    @Override // y8.InterfaceC10861a
    public final Object get() {
        n8.r<ScheduledExecutorService> rVar = ExecutorsRegistrar.f59497a;
        return new o(Executors.newCachedThreadPool(new b("Firebase Blocking", 11, null)), ExecutorsRegistrar.f59500d.get());
    }
}
