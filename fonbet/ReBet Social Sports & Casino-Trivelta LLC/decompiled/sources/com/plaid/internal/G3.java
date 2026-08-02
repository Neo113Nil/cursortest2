package com.plaid.internal;

import android.content.res.Resources;

/* loaded from: classes3.dex */
public final class G3 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3716p3 f39258a;

    public G3(C3716p3 c3716p3) {
        this.f39258a = c3716p3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new F3((Resources) this.f39258a.get());
    }
}
