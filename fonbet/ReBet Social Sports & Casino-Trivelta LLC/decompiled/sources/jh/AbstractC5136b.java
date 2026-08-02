package jh;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kh.k;
import kh.l;
import kh.n;
import kh.r;
import kotlin.jvm.internal.Intrinsics;
import lh.C5466a;
import lh.e;

/* renamed from: jh.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5136b {
    public static final String a(CharsetDecoder charsetDecoder, n input, int i10) {
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i10, g(input)));
        AbstractC5135a.a(charsetDecoder, input, sb2, i10);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public static /* synthetic */ String b(CharsetDecoder charsetDecoder, n nVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return a(charsetDecoder, nVar, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final l c(CharsetEncoder charsetEncoder, CharSequence input, int i10, int i11) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        k kVar = new k(null, 1, 0 == true ? 1 : 0);
        try {
            f(charsetEncoder, kVar, input, i10, i11);
            return kVar.h2();
        } catch (Throwable th2) {
            kVar.b2();
            throw th2;
        }
    }

    public static /* synthetic */ l d(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return c(charsetEncoder, charSequence, i10, i11);
    }

    public static final int e(CharsetEncoder charsetEncoder, r rVar) {
        C5466a d10 = e.d(rVar, 1, null);
        int i10 = 1;
        int i11 = 0;
        while (true) {
            try {
                int f10 = d10.f() - d10.j();
                i10 = AbstractC5135a.e(charsetEncoder, d10) ? 0 : i10 + 1;
                i11 += f10 - (d10.f() - d10.j());
                if (i10 <= 0) {
                    return i11;
                }
                d10 = e.d(rVar, 1, d10);
            } finally {
                rVar.d();
            }
        }
    }

    public static final int f(CharsetEncoder charsetEncoder, r destination, CharSequence input, int i10, int i11) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(input, "input");
        if (i10 >= i11) {
            return 0;
        }
        C5466a d10 = e.d(destination, 1, null);
        int i12 = 0;
        while (true) {
            try {
                int f10 = d10.f() - d10.j();
                int f11 = AbstractC5135a.f(charsetEncoder, input, i10, i11, d10);
                if (f11 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                i10 += f11;
                i12 += f10 - (d10.f() - d10.j());
                int i13 = i10 >= i11 ? 0 : f11 == 0 ? 8 : 1;
                if (i13 <= 0) {
                    destination.d();
                    return i12 + e(charsetEncoder, destination);
                }
                d10 = e.d(destination, i13, d10);
            } catch (Throwable th2) {
                destination.d();
                throw th2;
            }
        }
    }

    public static final long g(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return nVar instanceof l ? nVar.f2() : Math.max(nVar.f2(), 16L);
    }
}
