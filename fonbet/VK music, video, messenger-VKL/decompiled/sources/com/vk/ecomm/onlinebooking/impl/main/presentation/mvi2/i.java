package com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2;

import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a;
import xsna.yl50;

/* compiled from: BookingStartScreenPatch.kt */
/* loaded from: classes18.dex */
public interface i extends yl50 {

    /* compiled from: BookingStartScreenPatch.kt */
    public static final class a implements i {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -575461578;
        }

        public final String toString() {
            return "AbortConfirmCancelRecord";
        }
    }

    /* compiled from: BookingStartScreenPatch.kt */
    public static final class b implements i {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1118594299;
        }

        public final String toString() {
            return "ClearActionResult";
        }
    }

    /* compiled from: BookingStartScreenPatch.kt */
    public static final class c implements i {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 564646704;
        }

        public final String toString() {
            return "ConfirmCancelRecord";
        }
    }

    /* compiled from: BookingStartScreenPatch.kt */
    public static final class d implements i {
        public final Exception a;
        public final a.h b;

        public d(Exception exc, a.h hVar) {
            this.a = exc;
            this.b = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b.equals(dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Error(error=" + this.a + ", action=" + this.b + ')';
        }
    }
}
