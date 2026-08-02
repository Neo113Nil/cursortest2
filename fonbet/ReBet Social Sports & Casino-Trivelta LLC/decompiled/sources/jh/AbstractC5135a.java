package jh;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import kh.AbstractC5255a;
import kh.n;
import kotlin.jvm.internal.Intrinsics;
import lh.C5466a;
import lh.e;

/* renamed from: jh.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5135a {

    /* renamed from: a, reason: collision with root package name */
    public static final CharBuffer f53978a = CharBuffer.allocate(0);

    /* renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f53979b;

    static {
        ByteBuffer allocate = ByteBuffer.allocate(0);
        Intrinsics.checkNotNull(allocate);
        f53979b = allocate;
    }

    public static final int a(CharsetDecoder charsetDecoder, n input, Appendable dst, int i10) {
        CoderResult cr;
        C5466a c10;
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        CharBuffer allocate = CharBuffer.allocate(8192);
        boolean z10 = true;
        C5466a b10 = e.b(input, 1);
        int i11 = 0;
        if (b10 != null) {
            int i12 = 1;
            int i13 = 1;
            int i14 = 0;
            while (true) {
                try {
                    int j10 = b10.j() - b10.h();
                    if (j10 >= i12) {
                        int i15 = i10 - i14;
                        if (i15 == 0) {
                            i12 = 0;
                        } else {
                            try {
                                ByteBuffer g10 = b10.g();
                                int h10 = b10.h();
                                int j11 = b10.j() - h10;
                                ByteBuffer d10 = ih.c.d(g10, h10, j11);
                                allocate.clear();
                                if (i15 < 8192) {
                                    allocate.limit(i15);
                                }
                                CoderResult rc2 = charsetDecoder.decode(d10, allocate, false);
                                allocate.flip();
                                i14 += allocate.remaining();
                                dst.append(allocate);
                                if (rc2.isMalformed() || rc2.isUnmappable()) {
                                    Intrinsics.checkNotNullExpressionValue(rc2, "rc");
                                    j(rc2);
                                }
                                i13 = (rc2.isUnderflow() && d10.hasRemaining()) ? i13 + 1 : 1;
                                if (d10.limit() != j11) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed");
                                }
                                b10.c(d10.position());
                                i12 = i13;
                            } finally {
                                b10.j();
                                b10.h();
                            }
                        }
                        j10 = b10.j() - b10.h();
                    }
                    if (j10 == 0) {
                        try {
                            c10 = e.c(input, b10);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            if (z10) {
                                e.a(input, b10);
                            }
                            throw th;
                        }
                    } else {
                        if (j10 >= i12 && b10.e() - b10.f() >= 8) {
                            c10 = b10;
                        }
                        e.a(input, b10);
                        c10 = e.b(input, i12);
                    }
                    if (c10 == null) {
                        break;
                    }
                    if (i12 <= 0) {
                        i11 = 1;
                        b10 = c10;
                        break;
                    }
                    b10 = c10;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (i11 != 0) {
                e.a(input, b10);
            }
            i11 = i14;
        }
        do {
            allocate.clear();
            int i16 = i10 - i11;
            if (i16 == 0) {
                break;
            }
            if (i16 < 8192) {
                allocate.limit(i16);
            }
            cr = charsetDecoder.decode(f53979b, allocate, true);
            allocate.flip();
            i11 += allocate.remaining();
            dst.append(allocate);
            if (cr.isUnmappable() || cr.isMalformed()) {
                Intrinsics.checkNotNullExpressionValue(cr, "cr");
                j(cr);
            }
        } while (cr.isOverflow());
        return i11;
    }

    public static final String b(CharsetDecoder charsetDecoder, n input, int i10) {
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        if (i10 == 0) {
            return "";
        }
        if (input.c2() - input.e2() < i10) {
            return d(charsetDecoder, input, i10);
        }
        if (!input.d2().hasArray()) {
            return c(charsetDecoder, input, i10);
        }
        ByteBuffer d22 = input.d2();
        byte[] array = d22.array();
        Intrinsics.checkNotNullExpressionValue(array, "bb.array()");
        int arrayOffset = d22.arrayOffset() + d22.position() + input.b2().h();
        Charset charset = charsetDecoder.charset();
        Intrinsics.checkNotNullExpressionValue(charset, "charset()");
        String str = new String(array, arrayOffset, i10, charset);
        input.z0(i10);
        return str;
    }

    public static final String c(CharsetDecoder charsetDecoder, n nVar, int i10) {
        CharBuffer allocate = CharBuffer.allocate(i10);
        ByteBuffer d10 = ih.c.d(nVar.d2(), nVar.b2().h(), i10);
        CoderResult rc2 = charsetDecoder.decode(d10, allocate, true);
        if (rc2.isMalformed() || rc2.isUnmappable()) {
            Intrinsics.checkNotNullExpressionValue(rc2, "rc");
            j(rc2);
        }
        allocate.flip();
        nVar.z0(d10.position());
        String charBuffer = allocate.toString();
        Intrinsics.checkNotNullExpressionValue(charBuffer, "cb.toString()");
        return charBuffer;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String d(CharsetDecoder charsetDecoder, n nVar, int i10) {
        int i11;
        C5466a c10;
        CharBuffer allocate = CharBuffer.allocate(i10);
        boolean z10 = true;
        C5466a b10 = e.b(nVar, 1);
        boolean z11 = false;
        if (b10 == null) {
            i11 = i10;
        } else {
            i11 = i10;
            int i12 = 1;
            int i13 = 1;
            boolean z12 = false;
            while (true) {
                try {
                    int j10 = b10.j() - b10.h();
                    if (j10 >= i12) {
                        try {
                            if (allocate.hasRemaining() && i11 != 0) {
                                ByteBuffer g10 = b10.g();
                                int h10 = b10.h();
                                int j11 = b10.j() - h10;
                                ByteBuffer d10 = ih.c.d(g10, h10, j11);
                                int limit = d10.limit();
                                int position = d10.position();
                                boolean z13 = limit - position >= i11;
                                if (z13) {
                                    d10.limit(position + i11);
                                }
                                CoderResult rc2 = charsetDecoder.decode(d10, allocate, z13);
                                if (rc2.isMalformed() || rc2.isUnmappable()) {
                                    Intrinsics.checkNotNullExpressionValue(rc2, "rc");
                                    j(rc2);
                                }
                                i13 = (rc2.isUnderflow() && d10.hasRemaining()) ? i13 + 1 : 1;
                                d10.limit(limit);
                                i11 -= d10.position() - position;
                                if (d10.limit() != j11) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed");
                                }
                                b10.c(d10.position());
                                i12 = i13;
                                z12 = z13;
                                j10 = b10.j() - b10.h();
                            }
                            i12 = 0;
                            j10 = b10.j() - b10.h();
                        } catch (Throwable th2) {
                            b10.j();
                            b10.h();
                            throw th2;
                        }
                    }
                    if (j10 == 0) {
                        try {
                            c10 = e.c(nVar, b10);
                        } catch (Throwable th3) {
                            th = th3;
                            z10 = false;
                            if (z10) {
                            }
                            throw th;
                        }
                    } else {
                        if (j10 >= i12 && b10.e() - b10.f() >= 8) {
                            c10 = b10;
                        }
                        e.a(nVar, b10);
                        c10 = e.b(nVar, i12);
                    }
                    if (c10 == null) {
                        break;
                    }
                    if (i12 <= 0) {
                        z11 = true;
                        b10 = c10;
                        break;
                    }
                    b10 = c10;
                } catch (Throwable th4) {
                    th = th4;
                    if (z10) {
                        e.a(nVar, b10);
                    }
                    throw th;
                }
            }
            if (z11) {
                e.a(nVar, b10);
            }
            z11 = z12;
        }
        if (allocate.hasRemaining() && !z11) {
            CoderResult rc3 = charsetDecoder.decode(f53979b, allocate, true);
            if (rc3.isMalformed() || rc3.isUnmappable()) {
                Intrinsics.checkNotNullExpressionValue(rc3, "rc");
                j(rc3);
            }
        }
        if (i11 <= 0) {
            if (i11 < 0) {
                throw new AssertionError("remainingInputBytes < 0");
            }
            allocate.flip();
            String charBuffer = allocate.toString();
            Intrinsics.checkNotNullExpressionValue(charBuffer, "cb.toString()");
            return charBuffer;
        }
        throw new EOFException("Not enough bytes available: had only " + (i10 - i11) + " instead of " + i10);
    }

    public static final boolean e(CharsetEncoder charsetEncoder, AbstractC5255a dst) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        ByteBuffer g10 = dst.g();
        int j10 = dst.j();
        int f10 = dst.f() - j10;
        ByteBuffer d10 = ih.c.d(g10, j10, f10);
        CoderResult result = charsetEncoder.encode(f53978a, d10, true);
        if (result.isMalformed() || result.isUnmappable()) {
            Intrinsics.checkNotNullExpressionValue(result, "result");
            j(result);
        }
        boolean isUnderflow = result.isUnderflow();
        if (d10.limit() != f10) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        dst.a(d10.position());
        return isUnderflow;
    }

    public static final int f(CharsetEncoder charsetEncoder, CharSequence input, int i10, int i11, AbstractC5255a dst) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        CharBuffer wrap = CharBuffer.wrap(input, i10, i11);
        int remaining = wrap.remaining();
        ByteBuffer g10 = dst.g();
        int j10 = dst.j();
        int f10 = dst.f() - j10;
        ByteBuffer d10 = ih.c.d(g10, j10, f10);
        CoderResult result = charsetEncoder.encode(wrap, d10, false);
        if (result.isMalformed() || result.isUnmappable()) {
            Intrinsics.checkNotNullExpressionValue(result, "result");
            j(result);
        }
        if (d10.limit() != f10) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        dst.a(d10.position());
        return remaining - wrap.remaining();
    }

    public static final byte[] g(CharsetEncoder charsetEncoder, CharSequence input, int i10, int i11) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        if (!(input instanceof String)) {
            return h(charsetEncoder, input, i10, i11);
        }
        if (i10 == 0 && i11 == input.length()) {
            byte[] bytes = ((String) input).getBytes(charsetEncoder.charset());
            Intrinsics.checkNotNullExpressionValue(bytes, "input as java.lang.String).getBytes(charset())");
            return bytes;
        }
        String substring = ((String) input).substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes2 = substring.getBytes(charsetEncoder.charset());
        Intrinsics.checkNotNullExpressionValue(bytes2, "input.substring(fromInde…ring).getBytes(charset())");
        return bytes2;
    }

    public static final byte[] h(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11) {
        ByteBuffer encode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i10, i11));
        byte[] bArr = null;
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            byte[] array = encode.array();
            if (array.length == encode.remaining()) {
                bArr = array;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[encode.remaining()];
        encode.get(bArr2);
        return bArr2;
    }

    public static final String i(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<this>");
        String name = charset.name();
        Intrinsics.checkNotNullExpressionValue(name, "name()");
        return name;
    }

    public static final void j(CoderResult coderResult) {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new c(message);
        }
    }
}
