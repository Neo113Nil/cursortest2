package com.sofascore.results.event.statistics.view.football;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.llf;
import defpackage.wzb;
import defpackage.x31;
import defpackage.y31;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/event/statistics/view/football/FootballGoalmapView;", "Ly31;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FootballGoalmapView extends y31 {
    public final float r;
    public final float s;
    public final int t;
    public final int u;
    public final int v;
    public final Drawable w;
    public final Drawable x;
    public final Paint y;
    public final Paint z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FootballGoalmapView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.r = ao2.v(140, context);
        this.s = ao2.v(49, context);
        this.t = ao2.v(34, context);
        this.u = ao2.v(18, context);
        this.v = ao2.v(10, context);
        this.w = context.getDrawable(R.drawable.football_goalmap_goal);
        this.x = context.getDrawable(R.drawable.football_goalmap_box);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(context.getColor(R.color.terrain_football));
        this.y = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(context.getColor(R.color.surface_2));
        this.z = paint2;
    }

    @Override // defpackage.y31
    public final void a(Canvas canvas) {
        canvas.getClass();
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight(), this.z);
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getHeight() - this.u, getWidth(), getHeight(), this.y);
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.w;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // defpackage.y31
    public final void e(x31 x31Var) {
        if (x31Var != null) {
            Point2D point2D = x31Var.d;
            Context context = getContext();
            context.getClass();
            float w = ao2.w(context, 280.0f);
            float height = getHeight();
            float f = this.u;
            float f2 = height - f;
            int width = getWidth();
            getContext().getClass();
            float G = ao2.G(width, r5) / 8.27f;
            if (G > 100.0f) {
                G = 100.0f;
            }
            float f3 = (100.0f - G) / 2.0f;
            float f4 = (100.0f - f3) - f3;
            float x = point2D.getX() - f3;
            float y = point2D.getY();
            float width2 = (getWidth() / G) * ((this.x != null ? r6.getIntrinsicWidth() : w) / w);
            float f5 = f2 / 100.0f;
            float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= x && x <= f4) {
                f6 = x * width2;
            } else if (x >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f6 = x > f4 ? getWidth() : getWidth() / 2.0f;
            }
            x31Var.e = new Point2D(llf.b(f6, getFieldPadding() + getDpToPx8(), (getWidth() - getDpToPx8()) - getFieldPadding()), llf.b(y * f5, getFieldPadding() + getDpToPx8(), getHeight() - f));
        }
    }

    @Override // defpackage.y31
    public final void g(int i, int i2) {
        int i3 = i / 2;
        float f = i3;
        int b = wzb.b(Math.min(0.9f * f, this.r));
        int b2 = wzb.b(Math.min(f * 0.31f, this.s));
        int i4 = this.u;
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setBounds(new Rect(i3 - b, i2 - i4, b + i3, i2 - this.v));
        }
        Drawable drawable2 = this.w;
        if (drawable2 != null) {
            drawable2.setBounds(new Rect(i3 - b2, (i2 - i4) - this.t, i3 + b2, i2 - i4));
        }
    }
}
