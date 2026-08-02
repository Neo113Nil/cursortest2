package com.vk.reefton.trackers;

import com.vk.reefton.trackers.l;
import xsna.l7i;
import xsna.nnf0;
import xsna.qof0;
import xsna.r7i;
import xsna.vof0;

/* compiled from: ReefUserTracker.kt */
/* loaded from: classes5.dex */
public final class m extends l {
    public final nnf0 a;

    /* compiled from: ReefUserTracker.kt */
    public static final class a implements l.a {
        @Override // com.vk.reefton.trackers.l.a
        public final l a(qof0 qof0Var) {
            nnf0 nnf0Var = qof0Var.n;
            if (nnf0Var == null) {
                nnf0Var = qof0Var.o.invoke();
                qof0Var.n = nnf0Var;
            }
            return new m(nnf0Var);
        }
    }

    public m(nnf0 nnf0Var) {
        this.a = nnf0Var;
    }

    @Override // com.vk.reefton.trackers.l
    public final l7i b(vof0 vof0Var) {
        return new r7i(new com.vk.movika.sdk.base.ui.l(20, this, vof0Var));
    }
}
