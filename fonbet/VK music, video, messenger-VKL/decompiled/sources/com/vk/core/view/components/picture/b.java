package com.vk.core.view.components.picture;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.Icon;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.vk.core.view.components.picture.VkPictureOverlay;
import com.vk.core.view.components.picture.c;
import com.vk.imageloader.view.DefaultVkImageView;
import com.vk.movika.sdk.base.ui.p;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;
import xsna.cut0;
import xsna.dko;
import xsna.eko;
import xsna.epx;
import xsna.gko;
import xsna.gpo0;
import xsna.hbh0;
import xsna.krv0;
import xsna.msy;
import xsna.too0;
import xsna.x7g;

/* compiled from: VkBasePicture.kt */
/* loaded from: classes.dex */
public abstract class b extends DefaultVkImageView implements too0 {
    public c k;
    public VkPictureOverlay l;
    public final Paint m;
    public final Paint n;
    public Drawable o;
    public Paint p;

    /* compiled from: VkBasePicture.kt */
    /* loaded from: classes17.dex */
    public final class a extends DrawableWrapper {
        public final Drawable b;

        public a(Drawable drawable) {
            super(drawable);
            this.b = drawable;
        }

        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            b bVar = b.this;
            int placeholderIconSize = bVar.getPlaceholderIconSize() / 2;
            this.b.setBounds(getBounds().centerX() - placeholderIconSize, getBounds().centerY() - placeholderIconSize, getBounds().centerX() + placeholderIconSize, getBounds().centerY() + placeholderIconSize);
            canvas.drawPaint(bVar.getBackgroundPaint());
            super.draw(canvas);
        }
    }

    /* compiled from: VkBasePicture.kt */
    /* renamed from: com.vk.core.view.components.picture.b$b, reason: collision with other inner class name */
    /* loaded from: classes17.dex */
    public final class C0852b extends Drawable {
        public final String a;
        public final int b;
        public final Object c;

        public C0852b(String str, int i) {
            this.a = str;
            this.b = i;
            this.c = msy.a(LazyThreadSafetyMode.NONE, new p(24, b.this, this));
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            ?? r0 = this.c;
            ((Paint) r0.getValue()).setTextSize(b.this.getTextSize());
            canvas.drawText(this.a, getBounds().exactCenterX(), getBounds().exactCenterY() - (((Paint) r0.getValue()).ascent() * 0.4f), (Paint) r0.getValue());
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -3;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
            ((Paint) this.c.getValue()).setAlpha(i);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
            ((Paint) this.c.getValue()).setColorFilter(colorFilter);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(krv0.m(R.attr.vk_ui_background_secondary, context));
        this.m = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(hbh0.a(context, 1.0f));
        paint2.setColor(krv0.m(R.attr.vk_ui_image_border_alpha, context));
        this.n = paint2;
    }

    public final void K0(c cVar) {
        Drawable a2;
        Drawable a3;
        Drawable drawable;
        Drawable a4;
        if (cVar instanceof c.a) {
            c.a aVar = (c.a) cVar;
            PaintDrawable paintDrawable = new PaintDrawable(this.m.getColor());
            dko a5 = aVar.a();
            if (a5 == null || (a4 = a5.a(getContext())) == null || (drawable = a4.mutate()) == null) {
                drawable = paintDrawable;
            }
            cut0 b = aVar.b();
            if (b != null) {
                drawable.setTint(b.b(getContext()));
            }
            setPlaceholderImage(new LayerDrawable(new Drawable[]{paintDrawable, new a(drawable)}));
            o0(null, null);
            return;
        }
        if (cVar instanceof c.C0853c) {
            c.C0853c c0853c = (c.C0853c) cVar;
            getContext();
            Drawable c0852b = new C0852b(c0853c.b(), gpo0.d(R.attr.vk_ui_text_contrast, this));
            Drawable a6 = ((eko) c0853c.a()).a(getContext());
            if (a6 != null) {
                c0852b = new LayerDrawable(new Drawable[]{a6, c0852b});
            }
            setPlaceholderImage(c0852b);
            o0(null, null);
            return;
        }
        if (cVar instanceof c.b) {
            dko a7 = ((c.b) cVar).a();
            if (a7 != null && (a3 = a7.a(getContext())) != null) {
                setPlaceholderImage(a3);
            }
            o0(null, null);
            return;
        }
        if (!(cVar instanceof c.d)) {
            if (cVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            o0(null, null);
        } else {
            c.d dVar = (c.d) cVar;
            dko a8 = dVar.a();
            if (a8 != null && (a2 = a8.a(getContext())) != null) {
                setPlaceholderImage(a2);
            }
            o0(dVar.b(), null);
        }
    }

    public final void L0(Canvas canvas) {
        Drawable drawable = this.o;
        if (drawable == null) {
            return;
        }
        int overlayIconSize = getOverlayIconSize();
        Paint paint = this.p;
        if (paint != null) {
            canvas.drawPaint(paint);
        }
        drawable.setBounds(0, 0, overlayIconSize, overlayIconSize);
        float width = (getWidth() - overlayIconSize) / 2.0f;
        float height = (getHeight() - overlayIconSize) / 2.0f;
        canvas.translate(width, height);
        drawable.draw(canvas);
        canvas.translate(-width, -height);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (xsna.epx.f(xsna.krv0.i(r5), java.lang.Boolean.TRUE) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        if (xsna.epx.f(xsna.krv0.i(r0), java.lang.Boolean.TRUE) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(VkPictureOverlay vkPictureOverlay) {
        int d;
        Drawable drawable = null;
        if (vkPictureOverlay == null) {
            this.o = null;
            this.p = null;
        } else {
            Drawable a2 = ((gko) vkPictureOverlay.a()).a(getContext());
            if (a2 != null) {
                cut0 b = vkPictureOverlay.b();
                if (b != null) {
                    d = cut0.a.a((x7g) b, getContext());
                } else {
                    VkPictureOverlay.Tint c = vkPictureOverlay.c();
                    Context context = getContext();
                    int i = com.vk.core.view.components.picture.a.$EnumSwitchMapping$1[c.ordinal()];
                    int i2 = R.attr.vk_ui_icon_contrast;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            TypedValue typedValue = krv0.a;
                        }
                        i2 = R.attr.vk_ui_icon_accent;
                    }
                    d = gpo0.d(i2, this);
                }
                a2.setTint(d);
                drawable = a2;
            }
            this.o = drawable;
            VkPictureOverlay.Tint c2 = vkPictureOverlay.c();
            Context context2 = getContext();
            int i3 = com.vk.core.view.components.picture.a.$EnumSwitchMapping$1[c2.ordinal()];
            int i4 = R.attr.vk_ui_avatar_overlay;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TypedValue typedValue2 = krv0.a;
                }
                i4 = R.attr.vk_ui_avatar_overlay_inverse_alpha;
            }
            int d2 = gpo0.d(i4, this);
            Paint paint = new Paint();
            paint.setColor(d2);
            paint.setStyle(Paint.Style.FILL);
            this.p = paint;
        }
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, xsna.too0
    public void Ng() {
        Context context = getContext();
        getContext();
        this.m.setColor(krv0.m(R.attr.vk_ui_background_secondary, context));
        this.n.setColor(krv0.m(R.attr.vk_ui_image_border_alpha, getContext()));
        c cVar = this.k;
        if (cVar != null) {
            K0(cVar);
        }
        VkPictureOverlay vkPictureOverlay = this.l;
        if (vkPictureOverlay != null) {
            N0(vkPictureOverlay);
        }
        invalidate();
    }

    public final Paint getBackgroundPaint() {
        return this.m;
    }

    public final c getContent() {
        return this.k;
    }

    public final Paint getInnerBorderPaint() {
        return this.n;
    }

    @Override // android.view.View
    public final VkPictureOverlay getOverlay() {
        return this.l;
    }

    public abstract int getOverlayIconSize();

    public abstract int getPlaceholderIconSize();

    public float getTextSize() {
        Context context = getContext();
        int b = an10.b(hbh0.c(context, getWidth()));
        return hbh0.a(context, b < 20 ? 5 : b < 28 ? 8 : b < 36 ? 10 : b < 40 ? 13 : b < 48 ? 14 : b < 56 ? 17 : b < 64 ? 18 : b < 72 ? 21 : b < 88 ? 26 : 30);
    }

    public final void setContent(c cVar) {
        if (epx.f(this.k, cVar)) {
            return;
        }
        this.k = cVar;
        K0(cVar);
    }

    @Override // xsna.zjt, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setContent(null);
        super.setImageBitmap(bitmap);
    }

    @Override // xsna.zjt, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        setContent(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageIcon(Icon icon) {
        setContent(null);
        super.setImageIcon(icon);
    }

    @Override // xsna.zjt, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        setContent(null);
        super.setImageResource(i);
    }

    @Override // xsna.zjt, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        setContent(null);
        super.setImageURI(uri);
    }

    public final void setOverlay(VkPictureOverlay vkPictureOverlay) {
        this.l = vkPictureOverlay;
        N0(vkPictureOverlay);
    }
}
