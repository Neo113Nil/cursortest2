package com.vk.music.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.common.Image;
import com.vk.dto.music.Thumb;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e3m;
import xsna.f4m;

/* compiled from: MusicCoverStackedView.kt */
/* loaded from: classes3.dex */
public final class MusicCoverStackedView extends ConstraintLayout {
    public static final /* synthetic */ int y = 0;
    public final ThumbsImageView t;
    public final ThumbsImageView u;
    public final VKImageView v;
    public final int w;
    public final int x;

    public MusicCoverStackedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = R.attr.vk_ui_background_contrast;
        this.x = R.attr.vk_ui_image_placeholder_alpha;
        LayoutInflater.from(context).inflate(R.layout.music_cover_stacked_layout, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.main_image);
        ThumbsImageView thumbsImageView = (ThumbsImageView) findViewById;
        abg0 abg0Var = dhr0.t;
        thumbsImageView.setBackground(abg0Var.c(R.attr.vk_ui_background_contrast));
        thumbsImageView.setEmptyColor(abg0Var.c(R.attr.vk_ui_image_placeholder_alpha));
        this.t = (ThumbsImageView) findViewById;
        View findViewById2 = findViewById(R.id.secondary_image);
        ThumbsImageView thumbsImageView2 = (ThumbsImageView) findViewById2;
        thumbsImageView2.setBackground(abg0Var.c(R.attr.vk_ui_background_contrast));
        thumbsImageView2.setEmptyColor(abg0Var.c(R.attr.vk_ui_image_placeholder_alpha));
        this.u = (ThumbsImageView) findViewById2;
        this.v = (VKImageView) findViewById(R.id.placeholder_icon);
    }

    private final void setRadius(int i) {
        float f = i;
        this.t.setRadiusCorner(f);
        this.u.setRadiusCorner(f);
    }

    public final void P4() {
        setRadius(e3m.a(R.dimen.music_image_corners_6, getContext()));
        this.v.setVisibility(0);
        int a = e3m.a(R.dimen.music_stacked_image_single_size, getContext());
        ThumbsImageView thumbsImageView = this.t;
        f4m.z(a, a, thumbsImageView);
        thumbsImageView.setBorderLineColorAttr(R.attr.vk_ui_transparent);
        thumbsImageView.setEmptyColor(0);
        thumbsImageView.setBackground(dhr0.t.c(this.x));
        thumbsImageView.setThumb(null);
        this.u.setVisibility(4);
    }

    public final void Q4() {
        setRadius(e3m.a(R.dimen.music_image_corners_6, getContext()));
        int a = e3m.a(R.dimen.music_stacked_image_single_size, getContext());
        ThumbsImageView thumbsImageView = this.t;
        thumbsImageView.setBorderLineColorAttr(R.attr.vk_ui_background_secondary);
        f4m.z(a, a, thumbsImageView);
        thumbsImageView.setBackground(dhr0.t.c(this.w));
        this.u.setVisibility(4);
    }

    public final void T4(Thumb thumb, Thumb thumb2, boolean z) {
        f4m.j(this.v);
        ThumbsImageView thumbsImageView = this.t;
        if (thumb2 != null) {
            setRadius(e3m.a(R.dimen.music_image_corners_4, getContext()));
            int a = e3m.a(R.dimen.music_stacked_image_default_size, getContext());
            thumbsImageView.setBorderLineColorAttr(R.attr.vk_ui_background_secondary);
            f4m.z(a, a, thumbsImageView);
            thumbsImageView.setBackground(dhr0.t.c(this.w));
            thumbsImageView.setBorderLineWidth(cn70.c(1));
            ThumbsImageView thumbsImageView2 = this.u;
            thumbsImageView2.setVisibility(0);
            thumbsImageView2.setThumb(thumb);
            thumbsImageView.setThumb(thumb2);
        } else {
            Q4();
            thumbsImageView.setThumb(thumb);
        }
        if (z) {
            setRadius(e3m.a(R.dimen.music_stacked_image_single_size, getContext()));
        } else {
            setRadius(e3m.a(R.dimen.music_image_corners_4, getContext()));
        }
    }

    public final void setImageRes(int i) {
        Q4();
        f4m.j(this.v);
        this.t.setLocalRes(i);
    }

    public final void setPlaceholder(Image image) {
        P4();
        bwt0.L(this.v, image);
    }

    public final void setPlaceholderByResId(int i) {
        P4();
        this.v.setImageResource(i);
    }

    public final void setPlaceholderRes(int i) {
        P4();
        this.v.q0(i);
    }
}
