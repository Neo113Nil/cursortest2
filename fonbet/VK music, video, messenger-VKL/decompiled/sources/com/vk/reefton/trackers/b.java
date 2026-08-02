package com.vk.reefton.trackers;

import com.vk.movika.sdk.base.ui.r0;
import com.vk.reefton.trackers.l;
import xsna.fnf0;
import xsna.l7i;
import xsna.qof0;
import xsna.r7i;
import xsna.vof0;

/* compiled from: ReefClientTracker.kt */
/* loaded from: classes5.dex */
public final class b extends l {
    public final fnf0 a;

    /* compiled from: ReefClientTracker.kt */
    public static final class a implements l.a {
        @Override // com.vk.reefton.trackers.l.a
        public final l a(qof0 qof0Var) {
            return new b(qof0Var.a());
        }
    }

    public b(fnf0 fnf0Var) {
        this.a = fnf0Var;
    }

    @Override // com.vk.reefton.trackers.l
    public final l7i b(vof0 vof0Var) {
        return new r7i(new r0(22, vof0Var, this));
    }
}
