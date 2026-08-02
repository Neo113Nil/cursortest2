package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ch implements InterfaceC0169g4 {

    /* renamed from: a, reason: collision with root package name */
    public final Y4 f12110a;

    public Ch(@NotNull Y4 y42) {
        this.f12110a = y42;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0169g4
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Ag a(@NotNull Context context, @NotNull C0093d5 c0093d5, @NotNull P3 p32, @NotNull C0397p4 c0397p4) {
        Bg bg2;
        Q4 q42 = new Q4(p32.f12723b, p32.f12722a);
        Cg cg2 = new Cg(this.f12110a);
        synchronized (c0093d5) {
            bg2 = (Bg) c0093d5.a(q42, c0397p4, cg2, c0093d5.f13562a);
        }
        return new Ag(context, bg2);
    }
}
