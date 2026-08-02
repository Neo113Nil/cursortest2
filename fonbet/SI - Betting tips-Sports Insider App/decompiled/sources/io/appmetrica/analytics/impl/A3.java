package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class A3 extends R7 {
    @Override // io.appmetrica.analytics.impl.R7
    public final boolean a(@NotNull C0445r3 c0445r3, @NotNull C0445r3 c0445r32) {
        if (lo.a(c0445r32.f14541a)) {
            return true;
        }
        if (lo.a(c0445r3.f14541a)) {
            return false;
        }
        S7 s72 = c0445r3.f14542b;
        if (s72 == S7.f12862c) {
            if (((Number) this.f12807a.a(s72)).intValue() >= ((Number) this.f12807a.a(c0445r32.f14542b)).intValue()) {
                return true;
            }
        } else if (((Number) this.f12807a.a(s72)).intValue() > ((Number) this.f12807a.a(c0445r32.f14542b)).intValue()) {
            return true;
        }
        return false;
    }
}
