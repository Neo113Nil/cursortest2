package com.vk.ecomm.onlinebooking.impl.edit;

import android.telephony.PhoneNumberUtils;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.ecomm.onlinebooking.impl.edit.f;
import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.as7;
import xsna.cmv;
import xsna.dmv;
import xsna.epx;
import xsna.f4z;
import xsna.g76;
import xsna.hq7;
import xsna.lp7;
import xsna.myc0;
import xsna.sdz;
import xsna.vhn0;
import xsna.whn0;
import xsna.wk50;
import xsna.xl50;
import xsna.yy7;
import xsna.zp7;

/* compiled from: BookingEditScreenFeature.kt */
/* loaded from: classes18.dex */
public final class b extends wk50<hq7, BookingEditScreenState, com.vk.ecomm.onlinebooking.impl.edit.a, f> {
    public final androidx.lifecycle.j f;
    public final cmv.b g;
    public final g76 h;
    public final yy7 i;
    public final dmv j;
    public final sdz k;
    public final f4z l;
    public final f4z m;
    public final f4z n;
    public final vhn0 o;

    /* compiled from: BookingEditScreenFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookingEditModel.EditMode.values().length];
            try {
                iArr[BookingEditModel.EditMode.Edit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingEditModel.EditMode.Reschedule.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookingEditModel.EditMode.Overview.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(BookingScreenParams bookingScreenParams, androidx.lifecycle.j jVar, cmv.b bVar, g76 g76Var, yy7 yy7Var, dmv dmvVar, sdz sdzVar) {
        super(a.g.b.b, new o(bookingScreenParams, sdzVar));
        this.f = jVar;
        this.g = bVar;
        this.h = g76Var;
        this.i = yy7Var;
        this.j = dmvVar;
        this.k = sdzVar;
        this.l = new f4z();
        this.m = new f4z();
        this.n = new f4z();
        this.o = whn0.a();
    }

    @Override // xsna.wk50
    public final void N(BookingEditScreenState bookingEditScreenState, com.vk.ecomm.onlinebooking.impl.edit.a aVar) {
        xl50 xl50Var;
        BookingEditScreenState bookingEditScreenState2 = bookingEditScreenState;
        com.vk.ecomm.onlinebooking.impl.edit.a aVar2 = aVar;
        BookingEditScreenState.InfoBlock infoBlock = bookingEditScreenState2.h;
        BookingScreenParams bookingScreenParams = bookingEditScreenState2.b;
        BookingEditModel bookingEditModel = bookingEditScreenState2.c;
        if (bookingEditScreenState2.f) {
            return;
        }
        boolean z = aVar2 instanceof a.g;
        androidx.lifecycle.j jVar = this.f;
        f4z f4zVar = this.l;
        if (z) {
            a.g gVar = (a.g) aVar2;
            if (gVar instanceof a.g.b) {
                myc0.h(jVar, null, null, new d(this, bookingScreenParams, null), 3);
                return;
            }
            if (epx.f(gVar, a.g.c.b)) {
                f4zVar.b(as7.b.a);
                return;
            } else if (epx.f(gVar, a.g.C0965a.b)) {
                f4zVar.b(new as7.a(bookingScreenParams.q));
                return;
            } else {
                if (!(gVar instanceof a.g.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(new as7.e(null));
                return;
            }
        }
        if (aVar2 instanceof a.b) {
            a.b bVar = (a.b) aVar2;
            if (epx.f(bVar, a.b.C0960b.b)) {
                f4zVar.b(new as7.f(BookingScreenParams.a(bookingEditScreenState2.b, a.d.d.a, null, bookingEditModel.d, null, null, 0, null, 0, null, 130997)));
                return;
            }
            if (!epx.f(bVar, a.b.C0959a.b)) {
                if (!epx.f(bVar, a.b.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(new as7.l(BookingScreenParams.a(bookingEditScreenState2.b, a.e.d.a, null, null, null, null, 0, null, 0, null, 131069)));
                return;
            }
            int i = a.$EnumSwitchMapping$0[bookingEditModel.a.ordinal()];
            if (i == 1) {
                f4zVar.b(new as7.m(BookingScreenParams.a(bookingEditScreenState2.b, a.c.d.a, null, bookingEditModel.d, null, null, 0, null, 0, null, 131061), false));
                return;
            } else if (i == 2) {
                f4zVar.b(new as7.m(bookingScreenParams, false));
                return;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (aVar2 instanceof a.InterfaceC0957a) {
            a.InterfaceC0957a interfaceC0957a = (a.InterfaceC0957a) aVar2;
            if (!epx.f(interfaceC0957a, a.InterfaceC0957a.C0958a.b)) {
                if (!(interfaceC0957a instanceof a.InterfaceC0957a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(new as7.e(((a.InterfaceC0957a.b) interfaceC0957a).b));
                return;
            }
            int i2 = a.$EnumSwitchMapping$0[bookingEditModel.a.ordinal()];
            if (i2 == 1) {
                if (X(bookingEditScreenState2)) {
                    myc0.h(jVar, null, null, new c(this, bookingEditScreenState2, null), 3);
                    return;
                }
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            } else {
                if (X(bookingEditScreenState2)) {
                    myc0.h(jVar, null, null, new e(this, bookingEditScreenState2, null), 3);
                    return;
                }
                return;
            }
        }
        if (aVar2 instanceof a.e) {
            a.e eVar = (a.e) aVar2;
            boolean z2 = eVar instanceof a.e.C0963a;
            g76 g76Var = this.h;
            if (z2) {
                try {
                    T(new f.j(g76Var.f(bookingEditModel, ((a.e.C0963a) eVar).b)));
                    return;
                } catch (Exception e) {
                    T(new f.e(e, eVar));
                    return;
                }
            }
            if (!epx.f(eVar, a.e.c.b)) {
                if (!epx.f(eVar, a.e.b.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(new f.m());
                return;
            }
            BookingEditScreenState.g gVar2 = bookingEditScreenState2.e;
            if (gVar2 != null) {
                try {
                    T(new f.j(g76Var.f(bookingEditModel, gVar2.b)));
                    return;
                } catch (Exception e2) {
                    T(new f.e(e2, eVar));
                    return;
                }
            }
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("got action " + eVar + " when state.serviceToDelete == null"));
            return;
        }
        if (!(aVar2 instanceof a.f)) {
            if (aVar2 instanceof lp7) {
                T(new zp7(((lp7) aVar2).b));
                return;
            }
            if (aVar2 instanceof a.d) {
                a.d dVar = (a.d) aVar2;
                if (dVar instanceof a.d.C0962a) {
                    T(new f.c.a(((a.d.C0962a) dVar).b));
                    return;
                }
                return;
            }
            if (!(aVar2 instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a.c cVar = (a.c) aVar2;
            if (epx.f(cVar, a.c.C0961a.b)) {
                T(f.b.a.b);
                return;
            } else {
                if (!epx.f(cVar, a.c.b.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(f.b.C0967b.b);
                return;
            }
        }
        a.f fVar = (a.f) aVar2;
        if (fVar instanceof a.f.c) {
            String str = ((a.f.c) fVar).b;
            BookingEditScreenState.InfoBlock.NameError nameError = str.length() > 150 ? BookingEditScreenState.InfoBlock.NameError.TooLong : str.length() == 0 ? BookingEditScreenState.InfoBlock.NameError.Empty : BookingEditScreenState.InfoBlock.NameError.None;
            if (infoBlock.c != nameError) {
                T(nameError.h());
            }
            T(new f.h(str));
            return;
        }
        if (fVar instanceof a.f.d) {
            String str2 = ((a.f.d) fVar).b;
            BookingEditScreenState.InfoBlock.PhoneError phoneError = str2.length() > 14 ? BookingEditScreenState.InfoBlock.PhoneError.TooLong : (epx.f(str2, "+") || PhoneNumberUtils.isGlobalPhoneNumber(str2)) ? BookingEditScreenState.InfoBlock.PhoneError.None : BookingEditScreenState.InfoBlock.PhoneError.WrongFormat;
            if (infoBlock.e != phoneError) {
                T(phoneError.h());
            }
            T(new f.i(str2));
            return;
        }
        if (!(fVar instanceof a.f.C0964a)) {
            if (!(fVar instanceof a.f.b)) {
                throw new NoWhenBranchMatchedException();
            }
            T(new f.g(((a.f.b) fVar).b));
            return;
        }
        String str3 = ((a.f.C0964a) fVar).b;
        BookingEditScreenState.InfoBlock.Error error = str3.length() > 150 ? BookingEditScreenState.InfoBlock.Error.TooLong : BookingEditScreenState.InfoBlock.Error.None;
        if (infoBlock.g != error) {
            error.getClass();
            int i3 = BookingEditScreenState.InfoBlock.Error.a.$EnumSwitchMapping$0[error.ordinal()];
            if (i3 == 1) {
                xl50Var = f.a.C0966a.b;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                xl50Var = f.a.b.b;
            }
            T(xl50Var);
        }
        T(new f.C0968f(str3));
    }

    public final f4z U() {
        return this.n;
    }

    public final f4z V() {
        return this.m;
    }

    public final f4z W() {
        return this.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X(BookingEditScreenState bookingEditScreenState) {
        String str;
        BookingEditScreenState.InfoBlock infoBlock = bookingEditScreenState.h;
        boolean z = true;
        if (!infoBlock.h) {
            if (infoBlock.b.length() > 150) {
                T(BookingEditScreenState.InfoBlock.NameError.TooLong.h());
            } else {
                if (infoBlock.b.length() == 0) {
                    T(BookingEditScreenState.InfoBlock.NameError.Empty.h());
                }
                str = infoBlock.d;
                String str2 = infoBlock.d;
                if (str.length() <= 14) {
                    T(BookingEditScreenState.InfoBlock.PhoneError.TooLong.h());
                } else if (str2.length() == 0) {
                    T(BookingEditScreenState.InfoBlock.PhoneError.Empty.h());
                } else if ((str2.length() > 8 && !epx.f(str2, "+") && !PhoneNumberUtils.isGlobalPhoneNumber(str2)) || str2.length() < 8) {
                    T(BookingEditScreenState.InfoBlock.PhoneError.WrongFormat.h());
                }
                z = false;
            }
            z = false;
            str = infoBlock.d;
            String str22 = infoBlock.d;
            if (str.length() <= 14) {
            }
            z = false;
        }
        if (infoBlock.f.length() <= 150) {
            return z;
        }
        T(f.a.b.b);
        return false;
    }
}
