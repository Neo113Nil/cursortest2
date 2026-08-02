package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.mlkit.common.sdkinternal.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5945a {

    /* renamed from: a, reason: collision with root package name */
    private final ReferenceQueue f60027a = new ReferenceQueue();

    /* renamed from: b, reason: collision with root package name */
    private final Set f60028b = Collections.synchronizedSet(new HashSet());

    private C5945a() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.mlkit.common.sdkinternal.o] */
    @NonNull
    @KeepForSdk
    public static C5945a a() {
        C5945a c5945a = new C5945a();
        ?? r12 = new Runnable() { // from class: com.google.mlkit.common.sdkinternal.o
            @Override // java.lang.Runnable
            public final void run() {
            }
        };
        final ReferenceQueue referenceQueue = c5945a.f60027a;
        final Set set = c5945a.f60028b;
        set.add(new q(c5945a, referenceQueue, set, r12));
        Thread thread = new Thread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.p
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((q) referenceQueue2.remove()).a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c5945a;
    }
}
