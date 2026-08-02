package com.vk.libvideo.autoplay;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.models.history.ForceLogReason;
import com.vk.media.player.VideoMode;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticUrl;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.player.error.OneVideoPlaybackException;
import xsna.d3b0;
import xsna.hnt0;
import xsna.je0;
import xsna.pc4;
import xsna.q7s0;
import xsna.rlt0;
import xsna.u0m;
import xsna.wgt0;
import xsna.yg5;

/* compiled from: EmptyAutoPlay.kt */
/* loaded from: classes2.dex */
public class d implements yg5, u0m {
    public VideoFile b;
    public String c;
    public String d;
    public final com.vk.libvideo.autoplay.a e = new com.vk.libvideo.autoplay.a(false, null, null, false, false, false, null, null, null, null, null, null, false, null, 524223);
    public float f = 1.0f;
    public final boolean g = true;
    public final boolean h;
    public boolean i;
    public int j;
    public final long k;
    public float l;
    public final OneVideoPlaybackException.ErrorCode m;
    public final AutoPlayMinifiedState n;

    public d(VideoFile videoFile) {
        this.b = videoFile;
        this.h = this.b.O() != null;
        this.j = -1;
        this.k = this.b.getDuration() * 1000;
        this.m = OneVideoPlaybackException.ErrorCode.NO_ERROR;
        this.n = AutoPlayMinifiedState.NONE;
    }

    @Override // xsna.yg5
    public final VideoFile A() {
        return this.b;
    }

    @Override // xsna.yg5
    public final boolean B() {
        return this.h;
    }

    @Override // xsna.yg5
    public final q7s0 B0() {
        return new a();
    }

    @Override // xsna.yg5
    public final boolean C0() {
        return false;
    }

    @Override // xsna.yg5
    public final boolean D0() {
        return false;
    }

    @Override // xsna.yg5
    public final boolean G() {
        return false;
    }

    @Override // xsna.yg5
    public final boolean I0() {
        return false;
    }

    @Override // xsna.yg5
    public final boolean J() {
        return false;
    }

    @Override // xsna.yg5
    public final boolean J0() {
        return false;
    }

    @Override // xsna.yg5
    public final boolean M() {
        return false;
    }

    @Override // xsna.yg5
    public final boolean M0() {
        return false;
    }

    @Override // xsna.yg5
    public final void N(VideoFile videoFile) {
        this.b = videoFile;
    }

    @Override // xsna.yg5
    public final je0 N0() {
        return null;
    }

    @Override // xsna.yg5
    public final List<one.video.player.tracks.b> O0() {
        return EmptyList.b;
    }

    @Override // xsna.yg5
    public final long P() {
        return 0L;
    }

    @Override // xsna.yg5
    public final boolean P0() {
        return false;
    }

    @Override // xsna.yg5
    public final void Q(boolean z) {
        this.i = z;
    }

    @Override // xsna.yg5
    public final AutoPlayMinifiedState R0() {
        return this.n;
    }

    @Override // xsna.yg5
    public final boolean V() {
        return false;
    }

    @Override // xsna.yg5
    public final OneVideoPlaybackException.ErrorCode W() {
        return this.m;
    }

    @Override // xsna.yg5
    public final void Z(int i) {
        this.j = i;
    }

    @Override // xsna.yg5
    public final boolean a() {
        return false;
    }

    @Override // xsna.yg5
    public final float b() {
        return this.f;
    }

    @Override // xsna.yg5
    public final boolean d() {
        return false;
    }

    @Override // xsna.yg5
    public final String d0() {
        return this.c;
    }

    @Override // xsna.yg5
    public final int g0() {
        return this.j;
    }

    @Override // xsna.yg5
    public final com.vk.libvideo.autoplay.a getConfig() {
        return this.e;
    }

    @Override // xsna.yg5
    public final long getDuration() {
        return this.k;
    }

    @Override // xsna.yg5
    public final long getPosition() {
        return 0L;
    }

    @Override // xsna.yg5
    public final float getVolume() {
        return this.l;
    }

    @Override // xsna.yg5
    public final wgt0 h0() {
        return new wgt0(this.b.getWidth(), this.b.getHeight());
    }

    @Override // xsna.yg5
    public final int i0() {
        return 0;
    }

    @Override // xsna.yg5
    public final boolean isPaused() {
        return this.g;
    }

    @Override // xsna.yg5
    public boolean isPlaying() {
        return this instanceof pc4;
    }

    @Override // xsna.yg5
    public final boolean isPrepared() {
        return false;
    }

    @Override // xsna.yg5
    public final boolean isReady() {
        return false;
    }

    @Override // xsna.yg5
    public final boolean j0(VideoTextureView videoTextureView) {
        return false;
    }

    @Override // xsna.yg5
    public final rlt0 m0() {
        return null;
    }

    @Override // xsna.yg5
    public final boolean p() {
        return false;
    }

    @Override // xsna.yg5
    public boolean p0() {
        return false;
    }

    @Override // xsna.yg5
    public final String q() {
        return this.d;
    }

    @Override // xsna.yg5
    public final void q0(String str) {
        this.c = str;
    }

    @Override // xsna.yg5
    public final void s0(String str) {
        this.d = str;
    }

    @Override // xsna.yg5
    public final void setPlaybackSpeed(float f) {
        this.f = f;
    }

    @Override // xsna.yg5
    public final void setVolume(float f) {
        this.l = f;
    }

    @Override // xsna.yg5
    public final boolean t0() {
        return this.i;
    }

    @Override // xsna.yg5
    public final boolean u0() {
        return false;
    }

    @Override // xsna.yg5
    public final boolean v() {
        return this.b.q0();
    }

    @Override // xsna.yg5
    public final d3b0 v0() {
        return null;
    }

    @Override // xsna.yg5
    public final boolean w0() {
        return false;
    }

    /* compiled from: EmptyAutoPlay.kt */
    public static final class a implements q7s0 {
        @Override // xsna.q7s0
        public final void start() {
        }

        @Override // xsna.q7s0
        public final void stop() {
        }
    }

    @Override // xsna.yg5
    public final void D() {
    }

    @Override // xsna.yg5
    public final void E() {
    }

    @Override // xsna.yg5
    public final void F() {
    }

    @Override // xsna.yg5
    public final void F0() {
    }

    @Override // xsna.yg5
    public final void H() {
    }

    @Override // xsna.yg5
    public final void I() {
    }

    @Override // xsna.yg5
    public final void K() {
    }

    @Override // xsna.yg5
    public final void O() {
    }

    @Override // xsna.yg5
    public final void R() {
    }

    @Override // xsna.yg5
    public final void U() {
    }

    @Override // xsna.yg5
    public final void X() {
    }

    @Override // xsna.yg5
    public final void c() {
    }

    @Override // xsna.yg5
    public final void c0() {
    }

    @Override // xsna.yg5
    public final void e() {
    }

    @Override // xsna.yg5
    public final void f() {
    }

    @Override // xsna.yg5
    public final void k0() {
    }

    @Override // xsna.yg5
    public final void l0() {
    }

    @Override // xsna.yg5
    public void pause() {
    }

    @Override // xsna.yg5
    public void play() {
    }

    @Override // xsna.yg5
    public final void release() {
    }

    @Override // xsna.yg5
    public final void stop() {
    }

    @Override // xsna.yg5
    public final void A0(boolean z) {
    }

    @Override // xsna.yg5
    public final void C(boolean z) {
    }

    @Override // xsna.yg5
    public final void G0(boolean z) {
    }

    @Override // xsna.yg5
    public final void K0(boolean z) {
    }

    @Override // xsna.yg5
    public final void L(VideoMode videoMode) {
    }

    @Override // xsna.u0m
    public final void Q0(List<? extends DeprecatedStatisticUrl> list) {
    }

    @Override // xsna.yg5
    public final void S(boolean z) {
    }

    @Override // xsna.yg5
    public final void T(hnt0 hnt0Var) {
    }

    @Override // xsna.yg5
    public final void Y(String str) {
    }

    @Override // xsna.yg5
    public final void a0(com.vk.libvideo.autoplay.a aVar) {
    }

    @Override // xsna.yg5
    public final void b0(VideoTextureView videoTextureView) {
    }

    @Override // xsna.yg5
    public final void e0(ArrayList arrayList) {
    }

    @Override // xsna.yg5
    public final void f0(hnt0 hnt0Var) {
    }

    @Override // xsna.u0m
    public final void j(DeprecatedStatisticInterface deprecatedStatisticInterface) {
    }

    @Override // xsna.yg5
    public final void r0(boolean z) {
    }

    @Override // xsna.yg5
    public final void seek(long j) {
    }

    @Override // xsna.yg5
    public final void setMediaRouteConnectStatus(MediaRouteConnectStatus mediaRouteConnectStatus) {
    }

    @Override // xsna.yg5
    public final void x0(ForceLogReason forceLogReason) {
    }

    @Override // xsna.yg5
    public final void y0(long j) {
    }

    @Override // xsna.yg5
    public final void z0(VideoTextureView videoTextureView, com.vk.libvideo.autoplay.a aVar, RecyclerView.e0 e0Var) {
    }

    @Override // xsna.yg5
    public final void n0(String str, String str2, String str3, boolean z) {
    }
}
