package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.sofascore.results.R;
import com.sofascore.results.view.FootballPlayAreasView;
import com.unity3d.services.UnityAdsConstants;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class z31 extends LinearLayout {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final Paint g;
    public boolean h;

    public z31(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.sofascoreSmallRatingStyle);
        float u = ao2.u(2, context);
        this.a = u / 2.0f;
        this.b = ao2.u(81, context);
        this.c = ao2.u(48, context);
        this.d = ao2.u(42, context);
        this.e = ao2.u(12, context);
        this.f = context.getColor(R.color.terrain_football);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(context.getColor(R.color.surface_1));
        paint.setStrokeWidth(u);
        this.g = paint;
        new Paint().setColor(context.getColor(R.color.n_lv_5));
    }

    public final void a(Canvas canvas, float f, float f2, float f3) {
        Canvas canvas2;
        Paint paint = this.g;
        float height = (this.h ? getHeight() : getWidth()) / 2.0f;
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            canvas.rotate(f3);
            float f4 = this.e;
            canvas2 = canvas;
            try {
                canvas2.drawArc(height - f4, -f4, height + f4, f4, 180.0f, 90.0f, false, paint);
                float f5 = this.e;
                canvas2.drawArc((-height) - f5, -f5, f5 - height, f5, 270.0f, 90.0f, false, paint);
                canvas2.drawRect(-getPenaltyAreaHalfWidth(), -getPenaltyAreaHeight(), getPenaltyAreaHalfWidth(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
                b(canvas2);
                canvas2.restoreToCount(save);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                canvas2.restoreToCount(save);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            canvas2 = canvas;
        }
    }

    public abstract void b(Canvas canvas);

    public final float getCornerRadius() {
        return this.e;
    }

    public float getGoalSpace() {
        return this.d;
    }

    public final float getHalfLineWidth() {
        return this.a;
    }

    @NotNull
    public final Paint getLinePaint() {
        return this.g;
    }

    public float getPenaltyAreaHalfWidth() {
        return this.b;
    }

    public float getPenaltyAreaHeight() {
        return this.c;
    }

    public final int getTerrainColor() {
        return this.f;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.getClass();
        FootballPlayAreasView footballPlayAreasView = (FootballPlayAreasView) this;
        canvas.getClass();
        float width = footballPlayAreasView.getWidth() / 2.0f;
        float height = footballPlayAreasView.getHeight() / 2.0f;
        canvas.drawRect(footballPlayAreasView.getHalfLineWidth(), footballPlayAreasView.getHalfLineWidth(), footballPlayAreasView.getWidth() - footballPlayAreasView.getHalfLineWidth(), footballPlayAreasView.getHeight() - footballPlayAreasView.getHalfLineWidth(), footballPlayAreasView.getLinePaint());
        canvas.drawCircle(width, height, footballPlayAreasView.x / 9.0f, footballPlayAreasView.getLinePaint());
        footballPlayAreasView.a(canvas, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height, 90.0f);
        canvas.drawLine(width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, footballPlayAreasView.getHeight(), footballPlayAreasView.getLinePaint());
        footballPlayAreasView.a(canvas, footballPlayAreasView.getWidth(), height, 270.0f);
        super.onDraw(canvas);
    }

    public final void setInLandscape(boolean z) {
        this.h = z;
    }
}
