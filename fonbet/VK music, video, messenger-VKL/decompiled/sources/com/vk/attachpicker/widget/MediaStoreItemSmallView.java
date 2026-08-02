package com.vk.attachpicker.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.ImageScreenSize;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import xsna.f5h0;
import xsna.iah0;
import xsna.joo;
import xsna.m33;
import xsna.odj;
import xsna.ox0;
import xsna.pvo0;
import xsna.s1e0;

/* loaded from: classes15.dex */
public class MediaStoreItemSmallView extends LocalImageView {
    public static final int z = iah0.a(4);
    public float p;
    public int q;
    public Drawable r;
    public final Rect s;
    public final Rect t;
    public boolean u;
    public MediaStoreEntry v;
    public StaticLayout w;

    @Nullable
    public Drawable x;
    public s1e0 y;

    public MediaStoreItemSmallView(Context context, AttributeSet attributeSet) {
        super(context);
        this.p = 1.0f;
        this.q = 0;
        this.s = new Rect();
        this.t = new Rect();
        this.u = false;
        setRatio(1.0f);
        setCornerRadius(0);
        X0();
        X0();
    }

    @Override // com.vk.attachpicker.widget.LocalImageView
    public final void U0(MediaStoreEntry mediaStoreEntry, ImageScreenSize imageScreenSize) {
        Y0(mediaStoreEntry);
        super.U0(mediaStoreEntry, imageScreenSize);
    }

    @Override // com.vk.attachpicker.widget.LocalImageView
    public final void W0(MediaStoreEntry mediaStoreEntry) {
        Y0(mediaStoreEntry);
        super.W0(mediaStoreEntry);
    }

    public final void X0() {
        setId(R.id.picker_photo);
        getHierarchy().o(f5h0.f.a);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.x = m33.a(R.drawable.vk_icon_deprecated_picker_ic_gallery_video_badge_24, getContext());
        Drawable a = m33.a(R.drawable.picker_white_ripple_bounded, getContext());
        this.r = a;
        a.setCallback(this);
        s1e0 s1e0Var = new s1e0();
        this.y = s1e0Var;
        s1e0Var.b = new ox0(this, 27);
    }

    public final void Y0(MediaStoreEntry mediaStoreEntry) {
        this.v = mediaStoreEntry;
        long j = mediaStoreEntry instanceof MediaStoreVideoEntry ? ((MediaStoreVideoEntry) mediaStoreEntry).q : 0L;
        if (j > 0) {
            int i = (int) (j / 1000);
            HashMap<Integer, StaticLayout> hashMap = joo.c;
            StaticLayout staticLayout = hashMap.get(Integer.valueOf(i));
            if (staticLayout == null) {
                StaticLayout staticLayout2 = new StaticLayout(pvo0.b(i), joo.a, joo.b, Layout.Alignment.ALIGN_NORMAL, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
                hashMap.put(Integer.valueOf(i), staticLayout2);
                staticLayout = staticLayout2;
            }
            this.w = staticLayout;
        } else {
            this.w = null;
        }
        if (mediaStoreEntry.i) {
            this.y.start();
        } else {
            this.y.stop();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        MediaStoreEntry mediaStoreEntry;
        super.draw(canvas);
        Drawable drawable = this.r;
        if (drawable != null) {
            if (this.u) {
                this.u = false;
                Rect rect = this.s;
                Rect rect2 = this.t;
                rect.set(getPaddingLeft(), getPaddingTop(), (getRight() - getLeft()) - getPaddingRight(), (getBottom() - getTop()) - getPaddingBottom());
                Gravity.apply(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
        if (this.y == null || (mediaStoreEntry = this.v) == null || !mediaStoreEntry.i) {
            return;
        }
        this.y.draw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.r;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.r.setState(getDrawableState());
    }

    public MediaStoreEntry getStoreEntry() {
        return this.v;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // com.vk.imageloader.view.VKImageView, xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        try {
            super.onDraw(canvas);
            StaticLayout staticLayout = this.w;
            int i = z;
            if (staticLayout != null) {
                int lineWidth = (int) staticLayout.getLineWidth(0);
                int save = canvas.save();
                canvas.translate((canvas.getWidth() - lineWidth) - i, (canvas.getHeight() - this.w.getHeight()) - i);
                this.w.draw(canvas);
                canvas.restoreToCount(save);
            }
            MediaStoreEntry mediaStoreEntry = this.v;
            if (mediaStoreEntry == null || (drawable = this.x) == null || !(mediaStoreEntry instanceof MediaStoreVideoEntry)) {
                return;
            }
            drawable.setBounds(i, (canvas.getHeight() - i) - this.x.getIntrinsicHeight(), this.x.getIntrinsicWidth() + i, canvas.getHeight() - i);
            this.x.draw(canvas);
        } catch (RuntimeException e) {
            StringBuilder a = odj.a(getImageWidth(), getImageHeight(), "image_size:", StringUtils.COMMA, "\ncanvas:");
            a.append(canvas.getWidth());
            a.append(StringUtils.COMMA);
            a.append(canvas.getHeight());
            a.append("\nentry:");
            a.append(this.v.toString());
            throw new RuntimeException(a.toString(), e);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        this.u = z2;
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (this.p * View.MeasureSpec.getSize(i)), 1073741824));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.u = true;
    }

    @Override // xsna.zjt, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setHotspot(motionEvent.getX(), motionEvent.getY());
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCornerRadius(int i) {
        if (this.q == i) {
            return;
        }
        this.q = i;
        getHierarchy().u(RoundingParams.b(i));
    }

    public void setRatio(float f) {
        if (this.p == f) {
            return;
        }
        this.p = f;
        requestLayout();
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r;
    }
}
