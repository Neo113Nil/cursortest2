package com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.a;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.yl50;

/* compiled from: BookingMastersScreenPatch.kt */
/* loaded from: classes18.dex */
public interface e extends yl50 {

    /* compiled from: BookingMastersScreenPatch.kt */
    public static final class a implements e {
        public final Exception a;
        public final a.c b;

        public a(Exception exc, a.c cVar) {
            this.a = exc;
            this.b = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Error(error=" + this.a + ", action=" + this.b + ')';
        }
    }

    /* compiled from: BookingMastersScreenPatch.kt */
    public static final class b implements e {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1296464048;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: BookingMastersScreenPatch.kt */
    public static final class c implements e {
        public final List<BookingMaster> a;

        public c(List<BookingMaster> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("UpdateMasters(items="), this.a);
        }
    }
}
