package com.vk.ecomm.product_list.presentation;

import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.b8p0;
import xsna.epx;
import xsna.lm50;
import xsna.pr;
import xsna.shy;
import xsna.tlo0;

/* compiled from: ProductListViewState.kt */
/* loaded from: classes18.dex */
public interface q extends lm50 {

    /* compiled from: ProductListViewState.kt */
    public static final class a implements q {
        public final b8p0 b;
        public final ArrayList c;

        public a(b8p0 b8p0Var, ArrayList arrayList) {
            this.b = b8p0Var;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.a.hashCode() * 31);
        }

        @Override // com.vk.ecomm.product_list.presentation.q
        public final b8p0 i() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(topBarViewState=");
            sb.append(this.b);
            sb.append(", contentItems=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
        }
    }

    /* compiled from: ProductListViewState.kt */
    public static final class b implements q {
        public final b8p0 b;
        public final tlo0.f c;
        public final tlo0.f d;

        public b(b8p0 b8p0Var, tlo0.f fVar, tlo0.f fVar2) {
            this.b = b8p0Var;
            this.c = fVar;
            this.d = fVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d);
        }

        public final int hashCode() {
            return Integer.hashCode(this.d.a) + shy.a(R.drawable.vk_icon_error_triangle_outline_56, shy.a(this.c.a, this.b.a.hashCode() * 31, 31), 31);
        }

        @Override // com.vk.ecomm.product_list.presentation.q
        public final b8p0 i() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DefaultError(topBarViewState=");
            sb.append(this.b);
            sb.append(", description=");
            sb.append(this.c);
            sb.append(", imageResId=2131237035, retryButtonTitle=");
            return pr.b(sb, this.d, ')');
        }
    }

    /* compiled from: ProductListViewState.kt */
    public static final class c implements q {
        public final b8p0 b;

        public c(b8p0 b8p0Var) {
            this.b = b8p0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.a.hashCode();
        }

        @Override // com.vk.ecomm.product_list.presentation.q
        public final b8p0 i() {
            return this.b;
        }

        public final String toString() {
            return "Loading(topBarViewState=" + this.b + ')';
        }
    }

    /* compiled from: ProductListViewState.kt */
    public static final class d implements q {
        public final b8p0 b;
        public final tlo0.f c;
        public final tlo0.f d;
        public final tlo0.f e;

        public d(b8p0 b8p0Var, tlo0.f fVar, tlo0.f fVar2, tlo0.f fVar3) {
            this.b = b8p0Var;
            this.c = fVar;
            this.d = fVar2;
            this.e = fVar3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b.equals(dVar.b) && this.c.equals(dVar.c) && this.d.equals(dVar.d) && this.e.equals(dVar.e);
        }

        public final int hashCode() {
            return Integer.hashCode(this.e.a) + shy.a(R.drawable.vk_icon_illustration_antenna_120, shy.a(this.d.a, shy.a(this.c.a, this.b.a.hashCode() * 31, 31), 31), 31);
        }

        @Override // com.vk.ecomm.product_list.presentation.q
        public final b8p0 i() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NetworkError(topBarViewState=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", description=");
            sb.append(this.d);
            sb.append(", imageResId=2131237286, retryButtonTitle=");
            return pr.b(sb, this.e, ')');
        }
    }

    b8p0 i();
}
