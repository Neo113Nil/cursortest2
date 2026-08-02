package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzee;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FirebaseAnalytics f59489a;

    b(FirebaseAnalytics firebaseAnalytics) {
        this.f59489a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzee zzeeVar;
        zzeeVar = this.f59489a.f59487a;
        return zzeeVar.zzk();
    }
}
