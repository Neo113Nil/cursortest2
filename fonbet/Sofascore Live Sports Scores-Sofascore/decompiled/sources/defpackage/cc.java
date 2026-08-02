package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cc extends AppCompatImageView implements ec {
    public final /* synthetic */ dc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(dc dcVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.a = dcVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        qkj.a(this, getContentDescription());
        setOnTouchListener(new yb(this, this));
    }

    @Override // defpackage.ec
    public final boolean a() {
        return false;
    }

    @Override // defpackage.ec
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.a.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
