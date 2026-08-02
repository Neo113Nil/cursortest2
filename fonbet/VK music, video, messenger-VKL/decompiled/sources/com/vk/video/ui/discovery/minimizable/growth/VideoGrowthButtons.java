package com.vk.video.ui.discovery.minimizable.growth;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.bjm0;
import xsna.dy2;
import xsna.f4m;
import xsna.jjc;
import xsna.ksg0;

/* compiled from: VideoGrowthButtons.kt */
/* loaded from: classes7.dex */
public final class VideoGrowthButtons extends FrameLayout {
    public a b;
    public final LinearLayout c;
    public final ImageView d;
    public final TextView e;
    public final ImageView f;
    public final boolean g;
    public String h;
    public String i;
    public Integer j;
    public boolean k;

    /* compiled from: VideoGrowthButtons.kt */
    public interface a {
        void a();

        void onClick();

        void onClose();
    }

    public VideoGrowthButtons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = dy2.i("com.vk.vkvideo");
        this.k = true;
        LayoutInflater.from(context).inflate(R.layout.video_growth_bottom_button, (ViewGroup) this, true);
        this.c = (LinearLayout) findViewById(R.id.watch_in_video_standalone);
        this.d = (ImageView) findViewById(R.id.btn_icon);
        this.e = (TextView) findViewById(R.id.text_btn);
        this.f = (ImageView) findViewById(R.id.close_btn);
        a();
        LinearLayout linearLayout = this.c;
        if (linearLayout != null) {
            jjc.g(linearLayout, new bjm0(this, 11));
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            jjc.g(imageView, new ksg0(this, 20));
        }
    }

    public final void a() {
        if (this.g) {
            ImageView imageView = this.d;
            if (imageView != null) {
                f4m.j(imageView);
            }
            TextView textView = this.e;
            if (textView != null) {
                textView.setText(getResources().getText(R.string.watch_in_vk_video_btn));
                return;
            }
            return;
        }
        Integer num = this.j;
        if (num != null) {
            ImageView imageView2 = this.d;
            if (imageView2 != null) {
                imageView2.setImageDrawable(getContext().getDrawable(num.intValue()));
            }
        } else {
            ImageView imageView3 = this.d;
            if (imageView3 != null) {
                imageView3.setImageDrawable(getContext().getDrawable(R.drawable.vk_icon_logo_google_play_28));
            }
        }
        ImageView imageView4 = this.d;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
        TextView textView2 = this.e;
        if (textView2 != null) {
            CharSequence charSequence = this.i;
            if (charSequence == null) {
                charSequence = getResources().getText(R.string.download_vk_video_btn);
            }
            textView2.setText(charSequence);
        }
    }

    public final void setCallback(a aVar) {
        this.b = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i == 0 && this.k) {
            a aVar = this.b;
            if (aVar != null) {
                aVar.a();
            }
            this.k = false;
        }
        super.setVisibility(i);
    }
}
