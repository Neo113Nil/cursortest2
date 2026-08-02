package com.vk.libvideo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vkontakte.android.R;
import xsna.bwt0;

/* compiled from: VideoEndViewClipRecommend.kt */
/* loaded from: classes3.dex */
public final class VideoEndViewClipRecommend extends LinearLayout {
    public final View b;
    public final View c;

    public VideoEndViewClipRecommend(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.video_end_view_recommend_clips, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.video_add_as_clip);
        this.b = findViewById;
        View findViewById2 = findViewById(R.id.video_keep_watching);
        this.c = findViewById2;
        findViewById.setTag("add_as_clip");
        findViewById2.setTag("keep_watching");
    }

    public final void setButtonsOnClickListener(View.OnClickListener onClickListener) {
        bwt0.h0(onClickListener, this.b);
        bwt0.h0(onClickListener, this.c);
    }
}
