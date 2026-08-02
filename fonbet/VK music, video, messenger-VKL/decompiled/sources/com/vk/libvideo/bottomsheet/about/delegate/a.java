package com.vk.libvideo.bottomsheet.about.delegate;

import com.vk.libvideo.api.ad.AdBannerData;
import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.bottomsheet.about.delegate.b;
import java.util.List;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.hnt0;
import xsna.je0;
import xsna.kiw;
import xsna.r4;
import xsna.sh0;
import xsna.x2s0;
import xsna.ye0;
import xsna.yg5;

/* compiled from: AboutVideoAdRedirectButtonDelegate.kt */
/* loaded from: classes2.dex */
public final class a implements hnt0 {
    public final /* synthetic */ b.a b;

    public a(b.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.hnt0
    public final void h() {
        this.b.h6(null, null);
    }

    @Override // xsna.hnt0
    public final void j() {
        this.b.h6(null, null);
    }

    @Override // xsna.hnt0
    public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
        if (aVar instanceof a.AbstractC1195a) {
            a.AbstractC1195a abstractC1195a = (a.AbstractC1195a) aVar;
            AdBannerData.AdRedirectData b = abstractC1195a.a().b();
            String str = b.b;
            Integer num = b.c;
            Integer num2 = b.d;
            String str2 = b.e;
            String str3 = b.f;
            sh0 sh0Var = null;
            sh0 sh0Var2 = new sh0(str, num, num2, str2, str3 != null ? new kiw(str3) : null);
            if (!abstractC1195a.c() && !abstractC1195a.a().a()) {
                sh0Var = sh0Var2;
            }
            this.b.h6(sh0Var, new r4(je0Var, 0));
        }
    }

    @Override // xsna.hnt0
    public final void u() {
        this.b.h6(null, null);
    }

    @Override // xsna.hnt0
    public final void E() {
    }

    @Override // xsna.hnt0
    public final void c2() {
    }

    @Override // xsna.hnt0
    public final void t2() {
    }

    @Override // xsna.hnt0
    public final void K2(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void O(one.video.player.tracks.c cVar) {
    }

    @Override // xsna.hnt0
    public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
    }

    @Override // xsna.hnt0
    public final void S2(long j) {
    }

    @Override // xsna.hnt0
    public final void T0(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void U(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void U0(one.video.player.tracks.b bVar) {
    }

    @Override // xsna.hnt0
    public final void U3(DownloadInfo downloadInfo) {
    }

    @Override // xsna.hnt0
    public final void V3(yg5 yg5Var) {
    }

    @Override // xsna.hnt0
    public final void a(boolean z) {
    }

    @Override // xsna.hnt0
    public final void d4(yg5 yg5Var) {
    }

    @Override // xsna.hnt0
    public final void j4(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void l(x2s0 x2s0Var) {
    }

    @Override // xsna.hnt0
    public final void m4(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void n2(yg5 yg5Var) {
    }

    @Override // xsna.hnt0
    public final void p0(yg5 yg5Var) {
    }

    @Override // xsna.hnt0
    public final void p2(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void q(List<? extends SubtitleRenderItem> list) {
    }

    @Override // xsna.hnt0
    public final void r1(yg5 yg5Var) {
    }

    @Override // xsna.hnt0
    public final void x0(boolean z) {
    }

    @Override // xsna.hnt0
    public final void H(long j, long j2) {
    }

    @Override // xsna.hnt0
    public final void K0(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
    }

    @Override // xsna.hnt0
    public final void N3(VideoAutoPlay videoAutoPlay, long j) {
    }

    @Override // xsna.hnt0
    public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
    }

    @Override // xsna.hnt0
    public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
    }

    @Override // xsna.hnt0
    public final void z0(VideoAutoPlay videoAutoPlay, int i) {
    }

    @Override // xsna.hnt0
    public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
    }

    @Override // xsna.hnt0
    public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
    }

    @Override // xsna.hnt0
    public final void h3(yg5 yg5Var, int i, int i2) {
    }

    @Override // xsna.hnt0
    public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
    }
}
