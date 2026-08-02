package com.vk.ecomm.design.compose.product_info;

import com.vk.dto.common.Image;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.ely;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;
import xsna.wow;
import xsna.zrp;

/* compiled from: MarketProductCardMainInfo.kt */
/* loaded from: classes18.dex */
public final class MarketProductCardMainInfo {
    public final Price a;
    public final String b;
    public final String c;
    public final b d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final boolean h;
    public final Boolean i;
    public final boolean j;
    public final List<Image> k;
    public final List<Image> l;

    /* compiled from: MarketProductCardMainInfo.kt */
    public static final class Price {
        public final String a;
        public final boolean b;
        public final String c;
        public final boolean d;
        public final int e;
        public final Type f;
        public final String g;
        public final Integer h;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MarketProductCardMainInfo.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type Loyalty;
            public static final Type Regular;

            static {
                Type type = new Type("Loyalty", 0);
                Loyalty = type;
                Type type2 = new Type("Regular", 1);
                Regular = type2;
                Type[] typeArr = {type, type2};
                $VALUES = typeArr;
                $ENTRIES = new asp(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public Price(String str, boolean z, String str2, boolean z2, int i, Type type, String str3, Integer num) {
            this.a = str;
            this.b = z;
            this.c = str2;
            this.d = z2;
            this.e = i;
            this.f = type;
            this.g = str3;
            this.h = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Price)) {
                return false;
            }
            Price price = (Price) obj;
            return epx.f(this.a, price.a) && this.b == price.b && epx.f(this.c, price.c) && this.d == price.d && this.e == price.e && this.f == price.f && epx.f(this.g, price.g) && epx.f(this.h, price.h);
        }

        public final int hashCode() {
            int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int hashCode = (this.f.hashCode() + shy.a(this.e, qoy.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31)) * 31;
            String str2 = this.g;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.h;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Price(text=");
            sb.append(this.a);
            sb.append(", isLoyaltyPrice=");
            sb.append(this.b);
            sb.append(", oldPriceText=");
            sb.append(this.c);
            sb.append(", shouldShowDiscount=");
            sb.append(this.d);
            sb.append(", discountRate=");
            sb.append(this.e);
            sb.append(", priceColorType=");
            sb.append(this.f);
            sb.append(", loyaltyHintText=");
            sb.append(this.g);
            sb.append(", loyaltyTextColor=");
            return uqi.b(sb, this.h, ')');
        }
    }

    /* compiled from: MarketProductCardMainInfo.kt */
    public static final class a {
        public final String a;
        public final Integer b;
        public final ely c;
        public final boolean d;
        public final Integer e;
        public final Integer f;
        public final String g;

        public a(String str, Integer num, ely elyVar, boolean z, Integer num2, String str2, int i) {
            Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_warning);
            elyVar = (i & 4) != 0 ? null : elyVar;
            valueOf = (i & 16) != 0 ? null : valueOf;
            this.a = str;
            this.b = num;
            this.c = elyVar;
            this.d = z;
            this.e = valueOf;
            this.f = num2;
            this.g = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            ely elyVar = this.c;
            int b = qoy.b((hashCode2 + (elyVar == null ? 0 : elyVar.hashCode())) * 31, 31, this.d);
            Integer num2 = this.e;
            int hashCode3 = (b + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f;
            return this.g.hashCode() + ((hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Label(id=");
            sb.append(this.a);
            sb.append(", iconRes=");
            sb.append(this.b);
            sb.append(", labelIcon=");
            sb.append(this.c);
            sb.append(", isColorFul=");
            sb.append(this.d);
            sb.append(", iconTint=");
            sb.append(this.e);
            sb.append(", trailingIcon=");
            sb.append(this.f);
            sb.append(", text=");
            return ho8.a(sb, this.g, ')');
        }
    }

    /* compiled from: MarketProductCardMainInfo.kt */
    public static final class b {
        public final Float a;
        public final Integer b;
        public final String c;

        public b(Float f, Integer num, String str) {
            this.a = f;
            this.b = num;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            Float f = this.a;
            int hashCode = (f == null ? 0 : f.hashCode()) * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.c;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Rating(rating=");
            sb.append(this.a);
            sb.append(", reviewsCount=");
            sb.append(this.b);
            sb.append(", reviewsCountText=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public MarketProductCardMainInfo(Price price, String str, String str2, b bVar, boolean z, boolean z2, ArrayList arrayList, boolean z3, Boolean bool, boolean z4, List list, List list2) {
        this.a = price;
        this.b = str;
        this.c = str2;
        this.d = bVar;
        this.e = z;
        this.f = z2;
        this.g = arrayList;
        this.h = z3;
        this.i = bool;
        this.j = z4;
        this.k = list;
        this.l = list2;
    }

    public final boolean equals(Object obj) {
        boolean f;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketProductCardMainInfo)) {
            return false;
        }
        MarketProductCardMainInfo marketProductCardMainInfo = (MarketProductCardMainInfo) obj;
        if (!epx.f(this.a, marketProductCardMainInfo.a) || !epx.f(this.b, marketProductCardMainInfo.b) || !epx.f(this.c, marketProductCardMainInfo.c) || !epx.f(this.d, marketProductCardMainInfo.d) || this.e != marketProductCardMainInfo.e || this.f != marketProductCardMainInfo.f) {
            return false;
        }
        List list = marketProductCardMainInfo.g;
        List list2 = this.g;
        if (list2 == null) {
            if (list == null) {
                f = true;
            }
            f = false;
        } else {
            if (list != null) {
                f = epx.f(list2, list);
            }
            f = false;
        }
        return f && this.h == marketProductCardMainInfo.h && epx.f(this.i, marketProductCardMainInfo.i) && this.j == marketProductCardMainInfo.j && epx.f(this.k, marketProductCardMainInfo.k) && epx.f(this.l, marketProductCardMainInfo.l);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.d;
        int b2 = qoy.b(qoy.b((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.e), 31, this.f);
        List list = this.g;
        int b3 = qoy.b((b2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.h);
        Boolean bool = this.i;
        return this.l.hashCode() + fw3.a(qoy.b((b3 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketProductCardMainInfo(displayedPriceInfo=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", serviceDurationText=");
        sb.append(this.c);
        sb.append(", marketItemRating=");
        sb.append(this.d);
        sb.append(", isFave=");
        sb.append(this.e);
        sb.append(", isShowReviews=");
        sb.append(this.f);
        sb.append(", labels=");
        List list = this.g;
        sb.append((Object) (list == null ? "null" : wow.c(list)));
        sb.append(", isMainBlockRedesignEnabled=");
        sb.append(this.h);
        sb.append(", isLabelRatingEnabled=");
        sb.append(this.i);
        sb.append(", isLabelsLayoutVertical=");
        sb.append(this.j);
        sb.append(", reviewThumbs=");
        sb.append(this.k);
        sb.append(", reviewThumbsDisplayed=");
        return ms9.a(')', sb, this.l);
    }
}
