package com.vk.ecomm.product_list.presentation;

import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import xsna.epx;
import xsna.ho8;
import xsna.pk50;
import xsna.vpd0;

/* compiled from: ProductListMviEvent.kt */
/* loaded from: classes18.dex */
public interface j extends pk50 {

    /* compiled from: ProductListMviEvent.kt */
    public static final class a implements j {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1988712128;
        }

        public final String toString() {
            return "NavigationClose";
        }
    }

    /* compiled from: ProductListMviEvent.kt */
    public static final class b implements j {
        public final vpd0 a;

        public b(vpd0 vpd0Var) {
            this.a = vpd0Var;
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
            return "RequestFaveChange(item=" + this.a + ')';
        }
    }

    /* compiled from: ProductListMviEvent.kt */
    public static final class c implements j {
        public final vpd0 a;
        public final CommonMarketStat$TypeRefSource b;
        public final CommonMarketStat$TypeMarketContextContent.Type c;
        public final Integer d;
        public final Long e;
        public final String f;

        public c(vpd0 vpd0Var, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, CommonMarketStat$TypeMarketContextContent.Type type, Integer num, Long l, String str) {
            this.a = vpd0Var;
            this.b = commonMarketStat$TypeRefSource;
            this.c = type;
            this.d = num;
            this.e = l;
            this.f = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
            Integer num = this.d;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Long l = this.e;
            int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.f;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RequestProductClick(item=");
            sb.append(this.a);
            sb.append(", refSource=");
            sb.append(this.b);
            sb.append(", contextContentType=");
            sb.append(this.c);
            sb.append(", contextContentId=");
            sb.append(this.d);
            sb.append(", contextContentOwnerId=");
            sb.append(this.e);
            sb.append(", adsLabel=");
            return ho8.a(sb, this.f, ')');
        }
    }
}
