package com.google.firebase.concurrent;

import android.os.StrictMode;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import y8.InterfaceC10861a;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements InterfaceC10861a {
    @Override // y8.InterfaceC10861a
    public final Object get() {
        n8.r<ScheduledExecutorService> rVar = ExecutorsRegistrar.f59497a;
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        detectNetwork.detectResourceMismatches();
        detectNetwork.detectUnbufferedIo();
        return new o(Executors.newFixedThreadPool(4, new b("Firebase Background", 10, detectNetwork.penaltyLog().build())), ExecutorsRegistrar.f59500d.get());
    }
}
