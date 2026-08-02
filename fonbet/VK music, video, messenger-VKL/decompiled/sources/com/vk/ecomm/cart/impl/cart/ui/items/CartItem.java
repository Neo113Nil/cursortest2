package com.vk.ecomm.cart.impl.cart.ui.items;

import android.text.Spannable;
import android.text.SpannableString;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.b4q;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.jr;
import xsna.kr;
import xsna.qoy;
import xsna.qr;
import xsna.shy;
import xsna.tlo0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: CartItem.kt */
/* loaded from: classes18.dex */
public abstract class CartItem {
    public final IslandPart a;
    public final String b;

    /* compiled from: CartItem.kt */
    public static final class Summary extends CartItem {
        public final UserId c;
        public final tlo0.e d;
        public final tlo0 e;
        public final String f;
        public final Action g;
        public final Spannable h;
        public final IslandPart i;

        /* compiled from: CartItem.kt */
        public static final class Action {
            public final tlo0.f a;
            public final Style b;
            public final Type c;
            public final boolean d;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: CartItem.kt */
            public static final class Style {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Style[] $VALUES;
                public static final Style Primary;
                public static final Style Secondary;

                static {
                    Style style = new Style("Primary", 0);
                    Primary = style;
                    Style style2 = new Style("Secondary", 1);
                    Secondary = style2;
                    Style[] styleArr = {style, style2};
                    $VALUES = styleArr;
                    $ENTRIES = new asp(styleArr);
                }

                public Style() {
                    throw null;
                }

                public static Style valueOf(String str) {
                    return (Style) Enum.valueOf(Style.class, str);
                }

                public static Style[] values() {
                    return (Style[]) $VALUES.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: CartItem.kt */
            public static final class Type {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                public static final Type Checkout;
                public static final Type CommunityShop;

                static {
                    Type type = new Type("Checkout", 0);
                    Checkout = type;
                    Type type2 = new Type("CommunityShop", 1);
                    CommunityShop = type2;
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

            public Action(tlo0.f fVar, Style style, Type type, boolean z) {
                this.a = fVar;
                this.b = style;
                this.c = type;
                this.d = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Action)) {
                    return false;
                }
                Action action = (Action) obj;
                return this.a.equals(action.a) && this.b == action.b && this.c == action.c && this.d == action.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a.a) * 31)) * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Action(text=");
                sb.append(this.a);
                sb.append(", style=");
                sb.append(this.b);
                sb.append(", type=");
                sb.append(this.c);
                sb.append(", isEnabled=");
                return q0.a(sb, this.d, ')');
            }
        }

        public Summary(UserId userId, tlo0.e eVar, tlo0 tlo0Var, String str, Action action, SpannableString spannableString, IslandPart islandPart) {
            super(islandPart, b4q.b(userId, "summary_"));
            this.c = userId;
            this.d = eVar;
            this.e = tlo0Var;
            this.f = str;
            this.g = action;
            this.h = spannableString;
            this.i = islandPart;
        }

        @Override // com.vk.ecomm.cart.impl.cart.ui.items.CartItem
        public final IslandPart a() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Summary)) {
                return false;
            }
            Summary summary = (Summary) obj;
            return epx.f(this.c, summary.c) && epx.f(this.d, summary.d) && epx.f(this.e, summary.e) && epx.f(this.f, summary.f) && epx.f(this.g, summary.g) && epx.f(this.h, summary.h) && this.i == summary.i;
        }

        public final int hashCode() {
            int hashCode = (this.g.hashCode() + urd0.a(com.vk.movika.sdk.base.model.history.b.a((this.d.hashCode() + (Long.hashCode(this.c.b) * 31)) * 31, 31, this.e), 31, this.f)) * 31;
            Spannable spannable = this.h;
            return this.i.hashCode() + ((hashCode + (spannable == null ? 0 : spannable.hashCode())) * 31);
        }

        public final String toString() {
            return "Summary(communityId=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ", totalPrice=" + this.f + ", action=" + this.g + ", agreement=" + ((Object) this.h) + ", islandPart=" + this.i + ')';
        }
    }

    /* compiled from: CartItem.kt */
    public static final class a extends CartItem {
        public final UserId c;
        public final tlo0.f d;
        public final int e;
        public final boolean f;
        public final IslandPart g;

        public a(UserId userId, tlo0.f fVar, IslandPart islandPart) {
            super(islandPart, b4q.b(userId, "banner_"));
            this.c = userId;
            this.d = fVar;
            this.e = R.drawable.vk_icon_delete_outline_24;
            this.f = true;
            this.g = islandPart;
        }

        @Override // com.vk.ecomm.cart.impl.cart.ui.items.CartItem
        public final IslandPart a() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g;
        }

        public final int hashCode() {
            return this.g.hashCode() + qoy.b(shy.a(this.e, shy.a(this.d.a, Long.hashCode(this.c.b) * 31, 31), 31), 31, this.f);
        }

        public final String toString() {
            return "Banner(communityId=" + this.c + ", text=" + this.d + ", iconRes=" + this.e + ", isCloseable=" + this.f + ", islandPart=" + this.g + ')';
        }
    }

    /* compiled from: CartItem.kt */
    public static final class b extends CartItem {
        public final UserId c;
        public final String d;
        public final String e;
        public final boolean f;
        public final ArrayList g;
        public final boolean h;
        public final IslandPart i;

        public b(UserId userId, String str, String str2, boolean z, ArrayList arrayList, boolean z2, IslandPart islandPart) {
            super(islandPart, b4q.b(userId, "header_"));
            this.c = userId;
            this.d = str;
            this.e = str2;
            this.f = z;
            this.g = arrayList;
            this.h = z2;
            this.i = islandPart;
        }

        @Override // com.vk.ecomm.cart.impl.cart.ui.items.CartItem
        public final IslandPart a() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && this.f == bVar.f && epx.f(this.g, bVar.g) && this.h == bVar.h && this.i == bVar.i;
        }

        public final int hashCode() {
            return this.i.hashCode() + qoy.b(qr.a(this.g, qoy.b(urd0.a(urd0.a(Long.hashCode(this.c.b) * 31, 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Community(communityId=");
            sb.append(this.c);
            sb.append(", avatarUrl=");
            sb.append(this.d);
            sb.append(", title=");
            sb.append(this.e);
            sb.append(", isVerified=");
            sb.append(this.f);
            sb.append(", deliveries=");
            kr.d(this.g, sb, ", isClickable=");
            sb.append(this.h);
            sb.append(", islandPart=");
            sb.append(this.i);
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: CartItem.kt */
    public static abstract class c extends CartItem {
        public final IslandPart c;
        public final String d;

        /* compiled from: CartItem.kt */
        public static abstract class a extends c {
            public final String e;

            /* compiled from: CartItem.kt */
            /* renamed from: com.vk.ecomm.cart.impl.cart.ui.items.CartItem$c$a$a, reason: collision with other inner class name */
            public static final class C0920a extends a {
                public final IslandPart f;

                public C0920a(IslandPart islandPart) {
                    super(islandPart, "next_carts_error");
                    this.f = islandPart;
                }

                @Override // com.vk.ecomm.cart.impl.cart.ui.items.CartItem.c, com.vk.ecomm.cart.impl.cart.ui.items.CartItem
                public final IslandPart a() {
                    return this.f;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0920a) && this.f == ((C0920a) obj).f;
                }

                public final int hashCode() {
                    return this.f.hashCode();
                }

                public final String toString() {
                    return "Error(islandPart=" + this.f + ')';
                }
            }

            /* compiled from: CartItem.kt */
            public static final class b extends a {
                public final IslandPart f;

                public b(IslandPart islandPart) {
                    super(islandPart, "next_carts_loading");
                    this.f = islandPart;
                }

                @Override // com.vk.ecomm.cart.impl.cart.ui.items.CartItem.c, com.vk.ecomm.cart.impl.cart.ui.items.CartItem
                public final IslandPart a() {
                    return this.f;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && this.f == ((b) obj).f;
                }

                public final int hashCode() {
                    return this.f.hashCode();
                }

                public final String toString() {
                    return "Loading(islandPart=" + this.f + ')';
                }
            }

            public a(IslandPart islandPart, String str) {
                super(islandPart, str);
                this.e = str;
            }

            @Override // com.vk.ecomm.cart.impl.cart.ui.items.CartItem.c, com.vk.ecomm.cart.impl.cart.ui.items.CartItem
            public final String b() {
                return this.e;
            }
        }

        /* compiled from: CartItem.kt */
        public static abstract class b extends c {
            public final String e;

            /* compiled from: CartItem.kt */
            public static final class a extends b {
                public final UserId f;
                public final IslandPart g;

                public a(UserId userId, IslandPart islandPart) {
                    super(islandPart, b4q.b(userId, "next_products_error_"));
                    this.f = userId;
                    this.g = islandPart;
                }

                @Override // com.vk.ecomm.cart.impl.cart.ui.items.CartItem.c, com.vk.ecomm.cart.impl.cart.ui.items.CartItem
                public final IslandPart a() {
                    return this.g;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.f, aVar.f) && this.g == aVar.g;
                }

                public final int hashCode() {
                    return this.g.hashCode() + (Long.hashCode(this.f.b) * 31);
                }

                public final String toString() {
                    return "Error(communityId=" + this.f + ", islandPart=" + this.g + ')';
                }
            }

            /* compiled from: CartItem.kt */
            /* renamed from: com.vk.ecomm.cart.impl.cart.ui.items.CartItem$c$b$b, reason: collision with other inner class name */
            public static final class C0921b extends b {
                public final int f;
                public final UserId g;
                public final IslandPart h;

                public C0921b(int i, UserId userId, IslandPart islandPart) {
                    super(islandPart, b4q.b(userId, "next_products_load_button_"));
                    this.f = i;
                    this.g = userId;
                    this.h = islandPart;
                }

                @Override // com.vk.ecomm.cart.impl.cart.ui.items.CartItem.c, com.vk.ecomm.cart.impl.cart.ui.items.CartItem
                public final IslandPart a() {
                    return this.h;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0921b)) {
                        return false;
                    }
                    C0921b c0921b = (C0921b) obj;
                    return this.f == c0921b.f && epx.f(this.g, c0921b.g) && this.h == c0921b.h;
                }

                public final int hashCode() {
                    return this.h.hashCode() + bh10.a(Integer.hashCode(this.f) * 31, 31, this.g.b);
                }

                public final String toString() {
                    return "LoadButton(nextProducts=" + this.f + ", communityId=" + this.g + ", islandPart=" + this.h + ')';
                }
            }

            /* compiled from: CartItem.kt */
            /* renamed from: com.vk.ecomm.cart.impl.cart.ui.items.CartItem$c$b$c, reason: collision with other inner class name */
            public static final class C0922c extends b {
                public final UserId f;
                public final IslandPart g;

                public C0922c(UserId userId, IslandPart islandPart) {
                    super(islandPart, b4q.b(userId, "next_products_loading_"));
                    this.f = userId;
                    this.g = islandPart;
                }

                @Override // com.vk.ecomm.cart.impl.cart.ui.items.CartItem.c, com.vk.ecomm.cart.impl.cart.ui.items.CartItem
                public final IslandPart a() {
                    return this.g;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0922c)) {
                        return false;
                    }
                    C0922c c0922c = (C0922c) obj;
                    return epx.f(this.f, c0922c.f) && this.g == c0922c.g;
                }

                public final int hashCode() {
                    return this.g.hashCode() + (Long.hashCode(this.f.b) * 31);
                }

                public final String toString() {
                    return "Loading(communityId=" + this.f + ", islandPart=" + this.g + ')';
                }
            }

            public b(IslandPart islandPart, String str) {
                super(islandPart, str);
                this.e = str;
            }

            @Override // com.vk.ecomm.cart.impl.cart.ui.items.CartItem.c, com.vk.ecomm.cart.impl.cart.ui.items.CartItem
            public final String b() {
                return this.e;
            }
        }

        public c(IslandPart islandPart, String str) {
            super(islandPart, str);
            this.c = islandPart;
            this.d = str;
        }

        @Override // com.vk.ecomm.cart.impl.cart.ui.items.CartItem
        public IslandPart a() {
            return this.c;
        }

        @Override // com.vk.ecomm.cart.impl.cart.ui.items.CartItem
        public String b() {
            return this.d;
        }
    }

    /* compiled from: CartItem.kt */
    public static final class d extends CartItem {
        public final a.C0919a c;
        public final boolean d;
        public final String e;
        public final Integer f;
        public final b g;
        public final a h;
        public final IslandPart i;

        /* compiled from: CartItem.kt */
        public static final class a {
            public final boolean a;
            public final InterfaceC0923a b;

            /* compiled from: CartItem.kt */
            /* renamed from: com.vk.ecomm.cart.impl.cart.ui.items.CartItem$d$a$a, reason: collision with other inner class name */
            public interface InterfaceC0923a {

                /* compiled from: CartItem.kt */
                /* renamed from: com.vk.ecomm.cart.impl.cart.ui.items.CartItem$d$a$a$a, reason: collision with other inner class name */
                public static final class C0924a implements InterfaceC0923a {
                    public final int a;
                    public final boolean b;
                    public final boolean c;

                    public C0924a(int i, boolean z, boolean z2) {
                        this.a = i;
                        this.b = z;
                        this.c = z2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0924a)) {
                            return false;
                        }
                        C0924a c0924a = (C0924a) obj;
                        return this.a == c0924a.a && this.b == c0924a.b && this.c == c0924a.c;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.c) + qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("Amount(current=");
                        sb.append(this.a);
                        sb.append(", isIncrementAllowed=");
                        sb.append(this.b);
                        sb.append(", isDecrementAllowed=");
                        return q0.a(sb, this.c, ')');
                    }
                }

                /* compiled from: CartItem.kt */
                /* renamed from: com.vk.ecomm.cart.impl.cart.ui.items.CartItem$d$a$a$b */
                public static final class b implements InterfaceC0923a {
                    public static final b a = new b();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof b);
                    }

                    public final int hashCode() {
                        return -866053244;
                    }

                    public final String toString() {
                        return "AnotherProduct";
                    }
                }

                /* compiled from: CartItem.kt */
                /* renamed from: com.vk.ecomm.cart.impl.cart.ui.items.CartItem$d$a$a$c */
                public static final class c implements InterfaceC0923a {
                    public static final c a = new c();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof c);
                    }

                    public final int hashCode() {
                        return -1358110664;
                    }

                    public final String toString() {
                        return "Unavailable";
                    }
                }
            }

            public a(boolean z, InterfaceC0923a interfaceC0923a) {
                this.a = z;
                this.b = interfaceC0923a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "Control(isFavourite=" + this.a + ", picker=" + this.b + ')';
            }
        }

        /* compiled from: CartItem.kt */
        public static final class b {
            public final tlo0 a;
            public final String b;
            public final String c;
            public final List d;

            /* compiled from: CartItem.kt */
            public static final class a {
                public final String a;
                public final String b;

                public a(String str, String str2) {
                    this.a = str;
                    this.b = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Property(title=");
                    sb.append(this.a);
                    sb.append(", value=");
                    return ho8.a(sb, this.b, ')');
                }
            }

            public b(tlo0 tlo0Var, String str, String str2, List list) {
                this.a = tlo0Var;
                this.b = str;
                this.c = str2;
                this.d = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                int a2 = urd0.a(this.a.hashCode() * 31, 31, this.b);
                String str = this.c;
                return this.d.hashCode() + ((a2 + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Primary(title=");
                sb.append(this.a);
                sb.append(", subtitle=");
                sb.append(this.b);
                sb.append(", oldPrice=");
                sb.append(this.c);
                sb.append(", properties=");
                return jr.a(')', sb, this.d);
            }
        }

        public d(a.C0919a c0919a, boolean z, String str, Integer num, b bVar, a aVar, IslandPart islandPart) {
            super(islandPart, "product_" + c0919a.b + '_' + c0919a.a);
            this.c = c0919a;
            this.d = z;
            this.e = str;
            this.f = num;
            this.g = bVar;
            this.h = aVar;
            this.i = islandPart;
        }

        @Override // com.vk.ecomm.cart.impl.cart.ui.items.CartItem
        public final IslandPart a() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.c, dVar.c) && this.d == dVar.d && epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f) && epx.f(this.g, dVar.g) && epx.f(this.h, dVar.h) && this.i == dVar.i;
        }

        public final int hashCode() {
            int a2 = urd0.a(qoy.b(this.c.hashCode() * 31, 31, this.d), 31, this.e);
            Integer num = this.f;
            return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((a2 + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Product(id=" + this.c + ", isAvailable=" + this.d + ", imageUrl=" + this.e + ", discount=" + this.f + ", primary=" + this.g + ", control=" + this.h + ", islandPart=" + this.i + ')';
        }
    }

    public CartItem(IslandPart islandPart, String str) {
        this.a = islandPart;
        this.b = str;
    }

    public IslandPart a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}
