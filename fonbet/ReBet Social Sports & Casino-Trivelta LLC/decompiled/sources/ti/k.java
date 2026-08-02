package ti;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.twilio.voice.EventKeys;
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.jetbrains.annotations.NotNull;
import ui.AbstractC6590b;

/* loaded from: classes5.dex */
public class k implements Serializable, Comparable {

    /* renamed from: c, reason: collision with root package name */
    public static final a f65867c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final k f65868d = new k(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public transient int f65869a;

    /* renamed from: b, reason: collision with root package name */
    public transient String f65870b;

    @NotNull
    private final byte[] data;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ k j(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = AbstractC6475e.c();
            }
            return aVar.i(bArr, i10, i11);
        }

        public final k a(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return d(string);
        }

        public final k b(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return g(string);
        }

        public final k c(ByteBuffer buffer) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            return h(buffer);
        }

        public final k d(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] a10 = AbstractC6471a.a(str);
            if (a10 != null) {
                return new k(a10);
            }
            return null;
        }

        public final k e(String str) {
            int e10;
            int e11;
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                e10 = AbstractC6590b.e(str.charAt(i11));
                e11 = AbstractC6590b.e(str.charAt(i11 + 1));
                bArr[i10] = (byte) ((e10 << 4) + e11);
            }
            return new k(bArr);
        }

        public final k f(String str, Charset charset) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return new k(bytes);
        }

        public final k g(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            k kVar = new k(J.a(str));
            kVar.r(str);
            return kVar;
        }

        public final k h(ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new k(bArr);
        }

        public final k i(byte[] bArr, int i10, int i11) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int f10 = AbstractC6475e.f(bArr, i11);
            AbstractC6475e.b(bArr.length, i10, f10);
            return new k(ArraysKt.copyOfRange(bArr, i10, f10 + i10));
        }

        public final k k(InputStream inputStream, int i10) {
            Intrinsics.checkNotNullParameter(inputStream, "<this>");
            if (i10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + i10).toString());
            }
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = inputStream.read(bArr, i11, i10 - i11);
                if (read == -1) {
                    throw new EOFException();
                }
                i11 += read;
            }
            return new k(bArr);
        }

        public a() {
        }
    }

    public k(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public static final k e(String str) {
        return f65867c.g(str);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        k k10 = f65867c.k(objectInputStream, objectInputStream.readInt());
        Field declaredField = k.class.getDeclaredField(EventKeys.DATA);
        declaredField.setAccessible(true);
        declaredField.set(this, k10.data);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public final int a() {
        return u();
    }

    public String b() {
        return AbstractC6471a.c(g(), null, 1, null);
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(k other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int u10 = u();
        int u11 = other.u();
        int min = Math.min(u10, u11);
        for (int i10 = 0; i10 < min; i10++) {
            int f10 = f(i10) & UByte.MAX_VALUE;
            int f11 = other.f(i10) & UByte.MAX_VALUE;
            if (f10 != f11) {
                return f10 < f11 ? -1 : 1;
            }
        }
        if (u10 == u11) {
            return 0;
        }
        return u10 < u11 ? -1 : 1;
    }

    public k d(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, u());
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNull(digest);
        return new k(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kVar.u() == g().length && kVar.p(0, g(), 0, g().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte f(int i10) {
        return m(i10);
    }

    public final byte[] g() {
        return this.data;
    }

    public final int h() {
        return this.f65869a;
    }

    public int hashCode() {
        int h10 = h();
        if (h10 != 0) {
            return h10;
        }
        int hashCode = Arrays.hashCode(g());
        q(hashCode);
        return hashCode;
    }

    public int i() {
        return g().length;
    }

    public final String j() {
        return this.f65870b;
    }

    public String k() {
        char[] cArr = new char[g().length * 2];
        int i10 = 0;
        for (byte b10 : g()) {
            int i11 = i10 + 1;
            cArr[i10] = AbstractC6590b.f()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = AbstractC6590b.f()[b10 & 15];
        }
        return StringsKt.concatToString(cArr);
    }

    public byte[] l() {
        return g();
    }

    public byte m(int i10) {
        return g()[i10];
    }

    public final k n() {
        return d("MD5");
    }

    public boolean o(int i10, k other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.p(i11, g(), i10, i12);
    }

    public boolean p(int i10, byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        return i10 >= 0 && i10 <= g().length - i12 && i11 >= 0 && i11 <= other.length - i12 && AbstractC6475e.a(g(), i10, other, i11, i12);
    }

    public final void q(int i10) {
        this.f65869a = i10;
    }

    public final void r(String str) {
        this.f65870b = str;
    }

    public final k s() {
        return d(McElieceCCA2KeyGenParameterSpec.SHA1);
    }

    public final k t() {
        return d("SHA-256");
    }

    public String toString() {
        int c10;
        if (g().length == 0) {
            return "[size=0]";
        }
        c10 = AbstractC6590b.c(g(), 64);
        if (c10 != -1) {
            String y10 = y();
            String substring = y10.substring(0, c10);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String replace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(substring, "\\", "\\\\", false, 4, (Object) null), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
            if (c10 >= y10.length()) {
                return "[text=" + replace$default + ']';
            }
            return "[size=" + g().length + " text=" + replace$default + "…]";
        }
        if (g().length <= 64) {
            return "[hex=" + k() + ']';
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(g().length);
        sb2.append(" hex=");
        int e10 = AbstractC6475e.e(this, 64);
        if (e10 <= g().length) {
            if (e10 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb2.append((e10 == g().length ? this : new k(ArraysKt.copyOfRange(g(), 0, e10))).k());
            sb2.append("…]");
            return sb2.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + g().length + ')').toString());
    }

    public final int u() {
        return i();
    }

    public final boolean v(k prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return o(0, prefix, 0, prefix.u());
    }

    public k w() {
        for (int i10 = 0; i10 < g().length; i10++) {
            byte b10 = g()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] g10 = g();
                byte[] copyOf = Arrays.copyOf(g10, g10.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                copyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b11 = copyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        copyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new k(copyOf);
            }
        }
        return this;
    }

    public byte[] x() {
        byte[] g10 = g();
        byte[] copyOf = Arrays.copyOf(g10, g10.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public String y() {
        String j10 = j();
        if (j10 != null) {
            return j10;
        }
        String b10 = J.b(l());
        r(b10);
        return b10;
    }

    public void z(C6478h buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        AbstractC6590b.d(this, buffer, i10, i11);
    }
}
