package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b65 implements xcb {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public b65(f5e f5eVar, f5e f5eVar2, sz8 sz8Var) {
        f5eVar.getClass();
        this.f = f5eVar2;
        this.g = sz8Var;
        this.a = f5eVar.c;
        this.b = f5eVar.d;
        this.c = f5eVar.b;
        this.d = 1;
        this.e = 1;
    }

    public int a(int i) {
        int i2;
        int i3;
        String str = (String) this.f;
        int i4 = i + 1;
        if (i4 >= this.a) {
            yhk.r(str, "Malformed DN: ");
            return 0;
        }
        char[] cArr = (char[]) this.g;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                yhk.r(str, "Malformed DN: ");
                return 0;
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                yhk.r(str, "Malformed DN: ");
                return 0;
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    public char b() {
        int i;
        int i2;
        int i3 = this.b + 1;
        this.b = i3;
        int i4 = this.a;
        if (i3 == i4) {
            sw9.i((String) this.f, "Unexpected end of DN: ");
            return (char) 0;
        }
        char c = ((char[]) this.g)[i3];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int a = a(i3);
                            this.b++;
                            if (a < 128) {
                                return (char) a;
                            }
                            if (a < 192 || a > 247) {
                                return '?';
                            }
                            if (a <= 223) {
                                i = a & 31;
                                i2 = 1;
                            } else if (a <= 239) {
                                i = a & 15;
                                i2 = 2;
                            } else {
                                i = a & 7;
                                i2 = 3;
                            }
                            for (int i5 = 0; i5 < i2; i5++) {
                                int i6 = this.b;
                                int i7 = i6 + 1;
                                this.b = i7;
                                if (i7 == i4 || ((char[]) this.g)[i7] != '\\') {
                                    return '?';
                                }
                                int i8 = i6 + 2;
                                this.b = i8;
                                int a2 = a(i8);
                                this.b++;
                                if ((a2 & PsExtractor.AUDIO_STREAM) != 128) {
                                    return '?';
                                }
                                i = (i << 6) + (a2 & 63);
                            }
                            return (char) i;
                    }
                case '*':
                case '+':
                case ',':
                    return c;
            }
        }
        return c;
    }

    public String c() {
        int i;
        int i2;
        char c;
        char c2;
        char c3;
        String str = (String) this.f;
        int i3 = this.a;
        while (true) {
            i = this.b;
            if (i >= i3 || ((char[]) this.g)[i] != ' ') {
                break;
            }
            this.b = i + 1;
        }
        if (i == i3) {
            return null;
        }
        this.c = i;
        this.b = i + 1;
        while (true) {
            i2 = this.b;
            if (i2 >= i3 || (c3 = ((char[]) this.g)[i2]) == '=' || c3 == ' ') {
                break;
            }
            this.b = i2 + 1;
        }
        if (i2 >= i3) {
            yhk.r(str, "Unexpected end of DN: ");
            return null;
        }
        this.d = i2;
        if (((char[]) this.g)[i2] == ' ') {
            while (true) {
                i2 = this.b;
                if (i2 >= i3 || (c2 = ((char[]) this.g)[i2]) == '=' || c2 != ' ') {
                    break;
                }
                this.b = i2 + 1;
            }
            if (((char[]) this.g)[i2] != '=' || i2 == i3) {
                yhk.r(str, "Unexpected end of DN: ");
                return null;
            }
        }
        this.b = i2 + 1;
        while (true) {
            int i4 = this.b;
            if (i4 >= i3 || ((char[]) this.g)[i4] != ' ') {
                break;
            }
            this.b = i4 + 1;
        }
        int i5 = this.d;
        int i6 = this.c;
        if (i5 - i6 > 4) {
            char[] cArr = (char[]) this.g;
            if (cArr[i6 + 3] == '.' && (((c = cArr[i6]) == 'O' || c == 'o') && ((cArr[i6 + 1] == 'I' || cArr[i6 + 1] == 'i') && (cArr[i6 + 2] == 'D' || cArr[i6 + 2] == 'd')))) {
                i6 += 4;
                this.c = i6;
            }
        }
        return new String((char[]) this.g, i6, i5 - i6);
    }

    @Override // defpackage.xcb
    public void d(int i, int i2) {
        sz8 sz8Var = (sz8) this.g;
        if (i >= this.c && this.e != 2) {
            int min = Math.min(i2, this.b);
            if (min > 0) {
                this.e = 3;
                sz8Var.g(this.a + i, min, p25.b);
                this.b -= min;
            }
            int i3 = i2 - min;
            if (i3 > 0) {
                sz8Var.d(i + min + this.a, i3);
            }
        } else if (i <= 0 && this.d != 2) {
            int min2 = Math.min(i2, this.a);
            if (min2 > 0) {
                this.d = 3;
                sz8Var.g((0 - min2) + this.a, min2, p25.b);
                this.a -= min2;
            }
            int i4 = i2 - min2;
            if (i4 > 0) {
                sz8Var.d(this.a, i4);
            }
        } else {
            sz8Var.d(i + this.a, i2);
        }
        this.c += i2;
    }

    @Override // defpackage.xcb
    public void f(int i, int i2) {
        int i3;
        f5e f5eVar = (f5e) this.f;
        sz8 sz8Var = (sz8) this.g;
        if (i + i2 >= this.c && this.e != 3) {
            int min = Math.min(f5eVar.d - this.b, i2);
            i3 = min >= 0 ? min : 0;
            int i4 = i2 - i3;
            if (i3 > 0) {
                this.e = 2;
                sz8Var.g(this.a + i, i3, p25.a);
                this.b += i3;
            }
            if (i4 > 0) {
                sz8Var.f(i + i3 + this.a, i4);
            }
        } else if (i <= 0 && this.d != 3) {
            int min2 = Math.min(f5eVar.c - this.a, i2);
            i3 = min2 >= 0 ? min2 : 0;
            int i5 = i2 - i3;
            if (i5 > 0) {
                sz8Var.f(this.a, i5);
            }
            if (i3 > 0) {
                this.d = 2;
                sz8Var.g(this.a, i3, p25.a);
                this.a += i3;
            }
        } else {
            sz8Var.f(i + this.a, i2);
        }
        this.c -= i2;
    }

    @Override // defpackage.xcb
    public void g(int i, int i2, Object obj) {
        ((sz8) this.g).g(i + this.a, i2, obj);
    }

    @Override // defpackage.xcb
    public void h(int i, int i2) {
        sz8 sz8Var = (sz8) this.g;
        int i3 = this.a;
        sz8Var.h(i + i3, i2 + i3);
    }

    public b65(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f = name;
        this.a = name.length();
    }
}
