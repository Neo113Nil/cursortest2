package s7;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import i7.C7017a;

/* renamed from: s7.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C9611f extends LinearLayoutCompat {

    /* renamed from: e, reason: collision with root package name */
    private Drawable f98312e;

    /* renamed from: f, reason: collision with root package name */
    private final Rect f98313f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f98314g;

    /* renamed from: h, reason: collision with root package name */
    private int f98315h;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f98316i;

    /* renamed from: j, reason: collision with root package name */
    boolean f98317j;

    public C9611f(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f98312e;
        if (drawable != null) {
            if (this.f98317j) {
                this.f98317j = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z11 = this.f98316i;
                Rect rect = this.f98313f;
                if (z11) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i11 = this.f98315h;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f98314g;
                Gravity.apply(i11, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public final void drawableHotspotChanged(float f7, float f11) {
        super.drawableHotspotChanged(f7, f11);
        Drawable drawable = this.f98312e;
        if (drawable != null) {
            drawable.setHotspot(f7, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f98312e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f98312e.setState(getDrawableState());
    }

    @Override // android.view.View
    public final Drawable getForeground() {
        return this.f98312e;
    }

    @Override // android.view.View
    public final int getForegroundGravity() {
        return this.f98315h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f98312e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f98317j = z11 | this.f98317j;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f98317j = true;
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f98312e;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f98312e);
            }
            this.f98312e = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f98315h == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setForegroundGravity(int i11) {
        if (this.f98315h != i11) {
            if ((8388615 & i11) == 0) {
                i11 |= 8388611;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            this.f98315h = i11;
            if (i11 == 119 && this.f98312e != null) {
                this.f98312e.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f98312e;
    }

    public C9611f(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, 0);
        this.f98313f = new Rect();
        this.f98314g = new Rect();
        this.f98315h = 119;
        this.f98316i = true;
        this.f98317j = false;
        TypedArray e11 = C9619n.e(context, attributeSet, C7017a.f65951q, 0, 0, new int[0]);
        this.f98315h = e11.getInt(1, this.f98315h);
        Drawable drawable = e11.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f98316i = e11.getBoolean(2, true);
        e11.recycle();
    }
}
