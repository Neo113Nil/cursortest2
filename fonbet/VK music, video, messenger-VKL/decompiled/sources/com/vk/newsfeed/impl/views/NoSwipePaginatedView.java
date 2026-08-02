package com.vk.newsfeed.impl.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.e3m;
import xsna.enj;
import xsna.f4m;
import xsna.gzs;
import xsna.iah0;
import xsna.j6r0;
import xsna.jno0;
import xsna.pbd;
import xsna.s3q0;

/* compiled from: NoSwipePaginatedView.kt */
/* loaded from: classes4.dex */
public final class NoSwipePaginatedView extends RecyclerPaginatedView {
    public static final /* synthetic */ int P = 0;
    public ImageView N;
    public TextView O;

    public NoSwipePaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    private final int getTitleLayoutSize() {
        return getResources().getDimensionPixelSize(R.dimen.clips_comments_title_size);
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final FrameLayout.LayoutParams g() {
        FrameLayout.LayoutParams g = super.g();
        g.topMargin = getTitleLayoutSize();
        return g;
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final void n(Context context, AttributeSet attributeSet, int i) {
        super.n(context, attributeSet, i);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, getTitleLayoutSize()));
        ImageView imageView = new ImageView(context);
        WeakHashMap weakHashMap = j6r0.a;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(48.0f), iah0.a(48.0f)));
        int a = iah0.a(10.0f);
        imageView.setPadding(a, a, a, a);
        imageView.setImageDrawable(enj.e(R.drawable.vk_icon_cancel_outline_28, R.attr.vk_ui_icon_accent_themed, context));
        f4m.s(iah0.a(4.0f), imageView);
        ((FrameLayout.LayoutParams) imageView.getLayoutParams()).gravity = 8388627;
        imageView.setContentDescription(imageView.getResources().getString(R.string.accessibility_close));
        this.N = imageView;
        frameLayout.addView(imageView);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        textView.setGravity(8388627);
        textView.setTextColor(context.getColor(R.color.vk_gray_100));
        com.vk.typography.b.g(textView, FontFamily.DISPLAY_DEMIBOLD, Float.valueOf(textView.getResources().getDimensionPixelSize(R.dimen.clips_comments_title_text_size)), TextSizeUnit.PX);
        textView.setText(context.getString(R.string.comments_feedback));
        textView.setClickable(true);
        textView.setTranslationX(iah0.a(16.0f));
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).gravity = 8388627;
        this.O = textView;
        frameLayout.addView(textView);
        addView(frameLayout);
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View q(Context context, AttributeSet attributeSet) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.list);
        this.x = recyclerView;
        return recyclerView;
    }

    public final void setCloseListener(gzs<s3q0> gzsVar) {
        ImageView imageView = this.N;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setOnClickListener(new pbd(1, gzsVar));
    }

    public final void setIcon(Drawable drawable) {
        ImageView imageView = this.N;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable(drawable);
    }

    public final void setIconMarginVertical(int i) {
        ImageView imageView = this.N;
        if (imageView == null) {
            imageView = null;
        }
        f4m.t(i, imageView);
        ImageView imageView2 = this.N;
        f4m.q(i, imageView2 != null ? imageView2 : null);
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.O;
        if (textView == null) {
            textView = null;
        }
        textView.setText(charSequence);
    }

    public final void setTitleAttrColor(int i) {
        TextView textView = this.O;
        if (textView == null) {
            textView = null;
        }
        jno0.c(textView, i);
    }

    public final void setTitleTextSize(int i) {
        TextView textView = this.O;
        if (textView == null) {
            textView = null;
        }
        textView.setTextSize(0, i);
    }

    public final void setTitleTranslationX(float f) {
        TextView textView = this.O;
        if (textView == null) {
            textView = null;
        }
        textView.setTranslationX(f);
    }

    public final void x(float f) {
        float f2 = 1;
        float f3 = f2 - 0.7f;
        float f4 = ((f3 / 3) * 2) + 0.7f;
        if (f < f4) {
            ImageView imageView = this.N;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setScaleX(0.6f);
            ImageView imageView2 = this.N;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setScaleY(0.6f);
            ImageView imageView3 = this.N;
            if (imageView3 == null) {
                imageView3 = null;
            }
            imageView3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ImageView imageView4 = this.N;
            if (imageView4 == null) {
                imageView4 = null;
            }
            imageView4.setVisibility(4);
        }
        if (f < 0.7f) {
            TextView textView = this.O;
            if (textView == null) {
                textView = null;
            }
            textView.setTranslationX(e3m.a(R.dimen.post_side_padding, getContext()));
        } else {
            float f5 = (f - 0.7f) / f3;
            float f6 = (f - f4) / (f2 - f4);
            if (f6 >= 0.6f) {
                ImageView imageView5 = this.N;
                if (imageView5 == null) {
                    imageView5 = null;
                }
                imageView5.setScaleX(f6);
                ImageView imageView6 = this.N;
                if (imageView6 == null) {
                    imageView6 = null;
                }
                imageView6.setScaleY(f6);
            }
            ImageView imageView7 = this.N;
            if (imageView7 == null) {
                imageView7 = null;
            }
            imageView7.setAlpha(f6);
            ImageView imageView8 = this.N;
            if (imageView8 == null) {
                imageView8 = null;
            }
            imageView8.setVisibility(f6 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 4);
            TextView textView2 = this.O;
            if (textView2 == null) {
                textView2 = null;
            }
            float a = e3m.a(R.dimen.post_side_padding, getContext());
            int titleLayoutSize = getTitleLayoutSize();
            WeakHashMap weakHashMap = j6r0.a;
            float a2 = f5 * (iah0.a(8.0f) + titleLayoutSize);
            if (a < a2) {
                a = a2;
            }
            textView2.setTranslationX(a);
        }
        ImageView imageView9 = this.N;
        (imageView9 != null ? imageView9 : null).setEnabled(f == 1.0f);
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.c.n
    public final void K9() {
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.c.n
    public final void Mk() {
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public void setSwipeRefreshEnabled(boolean z) {
    }
}
