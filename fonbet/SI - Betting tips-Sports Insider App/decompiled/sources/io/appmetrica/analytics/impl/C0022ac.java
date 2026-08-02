package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ac, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022ac implements InterfaceC0169g4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0169g4
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0521u4 a(@NotNull Context context, @NotNull C0093d5 c0093d5, @NotNull P3 p32, @NotNull C0397p4 c0397p4) {
        C0596x4 c0596x4;
        C0546v4 c0546v4 = new C0546v4(p32.f12723b);
        C0621y4 c0621y4 = new C0621y4();
        synchronized (c0093d5) {
            c0596x4 = (C0596x4) c0093d5.a(c0546v4, c0397p4, c0621y4, c0093d5.f13563b);
        }
        return new C0521u4(context, c0596x4, c0397p4);
    }
}
