package com.vk.libvideo.autoplay.background.controller;

import com.vk.libvideo.autoplay.background.controller.a;
import com.vk.libvideo.autoplay.background.controller.h;
import com.vk.libvideo.video.queue.api.di.VideoQueueComponent;
import xsna.cts0;
import xsna.epx;
import xsna.oys0;
import xsna.pa;
import xsna.q4s0;
import xsna.s740;
import xsna.yss0;

/* compiled from: VideoBackgroundNotificationControllerDependencies.kt */
/* loaded from: classes2.dex */
public final class g {
    public final pa a;
    public final oys0 b;
    public final cts0 c;
    public final s740 d;
    public final yss0 e;
    public final h.a f;
    public final a.b g;
    public final VideoQueueComponent h;

    public g(pa paVar, oys0 oys0Var, cts0 cts0Var, s740 s740Var, yss0 yss0Var, h.a aVar, a.b bVar, VideoQueueComponent videoQueueComponent) {
        q4s0 q4s0Var = q4s0.a;
        this.a = paVar;
        this.b = oys0Var;
        this.c = cts0Var;
        this.d = s740Var;
        this.e = yss0Var;
        this.f = aVar;
        this.g = bVar;
        this.h = videoQueueComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.a.equals(gVar.a)) {
            return false;
        }
        Object obj2 = q4s0.a;
        return obj2.equals(obj2) && this.b.equals(gVar.b) && epx.f(this.c, gVar.c) && this.d.equals(gVar.d) && this.e.equals(gVar.e) && this.f.equals(gVar.f) && this.g.equals(gVar.g) && epx.f(this.h, gVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((q4s0.a.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VideoBackgroundNotificationControllerDependencies(provider=" + this.a + ", environment=" + q4s0.a + ", notificationFactory=" + this.b + ", mediaSessionManager=" + this.c + ", mediaMetadataFactory=" + this.d + ", mediaPlaybackStateFactory=" + this.e + ", releaseRequestSupplier=" + this.f + ", trackRequestSupplier=" + this.g + ", videosQueueComponent=" + this.h + ')';
    }
}
