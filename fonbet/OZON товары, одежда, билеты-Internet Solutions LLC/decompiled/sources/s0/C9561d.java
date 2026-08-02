package s0;

import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import w0.InterfaceC10395k;

/* renamed from: s0.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9561d {
    public static final int a(@NotNull InterfaceC10395k interfaceC10395k, @NotNull EnumC9142v enumC9142v) {
        return (int) (enumC9142v == EnumC9142v.Vertical ? interfaceC10395k.h() & 4294967295L : interfaceC10395k.h() >> 32);
    }
}
