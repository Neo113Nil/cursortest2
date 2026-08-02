package m3;

import android.opengl.GLES20;
import java.util.HashMap;
import m3.C8072n;

/* renamed from: m3.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8071m {

    /* renamed from: a, reason: collision with root package name */
    private final int f74337a;

    /* renamed from: b, reason: collision with root package name */
    private final a[] f74338b;

    /* renamed from: c, reason: collision with root package name */
    private final b[] f74339c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f74340d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f74341e;

    /* renamed from: m3.m$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f74342a;

        private a(String str) {
            this.f74342a = str;
        }

        public static a a(int i11, int i12) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i11, 35722, iArr, 0);
            int i13 = iArr[0];
            byte[] bArr = new byte[i13];
            GLES20.glGetActiveAttrib(i11, i12, i13, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    break;
                }
                if (bArr[i14] == 0) {
                    i13 = i14;
                    break;
                }
                i14++;
            }
            String str = new String(bArr, 0, i13);
            GLES20.glGetAttribLocation(i11, str);
            return new a(str);
        }
    }

    /* renamed from: m3.m$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f74343a;

        private b(String str) {
            this.f74343a = str;
        }

        public static b a(int i11, int i12) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i11, 35719, iArr, 0);
            int i13 = iArr[0];
            byte[] bArr = new byte[i13];
            GLES20.glGetActiveUniform(i11, i12, i13, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    break;
                }
                if (bArr[i14] == 0) {
                    i13 = i14;
                    break;
                }
                i14++;
            }
            String str = new String(bArr, 0, i13);
            GLES20.glGetUniformLocation(i11, str);
            return new b(str);
        }
    }

    public C8071m(String str, String str2) throws C8072n.a {
        int glCreateProgram = GLES20.glCreateProgram();
        this.f74337a = glCreateProgram;
        C8072n.b();
        a(glCreateProgram, 35633, str);
        a(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        C8072n.c("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(glCreateProgram);
        this.f74340d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f74338b = new a[iArr2[0]];
        for (int i11 = 0; i11 < iArr2[0]; i11++) {
            a a11 = a.a(this.f74337a, i11);
            this.f74338b[i11] = a11;
            this.f74340d.put(a11.f74342a, a11);
        }
        this.f74341e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f74337a, 35718, iArr3, 0);
        this.f74339c = new b[iArr3[0]];
        for (int i12 = 0; i12 < iArr3[0]; i12++) {
            b a12 = b.a(this.f74337a, i12);
            this.f74339c[i12] = a12;
            this.f74341e.put(a12.f74343a, a12);
        }
        C8072n.b();
    }

    private static void a(int i11, int i12, String str) throws C8072n.a {
        int glCreateShader = GLES20.glCreateShader(i12);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        C8072n.c(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i11, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        C8072n.b();
    }

    public final int b(String str) throws C8072n.a {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f74337a, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        C8072n.b();
        return glGetAttribLocation;
    }

    public final int c(String str) {
        return GLES20.glGetUniformLocation(this.f74337a, str);
    }
}
