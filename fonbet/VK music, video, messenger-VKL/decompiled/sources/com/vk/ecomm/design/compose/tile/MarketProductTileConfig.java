package com.vk.ecomm.design.compose.tile;

import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import xsna.air;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.jr;
import xsna.ozl;
import xsna.qoy;
import xsna.tq;
import xsna.urd0;
import xsna.vby;
import xsna.wow;
import xsna.zrp;

/* compiled from: MarketProductTileConfig.kt */
/* loaded from: classes18.dex */
public final class MarketProductTileConfig {
    public final String a;
    public final ViewerType b;
    public final ProductStatusType c;
    public final DisplayCtaButtonType d;
    public final boolean e;
    public final List f;
    public final h g;
    public final boolean h;
    public final e i;
    public final String j;
    public final c k;
    public final i l;
    public final g m;
    public final HoldDescriptionSecondLineType n;
    public final a o;
    public final b p;
    public final List q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketProductTileConfig.kt */
    public static final class CtaButtonType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CtaButtonType[] $VALUES;
        public static final CtaButtonType Booking;
        public static final CtaButtonType Call;
        public static final CtaButtonType InCart;
        public static final CtaButtonType PartnerLink;
        public static final CtaButtonType Similar;
        public static final CtaButtonType ToCart;
        public static final CtaButtonType ToShop;
        public static final CtaButtonType Write;

        static {
            CtaButtonType ctaButtonType = new CtaButtonType("ToCart", 0);
            ToCart = ctaButtonType;
            CtaButtonType ctaButtonType2 = new CtaButtonType("InCart", 1);
            InCart = ctaButtonType2;
            CtaButtonType ctaButtonType3 = new CtaButtonType("Similar", 2);
            Similar = ctaButtonType3;
            CtaButtonType ctaButtonType4 = new CtaButtonType("Write", 3);
            Write = ctaButtonType4;
            CtaButtonType ctaButtonType5 = new CtaButtonType("ToShop", 4);
            ToShop = ctaButtonType5;
            CtaButtonType ctaButtonType6 = new CtaButtonType("PartnerLink", 5);
            PartnerLink = ctaButtonType6;
            CtaButtonType ctaButtonType7 = new CtaButtonType("Call", 6);
            Call = ctaButtonType7;
            CtaButtonType ctaButtonType8 = new CtaButtonType("Booking", 7);
            Booking = ctaButtonType8;
            CtaButtonType[] ctaButtonTypeArr = {ctaButtonType, ctaButtonType2, ctaButtonType3, ctaButtonType4, ctaButtonType5, ctaButtonType6, ctaButtonType7, ctaButtonType8};
            $VALUES = ctaButtonTypeArr;
            $ENTRIES = new asp(ctaButtonTypeArr);
        }

        public CtaButtonType() {
            throw null;
        }

        public static CtaButtonType valueOf(String str) {
            return (CtaButtonType) Enum.valueOf(CtaButtonType.class, str);
        }

        public static CtaButtonType[] values() {
            return (CtaButtonType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketProductTileConfig.kt */
    public static final class DisplayCtaButtonType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DisplayCtaButtonType[] $VALUES;
        public static final DisplayCtaButtonType ABOVE_IMAGE;
        public static final DisplayCtaButtonType BOTTOM;

        static {
            DisplayCtaButtonType displayCtaButtonType = new DisplayCtaButtonType("BOTTOM", 0);
            BOTTOM = displayCtaButtonType;
            DisplayCtaButtonType displayCtaButtonType2 = new DisplayCtaButtonType("ABOVE_IMAGE", 1);
            ABOVE_IMAGE = displayCtaButtonType2;
            DisplayCtaButtonType[] displayCtaButtonTypeArr = {displayCtaButtonType, displayCtaButtonType2};
            $VALUES = displayCtaButtonTypeArr;
            $ENTRIES = new asp(displayCtaButtonTypeArr);
        }

        public DisplayCtaButtonType() {
            throw null;
        }

        public static DisplayCtaButtonType valueOf(String str) {
            return (DisplayCtaButtonType) Enum.valueOf(DisplayCtaButtonType.class, str);
        }

        public static DisplayCtaButtonType[] values() {
            return (DisplayCtaButtonType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketProductTileConfig.kt */
    public static final class HoldDescriptionSecondLineType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HoldDescriptionSecondLineType[] $VALUES;
        public static final HoldDescriptionSecondLineType None;
        public static final HoldDescriptionSecondLineType Rating;

        static {
            HoldDescriptionSecondLineType holdDescriptionSecondLineType = new HoldDescriptionSecondLineType("None", 0);
            None = holdDescriptionSecondLineType;
            HoldDescriptionSecondLineType holdDescriptionSecondLineType2 = new HoldDescriptionSecondLineType("Rating", 1);
            Rating = holdDescriptionSecondLineType2;
            HoldDescriptionSecondLineType[] holdDescriptionSecondLineTypeArr = {holdDescriptionSecondLineType, holdDescriptionSecondLineType2};
            $VALUES = holdDescriptionSecondLineTypeArr;
            $ENTRIES = new asp(holdDescriptionSecondLineTypeArr);
        }

        public HoldDescriptionSecondLineType() {
            throw null;
        }

        public static HoldDescriptionSecondLineType valueOf(String str) {
            return (HoldDescriptionSecondLineType) Enum.valueOf(HoldDescriptionSecondLineType.class, str);
        }

        public static HoldDescriptionSecondLineType[] values() {
            return (HoldDescriptionSecondLineType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketProductTileConfig.kt */
    public static final class ProductStatusType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ProductStatusType[] $VALUES;
        public static final ProductStatusType Archive;
        public static final ProductStatusType HardBlock;
        public static final ProductStatusType Moderation;
        public static final ProductStatusType Normal;
        public static final ProductStatusType OutOfStock;
        public static final ProductStatusType SoftBlock;

        static {
            ProductStatusType productStatusType = new ProductStatusType("Normal", 0);
            Normal = productStatusType;
            ProductStatusType productStatusType2 = new ProductStatusType("OutOfStock", 1);
            OutOfStock = productStatusType2;
            ProductStatusType productStatusType3 = new ProductStatusType("Archive", 2);
            Archive = productStatusType3;
            ProductStatusType productStatusType4 = new ProductStatusType("SoftBlock", 3);
            SoftBlock = productStatusType4;
            ProductStatusType productStatusType5 = new ProductStatusType("HardBlock", 4);
            HardBlock = productStatusType5;
            ProductStatusType productStatusType6 = new ProductStatusType("Moderation", 5);
            Moderation = productStatusType6;
            ProductStatusType[] productStatusTypeArr = {productStatusType, productStatusType2, productStatusType3, productStatusType4, productStatusType5, productStatusType6};
            $VALUES = productStatusTypeArr;
            $ENTRIES = new asp(productStatusTypeArr);
        }

        public ProductStatusType() {
            throw null;
        }

        public static ProductStatusType valueOf(String str) {
            return (ProductStatusType) Enum.valueOf(ProductStatusType.class, str);
        }

        public static ProductStatusType[] values() {
            return (ProductStatusType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketProductTileConfig.kt */
    public static final class ViewerType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ViewerType[] $VALUES;
        public static final ViewerType Bayer;
        public static final ViewerType Seller;

        static {
            ViewerType viewerType = new ViewerType("Bayer", 0);
            Bayer = viewerType;
            ViewerType viewerType2 = new ViewerType("Seller", 1);
            Seller = viewerType2;
            ViewerType[] viewerTypeArr = {viewerType, viewerType2};
            $VALUES = viewerTypeArr;
            $ENTRIES = new asp(viewerTypeArr);
        }

        public ViewerType() {
            throw null;
        }

        public static ViewerType valueOf(String str) {
            return (ViewerType) Enum.valueOf(ViewerType.class, str);
        }

        public static ViewerType[] values() {
            return (ViewerType[]) $VALUES.clone();
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public static final class a {
        public final List a;

        public a(List list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return jr.a(')', new StringBuilder("BadgesState(badges="), this.a);
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public static final class b {
        public final CtaButtonType a;
        public final String b;
        public final boolean c;

        public b(CtaButtonType ctaButtonType, String str, boolean z) {
            this.a = ctaButtonType;
            this.b = str;
            this.c = z;
        }

        public static b a(b bVar, CtaButtonType ctaButtonType, String str, int i) {
            if ((i & 1) != 0) {
                ctaButtonType = bVar.a;
            }
            if ((i & 2) != 0) {
                str = bVar.b;
            }
            boolean z = (i & 4) != 0 ? bVar.c : false;
            bVar.getClass();
            return new b(ctaButtonType, str, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CtaButton(buttonType=");
            sb.append(this.a);
            sb.append(", text=");
            sb.append(this.b);
            sb.append(", isEnabled=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public static final class c {
        public final String a;
        public final d b;

        public c(String str, d dVar) {
            this.a = str;
            this.b = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            d dVar = this.b;
            return hashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public final String toString() {
            return "Owner(owner=" + this.a + ", ownerType=" + this.b + ')';
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public interface d {

        /* compiled from: MarketProductTileConfig.kt */
        public static final class a implements d {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -820414031;
            }

            public final String toString() {
                return "Verified";
            }
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public static final class e {
        public final String a;
        public final String b;
        public final String c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public e() {
            this(r0, r0, 7);
            String str = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Prices(price=");
            sb.append(this.a);
            sb.append(", oldPrice=");
            sb.append(this.b);
            sb.append(", loyaltyPrice=");
            return ho8.a(sb, this.c, ')');
        }

        public /* synthetic */ e(String str, String str2, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (String) null);
        }

        public e(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    @vby
    public static final class f {
        public final String a;

        public static String a(String str) {
            return air.b(')', "ProductTileItemUid(uid=", str);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof f) {
                return epx.f(this.a, ((f) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return a(this.a);
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public static final class g {
        public final float a;
        public final String b;

        public g(float f, String str) {
            this.a = f;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Float.compare(this.a, gVar.a) == 0 && epx.f(this.b, gVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Rating(rating=");
            sb.append(this.a);
            sb.append(", reviewCountText=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public interface h {

        /* compiled from: MarketProductTileConfig.kt */
        public static final class a implements h {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -558412694;
            }

            public final String toString() {
                return "ByStatusOfProduct";
            }
        }

        /* compiled from: MarketProductTileConfig.kt */
        public static final class b implements h {
            public final String a;

            public b(String str) {
                this.a = str;
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
                return ho8.a(new StringBuilder("CustomTextStatusBadge(text="), this.a, ')');
            }
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public interface i {

        /* compiled from: MarketProductTileConfig.kt */
        public static final class a implements i {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1397978757;
            }

            public final String toString() {
                return "CloseActionState";
            }
        }

        /* compiled from: MarketProductTileConfig.kt */
        public static final class b implements i {
            public final boolean a;

            public b() {
                this(false);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return q0.a(new StringBuilder("Favorite(isFavorite="), this.a, ')');
            }

            public b(boolean z) {
                this.a = z;
            }
        }

        /* compiled from: MarketProductTileConfig.kt */
        public static final class c implements i {
            public final boolean a;

            public c() {
                this(false);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return q0.a(new StringBuilder("PickerState(isSelected="), this.a, ')');
            }

            public c(boolean z) {
                this.a = z;
            }
        }
    }

    @ozl
    public MarketProductTileConfig(String str, ViewerType viewerType, ProductStatusType productStatusType, DisplayCtaButtonType displayCtaButtonType, boolean z, List list, h hVar, boolean z2, e eVar, String str2, c cVar, i iVar, g gVar, HoldDescriptionSecondLineType holdDescriptionSecondLineType, a aVar, b bVar, List list2) {
        this.a = str;
        this.b = viewerType;
        this.c = productStatusType;
        this.d = displayCtaButtonType;
        this.e = z;
        this.f = list;
        this.g = hVar;
        this.h = z2;
        this.i = eVar;
        this.j = str2;
        this.k = cVar;
        this.l = iVar;
        this.m = gVar;
        this.n = holdDescriptionSecondLineType;
        this.o = aVar;
        this.p = bVar;
        this.q = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.vk.ecomm.design.compose.tile.MarketProductTileConfig$h] */
    public static MarketProductTileConfig a(MarketProductTileConfig marketProductTileConfig, String str, ViewerType viewerType, ProductStatusType productStatusType, DisplayCtaButtonType displayCtaButtonType, boolean z, List list, h.b bVar, boolean z2, e eVar, c cVar, i iVar, g gVar, HoldDescriptionSecondLineType holdDescriptionSecondLineType, a aVar, b bVar2, int i2) {
        String str2 = (i2 & 1) != 0 ? marketProductTileConfig.a : str;
        ViewerType viewerType2 = (i2 & 2) != 0 ? marketProductTileConfig.b : viewerType;
        ProductStatusType productStatusType2 = (i2 & 4) != 0 ? marketProductTileConfig.c : productStatusType;
        DisplayCtaButtonType displayCtaButtonType2 = (i2 & 8) != 0 ? marketProductTileConfig.d : displayCtaButtonType;
        boolean z3 = (i2 & 16) != 0 ? marketProductTileConfig.e : z;
        List list2 = (i2 & 32) != 0 ? marketProductTileConfig.f : list;
        h.b bVar3 = (i2 & 64) != 0 ? marketProductTileConfig.g : bVar;
        boolean z4 = (i2 & 128) != 0 ? marketProductTileConfig.h : z2;
        e eVar2 = (i2 & 256) != 0 ? marketProductTileConfig.i : eVar;
        String str3 = marketProductTileConfig.j;
        c cVar2 = (i2 & 1024) != 0 ? marketProductTileConfig.k : cVar;
        i iVar2 = (i2 & 2048) != 0 ? marketProductTileConfig.l : iVar;
        g gVar2 = (i2 & 4096) != 0 ? marketProductTileConfig.m : gVar;
        HoldDescriptionSecondLineType holdDescriptionSecondLineType2 = (i2 & 8192) != 0 ? marketProductTileConfig.n : holdDescriptionSecondLineType;
        a aVar2 = (i2 & 16384) != 0 ? marketProductTileConfig.o : aVar;
        b bVar4 = (i2 & 32768) != 0 ? marketProductTileConfig.p : bVar2;
        List list3 = marketProductTileConfig.q;
        marketProductTileConfig.getClass();
        return new MarketProductTileConfig(str2, viewerType2, productStatusType2, displayCtaButtonType2, z3, list2, bVar3, z4, eVar2, str3, cVar2, iVar2, gVar2, holdDescriptionSecondLineType2, aVar2, bVar4, list3);
    }

    public final boolean equals(Object obj) {
        boolean f2;
        boolean f3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketProductTileConfig)) {
            return false;
        }
        MarketProductTileConfig marketProductTileConfig = (MarketProductTileConfig) obj;
        if (!epx.f(this.a, marketProductTileConfig.a) || this.b != marketProductTileConfig.b || this.c != marketProductTileConfig.c || this.d != marketProductTileConfig.d || this.e != marketProductTileConfig.e) {
            return false;
        }
        List list = marketProductTileConfig.f;
        List list2 = this.f;
        if (list2 == null) {
            if (list == null) {
                f2 = true;
            }
            f2 = false;
        } else {
            if (list != null) {
                f2 = epx.f(list2, list);
            }
            f2 = false;
        }
        if (!f2 || !epx.f(this.g, marketProductTileConfig.g) || this.h != marketProductTileConfig.h || !epx.f(this.i, marketProductTileConfig.i) || !epx.f(this.j, marketProductTileConfig.j) || !epx.f(this.k, marketProductTileConfig.k) || !epx.f(this.l, marketProductTileConfig.l) || !epx.f(this.m, marketProductTileConfig.m) || this.n != marketProductTileConfig.n || !epx.f(this.o, marketProductTileConfig.o) || !epx.f(this.p, marketProductTileConfig.p)) {
            return false;
        }
        List list3 = marketProductTileConfig.q;
        List list4 = this.q;
        if (list4 == null) {
            if (list3 == null) {
                f3 = true;
            }
            f3 = false;
        } else {
            if (list3 != null) {
                f3 = epx.f(list4, list3);
            }
            f3 = false;
        }
        return f3;
    }

    public final int hashCode() {
        int b2 = qoy.b((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
        List list = this.f;
        int b3 = qoy.b((this.g.hashCode() + ((b2 + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.h);
        e eVar = this.i;
        int hashCode = (b3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.k;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        i iVar = this.l;
        int hashCode4 = (hashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        g gVar = this.m;
        int hashCode5 = (this.n.hashCode() + ((hashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31)) * 31;
        a aVar = this.o;
        int hashCode6 = (hashCode5 + (aVar == null ? 0 : aVar.a.hashCode())) * 31;
        b bVar = this.p;
        int hashCode7 = (hashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List list2 = this.q;
        return hashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketProductTileConfig(uid=");
        sb.append((Object) f.a(this.a));
        sb.append(", viewerType=");
        sb.append(this.b);
        sb.append(", productStatusType=");
        sb.append(this.c);
        sb.append(", displayCtaButtonType=");
        sb.append(this.d);
        sb.append(", displayCtaButtonRowSpacer=");
        sb.append(this.e);
        sb.append(", mainImages=");
        List list = this.f;
        sb.append((Object) (list == null ? "null" : wow.c(list)));
        sb.append(", statusBadge=");
        sb.append(this.g);
        sb.append(", isRestricted=");
        sb.append(this.h);
        sb.append(", prices=");
        sb.append(this.i);
        sb.append(", name=");
        sb.append(this.j);
        sb.append(", owner=");
        sb.append(this.k);
        sb.append(", topRightActionState=");
        sb.append(this.l);
        sb.append(", rating=");
        sb.append(this.m);
        sb.append(", holdSecondDescriptionLine=");
        sb.append(this.n);
        sb.append(", badges=");
        sb.append(this.o);
        sb.append(", ctaButton=");
        sb.append(this.p);
        sb.append(", properties=");
        List list2 = this.q;
        return tq.f(sb, list2 != null ? wow.c(list2) : "null", ')');
    }

    public /* synthetic */ MarketProductTileConfig(String str, ViewerType viewerType, ProductStatusType productStatusType, DisplayCtaButtonType displayCtaButtonType, List list, h hVar, boolean z, e eVar, String str2, c cVar, i.b bVar, g gVar, a aVar, b bVar2, ArrayList arrayList, int i2) {
        this(str, viewerType, productStatusType, (i2 & 8) != 0 ? DisplayCtaButtonType.BOTTOM : displayCtaButtonType, false, list, (i2 & 64) != 0 ? h.a.a : hVar, (i2 & 128) != 0 ? false : z, eVar, str2, (i2 & 1024) != 0 ? null : cVar, (i2 & 2048) != 0 ? null : bVar, (i2 & 4096) != 0 ? null : gVar, HoldDescriptionSecondLineType.None, (i2 & 16384) != 0 ? null : aVar, (32768 & i2) != 0 ? null : bVar2, (i2 & 65536) != 0 ? null : arrayList);
    }
}
