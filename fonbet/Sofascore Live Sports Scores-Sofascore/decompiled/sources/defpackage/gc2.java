package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.text.Charsets;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class gc2 implements Serializable, Comparable {
    public static final gc2 d = new gc2(new byte[0]);
    public final byte[] a;
    public transient int b;
    public transient String c;

    public gc2(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    public static int k(gc2 gc2Var, gc2 gc2Var2) {
        gc2Var.getClass();
        gc2Var2.getClass();
        return gc2Var.j(0, gc2Var2.l());
    }

    public static int o(gc2 gc2Var, gc2 gc2Var2) {
        int h = gc2Var.h();
        gc2Var.getClass();
        gc2Var2.getClass();
        return gc2Var.n(h, gc2Var2.l());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            ogj.h(ljg.j(readInt, "byteCount < 0: "));
            return;
        }
        byte[] bArr = new byte[readInt];
        int i = 0;
        while (i < readInt) {
            int read = objectInputStream.read(bArr, i, readInt - i);
            if (read == -1) {
                a70.q();
                return;
            }
            i += read;
        }
        gc2 gc2Var = new gc2(bArr);
        Field declaredField = gc2.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, gc2Var.a);
    }

    public static gc2 t(gc2 gc2Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = gc2Var.h();
        }
        return gc2Var.s(i, i2);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.a.length);
        objectOutputStream.write(this.a);
    }

    public String d() {
        byte[] bArr = this.a;
        byte[] bArr2 = d.a;
        bArr.getClass();
        bArr2.getClass();
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            i += 3;
            byte b3 = bArr[i3];
            bArr3[i2] = bArr2[(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 2];
            bArr3[i2 + 1] = bArr2[((b & 3) << 4) | ((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr2[((b2 & 15) << 2) | ((b3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr2[b3 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            bArr3[i2] = bArr2[(b4 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 2];
            bArr3[i2 + 1] = bArr2[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i5];
            bArr3[i2] = bArr2[(b5 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 2];
            bArr3[i2 + 1] = bArr2[((b5 & 3) << 4) | ((b6 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4)];
            bArr3[i2 + 2] = bArr2[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, Charsets.UTF_8);
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(gc2 gc2Var) {
        gc2Var.getClass();
        int h = h();
        int h2 = gc2Var.h();
        int min = Math.min(h, h2);
        for (int i = 0; i < min; i++) {
            int m = m(i) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int m2 = gc2Var.m(i) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (m != m2) {
                return m < m2 ? -1 : 1;
            }
        }
        if (h == h2) {
            return 0;
        }
        return h < h2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gc2) {
            gc2 gc2Var = (gc2) obj;
            int h = gc2Var.h();
            byte[] bArr = this.a;
            if (h == bArr.length && gc2Var.p(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public void f(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        mh0.f(this.a, i2, i, bArr, i3 + i);
    }

    public gc2 g(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.a, 0, h());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new gc2(digest);
    }

    public int h() {
        return this.a.length;
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.a);
        this.b = hashCode;
        return hashCode;
    }

    public String i() {
        byte[] bArr = this.a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = hkg.k;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public int j(int i, byte[] bArr) {
        bArr.getClass();
        int length = this.a.length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!yqo.s(this.a, max, 0, bArr, bArr.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public byte[] l() {
        return this.a;
    }

    public byte m(int i) {
        return this.a[i];
    }

    public int n(int i, byte[] bArr) {
        bArr.getClass();
        for (int min = Math.min(i, this.a.length - bArr.length); -1 < min; min--) {
            if (yqo.s(this.a, min, 0, bArr, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean p(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.a;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && yqo.s(bArr2, i, i2, bArr, i3);
    }

    public boolean q(gc2 gc2Var, int i, int i2) {
        gc2Var.getClass();
        return gc2Var.p(0, i, i2, this.a);
    }

    public String r(Charset charset) {
        charset.getClass();
        return new String(this.a, charset);
    }

    public gc2 s(int i, int i2) {
        if (i < 0) {
            a70.p("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.a;
        if (i2 > bArr.length) {
            ogj.h(wv8.j(new StringBuilder("endIndex > length("), this.a.length, ')'));
            return null;
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new gc2(mh0.k(i, i2, bArr));
        }
        a70.p("endIndex < beginIndex");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f4, code lost:
    
        if (r6 == 64) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x012e, code lost:
    
        if (r6 == 64) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0132, code lost:
    
        if (r6 == 64) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00d4, code lost:
    
        if (r6 == 64) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0171, code lost:
    
        if (r6 == 64) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0178, code lost:
    
        if (r6 == 64) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x016a, code lost:
    
        if (r6 == 64) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01ab, code lost:
    
        if (r6 == 64) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ae, code lost:
    
        if (r6 == 64) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01b1, code lost:
    
        if (r6 == 64) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x013e, code lost:
    
        if (r6 == 64) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01b4, code lost:
    
        if (r6 == 64) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0076, code lost:
    
        r3 = kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0095, code lost:
    
        if (r6 == 64) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c2, code lost:
    
        if (r6 == 64) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0084, code lost:
    
        if (r6 == 64) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fc, code lost:
    
        if (r6 == 64) goto L179;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b;
        int i;
        gc2 gc2Var = this;
        byte[] bArr = gc2Var.a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            Unit unit = Unit.a;
                            i2 += 2;
                            i4 = i;
                        }
                    }
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 >= 2048) {
                                if (55296 > i9 || i9 >= 57344) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                        break;
                                    }
                                    i3 += i9 < 65536 ? 1 : 2;
                                    Unit unit2 = Unit.a;
                                    i2 += 3;
                                    i4 = i;
                                }
                            }
                        }
                    }
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 <= 1114111) {
                                    if (55296 > i11 || i11 >= 57344) {
                                        if (i11 >= 65536) {
                                            i = i4 + 1;
                                            if (i4 == 64) {
                                                break;
                                            }
                                            if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                                break;
                                            }
                                            i3 += i11 < 65536 ? 1 : 2;
                                            Unit unit3 = Unit.a;
                                            i2 += 4;
                                            i4 = i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i3 != -1) {
            String w = gc2Var.w();
            String r = c.r(c.r(c.r(w.substring(0, i3), "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            if (i3 >= w.length()) {
                return dmi.j(']', "[text=", r);
            }
            return "[size=" + gc2Var.a.length + " text=" + r + "…]";
        }
        if (gc2Var.a.length <= 64) {
            return "[hex=" + gc2Var.i() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(gc2Var.a.length);
        sb.append(" hex=");
        byte[] bArr2 = gc2Var.a;
        if (64 > bArr2.length) {
            ogj.h(wv8.j(new StringBuilder("endIndex > length("), gc2Var.a.length, ')'));
            return null;
        }
        if (64 != bArr2.length) {
            gc2Var = new gc2(mh0.k(0, 64, bArr2));
        }
        sb.append(gc2Var.i());
        sb.append("…]");
        return sb.toString();
    }

    public gc2 u() {
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new gc2(copyOf);
            }
            i++;
        }
    }

    public byte[] v() {
        byte[] bArr = this.a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final String w() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        byte[] l = l();
        l.getClass();
        String str2 = new String(l, Charsets.UTF_8);
        this.c = str2;
        return str2;
    }

    public void x(x52 x52Var, int i) {
        x52Var.write(this.a, 0, i);
    }
}
