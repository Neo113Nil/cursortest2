package ru.ozon.app.android.regulardraw.ui;

import Pk0.h;
import Z1.d;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7811b0;
import l1.C7845v;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\u0011\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LZ1/d;", "LZ1/i;", "position", "LZ1/h;", "cornerRadius", "blur", "spread", "", "clipToCanvas", "Ll1/Z;", "paintColor", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "paintShader", "Lru/ozon/app/android/regulardraw/ui/InnerShadowPainter;", "InnerShadowPainter-RiaaXQU", "(LZ1/d;JFFFZLl1/Z;Landroid/graphics/Shader;)Lru/ozon/app/android/regulardraw/ui/InnerShadowPainter;", "InnerShadowPainter", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InnerShadowPainterKt {
    @NotNull
    /* renamed from: InnerShadowPainter-RiaaXQU, reason: not valid java name */
    public static final InnerShadowPainter m911InnerShadowPainterRiaaXQU(@NotNull final d InnerShadowPainter, final long j11, final float f7, final float f11, final float f12, final boolean z11, final C7807Z c7807z, final Shader shader) {
        Intrinsics.checkNotNullParameter(InnerShadowPainter, "$this$InnerShadowPainter");
        return new InnerShadowPainter(InnerShadowPainter, j11, f7, f11, f12, c7807z, shader, z11) { // from class: ru.ozon.app.android.regulardraw.ui.InnerShadowPainterKt$InnerShadowPainter$1
            final /* synthetic */ boolean $clipToCanvas;
            private final float blurRadiusPx;
            private final Path canvasClipPath;
            private final RectF canvasRect;
            private final float cornerRadiusPx;
            private final float offsetX;
            private final float offsetY;
            private final Paint paint;
            private final RectF shadowRect;
            private final float spreadPx;

            {
                this.$clipToCanvas = z11;
                float v12 = InnerShadowPainter.v1(Float.intBitsToFloat((int) (j11 >> 32)));
                this.offsetX = v12;
                float v13 = InnerShadowPainter.v1(Float.intBitsToFloat((int) (j11 & 4294967295L)));
                this.offsetY = v13;
                this.cornerRadiusPx = InnerShadowPainter.v1(f7);
                float v14 = InnerShadowPainter.v1(f11) / 2;
                this.blurRadiusPx = v14;
                float v15 = InnerShadowPainter.v1(f12);
                this.spreadPx = v15;
                Paint a11 = h.a(true);
                a11.setStyle(Paint.Style.STROKE);
                a11.setStrokeWidth(Math.max(Math.abs(v12), Math.abs(v13)) + v15);
                if (v14 > 0.0f) {
                    a11.setMaskFilter(new BlurMaskFilter(v14, BlurMaskFilter.Blur.NORMAL));
                }
                if (c7807z != null) {
                    a11.setColor(C7811b0.i(c7807z.w()));
                }
                if (shader != null) {
                    a11.setShader(shader);
                }
                this.paint = a11;
                this.canvasClipPath = new Path();
                this.canvasRect = new RectF();
                this.shadowRect = new RectF();
            }

            @Override // ru.ozon.app.android.regulardraw.ui.InnerShadowPainter
            public void draw(InterfaceC8412e interfaceC8412e) {
                Intrinsics.checkNotNullParameter(interfaceC8412e, "<this>");
                RectF rectF = this.canvasRect;
                rectF.right = C7464j.f(interfaceC8412e.i());
                rectF.bottom = C7464j.d(interfaceC8412e.i());
                RectF rectF2 = this.shadowRect;
                rectF2.set(this.canvasRect);
                float f13 = 2;
                rectF2.inset(this.spreadPx - (this.paint.getStrokeWidth() / f13), this.spreadPx - (this.paint.getStrokeWidth() / f13));
                rectF2.offset((Math.abs(this.offsetX) + this.spreadPx) * Math.signum(this.offsetX), (Math.abs(this.offsetY) + this.spreadPx) * Math.signum(this.offsetY));
                boolean z12 = this.$clipToCanvas;
                Canvas b11 = C7845v.b(interfaceC8412e.w0().a());
                int save = b11.save();
                if (z12) {
                    try {
                        this.canvasClipPath.reset();
                        Path path = this.canvasClipPath;
                        RectF rectF3 = this.canvasRect;
                        float f14 = this.cornerRadiusPx;
                        path.addRoundRect(rectF3, f14, f14, Path.Direction.CCW);
                        b11.clipPath(this.canvasClipPath);
                    } catch (Throwable th2) {
                        b11.restoreToCount(save);
                        throw th2;
                    }
                }
                RectF rectF4 = this.shadowRect;
                float f15 = this.cornerRadiusPx;
                b11.drawRoundRect(rectF4, f15, f15, this.paint);
                b11.restoreToCount(save);
            }
        };
    }

    /* renamed from: InnerShadowPainter-RiaaXQU$default, reason: not valid java name */
    public static /* synthetic */ InnerShadowPainter m912InnerShadowPainterRiaaXQU$default(d dVar, long j11, float f7, float f11, float f12, boolean z11, C7807Z c7807z, Shader shader, int i11, Object obj) {
        Shader shader2;
        d dVar2;
        long j12;
        float f13;
        float f14;
        float f15;
        boolean z12 = (i11 & 16) != 0 ? true : z11;
        C7807Z c7807z2 = (i11 & 32) != 0 ? null : c7807z;
        if ((i11 & 64) != 0) {
            shader2 = null;
            j12 = j11;
            f13 = f7;
            f14 = f11;
            f15 = f12;
            dVar2 = dVar;
        } else {
            shader2 = shader;
            dVar2 = dVar;
            j12 = j11;
            f13 = f7;
            f14 = f11;
            f15 = f12;
        }
        return m911InnerShadowPainterRiaaXQU(dVar2, j12, f13, f14, f15, z12, c7807z2, shader2);
    }
}
