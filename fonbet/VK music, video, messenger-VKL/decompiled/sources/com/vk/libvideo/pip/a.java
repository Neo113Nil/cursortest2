package com.vk.libvideo.pip;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeVideoPipItem;
import xsna.b4p0;
import xsna.b6f0;
import xsna.bjc;
import xsna.slt0;
import xsna.uzp0;
import xsna.yg5;

/* compiled from: VideoPipTracker.kt */
/* loaded from: classes3.dex */
public final class a {
    public final b4p0 a;
    public final b6f0 b;

    public a(b4p0 b4p0Var, b6f0 b6f0Var) {
        this.a = b4p0Var;
        this.b = b6f0Var;
    }

    public final void a(SchemeStat$TypeVideoPipItem.EventType eventType) {
        yg5 yg5Var = (yg5) this.a.invoke();
        slt0 slt0Var = (slt0) this.b.invoke();
        if (slt0Var != null) {
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(r2.o0()), Long.valueOf(slt0Var.a.I0().b), null, slt0Var.b, null, 40, null), new SchemeStat$TypeVideoPipItem(eventType, yg5Var != null ? Integer.valueOf((int) (yg5Var.getPosition() / 1000)) : null), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
        }
    }
}
