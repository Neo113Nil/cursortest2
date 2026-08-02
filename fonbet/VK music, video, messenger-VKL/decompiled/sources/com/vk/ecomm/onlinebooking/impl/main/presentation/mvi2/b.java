package com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingButton;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.BookingStartScreenTask;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.i;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import kotlin.NoWhenBranchMatchedException;
import xsna.al50;
import xsna.j5g;
import xsna.lj50;
import xsna.on50;
import xsna.s3q0;
import xsna.sj50;

/* compiled from: BookingStartScreenActor.kt */
/* loaded from: classes18.dex */
public final class b extends al50<k, com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a, on50, BookingStartScreenTask, i, d> {
    public final BookingScreenParams c;

    /* compiled from: BookingStartScreenActor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookingButton.Action.values().length];
            try {
                iArr[BookingButton.Action.Reschedule.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingButton.Action.Cancel.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookingButton.Action.Other.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(BookingScreenParams bookingScreenParams, sj50<k, on50, BookingStartScreenTask, i, d> sj50Var) {
        super(sj50Var);
        this.c = bookingScreenParams;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        String str;
        com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a aVar = (com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a) lj50Var;
        boolean z = aVar instanceof a.h;
        BookingServiceType bookingServiceType = null;
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (z) {
            UserId userId = ((a.h) aVar).b;
            BookingRecord bookingRecord = ((k) sj50Var.getCurrentState()).i;
            Integer valueOf = bookingRecord != null ? Integer.valueOf(bookingRecord.b) : null;
            BookingRecord bookingRecord2 = ((k) sj50Var.getCurrentState()).i;
            if (bookingRecord2 == null || (str = bookingRecord2.p) == null) {
                str = "";
            }
            a(new BookingStartScreenTask.RetryLoad(userId, valueOf, str));
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        if (aVar instanceof a.i) {
            c(f.a);
            c(new d.c.g());
            e(i.b.a);
            return;
        }
        if (aVar instanceof a.b) {
            c(d.c.a.a);
            s3q0 s3q0Var2 = s3q0.a;
            return;
        }
        if (aVar instanceof a.g) {
            BookingRecord bookingRecord3 = ((k) sj50Var.getCurrentState()).i;
            Integer valueOf2 = bookingRecord3 != null ? Integer.valueOf(bookingRecord3.b) : null;
            if (((k) sj50Var.getCurrentState()).i != null) {
                BookingRecord bookingRecord4 = ((k) sj50Var.getCurrentState()).i;
                bookingServiceType = (bookingRecord4 == null || bookingRecord4.o != 0) ? BookingServiceType.GROUP : BookingServiceType.INDIVIDUAL;
            }
            a.g gVar = (a.g) aVar;
            BookingButton.Action action = gVar.b;
            BookingRecord bookingRecord5 = gVar.c;
            int i = a.$EnumSwitchMapping$0[action.ordinal()];
            if (i == 1) {
                c(new h(valueOf2, bookingServiceType));
                c(new d.c.b(bookingRecord5));
            } else if (i == 2) {
                c(new e(valueOf2, bookingServiceType));
                e(i.c.a);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c(new d.c.f(bookingRecord5));
            }
            e(i.b.a);
            return;
        }
        if (aVar.equals(a.c.b)) {
            c(d.c.C0972d.a);
            e(i.b.a);
            return;
        }
        if (aVar instanceof a.d) {
            BookingMaster bookingMaster = ((k) sj50Var.getCurrentState()).h.size() == 1 ? (BookingMaster) j5g.a0(((k) sj50Var.getCurrentState()).h) : null;
            BookingServiceType bookingServiceType2 = ((a.d) aVar).b;
            c(new g(bookingServiceType2));
            c(new d.c.e(bookingServiceType2, bookingMaster));
            e(i.b.a);
            return;
        }
        if (aVar.equals(a.e.b)) {
            e(i.a.a);
            return;
        }
        if (!aVar.equals(a.C0969a.b)) {
            if (!aVar.equals(a.f.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c(d.c.C0971c.a);
            e(i.b.a);
            return;
        }
        BookingRecord bookingRecord6 = ((k) sj50Var.getCurrentState()).i;
        Integer valueOf3 = bookingRecord6 != null ? Integer.valueOf(bookingRecord6.b) : null;
        String str2 = bookingRecord6 != null ? bookingRecord6.p : null;
        if (valueOf3 != null && str2 != null) {
            a(new BookingStartScreenTask.CancelRecord(this.c.b, valueOf3.intValue(), str2));
        }
        s3q0 s3q0Var3 = s3q0.a;
    }
}
