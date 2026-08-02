package com.vk.media.gles;

import android.opengl.GLES20;
import com.unity3d.services.UnityAdsConstants;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import ru.ok.gl.objects.GLProgram;
import xsna.nap;

/* loaded from: classes3.dex */
public class EglTexture {
    public final ProgramType a;
    public int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float[] k;
    public final float[] l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ProgramType {
        private static final /* synthetic */ ProgramType[] $VALUES;
        public static final ProgramType TEXTURE_2D;
        public static final ProgramType TEXTURE_2D_YUV;
        public static final ProgramType TEXTURE_EXT;
        public static final ProgramType TEXTURE_EXT_BW;
        public static final ProgramType TEXTURE_EXT_FILT;

        static {
            ProgramType programType = new ProgramType("TEXTURE_2D", 0);
            TEXTURE_2D = programType;
            ProgramType programType2 = new ProgramType("TEXTURE_2D_YUV", 1);
            TEXTURE_2D_YUV = programType2;
            ProgramType programType3 = new ProgramType("TEXTURE_EXT", 2);
            TEXTURE_EXT = programType3;
            ProgramType programType4 = new ProgramType("TEXTURE_EXT_BW", 3);
            TEXTURE_EXT_BW = programType4;
            ProgramType programType5 = new ProgramType("TEXTURE_EXT_FILT", 4);
            TEXTURE_EXT_FILT = programType5;
            $VALUES = new ProgramType[]{programType, programType2, programType3, programType4, programType5};
        }

        public ProgramType() {
            throw null;
        }

        public static ProgramType valueOf(String str) {
            return (ProgramType) Enum.valueOf(ProgramType.class, str);
        }

        public static ProgramType[] values() {
            return (ProgramType[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ProgramType.values().length];
            a = iArr;
            try {
                iArr[ProgramType.TEXTURE_2D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ProgramType.TEXTURE_EXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ProgramType.TEXTURE_EXT_BW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ProgramType.TEXTURE_EXT_FILT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ProgramType.TEXTURE_2D_YUV.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        float[] fArr = nap.a;
    }

    public EglTexture(ProgramType programType) {
        float[] fArr = new float[9];
        this.k = fArr;
        this.a = programType;
        int i = a.a[programType.ordinal()];
        if (i == 1) {
            this.j = 3553;
            this.b = nap.e("uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        } else if (i == 2) {
            this.j = 36197;
            this.b = nap.e("uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        } else if (i == 3) {
            this.j = 36197;
            this.b = nap.e("uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    float color = tc.r * 0.3 + tc.g * 0.59 + tc.b * 0.11;\n    gl_FragColor = vec4(color, color, color, 1.0);\n}\n");
        } else if (i == 4) {
            this.j = 36197;
            this.b = nap.e("uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\n#define KERNEL_SIZE 9\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uKernel[KERNEL_SIZE];\nuniform vec2 uTexOffset[KERNEL_SIZE];\nuniform float uColorAdjust;\nvoid main() {\n    int i = 0;\n    vec4 sum = vec4(0.0);\n    if (vTextureCoord.x < vTextureCoord.y - 0.005) {\n        for (i = 0; i < KERNEL_SIZE; i++) {\n            vec4 texc = texture2D(sTexture, vTextureCoord + uTexOffset[i]);\n            sum += texc * uKernel[i];\n        }\n    sum += uColorAdjust;\n    } else if (vTextureCoord.x > vTextureCoord.y + 0.005) {\n        sum = texture2D(sTexture, vTextureCoord);\n    } else {\n        sum.r = 1.0;\n    }\n    gl_FragColor = sum;\n}\n");
        } else {
            if (i != 5) {
                throw new RuntimeException("Unhandled type " + programType);
            }
            this.j = 3553;
            this.b = nap.e("uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D y_texture;\nuniform sampler2D uv_texture;\nvoid main() {\n\tfloat r, g, b, y, u, v;\n\ty = texture2D(y_texture, vTextureCoord).r;\n\tu = texture2D(uv_texture, vTextureCoord).a - 0.5;\n\tv = texture2D(uv_texture, vTextureCoord).r - 0.5;\n\tr = y + 1.403 * v;\n\tg = y - 0.344 * u - 0.714 * v;\n\tb = y + 1.773 * u;\n\tgl_FragColor = vec4(r, g, b, 1.0);\n}\n");
        }
        if (this.b == 0) {
            throw new RuntimeException("Unable to create program");
        }
        programType.toString();
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.b, "aPosition");
        this.h = glGetAttribLocation;
        nap.a(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.b, GLProgram.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
        this.i = glGetAttribLocation2;
        nap.a(glGetAttribLocation2, GLProgram.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
        this.c = GLES20.glGetUniformLocation(this.b, "uMVPMatrix");
        this.d = GLES20.glGetUniformLocation(this.b, "uTexMatrix");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.b, "uKernel");
        this.e = glGetUniformLocation;
        if (glGetUniformLocation < 0) {
            this.e = -1;
            this.f = -1;
            this.g = -1;
            return;
        }
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.b, "uTexOffset");
        this.f = glGetUniformLocation2;
        nap.a(glGetUniformLocation2, "uTexOffset");
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.b, "uColorAdjust");
        this.g = glGetUniformLocation3;
        nap.a(glGetUniformLocation3, "uColorAdjust");
        System.arraycopy(new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, 0, fArr, 0, 9);
        float f = 1.0f / 256;
        float f2 = -f;
        this.l = new float[]{f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f, f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, f};
    }

    public final int a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        float[] fArr = nap.a;
        int i = iArr[0];
        int i2 = this.j;
        GLES20.glBindTexture(i2, i);
        GLES20.glTexParameteri(i2, 10241, i2 == 36197 ? 9728 : 9729);
        GLES20.glTexParameteri(i2, 10240, 9729);
        GLES20.glTexParameteri(i2, 10242, 33071);
        GLES20.glTexParameteri(i2, 10243, 33071);
        GLES20.glGetUniformLocation(this.b, GLProgram.FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER);
        return i;
    }

    public final void b(float[] fArr, FloatBuffer floatBuffer, int i, int i2, int i3, float[] fArr2, FloatBuffer floatBuffer2, int i4, int i5) {
        float[] fArr3 = nap.a;
        GLES20.glUseProgram(this.b);
        GLES20.glActiveTexture(33984);
        int i6 = this.j;
        GLES20.glBindTexture(i6, i4);
        GLES20.glUniformMatrix4fv(this.c, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(this.d, 1, false, fArr2, 0);
        int i7 = this.h;
        GLES20.glEnableVertexAttribArray(i7);
        GLES20.glVertexAttribPointer(this.h, i2, 5126, false, i3, (Buffer) floatBuffer);
        int i8 = this.i;
        GLES20.glEnableVertexAttribArray(i8);
        GLES20.glVertexAttribPointer(this.i, 2, 5126, false, i5, (Buffer) floatBuffer2);
        int i9 = this.e;
        if (i9 >= 0) {
            GLES20.glUniform1fv(i9, 9, this.k, 0);
            GLES20.glUniform2fv(this.f, 9, this.l, 0);
            GLES20.glUniform1f(this.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        GLES20.glDrawArrays(5, 0, i);
        GLES20.glDisableVertexAttribArray(i7);
        GLES20.glDisableVertexAttribArray(i8);
        GLES20.glBindTexture(i6, 0);
        GLES20.glUseProgram(0);
    }

    public final ProgramType c() {
        return this.a;
    }

    public final void d() {
        GLES20.glDeleteProgram(this.b);
        this.b = -1;
    }
}
