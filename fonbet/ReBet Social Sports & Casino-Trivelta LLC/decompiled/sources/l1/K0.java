package l1;

import android.opengl.Matrix;
import android.util.Pair;
import b1.InterfaceC2337F;
import e1.AbstractC4134a;
import e1.AbstractC4151s;

/* loaded from: classes.dex */
public class K0 {

    /* renamed from: a, reason: collision with root package name */
    public e1.L f55425a;
    private final float[] aspectRatioMatrix = AbstractC4151s.g();
    private final float[] backgroundFrameAnchorMatrix = AbstractC4151s.g();
    private final float[] overlayFrameAnchorMatrix = AbstractC4151s.g();
    private final float[] rotateMatrix = AbstractC4151s.g();
    private final float[] scaleMatrix = AbstractC4151s.g();
    private final float[] scaleMatrixInv = AbstractC4151s.g();
    private final float[] overlayAspectRatioMatrix = AbstractC4151s.g();
    private final float[] overlayAspectRatioMatrixInv = AbstractC4151s.g();
    private final float[] transformationMatrix = AbstractC4151s.g();

    public void a(e1.L l10) {
        this.f55425a = l10;
    }

    public float[] b(e1.L l10, InterfaceC2337F interfaceC2337F) {
        c();
        Pair c10 = interfaceC2337F.c();
        Matrix.translateM(this.backgroundFrameAnchorMatrix, 0, ((Float) c10.first).floatValue(), ((Float) c10.second).floatValue(), 0.0f);
        AbstractC4134a.i(this.f55425a);
        Matrix.scaleM(this.aspectRatioMatrix, 0, l10.b() / this.f55425a.b(), l10.a() / this.f55425a.a(), 1.0f);
        Pair b10 = interfaceC2337F.b();
        Matrix.scaleM(this.scaleMatrix, 0, ((Float) b10.first).floatValue(), ((Float) b10.second).floatValue(), 1.0f);
        Matrix.invertM(this.scaleMatrixInv, 0, this.scaleMatrix, 0);
        Pair e10 = interfaceC2337F.e();
        Matrix.translateM(this.overlayFrameAnchorMatrix, 0, ((Float) e10.first).floatValue() * (-1.0f), ((Float) e10.second).floatValue() * (-1.0f), 0.0f);
        Matrix.rotateM(this.rotateMatrix, 0, interfaceC2337F.d(), 0.0f, 0.0f, 1.0f);
        Matrix.scaleM(this.overlayAspectRatioMatrix, 0, l10.a() / l10.b(), 1.0f, 1.0f);
        Matrix.invertM(this.overlayAspectRatioMatrixInv, 0, this.overlayAspectRatioMatrix, 0);
        float[] fArr = this.transformationMatrix;
        Matrix.multiplyMM(fArr, 0, fArr, 0, this.backgroundFrameAnchorMatrix, 0);
        float[] fArr2 = this.transformationMatrix;
        Matrix.multiplyMM(fArr2, 0, fArr2, 0, this.aspectRatioMatrix, 0);
        float[] fArr3 = this.transformationMatrix;
        Matrix.multiplyMM(fArr3, 0, fArr3, 0, this.scaleMatrix, 0);
        float[] fArr4 = this.transformationMatrix;
        Matrix.multiplyMM(fArr4, 0, fArr4, 0, this.overlayFrameAnchorMatrix, 0);
        float[] fArr5 = this.transformationMatrix;
        Matrix.multiplyMM(fArr5, 0, fArr5, 0, this.scaleMatrixInv, 0);
        float[] fArr6 = this.transformationMatrix;
        Matrix.multiplyMM(fArr6, 0, fArr6, 0, this.overlayAspectRatioMatrix, 0);
        float[] fArr7 = this.transformationMatrix;
        Matrix.multiplyMM(fArr7, 0, fArr7, 0, this.rotateMatrix, 0);
        float[] fArr8 = this.transformationMatrix;
        Matrix.multiplyMM(fArr8, 0, fArr8, 0, this.overlayAspectRatioMatrixInv, 0);
        float[] fArr9 = this.transformationMatrix;
        Matrix.multiplyMM(fArr9, 0, fArr9, 0, this.scaleMatrix, 0);
        return this.transformationMatrix;
    }

    public final void c() {
        AbstractC4151s.T(this.aspectRatioMatrix);
        AbstractC4151s.T(this.backgroundFrameAnchorMatrix);
        AbstractC4151s.T(this.overlayFrameAnchorMatrix);
        AbstractC4151s.T(this.scaleMatrix);
        AbstractC4151s.T(this.scaleMatrixInv);
        AbstractC4151s.T(this.rotateMatrix);
        AbstractC4151s.T(this.overlayAspectRatioMatrix);
        AbstractC4151s.T(this.overlayAspectRatioMatrixInv);
        AbstractC4151s.T(this.transformationMatrix);
    }
}
