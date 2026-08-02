package com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2;

import com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.BookingMastersScreenTask;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.a;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.d;
import kotlin.NoWhenBranchMatchedException;
import xsna.al50;
import xsna.lj50;
import xsna.nr7;
import xsna.on50;

/* compiled from: BookingMastersScreenActor.kt */
/* loaded from: classes18.dex */
public final class b extends al50<nr7, a, on50, BookingMastersScreenTask, e, d> {
    public b() {
        throw null;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        a aVar = (a) lj50Var;
        if (aVar instanceof a.e) {
            c(new d.b.C0976d(((a.e) aVar).b));
            return;
        }
        if (aVar instanceof a.d) {
            c(d.b.c.a);
            return;
        }
        if (aVar instanceof a.C0973a) {
            c(d.b.C0975b.a);
        } else if (aVar instanceof a.b) {
            c(d.b.a.a);
        } else {
            if (!(aVar instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a(new BookingMastersScreenTask.OpenScreen(((a.c) aVar).b));
        }
    }
}
