package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.lc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305lc implements InterfaceC0169g4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0169g4
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0330mc a(@NotNull Context context, @NotNull C0093d5 c0093d5, @NotNull P3 p32, @NotNull C0397p4 c0397p4) {
        Bg bg2;
        C0355nc c0355nc = new C0355nc(p32.f12723b, p32.f12722a);
        Cg cg2 = new Cg(new C0430qc());
        synchronized (c0093d5) {
            bg2 = (Bg) c0093d5.a(c0355nc, c0397p4, cg2, c0093d5.f13562a);
        }
        return new C0330mc(context, bg2);
    }
}
