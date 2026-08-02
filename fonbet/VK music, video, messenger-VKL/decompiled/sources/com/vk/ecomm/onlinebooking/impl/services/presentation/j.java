package com.vk.ecomm.onlinebooking.impl.services.presentation;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.services.presentation.BookingServicesScreenTask;
import com.vk.ecomm.onlinebooking.impl.services.presentation.a;
import com.vk.ecomm.onlinebooking.impl.services.presentation.e;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.arm0;
import xsna.dmv;
import xsna.epx;
import xsna.hn50;
import xsna.hpj;
import xsna.jn50;
import xsna.myc0;
import xsna.mzp0;
import xsna.nn50;
import xsna.on50;
import xsna.tci;
import xsna.uvj;
import xsna.vhn0;
import xsna.vw7;
import xsna.whn0;
import xsna.yy7;

/* compiled from: BookingServicesScreenTaskExecutor.kt */
/* loaded from: classes18.dex */
public final class j extends uvj<BookingServicesScreenState, on50, BookingServicesScreenTask, BookingServicesScreenTask, e, c> {
    public final mzp0 g;
    public final dmv h;
    public final yy7 i;
    public final vhn0 j;

    public j() {
        throw null;
    }

    public j(nn50 nn50Var, mzp0 mzp0Var, dmv dmvVar, yy7 yy7Var) {
        super(tci.c, nn50Var);
        this.g = mzp0Var;
        this.h = dmvVar;
        this.i = yy7Var;
        this.j = whn0.a();
    }

    public static final void t(j jVar, BookingScreenParams bookingScreenParams, vw7 vw7Var) {
        jVar.getClass();
        String str = bookingScreenParams.p.get("selected_service_yc_id");
        Object obj = null;
        Integer m = str != null ? arm0.m(10, str) : null;
        Iterator it = vw7Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i = ((BookingServiceModel) next).b;
            if (m != null && i == m.intValue()) {
                obj = next;
                break;
            }
        }
        BookingServiceModel bookingServiceModel = (BookingServiceModel) obj;
        if (bookingServiceModel != null) {
        }
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        BookingServicesScreenTask bookingServicesScreenTask = (BookingServicesScreenTask) hn50Var;
        boolean z = bookingServicesScreenTask instanceof BookingServicesScreenTask.LoadData;
        hpj hpjVar = this.f;
        if (z) {
            BookingScreenParams bookingScreenParams = ((BookingServicesScreenTask.LoadData) bookingServicesScreenTask).b;
            a.c cVar = new a.c(2);
            if (epx.f(bookingScreenParams.d, BookingSettings.k)) {
                return m(myc0.h(hpjVar, null, null, new i(this, bookingScreenParams, cVar, null), 3));
            }
            e(new e.d(bookingScreenParams));
            return m(myc0.h(hpjVar, null, null, new h(this, bookingScreenParams, cVar, null), 3));
        }
        if (!(bookingServicesScreenTask instanceof BookingServicesScreenTask.LoadAvailableServices)) {
            throw new NoWhenBranchMatchedException();
        }
        BookingServicesScreenTask.LoadAvailableServices loadAvailableServices = (BookingServicesScreenTask.LoadAvailableServices) bookingServicesScreenTask;
        return m(myc0.h(hpjVar, null, null, new g(this, loadAvailableServices.b, loadAvailableServices.d, loadAvailableServices.c, null), 3));
    }
}
