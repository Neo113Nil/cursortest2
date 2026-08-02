package F1;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import e1.AbstractC4151s;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class w extends GLSurfaceView implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3470b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final a f3471a;

    public static final class a implements GLSurfaceView.Renderer {

        /* renamed from: a, reason: collision with root package name */
        public final GLSurfaceView f3473a;

        /* renamed from: c, reason: collision with root package name */
        public e1.r f3475c;

        /* renamed from: d, reason: collision with root package name */
        public int f3476d;
        private static final float[] kColorConversion601 = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
        private static final float[] kColorConversion709 = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        private static final float[] kColorConversion2020 = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
        private static final String[] TEXTURE_UNIFORMS = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: e, reason: collision with root package name */
        public static final FloatBuffer f3472e = AbstractC4151s.i(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        private final int[] yuvTextures = new int[3];
        private final int[] texLocations = new int[3];
        private final int[] previousWidths = new int[3];
        private final int[] previousStrides = new int[3];

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference f3474b = new AtomicReference();
        private final FloatBuffer[] textureCoords = new FloatBuffer[3];

        public a(GLSurfaceView gLSurfaceView) {
            this.f3473a = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.previousWidths;
                this.previousStrides[i10] = -1;
                iArr[i10] = -1;
            }
        }

        public void a(k1.i iVar) {
            android.support.v4.media.session.b.a(this.f3474b.getAndSet(iVar));
            this.f3473a.requestRender();
        }

        public final void b() {
            try {
                GLES20.glGenTextures(3, this.yuvTextures, 0);
                for (int i10 = 0; i10 < 3; i10++) {
                    GLES20.glUniform1i(this.f3475c.l(TEXTURE_UNIFORMS[i10]), i10);
                    GLES20.glActiveTexture(33984 + i10);
                    AbstractC4151s.b(3553, this.yuvTextures[i10], 9729);
                }
                AbstractC4151s.d();
            } catch (AbstractC4151s.a e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e10);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            android.support.v4.media.session.b.a(this.f3474b.getAndSet(null));
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                e1.r rVar = new e1.r("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f3475c = rVar;
                GLES20.glVertexAttribPointer(rVar.g("in_pos"), 2, 5126, false, 0, (Buffer) f3472e);
                this.texLocations[0] = this.f3475c.g("in_tc_y");
                this.texLocations[1] = this.f3475c.g("in_tc_u");
                this.texLocations[2] = this.f3475c.g("in_tc_v");
                this.f3476d = this.f3475c.l("mColorConversion");
                AbstractC4151s.d();
                b();
                AbstractC4151s.d();
            } catch (AbstractC4151s.a e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e10);
            }
        }
    }

    public w(Context context) {
        this(context, null);
    }

    public void setOutputBuffer(k1.i iVar) {
        this.f3471a.a(iVar);
    }

    public w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f3471a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public x getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
