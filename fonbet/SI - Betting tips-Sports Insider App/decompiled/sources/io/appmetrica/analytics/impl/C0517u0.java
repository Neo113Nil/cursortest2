package io.appmetrica.analytics.impl;

import android.app.Service;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0517u0 implements InterfaceC0643z1 {

    /* renamed from: a, reason: collision with root package name */
    public final Service f14692a;

    public C0517u0(@NotNull Service service) {
        this.f14692a = service;
    }

    public final void a(int i5) {
        this.f14692a.stopSelf(i5);
    }
}
