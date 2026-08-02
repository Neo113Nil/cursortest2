package com.google.firebase.messaging;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements a9.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6160a;

    public /* synthetic */ n(int i5) {
        this.f6160a = i5;
    }

    @Override // a9.a
    public final Object get() {
        switch (this.f6160a) {
            case 0:
                h9.c cVar = FirebaseMessaging.f6059l;
                return null;
            case 1:
                Random random = i9.i.j;
                return null;
            case 2:
                return Collections.EMPTY_SET;
            case 3:
                return null;
            case 4:
                return ExecutorsRegistrar.a();
            case 5:
                o8.l lVar = ExecutorsRegistrar.f6054a;
                return new p8.e(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new p8.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f6057d.get());
            case 6:
                o8.l lVar2 = ExecutorsRegistrar.f6054a;
                return new p8.e(Executors.newCachedThreadPool(new p8.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f6057d.get());
            default:
                o8.l lVar3 = ExecutorsRegistrar.f6054a;
                return Executors.newSingleThreadScheduledExecutor(new p8.a("Firebase Scheduler", 0, null));
        }
    }
}
