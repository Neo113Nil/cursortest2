package com.vk.libvideo.live.impl.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vk.libvideo.live.impl.fragment.VideoLiveFragment;

/* compiled from: VideoLiveFragment.kt */
/* loaded from: classes3.dex */
public final class a extends AnimatorListenerAdapter {
    public final /* synthetic */ VideoLiveFragment.a b;
    public final /* synthetic */ VideoLiveFragment c;

    public a(VideoLiveFragment.a aVar, VideoLiveFragment videoLiveFragment) {
        this.b = aVar;
        this.c = videoLiveFragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        VideoLiveFragment.a aVar = this.b;
        aVar.a.release();
        aVar.a.clearAnimation();
        VideoLiveFragment videoLiveFragment = this.c;
        videoLiveFragment.R = false;
        videoLiveFragment.finish();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        VideoLiveFragment.a aVar = this.b;
        aVar.a.release();
        aVar.a.clearAnimation();
        VideoLiveFragment videoLiveFragment = this.c;
        videoLiveFragment.R = false;
        videoLiveFragment.finish();
    }
}
