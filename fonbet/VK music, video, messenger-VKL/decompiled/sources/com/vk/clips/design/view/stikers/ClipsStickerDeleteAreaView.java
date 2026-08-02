package com.vk.clips.design.view.stikers;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.ad0;
import xsna.iah0;
import xsna.idc;
import xsna.ixd;
import xsna.qq2;

/* loaded from: classes16.dex */
public class ClipsStickerDeleteAreaView extends View {
    public static final a j = new a(Float.class, NotificationCompat.CATEGORY_PROGRESS);
    public static final int k = iah0.a(50) / 2;
    public static final int l = iah0.a(58) / 2;
    public final Paint b;
    public final Paint c;
    public final RectF d;
    public final Bitmap e;
    public final Bitmap f;
    public final Bitmap g;
    public float h;
    public AnimatorSet i;

    public class a extends Property<ClipsStickerDeleteAreaView, Float> {
        @Override // android.util.Property
        public final Float get(ClipsStickerDeleteAreaView clipsStickerDeleteAreaView) {
            return Float.valueOf(clipsStickerDeleteAreaView.getProgress());
        }

        @Override // android.util.Property
        public final void set(ClipsStickerDeleteAreaView clipsStickerDeleteAreaView, Float f) {
            clipsStickerDeleteAreaView.setProgress(f.floatValue());
        }
    }

    public ClipsStickerDeleteAreaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Paint(1);
        this.c = new Paint(7);
        this.d = new RectF();
        this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        this.e = BitmapFactory.decodeResource(getResources(), R.drawable.bg_fab_nofill_shadow, options);
        Resources resources = getResources();
        ixd ixdVar = ad0.g;
        ixd.b bVar = (ixdVar == null ? null : ixdVar).a;
        this.f = BitmapFactory.decodeResource(resources, R.drawable.vk_icon_deprecated_ic_deleting_tip_56, options);
        Resources resources2 = getResources();
        ixd ixdVar2 = ad0.g;
        ixd.b bVar2 = (ixdVar2 != null ? ixdVar2 : null).a;
        this.g = BitmapFactory.decodeResource(resources2, R.drawable.vk_icon_deprecated_ic_deleting_tip_hover_56, options);
    }

    public final AnimatorSet a(float f) {
        AnimatorSet animatorSet = this.i;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.i = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.addListener(new idc(this, 1));
        this.i = animatorSet2;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, j, f).setDuration(225L);
        duration.setInterpolator(qq2.e);
        animatorSet2.playTogether(duration);
        this.i.start();
        return this.i;
    }

    public float getProgress() {
        return this.h;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = canvas.getWidth() / 2;
        float height = canvas.getHeight() / 2;
        float f = this.h;
        int i = l;
        int i2 = k;
        float e = qq2.e(f, i2, i);
        float f2 = 1.5454545f * e;
        RectF rectF = this.d;
        rectF.set(width - f2, height - f2, width + f2, f2 + height);
        Paint paint = this.c;
        paint.setAlpha(255);
        canvas.drawBitmap(this.e, (Rect) null, rectF, paint);
        int f3 = qq2.f(this.h);
        Paint paint2 = this.b;
        paint2.setColor(f3);
        canvas.drawCircle(width, height, e, paint2);
        float f4 = i2;
        rectF.set(width - f4, height - f4, width + f4, height + f4);
        float f5 = this.h;
        if (f5 < 0.5d) {
            paint.setAlpha(qq2.e(f5 / 0.5f, 255, 0));
            canvas.drawBitmap(this.f, (Rect) null, rectF, paint);
        } else {
            paint.setAlpha(qq2.e((f5 - 0.5f) / 0.5f, 0, 255));
            canvas.drawBitmap(this.g, (Rect) null, rectF, paint);
        }
    }

    public void setProgress(float f) {
        this.h = f;
        invalidate();
    }
}
