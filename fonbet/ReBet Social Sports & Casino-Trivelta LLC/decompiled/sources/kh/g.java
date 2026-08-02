package kh;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class g {
    public static final void a(AbstractC5255a abstractC5255a, ByteBuffer dst, int i10) {
        Intrinsics.checkNotNullParameter(abstractC5255a, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        ByteBuffer g10 = abstractC5255a.g();
        int h10 = abstractC5255a.h();
        if (abstractC5255a.j() - h10 < i10) {
            throw new EOFException("Not enough bytes to read a buffer content of size " + i10 + '.');
        }
        int limit = dst.limit();
        try {
            dst.limit(dst.position() + i10);
            ih.d.a(g10, dst, h10);
            dst.limit(limit);
            Unit unit = Unit.INSTANCE;
            abstractC5255a.c(i10);
        } catch (Throwable th2) {
            dst.limit(limit);
            throw th2;
        }
    }
}
