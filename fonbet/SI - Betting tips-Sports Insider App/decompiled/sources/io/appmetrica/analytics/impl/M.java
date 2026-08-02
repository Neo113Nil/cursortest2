package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class M implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Gi f12554b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f12555c;

    public M(N n9, Context context, Gi gi2) {
        this.f12555c = n9;
        this.f12553a = context;
        this.f12554b = gi2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f12555c.f12617a.a(this.f12553a, this.f12554b);
    }
}
