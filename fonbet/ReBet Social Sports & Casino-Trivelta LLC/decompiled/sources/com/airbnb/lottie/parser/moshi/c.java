package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import ti.C6478h;
import ti.InterfaceC6479i;
import ti.InterfaceC6480j;
import ti.k;
import ti.w;

/* loaded from: classes.dex */
public abstract class c implements Closeable {
    private static final String[] REPLACEMENT_CHARS = new String[128];

    /* renamed from: a, reason: collision with root package name */
    public int f29043a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f29044b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f29045c;
    int[] scopes = new int[32];
    String[] pathNames = new String[32];
    int[] pathIndices = new int[32];

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final w f29046a;
        final String[] strings;

        public a(String[] strArr, w wVar) {
            this.strings = strArr;
            this.f29046a = wVar;
        }

        public static a a(String... strArr) {
            try {
                k[] kVarArr = new k[strArr.length];
                C6478h c6478h = new C6478h();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    c.z0(c6478h, strArr[i10]);
                    c6478h.readByte();
                    kVarArr[i10] = c6478h.v1();
                }
                return new a((String[]) strArr.clone(), w.i(kVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            REPLACEMENT_CHARS[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static c r(InterfaceC6480j interfaceC6480j) {
        return new e(interfaceC6480j);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void z0(InterfaceC6479i interfaceC6479i, String str) {
        int i10;
        String str2;
        String[] strArr = REPLACEMENT_CHARS;
        interfaceC6479i.writeByte(34);
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i10 = str2 == null ? i10 + 1 : 0;
                if (i11 < i10) {
                    interfaceC6479i.q0(str, i11, i10);
                }
                interfaceC6479i.h0(str2);
                i11 = i10 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i10) {
                }
                interfaceC6479i.h0(str2);
                i11 = i10 + 1;
            }
        }
        if (i11 < length) {
            interfaceC6479i.q0(str, i11, length);
        }
        interfaceC6479i.writeByte(34);
    }

    public final com.airbnb.lottie.parser.moshi.b A0(String str) {
        throw new com.airbnb.lottie.parser.moshi.b(str + " at path " + l());
    }

    public abstract b B();

    public abstract void C();

    public final void J(int i10) {
        int i11 = this.f29043a;
        int[] iArr = this.scopes;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new com.airbnb.lottie.parser.moshi.a("Nesting too deep at " + l());
            }
            this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.pathNames;
            this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.pathIndices;
            this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.scopes;
        int i12 = this.f29043a;
        this.f29043a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract String M0();

    public abstract int U(a aVar);

    public abstract String f0();

    public abstract boolean hasNext();

    public abstract boolean k();

    public final String l() {
        return d.a(this.f29043a, this.scopes, this.pathNames, this.pathIndices);
    }

    public abstract void m();

    public abstract void n();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract void p();

    public abstract void t();

    public abstract void w0();
}
