package defpackage;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hpk implements GLSurfaceView.Renderer {
    public static final String[] h = {"y_tex", "u_tex", "v_tex"};
    public static final FloatBuffer i = xw3.E(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
    public final ipk a;
    public final int[] b = new int[3];
    public final int[] c = new int[3];
    public final int[] d = new int[3];
    public final int[] e = new int[3];
    public final AtomicReference f = new AtomicReference();
    public gtj g;

    public hpk(ipk ipkVar) {
        this.a = ipkVar;
        for (int i2 = 0; i2 < 3; i2++) {
            int[] iArr = this.d;
            this.e[i2] = -1;
            iArr[i2] = -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.f.getAndSet(null) == null) {
            return;
        }
        pvd.j();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        GLES20.glViewport(0, 0, i2, i3);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.c;
        try {
            gtj gtjVar = new gtj("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n", 4);
            this.g = gtjVar;
            GLES20.glVertexAttribPointer(gtjVar.m("in_pos"), 2, 5126, false, 0, (Buffer) i);
            iArr[0] = this.g.m("in_tc_y");
            iArr[1] = this.g.m("in_tc_u");
            iArr[2] = this.g.m("in_tc_v");
            GLES20.glGetUniformLocation(this.g.b, "mColorConversion");
            xw3.x();
            int[] iArr2 = this.b;
            try {
                GLES20.glGenTextures(3, iArr2, 0);
                for (int i2 = 0; i2 < 3; i2++) {
                    gtj gtjVar2 = this.g;
                    GLES20.glUniform1i(GLES20.glGetUniformLocation(gtjVar2.b, h[i2]), i2);
                    GLES20.glActiveTexture(33984 + i2);
                    xw3.u(3553, iArr2[i2]);
                }
                xw3.x();
            } catch (iy8 e) {
                tgj.A("Failed to set up the textures", e);
            }
            xw3.x();
        } catch (iy8 e2) {
            tgj.A("Failed to set up the textures and program", e2);
        }
    }
}
