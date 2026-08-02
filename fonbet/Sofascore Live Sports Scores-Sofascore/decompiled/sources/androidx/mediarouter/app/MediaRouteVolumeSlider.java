package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import defpackage.gc0;
import defpackage.hda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class MediaRouteVolumeSlider extends gc0 {
    public final float b;
    public boolean c;
    public Drawable d;
    public int e;
    public int f;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = hda.B(context);
    }

    public final void a(int i, int i2) {
        if (this.e != i) {
            if (Color.alpha(i) != 255) {
                Integer.toHexString(i);
            }
            this.e = i;
        }
        if (this.f != i2) {
            if (Color.alpha(i2) != 255) {
                Integer.toHexString(i2);
            }
            this.f = i2;
        }
    }

    public final void b(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        super.setThumb(z ? null : this.d);
    }

    @Override // defpackage.gc0, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? 255 : (int) (this.b * 255.0f);
        Drawable drawable = this.d;
        int i2 = this.e;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(i2, mode);
        this.d.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(this.f, mode);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.e, mode);
        progressDrawable.setAlpha(i);
    }

    @Override // android.widget.AbsSeekBar
    public final void setThumb(Drawable drawable) {
        this.d = drawable;
        if (this.c) {
            drawable = null;
        }
        super.setThumb(drawable);
    }
}
