package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sports/insider/ui/views/AnalyticsBackground;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnalyticsBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsBackground.kt\ncom/sports/insider/ui/views/AnalyticsBackground\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
/* loaded from: classes.dex */
public final class AnalyticsBackground extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final Path f7088a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f7089b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f7090c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsBackground(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f7088a = new Path();
        this.f7089b = new RectF();
        float[] fArr = new float[8];
        this.f7090c = fArr;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        float f6 = displayMetrics.density;
        float f10 = (f6 <= 0.0f ? 1.0f : f6) * 25.0f;
        fArr[0] = f10;
        fArr[1] = f10;
        fArr[2] = f10;
        fArr[3] = f10;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (getChildAt(0) != null) {
            canvas.clipPath(this.f7088a);
            canvas.drawColor(-1);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        RectF rectF = this.f7089b;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = i5 * 1.0f;
        rectF.bottom = i10 * 1.0f;
        Path path = this.f7088a;
        path.rewind();
        path.addRoundRect(rectF, this.f7090c, Path.Direction.CW);
    }
}
