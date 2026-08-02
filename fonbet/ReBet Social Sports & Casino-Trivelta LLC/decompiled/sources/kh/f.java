package kh;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class f {
    public static final void a(AbstractC5255a abstractC5255a, byte[] destination, int i10, int i11) {
        Intrinsics.checkNotNullParameter(abstractC5255a, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ByteBuffer g10 = abstractC5255a.g();
        int h10 = abstractC5255a.h();
        if (abstractC5255a.j() - h10 >= i11) {
            ih.d.b(g10, destination, h10, i11, i10);
            Unit unit = Unit.INSTANCE;
            abstractC5255a.c(i11);
        } else {
            throw new EOFException("Not enough bytes to read a byte array of size " + i11 + '.');
        }
    }

    public static final short b(AbstractC5255a abstractC5255a) {
        Intrinsics.checkNotNullParameter(abstractC5255a, "<this>");
        ByteBuffer g10 = abstractC5255a.g();
        int h10 = abstractC5255a.h();
        if (abstractC5255a.j() - h10 >= 2) {
            Short valueOf = Short.valueOf(g10.getShort(h10));
            abstractC5255a.c(2);
            return valueOf.shortValue();
        }
        throw new EOFException("Not enough bytes to read a short integer of size 2.");
    }

    public static final void c(AbstractC5255a abstractC5255a, byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(abstractC5255a, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer g10 = abstractC5255a.g();
        int j10 = abstractC5255a.j();
        int f10 = abstractC5255a.f() - j10;
        if (f10 < i11) {
            throw new q("byte array", i11, f10);
        }
        ByteBuffer order = ByteBuffer.wrap(source, i10, i11).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(order, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        ih.c.c(ih.c.b(order), g10, 0, i11, j10);
        abstractC5255a.a(i11);
    }

    public static final void d(AbstractC5255a abstractC5255a, short s10) {
        Intrinsics.checkNotNullParameter(abstractC5255a, "<this>");
        ByteBuffer g10 = abstractC5255a.g();
        int j10 = abstractC5255a.j();
        int f10 = abstractC5255a.f() - j10;
        if (f10 < 2) {
            throw new q("short integer", 2, f10);
        }
        g10.putShort(j10, s10);
        abstractC5255a.a(2);
    }
}
