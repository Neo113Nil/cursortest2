package sf;

import I0.C3173b;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import tf.C9870b;

/* renamed from: sf.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9684j implements Serializable, Comparable<C9684j> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C9684j f98719d = new C9684j(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final byte[] f98720a;

    /* renamed from: b, reason: collision with root package name */
    private transient int f98721b;

    /* renamed from: c, reason: collision with root package name */
    private transient String f98722c;

    /* renamed from: sf.j$a */
    public static final class a {
        public static C9684j a(@NotNull String str) {
            char c11;
            int i11;
            char charAt;
            char c12 = 'A';
            Intrinsics.checkNotNullParameter(str, "<this>");
            int i12 = C9675a.f98692b;
            Intrinsics.checkNotNullParameter(str, "<this>");
            int length = str.length();
            while (true) {
                c11 = '\t';
                if (length <= 0 || !((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
                    break;
                }
                length--;
            }
            int i13 = (int) ((length * 6) / 8);
            byte[] bArr = new byte[i13];
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (i14 < length) {
                    char charAt2 = str.charAt(i14);
                    char c13 = c12;
                    if (c12 <= charAt2 && charAt2 < '[') {
                        i11 = charAt2 - 'A';
                    } else if ('a' <= charAt2 && charAt2 < '{') {
                        i11 = charAt2 - 'G';
                    } else if ('0' <= charAt2 && charAt2 < ':') {
                        i11 = charAt2 + 4;
                    } else if (charAt2 == '+' || charAt2 == '-') {
                        i11 = 62;
                    } else if (charAt2 == '/' || charAt2 == '_') {
                        i11 = 63;
                    } else {
                        if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != c11) {
                            break;
                        }
                        i14++;
                        c12 = c13;
                        c11 = '\t';
                    }
                    int i18 = i11 | (i16 << 6);
                    i15++;
                    if (i15 % 4 == 0) {
                        bArr[i17] = (byte) (i18 >> 16);
                        int i19 = i17 + 2;
                        bArr[i17 + 1] = (byte) (i18 >> 8);
                        i17 += 3;
                        bArr[i19] = (byte) i18;
                    }
                    i16 = i18;
                    i14++;
                    c12 = c13;
                    c11 = '\t';
                } else {
                    int i21 = i15 % 4;
                    if (i21 != 1) {
                        if (i21 == 2) {
                            bArr[i17] = (byte) ((i16 << 12) >> 16);
                            i17 = 1 + i17;
                        } else if (i21 == 3) {
                            int i22 = i16 << 6;
                            int i23 = 1 + i17;
                            bArr[i17] = (byte) (i22 >> 16);
                            i17 += 2;
                            bArr[i23] = (byte) (i22 >> 8);
                        }
                        if (i17 != i13) {
                            bArr = Arrays.copyOf(bArr, i17);
                            Intrinsics.checkNotNullExpressionValue(bArr, "copyOf(this, newSize)");
                        }
                    }
                }
            }
            bArr = null;
            if (bArr != null) {
                return new C9684j(bArr);
            }
            return null;
        }

        @NotNull
        public static C9684j b(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i11 = 0; i11 < length; i11++) {
                int i12 = i11 * 2;
                bArr[i11] = (byte) (C9870b.a(str.charAt(i12 + 1)) + (C9870b.a(str.charAt(i12)) << 4));
            }
            return new C9684j(bArr);
        }

        @NotNull
        public static C9684j c(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            C9684j c9684j = new C9684j(bytes);
            c9684j.B(str);
            return c9684j;
        }

        public static C9684j d(byte[] bArr) {
            C9684j c9684j = C9684j.f98719d;
            int c11 = C9676b.c();
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int f7 = C9676b.f(c11, bArr);
            C9676b.b(bArr.length, 0, f7);
            return new C9684j(C7705l.v(0, f7, bArr));
        }
    }

    public C9684j(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f98720a = data;
    }

    public static /* synthetic */ C9684j E(C9684j c9684j, int i11, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = C9676b.c();
        }
        return c9684j.D(i11, i12);
    }

    public static int l(C9684j c9684j, C9684j other) {
        c9684j.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return c9684j.j(0, other.f98720a);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        int readInt = objectInputStream.readInt();
        Intrinsics.checkNotNullParameter(objectInputStream, "<this>");
        if (readInt < 0) {
            throw new IllegalArgumentException(Ej.b.a(readInt, "byteCount < 0: ").toString());
        }
        byte[] bArr = new byte[readInt];
        int i11 = 0;
        while (i11 < readInt) {
            int read = objectInputStream.read(bArr, i11, readInt - i11);
            if (read == -1) {
                throw new EOFException();
            }
            i11 += read;
        }
        C9684j c9684j = new C9684j(bArr);
        Field declaredField = C9684j.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, c9684j.f98720a);
    }

    public static int s(C9684j c9684j, C9684j other) {
        int c11 = C9676b.c();
        c9684j.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return c9684j.p(c11, other.f98720a);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f98720a.length);
        objectOutputStream.write(this.f98720a);
    }

    public final void A(int i11) {
        this.f98721b = i11;
    }

    public final void B(String str) {
        this.f98722c = str;
    }

    @NotNull
    public String C(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(this.f98720a, charset);
    }

    @NotNull
    public C9684j D(int i11, int i12) {
        int e11 = C9676b.e(i12, this);
        if (i11 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f98720a;
        if (e11 > bArr.length) {
            throw new IllegalArgumentException(Ek.a.d(new StringBuilder("endIndex > length("), this.f98720a.length, ')').toString());
        }
        if (e11 - i11 >= 0) {
            return (i11 == 0 && e11 == bArr.length) ? this : new C9684j(C7705l.v(i11, e11, bArr));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    @NotNull
    public C9684j F() {
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f98720a;
            if (i11 >= bArr.length) {
                return this;
            }
            byte b11 = bArr[i11];
            if (b11 >= 65 && b11 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                copyOf[i11] = (byte) (b11 + 32);
                for (int i12 = i11 + 1; i12 < copyOf.length; i12++) {
                    byte b12 = copyOf[i12];
                    if (b12 >= 65 && b12 <= 90) {
                        copyOf[i12] = (byte) (b12 + 32);
                    }
                }
                return new C9684j(copyOf);
            }
            i11++;
        }
    }

    @NotNull
    public byte[] G() {
        byte[] bArr = this.f98720a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public final String H() {
        String str = this.f98722c;
        if (str != null) {
            return str;
        }
        byte[] m11 = m();
        Intrinsics.checkNotNullParameter(m11, "<this>");
        String str2 = new String(m11, Charsets.UTF_8);
        this.f98722c = str2;
        return str2;
    }

    public void I(@NotNull C9681g buffer, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.b0(this.f98720a, 0, i11);
    }

    @NotNull
    public String a() {
        return C9675a.a(this.f98720a);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NotNull C9684j other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int g10 = g();
        int g11 = other.g();
        int min = Math.min(g10, g11);
        for (int i11 = 0; i11 < min; i11++) {
            int n11 = n(i11) & 255;
            int n12 = other.n(i11) & 255;
            if (n11 != n12) {
                return n11 < n12 ? -1 : 1;
            }
        }
        if (g10 == g11) {
            return 0;
        }
        return g10 < g11 ? -1 : 1;
    }

    @NotNull
    public C9684j d(@NotNull String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f98720a, 0, g());
        byte[] digestBytes = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new C9684j(digestBytes);
    }

    @NotNull
    public final byte[] e() {
        return this.f98720a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9684j) {
            C9684j c9684j = (C9684j) obj;
            int g10 = c9684j.g();
            byte[] bArr = this.f98720a;
            if (g10 == bArr.length && c9684j.v(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.f98721b;
    }

    public int g() {
        return this.f98720a.length;
    }

    @NotNull
    public String h() {
        byte[] bArr = this.f98720a;
        char[] cArr = new char[bArr.length * 2];
        int i11 = 0;
        for (byte b11 : bArr) {
            int i12 = i11 + 1;
            cArr[i11] = C9870b.b()[(b11 >> 4) & 15];
            i11 += 2;
            cArr[i12] = C9870b.b()[b11 & 15];
        }
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public int hashCode() {
        int i11 = this.f98721b;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = Arrays.hashCode(this.f98720a);
        this.f98721b = hashCode;
        return hashCode;
    }

    public final int i(int i11, @NotNull C9684j other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return j(i11, other.f98720a);
    }

    public int j(int i11, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = this.f98720a.length - other.length;
        int max = Math.max(i11, 0);
        if (max > length) {
            return -1;
        }
        while (!C9676b.a(max, 0, other.length, this.f98720a, other)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    @NotNull
    public byte[] m() {
        return this.f98720a;
    }

    public byte n(int i11) {
        return this.f98720a[i11];
    }

    public int p(int i11, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int min = Math.min(C9676b.e(i11, this), this.f98720a.length - other.length); -1 < min; min--) {
            if (C9676b.a(min, 0, other.length, this.f98720a, other)) {
                return min;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0102, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00fa, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0138, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x013c, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00da, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0096, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00c8, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0085, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x017b, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0182, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0174, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b7, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ba, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bd, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0148, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c0, code lost:
    
        if (r8 == 64) goto L183;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b11;
        int i11;
        byte[] bArr = this.f98720a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            if (i12 >= length) {
                break;
            }
            byte b12 = bArr[i12];
            if (b12 >= 0) {
                int i15 = i14 + 1;
                if (i14 == 64) {
                    break;
                }
                if ((b12 != 10 && b12 != 13 && ((b12 >= 0 && b12 < 32) || (Byte.MAX_VALUE <= b12 && b12 < 160))) || b12 == 65533) {
                    break;
                }
                i13 += b12 < 65536 ? 1 : 2;
                i12++;
                while (true) {
                    i14 = i15;
                    if (i12 < length && (b11 = bArr[i12]) >= 0) {
                        i12++;
                        i15 = i14 + 1;
                        if (i14 == 64) {
                            break loop0;
                        }
                        if ((b11 != 10 && b11 != 13 && ((b11 >= 0 && b11 < 32) || (Byte.MAX_VALUE <= b11 && b11 < 160))) || b11 == 65533) {
                            break loop0;
                        }
                        i13 += b11 < 65536 ? 1 : 2;
                    }
                }
            } else if ((b12 >> 5) == -2) {
                int i16 = i12 + 1;
                if (length > i16) {
                    byte b13 = bArr[i16];
                    if ((b13 & 192) == 128) {
                        int i17 = (b13 ^ 3968) ^ (b12 << 6);
                        if (i17 >= 128) {
                            i11 = i14 + 1;
                            if (i14 == 64) {
                                break;
                            }
                            if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                break;
                            }
                            i13 += i17 < 65536 ? 1 : 2;
                            Unit unit = Unit.f71690a;
                            i12 += 2;
                            i14 = i11;
                        }
                    }
                }
            } else if ((b12 >> 4) == -2) {
                int i18 = i12 + 2;
                if (length > i18) {
                    byte b14 = bArr[i12 + 1];
                    if ((b14 & 192) == 128) {
                        byte b15 = bArr[i18];
                        if ((b15 & 192) == 128) {
                            int i19 = ((b15 ^ (-123008)) ^ (b14 << 6)) ^ (b12 << 12);
                            if (i19 >= 2048) {
                                if (55296 > i19 || i19 >= 57344) {
                                    i11 = i14 + 1;
                                    if (i14 == 64) {
                                        break;
                                    }
                                    if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                                        break;
                                    }
                                    i13 += i19 < 65536 ? 1 : 2;
                                    Unit unit2 = Unit.f71690a;
                                    i12 += 3;
                                    i14 = i11;
                                }
                            }
                        }
                    }
                }
            } else if ((b12 >> 3) == -2) {
                int i21 = i12 + 3;
                if (length > i21) {
                    byte b16 = bArr[i12 + 1];
                    if ((b16 & 192) == 128) {
                        byte b17 = bArr[i12 + 2];
                        if ((b17 & 192) == 128) {
                            byte b18 = bArr[i21];
                            if ((b18 & 192) == 128) {
                                int i22 = (((b18 ^ 3678080) ^ (b17 << 6)) ^ (b16 << 12)) ^ (b12 << 18);
                                if (i22 <= 1114111) {
                                    if (55296 > i22 || i22 >= 57344) {
                                        if (i22 >= 65536) {
                                            int i23 = i14 + 1;
                                            if (i14 == 64) {
                                                break;
                                            }
                                            if ((i22 != 10 && i22 != 13 && ((i22 >= 0 && i22 < 32) || (127 <= i22 && i22 < 160))) || i22 == 65533) {
                                                break;
                                            }
                                            i13 += i22 < 65536 ? 1 : 2;
                                            Unit unit3 = Unit.f71690a;
                                            i12 += 4;
                                            i14 = i23;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i13 != -1) {
            String H11 = H();
            String substring = H11.substring(0, i13);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String X9 = kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(substring, "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            if (i13 >= H11.length()) {
                return C3173b.a(']', "[text=", X9);
            }
            return "[size=" + this.f98720a.length + " text=" + X9 + "…]";
        }
        if (this.f98720a.length <= 64) {
            return "[hex=" + h() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(this.f98720a.length);
        sb2.append(" hex=");
        int e11 = C9676b.e(64, this);
        byte[] bArr2 = this.f98720a;
        if (e11 > bArr2.length) {
            throw new IllegalArgumentException(Ek.a.d(new StringBuilder("endIndex > length("), this.f98720a.length, ')').toString());
        }
        if (e11 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        sb2.append((e11 == bArr2.length ? this : new C9684j(C7705l.v(0, e11, bArr2))).h());
        sb2.append("…]");
        return sb2.toString();
    }

    public boolean u(int i11, @NotNull C9684j other, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.v(0, this.f98720a, i11, i12);
    }

    public boolean v(int i11, @NotNull byte[] other, int i12, int i13) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i11 < 0) {
            return false;
        }
        byte[] bArr = this.f98720a;
        return i11 <= bArr.length - i13 && i12 >= 0 && i12 <= other.length - i13 && C9676b.a(i11, i12, i13, bArr, other);
    }
}
