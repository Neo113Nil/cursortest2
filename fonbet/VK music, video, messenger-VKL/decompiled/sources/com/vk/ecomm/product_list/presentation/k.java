package com.vk.ecomm.product_list.presentation;

import com.vk.dto.common.id.UserId;
import defpackage.q0;
import java.util.ArrayList;
import xsna.bh10;
import xsna.epx;
import xsna.yl50;

/* compiled from: ProductListMviPatch.kt */
/* loaded from: classes18.dex */
public interface k extends yl50 {

    /* compiled from: ProductListMviPatch.kt */
    public static final class a implements k {
        public final ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("DataLoaded(products="), this.a);
        }
    }

    /* compiled from: ProductListMviPatch.kt */
    public static final class b implements k {
        public final Exception a;

        public b(Exception exc) {
            this.a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Error(exception=" + this.a + ')';
        }
    }

    /* compiled from: ProductListMviPatch.kt */
    public static final class c implements k {
        public final long a;
        public final UserId b;
        public final boolean c;

        public c(long j, UserId userId, boolean z) {
            this.a = j;
            this.b = userId;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FaveChanged(productId=");
            sb.append(this.a);
            sb.append(", ownerId=");
            sb.append(this.b);
            sb.append(", isFave=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ProductListMviPatch.kt */
    public static final class d implements k {
        public final ArrayList a;

        public d(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("ModerationUpdated(products="), this.a);
        }
    }

    /* compiled from: ProductListMviPatch.kt */
    public static final class e implements k {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -27506672;
        }

        public final String toString() {
            return "StartLoading";
        }
    }
}
