package com.vk.music.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.common.Image;
import com.vk.dto.music.Thumb;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.dhr0;
import xsna.f4m;

/* compiled from: MusicKidsCoverStackedView.kt */
/* loaded from: classes3.dex */
public final class MusicKidsCoverStackedView extends ConstraintLayout {
    public final ThumbsImageView t;
    public final ThumbsImageView u;

    public MusicKidsCoverStackedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.music_kids_cover_stacked_layout, (ViewGroup) this, true);
        ThumbsImageView thumbsImageView = (ThumbsImageView) findViewById(R.id.main_image);
        abg0 abg0Var = dhr0.t;
        thumbsImageView.setBackground(abg0Var.c(R.attr.vk_ui_background_contrast));
        thumbsImageView.setEmptyColor(abg0Var.c(R.attr.vk_ui_image_placeholder_alpha));
        this.t = thumbsImageView;
        ThumbsImageView thumbsImageView2 = (ThumbsImageView) findViewById(R.id.secondary_image);
        thumbsImageView2.setBackground(abg0Var.c(R.attr.vk_ui_background_contrast));
        thumbsImageView2.setEmptyColor(abg0Var.c(R.attr.vk_ui_image_placeholder_alpha));
        this.u = thumbsImageView2;
    }

    public final void setImage(Image image) {
        Thumb thumb = new Thumb(image);
        f4m.j(this.u);
        this.t.setThumb(thumb);
    }
}
