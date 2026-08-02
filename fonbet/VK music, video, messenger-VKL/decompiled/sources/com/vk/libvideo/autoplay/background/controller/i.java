package com.vk.libvideo.autoplay.background.controller;

import android.app.Activity;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import defpackage.q0;
import xsna.c63;
import xsna.fms0;
import xsna.fxc0;
import xsna.kyr0;
import xsna.pa;
import xsna.s200;
import xsna.ww50;
import xsna.yg5;

/* compiled from: VideoBackgroundRestoreController.kt */
/* loaded from: classes2.dex */
public final class i extends c63.b {
    public final a b;
    public final pa c;

    /* compiled from: VideoBackgroundRestoreController.kt */
    public static final class a {
        public boolean a;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("State(isRestoreAllowed="), this.a, ')');
        }

        public a(int i) {
            this.a = false;
        }
    }

    public i(a aVar, pa paVar) {
        this.b = aVar;
        this.c = paVar;
    }

    @Override // xsna.c63.b
    public final void w() {
        this.b.a = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder.b() == false) goto L26;
     */
    @Override // xsna.c63.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(Activity activity) {
        yg5 b = this.c.b();
        a aVar = this.b;
        if (b == null) {
            aVar.a = false;
            return;
        }
        boolean z = true;
        boolean z2 = b.J0() && aVar.a && !b.A().C2();
        boolean z3 = activity instanceof kyr0;
        ww50 v = s200.v(activity);
        boolean z4 = (v != null ? v.u() : null) instanceof fms0;
        if (!z3 && !z4) {
            VideoMinifiedPlayerStateHolder.a.getClass();
        }
        z = false;
        if (z2 && z) {
            fxc0.B().Y().k(activity, b.A(), (r43 & 4) != 0 ? null : null, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
        }
        aVar.a = false;
    }
}
