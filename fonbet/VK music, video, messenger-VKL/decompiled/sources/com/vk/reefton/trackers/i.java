package com.vk.reefton.trackers;

import com.vk.reefton.trackers.l;
import xsna.hof0;
import xsna.l7i;
import xsna.qof0;
import xsna.r7i;
import xsna.vof0;
import xsna.xy0;

/* compiled from: ReefPermissionTracker.kt */
/* loaded from: classes5.dex */
public final class i extends l {
    public final hof0 a;

    /* compiled from: ReefPermissionTracker.kt */
    public static final class a implements l.a {
        @Override // com.vk.reefton.trackers.l.a
        public final l a(qof0 qof0Var) {
            return new i(qof0Var.d());
        }
    }

    public i(hof0 hof0Var) {
        this.a = hof0Var;
    }

    @Override // com.vk.reefton.trackers.l
    public final l7i b(vof0 vof0Var) {
        return new r7i(new xy0(19, vof0Var, this));
    }
}
