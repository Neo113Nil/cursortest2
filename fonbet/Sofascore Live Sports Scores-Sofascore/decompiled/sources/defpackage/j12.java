package defpackage;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzamx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class j12 implements hmg, tti, ew1 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public j12(CharSequence charSequence, int i, Locale locale) {
        this.a = 8;
        this.d = charSequence;
        if (charSequence.length() < 0) {
            s3a.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            s3a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new pp2(charSequence, i));
    }

    public static boolean B(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    @Override // defpackage.tti
    public void A(nr9 nr9Var) {
        ((qfg) this.e).invoke(oyn.P(rfo.O(nr9Var), this.c));
    }

    public void C(int i, int i2, int i3, int i4) {
        int i5 = this.c;
        if (i < 0) {
            int i6 = this.b;
            i += i6;
            i2 += 4 - ((i6 + 4) % 8);
        }
        if (i2 < 0) {
            i2 += i5;
            i += 4 - ((i5 + 4) % 8);
        }
        ((byte[]) this.e)[(i * i5) + i2] = (byte) ((((String) this.d).charAt(i3) & (1 << (8 - i4))) == 0 ? 0 : 1);
    }

    public int E(int i) {
        i(i);
        int following = ((BreakIterator) this.e).following(i);
        return (y(following + (-1)) && y(following) && !x(following)) ? E(following) : following;
    }

    public Integer F() {
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        String str = (String) this.d;
        this.b = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public float G() {
        zid zidVar = (zid) this.e;
        float a = zidVar.a(this.b, this.c, (String) this.d);
        if (!Float.isNaN(a)) {
            this.b = zidVar.b;
        }
        return a;
    }

    public amg H() {
        float G = G();
        if (Float.isNaN(G)) {
            return null;
        }
        int L = L();
        return L == 0 ? new amg(G, 1) : new amg(G, L);
    }

    public String I() {
        String str = (String) this.d;
        if (q()) {
            return null;
        }
        int i = this.b;
        char charAt = str.charAt(i);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        int h = h();
        while (h != -1 && h != charAt) {
            h = h();
        }
        if (h == -1) {
            this.b = i;
            return null;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        return str.substring(i + 1, i2);
    }

    public String J() {
        return K(' ', false);
    }

    public String K(char c, boolean z) {
        String str = (String) this.d;
        if (q()) {
            return null;
        }
        char charAt = str.charAt(this.b);
        if ((!z && B(charAt)) || charAt == c) {
            return null;
        }
        int i = this.b;
        int h = h();
        while (h != -1 && h != c && (z || !B(h))) {
            h = h();
        }
        return str.substring(i, this.b);
    }

    public int L() {
        String str = (String) this.d;
        if (q()) {
            return 0;
        }
        char charAt = str.charAt(this.b);
        int i = this.b;
        if (charAt == '%') {
            this.b = i + 1;
            return 9;
        }
        if (i > this.c - 2) {
            return 0;
        }
        try {
            int y = ljg.y(str.substring(i, i + 2).toLowerCase(Locale.US));
            this.b += 2;
            return y;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public float M() {
        P();
        zid zidVar = (zid) this.e;
        float a = zidVar.a(this.b, this.c, (String) this.d);
        if (!Float.isNaN(a)) {
            this.b = zidVar.b;
        }
        return a;
    }

    public int N(int i) {
        i(i);
        int preceding = ((BreakIterator) this.e).preceding(i);
        return (y(preceding) && u(preceding) && !x(preceding)) ? N(preceding) : preceding;
    }

    public void O(int i, int i2, String str) {
        if (i > i2) {
            s3a.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            s3a.a("start must be non-negative, but was " + i);
        }
        wu8 wu8Var = (wu8) this.e;
        if (wu8Var == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - min;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = max - min2;
            int i5 = min2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            wu8 wu8Var2 = new wu8(0);
            wu8Var2.b = max;
            wu8Var2.c = cArr;
            wu8Var2.d = length;
            wu8Var2.e = i4;
            this.e = wu8Var2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > wu8Var.b - wu8Var.a()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            O(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > wu8Var.a()) {
            int a = length2 - wu8Var.a();
            int i9 = wu8Var.b;
            do {
                i9 *= 2;
            } while (i9 - wu8Var.b < a);
            char[] cArr2 = new char[i9];
            mh0.g(wu8Var.c, cArr2, 0, 0, wu8Var.d);
            int i10 = wu8Var.b;
            int i11 = wu8Var.e;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            mh0.g(wu8Var.c, cArr2, i13, i11, i12 + i11);
            wu8Var.c = cArr2;
            wu8Var.b = i9;
            wu8Var.e = i13;
        }
        int i14 = wu8Var.d;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = wu8Var.c;
            mh0.g(cArr3, cArr3, wu8Var.e - i15, i8, i14);
            wu8Var.d = i7;
            wu8Var.e -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int a2 = wu8Var.a() + i7;
            int a3 = wu8Var.a() + i8;
            int i16 = wu8Var.e;
            char[] cArr4 = wu8Var.c;
            mh0.g(cArr4, cArr4, wu8Var.d, i16, a2);
            i7 = wu8Var.d + (a2 - i16);
            wu8Var.d = i7;
            wu8Var.e = a3;
        } else {
            wu8Var.e = wu8Var.a() + i8;
            wu8Var.d = i7;
        }
        str.getChars(0, str.length(), wu8Var.c, i7);
        wu8Var.d = str.length() + wu8Var.d;
    }

    public boolean P() {
        Q();
        int i = this.b;
        if (i == this.c || ((String) this.d).charAt(i) != ',') {
            return false;
        }
        this.b++;
        Q();
        return true;
    }

    public void Q() {
        while (true) {
            int i = this.b;
            if (i >= this.c || !B(((String) this.d).charAt(i))) {
                return;
            } else {
                this.b++;
            }
        }
    }

    public void R(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        C(i4, i5, i3, 1);
        int i6 = i2 - 1;
        C(i4, i6, i3, 2);
        int i7 = i - 1;
        C(i7, i5, i3, 3);
        C(i7, i6, i3, 4);
        C(i7, i2, i3, 5);
        C(i, i5, i3, 6);
        C(i, i6, i3, 7);
        C(i, i2, i3, 8);
    }

    @Override // defpackage.hmg
    public void a(float f, float f2, float f3, float f4) {
        b((byte) 3);
        p(4);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        this.c = i + 4;
        fArr[i4] = f4;
    }

    public void b(byte b) {
        int i = this.b;
        byte[] bArr = (byte[]) this.d;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.d = bArr2;
            bArr = bArr2;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        bArr[i2] = b;
    }

    @Override // defpackage.hmg
    public void c(float f, float f2) {
        b((byte) 0);
        p(2);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        this.c = i + 2;
        fArr[i2] = f2;
    }

    @Override // defpackage.hmg
    public void close() {
        b((byte) 8);
    }

    @Override // defpackage.hmg
    public void d(float f, float f2, float f3, float f4, float f5, float f6) {
        b((byte) 2);
        p(6);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.c = i5;
        fArr[i4] = f4;
        int i6 = i + 5;
        this.c = i6;
        fArr[i5] = f5;
        this.c = i + 6;
        fArr[i6] = f6;
    }

    @Override // defpackage.ew1
    public void e() {
        nkk nkkVar = (nkk) this.e;
        byte[] bArr = lik.e;
        nkkVar.C(bArr, bArr.length);
    }

    @Override // defpackage.hmg
    public void f(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        b((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
        p(5);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.c = i5;
        fArr[i4] = f4;
        this.c = i + 5;
        fArr[i5] = f5;
    }

    @Override // defpackage.hmg
    public void g(float f, float f2) {
        b((byte) 1);
        p(2);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        this.c = i + 2;
        fArr[i2] = f2;
    }

    public int h() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.b = i3;
        if (i3 < i2) {
            return ((String) this.d).charAt(i3);
        }
        return -1;
    }

    public void i(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder s = lnb.s(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        s.append(i3);
        s.append(']');
        s3a.a(s.toString());
    }

    @Override // defpackage.ew1
    public dw1 j(ml6 ml6Var, long j) {
        long j2;
        long position = ml6Var.getPosition();
        int min = (int) Math.min(this.c, ml6Var.getLength() - position);
        nkk nkkVar = (nkk) this.e;
        nkkVar.B(min);
        ml6Var.peekFully(nkkVar.a, 0, min);
        int i = nkkVar.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = C.TIME_UNSET;
        while (true) {
            if (nkkVar.c() < 188) {
                j2 = C.TIME_UNSET;
                break;
            }
            byte[] bArr = nkkVar.a;
            int i2 = nkkVar.b;
            while (true) {
                if (i2 >= i) {
                    j2 = C.TIME_UNSET;
                    break;
                }
                byte b = bArr[i2];
                j2 = C.TIME_UNSET;
                if (b == 71) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long N = qha.N(nkkVar, i2, this.b);
            if (N != j2) {
                long b2 = ((cjj) this.d).b(N);
                if (b2 > j) {
                    return j5 == j2 ? new dw1(-1, 0, b2, position) : new dw1(0, 0, C.TIME_UNSET, position + j4);
                }
                if (100000 + b2 > j) {
                    return new dw1(0, 0, C.TIME_UNSET, position + i2);
                }
                j5 = b2;
                j4 = i2;
            }
            nkkVar.E(i3);
            j3 = i3;
        }
        return j5 != j2 ? new dw1(-2, 0, j5, position + j3) : dw1.e;
    }

    public Boolean k(Object obj) {
        if (obj == null) {
            return null;
        }
        P();
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        char charAt = ((String) this.d).charAt(i);
        if (charAt != '0' && charAt != '1') {
            return null;
        }
        this.b++;
        return Boolean.valueOf(charAt == '1');
    }

    public float l(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        P();
        return G();
    }

    public boolean m(char c) {
        int i = this.b;
        boolean z = i < this.c && ((String) this.d).charAt(i) == c;
        if (z) {
            this.b++;
        }
        return z;
    }

    public boolean o(String str) {
        int length = str.length();
        int i = this.b;
        boolean z = i <= this.c - length && ((String) this.d).substring(i, i + length).equals(str);
        if (z) {
            this.b += length;
        }
        return z;
    }

    public void p(int i) {
        float[] fArr = (float[]) this.e;
        if (fArr.length < this.c + i) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.e = fArr2;
        }
    }

    public boolean q() {
        return this.b == this.c;
    }

    public void r(hmg hmgVar) {
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            byte b = ((byte[]) this.d)[i2];
            if (b == 0) {
                float[] fArr = (float[]) this.e;
                int i3 = i + 1;
                float f = fArr[i];
                i += 2;
                hmgVar.c(f, fArr[i3]);
            } else if (b == 1) {
                float[] fArr2 = (float[]) this.e;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i += 2;
                hmgVar.g(f2, fArr2[i4]);
            } else if (b == 2) {
                float[] fArr3 = (float[]) this.e;
                hmgVar.d(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                i += 6;
            } else if (b == 3) {
                float[] fArr4 = (float[]) this.e;
                float f3 = fArr4[i];
                float f4 = fArr4[i + 1];
                int i5 = i + 3;
                float f5 = fArr4[i + 2];
                i += 4;
                hmgVar.a(f3, f4, f5, fArr4[i5]);
            } else if (b != 8) {
                boolean z = (b & 2) != 0;
                boolean z2 = (b & 1) != 0;
                float[] fArr5 = (float[]) this.e;
                hmgVar.f(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z2, fArr5[i + 3], fArr5[i + 4]);
                i += 5;
            } else {
                hmgVar.close();
            }
        }
    }

    public int s() {
        wu8 wu8Var = (wu8) this.e;
        String str = (String) this.d;
        if (wu8Var == null) {
            return str.length();
        }
        return (wu8Var.b - wu8Var.a()) + (str.length() - (this.c - this.b));
    }

    @Override // defpackage.tti
    public void t(nr9 nr9Var) {
        Bitmap O;
        ((qfg) this.d).invoke((nr9Var == null || (O = rfo.O(nr9Var)) == null) ? null : oyn.P(O, this.b));
    }

    public String toString() {
        switch (this.a) {
            case 3:
                wu8 wu8Var = (wu8) this.e;
                String str = (String) this.d;
                if (wu8Var == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append(wu8Var.c, 0, wu8Var.d);
                char[] cArr = wu8Var.c;
                int i = wu8Var.e;
                sb.append(cArr, i, wu8Var.b - i);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public boolean u(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!cl5.d()) {
                    return false;
                }
                cl5 a = cl5.a();
                if (a.c() != 1 || a.b(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean v(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return cga.H(Character.codePointBefore((CharSequence) this.d, i));
    }

    public boolean w(int i) {
        i(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (y(i) && y(i - 1) && y(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.d).length() - 1 || !(x(i) || x(i + 1));
    }

    public boolean x(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (Intrinsics.c(of, unicodeBlock) && Intrinsics.c(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return Intrinsics.c(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && Intrinsics.c(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean y(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!cl5.d()) {
                return false;
            }
            cl5 a = cl5.a();
            if (a.c() != 1 || a.b(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean z(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return cga.H(Character.codePointAt((CharSequence) this.d, i));
    }

    @Override // defpackage.tti
    public void D(nr9 nr9Var) {
    }

    public /* synthetic */ j12(byte b, int i) {
        this.a = i;
    }

    public j12(String str, int i, int i2) {
        this.a = 1;
        this.d = str;
        this.c = i;
        this.b = i2;
        byte[] bArr = new byte[i * i2];
        this.e = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public j12(int i, cjj cjjVar, int i2) {
        this.a = 7;
        this.b = i;
        this.d = cjjVar;
        this.c = i2;
        this.e = new nkk(4, false);
    }

    public j12(qfg qfgVar, int i, qfg qfgVar2, int i2) {
        this.a = 6;
        this.d = qfgVar;
        this.b = i;
        this.e = qfgVar2;
        this.c = i2;
    }

    public j12(qn5 qn5Var, l2a l2aVar) {
        this.a = 2;
        this.d = new SparseArray();
        this.e = qn5Var;
        TypedArray typedArray = (TypedArray) l2aVar.c;
        this.b = typedArray.getResourceId(28, 0);
        this.c = typedArray.getResourceId(53, 0);
    }

    public j12(String str) {
        this.a = 5;
        this.b = 0;
        this.c = 0;
        this.e = new zid(0);
        String trim = str.trim();
        this.d = trim;
        this.c = trim.length();
    }

    public j12(int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 9:
                this.d = new zzamx[i];
                this.c = 0;
                break;
            default:
                this.d = new lsj[i];
                this.c = 0;
                break;
        }
    }
}
