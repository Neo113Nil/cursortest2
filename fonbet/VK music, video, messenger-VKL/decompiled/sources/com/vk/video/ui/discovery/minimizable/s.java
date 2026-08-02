package com.vk.video.ui.discovery.minimizable;

import com.vk.video.ui.discovery.minimizable.announce.VideoAnnounceState;
import com.vk.video.ui.discovery.minimizable.player.AdProgressState;
import com.vk.video.ui.discovery.minimizable.player.VideoMiniPlayerAction;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerProgress;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerStatus;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.q;
import defpackage.q0;
import java.util.List;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.fw3;
import xsna.fys;
import xsna.g290;
import xsna.h0u0;
import xsna.hfz;
import xsna.i31;
import xsna.l31;
import xsna.lat0;
import xsna.ms9;
import xsna.qoy;
import xsna.sdh0;
import xsna.xgs0;
import xsna.yzt0;

/* compiled from: VideoMinimizableDiscoveryViewState.kt */
/* loaded from: classes7.dex */
public final class s implements ao50 {
    public final fi50 a;

    /* compiled from: VideoMinimizableDiscoveryViewState.kt */
    public static final class a implements fm50<q> {
        public final yzt0<MiniPlayerControllersWrapper.VideoInfo> a;
        public final yzt0<e> b;
        public final yzt0<d> c;
        public final yzt0<c> d;
        public final yzt0<VideoAnnounceState> e;
        public final yzt0<lat0> f;
        public final yzt0<Boolean> g;
        public final yzt0<com.vk.video.ui.discovery.minimizable.related_videos.h> h;
        public final yzt0<fys> i;
        public final yzt0<List<q.a>> j;
        public final yzt0<b> k;
        public final yzt0<q.a> l;
        public final yzt0<i31> m;
        public final yzt0<l31> n;
        public final yzt0<xgs0> o;
        public final yzt0<sdh0> p;
        public final yzt0<g290> q;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10, h0u0 h0u0Var11, h0u0 h0u0Var12, h0u0 h0u0Var13, h0u0 h0u0Var14, h0u0 h0u0Var15, h0u0 h0u0Var16, h0u0 h0u0Var17) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
            this.h = h0u0Var8;
            this.i = h0u0Var9;
            this.j = h0u0Var10;
            this.k = h0u0Var11;
            this.l = h0u0Var12;
            this.m = h0u0Var13;
            this.n = h0u0Var14;
            this.o = h0u0Var15;
            this.p = h0u0Var16;
            this.q = h0u0Var17;
        }
    }

    /* compiled from: VideoMinimizableDiscoveryViewState.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public b(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Doc2DocOnboardingViewState(isVisible=");
            sb.append(this.a);
            sb.append(", isDoc2DocScrollTrackingEnabled=");
            sb.append(this.b);
            sb.append(", isVerticalScrollTrackingEnabled=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryViewState.kt */
    public static final class c {
        public final VideoPlayerProgress a;

        public c(VideoPlayerProgress videoPlayerProgress) {
            this.a = videoPlayerProgress;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "VideoMiniPlayerProgressViewState(progress=" + this.a + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryViewState.kt */
    public static final class d {
        public final CharSequence a;
        public final CharSequence b;
        public final VideoPlayerStatus c;
        public final VideoMiniPlayerAction d;
        public final boolean e;
        public final AdProgressState f;

        public d(CharSequence charSequence, CharSequence charSequence2, VideoPlayerStatus videoPlayerStatus, VideoMiniPlayerAction videoMiniPlayerAction, boolean z, AdProgressState adProgressState) {
            this.a = charSequence;
            this.b = charSequence2;
            this.c = videoPlayerStatus;
            this.d = videoMiniPlayerAction;
            this.e = z;
            this.f = adProgressState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && this.d == dVar.d && this.e == dVar.e && epx.f(this.f, dVar.f);
        }

        public final int hashCode() {
            CharSequence charSequence = this.a;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.b;
            int b = qoy.b((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31)) * 31)) * 31, 31, this.e);
            AdProgressState adProgressState = this.f;
            return b + (adProgressState != null ? adProgressState.hashCode() : 0);
        }

        public final String toString() {
            return "VideoMiniPlayerViewState(titleText=" + ((Object) this.a) + ", subtitleText=" + ((Object) this.b) + ", playerStatus=" + this.c + ", miniPlayerAction=" + this.d + ", isAdActive=" + this.e + ", adProgress=" + this.f + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryViewState.kt */
    public static final class e {
        public final List<hfz> a;
        public final List<hfz> b;
        public final List<hfz> c;

        /* JADX WARN: Multi-variable type inference failed */
        public e(List<? extends hfz> list, List<? extends hfz> list2, List<? extends hfz> list3) {
            this.a = list;
            this.b = list2;
            this.c = list3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoRelatedItems(aboutVideoItems=");
            sb.append(this.a);
            sb.append(", recommendationsItems=");
            sb.append(this.b);
            sb.append(", catalogItems=");
            return ms9.a(')', sb, this.c);
        }
    }

    public s(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
