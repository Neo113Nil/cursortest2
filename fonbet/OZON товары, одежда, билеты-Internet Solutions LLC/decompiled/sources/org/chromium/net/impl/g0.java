package org.chromium.net.impl;

import Ra.g;
import java.util.concurrent.Executor;
import org.chromium.net.y;

/* loaded from: classes6.dex */
public final class g0 extends y.a {

    /* renamed from: b, reason: collision with root package name */
    private final g.d f78930b;

    public g0(g.d dVar) {
        super(dVar.a());
        this.f78930b = dVar;
    }

    @Override // org.chromium.net.y.a
    public final Executor a() {
        return this.f78930b.a();
    }

    public final void b(a0 a0Var) {
        this.f78930b.b(a0Var);
    }
}
