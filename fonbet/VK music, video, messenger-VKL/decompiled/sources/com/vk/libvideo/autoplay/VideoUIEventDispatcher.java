package com.vk.libvideo.autoplay;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.hnt0;
import xsna.je0;
import xsna.x2s0;
import xsna.ye0;
import xsna.yg5;

/* compiled from: VideoUIEventDispatcher.kt */
/* loaded from: classes2.dex */
public final class VideoUIEventDispatcher extends CopyOnWriteArraySet<hnt0> implements hnt0 {
    @Override // xsna.hnt0
    public final void E() {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().E();
        }
    }

    @Override // xsna.hnt0
    public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().E3(videoAutoPlay, i, i2);
        }
    }

    @Override // xsna.hnt0
    public final void H(long j, long j2) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().H(j, j2);
        }
    }

    @Override // xsna.hnt0
    public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().J3(yg5Var, i, i2, errorCode, th);
        }
    }

    @Override // xsna.hnt0
    public final void K0(a aVar, a aVar2) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().K0(aVar, aVar2);
        }
    }

    @Override // xsna.hnt0
    public final void K2(VideoAutoPlay videoAutoPlay) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().K2(videoAutoPlay);
        }
    }

    @Override // xsna.hnt0
    public final void N3(VideoAutoPlay videoAutoPlay, long j) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().N3(videoAutoPlay, j);
        }
    }

    @Override // xsna.hnt0
    public final void O(one.video.player.tracks.c cVar) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().O(cVar);
        }
    }

    @Override // xsna.hnt0
    public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().P1(videoAutoPlay, z);
        }
    }

    @Override // xsna.hnt0
    public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().R3(mediaRouteConnectStatus);
        }
    }

    @Override // xsna.hnt0
    public final void S2(long j) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().S2(j);
        }
    }

    @Override // xsna.hnt0
    public final void T0(VideoAutoPlay videoAutoPlay) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().T0(videoAutoPlay);
        }
    }

    @Override // xsna.hnt0
    public final void U(VideoAutoPlay videoAutoPlay) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().U(videoAutoPlay);
        }
    }

    @Override // xsna.hnt0
    public final void U0(one.video.player.tracks.b bVar) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().U0(bVar);
        }
    }

    @Override // xsna.hnt0
    public final void U3(DownloadInfo downloadInfo) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().U3(downloadInfo);
        }
    }

    @Override // xsna.hnt0
    public final void V3(yg5 yg5Var) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().V3(yg5Var);
        }
    }

    @Override // xsna.hnt0
    public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().X1(videoAutoPlay, j, j2);
        }
    }

    @Override // xsna.hnt0
    public final void a(boolean z) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().a(z);
        }
    }

    @Override // xsna.hnt0
    public final void c2() {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().c2();
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof hnt0) {
            return super.contains((hnt0) obj);
        }
        return false;
    }

    @Override // xsna.hnt0
    public final void d4(yg5 yg5Var) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().d4(yg5Var);
        }
    }

    @Override // xsna.hnt0
    public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().g(aVar, aVar2);
        }
    }

    @Override // xsna.hnt0
    public final void h() {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().h();
        }
    }

    @Override // xsna.hnt0
    public final void j() {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    @Override // xsna.hnt0
    public final void j4(VideoAutoPlay videoAutoPlay) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().j4(videoAutoPlay);
        }
    }

    @Override // xsna.hnt0
    public final void l(x2s0 x2s0Var) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().l(x2s0Var);
        }
    }

    @Override // xsna.hnt0
    public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().m(je0Var, aVar);
        }
    }

    @Override // xsna.hnt0
    public final void m4(VideoAutoPlay videoAutoPlay) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().m4(videoAutoPlay);
        }
    }

    @Override // xsna.hnt0
    public final void n2(yg5 yg5Var) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().n2(yg5Var);
        }
    }

    @Override // xsna.hnt0
    public final void p0(yg5 yg5Var) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().p0(yg5Var);
        }
    }

    @Override // xsna.hnt0
    public final void p2(VideoAutoPlay videoAutoPlay) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().p2(videoAutoPlay);
        }
    }

    @Override // xsna.hnt0
    public final void q(List<? extends SubtitleRenderItem> list) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().q(list);
        }
    }

    @Override // xsna.hnt0
    public final void r1(yg5 yg5Var) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().r1(yg5Var);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof hnt0) {
            return super.remove((hnt0) obj);
        }
        return false;
    }

    @Override // xsna.hnt0
    public final void t2() {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().t2();
        }
    }

    @Override // xsna.hnt0
    public final void u() {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().u();
        }
    }

    @Override // xsna.hnt0
    public final void x0(boolean z) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().x0(z);
        }
    }

    @Override // xsna.hnt0
    public final void z0(VideoAutoPlay videoAutoPlay, int i) {
        Iterator<hnt0> it = iterator();
        while (it.hasNext()) {
            it.next().z0(videoAutoPlay, i);
        }
    }

    @Override // xsna.hnt0
    public final void h3(yg5 yg5Var, int i, int i2) {
    }
}
