package com.vk.libvideo.live.impl.views.chat;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: FadingEdgeMode.kt */
/* loaded from: classes3.dex */
public abstract class c {

    /* compiled from: FadingEdgeMode.kt */
    public static final class a extends c {
        @Override // com.vk.libvideo.live.impl.views.chat.c
        public final float a(LiveRecycleView liveRecycleView) {
            return 1.0f;
        }
    }

    /* compiled from: FadingEdgeMode.kt */
    public static final class b extends c {
        public final float a;
        public final int b;

        public b(float f, int i) {
            this.a = f;
            this.b = i;
        }

        @Override // com.vk.libvideo.live.impl.views.chat.c
        public final float a(LiveRecycleView liveRecycleView) {
            return liveRecycleView.canScrollVertically(this.b) ? this.a : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    /* compiled from: FadingEdgeMode.kt */
    /* renamed from: com.vk.libvideo.live.impl.views.chat.c$c, reason: collision with other inner class name */
    public static final class C1238c extends c {
        public static final C1238c a = new C1238c();

        @Override // com.vk.libvideo.live.impl.views.chat.c
        public final float a(LiveRecycleView liveRecycleView) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    public abstract float a(LiveRecycleView liveRecycleView);
}
