package com.airbnb.lottie.model.layer;

import B3.t;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.K;
import com.airbnb.lottie.S;

/* loaded from: classes.dex */
public class h extends b {

    /* renamed from: E, reason: collision with root package name */
    public final RectF f28945E;

    /* renamed from: F, reason: collision with root package name */
    public final Paint f28946F;

    /* renamed from: G, reason: collision with root package name */
    public final Path f28947G;

    /* renamed from: H, reason: collision with root package name */
    public final e f28948H;

    /* renamed from: I, reason: collision with root package name */
    public B3.a f28949I;

    /* renamed from: J, reason: collision with root package name */
    public B3.a f28950J;
    private final float[] points;

    public h(K k10, e eVar) {
        super(k10, eVar);
        this.f28945E = new RectF();
        A3.a aVar = new A3.a();
        this.f28946F = aVar;
        this.points = new float[8];
        this.f28947G = new Path();
        this.f28948H = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.p());
    }

    @Override // com.airbnb.lottie.model.layer.b, E3.f
    public void e(Object obj, G3.c cVar) {
        super.e(obj, cVar);
        if (obj == S.f28453N) {
            if (cVar == null) {
                this.f28949I = null;
                return;
            } else {
                this.f28949I = new t(cVar);
                return;
            }
        }
        if (obj == S.f28458a) {
            if (cVar != null) {
                this.f28950J = new t(cVar);
            } else {
                this.f28950J = null;
                this.f28946F.setColor(this.f28948H.p());
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        super.f(rectF, matrix, z10);
        this.f28945E.set(0.0f, 0.0f, this.f28948H.r(), this.f28948H.q());
        this.f28872o.mapRect(this.f28945E);
        rectF.set(this.f28945E);
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void v(Canvas canvas, Matrix matrix, int i10, com.airbnb.lottie.utils.d dVar) {
        int alpha = Color.alpha(this.f28948H.p());
        if (alpha == 0) {
            return;
        }
        B3.a aVar = this.f28950J;
        Integer num = aVar == null ? null : (Integer) aVar.h();
        if (num != null) {
            this.f28946F.setColor(num.intValue());
        } else {
            this.f28946F.setColor(this.f28948H.p());
        }
        int intValue = (int) ((i10 / 255.0f) * (((alpha / 255.0f) * (this.f28881x.k() == null ? 100 : ((Integer) this.f28881x.k().h()).intValue())) / 100.0f) * 255.0f);
        this.f28946F.setAlpha(intValue);
        if (dVar != null) {
            dVar.a(this.f28946F);
        } else {
            this.f28946F.clearShadowLayer();
        }
        B3.a aVar2 = this.f28949I;
        if (aVar2 != null) {
            this.f28946F.setColorFilter((ColorFilter) aVar2.h());
        }
        if (intValue > 0) {
            float[] fArr = this.points;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f28948H.r();
            float[] fArr2 = this.points;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f28948H.r();
            this.points[5] = this.f28948H.q();
            float[] fArr3 = this.points;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f28948H.q();
            matrix.mapPoints(this.points);
            this.f28947G.reset();
            Path path = this.f28947G;
            float[] fArr4 = this.points;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f28947G;
            float[] fArr5 = this.points;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f28947G;
            float[] fArr6 = this.points;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f28947G;
            float[] fArr7 = this.points;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f28947G;
            float[] fArr8 = this.points;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f28947G.close();
            canvas.drawPath(this.f28947G, this.f28946F);
        }
    }
}
