package kh;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kh.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5259e {
    public static final void a(AbstractC5255a abstractC5255a, ByteBuffer source) {
        Intrinsics.checkNotNullParameter(abstractC5255a, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        ByteBuffer g10 = abstractC5255a.g();
        int j10 = abstractC5255a.j();
        int f10 = abstractC5255a.f() - j10;
        if (f10 < remaining) {
            throw new q("buffer content", remaining, f10);
        }
        ih.d.c(source, g10, j10);
        abstractC5255a.a(remaining);
    }
}
