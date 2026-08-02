package com.airbnb.lottie.parser.moshi;

import androidx.annotation.Nullable;
import androidx.credentials.provider.CredentialEntry;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import okio.ByteString;
import ru.ok.android.api.json.JsonToken;
import xsna.e8f0;
import xsna.emb;
import xsna.i9y;
import xsna.lby;
import xsna.vl8;
import xsna.w8y;

/* compiled from: JsonUtf8Reader.java */
/* loaded from: classes12.dex */
public final class a extends JsonReader {
    public static final ByteString m;
    public static final ByteString n;
    public static final ByteString o;
    public final e8f0 g;
    public final vl8 h;
    public int i;
    public long j;
    public int k;

    @Nullable
    public String l;

    static {
        Charset charset = emb.b;
        ByteString byteString = new ByteString("'\\".getBytes(charset));
        byteString.c = "'\\";
        m = byteString;
        ByteString byteString2 = new ByteString("\"\\".getBytes(charset));
        byteString2.c = "\"\\";
        n = byteString2;
        ByteString byteString3 = new ByteString("{}[]:, \n\t\r\f/\\;#=".getBytes(charset));
        byteString3.c = "{}[]:, \n\t\r\f/\\;#=";
        o = byteString3;
        "\n\r".getBytes(charset);
        "*/".getBytes(charset);
    }

    public a(e8f0 e8f0Var) {
        this.c = new int[32];
        this.d = new String[32];
        this.e = new int[32];
        this.i = 0;
        this.g = e8f0Var;
        this.h = e8f0Var.c;
        r(6);
    }

    public final String A() throws IOException {
        String str;
        int i = this.i;
        if (i == 0) {
            i = x();
        }
        if (i == 14) {
            str = I();
        } else if (i == 13) {
            str = H(n);
        } else if (i == 12) {
            str = H(m);
        } else {
            if (i != 15) {
                throw new w8y("Expected a name but was " + q() + " at path " + getPath());
            }
            str = this.l;
        }
        this.i = 0;
        this.d[this.b - 1] = str;
        return str;
    }

    public final int E(boolean z) throws IOException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            e8f0 e8f0Var = this.g;
            if (!e8f0Var.o3(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            vl8 vl8Var = this.h;
            byte q = vl8Var.q(j);
            if (q != 10 && q != 32 && q != 13 && q != 9) {
                vl8Var.skip(j);
                if (q == 47) {
                    if (e8f0Var.o3(2L)) {
                        w();
                        throw null;
                    }
                } else if (q == 35) {
                    w();
                    throw null;
                }
                return q;
            }
            i = i2;
        }
    }

    public final String H(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long d = this.g.d(byteString);
            if (d == -1) {
                v("Unterminated string");
                throw null;
            }
            vl8 vl8Var = this.h;
            if (vl8Var.q(d) != 92) {
                if (sb == null) {
                    String w = vl8Var.w(d, emb.b);
                    vl8Var.readByte();
                    return w;
                }
                sb.append(vl8Var.w(d, emb.b));
                vl8Var.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(vl8Var.w(d, emb.b));
            vl8Var.readByte();
            sb.append(J());
        }
    }

    public final String I() throws IOException {
        long d = this.g.d(o);
        vl8 vl8Var = this.h;
        if (d == -1) {
            return vl8Var.x();
        }
        vl8Var.getClass();
        return vl8Var.w(d, emb.b);
    }

    public final char J() throws IOException {
        int i;
        e8f0 e8f0Var = this.g;
        if (!e8f0Var.o3(1L)) {
            v("Unterminated escape sequence");
            throw null;
        }
        vl8 vl8Var = this.h;
        byte readByte = vl8Var.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            v("Invalid escape sequence: \\" + ((char) readByte));
            throw null;
        }
        if (!e8f0Var.o3(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte q = vl8Var.q(i2);
            char c2 = (char) (c << 4);
            if (q >= 48 && q <= 57) {
                i = q - 48;
            } else if (q >= 97 && q <= 102) {
                i = q - 87;
            } else {
                if (q < 65 || q > 70) {
                    v("\\u".concat(vl8Var.w(4L, emb.b)));
                    throw null;
                }
                i = q - 55;
            }
            c = (char) (i + c2);
        }
        vl8Var.skip(4L);
        return c;
    }

    public final void L(ByteString byteString) throws IOException {
        while (true) {
            long d = this.g.d(byteString);
            if (d == -1) {
                v("Unterminated string");
                throw null;
            }
            vl8 vl8Var = this.h;
            if (vl8Var.q(d) != 92) {
                vl8Var.skip(d + 1);
                return;
            } else {
                vl8Var.skip(d + 1);
                J();
            }
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void beginArray() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = x();
        }
        if (i == 3) {
            r(1);
            this.e[this.b - 1] = 0;
            this.i = 0;
        } else {
            throw new w8y("Expected BEGIN_ARRAY but was " + q() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void beginObject() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = x();
        }
        if (i == 1) {
            r(3);
            this.i = 0;
        } else {
            throw new w8y("Expected BEGIN_OBJECT but was " + q() + " at path " + getPath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.i = 0;
        this.c[0] = 8;
        this.b = 1;
        this.h.m();
        this.g.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void endArray() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = x();
        }
        if (i != 4) {
            throw new w8y("Expected END_ARRAY but was " + q() + " at path " + getPath());
        }
        int i2 = this.b;
        this.b = i2 - 1;
        int[] iArr = this.e;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.i = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void endObject() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = x();
        }
        if (i != 2) {
            throw new w8y("Expected END_OBJECT but was " + q() + " at path " + getPath());
        }
        int i2 = this.b;
        int i3 = i2 - 1;
        this.b = i3;
        this.d[i3] = null;
        int[] iArr = this.e;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.i = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean hasNext() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = x();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean m() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = x();
        }
        if (i == 5) {
            this.i = 0;
            int[] iArr = this.e;
            int i2 = this.b - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.i = 0;
            int[] iArr2 = this.e;
            int i3 = this.b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new w8y("Expected a boolean but was " + q() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final double n() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = x();
        }
        if (i == 16) {
            this.i = 0;
            int[] iArr = this.e;
            int i2 = this.b - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j;
        }
        if (i == 17) {
            long j = this.k;
            vl8 vl8Var = this.h;
            vl8Var.getClass();
            this.l = vl8Var.w(j, emb.b);
        } else if (i == 9) {
            this.l = H(n);
        } else if (i == 8) {
            this.l = H(m);
        } else if (i == 10) {
            this.l = I();
        } else if (i != 11) {
            throw new w8y("Expected a double but was " + q() + " at path " + getPath());
        }
        this.i = 11;
        try {
            double parseDouble = Double.parseDouble(this.l);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                StringBuilder a = lby.a("JSON forbids NaN and infinities: ", parseDouble, " at path ");
                a.append(getPath());
                throw new i9y(a.toString());
            }
            this.l = null;
            this.i = 0;
            int[] iArr2 = this.e;
            int i3 = this.b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new w8y("Expected a double but was " + this.l + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int o() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = x();
        }
        if (i == 16) {
            long j = this.j;
            int i2 = (int) j;
            if (j == i2) {
                this.i = 0;
                int[] iArr = this.e;
                int i3 = this.b - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new w8y("Expected an int but was " + this.j + " at path " + getPath());
        }
        if (i == 17) {
            long j2 = this.k;
            vl8 vl8Var = this.h;
            vl8Var.getClass();
            this.l = vl8Var.w(j2, emb.b);
        } else if (i == 9 || i == 8) {
            String H = i == 9 ? H(n) : H(m);
            this.l = H;
            try {
                int parseInt = Integer.parseInt(H);
                this.i = 0;
                int[] iArr2 = this.e;
                int i4 = this.b - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new w8y("Expected an int but was " + q() + " at path " + getPath());
        }
        this.i = 11;
        try {
            double parseDouble = Double.parseDouble(this.l);
            int i5 = (int) parseDouble;
            if (i5 != parseDouble) {
                throw new w8y("Expected an int but was " + this.l + " at path " + getPath());
            }
            this.l = null;
            this.i = 0;
            int[] iArr3 = this.e;
            int i6 = this.b - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new w8y("Expected an int but was " + this.l + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String p() throws IOException {
        String w;
        int i = this.i;
        if (i == 0) {
            i = x();
        }
        if (i == 10) {
            w = I();
        } else if (i == 9) {
            w = H(n);
        } else if (i == 8) {
            w = H(m);
        } else if (i == 11) {
            w = this.l;
            this.l = null;
        } else if (i == 16) {
            w = Long.toString(this.j);
        } else {
            if (i != 17) {
                throw new w8y("Expected a string but was " + q() + " at path " + getPath());
            }
            long j = this.k;
            vl8 vl8Var = this.h;
            vl8Var.getClass();
            w = vl8Var.w(j, emb.b);
        }
        this.i = 0;
        int[] iArr = this.e;
        int i2 = this.b - 1;
        iArr[i2] = iArr[i2] + 1;
        return w;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final JsonReader.Token q() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = x();
        }
        switch (i) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int s(JsonReader.a aVar) throws IOException {
        int i = this.i;
        if (i == 0) {
            i = x();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return y(this.l, aVar);
        }
        int F3 = this.g.F3(aVar.b);
        if (F3 != -1) {
            this.i = 0;
            this.d[this.b - 1] = aVar.a[F3];
            return F3;
        }
        String str = this.d[this.b - 1];
        String A = A();
        int y = y(A, aVar);
        if (y == -1) {
            this.i = 15;
            this.l = A;
            this.d[this.b - 1] = str;
        }
        return y;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void skipValue() throws IOException {
        int i = 0;
        do {
            int i2 = this.i;
            if (i2 == 0) {
                i2 = x();
            }
            if (i2 == 3) {
                r(1);
            } else if (i2 == 1) {
                r(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        throw new w8y("Expected a value but was " + q() + " at path " + getPath());
                    }
                    this.b--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        throw new w8y("Expected a value but was " + q() + " at path " + getPath());
                    }
                    this.b--;
                } else {
                    vl8 vl8Var = this.h;
                    if (i2 == 14 || i2 == 10) {
                        long d = this.g.d(o);
                        if (d == -1) {
                            d = vl8Var.c;
                        }
                        vl8Var.skip(d);
                    } else if (i2 == 9 || i2 == 13) {
                        L(n);
                    } else if (i2 == 8 || i2 == 12) {
                        L(m);
                    } else if (i2 == 17) {
                        vl8Var.skip(this.k);
                    } else if (i2 == 18) {
                        throw new w8y("Expected a value but was " + q() + " at path " + getPath());
                    }
                }
                this.i = 0;
            }
            i++;
            this.i = 0;
        } while (i != 0);
        int[] iArr = this.e;
        int i3 = this.b - 1;
        iArr[i3] = iArr[i3] + 1;
        this.d[i3] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void t() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = x();
        }
        if (i == 14) {
            long d = this.g.d(o);
            vl8 vl8Var = this.h;
            if (d == -1) {
                d = vl8Var.c;
            }
            vl8Var.skip(d);
        } else if (i == 13) {
            L(n);
        } else if (i == 12) {
            L(m);
        } else if (i != 15) {
            throw new w8y("Expected a name but was " + q() + " at path " + getPath());
        }
        this.i = 0;
        this.d[this.b - 1] = "null";
    }

    public final String toString() {
        return "JsonReader(" + this.g + ")";
    }

    public final void w() throws IOException {
        v("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bb, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01be, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c0, code lost:
    
        r22.k = r2;
        r9 = 17;
        r22.i = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0195, code lost:
    
        if (z(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0197, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0199, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019f, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a1, code lost:
    
        if (r13 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a5, code lost:
    
        if (r8 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a7, code lost:
    
        if (r13 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a9, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ac, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ad, code lost:
    
        r22.j = r8;
        r7.skip(r2);
        r9 = 16;
        r22.i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b8, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int x() throws IOException {
        int i;
        String str;
        String str2;
        long j;
        char q;
        int i2;
        char c;
        int[] iArr = this.c;
        int i3 = this.b - 1;
        int i4 = iArr[i3];
        vl8 vl8Var = this.h;
        if (i4 == 1) {
            iArr[i3] = 2;
        } else if (i4 == 2) {
            int E = E(true);
            vl8Var.readByte();
            if (E != 44) {
                if (E == 59) {
                    w();
                    throw null;
                }
                if (E == 93) {
                    this.i = 4;
                    return 4;
                }
                v("Unterminated array");
                throw null;
            }
        } else {
            if (i4 == 3 || i4 == 5) {
                iArr[i3] = 4;
                if (i4 == 5) {
                    int E2 = E(true);
                    vl8Var.readByte();
                    if (E2 != 44) {
                        if (E2 == 59) {
                            w();
                            throw null;
                        }
                        if (E2 == 125) {
                            this.i = 2;
                            return 2;
                        }
                        v("Unterminated object");
                        throw null;
                    }
                }
                int E3 = E(true);
                if (E3 == 34) {
                    vl8Var.readByte();
                    this.i = 13;
                    return 13;
                }
                if (E3 == 39) {
                    vl8Var.readByte();
                    w();
                    throw null;
                }
                if (E3 != 125) {
                    w();
                    throw null;
                }
                if (i4 == 5) {
                    v("Expected name");
                    throw null;
                }
                vl8Var.readByte();
                this.i = 2;
                return 2;
            }
            if (i4 == 4) {
                iArr[i3] = 5;
                int E4 = E(true);
                vl8Var.readByte();
                if (E4 != 58) {
                    if (E4 != 61) {
                        v("Expected ':'");
                        throw null;
                    }
                    w();
                    throw null;
                }
            } else if (i4 == 6) {
                iArr[i3] = 7;
            } else {
                if (i4 == 7) {
                    if (E(false) == -1) {
                        this.i = 18;
                        return 18;
                    }
                    w();
                    throw null;
                }
                if (i4 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int E5 = E(true);
        if (E5 == 34) {
            vl8Var.readByte();
            this.i = 9;
            return 9;
        }
        if (E5 == 39) {
            w();
            throw null;
        }
        if (E5 != 44 && E5 != 59) {
            if (E5 == 91) {
                vl8Var.readByte();
                this.i = 3;
                return 3;
            }
            if (E5 != 93) {
                if (E5 == 123) {
                    vl8Var.readByte();
                    this.i = 1;
                    return 1;
                }
                byte q2 = vl8Var.q(0L);
                e8f0 e8f0Var = this.g;
                if (q2 == 116 || q2 == 84) {
                    i = 5;
                    str2 = "true";
                    str = "TRUE";
                } else if (q2 == 102 || q2 == 70) {
                    i = 6;
                    str2 = CredentialEntry.FALSE_STRING;
                    str = "FALSE";
                } else if (q2 == 110 || q2 == 78) {
                    i = 7;
                    str2 = "null";
                    str = "NULL";
                } else {
                    j = 0;
                    i = 0;
                    if (i == 0) {
                        return i;
                    }
                    boolean z = true;
                    long j2 = j;
                    char c2 = 0;
                    int i5 = 0;
                    boolean z2 = false;
                    while (true) {
                        int i6 = i5 + 1;
                        if (!e8f0Var.o3(i6)) {
                            break;
                        }
                        byte q3 = vl8Var.q(i5);
                        if (q3 != 43) {
                            if (q3 == 69 || q3 == 101) {
                                c = 6;
                                if (c2 != 2 && c2 != 4) {
                                    break;
                                }
                                c2 = 5;
                                i5 = i6;
                            } else if (q3 == 45) {
                                c = 6;
                                if (c2 == 0) {
                                    c2 = 1;
                                    z2 = true;
                                    i5 = i6;
                                } else {
                                    if (c2 != 5) {
                                        break;
                                    }
                                    c2 = c;
                                    i5 = i6;
                                }
                            } else if (q3 == 46) {
                                c = 6;
                                if (c2 != 2) {
                                    break;
                                }
                                c2 = 3;
                                i5 = i6;
                            } else {
                                if (q3 < 48 || q3 > 57) {
                                    break;
                                }
                                if (c2 == 1 || c2 == 0) {
                                    c = 6;
                                    j2 = -(q3 - 48);
                                    c2 = 2;
                                } else {
                                    if (c2 == 2) {
                                        if (j2 == j) {
                                            break;
                                        }
                                        long j3 = (10 * j2) - (q3 - 48);
                                        z &= j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2);
                                        j2 = j3;
                                    } else if (c2 == 3) {
                                        c2 = 4;
                                    } else {
                                        c = 6;
                                        if (c2 == 5 || c2 == 6) {
                                            c2 = 7;
                                        }
                                    }
                                    c = 6;
                                    i5 = i6;
                                }
                                i5 = i6;
                            }
                            if (i2 == 0) {
                                return i2;
                            }
                            if (z(vl8Var.q(j))) {
                                w();
                                throw null;
                            }
                            v("Expected value");
                            throw null;
                        }
                        c = 6;
                        if (c2 != 5) {
                            break;
                        }
                        c2 = c;
                        i5 = i6;
                    }
                    i2 = 0;
                    if (i2 == 0) {
                    }
                }
                int length = str2.length();
                j = 0;
                int i7 = 1;
                while (true) {
                    if (i7 < length) {
                        int i8 = i7 + 1;
                        if (!e8f0Var.o3(i8) || ((q = vl8Var.q(i7)) != str2.charAt(i7) && q != str.charAt(i7))) {
                            break;
                        }
                        i7 = i8;
                    } else if (!e8f0Var.o3(length + 1) || !z(vl8Var.q(length))) {
                        vl8Var.skip(length);
                        this.i = i;
                    }
                }
                i = 0;
                if (i == 0) {
                }
            } else if (i4 == 1) {
                vl8Var.readByte();
                this.i = 4;
                return 4;
            }
        }
        if (i4 == 1 || i4 == 2) {
            w();
            throw null;
        }
        v("Unexpected value");
        throw null;
    }

    public final int y(String str, JsonReader.a aVar) {
        int length = aVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.a[i])) {
                this.i = 0;
                this.d[this.b - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean z(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case JsonToken.BEGIN_ARRAY /* 91 */:
                        case JsonToken.END_ARRAY /* 93 */:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        w();
        throw null;
    }
}
