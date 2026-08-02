package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class L implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f12492b;

    public L(N n9, Context context) {
        this.f12492b = n9;
        this.f12491a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f12492b.f12617a.a(this.f12491a);
    }
}
