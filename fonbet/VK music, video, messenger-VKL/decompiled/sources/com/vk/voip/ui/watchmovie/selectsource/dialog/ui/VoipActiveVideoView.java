package com.vk.voip.ui.watchmovie.selectsource.dialog.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.cn70;
import xsna.f6m0;
import xsna.jjc;
import xsna.s0x0;
import xsna.xzw0;

/* compiled from: VoipActiveVideoView.kt */
/* loaded from: classes7.dex */
public final class VoipActiveVideoView extends ConstraintLayout {
    public final TextView t;
    public final VKImageView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final TextView y;
    public s0x0<? super xzw0.a> z;

    public VoipActiveVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.voip_watch_movie_select_active_video_view, this);
        int b = cn70.b(16);
        setPadding(b, cn70.b(20), b, cn70.b(8));
        TextView textView = (TextView) findViewById(R.id.voip_active_video_stop);
        this.t = textView;
        this.u = (VKImageView) findViewById(R.id.voip_video_preview);
        this.v = (TextView) findViewById(R.id.voip_video_preview_title);
        this.w = (TextView) findViewById(R.id.voip_video_preview_subtitle);
        this.x = (TextView) findViewById(R.id.voip_video_preview_author_name);
        this.y = (TextView) findViewById(R.id.voip_video_preview_duration);
        jjc.g(textView, new f6m0(this, 21));
    }

    public final s0x0<xzw0.a> getEventSupplier() {
        return this.z;
    }

    public final void setEventSupplier(s0x0<? super xzw0.a> s0x0Var) {
        this.z = s0x0Var;
    }
}
