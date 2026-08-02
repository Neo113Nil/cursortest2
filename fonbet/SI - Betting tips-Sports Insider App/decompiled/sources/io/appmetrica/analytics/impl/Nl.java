package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Nl implements A6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f12661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ol f12662b;

    public Nl(Ol ol, StartupParamsCallback startupParamsCallback) {
        this.f12662b = ol;
        this.f12661a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.A6
    public final void a(int i5, Bundle bundle) {
        this.f12662b.b(bundle, this.f12661a);
    }
}
