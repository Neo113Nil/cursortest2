package G1;

import G1.e;
import android.opengl.GLES20;
import android.util.Log;
import e1.AbstractC4151s;
import e1.r;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f3798a;

    /* renamed from: b, reason: collision with root package name */
    public a f3799b;

    /* renamed from: c, reason: collision with root package name */
    public a f3800c;

    /* renamed from: d, reason: collision with root package name */
    public r f3801d;

    /* renamed from: e, reason: collision with root package name */
    public int f3802e;

    /* renamed from: f, reason: collision with root package name */
    public int f3803f;

    /* renamed from: g, reason: collision with root package name */
    public int f3804g;

    /* renamed from: h, reason: collision with root package name */
    public int f3805h;

    /* renamed from: i, reason: collision with root package name */
    public int f3806i;
    private static final float[] TEX_MATRIX_WHOLE = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] TEX_MATRIX_TOP = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    private static final float[] TEX_MATRIX_BOTTOM = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] TEX_MATRIX_LEFT = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] TEX_MATRIX_RIGHT = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f3807a;

        /* renamed from: b, reason: collision with root package name */
        public final FloatBuffer f3808b;

        /* renamed from: c, reason: collision with root package name */
        public final FloatBuffer f3809c;

        /* renamed from: d, reason: collision with root package name */
        public final int f3810d;

        public a(e.b bVar) {
            this.f3807a = bVar.a();
            this.f3808b = AbstractC4151s.i(bVar.vertices);
            this.f3809c = AbstractC4151s.i(bVar.textureCoords);
            int i10 = bVar.f3797b;
            if (i10 == 1) {
                this.f3810d = 5;
            } else if (i10 != 2) {
                this.f3810d = 4;
            } else {
                this.f3810d = 6;
            }
        }
    }

    public static boolean c(e eVar) {
        e.a aVar = eVar.f3792a;
        e.a aVar2 = eVar.f3793b;
        return aVar.b() == 1 && aVar.a(0).f3796a == 0 && aVar2.b() == 1 && aVar2.a(0).f3796a == 0;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        a aVar = z10 ? this.f3800c : this.f3799b;
        if (aVar == null) {
            return;
        }
        int i11 = this.f3798a;
        GLES20.glUniformMatrix3fv(this.f3803f, 1, false, i11 == 1 ? z10 ? TEX_MATRIX_BOTTOM : TEX_MATRIX_TOP : i11 == 2 ? z10 ? TEX_MATRIX_RIGHT : TEX_MATRIX_LEFT : TEX_MATRIX_WHOLE, 0);
        GLES20.glUniformMatrix4fv(this.f3802e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f3806i, 0);
        try {
            AbstractC4151s.d();
        } catch (AbstractC4151s.a e10) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e10);
        }
        GLES20.glVertexAttribPointer(this.f3804g, 3, 5126, false, 12, (Buffer) aVar.f3808b);
        try {
            AbstractC4151s.d();
        } catch (AbstractC4151s.a e11) {
            Log.e("ProjectionRenderer", "Failed to load position data", e11);
        }
        GLES20.glVertexAttribPointer(this.f3805h, 2, 5126, false, 8, (Buffer) aVar.f3809c);
        try {
            AbstractC4151s.d();
        } catch (AbstractC4151s.a e12) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e12);
        }
        GLES20.glDrawArrays(aVar.f3810d, 0, aVar.f3807a);
        try {
            AbstractC4151s.d();
        } catch (AbstractC4151s.a e13) {
            Log.e("ProjectionRenderer", "Failed to render", e13);
        }
    }

    public void b() {
        try {
            r rVar = new r("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f3801d = rVar;
            this.f3802e = rVar.l("uMvpMatrix");
            this.f3803f = this.f3801d.l("uTexMatrix");
            this.f3804g = this.f3801d.g("aPosition");
            this.f3805h = this.f3801d.g("aTexCoords");
            this.f3806i = this.f3801d.l("uTexture");
        } catch (AbstractC4151s.a e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f3798a = eVar.f3794c;
            a aVar = new a(eVar.f3792a.a(0));
            this.f3799b = aVar;
            if (!eVar.f3795d) {
                aVar = new a(eVar.f3793b.a(0));
            }
            this.f3800c = aVar;
        }
    }
}
