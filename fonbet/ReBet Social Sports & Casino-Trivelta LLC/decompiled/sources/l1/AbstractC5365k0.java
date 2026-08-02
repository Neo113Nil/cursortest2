package l1;

import android.content.Context;
import android.opengl.GLES20;
import e1.AbstractC4151s;
import java.io.IOException;

/* renamed from: l1.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5365k0 extends androidx.media3.effect.a {

    /* renamed from: h, reason: collision with root package name */
    public final e1.r f55524h;

    public AbstractC5365k0(Context context, int i10, boolean z10) {
        super(z10, i10);
        try {
            e1.r rVar = new e1.r(context, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_transformation_es2.glsl");
            this.f55524h = rVar;
            float[] g10 = AbstractC4151s.g();
            rVar.p("uTexTransformationMatrix", g10);
            rVar.p("uTransformationMatrix", g10);
            rVar.p("uRgbMatrix", g10);
            rVar.m("aFramePosition", AbstractC4151s.K(), 4);
        } catch (AbstractC4151s.a | IOException e10) {
            throw b1.V.a(e10);
        }
    }

    @Override // androidx.media3.effect.a
    public e1.L e(int i10, int i11) {
        return new e1.L(i10, i11);
    }

    @Override // androidx.media3.effect.a
    public void i(int i10, long j10) {
        try {
            this.f55524h.u();
            this.f55524h.s("uTexSampler", i10, 0);
            this.f55524h.e();
            GLES20.glDrawArrays(5, 0, 4);
        } catch (AbstractC4151s.a e10) {
            throw b1.V.a(e10);
        }
    }

    @Override // androidx.media3.effect.a, androidx.media3.effect.i
    public void release() {
        super.release();
        try {
            this.f55524h.f();
        } catch (AbstractC4151s.a e10) {
            throw new b1.V(e10);
        }
    }
}
