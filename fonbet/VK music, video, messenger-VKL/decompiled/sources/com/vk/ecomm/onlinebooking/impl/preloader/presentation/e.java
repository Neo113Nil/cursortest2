package com.vk.ecomm.onlinebooking.impl.preloader.presentation;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.a;
import com.vk.ecomm.onlinebooking.impl.preloader.domain.model.ReBookingArgs;
import com.vk.ecomm.onlinebooking.impl.preloader.presentation.BookingPreloaderTask;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.arm0;
import xsna.as7;
import xsna.asl;
import xsna.bt7;
import xsna.c5g;
import xsna.ct7;
import xsna.drm0;
import xsna.dt7;
import xsna.fsk;
import xsna.hn50;
import xsna.hpj;
import xsna.hx7;
import xsna.is7;
import xsna.jn50;
import xsna.ks7;
import xsna.myc0;
import xsna.nn50;
import xsna.on50;
import xsna.ss7;
import xsna.tci;
import xsna.uvj;
import xsna.vs7;
import xsna.xye0;
import xsna.zq7;
import xsna.zrl;
import xsna.zu7;

/* compiled from: BookingPreloaderTaskExecutor.kt */
/* loaded from: classes18.dex */
public final class e extends uvj<ss7, on50, BookingPreloaderTask, BookingPreloaderTask, ks7, is7> {
    public final BookingScreenParams g;
    public final zq7 h;
    public final hx7 i;
    public final zu7 j;

    public e(nn50 nn50Var, BookingScreenParams bookingScreenParams, zq7 zq7Var, hx7 hx7Var, zu7 zu7Var) {
        super(tci.c, nn50Var);
        this.g = bookingScreenParams;
        this.h = zq7Var;
        this.i = hx7Var;
        this.j = zu7Var;
    }

    public static final void t(e eVar, xye0 xye0Var, BookingScreenParams bookingScreenParams) {
        eVar.getClass();
        BookingMaster bookingMaster = xye0Var.a;
        ArrayList arrayList = xye0Var.b;
        boolean z = false;
        if (bookingMaster != null && bookingMaster.d) {
            z = true;
        }
        boolean w = fsk.w(arrayList);
        eVar.c(new is7.a(new as7.m(BookingScreenParams.a(bookingScreenParams, (z || w) ? !z ? a.d.d.a : !w ? a.k.d.a : a.i.d.a : a.l.d.a, null, arrayList, bookingMaster, null, 0, null, 0, null, 131045), true)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v(e eVar, ReBookingArgs reBookingArgs, UserId userId, ContinuationImpl continuationImpl) {
        c cVar;
        Object obj;
        int i;
        zrl zrlVar;
        zrl zrlVar2;
        Object H;
        ReBookingArgs reBookingArgs2;
        Iterator it;
        Object obj2;
        BookingMaster bookingMaster;
        hpj hpjVar = eVar.f;
        if (continuationImpl instanceof c) {
            cVar = (c) continuationImpl;
            int i2 = cVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.label = i2 - Integer.MIN_VALUE;
                Object obj3 = cVar.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cVar.label;
                if (i != 0) {
                    kotlin.a.a(obj3);
                    asl b = myc0.b(hpjVar, null, null, new ct7(eVar, userId, null), 3);
                    asl b2 = myc0.b(hpjVar, null, null, new dt7(eVar, userId, null), 3);
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = b;
                    cVar.L$3 = b2;
                    cVar.label = 1;
                    Object x = eVar.x(reBookingArgs, userId, cVar);
                    if (x != obj) {
                        zrlVar = b;
                        obj3 = x;
                        zrlVar2 = b2;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bookingMaster = (BookingMaster) cVar.L$5;
                        reBookingArgs2 = (ReBookingArgs) cVar.L$4;
                        kotlin.a.a(obj3);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : (Iterable) obj3) {
                            if (reBookingArgs2.d.contains(new Integer(((BookingServiceModel) obj4).b))) {
                                arrayList.add(obj4);
                            }
                        }
                        return new xye0(bookingMaster, arrayList);
                    }
                    ReBookingArgs reBookingArgs3 = (ReBookingArgs) cVar.L$4;
                    zrl zrlVar3 = (zrl) cVar.L$3;
                    kotlin.a.a(obj3);
                    reBookingArgs2 = reBookingArgs3;
                    zrlVar2 = zrlVar3;
                    it = ((Iterable) obj3).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        int i3 = ((BookingMaster) obj2).b;
                        Integer num = reBookingArgs2.c;
                        if (num != null && i3 == num.intValue()) {
                            break;
                        }
                    }
                    BookingMaster bookingMaster2 = (BookingMaster) obj2;
                    BookingMaster bookingMaster3 = bookingMaster2 != null ? BookingMaster.k : bookingMaster2;
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.L$3 = null;
                    cVar.L$4 = reBookingArgs2;
                    cVar.L$5 = bookingMaster3;
                    cVar.label = 3;
                    obj3 = zrlVar2.H(cVar);
                    if (obj3 != obj) {
                        bookingMaster = bookingMaster3;
                        ArrayList arrayList2 = new ArrayList();
                        while (r12.hasNext()) {
                        }
                        return new xye0(bookingMaster, arrayList2);
                    }
                    return obj;
                }
                zrlVar2 = (zrl) cVar.L$3;
                zrlVar = (zrl) cVar.L$2;
                kotlin.a.a(obj3);
                ReBookingArgs reBookingArgs4 = (ReBookingArgs) obj3;
                cVar.L$0 = null;
                cVar.L$1 = null;
                cVar.L$2 = null;
                cVar.L$3 = zrlVar2;
                cVar.L$4 = reBookingArgs4;
                cVar.label = 2;
                H = zrlVar.H(cVar);
                if (H != obj) {
                    obj3 = H;
                    reBookingArgs2 = reBookingArgs4;
                    it = ((Iterable) obj3).iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    BookingMaster bookingMaster22 = (BookingMaster) obj2;
                    if (bookingMaster22 != null) {
                    }
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.L$3 = null;
                    cVar.L$4 = reBookingArgs2;
                    cVar.L$5 = bookingMaster3;
                    cVar.label = 3;
                    obj3 = zrlVar2.H(cVar);
                    if (obj3 != obj) {
                    }
                }
                return obj;
            }
        }
        cVar = new c(eVar, continuationImpl);
        Object obj32 = cVar.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar.label;
        if (i != 0) {
        }
        ReBookingArgs reBookingArgs42 = (ReBookingArgs) obj32;
        cVar.L$0 = null;
        cVar.L$1 = null;
        cVar.L$2 = null;
        cVar.L$3 = zrlVar2;
        cVar.L$4 = reBookingArgs42;
        cVar.label = 2;
        H = zrlVar.H(cVar);
        if (H != obj) {
        }
        return obj;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        BookingPreloaderTask bookingPreloaderTask = (BookingPreloaderTask) hn50Var;
        boolean z = bookingPreloaderTask instanceof BookingPreloaderTask.LoadRebooking;
        hpj hpjVar = this.f;
        if (!z) {
            if (bookingPreloaderTask instanceof BookingPreloaderTask.Reload) {
                return m(myc0.h(hpjVar, null, null, new b(this, bookingPreloaderTask, null), 3));
            }
            throw new NoWhenBranchMatchedException();
        }
        BookingPreloaderTask.LoadRebooking loadRebooking = (BookingPreloaderTask.LoadRebooking) bookingPreloaderTask;
        ReBookingArgs reBookingArgs = loadRebooking.b;
        BookingScreenParams bookingScreenParams = loadRebooking.c;
        e(ks7.b.a);
        return m(myc0.h(hpjVar, null, null, new bt7(this, reBookingArgs, bookingScreenParams, null), 3));
    }

    @Override // xsna.dl50, xsna.mn50
    public final void init() {
        w(this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    public final void w(BookingScreenParams bookingScreenParams) {
        ?? r6;
        boolean a = com.vk.ecomm.onlinebooking.impl.navhostfragment.c.a(bookingScreenParams);
        String str = bookingScreenParams.m;
        Map<String, String> map = bookingScreenParams.p;
        ReBookingArgs reBookingArgs = null;
        if (a && bookingScreenParams.c == a.j.d.a) {
            String str2 = map.get("record_id");
            Integer m = str2 != null ? arm0.m(10, str2) : null;
            String str3 = map.get("service_ids");
            if (str3 != null) {
                List c0 = drm0.c0(str3, new String[]{StringUtils.COMMA}, 0, 6);
                r6 = new ArrayList();
                Iterator it = c0.iterator();
                while (it.hasNext()) {
                    Integer m2 = arm0.m(10, (String) it.next());
                    if (m2 != null) {
                        r6.add(m2);
                    }
                }
            } else {
                r6 = 0;
            }
            if (r6 == 0) {
                r6 = EmptyList.b;
            }
            String str4 = map.get("specialist_id");
            Integer m3 = str4 != null ? arm0.m(10, str4) : null;
            if (m != null || !r6.isEmpty() || m3 != null || str.length() != 0) {
                reBookingArgs = new ReBookingArgs(m, m3, r6, str);
            }
        }
        if (reBookingArgs != null) {
            a(new BookingPreloaderTask.LoadRebooking(reBookingArgs, bookingScreenParams));
        } else {
            vs7.a(this, bookingScreenParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095 A[LOOP:0: B:15:0x008f->B:17:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(ReBookingArgs reBookingArgs, UserId userId, ContinuationImpl continuationImpl) {
        d dVar;
        int i;
        Iterator<T> it;
        if (continuationImpl instanceof d) {
            dVar = (d) continuationImpl;
            int i2 = dVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.label = i2 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj = dVar2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dVar2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (reBookingArgs.c != null && !reBookingArgs.d.isEmpty()) {
                        return reBookingArgs;
                    }
                    Integer num = reBookingArgs.b;
                    if (num == null) {
                        throw new IllegalArgumentException("ReBookingArgs is invalid recordId");
                    }
                    int intValue = num.intValue();
                    String str = reBookingArgs.e;
                    dVar2.L$0 = reBookingArgs;
                    dVar2.L$1 = null;
                    dVar2.L$2 = null;
                    dVar2.I$0 = intValue;
                    dVar2.label = 1;
                    obj = this.j.b(userId, intValue, null, str, dVar2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    reBookingArgs = (ReBookingArgs) dVar2.L$0;
                    kotlin.a.a(obj);
                }
                BookingRecord bookingRecord = (BookingRecord) obj;
                BookingMaster bookingMaster = bookingRecord.f;
                Integer num2 = bookingMaster != null ? new Integer(bookingMaster.b) : null;
                List<BookingServiceModel> list = bookingRecord.e;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Integer(((BookingServiceModel) it.next()).b));
                }
                return new ReBookingArgs(reBookingArgs.b, num2, arrayList, reBookingArgs.e);
            }
        }
        dVar = new d(this, continuationImpl);
        d dVar22 = dVar;
        Object obj2 = dVar22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dVar22.label;
        if (i != 0) {
        }
        BookingRecord bookingRecord2 = (BookingRecord) obj2;
        BookingMaster bookingMaster2 = bookingRecord2.f;
        if (bookingMaster2 != null) {
        }
        List<BookingServiceModel> list2 = bookingRecord2.e;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
        }
        return new ReBookingArgs(reBookingArgs.b, num2, arrayList2, reBookingArgs.e);
    }
}
