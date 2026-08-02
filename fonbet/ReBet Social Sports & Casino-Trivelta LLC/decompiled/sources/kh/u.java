package kh;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import jh.AbstractC5135a;
import jh.AbstractC5136b;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import lh.C5466a;

/* loaded from: classes3.dex */
public abstract class u {
    public static final Void a(int i10) {
        throw new EOFException("Premature end of stream: expected " + i10 + " bytes");
    }

    public static final byte[] b(l lVar, int i10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (i10 == 0) {
            return lh.e.EmptyByteArray;
        }
        byte[] bArr = new byte[i10];
        o.a(lVar, bArr, 0, i10);
        return bArr;
    }

    public static /* synthetic */ byte[] c(l lVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            long f22 = lVar.f2();
            if (f22 > 2147483647L) {
                throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
            }
            i10 = (int) f22;
        }
        return b(lVar, i10);
    }

    public static final String d(n nVar, Charset charset, int i10) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        CharsetDecoder newDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(newDecoder, "charset.newDecoder()");
        return AbstractC5136b.a(newDecoder, nVar, i10);
    }

    public static /* synthetic */ String e(n nVar, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return d(nVar, charset, i10);
    }

    public static final String f(n nVar, int i10, Charset charset) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        CharsetDecoder newDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(newDecoder, "charset.newDecoder()");
        return AbstractC5135a.b(newDecoder, nVar, i10);
    }

    public static /* synthetic */ String g(n nVar, int i10, Charset charset, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        return f(nVar, i10, charset);
    }

    public static final void h(r rVar, CharSequence text, int i10, int i11, Charset charset) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (charset == Charsets.UTF_8) {
            j(rVar, text, i10, i11);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        Intrinsics.checkNotNullExpressionValue(newEncoder, "charset.newEncoder()");
        AbstractC5136b.f(newEncoder, rVar, text, i10, i11);
    }

    public static /* synthetic */ void i(r rVar, CharSequence charSequence, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        if ((i12 & 8) != 0) {
            charset = Charsets.UTF_8;
        }
        h(rVar, charSequence, i10, i11, charset);
    }

    public static final void j(r rVar, CharSequence charSequence, int i10, int i11) {
        C5466a d10 = lh.e.d(rVar, 1, null);
        int i12 = i10;
        while (true) {
            try {
                CharSequence charSequence2 = charSequence;
                int i13 = i11;
                int b10 = lh.d.b(d10.g(), charSequence2, i12, i13, d10.j(), d10.f());
                short a10 = lh.b.a(b10);
                short b11 = lh.b.b(b10);
                int i14 = a10 & UShort.MAX_VALUE;
                i12 += i14;
                d10.a(b11 & UShort.MAX_VALUE);
                int i15 = (i14 != 0 || i12 >= i13) ? i12 < i13 ? 1 : 0 : 8;
                if (i15 <= 0) {
                    return;
                }
                d10 = lh.e.d(rVar, i15, d10);
                charSequence = charSequence2;
                i11 = i13;
            } finally {
                rVar.d();
            }
        }
    }
}
