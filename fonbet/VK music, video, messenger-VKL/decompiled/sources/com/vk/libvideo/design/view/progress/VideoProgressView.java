package com.vk.libvideo.design.view.progress;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.core.ui.CircularProgressView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.bwt0;
import xsna.gzs;
import xsna.ie90;
import xsna.lxh0;
import xsna.mvl0;
import xsna.s3q0;
import xsna.s9t0;

/* compiled from: VideoProgressView.kt */
/* loaded from: classes2.dex */
public final class VideoProgressView extends FrameLayout {
    public final CircularProgressView b;
    public final ImageView c;
    public gzs<s3q0> d;
    public gzs<s3q0> e;

    public VideoProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.video_progress_view, (ViewGroup) this, true);
        this.b = (CircularProgressView) findViewById(R.id.download_progress_view);
        this.c = (ImageView) findViewById(R.id.download_progress_action_view);
    }

    public final void a(s9t0 s9t0Var) {
        if (s9t0Var.equals(s9t0.a.a) || s9t0Var.equals(s9t0.c.a)) {
            bwt0.p0(this, false);
            return;
        }
        boolean equals = s9t0Var.equals(s9t0.b.a);
        CircularProgressView circularProgressView = this.b;
        ImageView imageView = this.c;
        if (equals) {
            bwt0.p0(this, true);
            bwt0.p0(circularProgressView, false);
            bwt0.p0(imageView, true);
            imageView.setImageDrawable(getContext().getDrawable(R.drawable.vk_icon_replay_24));
            bwt0.i0(imageView, new ie90(this, 29));
            return;
        }
        if (s9t0Var.equals(s9t0.e.a)) {
            bwt0.p0(this, true);
            bwt0.p0(circularProgressView, true);
            bwt0.p0(imageView, true);
            imageView.setImageDrawable(getContext().getDrawable(R.drawable.vk_icon_cancel_24));
            circularProgressView.setIndeterminate(true);
            bwt0.i0(imageView, new lxh0(this, 11));
            return;
        }
        if (!(s9t0Var instanceof s9t0.d)) {
            throw new NoWhenBranchMatchedException();
        }
        bwt0.p0(this, true);
        bwt0.p0(circularProgressView, true);
        bwt0.p0(imageView, true);
        imageView.setImageDrawable(getContext().getDrawable(R.drawable.vk_icon_cancel_24));
        circularProgressView.setIndeterminate(false);
        circularProgressView.setProgress(((s9t0.d) s9t0Var).a / 100.0f);
        bwt0.i0(imageView, new mvl0(this, 14));
    }

    public final void setOnCancelClickListener(gzs<s3q0> gzsVar) {
        this.d = gzsVar;
    }

    public final void setOnRetryClickListener(gzs<s3q0> gzsVar) {
        this.e = gzsVar;
    }
}
