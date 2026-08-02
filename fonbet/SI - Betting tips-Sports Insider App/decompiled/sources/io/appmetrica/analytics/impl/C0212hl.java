package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212hl implements so {

    /* renamed from: a, reason: collision with root package name */
    public final C0642z0 f13904a;

    public C0212hl(@NonNull C0642z0 c0642z0) {
        this.f13904a = c0642z0;
    }

    @Override // io.appmetrica.analytics.impl.so
    public final qo a(Void r32) {
        this.f13904a.getClass();
        return C0642z0.a() ? new qo(this, true, "") : new qo(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final qo a() {
        return a((Void) null);
    }
}
