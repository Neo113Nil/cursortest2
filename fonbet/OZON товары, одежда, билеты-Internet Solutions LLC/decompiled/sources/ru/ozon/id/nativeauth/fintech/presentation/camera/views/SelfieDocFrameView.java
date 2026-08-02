package ru.ozon.id.nativeauth.fintech.presentation.camera.views;

import Fc0.e;
import Gc0.d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/id/nativeauth/fintech/presentation/camera/views/SelfieDocFrameView;", "LGc0/d;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelfieDocFrameView extends d {

    /* renamed from: m, reason: collision with root package name */
    private static final float f97268m = UiExtKt.toPxF(18.0f);

    /* renamed from: n, reason: collision with root package name */
    private static final float f97269n = UiExtKt.toPxF(100.0f);

    /* renamed from: o, reason: collision with root package name */
    private static final float f97270o = UiExtKt.toPxF(200.0f);

    /* renamed from: i, reason: collision with root package name */
    private RectF f97271i;

    /* renamed from: j, reason: collision with root package name */
    private RectF f97272j;

    /* renamed from: k, reason: collision with root package name */
    private RectF f97273k;

    /* renamed from: l, reason: collision with root package name */
    private RectF f97274l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieDocFrameView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // Gc0.d
    protected final void f(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RectF rectF = this.f97274l;
        if (rectF != null) {
            float f7 = e.LANDSCAPE == e.PORTRAIT ? f97269n : f97270o;
            canvas.drawRoundRect(rectF, f7, f7, getF9923b());
        }
        RectF rectF2 = this.f97273k;
        if (rectF2 != null) {
            Paint f9923b = getF9923b();
            float f11 = f97268m;
            canvas.drawRoundRect(rectF2, f11, f11, f9923b);
            if (getF9922a()) {
                e(canvas, rectF2);
            } else {
                h(canvas, rectF2);
            }
        }
    }

    @Override // Gc0.d
    protected final void g(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RectF rectF = this.f97272j;
        if (rectF != null) {
            e eVar = e.PORTRAIT;
            Paint f9923b = getF9923b();
            float f7 = f97269n;
            canvas.drawRoundRect(rectF, f7, f7, f9923b);
        }
        RectF rectF2 = this.f97271i;
        if (rectF2 != null) {
            Paint f9923b2 = getF9923b();
            float f11 = f97268m;
            canvas.drawRoundRect(rectF2, f11, f11, f9923b2);
            e(canvas, rectF2);
        }
    }

    @Override // Gc0.d
    protected final void l(int i11, int i12) {
        RectF rectF;
        RectF rectF2;
        if (getVisibility() == 0) {
            float f7 = i12;
            float f11 = i11;
            float f12 = 0.53f * f11;
            float f13 = 0.25f * f11;
            float f14 = f13 + f12;
            float f15 = 0.11f * f7;
            this.f97272j = new RectF(f13, f15, f14, (0.33f * f7) + f15);
            float f16 = 0.38f * f7;
            float f17 = 0.45f * f7;
            this.f97271i = new RectF(f13, f17, f14, f17 + f16);
            if (getF9922a()) {
                float f18 = f11 * 0.15f;
                float f19 = f7 * 0.15f;
                rectF = new RectF(f18, f19, (0.3f * f11) + f18, (f7 * 0.7f) + f19);
            } else {
                float f21 = 0.1f * f11;
                float f22 = 0.19f * f7;
                rectF = new RectF(f21, f22, (0.8f * f11) + f21, (0.28f * f7) + f22);
            }
            this.f97274l = rectF;
            if (getF9922a()) {
                float f23 = 0.7f * f7;
                float f24 = 0.4f * f11;
                float f25 = f11 * 0.55f;
                float f26 = f7 * 0.15f;
                rectF2 = new RectF(f25, f26, f24 + f25, f23 + f26);
            } else {
                float f27 = (f11 - f16) / 2;
                float f28 = f7 * 0.55f;
                rectF2 = new RectF(f27, f28, f16 + f27, f12 + f28);
            }
            this.f97273k = rectF2;
        } else {
            this.f97272j = null;
            this.f97271i = null;
            this.f97274l = null;
            this.f97273k = null;
        }
        invalidate();
    }
}
