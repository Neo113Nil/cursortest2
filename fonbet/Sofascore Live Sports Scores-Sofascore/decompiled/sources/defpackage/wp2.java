package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wp2 {
    public final InputStream a;
    public final CharsetDecoder b;
    public final ByteBuffer c;
    public boolean d;
    public char e;

    public wp2(InputStream inputStream, Charset charset) {
        byte[] bArr;
        charset.getClass();
        this.a = inputStream;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        onUnmappableCharacter.getClass();
        this.b = onUnmappableCharacter;
        t92 t92Var = t92.c;
        synchronized (t92Var) {
            vg0 vg0Var = t92Var.a;
            bArr = null;
            byte[] bArr2 = (byte[]) (vg0Var.isEmpty() ? null : vg0Var.removeLast());
            if (bArr2 != null) {
                t92Var.b -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr == null ? new byte[8196] : bArr);
        wrap.getClass();
        this.c = wrap;
        wrap.flip();
    }

    public final int a(char[] cArr, int i, int i2) {
        int i3;
        CharsetDecoder charsetDecoder;
        char c;
        if (i2 == 0) {
            return 0;
        }
        if (i < 0 || i >= cArr.length || i2 < 0 || i + i2 > cArr.length) {
            ogj.e(cArr.length, lnb.s(i, i2, "Unexpected arguments: ", ", ", ", "));
            return 0;
        }
        boolean z = this.d;
        boolean z2 = true;
        if (z) {
            cArr[i] = this.e;
            i++;
            i2--;
            this.d = false;
            if (i2 == 0) {
                return 1;
            }
            z = false;
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 == 1) {
            if (z) {
                this.d = false;
                c = this.e;
            } else {
                char[] cArr2 = new char[2];
                int a = a(cArr2, 0, 2);
                if (a == -1) {
                    c = 65535;
                } else if (a == 1) {
                    c = cArr2[0];
                } else {
                    if (a != 2) {
                        pvd.l(a, "Unreachable state: ");
                        return 0;
                    }
                    this.e = cArr2[1];
                    this.d = true;
                    c = cArr2[0];
                }
            }
            if (c != 65535) {
                cArr[i] = c;
                return i3 + 1;
            }
            if (i3 == 0) {
                return -1;
            }
            return i3;
        }
        CharBuffer wrap = CharBuffer.wrap(cArr, i, i2);
        if (wrap.position() != 0) {
            wrap = wrap.slice();
        }
        CharBuffer charBuffer = wrap;
        boolean z3 = false;
        while (true) {
            charsetDecoder = this.b;
            ByteBuffer byteBuffer = this.c;
            CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z3);
            if (decode.isUnderflow()) {
                if (z3 || !charBuffer.hasRemaining()) {
                    break;
                }
                byteBuffer.compact();
                try {
                    int limit = byteBuffer.limit();
                    int position = byteBuffer.position();
                    int read = this.a.read(byteBuffer.array(), byteBuffer.arrayOffset() + position, position <= limit ? limit - position : 0);
                    if (read >= 0) {
                        byteBuffer.position(position + read);
                        byteBuffer.flip();
                        read = byteBuffer.remaining();
                    }
                    if (read < 0) {
                        if (charBuffer.position() == 0 && !byteBuffer.hasRemaining()) {
                            break;
                        }
                        charsetDecoder.reset();
                        z3 = true;
                    } else {
                        continue;
                    }
                } finally {
                    byteBuffer.flip();
                }
            } else {
                if (decode.isOverflow()) {
                    charBuffer.position();
                    break;
                }
                decode.throwException();
            }
        }
        z2 = z3;
        if (z2) {
            charsetDecoder.reset();
        }
        return (charBuffer.position() != 0 ? charBuffer.position() : -1) + i3;
    }
}
