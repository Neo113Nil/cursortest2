package com.sofascore.results.view.graph;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.same.report.j;
import com.sofascore.model.mvvm.model.ShotMapPoint;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.i99;
import defpackage.joa;
import defpackage.km5;
import defpackage.vn1;
import defpackage.ypa;
import defpackage.ysa;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/sofascore/results/view/graph/BasketballShotmapGraph;", "Landroid/view/View;", "", "Lcom/sofascore/model/mvvm/model/ShotMapPoint;", "shotmap", "", "setShotmap", "(Ljava/util/List;)V", "Landroid/graphics/drawable/Drawable;", a.q, "Landroid/graphics/drawable/Drawable;", "getCourtLines", "()Landroid/graphics/drawable/Drawable;", "courtLines", "Li99;", j.b, "Ljoa;", "getHeatmapImageGenerator", "()Li99;", "heatmapImageGenerator", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class BasketballShotmapGraph extends View {
    public static final /* synthetic */ int k = 0;
    public final Drawable a;
    public final Drawable b;

    /* renamed from: c, reason: from kotlin metadata */
    public final Drawable courtLines;
    public final Drawable d;
    public final Paint e;
    public final float f;
    public List g;
    public Bitmap h;
    public boolean i;

    /* renamed from: j, reason: from kotlin metadata */
    public final joa heatmapImageGenerator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasketballShotmapGraph(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        context.getClass();
        Drawable drawable = context.getDrawable(R.drawable.ic_shot_made);
        Drawable drawable2 = null;
        if (drawable != null) {
            drawable.setBounds((-drawable.getIntrinsicWidth()) / 2, (-drawable.getIntrinsicHeight()) / 2, drawable.getIntrinsicWidth() / 2, drawable.getIntrinsicHeight() / 2);
        } else {
            drawable = null;
        }
        this.a = drawable;
        Drawable drawable3 = context.getDrawable(R.drawable.ic_x_16);
        if (drawable3 != null) {
            drawable3.setBounds((-drawable3.getIntrinsicWidth()) / 2, (-drawable3.getIntrinsicHeight()) / 2, drawable3.getIntrinsicWidth() / 2, drawable3.getIntrinsicHeight() / 2);
        } else {
            drawable3 = null;
        }
        this.b = drawable3;
        Drawable drawable4 = context.getDrawable(R.drawable.basketball_lines);
        if (drawable4 != null) {
            drawable4.setBounds((-drawable4.getIntrinsicWidth()) / 2, 0, drawable4.getIntrinsicWidth() / 2, drawable4.getIntrinsicHeight());
        } else {
            drawable4 = null;
        }
        this.courtLines = drawable4;
        Drawable drawable5 = context.getDrawable(R.drawable.bg_basketball_court);
        if (drawable5 != null) {
            drawable5.setBounds((-drawable5.getIntrinsicWidth()) / 2, 0, drawable5.getIntrinsicWidth() / 2, drawable5.getIntrinsicHeight());
            drawable2 = drawable5;
        }
        this.d = drawable2;
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.terrain_basketball));
        this.e = paint;
        this.f = ao2.u(6, context);
        this.g = km5.a;
        this.heatmapImageGenerator = ypa.a(ysa.c, new vn1(9));
    }

    private final i99 getHeatmapImageGenerator() {
        return (i99) this.heatmapImageGenerator.getValue();
    }

    public final void a(ArrayList arrayList, int i) {
        arrayList.getClass();
        if (getMeasuredWidth() == 0) {
            measure(0, 0);
        }
        i99 heatmapImageGenerator = getHeatmapImageGenerator();
        Context context = getContext();
        context.getClass();
        this.h = Bitmap.createScaledBitmap(i99.b(heatmapImageGenerator, context, arrayList, i, false, false, false, 120), getMeasuredWidth(), getMeasuredHeight() - ((int) this.f), false);
        invalidate();
    }

    @Nullable
    public Drawable getCourtLines() {
        return this.courtLines;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int intrinsicWidth;
        Integer num;
        canvas.getClass();
        canvas.drawPaint(this.e);
        Bitmap bitmap = this.h;
        Integer num2 = null;
        float f = this.f;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (getWidth() / 2.0f) - ((getCourtLines() != null ? r8.getIntrinsicWidth() : 0) / 2), f, (Paint) null);
        }
        canvas.translate(getWidth() / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Drawable courtLines = getCourtLines();
        if (courtLines != null) {
            courtLines.draw(canvas);
        }
        if (this.i) {
            Context context = getContext();
            context.getClass();
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ao2.u(1, context));
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            Context context2 = getContext();
            context2.getClass();
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ao2.u(-1, context2));
        }
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
        float intrinsicWidth2 = (getCourtLines() != null ? r2.getIntrinsicWidth() : 0) / 2.0f;
        for (ShotMapPoint shotMapPoint : this.g) {
            ShotMapPoint.Type type = shotMapPoint.getType();
            ShotMapPoint.Type type2 = ShotMapPoint.Type.SHOT_MADE;
            Drawable drawable2 = this.b;
            Drawable drawable3 = this.a;
            if (type == type2) {
                if (drawable3 != null) {
                    intrinsicWidth = drawable3.getIntrinsicWidth();
                    num = Integer.valueOf(intrinsicWidth);
                }
                num = num2;
            } else {
                if (drawable2 != null) {
                    intrinsicWidth = drawable2.getIntrinsicWidth();
                    num = Integer.valueOf(intrinsicWidth);
                }
                num = num2;
            }
            float intValue = num != null ? num.intValue() : 0.0f;
            float x = (((float) shotMapPoint.getX()) / 250.0f) * intrinsicWidth2;
            float y = (((float) (shotMapPoint.getY() + 40.0d)) / 2.0f) * getResources().getDisplayMetrics().density;
            float f2 = intValue / 2.0f;
            if (intrinsicWidth2 + x < f2) {
                x = f2 - intrinsicWidth2;
            } else {
                float f3 = intrinsicWidth2 - f2;
                if (x > f3) {
                    x = f3;
                }
            }
            Context context3 = getContext();
            context3.getClass();
            int s = ao2.s(2, context3);
            if (y < f2) {
                y = f2;
            } else {
                float f4 = s;
                if (y > (getHeight() - intValue) - f4) {
                    y = (getHeight() - intValue) - f4;
                }
            }
            canvas.save();
            canvas.translate(x, y);
            if (shotMapPoint.getType() == type2) {
                if (drawable3 != null) {
                    drawable3.draw(canvas);
                }
            } else if (drawable2 != null) {
                drawable2.draw(canvas);
            }
            canvas.restore();
            num2 = null;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            Drawable courtLines = getCourtLines();
            size = courtLines != null ? courtLines.getIntrinsicWidth() : 0;
        }
        Drawable courtLines2 = getCourtLines();
        setMeasuredDimension(size, courtLines2 != null ? courtLines2.getIntrinsicHeight() : 0);
    }

    public final void setShotmap(@NotNull List<ShotMapPoint> shotmap) {
        shotmap.getClass();
        this.i = true;
        this.g = shotmap;
        invalidate();
    }
}
