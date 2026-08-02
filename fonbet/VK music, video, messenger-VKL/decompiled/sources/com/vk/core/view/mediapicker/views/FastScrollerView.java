package com.vk.core.view.mediapicker.views;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vkontakte.android.R;
import xsna.f4m;
import xsna.iah0;
import xsna.o4;
import xsna.q86;
import xsna.rc4;
import xsna.sc4;
import xsna.tlq;
import xsna.vrl;
import xsna.x7g;
import xsna.xwk;

/* compiled from: FastScrollerView.kt */
/* loaded from: classes17.dex */
public final class FastScrollerView extends FrameLayout {
    public static final int m = iah0.a(40);
    public static final float n = iah0.b(32.0f);
    public final VkContentBadge b;
    public final View c;
    public RecyclerView d;
    public a e;
    public final Handler f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public final tlq l;

    /* compiled from: FastScrollerView.kt */
    public interface a {
        String f(int i);
    }

    public FastScrollerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f = new Handler(Looper.getMainLooper());
        this.l = new tlq(this);
        LayoutInflater.from(context).inflate(R.layout.ds_fast_scroller_view, this);
        View findViewById = findViewById(R.id.fast_scroller_handle);
        this.c = findViewById;
        VkContentBadge vkContentBadge = (VkContentBadge) findViewById(R.id.fast_scroller_popup_badge);
        vkContentBadge.setAppearance(new VkContentBadge.Appearance.a(new x7g(R.attr.vk_ui_text_primary_invariably), new x7g(R.attr.vk_ui_background_contrast), null, 12));
        this.b = vkContentBadge;
        findViewById.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        vkContentBadge.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    private final void setPosition(float f) {
        VkContentBadge vkContentBadge = this.b;
        int height = vkContentBadge.getHeight();
        View view = this.c;
        int b = xwk.b((int) (f - (r3 / 2)), 0, getHeight() - view.getHeight());
        this.i = b;
        vkContentBadge.setTranslationY(((r3 - height) / 2.0f) + b);
        view.setTranslationY(this.i);
    }

    private final void setPositionFromScroll(float f) {
        VkContentBadge vkContentBadge = this.b;
        int height = vkContentBadge.getHeight();
        View view = this.c;
        int height2 = view.getHeight() / 2;
        int height3 = getHeight() - height2;
        int b = xwk.b((int) ((height3 * (f / (this.j - this.k))) - height2), 0, height3);
        this.i = b;
        vkContentBadge.setTranslationY(((r3 - height) / 2.0f) + b);
        view.setTranslationY(this.i);
    }

    private final void setRecyclerViewPosition(float f) {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView = this.d;
        int itemCount = (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) ? 0 : adapter.getItemCount();
        if (itemCount != 0) {
            int b = xwk.b((int) ((f / (this.j - this.k)) * itemCount), 0, itemCount - 1);
            a aVar = this.e;
            if (aVar == null) {
                return;
            }
            String f2 = aVar.f(b);
            if (f2.length() > 0) {
                this.f.post(new vrl(1, this, f2));
            }
        }
    }

    public final void a() {
        if (this.g) {
            this.g = false;
            this.b.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationX(iah0.b(8.0f)).setDuration(300L).withEndAction(new rc4(this, 7)).start();
            this.c.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).withEndAction(new sc4(this, 7)).start();
        }
    }

    public final void b() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.b.animate().alpha(1.0f).translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).withStartAction(new o4(this, 10)).start();
        this.c.animate().alpha(1.0f).setDuration(300L).withStartAction(new q86(this, 6)).start();
    }

    public final void c(float f) {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView = this.d;
        int itemCount = (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) ? 0 : adapter.getItemCount();
        e();
        int i = this.i;
        if (i == 0) {
            RecyclerView recyclerView2 = this.d;
            if (recyclerView2 != null) {
                recyclerView2.scrollToPosition(0);
                return;
            }
            return;
        }
        int b = xwk.b((int) ((this.c.getHeight() + i >= getHeight() ? 1.0f : f / getHeight()) * itemCount), 0, itemCount - 1);
        RecyclerView recyclerView3 = this.d;
        if (recyclerView3 != null) {
            recyclerView3.scrollToPosition(b);
        }
    }

    public final void d(RecyclerView recyclerView) {
        float computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        e();
        if (!this.h) {
            setPositionFromScroll(computeVerticalScrollOffset);
        }
        setRecyclerViewPosition(computeVerticalScrollOffset);
    }

    public final void e() {
        RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            gridLayoutManager.z = (adapter != null ? adapter.getItemCount() : 0) < 500;
        }
        this.j = recyclerView.computeVerticalScrollRange();
        int computeVerticalScrollExtent = recyclerView.computeVerticalScrollExtent();
        this.k = computeVerticalScrollExtent;
        setVisibility(this.j != computeVerticalScrollExtent ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f.removeCallbacksAndMessages(null);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = false;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (isPressed()) {
                        setPosition(motionEvent.getY());
                        c(motionEvent.getY());
                    }
                    return true;
                }
            }
            a();
            setPressed(false);
            this.h = false;
            return true;
        }
        if (f4m.h(this)) {
            Rect rect = new Rect();
            VkContentBadge vkContentBadge = this.b;
            vkContentBadge.getGlobalVisibleRect(rect);
            int height = this.c.getHeight() + this.i;
            if (motionEvent.getX() > getWidth() - m && motionEvent.getY() > this.i && motionEvent.getY() < height) {
                z = true;
            }
            boolean contains = rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            if (z || contains) {
                b();
                vkContentBadge.animate().translationX(-n).start();
                setPressed(true);
                this.h = true;
                setPosition(motionEvent.getY());
                c(motionEvent.getY());
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setPopupTextProvider(a aVar) {
        this.e = aVar;
    }

    public final void setupRecycler(RecyclerView recyclerView) {
        this.d = recyclerView;
        recyclerView.addOnScrollListener(this.l);
    }
}
