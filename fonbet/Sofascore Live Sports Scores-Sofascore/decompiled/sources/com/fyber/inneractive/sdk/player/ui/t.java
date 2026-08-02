package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t extends o {
    public t(Context context, h hVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(context, null, hVar, rVar, false, null);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.o, com.fyber.inneractive.sdk.player.ui.m
    public final boolean a() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.m
    public final boolean c() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l, com.fyber.inneractive.sdk.player.ui.s
    public View getEndCardView() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.o, com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyView() {
        return new View[0];
    }

    @Override // com.fyber.inneractive.sdk.player.ui.o, com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return new View[0];
    }

    @Override // com.fyber.inneractive.sdk.player.ui.o
    public final void q() {
        setBackgroundColor(0);
        this.m = (ViewGroup) findViewById(R.id.ia_texture_view_host);
        removeView(findViewById(R.id.ia_video_progressbar));
        ImageView imageView = (ImageView) findViewById(R.id.ia_iv_mute_button);
        this.N = imageView;
        removeView(imageView);
        this.N = null;
        this.R = findViewById(R.id.ia_buffering_overlay);
        TextView textView = (TextView) findViewById(R.id.ia_tv_call_to_action);
        this.M = textView;
        removeView(textView);
        this.M = null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, b bVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public final void h(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public final void b(int i, int i2) {
    }
}
