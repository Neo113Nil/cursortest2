package com.vk.ecomm.onlinebooking.impl.preloader.presentation;

import com.vk.ecomm.onlinebooking.impl.preloader.presentation.BookingPreloaderTask;
import kotlin.NoWhenBranchMatchedException;
import xsna.al50;
import xsna.as7;
import xsna.gs7;
import xsna.is7;
import xsna.ks7;
import xsna.lj50;
import xsna.on50;
import xsna.sj50;
import xsna.ss7;

/* compiled from: BookingPreloaderActor.kt */
/* loaded from: classes18.dex */
public final class a extends al50<ss7, gs7, on50, BookingPreloaderTask, ks7, is7> {
    public a() {
        throw null;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        gs7 gs7Var = (gs7) lj50Var;
        if (gs7Var instanceof gs7.a) {
            c(new is7.a(as7.b.a));
            return;
        }
        boolean z = gs7Var instanceof gs7.b;
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (z) {
            c(new is7.a(new as7.a(((ss7) sj50Var.getCurrentState()).b.q)));
        } else {
            if (!gs7Var.equals(gs7.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a(new BookingPreloaderTask.Reload(((ss7) sj50Var.getCurrentState()).b));
        }
    }
}
