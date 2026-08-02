package com.vk.libvideo.autoplay;

import com.vk.libvideo.autoplay.b;
import com.vk.video.bugreport.api.dto.VideoTechBugreportData;
import xsna.bpn0;
import xsna.d3b0;
import xsna.w7o0;
import xsna.xh5;
import xsna.xov;
import xsna.yg5;

/* compiled from: AutoPlayInstanceHolder.kt */
/* loaded from: classes2.dex */
public final class c implements xov {
    @Override // xsna.xov
    public final VideoTechBugreportData a() {
        yg5 yg5Var;
        d3b0 v0;
        bpn0 bpn0Var = b.B;
        b.C1208b.a().getClass();
        xh5 xh5Var = b.C1208b.a().c;
        if (xh5Var == null || (yg5Var = xh5Var.a) == null || (v0 = yg5Var.v0()) == null) {
            return null;
        }
        return w7o0.b(v0, VideoTechBugreportData.VideoType.VIDEO);
    }
}
