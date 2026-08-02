package com.airbnb.lottie.parser.moshi;

import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;
import xsna.ho8;
import xsna.i9y;
import xsna.vl8;
import xsna.w8y;
import xsna.zt80;

/* loaded from: classes12.dex */
public abstract class JsonReader implements Closeable {
    public static final String[] f = new String[128];
    public int b;
    public int[] c;
    public String[] d;
    public int[] e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Token {
        private static final /* synthetic */ Token[] $VALUES;
        public static final Token BEGIN_ARRAY;
        public static final Token BEGIN_OBJECT;
        public static final Token BOOLEAN;
        public static final Token END_ARRAY;
        public static final Token END_DOCUMENT;
        public static final Token END_OBJECT;
        public static final Token NAME;
        public static final Token NULL;
        public static final Token NUMBER;
        public static final Token STRING;

        static {
            Token token = new Token("BEGIN_ARRAY", 0);
            BEGIN_ARRAY = token;
            Token token2 = new Token("END_ARRAY", 1);
            END_ARRAY = token2;
            Token token3 = new Token("BEGIN_OBJECT", 2);
            BEGIN_OBJECT = token3;
            Token token4 = new Token("END_OBJECT", 3);
            END_OBJECT = token4;
            Token token5 = new Token("NAME", 4);
            NAME = token5;
            Token token6 = new Token("STRING", 5);
            STRING = token6;
            Token token7 = new Token("NUMBER", 6);
            NUMBER = token7;
            Token token8 = new Token("BOOLEAN", 7);
            BOOLEAN = token8;
            Token token9 = new Token("NULL", 8);
            NULL = token9;
            Token token10 = new Token("END_DOCUMENT", 9);
            END_DOCUMENT = token10;
            $VALUES = new Token[]{token, token2, token3, token4, token5, token6, token7, token8, token9, token10};
        }

        public Token() {
            throw null;
        }

        public static Token valueOf(String str) {
            return (Token) Enum.valueOf(Token.class, str);
        }

        public static Token[] values() {
            return (Token[]) $VALUES.clone();
        }
    }

    public static final class a {
        public final String[] a;
        public final zt80 b;

        public a(String[] strArr, zt80 zt80Var) {
            this.a = strArr;
            this.b = zt80Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x0042, B:15:0x003a, B:16:0x003d, B:27:0x0047, B:29:0x004a, B:32:0x005b), top: B:1:0x0000 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static a a(String... strArr) {
            String str;
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                vl8 vl8Var = new vl8();
                for (int i = 0; i < strArr.length; i++) {
                    String str2 = strArr[i];
                    String[] strArr2 = JsonReader.f;
                    vl8Var.I(34);
                    int length = str2.length();
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        char charAt = str2.charAt(i3);
                        if (charAt < 128) {
                            str = strArr2[charAt];
                            if (str == null) {
                            }
                            if (i2 < i3) {
                                vl8Var.Q(i2, i3, str2);
                            }
                            vl8Var.S(str);
                            i2 = i3 + 1;
                        } else {
                            if (charAt == 8232) {
                                str = "\\u2028";
                            } else if (charAt == 8233) {
                                str = "\\u2029";
                            }
                            if (i2 < i3) {
                            }
                            vl8Var.S(str);
                            i2 = i3 + 1;
                        }
                    }
                    if (i2 < length) {
                        vl8Var.Q(i2, length, str2);
                    }
                    vl8Var.I(34);
                    vl8Var.readByte();
                    byteStringArr[i] = vl8Var.F0(vl8Var.c);
                }
                return new a((String[]) strArr.clone(), zt80.a.b(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void beginArray() throws IOException;

    public abstract void beginObject() throws IOException;

    public abstract void endArray() throws IOException;

    public abstract void endObject() throws IOException;

    public final String getPath() {
        int i = this.b;
        int[] iArr = this.c;
        String[] strArr = this.d;
        int[] iArr2 = this.e;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append(JwtParser.SEPARATOR_CHAR);
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract boolean hasNext() throws IOException;

    public abstract boolean m() throws IOException;

    public abstract double n() throws IOException;

    public abstract int o() throws IOException;

    public abstract String p() throws IOException;

    public abstract Token q() throws IOException;

    public final void r(int i) {
        int i2 = this.b;
        int[] iArr = this.c;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new w8y("Nesting too deep at " + getPath());
            }
            this.c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.d;
            this.d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.e;
            this.e = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.c;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int s(a aVar) throws IOException;

    public abstract void skipValue() throws IOException;

    public abstract void t() throws IOException;

    public final void v(String str) throws i9y {
        StringBuilder b = ho8.b(str, " at path ");
        b.append(getPath());
        throw new i9y(b.toString());
    }
}
