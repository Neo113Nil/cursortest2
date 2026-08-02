package com.vk.music.snippet.ui.presentation.base.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.Thumb;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import xsna.b780;
import xsna.dhr0;
import xsna.e3m;
import xsna.epx;
import xsna.tbk0;
import xsna.ubk0;

/* compiled from: SnippetBlurBackgroundView.kt */
/* loaded from: classes3.dex */
public final class SnippetBlurBackgroundView extends FrameLayout implements b780 {
    public final ThumbsImageView b;
    public final ThumbsImageView c;
    public Thumb d;
    public Thumb e;
    public boolean f;
    public boolean g;
    public final ubk0 h;

    public SnippetBlurBackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = true;
        e3m.a aVar = e3m.a;
        this.h = new ubk0(context.getColor(R.color.vk_gray_850));
        ThumbsImageView c = c();
        this.b = c;
        ThumbsImageView c2 = c();
        this.c = c2;
        c2.setVisibility(4);
        addView(c);
        addView(c2);
    }

    private final void setThumbViewParams(ThumbsImageView thumbsImageView) {
        thumbsImageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        thumbsImageView.setVisibility(0);
        thumbsImageView.setOnLoadCallback(this);
    }

    public final void a() {
        ThumbsImageView thumbsImageView = this.b;
        thumbsImageView.clearAnimation();
        ThumbsImageView thumbsImageView2 = this.c;
        thumbsImageView2.clearAnimation();
        if (this.f) {
            thumbsImageView.bringToFront();
            thumbsImageView.animate().alpha(1.0f).setDuration(300L).setListener(new tbk0(thumbsImageView, this)).start();
        } else {
            thumbsImageView2.bringToFront();
            thumbsImageView2.animate().alpha(1.0f).setDuration(300L).setListener(new tbk0(thumbsImageView2, this)).start();
        }
    }

    public final ThumbsImageView c() {
        ThumbsImageView thumbsImageView = new ThumbsImageView(getContext(), null, 6, 0);
        thumbsImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        thumbsImageView.setEmptyPlaceholder(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_background_content)));
        thumbsImageView.setClipToOutline(true);
        thumbsImageView.setPostProcessorForSingle(this.h);
        thumbsImageView.setOnLoadCallback(this);
        return thumbsImageView;
    }

    public final void setThumb(Thumb thumb) {
        this.g = true;
        if (this.f) {
            ThumbsImageView thumbsImageView = this.b;
            setThumbViewParams(thumbsImageView);
            if (epx.f(this.d, thumb)) {
                a();
            } else if (thumb != null) {
                thumbsImageView.setThumb(thumb);
            } else {
                thumbsImageView.setThumb(null);
                a();
            }
            this.d = thumb;
            return;
        }
        ThumbsImageView thumbsImageView2 = this.c;
        setThumbViewParams(thumbsImageView2);
        if (epx.f(this.e, thumb)) {
            a();
        } else if (thumb != null) {
            thumbsImageView2.setThumb(thumb);
        } else {
            thumbsImageView2.setThumb(null);
            a();
        }
        this.e = thumb;
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        if (this.g) {
            a();
        }
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
    }
}
