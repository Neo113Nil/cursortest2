package com.squareup.moshi;

import C.C2702w;
import E0.C2942q;
import com.squareup.moshi.n;
import com.squareup.moshi.u;
import g.C6594f;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.C9684j;
import sf.G;
import sf.InterfaceC9683i;

/* loaded from: classes.dex */
public final class p extends n {

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final C9684j f60429n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private static final C9684j f60430o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final C9684j f60431p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final C9684j f60432q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private static final C9684j f60433r;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC9683i f60434g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C9681g f60435h;

    /* renamed from: i, reason: collision with root package name */
    private int f60436i;

    /* renamed from: j, reason: collision with root package name */
    private long f60437j;

    /* renamed from: k, reason: collision with root package name */
    private int f60438k;

    /* renamed from: l, reason: collision with root package name */
    private String f60439l;

    /* renamed from: m, reason: collision with root package name */
    private u f60440m;

    static {
        C9684j c9684j = C9684j.f98719d;
        f60429n = C9684j.a.c("'\\");
        f60430o = C9684j.a.c("\"\\");
        f60431p = C9684j.a.c("{}[]:, \n\t\r\f/\\;#=");
        f60432q = C9684j.a.c("\n\r");
        f60433r = C9684j.a.c("*/");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull InterfaceC9683i source) {
        super(0);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f60434g = source;
        this.f60435h = source.f();
        s(6);
    }

    private final void B() {
        if (!j()) {
            throw new l(C2702w.a(this, new StringBuilder("Use JsonReader.setLenient(true) to accept malformed JSON at path ")));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x02e9, code lost:
    
        if (Q(r14) == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02ed, code lost:
    
        if (r4 != 2) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02ef, code lost:
    
        if (r13 == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02f5, code lost:
    
        if (r5 != Long.MIN_VALUE) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02f7, code lost:
    
        if (r7 == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02fe, code lost:
    
        if (r5 != r20) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0300, code lost:
    
        if (r7 != false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0302, code lost:
    
        if (r7 == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0305, code lost:
    
        r5 = -r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0306, code lost:
    
        r25.f60437j = r5;
        r12.skip(r1);
        r5 = 16;
        r25.f60436i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02fa, code lost:
    
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0311, code lost:
    
        if (r4 == r5) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0314, code lost:
    
        if (r4 == 4) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0317, code lost:
    
        if (r4 != 7) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0319, code lost:
    
        r25.f60438k = (int) r1;
        r5 = 17;
        r25.f60436i = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0310, code lost:
    
        r5 = 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x024a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0322 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x014e  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int I() {
        int i11;
        int i12;
        char R11;
        String str;
        String str2;
        int i13;
        long j11;
        long j12;
        char o11;
        int i14;
        char c11;
        int[] iArr = this.f60421b;
        boolean z11 = true;
        int i15 = this.f60420a - 1;
        int i16 = iArr[i15];
        InterfaceC9683i interfaceC9683i = this.f60434g;
        long j13 = 0;
        char c12 = 5;
        C9681g c9681g = this.f60435h;
        switch (i16) {
            case 1:
                i11 = 2;
                iArr[i15] = 2;
                R11 = (char) R(true);
                if (R11 != ']') {
                    if (i16 == 1) {
                        c9681g.readByte();
                        this.f60436i = 4;
                        return 4;
                    }
                    if (i16 != i11) {
                        throw new l(C2702w.a(this, new StringBuilder("Unexpected value at path ")));
                    }
                    B();
                    this.f60436i = 7;
                    return 7;
                }
                if (R11 == ';' || R11 == ',') {
                    if (i16 != 1 && i16 != 2) {
                        throw new l(C2702w.a(this, new StringBuilder("Unexpected value at path ")));
                    }
                    B();
                    this.f60436i = 7;
                    return 7;
                }
                if (R11 == '\'') {
                    B();
                    c9681g.readByte();
                    this.f60436i = 8;
                    return 8;
                }
                if (R11 == '\"') {
                    c9681g.readByte();
                    this.f60436i = 9;
                    return 9;
                }
                if (R11 == '[') {
                    c9681g.readByte();
                    this.f60436i = 3;
                    return 3;
                }
                if (R11 == '{') {
                    c9681g.readByte();
                    this.f60436i = 1;
                    return 1;
                }
                char o12 = (char) c9681g.o(0L);
                if (o12 == 't' || o12 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i13 = 5;
                } else if (o12 == 'f' || o12 == 'F') {
                    str = "false";
                    str2 = "FALSE";
                    i13 = 6;
                } else if (o12 == 'n' || o12 == 'N') {
                    str = "null";
                    str2 = "NULL";
                    i13 = 7;
                } else {
                    j12 = 0;
                    j11 = 1;
                    i13 = 0;
                    if (i13 == 0) {
                        return i13;
                    }
                    boolean z12 = true;
                    long j14 = j12;
                    long j15 = j14;
                    ?? r42 = 0;
                    boolean z13 = false;
                    while (true) {
                        long j16 = j14 + j11;
                        if (!interfaceC9683i.n(j16)) {
                            break;
                        } else {
                            char o13 = (char) c9681g.o(j14);
                            if (o13 == '-') {
                                if (r42 != 0) {
                                    if (r42 != c12) {
                                    }
                                    j14 = j16;
                                    r42 = 6;
                                } else {
                                    r42 = z11;
                                    z13 = r42;
                                    j14 = j16;
                                }
                            } else {
                                if (o13 != '+') {
                                    if (o13 == 'e' || o13 == 'E') {
                                        if (r42 == 2 || r42 == 4) {
                                            j14 = j16;
                                            r42 = c12;
                                        }
                                    } else if (o13 == '.') {
                                        if (r42 == 2) {
                                            j14 = j16;
                                            r42 = 3;
                                            c12 = 5;
                                        }
                                    } else if ('0' <= o13 && o13 < ':') {
                                        if (r42 == 0 || r42 == z11) {
                                            j15 = -(o13 - '0');
                                            c11 = 2;
                                        } else if (r42 != 2) {
                                            if (r42 != 3) {
                                                c11 = r42;
                                                if (r42 == 5 || r42 == 6) {
                                                    c11 = 7;
                                                }
                                            } else {
                                                c11 = 4;
                                            }
                                        } else if (j15 != j12) {
                                            long j17 = (10 * j15) - (o13 - '0');
                                            z12 = (j15 > -922337203685477580L || (j15 == -922337203685477580L && j17 < j15)) & z12;
                                            j15 = j17;
                                            c11 = r42;
                                        }
                                        j14 = j16;
                                        z11 = true;
                                        r42 = c11;
                                        c12 = 5;
                                    }
                                    if (i14 == 0) {
                                        return i14;
                                    }
                                    if (!Q(c9681g.o(j12))) {
                                        throw new l(C2702w.a(this, new StringBuilder("Expected value at path ")));
                                    }
                                    B();
                                    this.f60436i = 10;
                                    return 10;
                                }
                                if (r42 != c12) {
                                }
                                j14 = j16;
                                r42 = 6;
                            }
                        }
                    }
                    i14 = 0;
                    if (i14 == 0) {
                    }
                }
                int length = str.length();
                j11 = 1;
                int i17 = 1;
                while (true) {
                    if (i17 < length) {
                        j12 = j13;
                        long j18 = i17;
                        if (interfaceC9683i.n(j18 + 1) && ((o11 = (char) c9681g.o(j18)) == str.charAt(i17) || o11 == str2.charAt(i17))) {
                            i17++;
                            j13 = j12;
                        }
                    } else {
                        j12 = j13;
                        if (!interfaceC9683i.n(length + 1) || !Q(c9681g.o(length))) {
                            c9681g.skip(length);
                            this.f60436i = i13;
                        }
                    }
                }
                if (i13 == 0) {
                }
                break;
            case 2:
                char R12 = (char) R(true);
                c9681g.readByte();
                if (R12 == ']') {
                    this.f60436i = 4;
                    return 4;
                }
                if (R12 == ';') {
                    B();
                } else if (R12 != ',') {
                    throw new l(C2702w.a(this, new StringBuilder("Unterminated array at path ")));
                }
                i11 = 2;
                R11 = (char) R(true);
                if (R11 != ']') {
                }
                break;
            case 3:
            case 5:
                iArr[i15] = 4;
                if (i16 == 5) {
                    char R13 = (char) R(true);
                    c9681g.readByte();
                    if (R13 == '}') {
                        this.f60436i = 2;
                        return 2;
                    }
                    if (R13 != ',') {
                        if (R13 != ';') {
                            throw new l(C2702w.a(this, new StringBuilder("Unterminated object at path ")));
                        }
                        B();
                    }
                }
                char R14 = (char) R(true);
                if (R14 == '\"') {
                    c9681g.readByte();
                    i12 = 13;
                } else if (R14 == '\'') {
                    c9681g.readByte();
                    B();
                    i12 = 12;
                } else if (R14 != '}') {
                    B();
                    if (!Q(R14)) {
                        throw new l(C2702w.a(this, new StringBuilder("Expected name at path ")));
                    }
                    i12 = 14;
                } else {
                    if (i16 == 5) {
                        throw new l(C2702w.a(this, new StringBuilder("Expected name at path ")));
                    }
                    c9681g.readByte();
                    i12 = 2;
                }
                this.f60436i = i12;
                return i12;
            case 4:
                iArr[i15] = 5;
                char R15 = (char) R(true);
                c9681g.readByte();
                if (R15 != ':') {
                    if (R15 != '=') {
                        throw new l(C2702w.a(this, new StringBuilder("Expected ':' at path ")));
                    }
                    B();
                    if (interfaceC9683i.n(1L) && ((char) c9681g.o(0L)) == '>') {
                        c9681g.readByte();
                    }
                }
                i11 = 2;
                R11 = (char) R(true);
                if (R11 != ']') {
                }
                break;
            case 6:
                iArr[i15] = 7;
                i11 = 2;
                R11 = (char) R(true);
                if (R11 != ']') {
                }
                break;
            case 7:
                if (R(false) == -1) {
                    this.f60436i = 18;
                    return 18;
                }
                B();
                i11 = 2;
                R11 = (char) R(true);
                if (R11 != ']') {
                }
                break;
            case 8:
            default:
                if (i16 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                i11 = 2;
                R11 = (char) R(true);
                if (R11 != ']') {
                }
                break;
            case 9:
                u uVar = this.f60440m;
                Intrinsics.f(uVar);
                uVar.o();
                this.f60440m = null;
                this.f60420a--;
                return I();
        }
    }

    private final int L(String str, n.a aVar) {
        String[] b11 = aVar.b();
        int length = b11.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d(b11[i11], str)) {
                break;
            }
            i11++;
        }
        if (i11 <= -1) {
            return -1;
        }
        this.f60436i = 0;
        this.f60422c[this.f60420a - 1] = str;
        return i11;
    }

    private final int O(String str, n.a aVar) {
        String[] b11 = aVar.b();
        int length = b11.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d(b11[i11], str)) {
                break;
            }
            i11++;
        }
        if (i11 <= -1) {
            return -1;
        }
        this.f60436i = 0;
        int[] iArr = this.f60423d;
        int i12 = this.f60420a - 1;
        iArr[i12] = iArr[i12] + 1;
        return i11;
    }

    private final boolean Q(int i11) throws IOException {
        char c11 = (char) i11;
        if (c11 != '/' && c11 != '\\' && c11 != ';' && c11 != '#' && c11 != '=') {
            return (c11 == '{' || c11 == '}' || c11 == '[' || c11 == ']' || c11 == ':' || c11 == ',' || c11 == ' ' || c11 == '\t' || c11 == '\f' || c11 == '\r' || c11 == '\n') ? false : true;
        }
        B();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r9.skip(r2);
        r2 = com.squareup.moshi.p.f60432q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r10 != '/') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        if (r10 != '#') goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
    
        B();
        r2 = r8.F0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        if (r2 == (-1)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b3, code lost:
    
        r9.skip(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
    
        r2 = r9.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003c, code lost:
    
        if (r8.n(2) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0040, code lost:
    
        B();
        r11 = (char) r9.o(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004a, code lost:
    
        if (r11 != '*') goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        if (r11 != '/') goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        r9.readByte();
        r9.readByte();
        r2 = r8.F0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        if (r2 == (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        r9.skip(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        r2 = r9.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004c, code lost:
    
        r9.readByte();
        r9.readByte();
        r3 = r8.n0(com.squareup.moshi.p.f60433r);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005a, code lost:
    
        if (r3 == (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005c, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005f, code lost:
    
        if (r5 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0061, code lost:
    
        r3 = r3 + r2.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x006c, code lost:
    
        r9.skip(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006f, code lost:
    
        if (r5 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        throw new com.squareup.moshi.l(C.C2702w.a(r13, new java.lang.StringBuilder("Unterminated comment at path ")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0068, code lost:
    
        r3 = r9.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x005e, code lost:
    
        r5 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int R(boolean z11) {
        while (true) {
            long j11 = 0;
            while (true) {
                long j12 = j11 + 1;
                InterfaceC9683i interfaceC9683i = this.f60434g;
                if (!interfaceC9683i.n(j12)) {
                    if (z11) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                C9681g c9681g = this.f60435h;
                char o11 = (char) c9681g.o(j11);
                if (o11 != '\n' && o11 != ' ' && o11 != '\r' && o11 != '\t') {
                    break;
                }
                j11 = j12;
            }
        }
    }

    private final String W(C9684j c9684j) {
        StringBuilder sb2 = null;
        while (true) {
            long F02 = this.f60434g.F0(c9684j);
            if (F02 == -1) {
                throw new l(C2702w.a(this, new StringBuilder("Unterminated string at path ")));
            }
            C9681g c9681g = this.f60435h;
            if (((char) c9681g.o(F02)) != '\\') {
                if (sb2 == null) {
                    String I11 = c9681g.I(F02, Charsets.UTF_8);
                    c9681g.readByte();
                    return I11;
                }
                sb2.append(c9681g.I(F02, Charsets.UTF_8));
                c9681g.readByte();
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "{\n        builder.append…uilder.toString()\n      }");
                return sb3;
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(c9681g.I(F02, Charsets.UTF_8));
            c9681g.readByte();
            sb2.append(Z());
        }
    }

    private final String X() {
        long F02 = this.f60434g.F0(f60431p);
        C9681g c9681g = this.f60435h;
        if (F02 == -1) {
            return c9681g.G0();
        }
        c9681g.getClass();
        return c9681g.I(F02, Charsets.UTF_8);
    }

    private final char Z() {
        int i11;
        InterfaceC9683i interfaceC9683i = this.f60434g;
        if (!interfaceC9683i.n(1L)) {
            throw new l(C2702w.a(this, new StringBuilder("Unterminated escape sequence at path ")));
        }
        C9681g c9681g = this.f60435h;
        char readByte = (char) c9681g.readByte();
        if (readByte != 'u') {
            if (readByte == 't') {
                return '\t';
            }
            if (readByte == 'b') {
                return '\b';
            }
            if (readByte == 'n') {
                return '\n';
            }
            if (readByte == 'r') {
                return '\r';
            }
            if (readByte == 'f') {
                return '\f';
            }
            if (readByte == '\n' || readByte == '\'' || readByte == '\"' || readByte == '\\' || readByte == '/' || j()) {
                return readByte;
            }
            throw new l(C2702w.a(this, C2942q.e(Pk0.i.a("Invalid escape sequence: \\", readByte), " at path ")));
        }
        if (!interfaceC9683i.n(4L)) {
            throw new EOFException(C2702w.a(this, new StringBuilder("Unterminated escape sequence at path ")));
        }
        char c11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            char c12 = (char) (c11 << 4);
            char o11 = (char) c9681g.o(i12);
            if ('0' <= o11 && o11 < ':') {
                i11 = o11 - '0';
            } else if ('a' <= o11 && o11 < 'g') {
                i11 = o11 - 'W';
            } else {
                if ('A' > o11 || o11 >= 'G') {
                    c9681g.getClass();
                    throw new l(C2702w.a(this, C2942q.e("\\u".concat(c9681g.I(4L, Charsets.UTF_8)), " at path ")));
                }
                i11 = o11 - '7';
            }
            c11 = (char) (c12 + i11);
        }
        c9681g.skip(4L);
        return c11;
    }

    private final void b0(C9684j c9684j) {
        while (true) {
            long F02 = this.f60434g.F0(c9684j);
            if (F02 == -1) {
                throw new l(C2702w.a(this, new StringBuilder("Unterminated string at path ")));
            }
            C9681g c9681g = this.f60435h;
            char o11 = (char) c9681g.o(F02);
            c9681g.skip(F02 + 1);
            if (o11 != '\\') {
                return;
            } else {
                Z();
            }
        }
    }

    @Override // com.squareup.moshi.n
    public final void beginArray() {
        int i11 = this.f60436i;
        if (i11 == 0) {
            i11 = I();
        }
        if (i11 == 3) {
            s(1);
            this.f60423d[this.f60420a - 1] = 0;
            this.f60436i = 0;
        } else {
            throw new k("Expected BEGIN_ARRAY but was " + p() + " at path " + d());
        }
    }

    @Override // com.squareup.moshi.n
    public final void beginObject() {
        int i11 = this.f60436i;
        if (i11 == 0) {
            i11 = I();
        }
        if (i11 == 1) {
            s(3);
            this.f60436i = 0;
        } else {
            throw new k("Expected BEGIN_OBJECT but was " + p() + " at path " + d());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f60436i = 0;
        this.f60421b[0] = 8;
        this.f60420a = 1;
        this.f60435h.c();
        this.f60434g.close();
    }

    @Override // com.squareup.moshi.n
    public final void endArray() {
        int i11 = this.f60436i;
        if (i11 == 0) {
            i11 = I();
        }
        if (i11 != 4) {
            throw new k("Expected END_ARRAY but was " + p() + " at path " + d());
        }
        int i12 = this.f60420a;
        this.f60420a = i12 - 1;
        int[] iArr = this.f60423d;
        int i13 = i12 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f60436i = 0;
    }

    @Override // com.squareup.moshi.n
    public final void endObject() {
        int i11 = this.f60436i;
        if (i11 == 0) {
            i11 = I();
        }
        if (i11 != 2) {
            throw new k("Expected END_OBJECT but was " + p() + " at path " + d());
        }
        int i12 = this.f60420a;
        int i13 = i12 - 1;
        this.f60420a = i13;
        this.f60422c[i13] = null;
        int[] iArr = this.f60423d;
        int i14 = i12 - 2;
        iArr[i14] = iArr[i14] + 1;
        this.f60436i = 0;
    }

    @Override // com.squareup.moshi.n
    public final boolean hasNext() {
        int i11 = this.f60436i;
        if (i11 == 0) {
            i11 = I();
        }
        return (i11 == 2 || i11 == 4 || i11 == 18) ? false : true;
    }

    @Override // com.squareup.moshi.n
    public final boolean k() {
        int i11 = this.f60436i;
        if (i11 == 0) {
            i11 = I();
        }
        if (i11 == 5) {
            this.f60436i = 0;
            int[] iArr = this.f60423d;
            int i12 = this.f60420a - 1;
            iArr[i12] = iArr[i12] + 1;
            return true;
        }
        if (i11 == 6) {
            this.f60436i = 0;
            int[] iArr2 = this.f60423d;
            int i13 = this.f60420a - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return false;
        }
        throw new k("Expected a boolean but was " + p() + " at path " + d());
    }

    @Override // com.squareup.moshi.n
    public final void m() {
        int i11 = this.f60436i;
        if (i11 == 0) {
            i11 = I();
        }
        if (i11 == 7) {
            this.f60436i = 0;
            int[] iArr = this.f60423d;
            int i12 = this.f60420a - 1;
            iArr[i12] = iArr[i12] + 1;
            return;
        }
        throw new k("Expected null but was " + p() + " at path " + d());
    }

    @Override // com.squareup.moshi.n
    public final double nextDouble() {
        String I11;
        int i11 = this.f60436i;
        if (i11 == 0) {
            i11 = I();
        }
        if (i11 == 16) {
            this.f60436i = 0;
            int[] iArr = this.f60423d;
            int i12 = this.f60420a - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f60437j;
        }
        if (i11 != 17) {
            switch (i11) {
                case 8:
                    I11 = W(f60429n);
                    this.f60439l = I11;
                    break;
                case 9:
                    I11 = W(f60430o);
                    this.f60439l = I11;
                    break;
                case 10:
                    I11 = X();
                    this.f60439l = I11;
                    break;
                case 11:
                    I11 = this.f60439l;
                    break;
                default:
                    throw new k("Expected a double but was " + p() + " at path " + d());
            }
        } else {
            long j11 = this.f60438k;
            C9681g c9681g = this.f60435h;
            c9681g.getClass();
            I11 = c9681g.I(j11, Charsets.UTF_8);
            this.f60439l = I11;
        }
        this.f60436i = 11;
        try {
            double parseDouble = Double.parseDouble(I11);
            if (!j() && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new l(C2702w.a(this, Cm.e.e(parseDouble, "JSON forbids NaN and infinities: ", " at path ")));
            }
            this.f60439l = null;
            this.f60436i = 0;
            int[] iArr2 = this.f60423d;
            int i13 = this.f60420a - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new k(C2702w.a(this, C6594f.b("Expected a double but was ", I11, " at path ")));
        }
    }

    @Override // com.squareup.moshi.n
    public final int nextInt() {
        String W11;
        int i11 = this.f60436i;
        if (i11 == 0) {
            i11 = I();
        }
        if (i11 == 16) {
            long j11 = this.f60437j;
            int i12 = (int) j11;
            if (j11 == i12) {
                this.f60436i = 0;
                int[] iArr = this.f60423d;
                int i13 = this.f60420a - 1;
                iArr[i13] = iArr[i13] + 1;
                return i12;
            }
            throw new k("Expected an int but was " + this.f60437j + " at path " + d());
        }
        if (i11 == 8 || i11 == 9) {
            W11 = i11 == 9 ? W(f60430o) : W(f60429n);
            this.f60439l = W11;
            try {
                int parseInt = Integer.parseInt(W11);
                this.f60436i = 0;
                int[] iArr2 = this.f60423d;
                int i14 = this.f60420a - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i11 == 11) {
            W11 = this.f60439l;
        } else {
            if (i11 != 17) {
                throw new k("Expected an int but was " + p() + " at path " + d());
            }
            long j12 = this.f60438k;
            C9681g c9681g = this.f60435h;
            c9681g.getClass();
            W11 = c9681g.I(j12, Charsets.UTF_8);
            this.f60439l = W11;
        }
        this.f60436i = 11;
        try {
            double parseDouble = Double.parseDouble(W11);
            int i15 = (int) parseDouble;
            if (i15 != parseDouble) {
                throw new k(C2702w.a(this, C6594f.b("Expected an int but was ", W11, " at path ")));
            }
            this.f60439l = null;
            this.f60436i = 0;
            int[] iArr3 = this.f60423d;
            int i16 = this.f60420a - 1;
            iArr3[i16] = iArr3[i16] + 1;
            return i15;
        } catch (NumberFormatException unused2) {
            throw new k(C2702w.a(this, C6594f.b("Expected an int but was ", W11, " at path ")));
        }
    }

    @Override // com.squareup.moshi.n
    public final long nextLong() {
        int i11 = this.f60436i;
        if (i11 == 0) {
            i11 = I();
        }
        if (i11 == 16) {
            this.f60436i = 0;
            int[] iArr = this.f60423d;
            int i12 = this.f60420a - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f60437j;
        }
        if (i11 == 17) {
            long j11 = this.f60438k;
            C9681g c9681g = this.f60435h;
            c9681g.getClass();
            this.f60439l = c9681g.I(j11, Charsets.UTF_8);
        } else if (i11 == 9 || i11 == 8) {
            String W11 = W(i11 == 9 ? f60430o : f60429n);
            this.f60439l = W11;
            try {
                Intrinsics.f(W11);
                long parseLong = Long.parseLong(W11);
                this.f60436i = 0;
                int[] iArr2 = this.f60423d;
                int i13 = this.f60420a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i11 != 11) {
            throw new k("Expected a long but was " + p() + " at path " + d());
        }
        this.f60436i = 11;
        try {
            long longValueExact = new BigDecimal(this.f60439l).longValueExact();
            this.f60439l = null;
            this.f60436i = 0;
            int[] iArr3 = this.f60423d;
            int i14 = this.f60420a - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return longValueExact;
        } catch (ArithmeticException unused2) {
            throw new k("Expected a long but was " + this.f60439l + " at path " + d());
        } catch (NumberFormatException unused3) {
            throw new k("Expected a long but was " + this.f60439l + " at path " + d());
        }
    }

    @Override // com.squareup.moshi.n
    @NotNull
    public final String nextName() throws IOException {
        String W11;
        int i11 = this.f60436i;
        if (i11 == 0) {
            i11 = I();
        }
        switch (i11) {
            case 12:
                W11 = W(f60429n);
                break;
            case 13:
                W11 = W(f60430o);
                break;
            case 14:
                W11 = X();
                break;
            case 15:
                W11 = this.f60439l;
                Intrinsics.f(W11);
                this.f60439l = null;
                break;
            default:
                throw new k("Expected a name but was " + p() + " at path " + d());
        }
        this.f60436i = 0;
        this.f60422c[this.f60420a - 1] = W11;
        return W11;
    }

    @Override // com.squareup.moshi.n
    @NotNull
    public final String nextString() {
        String valueOf;
        int i11 = this.f60436i;
        if (i11 == 0) {
            i11 = I();
        }
        if (i11 == 16) {
            valueOf = String.valueOf(this.f60437j);
        } else if (i11 != 17) {
            switch (i11) {
                case 8:
                    valueOf = W(f60429n);
                    break;
                case 9:
                    valueOf = W(f60430o);
                    break;
                case 10:
                    valueOf = X();
                    break;
                case 11:
                    valueOf = this.f60439l;
                    Intrinsics.f(valueOf);
                    this.f60439l = null;
                    break;
                default:
                    throw new k("Expected a string but was " + p() + " at path " + d());
            }
        } else {
            long j11 = this.f60438k;
            C9681g c9681g = this.f60435h;
            c9681g.getClass();
            valueOf = c9681g.I(j11, Charsets.UTF_8);
        }
        this.f60436i = 0;
        int[] iArr = this.f60423d;
        int i12 = this.f60420a - 1;
        iArr[i12] = iArr[i12] + 1;
        return valueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    @Override // com.squareup.moshi.n
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC9683i o() {
        int i11;
        int i12 = this.f60436i;
        if (i12 == 0) {
            i12 = I();
        }
        C9681g sink = new C9681g();
        int i13 = u.f60458n;
        C9684j b11 = u.a.b();
        if (i12 == 1) {
            sink.H0("{");
            b11 = u.a.c();
        } else {
            if (i12 != 3) {
                if (i12 != 16 && i12 != 17) {
                    switch (i12) {
                        case 5:
                            sink.H0("true");
                            break;
                        case 6:
                            sink.H0("false");
                            break;
                        case 7:
                            sink.H0("null");
                            break;
                        case 8:
                            sink.H0("'");
                            b11 = u.a.d();
                            break;
                        case 9:
                            sink.H0("\"");
                            b11 = u.a.a();
                            break;
                        case 10:
                            break;
                        case 11:
                            String nextString = nextString();
                            Intrinsics.checkNotNullParameter(sink, "sink");
                            q qVar = new q(sink);
                            try {
                                qVar.R(nextString);
                                qVar.close();
                                break;
                            } finally {
                            }
                        default:
                            throw new k("Expected a value but was " + p() + " at path " + d());
                    }
                    i11 = 0;
                    if (this.f60436i != 0) {
                        int[] iArr = this.f60423d;
                        int i14 = this.f60420a - 1;
                        iArr[i14] = iArr[i14] + 1;
                        this.f60436i = 0;
                    }
                    u uVar = new u(this.f60434g, sink, b11, i11);
                    this.f60440m = uVar;
                    s(9);
                    return sf.z.d(uVar);
                }
                sink.H0(nextString());
                i11 = 0;
                if (this.f60436i != 0) {
                }
                u uVar2 = new u(this.f60434g, sink, b11, i11);
                this.f60440m = uVar2;
                s(9);
                return sf.z.d(uVar2);
            }
            sink.H0("[");
            b11 = u.a.c();
        }
        i11 = 1;
        if (this.f60436i != 0) {
        }
        u uVar22 = new u(this.f60434g, sink, b11, i11);
        this.f60440m = uVar22;
        s(9);
        return sf.z.d(uVar22);
    }

    @Override // com.squareup.moshi.n
    @NotNull
    public final n.b p() {
        int i11 = this.f60436i;
        if (i11 == 0) {
            i11 = I();
        }
        switch (i11) {
            case 1:
                return n.b.BEGIN_OBJECT;
            case 2:
                return n.b.END_OBJECT;
            case 3:
                return n.b.BEGIN_ARRAY;
            case 4:
                return n.b.END_ARRAY;
            case 5:
            case 6:
                return n.b.BOOLEAN;
            case 7:
                return n.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return n.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return n.b.NAME;
            case 16:
            case 17:
                return n.b.NUMBER;
            case 18:
                return n.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.squareup.moshi.n
    @NotNull
    public final n q() {
        return new p(this);
    }

    @Override // com.squareup.moshi.n
    public final void r() {
        if (hasNext()) {
            this.f60439l = nextName();
            this.f60436i = 11;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.squareup.moshi.n
    public final void skipValue() {
        if (c()) {
            throw new k("Cannot skip unexpected " + p() + " at " + d());
        }
        int i11 = 0;
        do {
            int i12 = this.f60436i;
            if (i12 == 0) {
                i12 = I();
            }
            C9681g c9681g = this.f60435h;
            switch (i12) {
                case 1:
                    s(3);
                    i11++;
                    this.f60436i = 0;
                    break;
                case 2:
                    i11--;
                    if (i11 < 0) {
                        throw new k("Expected a value but was " + p() + " at path " + d());
                    }
                    this.f60420a--;
                    this.f60436i = 0;
                    break;
                case 3:
                    s(1);
                    i11++;
                    this.f60436i = 0;
                    break;
                case 4:
                    i11--;
                    if (i11 < 0) {
                        throw new k("Expected a value but was " + p() + " at path " + d());
                    }
                    this.f60420a--;
                    this.f60436i = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                case 16:
                default:
                    this.f60436i = 0;
                    break;
                case 8:
                case 12:
                    b0(f60429n);
                    this.f60436i = 0;
                    break;
                case 9:
                case 13:
                    b0(f60430o);
                    this.f60436i = 0;
                    break;
                case 10:
                case 14:
                    long F02 = this.f60434g.F0(f60431p);
                    if (F02 == -1) {
                        F02 = c9681g.size();
                    }
                    c9681g.skip(F02);
                    this.f60436i = 0;
                    break;
                case 17:
                    c9681g.skip(this.f60438k);
                    this.f60436i = 0;
                    break;
                case 18:
                    throw new k("Expected a value but was " + p() + " at path " + d());
            }
        } while (i11 != 0);
        int[] iArr = this.f60423d;
        int i13 = this.f60420a - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f60422c[i13] = "null";
    }

    @NotNull
    public final String toString() {
        return "JsonReader(" + this.f60434g + ')';
    }

    @Override // com.squareup.moshi.n
    public final int v(@NotNull n.a options) throws IOException {
        Intrinsics.checkNotNullParameter(options, "options");
        int i11 = this.f60436i;
        if (i11 == 0) {
            i11 = I();
        }
        if (i11 < 12 || i11 > 15) {
            return -1;
        }
        if (i11 == 15) {
            return L(this.f60439l, options);
        }
        int R02 = this.f60434g.R0(options.a());
        if (R02 != -1) {
            this.f60436i = 0;
            this.f60422c[this.f60420a - 1] = options.b()[R02];
            return R02;
        }
        String str = this.f60422c[this.f60420a - 1];
        String nextName = nextName();
        int L11 = L(nextName, options);
        if (L11 == -1) {
            this.f60436i = 15;
            this.f60439l = nextName;
            this.f60422c[this.f60420a - 1] = str;
        }
        return L11;
    }

    @Override // com.squareup.moshi.n
    public final int w(@NotNull n.a options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int i11 = this.f60436i;
        if (i11 == 0) {
            i11 = I();
        }
        if (i11 < 8 || i11 > 11) {
            return -1;
        }
        if (i11 == 11) {
            return O(this.f60439l, options);
        }
        int R02 = this.f60434g.R0(options.a());
        if (R02 != -1) {
            this.f60436i = 0;
            int[] iArr = this.f60423d;
            int i12 = this.f60420a - 1;
            iArr[i12] = iArr[i12] + 1;
            return R02;
        }
        String nextString = nextString();
        int O11 = O(nextString, options);
        if (O11 == -1) {
            this.f60436i = 11;
            this.f60439l = nextString;
            this.f60423d[this.f60420a - 1] = r0[r1] - 1;
        }
        return O11;
    }

    @Override // com.squareup.moshi.n
    public final void y() throws IOException {
        if (c()) {
            n.b p11 = p();
            nextName();
            StringBuilder sb2 = new StringBuilder("Cannot skip unexpected ");
            sb2.append(p11);
            sb2.append(" at ");
            throw new k(C2702w.a(this, sb2));
        }
        int i11 = this.f60436i;
        if (i11 == 0) {
            i11 = I();
        }
        if (i11 == 14) {
            long F02 = this.f60434g.F0(f60431p);
            C9681g c9681g = this.f60435h;
            if (F02 == -1) {
                F02 = c9681g.size();
            }
            c9681g.skip(F02);
        } else if (i11 == 13) {
            b0(f60430o);
        } else if (i11 == 12) {
            b0(f60429n);
        } else if (i11 != 15) {
            throw new k("Expected a name but was " + p() + " at path " + d());
        }
        this.f60436i = 0;
        this.f60422c[this.f60420a - 1] = "null";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull p copyFrom) {
        super(copyFrom);
        Intrinsics.checkNotNullParameter(copyFrom, "copyFrom");
        G peek = copyFrom.f60434g.peek();
        this.f60434g = peek;
        this.f60435h = peek.f98667b;
        this.f60436i = copyFrom.f60436i;
        this.f60437j = copyFrom.f60437j;
        this.f60438k = copyFrom.f60438k;
        this.f60439l = copyFrom.f60439l;
        try {
            peek.r1(copyFrom.f60435h.size());
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
