package ru.ozon.id.nativeauth.fintech.presentation.camera.views;

import Gc0.d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/id/nativeauth/fintech/presentation/camera/views/DocFrameView;", "LGc0/d;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DocFrameView extends d {

    /* renamed from: u, reason: collision with root package name */
    private static final float f97254u = UiExtKt.toPxF(16.0f);

    /* renamed from: v, reason: collision with root package name */
    private static final float f97255v = UiExtKt.toPxF(24.0f);

    /* renamed from: i, reason: collision with root package name */
    private final int f97256i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Paint f97257j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Paint f97258k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private Rect f97259l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f97260m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private RectF f97261n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private RectF f97262o;

    /* renamed from: p, reason: collision with root package name */
    private RectF f97263p;

    /* renamed from: q, reason: collision with root package name */
    private RectF f97264q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private Path f97265r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private Path f97266s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f97267t;

    static {
        UiExtKt.toPx(4.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocFrameView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f97256i = 154;
        Paint paint = new Paint();
        paint.setColor(a.getColor(context, R.color.ozonid_fintech_camera_qr_alpha_background));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f97257j = paint;
        Paint paint2 = new Paint();
        paint2.setColor(a.getColor(context, R.color.ozonid_fintech_camera_qr_alpha_background));
        paint2.setStyle(style);
        this.f97258k = paint2;
        this.f97259l = new Rect(0, 0, getRight(), getBottom());
        this.f97260m = true;
        this.f97261n = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f97262o = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f97265r = new Path();
        this.f97266s = new Path();
    }

    private static RectF n(int i11, int i12) {
        float f7 = i11;
        float f11 = (0.2f * f7) / 2.0f;
        float f12 = f97255v;
        if (f11 < f12) {
            f11 = f12;
        }
        float f13 = i12;
        float f14 = 0.18f * f13;
        float f15 = f7 - f11;
        float f16 = ((((f15 - f11) * 1.45f) + f14) - f14) / 2.0f;
        float f17 = f13 / 2.0f;
        return new RectF(f11, f17 - f16, f15, f17 + f16);
    }

    private static RectF o(RectF rectF) {
        float centerY = ((rectF.bottom - rectF.centerY()) * 0.15f) + rectF.centerY();
        float f7 = rectF.left;
        float f11 = rectF.right - f7;
        float f12 = (0.05f * f11) + f7;
        float f13 = f11 * 0.32f;
        return new RectF(f12, centerY, f12 + f13, (f13 * 1.2f) + centerY);
    }

    @Override // Gc0.d
    protected final void f(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (Build.VERSION.SDK_INT >= 31 && this.f97260m) {
            Paint paint = this.f97258k;
            paint.setAlpha(this.f97256i);
            this.f97257j.setAlpha(0);
            canvas.save();
            canvas.clipOutPath(this.f97266s);
            canvas.drawRect(this.f97259l, paint);
            canvas.restore();
        }
        RectF rectF = this.f97262o;
        Paint f9923b = getF9923b();
        float f7 = f97254u;
        canvas.drawRoundRect(rectF, f7, f7, f9923b);
        e(canvas, rectF);
        RectF rectF2 = this.f97264q;
        if (rectF2 != null) {
            canvas.drawRoundRect(rectF2, f7, f7, getF9923b());
        }
    }

    @Override // Gc0.d
    protected final void g(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (Build.VERSION.SDK_INT >= 31 && this.f97260m) {
            Paint paint = this.f97257j;
            paint.setAlpha(this.f97256i);
            this.f97258k.setAlpha(0);
            canvas.save();
            canvas.clipOutPath(this.f97265r);
            canvas.drawRect(this.f97259l, paint);
            canvas.restore();
        }
        RectF rectF = this.f97261n;
        Paint f9923b = getF9923b();
        float f7 = f97254u;
        canvas.drawRoundRect(rectF, f7, f7, f9923b);
        e(canvas, rectF);
        RectF rectF2 = this.f97263p;
        if (rectF2 != null) {
            canvas.drawRoundRect(rectF2, f7, f7, getF9923b());
        }
    }

    @Override // Gc0.d
    /* renamed from: j */
    protected final boolean getF9929h() {
        return false;
    }

    @Override // Gc0.d
    protected final void l(int i11, int i12) {
        RectF n11;
        RectF o11;
        if (getVisibility() == 0) {
            RectF n12 = n(i11, i12);
            this.f97261n = n12;
            this.f97263p = o(n12);
            if (getF9922a()) {
                float f7 = i11;
                float f11 = 0.36f * f7;
                float f12 = i12;
                float f13 = 0.6f * f12;
                float f14 = (f7 * 0.64f) / 2;
                float f15 = (f12 * 0.39999998f) / 2.25f;
                n11 = new RectF(f14, f15, f11 + f14, f13 + f15);
            } else {
                n11 = n(i11, i12);
            }
            this.f97262o = n11;
            if (getF9922a()) {
                float centerY = ((n11.bottom - n11.centerY()) * 0.15f) + n11.centerY();
                float f16 = n11.left;
                float f17 = n11.right - f16;
                float f18 = (0.05f * f17) + f16;
                float f19 = f17 * 0.25f;
                o11 = new RectF(f18, centerY, f18 + f19, (f19 * 1.2f) + centerY);
            } else {
                o11 = o(n11);
            }
            this.f97264q = o11;
        } else {
            this.f97261n = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            this.f97263p = null;
            this.f97262o = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            this.f97264q = null;
        }
        this.f97259l = new Rect(0, 0, i11, i12);
        Path path = new Path();
        RectF rectF = this.f97261n;
        Path.Direction direction = Path.Direction.CW;
        float f21 = f97254u;
        path.addRoundRect(rectF, f21, f21, direction);
        this.f97265r = path;
        Path path2 = new Path();
        path2.addRoundRect(this.f97262o, f21, f21, direction);
        this.f97266s = path2;
        invalidate();
    }

    @Override // Gc0.d, android.view.View
    protected final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f97267t) {
            return;
        }
        super.onDraw(canvas);
    }

    @NotNull
    /* renamed from: p, reason: from getter */
    public final RectF getF97261n() {
        return this.f97261n;
    }

    public final void q(boolean z11) {
        this.f97267t = z11;
    }
}
