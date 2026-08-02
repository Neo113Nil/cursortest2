package com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.k;
import java.util.List;
import xsna.av7;
import xsna.epx;
import xsna.fw3;
import xsna.lm50;
import xsna.mr;
import xsna.qoy;
import xsna.urd0;

/* compiled from: BookingStartScreenViewState.kt */
/* loaded from: classes18.dex */
public interface o extends lm50 {

    /* compiled from: BookingStartScreenViewState.kt */
    public static final class a implements o {
        public final k.a b;
        public final boolean c;
        public final String d;
        public final String e;
        public final List f;
        public final av7 g;
        public final boolean h;
        public final String i;
        public final boolean j;
        public final List k;
        public final BookingActionResult l;

        public a(k.a aVar, boolean z, String str, String str2, List list, av7 av7Var, boolean z2, String str3, boolean z3, List list2, BookingActionResult bookingActionResult) {
            this.b = aVar;
            this.c = z;
            this.d = str;
            this.e = str2;
            this.f = list;
            this.g = av7Var;
            this.h = z2;
            this.i = str3;
            this.j = z3;
            this.k = list2;
            this.l = bookingActionResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && this.h == aVar.h && epx.f(this.i, aVar.i) && this.j == aVar.j && epx.f(this.k, aVar.k) && this.l == aVar.l;
        }

        public final int hashCode() {
            k.a aVar = this.b;
            int a = urd0.a(qoy.b((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.c), 31, this.d);
            String str = this.e;
            int a2 = fw3.a((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
            av7 av7Var = this.g;
            int a3 = fw3.a(qoy.b(urd0.a(qoy.b((a2 + (av7Var == null ? 0 : av7Var.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
            BookingActionResult bookingActionResult = this.l;
            return a3 + (bookingActionResult != null ? bookingActionResult.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(error=");
            sb.append(this.b);
            sb.append(", isLoading=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", masterAddress=");
            sb.append(this.e);
            sb.append(", masters=");
            mr.c(", record=", sb, this.f);
            sb.append(this.g);
            sb.append(", showAllRecords=");
            sb.append(this.h);
            sb.append(", currency=");
            sb.append(this.i);
            sb.append(", needConfirmCancelRecord=");
            sb.append(this.j);
            sb.append(", menuItems=");
            mr.c(", actionResult=", sb, this.k);
            sb.append(this.l);
            sb.append(')');
            return sb.toString();
        }
    }
}
