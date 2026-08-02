package com.vk.libvideo.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.vkontakte.android.R;
import xsna.iah0;
import xsna.pdc;

/* compiled from: VideoNextView.kt */
/* loaded from: classes3.dex */
public final class VideoNextView extends FrameLayout {
    public final View b;
    public final ProgressBar c;
    public final ObjectAnimator d;
    public final pdc e;
    public final ImageView f;
    public final TextView g;

    public VideoNextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        pdc pdcVar = new pdc(false);
        this.e = pdcVar;
        setPadding(0, 0, iah0.a(12), 0);
        LayoutInflater.from(context).inflate(R.layout.video_next_view, (ViewGroup) this, true);
        this.b = findViewById(R.id.video_next_stop);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.video_next_progress);
        this.c = progressBar;
        this.f = (ImageView) findViewById(R.id.videoNextViewIcon);
        this.g = (TextView) findViewById(R.id.videoNextViewText);
        pdcVar.a(1744830463, -855310);
        pdcVar.b.setStrokeWidth(iah0.a(1.0f));
        pdcVar.e = false;
        pdcVar.f = false;
        progressBar.setProgressDrawable(pdcVar);
        this.d = ObjectAnimator.ofInt(progressBar, NotificationCompat.CATEGORY_PROGRESS, 0, 100);
    }

    public final ImageView getIcon() {
        return this.f;
    }

    public final TextView getLabel() {
        return this.g;
    }

    public final ObjectAnimator getProgressAnim() {
        return this.d;
    }

    public final ProgressBar getProgressBar() {
        return this.c;
    }
}
