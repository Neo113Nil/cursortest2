package com.vk.ecomm.design.compose.product_info;

import com.vk.dto.common.Image;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;

/* compiled from: MarketProductInfoBlockAction.kt */
/* loaded from: classes18.dex */
public interface f {

    /* compiled from: MarketProductInfoBlockAction.kt */
    public static final class a implements f {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 919320851;
        }

        public final String toString() {
            return "ClickFave";
        }
    }

    /* compiled from: MarketProductInfoBlockAction.kt */
    public static final class b implements f {
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
            return ho8.a(new StringBuilder("ClickLabel(id="), this.a, ')');
        }
    }

    /* compiled from: MarketProductInfoBlockAction.kt */
    public static final class c implements f {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 608383143;
        }

        public final String toString() {
            return "ClickPriceHint";
        }
    }

    /* compiled from: MarketProductInfoBlockAction.kt */
    public static final class d implements f {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -952427578;
        }

        public final String toString() {
            return "ClickRating";
        }
    }

    /* compiled from: MarketProductInfoBlockAction.kt */
    public static final class e implements f {
        public final List<Image> a;

        public e(List<Image> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("ClickReviewsPhotos(images="), this.a);
        }
    }

    /* compiled from: MarketProductInfoBlockAction.kt */
    /* renamed from: com.vk.ecomm.design.compose.product_info.f$f, reason: collision with other inner class name */
    public static final class C0935f implements f {
        public static final C0935f a = new C0935f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0935f);
        }

        public final int hashCode() {
            return -1854972939;
        }

        public final String toString() {
            return "RatingShown";
        }
    }
}
