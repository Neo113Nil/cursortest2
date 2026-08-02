package com.sofascore.results.view.graph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.ate;
import defpackage.mqi;
import defpackage.ypa;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/sofascore/results/view/graph/RatingColorLegendView;", "Landroid/view/View;", "Landroid/graphics/Path;", "d", "Ljoa;", "getClipPath", "()Landroid/graphics/Path;", "clipPath", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RatingColorLegendView extends View {
    public static final /* synthetic */ int f = 0;
    public final List a;
    public final RectF b;
    public final float c;
    public final mqi d;
    public final Paint e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingColorLegendView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.a = b.j(Integer.valueOf(context.getColor(R.color.rating_90)), Integer.valueOf(context.getColor(R.color.rating_80)), Integer.valueOf(context.getColor(R.color.rating_70)), Integer.valueOf(context.getColor(R.color.rating_65)), Integer.valueOf(context.getColor(R.color.rating_60)), Integer.valueOf(context.getColor(R.color.rating_10)));
        this.b = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.c = ao2.u(1, context);
        this.d = ypa.b(new ate(this, 21));
        this.e = new Paint();
    }

    private final Path getClipPath() {
        return (Path) this.d.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        canvas.clipPath(getClipPath());
        float height = getHeight() / 5.0f;
        int i = 0;
        float f2 = 0.0f;
        for (Object obj : this.a) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            int intValue = ((Number) obj).intValue();
            Paint paint = this.e;
            paint.setColor(intValue);
            float f3 = f2 + ((3 > i || i >= 5) ? height : height / 2.0f);
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, getWidth(), f3, paint);
            f2 = f3;
            i = i2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float size = View.MeasureSpec.getSize(i);
        float size2 = View.MeasureSpec.getSize(i2);
        getClipPath().reset();
        RectF rectF = this.b;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, size, size2);
        Path clipPath = getClipPath();
        float f2 = this.c;
        clipPath.addRoundRect(rectF, f2, f2, Path.Direction.CW);
    }
}
