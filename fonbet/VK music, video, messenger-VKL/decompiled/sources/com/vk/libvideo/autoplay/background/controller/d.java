package com.vk.libvideo.autoplay.background.controller;

import com.vk.core.apps.BuildInfo;
import com.vk.libvideo.autoplay.AutoPlayMinifiedState;
import com.vk.libvideo.models.videotracker.PlayerType;
import xsna.bpn0;
import xsna.c63;
import xsna.fxc0;
import xsna.g9l0;
import xsna.yg5;

/* compiled from: VideoBackgroundHelper.kt */
/* loaded from: classes2.dex */
public final class d {
    public final bpn0 a = new bpn0(new g9l0(3));

    /* compiled from: VideoBackgroundHelper.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final PlayerType f;
        public final AutoPlayMinifiedState g;

        public a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, PlayerType playerType, AutoPlayMinifiedState autoPlayMinifiedState) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = playerType;
            this.g = autoPlayMinifiedState;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x003d, code lost:
    
        if (xsna.c63.f == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(a aVar) {
        boolean z;
        boolean z2 = BuildInfo.q() || BuildInfo.s();
        if (!aVar.c) {
            PlayerType playerType = aVar.f;
            if (playerType != PlayerType.FULLSCREEN && ((!z2 || playerType != PlayerType.CAROUSEL) && aVar.g != AutoPlayMinifiedState.PIP)) {
                if (fxc0.B().J().i0()) {
                    c63 c63Var = c63.a;
                }
            }
            z = true;
            return (z || aVar.a || aVar.b || !((!((Boolean) this.a.getValue()).booleanValue() && aVar.g == AutoPlayMinifiedState.PIP) || !aVar.e) || !aVar.d) ? false : true;
        }
        z = false;
        if (z) {
        }
    }

    public final boolean b(yg5 yg5Var) {
        return a(new a(yg5Var.getConfig().c, yg5Var.A().x5(), yg5Var.A().W9(), yg5Var.A().I6(), yg5Var.P0(), yg5Var.getConfig().p, yg5Var.R0()));
    }
}
