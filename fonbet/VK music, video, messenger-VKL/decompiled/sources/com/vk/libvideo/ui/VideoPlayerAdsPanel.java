package com.vk.libvideo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.vk.core.view.AdsButton;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vkontakte.android.R;
import xsna.fhb0;
import xsna.jjc;
import xsna.x16;
import xsna.z3t0;

/* loaded from: classes3.dex */
public class VideoPlayerAdsPanel extends LinearLayout {
    public static final /* synthetic */ int i = 0;
    public View.OnClickListener b;
    public int c;
    public AdsDataProvider d;
    public TextView e;
    public AdsButton f;
    public z3t0 g;
    public int h;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Context context;
            AdsDataProvider adsDataProvider;
            if (jjc.b() || (context = view.getContext()) == null || (adsDataProvider = VideoPlayerAdsPanel.this.d) == null) {
                return;
            }
            adsDataProvider.s8(context);
        }
    }

    public VideoPlayerAdsPanel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.h = 0;
        this.c = getResources().getConfiguration().orientation;
        b(context);
    }

    public final void a() {
        AdsDataProvider adsDataProvider = this.d;
        if (adsDataProvider != null) {
            this.e.setText(adsDataProvider.getMessage());
            this.f.setText(this.d.S1());
            int duration = this.d.getDuration() * 1000;
            if (duration < 5000) {
                this.f.setAlphaAnimationDelay(duration);
            }
        }
    }

    public final void b(Context context) {
        removeAllViews();
        View inflate = View.inflate(context, R.layout.video_player_ads_panel, null);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(inflate);
        this.e = (TextView) inflate.findViewById(R.id.ads_title);
        inflate.setOnClickListener(new a());
        AdsButton adsButton = (AdsButton) inflate.findViewById(R.id.ads_button);
        this.f = adsButton;
        z3t0 z3t0Var = new z3t0(adsButton);
        this.g = z3t0Var;
        this.f.setAnimationDelegate(z3t0Var);
        this.f.setOnClickListener(new x16(this, 19));
        AdsButton adsButton2 = this.f;
        adsButton2.f = false;
        if (this.h == 0) {
            adsButton2.setStyleChangeListener(new fhb0(this, 14));
        }
        this.f.b(0, true);
        a();
    }

    public void setAdsButtonColor(@Nullable Integer num) {
        if (num != null) {
            this.g.d = num;
        }
    }

    public void setButtonOnClickListener(View.OnClickListener onClickListener) {
        this.b = onClickListener;
    }
}
