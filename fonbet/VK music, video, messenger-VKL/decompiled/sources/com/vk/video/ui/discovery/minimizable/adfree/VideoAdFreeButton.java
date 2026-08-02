package com.vk.video.ui.discovery.minimizable.adfree;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.toggle.d;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.jjc;
import xsna.lxh0;
import xsna.mvl0;
import xsna.ryr0;
import xsna.syr0;

/* compiled from: VideoAdFreeButton.kt */
/* loaded from: classes7.dex */
public final class VideoAdFreeButton extends FrameLayout implements syr0 {
    public ryr0 b;
    public final LinearLayout c;
    public final TextView d;
    public final ImageView e;
    public boolean f;

    public VideoAdFreeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = true;
        LayoutInflater.from(context).inflate(R.layout.video_growth_bottom_button, (ViewGroup) this, true);
        this.c = (LinearLayout) findViewById(R.id.watch_in_video_standalone);
        this.d = (TextView) findViewById(R.id.text_btn);
        this.e = (ImageView) findViewById(R.id.close_btn);
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(d.t().f);
        }
        LinearLayout linearLayout = this.c;
        if (linearLayout != null) {
            jjc.g(linearLayout, new lxh0(this, 8));
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            jjc.g(imageView, new mvl0(this, 9));
        }
    }

    public void setCallback(ryr0 ryr0Var) {
        this.b = ryr0Var;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i == 0 && this.f) {
            ryr0 ryr0Var = this.b;
            if (ryr0Var != null) {
                ryr0Var.a();
            }
            this.f = false;
        }
        super.setVisibility(i);
    }

    @Override // xsna.syr0
    public void setVisible(boolean z) {
        bwt0.p0(this, z);
    }
}
