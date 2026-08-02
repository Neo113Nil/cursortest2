package com.vk.libvideo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.donut.design.view.badge.DonutBadge;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import xsna.e3m;
import xsna.eoj0;
import xsna.fnj;
import xsna.fxc0;
import xsna.gzs;
import xsna.h270;
import xsna.iah0;
import xsna.m33;
import xsna.msy;
import xsna.s3q0;
import xsna.stg0;
import xsna.t0w0;
import xsna.zxq;

/* compiled from: SimilarVideoBigView.kt */
/* loaded from: classes3.dex */
public final class SimilarVideoBigView extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final Object b;
    public final DonutBadge c;
    public final h270 d;
    public final eoj0 e;

    public SimilarVideoBigView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = msy.a(LazyThreadSafetyMode.NONE, new stg0(this, 5));
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            LayoutInflater.from(context).inflate(R.layout.similar_video_big_view_tablet_redesign, (ViewGroup) this, true);
            setOutlineProvider(new t0w0(2, iah0.b(12.0f), false, true));
            setClipToOutline(true);
        } else {
            LayoutInflater.from(context).inflate(R.layout.similar_video_big_view, (ViewGroup) this, true);
        }
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.video_progress);
        e3m.a aVar = e3m.a;
        progressBar.setProgressDrawable(m33.a(R.drawable.video_progress_redesign, context));
        VKImageView vKImageView = (VKImageView) findViewById(R.id.preview);
        VideoOverlayView videoOverlayView = (VideoOverlayView) findViewById(R.id.overlay);
        DurationView durationView = (DurationView) findViewById(R.id.duration);
        InteractiveDurationView interactiveDurationView = (InteractiveDurationView) findViewById(R.id.interactive_duration);
        DonutBadge donutBadge = (DonutBadge) findViewById(R.id.donut_price_badge);
        this.c = donutBadge;
        h270 h270Var = new h270(vKImageView, videoOverlayView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, progressBar, false, null, null, 204);
        this.d = h270Var;
        this.e = new eoj0(fxc0.B(), h270Var, vKImageView, videoOverlayView, durationView, interactiveDurationView, donutBadge);
    }

    public final h270 getAutoPlayDelegate() {
        return this.d;
    }

    public final void setOnDonutBadgeClickListener(gzs<s3q0> gzsVar) {
        this.c.setOnClickListener(new zxq(1, gzsVar));
    }
}
