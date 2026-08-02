package com.vk.ecomm.onlinebooking.impl.calendar.ui;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.ecomm.onlinebooking.impl.calendar.a;
import com.vk.ecomm.onlinebooking.impl.calendar.k;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.ahn;
import xsna.bap;
import xsna.cri;
import xsna.dt1;
import xsna.fxu;
import xsna.gzs;
import xsna.izs;
import xsna.jk50;
import xsna.jp5;
import xsna.k9q0;
import xsna.ke4;
import xsna.ksy;
import xsna.lqy;
import xsna.mtk0;
import xsna.n34;
import xsna.q630;
import xsna.qm7;
import xsna.qri;
import xsna.rm7;
import xsna.s200;
import xsna.s3q0;
import xsna.sy90;
import xsna.txj0;
import xsna.u890;
import xsna.wh50;
import xsna.wzs;
import xsna.xvy;
import xsna.y1l;
import xsna.zak0;
import xsna.zvy;
import xsna.zzs;

/* compiled from: BookingCalendarDayBlockView.kt */
/* loaded from: classes18.dex */
public final class BookingCalendarDayBlockViewKt {

    /* compiled from: BookingCalendarDayBlockView.kt */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ izs<com.vk.ecomm.onlinebooking.impl.calendar.a, s3q0> b;
        public final /* synthetic */ BookingCalendarScreenState.DaySelector.a c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super com.vk.ecomm.onlinebooking.impl.calendar.a, s3q0> izsVar, BookingCalendarScreenState.DaySelector.a aVar) {
            this.b = izsVar;
            this.c = aVar;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.b.invoke(new a.e(this.c.e));
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class b implements izs<Integer, Object> {
        public final /* synthetic */ List b;

        public b(List list) {
            this.b = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            this.b.get(num.intValue());
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ List b;
        public final /* synthetic */ izs c;

        public c(List list, izs izsVar) {
            this.b = list;
            this.c = izsVar;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                BookingCalendarScreenState.DaySelector.a aVar3 = (BookingCalendarScreenState.DaySelector.a) this.b.get(intValue);
                aVar2.K(-1885294098);
                izs izsVar = this.c;
                boolean J = aVar2.J(izsVar) | aVar2.J(aVar3);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new a(izsVar, aVar3);
                    aVar2.R(x);
                }
                BookingCalendarDayBlockViewKt.b(aVar3, intValue, (gzs) x, aVar2, i & 112);
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    public static final void a(k kVar, izs<? super com.vk.ecomm.onlinebooking.impl.calendar.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1351704327);
        int i2 = (M.J(kVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1351704327, i2, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarDaySelectorView (BookingCalendarDayBlockView.kt:72)");
            }
            xvy a2 = zvy.a(0, 3, M);
            wh50 c2 = jk50.c(kVar.a, M);
            s3q0 s3q0Var = s3q0.a;
            boolean J = M.J(c2) | M.J(a2);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new BookingCalendarDayBlockViewKt$BookingCalendarDaySelectorView$1$1(a2, c2, null);
                M.R(x);
            }
            bap.g(s3q0Var, (wzs) x, M, 6);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c3 = qri.c(M, aVar2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c3, cri.a.d);
            c(c2, a2, M, 0);
            q630 E = ahn.E(txj0.f(aVar2, 1.0f), "calendar_days_list");
            u890 m = s200.m(12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            boolean J2 = M.J(c2) | ((i2 & 112) == 32);
            Object x2 = M.x();
            if (J2 || x2 == obj) {
                x2 = new jp5(1, c2, izsVar);
                M.R(x2);
            }
            lqy.b(E, a2, m, null, null, null, false, null, (izs) x2, M, 390, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new qm7(kVar, izsVar, i, 0);
        }
    }

    public static final void b(BookingCalendarScreenState.DaySelector.a aVar, int i, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar2, int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar2.M(-1096170086);
        if ((i2 & 6) == 0) {
            i3 = (M.J(aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(gzsVar) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1096170086, i3, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.DayView (BookingCalendarDayBlockView.kt:230)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new y1l(aVar, i, gzsVar);
                M.R(x);
            }
            y1l y1lVar = (y1l) x;
            ((zak0) y1lVar.a).setValue(aVar);
            ((zak0) y1lVar.b).setValue(Integer.valueOf(i));
            ((zak0) y1lVar.c).setValue(gzsVar);
            y1lVar.a(null, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new rm7(aVar, i, gzsVar, i2);
        }
    }

    public static final void c(mtk0<? extends List<BookingCalendarScreenState.DaySelector.a>> mtk0Var, xvy xvyVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(333614777);
        int i2 = (M.J(mtk0Var) ? 4 : 2) | i | (M.J(xvyVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(333614777, i2, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.Header (BookingCalendarDayBlockView.kt:109)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            boolean J = ((i2 & 14) == 4) | M.J(context) | ((i2 & 112) == 32);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new fxu(context, mtk0Var, xvyVar);
                M.R(x);
            }
            ((fxu) x).a(null, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ke4(mtk0Var, xvyVar, i, 1);
        }
    }
}
