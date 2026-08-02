package com.sofascore.results.event.graphs.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.c6;
import defpackage.hc9;
import defpackage.mqi;
import defpackage.nz3;
import defpackage.u6h;
import defpackage.xbb;
import defpackage.y73;
import defpackage.ypa;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/sofascore/results/event/graphs/view/CricketBowlerGraphView;", "Landroid/view/View;", "Landroid/graphics/drawable/Drawable;", InneractiveMediationDefs.GENDER_FEMALE, "Ljoa;", "getPitch", "()Landroid/graphics/drawable/Drawable;", "pitch", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CricketBowlerGraphView extends View {
    public static final /* synthetic */ int k = 0;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final Paint e;
    public final mqi f;
    public final Bitmap g;
    public final Bitmap h;
    public final xbb i;
    public final ArrayList j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CricketBowlerGraphView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Bitmap bitmap;
        context.getClass();
        int s = ao2.s(1, context);
        this.a = s;
        this.b = ao2.s(6, context);
        int s2 = ao2.s(12, context);
        this.c = s2;
        int s3 = ao2.s(16, context);
        this.d = s3;
        int v = ao2.v(40, context);
        int v2 = ao2.v(80, context);
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.surface_1));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(s);
        this.e = paint;
        this.f = ypa.b(new c6(context, 14));
        Drawable drawable = context.getDrawable(R.drawable.ic_cricket_ball);
        Bitmap bitmap2 = null;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(context.getColor(R.color.cricket_neutral), PorterDuff.Mode.SRC_IN));
            bitmap = u6h.U(drawable, s2, s2, 4);
        } else {
            bitmap = null;
        }
        this.g = bitmap;
        Drawable drawable2 = context.getDrawable(R.drawable.ic_cricket_ball);
        if (drawable2 != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(context.getColor(R.color.cricket_wickets), PorterDuff.Mode.SRC_IN));
            bitmap2 = u6h.U(drawable2, s2, s2, 4);
        }
        this.h = bitmap2;
        xbb b = a.b();
        float f = s3 + s;
        b.add(Float.valueOf(f));
        float f2 = v + s;
        float f3 = f + f2;
        b.add(Float.valueOf(f3));
        float f4 = f3 + v2 + s;
        b.add(Float.valueOf(f4));
        b.add(Float.valueOf(f4 + f2));
        this.i = a.a(b);
        this.j = new ArrayList();
    }

    private final Drawable getPitch() {
        return (Drawable) this.f.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        Drawable pitch = getPitch();
        if (pitch != null) {
            pitch.draw(canvas);
        }
        ListIterator listIterator = this.i.listIterator(0);
        while (true) {
            hc9 hc9Var = (hc9) listIterator;
            if (!hc9Var.hasNext()) {
                break;
            }
            float floatValue = ((Number) hc9Var.next()).floatValue();
            canvas.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, floatValue, getWidth(), floatValue, this.e);
        }
        int height = getHeight();
        int i = this.d;
        int i2 = this.a;
        int i3 = (height - i) - i2;
        int width = getWidth();
        getContext().getClass();
        float G = 40.0f / ao2.G(width, r5);
        getContext().getClass();
        float G2 = ((51.0f / ao2.G(i3, r4)) * 32.5f) / 51.0f;
        for (nz3 nz3Var : CollectionsKt.H0(this.j, new y73(11))) {
            float x = nz3Var.b.getX();
            float y = nz3Var.b.getY();
            int width2 = getWidth() / 2;
            getContext().getClass();
            float G3 = ((x - 20.0f) / G) + ao2.G(width2, r11);
            getContext().getClass();
            float G4 = ((y - 16.25f) / G2) + ao2.G(i3 / 2, r11);
            Context context = getContext();
            context.getClass();
            int t = ao2.t(context, G3);
            Context context2 = getContext();
            context2.getClass();
            Point2D point2D = new Point2D(t, ao2.t(context2, G4 + 16.0f + 1.0f));
            float x2 = point2D.getX();
            float f = this.b;
            int i4 = (int) (x2 - f);
            if (i4 < 0) {
                i4 = 0;
            }
            int y2 = (int) (point2D.getY() - f);
            int i5 = i + i2;
            if (y2 < i5) {
                y2 = i5;
            }
            int i6 = this.c;
            int i7 = i4 + i6;
            int i8 = y2 + i6;
            if (i7 > getWidth()) {
                i7 = getWidth();
                i4 = getWidth() - i6;
            }
            if (i8 > getHeight()) {
                i8 = getHeight();
                y2 = getHeight() - i6;
            }
            Bitmap bitmap = nz3Var.a ? this.h : this.g;
            Rect rect = new Rect(i4, y2, i7, i8);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable pitch = getPitch();
        if (pitch != null) {
            pitch.setBounds(0, 0, getWidth(), getHeight());
        }
    }
}
