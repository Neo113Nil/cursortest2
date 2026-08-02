package com.vk.libvideo.bottomsheet.about.delegate;

import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoSimilarVideosTitleRedesignDelegate;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.toggle.features.VideoFeatures;
import xsna.c4;
import xsna.e43;
import xsna.ezs0;
import xsna.fxc0;
import xsna.gzs;
import xsna.h7v;
import xsna.iah0;
import xsna.p1u0;
import xsna.q530;
import xsna.s4;
import xsna.sni;
import xsna.t4;
import xsna.u4;
import xsna.v6z;
import xsna.w4;
import xsna.wx3;

/* compiled from: AboutVideoAdapter.kt */
/* loaded from: classes2.dex */
public final class c extends wx3 {
    public c(h7v h7vVar, c4 c4Var, NotificationsPermission notificationsPermission, boolean z, gzs gzsVar, sni sniVar, ezs0 ezs0Var, q530 q530Var) {
        super(new t4());
        VideoFeatures videoFeatures = VideoFeatures.DISCOVERY_VIDEO_ABOUT_REDESIGN;
        videoFeatures.getClass();
        boolean a = com.vk.toggle.b.A.a(videoFeatures);
        q530Var.d(new u4(this));
        f fVar = new f(c4Var, q530Var, a);
        f0 f0Var = new f0(c4Var, q530Var, a);
        float f = 8;
        p1u0 F = fxc0.B().T().F(iah0.a(f), iah0.a(f), iah0.a(16), v6z.a, new s4(c4Var, 0));
        d dVar = new d(c4Var, null);
        VideoScreenMode videoScreenMode = VideoScreenMode.PREVIEW;
        for (Object obj : e43.l(fVar, f0Var, F, dVar, new w(c4Var, videoScreenMode), new i(false, 4), new q(), new y(null), new b0(), new a0(c4Var, false, false, gzsVar), new j(c4Var, z, gzsVar, ezs0Var, a), new g0(c4Var, a), new d0(a), new e(a), new n(c4Var, z, a), new h0(c4Var, a), new h(c4Var), new AboutVideoSimilarVideosTitleRedesignDelegate(z ? AboutVideoSimilarVideosTitleRedesignDelegate.Type.TabletRedesign : AboutVideoSimilarVideosTitleRedesignDelegate.Type.Default, null), new x(c4Var, true, videoScreenMode, gzsVar, sniVar, false, null), new w4(h7vVar, c4Var, notificationsPermission, null, gzsVar, new w4.a(z ? Integer.valueOf(iah0.a(10)) : null, null, 5), null, null, 200), new s(c4Var), new v())) {
            if (obj != null) {
                y0((p1u0) obj);
            }
        }
    }
}
