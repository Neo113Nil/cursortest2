package com.vk.ecomm.design.view.tile;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.facebook.soloader.MinElf;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Image;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.aek;
import xsna.asp;
import xsna.clx0;
import xsna.e43;
import xsna.epx;
import xsna.fw3;
import xsna.gzs;
import xsna.i9r;
import xsna.iah0;
import xsna.iq6;
import xsna.l35;
import xsna.l9;
import xsna.qoy;
import xsna.s3q0;
import xsna.uw3;
import xsna.v7x;
import xsna.vp;
import xsna.wid0;
import xsna.wx0;
import xsna.zrp;

/* compiled from: MarketProductTileConfig.kt */
/* loaded from: classes18.dex */
public final class MarketProductTileConfig {
    public final d a;
    public final g b;
    public final h c;
    public final e d;
    public final f e;
    public final b f;
    public final c g;
    public final j h;
    public final i i;
    public final k j;
    public final List<wid0> k;
    public final a l;
    public final gzs<s3q0> m;
    public final gzs<s3q0> n;
    public final gzs<s3q0> o;

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
    public static final class ProductStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ProductStatus[] $VALUES;
        public static final ProductStatus Archive;
        public static final ProductStatus HardBlock;
        public static final ProductStatus Moderation;
        public static final ProductStatus Normal;
        public static final ProductStatus OutOfStock;
        public static final ProductStatus SoftBlock;

        static {
            ProductStatus productStatus = new ProductStatus("Normal", 0);
            Normal = productStatus;
            ProductStatus productStatus2 = new ProductStatus("OutOfStock", 1);
            OutOfStock = productStatus2;
            ProductStatus productStatus3 = new ProductStatus("Archive", 2);
            Archive = productStatus3;
            ProductStatus productStatus4 = new ProductStatus("SoftBlock", 3);
            SoftBlock = productStatus4;
            ProductStatus productStatus5 = new ProductStatus("HardBlock", 4);
            HardBlock = productStatus5;
            ProductStatus productStatus6 = new ProductStatus("Moderation", 5);
            Moderation = productStatus6;
            ProductStatus[] productStatusArr = {productStatus, productStatus2, productStatus3, productStatus4, productStatus5, productStatus6};
            $VALUES = productStatusArr;
            $ENTRIES = new asp(productStatusArr);
        }

        public ProductStatus() {
            throw null;
        }

        public static ProductStatus valueOf(String str) {
            return (ProductStatus) Enum.valueOf(ProductStatus.class, str);
        }

        public static ProductStatus[] values() {
            return (ProductStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public static final class a {
        public final VkButton.Mode a;
        public final VkButton.Appearance b;
        public final String c;
        public final Integer d;
        public final boolean e;
        public final DisplayCtaButtonType f;

        public a() {
            this(null, null, null, null, false, null, 63);
        }

        public static a a(a aVar, VkButton.Mode mode, VkButton.Appearance appearance, String str, Integer num, boolean z, int i) {
            if ((i & 1) != 0) {
                mode = aVar.a;
            }
            VkButton.Mode mode2 = mode;
            if ((i & 2) != 0) {
                appearance = aVar.b;
            }
            VkButton.Appearance appearance2 = appearance;
            if ((i & 4) != 0) {
                str = aVar.c;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                num = aVar.d;
            }
            Integer num2 = num;
            if ((i & 16) != 0) {
                z = aVar.e;
            }
            return new a(mode2, appearance2, str2, num2, z, aVar.f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f;
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.d;
            return this.f.hashCode() + qoy.b((hashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.e);
        }

        public final String toString() {
            return "CtaButton(mode=" + this.a + ", appearance=" + this.b + ", text=" + this.c + ", imageResId=" + this.d + ", isVisible=" + this.e + ", displayType=" + this.f + ')';
        }

        public a(VkButton.Mode mode, VkButton.Appearance appearance, String str, Integer num, boolean z, DisplayCtaButtonType displayCtaButtonType) {
            this.a = mode;
            this.b = appearance;
            this.c = str;
            this.d = num;
            this.e = z;
            this.f = displayCtaButtonType;
        }

        public /* synthetic */ a(VkButton.Mode mode, VkButton.Appearance appearance, String str, Integer num, boolean z, DisplayCtaButtonType displayCtaButtonType, int i) {
            this((i & 1) != 0 ? VkButton.Mode.Primary : mode, (i & 2) != 0 ? VkButton.Appearance.Accent : appearance, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? false : z, (i & 32) != 0 ? DisplayCtaButtonType.BOTTOM : displayCtaButtonType);
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;

        public b() {
            this(false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Favorite(isFavorite=");
            sb.append(this.a);
            sb.append(", isVisible=");
            return q0.a(sb, this.b, ')');
        }

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public static final class c {
        public final boolean a;
        public final boolean b;

        public c() {
            this(false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IsSelectedTag(isSelected=");
            sb.append(this.a);
            sb.append(", isVisible=");
            return q0.a(sb, this.b, ')');
        }

        public c(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public static final class d {
        public final Image a;
        public final String b;
        public final Integer c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public d() {
            this(null, false, 63);
        }

        public static d a(d dVar, int i) {
            Integer valueOf = Integer.valueOf(R.drawable.vk_icon_block_outline_56);
            Image image = (i & 1) != 0 ? dVar.a : null;
            String str = dVar.b;
            if ((i & 4) != 0) {
                valueOf = dVar.c;
            }
            Integer num = valueOf;
            boolean z = (i & 8) != 0 ? dVar.d : true;
            boolean z2 = (i & 16) != 0 ? dVar.e : true;
            boolean z3 = (i & 32) != 0 ? dVar.f : false;
            dVar.getClass();
            return new d(image, str, num, z, z2, z3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f;
        }

        public final int hashCode() {
            Image image = this.a;
            int hashCode = (image == null ? 0 : image.hashCode()) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.c;
            return Boolean.hashCode(this.f) + qoy.b(qoy.b((hashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MainImage(image=");
            sb.append(this.a);
            sb.append(", contentDescription=");
            sb.append(this.b);
            sb.append(", placeholderResId=");
            sb.append(this.c);
            sb.append(", isMuted=");
            sb.append(this.d);
            sb.append(", isRestricted=");
            sb.append(this.e);
            sb.append(", isVisible=");
            return q0.a(sb, this.f, ')');
        }

        public d(Image image, String str, Integer num, boolean z, boolean z2, boolean z3) {
            this.a = image;
            this.b = str;
            this.c = num;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }

        public /* synthetic */ d(Image image, boolean z, int i) {
            this((i & 1) != 0 ? null : image, null, (i & 4) != 0 ? null : Integer.valueOf(R.drawable.vk_icon_gallery_outline_56), false, (i & 16) != 0 ? false : z, (i & 32) == 0);
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public static final class e {
        public final String a;
        public final boolean b;
        public final ProductStatus c;
        public final boolean d;
        public final iq6 e;

        /* JADX WARN: Multi-variable type inference failed */
        public e() {
            this(null, false, 0 == true ? 1 : 0, 31);
        }

        public static e a(e eVar, String str, ProductStatus productStatus, int i) {
            if ((i & 1) != 0) {
                str = eVar.a;
            }
            String str2 = str;
            boolean z = (i & 2) != 0 ? eVar.b : true;
            if ((i & 4) != 0) {
                productStatus = eVar.c;
            }
            boolean z2 = eVar.d;
            iq6 iq6Var = eVar.e;
            eVar.getClass();
            return new e(str2, z, productStatus, z2, iq6Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && epx.f(this.e, eVar.e);
        }

        public final int hashCode() {
            String str = this.a;
            return this.e.hashCode() + qoy.b((this.c.hashCode() + qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31, 31, this.d);
        }

        public final String toString() {
            return "Name(text=" + this.a + ", isOwner=" + this.b + ", status=" + this.c + ", isVisible=" + this.d + ", customAppearance=" + this.e + ')';
        }

        public e(String str, boolean z, ProductStatus productStatus, boolean z2, iq6 iq6Var) {
            this.a = str;
            this.b = z;
            this.c = productStatus;
            this.d = z2;
            this.e = iq6Var;
        }

        public /* synthetic */ e(String str, boolean z, ProductStatus productStatus, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ProductStatus.Normal : productStatus, (i & 8) == 0, new iq6(null));
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public static final class f {
        public final String a;
        public final boolean b;
        public final boolean c;
        public final v7x d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public f() {
            this((String) null, r0, r0, 15);
            boolean z = false;
        }

        public static f a(f fVar, int i) {
            String str = (i & 1) != 0 ? fVar.a : "Длинное название магазина, такое, которое бы не вместилось на одну строку";
            boolean z = fVar.c;
            v7x v7xVar = fVar.d;
            fVar.getClass();
            return new f(str, true, z, v7xVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && this.b == fVar.b && this.c == fVar.c && epx.f(this.d, fVar.d);
        }

        public final int hashCode() {
            String str = this.a;
            return this.d.hashCode() + qoy.b(qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "Owner(name=" + this.a + ", isVerified=" + this.b + ", isVisible=" + this.c + ", customAppearance=" + this.d + ')';
        }

        public f(String str, boolean z, boolean z2, v7x v7xVar) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = v7xVar;
        }

        public /* synthetic */ f(String str, boolean z, boolean z2, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, new v7x((Object) null, 3));
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public static final class g {
        public final List<Image> a;
        public final boolean b;
        public final String c;
        public final Integer d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public g() {
            this(null, 127);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && this.b == gVar.b && epx.f(this.c, gVar.c) && epx.f(this.d, gVar.d) && this.e == gVar.e && this.f == gVar.f && this.g == gVar.g;
        }

        public final int hashCode() {
            List<Image> list = this.a;
            int b = qoy.b((list == null ? 0 : list.hashCode()) * 31, 31, this.b);
            String str = this.c;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.d;
            return Boolean.hashCode(this.g) + qoy.b(qoy.b((hashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PaginatedImages(images=");
            sb.append(this.a);
            sb.append(", shouldBeForcedDisablePagination=");
            sb.append(this.b);
            sb.append(", contentDescription=");
            sb.append(this.c);
            sb.append(", placeholderResId=");
            sb.append(this.d);
            sb.append(", isMuted=");
            sb.append(this.e);
            sb.append(", isRestricted=");
            sb.append(this.f);
            sb.append(", isVisible=");
            return q0.a(sb, this.g, ')');
        }

        public /* synthetic */ g(List list, int i) {
            this((i & 1) != 0 ? null : list, false, null, (i & 8) != 0 ? null : Integer.valueOf(R.drawable.vk_icon_gallery_outline_56), false, false, (i & 64) == 0);
        }

        public g(List<Image> list, boolean z, String str, Integer num, boolean z2, boolean z3, boolean z4) {
            this.a = list;
            this.b = z;
            this.c = str;
            this.d = num;
            this.e = z2;
            this.f = z3;
            this.g = z4;
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public static final class h {
        public final String a;
        public final String b;
        public final String c;
        public final ProductStatus d;
        public final boolean e;
        public final boolean f;
        public final i9r g;

        public h() {
            this(null, null, null, null, false, 127);
        }

        public static h a(h hVar, ProductStatus productStatus, int i) {
            String str = hVar.a;
            String str2 = (i & 2) != 0 ? hVar.b : "2 000 ₽";
            String str3 = hVar.c;
            if ((i & 8) != 0) {
                productStatus = hVar.d;
            }
            boolean z = hVar.e;
            boolean z2 = hVar.f;
            i9r i9rVar = hVar.g;
            hVar.getClass();
            return new h(str, str2, str3, productStatus, z, z2, i9rVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c) && this.d == hVar.d && this.e == hVar.e && this.f == hVar.f && epx.f(this.g, hVar.g);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return this.g.hashCode() + qoy.b(qoy.b((this.d.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31, 31, this.e), 31, this.f);
        }

        public final String toString() {
            return "Prices(price=" + this.a + ", oldPrice=" + this.b + ", loyaltyPrice=" + this.c + ", status=" + this.d + ", isOwner=" + this.e + ", isVisible=" + this.f + ", customAppearance=" + this.g + ')';
        }

        public h(String str, String str2, String str3, ProductStatus productStatus, boolean z, boolean z2, i9r i9rVar) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = productStatus;
            this.e = z;
            this.f = z2;
            this.g = i9rVar;
        }

        public /* synthetic */ h(String str, String str2, String str3, ProductStatus productStatus, boolean z, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ProductStatus.Normal : productStatus, (i & 16) != 0 ? false : z, (i & 32) == 0, new i9r(null, null));
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public static final class i {
        public final List<String> a;

        public i() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return vp.b(", isVisible=false)", new StringBuilder("Properties(propertyValues="), this.a);
        }

        public i(Object obj) {
            EmptyList emptyList = EmptyList.b;
            this.a = emptyList;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i = 0;
            for (Object obj2 : emptyList) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                String str = (String) obj2;
                boolean z = i == e43.h(this.a);
                spannableStringBuilder.append((CharSequence) str);
                if (!z) {
                    int a = iah0.a(2.25f);
                    Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
                    newSpannable.setSpan(new clx0(a), 0, 1, 0);
                    spannableStringBuilder.append((CharSequence) newSpannable);
                    spannableStringBuilder.append((CharSequence) "·");
                    int a2 = iah0.a(2.25f);
                    Spannable newSpannable2 = Spannable.Factory.getInstance().newSpannable(" ");
                    newSpannable2.setSpan(new clx0(a2), 0, 1, 0);
                    spannableStringBuilder.append((CharSequence) newSpannable2);
                }
                i = i2;
            }
            new SpannableString(spannableStringBuilder);
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public static final class j {
        public final Float a;
        public final String b;
        public final boolean c;
        public final aek d;

        /* JADX WARN: Multi-variable type inference failed */
        public j() {
            this((Float) null, (String) (0 == true ? 1 : 0), false, 15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.a, jVar.a) && epx.f(this.b, jVar.b) && this.c == jVar.c && epx.f(this.d, jVar.d);
        }

        public final int hashCode() {
            Float f = this.a;
            int hashCode = (f == null ? 0 : f.hashCode()) * 31;
            String str = this.b;
            return this.d.hashCode() + qoy.b((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.c);
        }

        public final String toString() {
            return "Rating(rating=" + this.a + ", reviewCountText=" + this.b + ", isVisible=" + this.c + ", customAppearance=" + this.d + ')';
        }

        public j(Float f, String str, boolean z, aek aekVar) {
            this.a = f;
            this.b = str;
            this.c = z;
            this.d = aekVar;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ j(Float f, String str, boolean z, int i) {
            this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, new aek(r1, r1, r1));
            Comparable comparable = null;
        }
    }

    /* compiled from: MarketProductTileConfig.kt */
    public static final class k {
        public final String a;
        public final boolean b;

        public k() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.a, kVar.a) && this.b == kVar.b;
        }

        public final int hashCode() {
            String str = this.a;
            return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StatusBadge(text=");
            sb.append(this.a);
            sb.append(", isVisible=");
            return q0.a(sb, this.b, ')');
        }

        public /* synthetic */ k(int i) {
            this(null, false);
        }

        public k(String str, boolean z) {
            this.a = str;
            this.b = z;
        }
    }

    public MarketProductTileConfig() {
        this((d) null, (g) null, (h) null, (e) null, (f) null, (b) null, (c) null, (j) null, (k) null, (List) null, (a) null, (com.vk.catalog2.common.ui.holders.b) null, (com.vk.voip.a) null, (wx0) null, MinElf.PN_XNUM);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MarketProductTileConfig a(MarketProductTileConfig marketProductTileConfig, d dVar, g gVar, h hVar, e eVar, f fVar, b bVar, c cVar, k kVar, List list, a aVar, l9 l9Var, uw3 uw3Var, l35 l35Var, int i2) {
        return new MarketProductTileConfig((i2 & 1) != 0 ? marketProductTileConfig.a : dVar, (i2 & 2) != 0 ? marketProductTileConfig.b : gVar, (i2 & 4) != 0 ? marketProductTileConfig.c : hVar, (i2 & 8) != 0 ? marketProductTileConfig.d : eVar, (i2 & 16) != 0 ? marketProductTileConfig.e : fVar, (i2 & 32) != 0 ? marketProductTileConfig.f : bVar, (i2 & 64) != 0 ? marketProductTileConfig.g : cVar, marketProductTileConfig.h, marketProductTileConfig.i, (i2 & 512) != 0 ? marketProductTileConfig.j : kVar, (i2 & 1024) != 0 ? marketProductTileConfig.k : list, (i2 & 2048) != 0 ? marketProductTileConfig.l : aVar, (i2 & 4096) != 0 ? marketProductTileConfig.m : l9Var, (i2 & 8192) != 0 ? marketProductTileConfig.n : uw3Var, (i2 & 16384) != 0 ? marketProductTileConfig.o : l35Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketProductTileConfig)) {
            return false;
        }
        MarketProductTileConfig marketProductTileConfig = (MarketProductTileConfig) obj;
        return epx.f(this.a, marketProductTileConfig.a) && epx.f(this.b, marketProductTileConfig.b) && epx.f(this.c, marketProductTileConfig.c) && epx.f(this.d, marketProductTileConfig.d) && epx.f(this.e, marketProductTileConfig.e) && epx.f(this.f, marketProductTileConfig.f) && epx.f(this.g, marketProductTileConfig.g) && epx.f(this.h, marketProductTileConfig.h) && epx.f(this.i, marketProductTileConfig.i) && epx.f(this.j, marketProductTileConfig.j) && epx.f(this.k, marketProductTileConfig.k) && epx.f(this.l, marketProductTileConfig.l) && epx.f(this.m, marketProductTileConfig.m) && epx.f(this.n, marketProductTileConfig.n) && epx.f(this.o, marketProductTileConfig.o);
    }

    public final int hashCode() {
        int hashCode = (this.l.hashCode() + fw3.a((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.k)) * 31;
        gzs<s3q0> gzsVar = this.m;
        int hashCode2 = (hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
        gzs<s3q0> gzsVar2 = this.n;
        int hashCode3 = (hashCode2 + (gzsVar2 == null ? 0 : gzsVar2.hashCode())) * 31;
        gzs<s3q0> gzsVar3 = this.o;
        return (hashCode3 + (gzsVar3 != null ? gzsVar3.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "MarketProductTileConfig(mainImage=" + this.a + ", paginatedImages=" + this.b + ", prices=" + this.c + ", name=" + this.d + ", owner=" + this.e + ", favorite=" + this.f + ", isSelectedTag=" + this.g + ", rating=" + this.h + ", properties=" + this.i + ", statusBadge=" + this.j + ", infoBadge=" + this.k + ", ctaButton=" + this.l + ", tileClickHandler=" + this.m + ", favoriteClickHandler=" + this.n + ", ctaButtonClickHandler=" + this.o + ", tileSelectedPageHandler=null)";
    }

    public MarketProductTileConfig(d dVar, g gVar, h hVar, e eVar, f fVar, b bVar, c cVar, j jVar, i iVar, k kVar, List list, a aVar, gzs gzsVar, gzs gzsVar2, gzs gzsVar3) {
        this.a = dVar;
        this.b = gVar;
        this.c = hVar;
        this.d = eVar;
        this.e = fVar;
        this.f = bVar;
        this.g = cVar;
        this.h = jVar;
        this.i = iVar;
        this.j = kVar;
        this.k = list;
        this.l = aVar;
        this.m = gzsVar;
        this.n = gzsVar2;
        this.o = gzsVar3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MarketProductTileConfig(d dVar, g gVar, h hVar, e eVar, f fVar, b bVar, c cVar, j jVar, k kVar, List list, a aVar, com.vk.catalog2.common.ui.holders.b bVar2, com.vk.voip.a aVar2, wx0 wx0Var, int i2) {
        this(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, (i2 & 1024) != 0 ? EmptyList.b : list, (i2 & 2048) != 0 ? new a(null, null, null, null, false, null, 63) : aVar, (i2 & 4096) != 0 ? null : bVar2, (i2 & 8192) != 0 ? null : aVar2, (i2 & 16384) != 0 ? null : wx0Var);
        g gVar2;
        e eVar2;
        f fVar2;
        j jVar2;
        k kVar2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        d dVar2 = (i2 & 1) != 0 ? new d(null, false, 63) : dVar;
        if ((i2 & 2) != 0) {
            gVar2 = new g(objArr11 == true ? 1 : 0, 127);
        } else {
            gVar2 = gVar;
        }
        h hVar2 = (i2 & 4) != 0 ? new h(null, null, null, null, false, 127) : hVar;
        if ((i2 & 8) != 0) {
            eVar2 = new e(objArr10 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr9 == true ? 1 : 0, 31);
        } else {
            eVar2 = eVar;
        }
        int i3 = 15;
        if ((i2 & 16) != 0) {
            fVar2 = new f((String) (objArr8 == true ? 1 : 0), (boolean) (objArr4 == true ? 1 : 0), (boolean) (objArr3 == true ? 1 : 0), i3);
        } else {
            fVar2 = fVar;
        }
        b bVar3 = (i2 & 32) != 0 ? new b(false, false) : bVar;
        c cVar2 = (i2 & 64) != 0 ? new c(false, false) : cVar;
        if ((i2 & 128) != 0) {
            jVar2 = new j((Float) (objArr7 == true ? 1 : 0), (String) (objArr6 == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0), i3);
        } else {
            jVar2 = jVar;
        }
        i iVar = new i(null);
        if ((i2 & 512) != 0) {
            kVar2 = new k(objArr == true ? 1 : 0);
        } else {
            kVar2 = kVar;
        }
    }
}
