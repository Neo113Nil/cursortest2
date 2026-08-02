package e1;

import android.content.Context;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f45553a;
    private final a[] attributes;

    /* renamed from: b, reason: collision with root package name */
    public final Map f45554b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f45555c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f45556d;
    private final b[] uniforms;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f45557a;

        /* renamed from: b, reason: collision with root package name */
        public final int f45558b;

        /* renamed from: c, reason: collision with root package name */
        public Buffer f45559c;

        /* renamed from: d, reason: collision with root package name */
        public int f45560d;

        public a(String str, int i10) {
            this.f45557a = str;
            this.f45558b = i10;
        }

        public static a b(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, r.j(bArr));
            return new a(str, r.h(i10, str));
        }

        public void a() {
            Buffer buffer = (Buffer) AbstractC4134a.f(this.f45559c, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(this.f45558b, this.f45560d, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(this.f45558b);
            AbstractC4151s.d();
        }

        public void c(float[] fArr, int i10) {
            this.f45559c = AbstractC4151s.i(fArr);
            this.f45560d = i10;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f45561a;

        /* renamed from: b, reason: collision with root package name */
        public final int f45562b;

        /* renamed from: c, reason: collision with root package name */
        public final int f45563c;

        /* renamed from: d, reason: collision with root package name */
        public int f45564d;

        /* renamed from: e, reason: collision with root package name */
        public int f45565e;
        private final float[] floatValue = new float[16];
        private final int[] intValue = new int[4];

        /* renamed from: f, reason: collision with root package name */
        public int f45566f = 9729;

        public b(String str, int i10, int i11) {
            this.f45561a = str;
            this.f45562b = i10;
            this.f45563c = i11;
        }

        public static b b(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveUniform(i10, i11, i12, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, r.j(bArr));
            return new b(str, r.k(i10, str), iArr2[0]);
        }

        public void a(boolean z10) {
            int i10 = this.f45563c;
            if (i10 == 5124) {
                GLES20.glUniform1iv(this.f45562b, 1, this.intValue, 0);
                AbstractC4151s.d();
                return;
            }
            if (i10 == 5126) {
                GLES20.glUniform1fv(this.f45562b, 1, this.floatValue, 0);
                AbstractC4151s.d();
                return;
            }
            if (i10 == 35678 || i10 == 35815 || i10 == 36198) {
                if (this.f45564d == 0) {
                    throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                }
                GLES20.glActiveTexture(this.f45565e + 33984);
                AbstractC4151s.d();
                int i11 = this.f45563c;
                AbstractC4151s.b(i11 == 35678 ? 3553 : 36197, this.f45564d, (i11 == 35678 || !z10) ? 9729 : 9728);
                if (this.f45563c == 35678) {
                    if (this.f45566f == 9987) {
                        GLES20.glGenerateMipmap(3553);
                        AbstractC4151s.d();
                    }
                    GLES20.glTexParameteri(3553, 10241, this.f45566f);
                    AbstractC4151s.d();
                }
                GLES20.glUniform1i(this.f45562b, this.f45565e);
                AbstractC4151s.d();
                return;
            }
            switch (i10) {
                case 35664:
                    GLES20.glUniform2fv(this.f45562b, 1, this.floatValue, 0);
                    AbstractC4151s.d();
                    return;
                case 35665:
                    GLES20.glUniform3fv(this.f45562b, 1, this.floatValue, 0);
                    AbstractC4151s.d();
                    return;
                case 35666:
                    GLES20.glUniform4fv(this.f45562b, 1, this.floatValue, 0);
                    AbstractC4151s.d();
                    return;
                case 35667:
                    GLES20.glUniform2iv(this.f45562b, 1, this.intValue, 0);
                    AbstractC4151s.d();
                    return;
                case 35668:
                    GLES20.glUniform3iv(this.f45562b, 1, this.intValue, 0);
                    AbstractC4151s.d();
                    return;
                case 35669:
                    GLES20.glUniform4iv(this.f45562b, 1, this.intValue, 0);
                    AbstractC4151s.d();
                    return;
                default:
                    switch (i10) {
                        case 35675:
                            GLES20.glUniformMatrix3fv(this.f45562b, 1, false, this.floatValue, 0);
                            AbstractC4151s.d();
                            return;
                        case 35676:
                            GLES20.glUniformMatrix4fv(this.f45562b, 1, false, this.floatValue, 0);
                            AbstractC4151s.d();
                            return;
                        default:
                            throw new IllegalStateException("Unexpected uniform type: " + this.f45563c);
                    }
            }
        }

        public void c(float f10) {
            this.floatValue[0] = f10;
        }

        public void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.floatValue, 0, fArr.length);
        }

        public void e(int i10) {
            this.intValue[0] = i10;
        }

        public void f(int i10, int i11) {
            this.f45564d = i10;
            this.f45565e = i11;
        }

        public void g(int i10) {
            this.f45566f = i10;
        }
    }

    public r(Context context, String str, String str2) {
        this(Z.W0(context, str), Z.W0(context, str2));
    }

    public static void d(int i10, int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        AbstractC4151s.e(iArr[0] == 1, GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i10, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        AbstractC4151s.d();
    }

    public static int h(int i10, String str) {
        return GLES20.glGetAttribLocation(i10, str);
    }

    public static int j(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    public static int k(int i10, String str) {
        return GLES20.glGetUniformLocation(i10, str);
    }

    public void e() {
        for (a aVar : this.attributes) {
            aVar.a();
        }
        for (b bVar : this.uniforms) {
            bVar.a(this.f45556d);
        }
    }

    public void f() {
        GLES20.glDeleteProgram(this.f45553a);
        AbstractC4151s.d();
    }

    public int g(String str) {
        int i10 = i(str);
        GLES20.glEnableVertexAttribArray(i10);
        AbstractC4151s.d();
        return i10;
    }

    public final int i(String str) {
        return h(this.f45553a, str);
    }

    public int l(String str) {
        return k(this.f45553a, str);
    }

    public void m(String str, float[] fArr, int i10) {
        ((a) AbstractC4134a.e((a) this.f45554b.get(str))).c(fArr, i10);
    }

    public void n(boolean z10) {
        this.f45556d = z10;
    }

    public void o(String str, float f10) {
        ((b) AbstractC4134a.e((b) this.f45555c.get(str))).c(f10);
    }

    public void p(String str, float[] fArr) {
        ((b) AbstractC4134a.e((b) this.f45555c.get(str))).d(fArr);
    }

    public void q(String str, float[] fArr) {
        b bVar = (b) this.f45555c.get(str);
        if (bVar == null) {
            return;
        }
        bVar.d(fArr);
    }

    public void r(String str, int i10) {
        ((b) AbstractC4134a.e((b) this.f45555c.get(str))).e(i10);
    }

    public void s(String str, int i10, int i11) {
        ((b) AbstractC4134a.e((b) this.f45555c.get(str))).f(i10, i11);
    }

    public void t(String str, int i10, int i11, int i12) {
        b bVar = (b) AbstractC4134a.e((b) this.f45555c.get(str));
        bVar.f(i10, i11);
        bVar.g(i12);
    }

    public void u() {
        GLES20.glUseProgram(this.f45553a);
        AbstractC4151s.d();
    }

    public r(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        this.f45553a = glCreateProgram;
        AbstractC4151s.d();
        d(glCreateProgram, 35633, str);
        d(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        AbstractC4151s.e(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glUseProgram(glCreateProgram);
        this.f45554b = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.attributes = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a b10 = a.b(this.f45553a, i10);
            this.attributes[i10] = b10;
            this.f45554b.put(b10.f45557a, b10);
        }
        this.f45555c = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f45553a, 35718, iArr3, 0);
        this.uniforms = new b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            b b11 = b.b(this.f45553a, i11);
            this.uniforms[i11] = b11;
            this.f45555c.put(b11.f45561a, b11);
        }
        AbstractC4151s.d();
    }
}
