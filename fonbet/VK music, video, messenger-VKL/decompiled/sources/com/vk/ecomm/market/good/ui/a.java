package com.vk.ecomm.market.good.ui;

import xsna.epx;
import xsna.uqi;
import xsna.yjk;

/* compiled from: ProductActionButtonsState.kt */
/* loaded from: classes18.dex */
public interface a extends yjk {

    /* compiled from: ProductActionButtonsState.kt */
    /* renamed from: com.vk.ecomm.market.good.ui.a$a, reason: collision with other inner class name */
    public static final class C0947a implements a {
        public static final C0947a a = new C0947a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0947a);
        }

        public final int hashCode() {
            return -831946807;
        }

        public final String toString() {
            return "Ozon";
        }
    }

    /* compiled from: ProductActionButtonsState.kt */
    public static final class b implements a {
        public final String a;
        public final Integer b;

        public b(String str, Integer num) {
            this.a = str;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VK(title=");
            sb.append(this.a);
            sb.append(", iconResId=");
            return uqi.b(sb, this.b, ')');
        }
    }
}
