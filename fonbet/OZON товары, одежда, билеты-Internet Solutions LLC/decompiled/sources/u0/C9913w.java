package u0;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: u0.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9913w {
    public static long a(long j11, @NotNull EnumC9910t enumC9910t) {
        EnumC9910t enumC9910t2 = EnumC9910t.Horizontal;
        return Z1.c.a(enumC9910t == enumC9910t2 ? Z1.b.m(j11) : Z1.b.l(j11), enumC9910t == enumC9910t2 ? Z1.b.k(j11) : Z1.b.j(j11), enumC9910t == enumC9910t2 ? Z1.b.l(j11) : Z1.b.m(j11), enumC9910t == enumC9910t2 ? Z1.b.j(j11) : Z1.b.k(j11));
    }

    public static long b(int i11, long j11) {
        return Z1.c.a(0, Z1.b.k(j11), (i11 & 4) != 0 ? Z1.b.l(j11) : 0, Z1.b.j(j11));
    }

    public static final long c(long j11, @NotNull EnumC9910t enumC9910t) {
        return enumC9910t == EnumC9910t.Horizontal ? Z1.c.a(Z1.b.m(j11), Z1.b.k(j11), Z1.b.l(j11), Z1.b.j(j11)) : Z1.c.a(Z1.b.l(j11), Z1.b.j(j11), Z1.b.m(j11), Z1.b.k(j11));
    }
}
