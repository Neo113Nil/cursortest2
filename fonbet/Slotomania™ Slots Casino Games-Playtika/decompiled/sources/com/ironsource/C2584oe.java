package com.ironsource;

import com.ironsource.H8;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.oe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2584oe implements H8, H8.a {
    private C2566ne a;
    private boolean b;

    @Override // com.ironsource.H8
    public Ua a() {
        C2566ne c2566ne = this.a;
        if (c2566ne != null) {
            return new Ua(c2566ne);
        }
        return null;
    }

    @Override // com.ironsource.H8
    public L9 b() {
        C2566ne c2566ne = this.a;
        if (c2566ne != null) {
            return new L9(c2566ne);
        }
        return null;
    }

    @Override // com.ironsource.H8
    public boolean c() {
        return this.b;
    }

    @Override // com.ironsource.H8.a
    public void d() {
        this.b = true;
    }

    @Override // com.ironsource.H8.a
    public void a(C2566ne sdkConfig) {
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        this.a = sdkConfig;
    }
}
