package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.v;
import com.fyber.inneractive.sdk.ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class o extends l {
    public ViewGroup K;
    public TextView L;
    public TextView M;
    public ImageView N;
    public ImageView O;
    public IAsmoothProgressBar P;
    public View Q;
    public View R;
    public View S;
    public TextView T;
    public TextView U;

    public o(Context context, com.fyber.inneractive.sdk.flow.g gVar, a aVar, com.fyber.inneractive.sdk.config.global.r rVar, boolean z, String str) {
        super(context, gVar, aVar, rVar, str);
        this.Q = null;
        this.A.inflate(R.layout.ia_layout_video_view, (ViewGroup) this, true);
        q();
        com.fyber.inneractive.sdk.flow.g gVar2 = this.B;
        if (gVar2 != null) {
            IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
            IFyberAdIdentifier iFyberAdIdentifier = gVar2.d;
            iFyberAdIdentifier.k = corner;
            iFyberAdIdentifier.a(this);
        }
        h(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    @Override // com.fyber.inneractive.sdk.player.ui.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, com.fyber.inneractive.sdk.ignite.m mVar) {
        String localizedCtaButtonText;
        Boolean c;
        TextView textView = this.M;
        if (textView != null) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.w;
            textView.setAllCaps((rVar == null || rVar.a(v.class) == null || (c = ((v) this.w.a(v.class)).c("cta_text_all_caps")) == null) ? false : c.booleanValue());
            TextView textView2 = this.M;
            if (IAConfigManager.N.D.n()) {
                mVar.getClass();
                if (mVar == com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP) {
                    localizedCtaButtonText = getContext().getString(R.string.ia_video_instant_install_text);
                    if (!TextUtils.isEmpty(this.x)) {
                        localizedCtaButtonText = this.x;
                    }
                    textView2.setText(localizedCtaButtonText);
                    this.M.setVisibility(z ? 0 : 4);
                }
            }
            localizedCtaButtonText = getLocalizedCtaButtonText();
            if (TextUtils.isEmpty(localizedCtaButtonText)) {
                localizedCtaButtonText = getContext().getString(R.string.ia_video_install_now_text);
            }
            if (!TextUtils.isEmpty(this.x)) {
            }
            textView2.setText(localizedCtaButtonText);
            this.M.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void b(boolean z) {
        TextView textView = this.T;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void c(boolean z) {
        ViewGroup viewGroup = this.K;
        if (viewGroup != null) {
            viewGroup.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void d(boolean z) {
        ImageView imageView = this.N;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.m
    public final void destroy() {
        super.destroy();
        k kVar = this.E;
        if (kVar != null) {
            removeCallbacks(kVar);
            this.E = null;
        }
        p();
        ViewGroup viewGroup = this.m;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void e(boolean z) {
        View view = this.S;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f(boolean z) {
        IAsmoothProgressBar iAsmoothProgressBar = this.P;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g(boolean z) {
        TextView textView = this.U;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyView() {
        return new View[]{this.M, this.T, this.U, this.N, this.P, this.Q, this.v};
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return new View[]{this.L, this.K};
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void h() {
        TextView textView = this.U;
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void i() {
        g(false);
        d(false);
        f(false);
        TextView textView = this.M;
        if (textView != null) {
            textView.setVisibility(4);
        }
        ImageView imageView = this.O;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        c(false);
        a(false, (String) null);
        b(false);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean l() {
        return this.T == null && this.P == null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void m() {
        ImageView imageView = this.O;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.O.setSelected(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void n() {
        ImageView imageView = this.O;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.O.setSelected(false);
        }
    }

    public void q() {
        this.m = (ViewGroup) findViewById(R.id.ia_texture_view_host);
        this.r = (ViewGroup) findViewById(R.id.ia_default_endcard_video_overlay);
        this.s = (ViewGroup) findViewById(R.id.ia_endcard_video_overlay);
        this.n = (Button) findViewById(R.id.ia_b_end_card_call_to_action);
        TextView textView = (TextView) findViewById(R.id.ia_endcard_tv_app_info_button);
        this.v = textView;
        a(textView, 10);
        a(this.n, 8);
        a(this.m, 7);
        a(this.r, -1);
        this.O = (ImageView) findViewById(R.id.ia_iv_expand_collapse_button);
        this.S = findViewById(R.id.ia_paused_video_overlay);
        this.L = (TextView) findViewById(R.id.ia_tv_app_info_button);
        this.M = (TextView) findViewById(R.id.ia_tv_call_to_action);
        this.P = (IAsmoothProgressBar) findViewById(R.id.ia_video_progressbar);
        this.K = (ViewGroup) findViewById(R.id.ia_identifier_overlay);
        this.Q = findViewById(R.id.ia_click_overlay);
        this.P.setVisibility(0);
        ImageView imageView = (ImageView) findViewById(R.id.ia_iv_mute_button);
        this.N = imageView;
        imageView.setVisibility(0);
        this.R = findViewById(R.id.ia_buffering_overlay);
        this.T = (TextView) findViewById(R.id.ia_tv_remaining_time);
        this.U = (TextView) findViewById(R.id.ia_tv_skip);
        a(this, 7);
        a(this.M, 3);
        a(this.N, 1);
        a(this.L, 10);
        a(this.O, 5);
        a(this.S, 9);
        a(this.U, 6);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setAppInfoButtonRound(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setBackgroundResource(R.drawable.ia_bg_circle_overlay);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = (int) getContext().getResources().getDimension(R.dimen.ia_image_control_size);
        layoutParams.height = (int) getContext().getResources().getDimension(R.dimen.ia_image_control_size);
        textView.setLayoutParams(layoutParams);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setMuteButtonState(boolean z) {
        ImageView imageView = this.N;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setRemainingTime(String str) {
        TextView textView = this.T;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setSkipText(String str) {
        if (this.U != null) {
            try {
                Integer.parseInt(str);
                int i = R.string.ia_video_before_skip_format;
                str = String.format(Locale.US, IAConfigManager.N.u.a().getString(i), Integer.valueOf(Integer.parseInt(str)));
            } catch (Exception unused) {
            }
            this.U.setText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void d() {
        this.h = true;
        j();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void e() {
        this.h = false;
        k();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public final void a(int i) {
        IAsmoothProgressBar iAsmoothProgressBar = this.P;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setProgress(i);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l, com.fyber.inneractive.sdk.player.ui.s
    public final void a(int i, int i2) {
        IAsmoothProgressBar iAsmoothProgressBar = this.P;
        if (iAsmoothProgressBar == null) {
            return;
        }
        iAsmoothProgressBar.setMax(i);
        super.a(i, i2);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z, String str) {
        TextView textView;
        TextView textView2 = this.L;
        if (textView2 != null) {
            textView2.setText(str);
            if (str != null && str.length() == 1) {
                setAppInfoButtonRound(this.L);
            }
            if (z && (textView = this.M) != null) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.width = -2;
                this.M.setLayoutParams(layoutParams);
                this.M.setTextSize(0, getResources().getDimension(R.dimen.ia_video_overlay_text_large_for_cta));
            }
            this.L.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z) {
        View view = this.R;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public boolean a() {
        TextView textView = this.U;
        return textView != null && textView.getVisibility() == 0 && this.U.isEnabled();
    }
}
