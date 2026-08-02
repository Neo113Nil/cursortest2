package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.sports.insider.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends AppCompatImageView implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f810a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f810a = nVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        m4.g.v(this, getContentDescription());
        setOnTouchListener(new androidx.appcompat.view.menu.b(this, this));
    }

    @Override // androidx.appcompat.widget.o
    public final boolean a() {
        return false;
    }

    @Override // androidx.appcompat.widget.o
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f810a.d();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i5, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i5, i10, i11, i12);
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
