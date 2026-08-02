package com.google.firebase.concurrent;

import android.os.StrictMode;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import y8.InterfaceC10861a;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements InterfaceC10861a {
    @Override // y8.InterfaceC10861a
    public final Object get() {
        n8.r<ScheduledExecutorService> rVar = ExecutorsRegistrar.f59497a;
        return new o(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new b("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.f59500d.get());
    }
}
