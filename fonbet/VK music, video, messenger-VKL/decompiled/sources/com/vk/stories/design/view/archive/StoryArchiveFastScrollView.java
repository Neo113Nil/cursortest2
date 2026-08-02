package com.vk.stories.design.view.archive;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.an10;
import xsna.e3m;
import xsna.gh1;
import xsna.iah0;
import xsna.jtd;
import xsna.m33;
import xsna.nq4;
import xsna.qq2;
import xsna.swe0;
import xsna.too0;

/* compiled from: StoryArchiveFastScrollView.kt */
/* loaded from: classes6.dex */
public final class StoryArchiveFastScrollView extends View implements too0 {
    public static final int h = iah0.a(8);
    public a b;
    public Drawable c;
    public boolean d;
    public RecyclerView e;
    public final b f;
    public float g;

    /* compiled from: StoryArchiveFastScrollView.kt */
    public interface a {
    }

    /* compiled from: StoryArchiveFastScrollView.kt */
    public final class b extends RecyclerView.t {
        public boolean b;

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (recyclerView.getHeight() == 0 || this.b) {
                return;
            }
            StoryArchiveFastScrollView.this.setScrollFactor(recyclerView.computeVerticalScrollOffset() / (recyclerView.computeVerticalScrollRange() - recyclerView.getHeight()));
        }
    }

    public StoryArchiveFastScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        e3m.a aVar = e3m.a;
        this.c = m33.a(R.drawable.story_archive_fast_scroller, context);
        this.f = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScrollFactor(float f) {
        this.g = swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        invalidate();
    }

    @Override // xsna.too0
    public final void Ng() {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        setIconDrawable(m33.a(R.drawable.story_archive_fast_scroller, context));
    }

    public final void b(boolean z) {
        if (this.d) {
            return;
        }
        if (getWidth() == 0) {
            post(new jtd(this, z, 2));
        }
        if (z) {
            animate().translationX(getWidth()).setDuration(400L).setInterpolator(qq2.g).start();
        } else {
            setTranslationX(getWidth());
        }
    }

    public final void c() {
        if (getTranslationX() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        if (getWidth() == 0) {
            post(new nq4(this, 10));
        }
        setTranslationX(getWidth());
        animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(400L).setInterpolator(qq2.f).start();
    }

    public final a getCallback() {
        return this.b;
    }

    public final Drawable getIconDrawable() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height = (int) (((((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.c.getIntrinsicHeight()) * this.g) + getPaddingTop());
        this.c.setBounds(getPaddingStart(), height, this.c.getIntrinsicWidth() + getPaddingStart(), this.c.getIntrinsicHeight() + height);
        this.c.draw(canvas);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            float y = motionEvent.getY();
            int i = this.c.getBounds().top;
            int i2 = h;
            setScrolling(y >= ((float) (i - i2)) && motionEvent.getY() <= ((float) (this.c.getBounds().bottom + i2)));
            return this.d;
        }
        if (action != 1) {
            if (action == 2) {
                if (this.d) {
                    setScrollFactor(((motionEvent.getY() - getPaddingTop()) - (this.c.getIntrinsicHeight() / 2.0f)) / (((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.c.getIntrinsicHeight()));
                    RecyclerView recyclerView = this.e;
                    if (recyclerView == null) {
                        recyclerView = null;
                    }
                    int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                    RecyclerView recyclerView2 = this.e;
                    if (recyclerView2 == null) {
                        recyclerView2 = null;
                    }
                    int computeVerticalScrollRange = recyclerView2.computeVerticalScrollRange();
                    RecyclerView recyclerView3 = this.e;
                    if (recyclerView3 == null) {
                        recyclerView3 = null;
                    }
                    int height = computeVerticalScrollRange - recyclerView3.getHeight();
                    b bVar = this.f;
                    bVar.b = true;
                    RecyclerView recyclerView4 = this.e;
                    (recyclerView4 != null ? recyclerView4 : null).scrollBy(0, an10.b((this.g * height) - computeVerticalScrollOffset));
                    bVar.b = false;
                }
                return this.d;
            }
            if (action != 3) {
                return false;
            }
        }
        if (!this.d) {
            return false;
        }
        setScrolling(false);
        return true;
    }

    public final void setCallback(a aVar) {
        this.b = aVar;
    }

    public final void setIconDrawable(Drawable drawable) {
        this.c = drawable;
        invalidate();
    }

    public final void setScrolling(boolean z) {
        if (this.d && !z) {
            post(new gh1(this, 7));
        }
        this.d = z;
    }
}
