package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.sofascore.results.R;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lcd extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    public int a;
    public boolean b;
    public final Rect c;
    public of d;
    public d7j e;
    public final Rect f;
    public boolean g;
    public long h;
    public volatile boolean i;
    public final WeakHashMap j;
    public final Point k;
    public final Rect l;
    public ku3 m;
    public boolean n;
    public final yw8 o;
    public MotionEvent p;
    public float q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcd(Context context) {
        super(context, null, 0);
        context.getClass();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.c = new Rect();
        this.f = new Rect();
        this.i = true;
        this.j = new WeakHashMap();
        this.k = new Point();
        this.l = new Rect();
        this.m = s9a.k();
        this.o = new yw8(context, kcd.a);
        this.q = 1.0f;
    }

    public final int a(Integer num) {
        return wzb.b(num.floatValue() * getResources().getDisplayMetrics().density);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        of ofVar;
        motionEvent.getClass();
        boolean onTouchEvent = this.o.a.onTouchEvent(motionEvent);
        if (onTouchEvent && (ofVar = this.d) != null) {
            ofVar.h();
        }
        if (this.n) {
            super.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (onTouchEvent) {
            super.dispatchTouchEvent(this.p);
            super.dispatchTouchEvent(motionEvent);
            MotionEvent motionEvent2 = this.p;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.p = null;
            return true;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.p = MotionEvent.obtain(motionEvent);
            return true;
        }
        if (motionEvent.getActionMasked() == 3) {
            MotionEvent motionEvent3 = this.p;
            if (motionEvent3 != null) {
                motionEvent3.recycle();
            }
            this.p = null;
        }
        return true;
    }

    @NotNull
    public final yw8 getClickDetector$render_release() {
        return this.o;
    }

    public final boolean getClickProtectionDisabled() {
        return this.n;
    }

    @Nullable
    public final MotionEvent getDownEvent$render_release() {
        return this.p;
    }

    public final int getExposure() {
        return this.a;
    }

    @NotNull
    public final Rect getExposureRect$render_release() {
        return this.f;
    }

    public final boolean getExposureScheduled$render_release() {
        return this.g;
    }

    @NotNull
    public final ku3 getExposureScope$render_release() {
        return this.m;
    }

    public final long getLastReportTime$render_release() {
        return this.h;
    }

    @NotNull
    public final ImageButton getMuteButton() {
        ImageButton imageButton = (ImageButton) findViewById(R.id.nimbus_mute);
        if (imageButton == null) {
            imageButton = new ImageButton(getContext());
            imageButton.setId(R.id.nimbus_mute);
            imageButton.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388693));
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.setAlpha(50);
            shapeDrawable.getPaint().setColor(-16777216);
            imageButton.setBackground(shapeDrawable);
            imageButton.setOnClickListener(new au7(29, imageButton, this));
            imageButton.setImageResource(R.drawable.ic_nimbus_volume);
            int a = a(8);
            imageButton.setPadding(a, a, a, a);
            of ofVar = this.d;
            int g = ofVar != null ? ofVar.g() : 0;
            imageButton.setContentDescription(imageButton.getContext().getString(g == 0 ? R.string.nimbus_muted : R.string.nimbus_unmuted));
            imageButton.setImageLevel(g);
            addView(imageButton);
        }
        return imageButton;
    }

    public final boolean getNeedsExposureUpdate$render_release() {
        return this.i;
    }

    @NotNull
    public final WeakHashMap<View, Rect> getObstructingViewCache$render_release() {
        return this.j;
    }

    @NotNull
    public final Point getOffset$render_release() {
        return this.k;
    }

    @NotNull
    public final Rect getTmpRect$render_release() {
        return this.l;
    }

    @NotNull
    public final Rect getVisibleRect() {
        return this.c;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        s9a.I(this);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            if (childAt.getId() == R.id.nimbus_mute) {
                childAt = null;
            }
            if (childAt != null) {
                float min = Math.min(getWidth() / childAt.getWidth(), getHeight() / childAt.getHeight());
                if (Float.isInfinite(min) || Float.isNaN(min)) {
                    return;
                }
                childAt.setScaleX(min);
                childAt.setScaleY(min);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        cjb.a("Width: " + View.MeasureSpec.getSize(i) + " Height: " + View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        s9a.I(this);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        view.getClass();
        super.onViewAdded(view);
        float f = this.q;
        if (f >= 1.0f || !(view instanceof WebView)) {
            return;
        }
        ((WebView) view).setAlpha(f);
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        setVisibleInWindow$render_release(z);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        view.getClass();
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.q = f;
    }

    public final void setClickProtectionDisabled$render_release(boolean z) {
        this.n = z;
    }

    public final void setDownEvent$render_release(@Nullable MotionEvent motionEvent) {
        this.p = motionEvent;
    }

    public final void setExposure$render_release(int i) {
        this.a = i;
    }

    public final void setExposureScheduled$render_release(boolean z) {
        this.g = z;
    }

    public final void setExposureScope$render_release(@NotNull ku3 ku3Var) {
        ku3Var.getClass();
        this.m = ku3Var;
    }

    public final void setLastReportTime$render_release(long j) {
        this.h = j;
    }

    public final void setNeedsExposureUpdate$render_release(boolean z) {
        this.i = z;
    }

    public final void setVisibleInWindow$render_release(boolean z) {
        if (this.b != z) {
            this.b = z;
            of ofVar = this.d;
            if (ofVar != null) {
                ofVar.j(z);
            }
            d7j d7jVar = this.e;
            if (d7jVar != null) {
                d7jVar.j(z);
            }
            if (z) {
                if (!s9a.w(this.m)) {
                    this.m = s9a.k();
                }
                getViewTreeObserver().addOnGlobalLayoutListener(this);
                getViewTreeObserver().addOnScrollChangedListener(this);
            } else {
                getViewTreeObserver().removeOnGlobalLayoutListener(this);
                getViewTreeObserver().removeOnScrollChangedListener(this);
                s9a.o(this.m, null);
            }
            s9a.I(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
    }
}
