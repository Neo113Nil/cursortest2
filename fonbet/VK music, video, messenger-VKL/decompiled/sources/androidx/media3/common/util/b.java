package androidx.media3.common.util;

import android.content.Context;
import android.opengl.GLES20;
import androidx.annotation.Nullable;
import androidx.media3.common.util.GlUtil;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import xsna.fxc0;
import xsna.lhg;
import xsna.y2r0;

/* compiled from: GlProgram.java */
/* loaded from: classes12.dex */
public final class b {
    public final int a;
    public final a[] b;
    public final C0044b[] c;
    public final HashMap d;
    public final HashMap e;
    public boolean f;

    /* compiled from: GlProgram.java */
    public static final class a {
        public final int a;

        @Nullable
        public FloatBuffer b;
        public int c;

        public a(String str, int i) {
            this.a = i;
        }
    }

    /* compiled from: GlProgram.java */
    /* renamed from: androidx.media3.common.util.b$b, reason: collision with other inner class name */
    public static final class C0044b {
        public final int a;
        public final int b;
        public int e;
        public int f;
        public final float[] c = new float[16];
        public final int[] d = new int[4];
        public int g = 9729;

        public C0044b(String str, int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public b(Context context, String str, String str2) throws IOException, GlUtil.GlException {
        this(y2r0.R(context, str), y2r0.R(context, str2));
    }

    public static void a(int i, int i2, String str) throws GlUtil.GlException {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        GlUtil.e(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        GlUtil.d();
    }

    public final void b() throws GlUtil.GlException {
        for (a aVar : this.b) {
            FloatBuffer floatBuffer = aVar.b;
            fxc0.t(floatBuffer, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(aVar.a, aVar.c, 5126, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(aVar.a);
            GlUtil.d();
        }
        for (C0044b c0044b : this.c) {
            boolean z = this.f;
            int[] iArr = c0044b.d;
            float[] fArr = c0044b.c;
            int i = c0044b.a;
            int i2 = c0044b.b;
            if (i2 == 5124) {
                GLES20.glUniform1iv(i, 1, iArr, 0);
                GlUtil.d();
            } else if (i2 == 5126) {
                GLES20.glUniform1fv(i, 1, fArr, 0);
                GlUtil.d();
            } else if (i2 == 35678 || i2 == 35815 || i2 == 36198) {
                if (c0044b.e == 0) {
                    throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                }
                GLES20.glActiveTexture(c0044b.f + 33984);
                GlUtil.d();
                GlUtil.b(i2 == 35678 ? 3553 : 36197, c0044b.e, (i2 == 35678 || !z) ? 9729 : 9728);
                if (i2 == 35678) {
                    if (c0044b.g == 9987) {
                        GLES20.glGenerateMipmap(3553);
                        GlUtil.d();
                    }
                    GLES20.glTexParameteri(3553, 10241, c0044b.g);
                    GlUtil.d();
                }
                GLES20.glUniform1i(i, c0044b.f);
                GlUtil.d();
            } else {
                switch (i2) {
                    case 35664:
                        GLES20.glUniform2fv(i, 1, fArr, 0);
                        GlUtil.d();
                        break;
                    case 35665:
                        GLES20.glUniform3fv(i, 1, fArr, 0);
                        GlUtil.d();
                        break;
                    case 35666:
                        GLES20.glUniform4fv(i, 1, fArr, 0);
                        GlUtil.d();
                        break;
                    case 35667:
                        GLES20.glUniform2iv(i, 1, iArr, 0);
                        GlUtil.d();
                        break;
                    case 35668:
                        GLES20.glUniform3iv(i, 1, iArr, 0);
                        GlUtil.d();
                        break;
                    case 35669:
                        GLES20.glUniform4iv(i, 1, iArr, 0);
                        GlUtil.d();
                        break;
                    default:
                        switch (i2) {
                            case 35675:
                                GLES20.glUniformMatrix3fv(i, 1, false, fArr, 0);
                                GlUtil.d();
                                break;
                            case 35676:
                                GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
                                GlUtil.d();
                                break;
                            default:
                                throw new IllegalStateException(lhg.a(i2, "Unexpected uniform type: "));
                        }
                }
            }
        }
    }

    public final void c(float[] fArr) {
        a aVar = (a) this.d.get("aFramePosition");
        aVar.getClass();
        aVar.b = GlUtil.h(fArr);
        aVar.c = 4;
    }

    public final void d(String str, float f) {
        C0044b c0044b = (C0044b) this.e.get(str);
        c0044b.getClass();
        c0044b.c[0] = f;
    }

    public final void e(String str, float[] fArr) {
        C0044b c0044b = (C0044b) this.e.get(str);
        c0044b.getClass();
        System.arraycopy(fArr, 0, c0044b.c, 0, fArr.length);
    }

    public final void f(String str, int i) {
        C0044b c0044b = (C0044b) this.e.get(str);
        c0044b.getClass();
        c0044b.d[0] = i;
    }

    public final void g(int i, int i2, String str) {
        C0044b c0044b = (C0044b) this.e.get(str);
        c0044b.getClass();
        c0044b.e = i;
        c0044b.f = i2;
    }

    public b(String str, String str2) throws GlUtil.GlException {
        int glCreateProgram = GLES20.glCreateProgram();
        this.a = glCreateProgram;
        GlUtil.d();
        a(glCreateProgram, 35633, str);
        a(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        GlUtil.e("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(glCreateProgram);
        this.d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.b = new a[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.a;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
            String str3 = new String(bArr, 0, i3);
            a aVar = new a(str3, GLES20.glGetAttribLocation(i2, str3));
            this.b[i] = aVar;
            this.d.put(str3, aVar);
        }
        this.e = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr4, 0);
        this.c = new C0044b[iArr4[0]];
        for (int i5 = 0; i5 < iArr4[0]; i5++) {
            int i6 = this.a;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i6, 35719, iArr5, 0);
            int[] iArr6 = new int[1];
            int i7 = iArr5[0];
            byte[] bArr2 = new byte[i7];
            GLES20.glGetActiveUniform(i6, i5, i7, new int[1], 0, new int[1], 0, iArr6, 0, bArr2, 0);
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                if (bArr2[i8] == 0) {
                    i7 = i8;
                    break;
                }
                i8++;
            }
            String str4 = new String(bArr2, 0, i7);
            C0044b c0044b = new C0044b(str4, GLES20.glGetUniformLocation(i6, str4), iArr6[0]);
            this.c[i5] = c0044b;
            this.e.put(str4, c0044b);
        }
        GlUtil.d();
    }
}
