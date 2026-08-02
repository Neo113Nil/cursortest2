package com.vk.core.tool.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.extra.R$styleable;
import com.vk.media.player.subtitles.NoStyleSubtitleView;
import com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder;
import xsna.bwt0;
import xsna.nu0;
import xsna.yg5;

/* loaded from: classes17.dex */
public class RatioFrameLayout extends FrameLayout {
    public a b;
    public int c;
    public float d;

    public interface a {
    }

    public RatioFrameLayout(Context context) {
        super(context);
        this.c = 1;
        this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void g(AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f, i, i2);
        if (obtainStyledAttributes != null) {
            this.d = obtainStyledAttributes.getFloat(1, this.d);
            this.c = obtainStyledAttributes.getInt(0, this.c);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a aVar = this.b;
        if (aVar != null) {
            BaseVideoAutoPlayHolder baseVideoAutoPlayHolder = (BaseVideoAutoPlayHolder) ((nu0) aVar).c;
            yg5 yg5Var = baseVideoAutoPlayHolder.h0;
            if (yg5Var != null && yg5Var.isPlaying() && bwt0.D(baseVideoAutoPlayHolder.itemView) < 0.7f) {
                final int bindingAdapterPosition = baseVideoAutoPlayHolder.getBindingAdapterPosition();
                ViewGroup viewGroup = baseVideoAutoPlayHolder.H.get();
                if (bindingAdapterPosition >= 0 && (viewGroup instanceof RecyclerView)) {
                    final RecyclerView recyclerView = (RecyclerView) viewGroup;
                    viewGroup.post(new Runnable() { // from class: xsna.gq6
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((RecyclerView) recyclerView).scrollToPosition(bindingAdapterPosition);
                        }
                    });
                }
            }
            NoStyleSubtitleView noStyleSubtitleView = baseVideoAutoPlayHolder.O;
            if (noStyleSubtitleView != null) {
                noStyleSubtitleView.b();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.d != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int i3 = this.c;
            if (i3 == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * this.d), 1073741824);
            } else if (i3 == 1) {
                i = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) * this.d), 1073741824);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
        if (getChildCount() > 0) {
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            View childAt = getChildAt(0);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            int measuredWidth2 = childAt.getMeasuredWidth();
            int measuredHeight2 = childAt.getMeasuredHeight();
            for (int i4 = 1; i4 < getChildCount(); i4++) {
                View childAt2 = getChildAt(i4);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredWidth() > measuredWidth2 ? measuredWidth2 : childAt2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight() > measuredHeight2 ? measuredHeight2 : childAt2.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    public void setListener(a aVar) {
        this.b = aVar;
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            this.c = i;
            requestLayout();
        }
    }

    public void setRatio(float f) {
        if (this.d != f) {
            this.d = f;
            requestLayout();
        }
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 1;
        this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        g(attributeSet, 0, 0);
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 1;
        this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        g(attributeSet, i, 0);
    }

    @TargetApi(21)
    public RatioFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = 1;
        this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        g(attributeSet, i, i2);
    }
}
