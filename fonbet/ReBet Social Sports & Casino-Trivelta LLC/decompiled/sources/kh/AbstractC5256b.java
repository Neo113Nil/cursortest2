package kh;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kh.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5256b {
    public static final int a(AbstractC5255a abstractC5255a, AbstractC5255a other, int i10) {
        Intrinsics.checkNotNullParameter(abstractC5255a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(other.j() - other.h(), i10);
        if (abstractC5255a.f() - abstractC5255a.j() <= min) {
            b(abstractC5255a, min);
        }
        ByteBuffer g10 = abstractC5255a.g();
        int j10 = abstractC5255a.j();
        abstractC5255a.f();
        ByteBuffer g11 = other.g();
        int h10 = other.h();
        other.j();
        ih.c.c(g11, g10, h10, min, j10);
        other.c(min);
        abstractC5255a.a(min);
        return min;
    }

    public static final void b(AbstractC5255a abstractC5255a, int i10) {
        if ((abstractC5255a.f() - abstractC5255a.j()) + (abstractC5255a.e() - abstractC5255a.f()) < i10) {
            throw new IllegalArgumentException("Can't append buffer: not enough free space at the end");
        }
        if ((abstractC5255a.j() + i10) - abstractC5255a.f() > 0) {
            abstractC5255a.l();
        }
    }
}
