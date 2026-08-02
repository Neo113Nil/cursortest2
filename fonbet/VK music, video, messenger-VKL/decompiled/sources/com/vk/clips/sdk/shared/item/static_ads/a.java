package com.vk.clips.sdk.shared.item.static_ads;

import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkActionLink;
import xsna.epx;
import xsna.ho8;
import xsna.ixp0;
import xsna.kj50;
import xsna.urd0;
import xsna.vu5;
import xsna.wih0;

/* compiled from: StaticAdsItemAction.kt */
/* loaded from: classes17.dex */
public interface a extends kj50 {

    /* compiled from: StaticAdsItemAction.kt */
    /* renamed from: com.vk.clips.sdk.shared.item.static_ads.a$a, reason: collision with other inner class name */
    public interface InterfaceC0687a extends a {

        /* compiled from: StaticAdsItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.static_ads.a$a$a, reason: collision with other inner class name */
        public static final class C0688a implements InterfaceC0687a {
            public final ImageUrl b;
            public final wih0.d.a c;
            public final SdkActionLink d;
            public final String e;
            public final ixp0 f;
            public final String g;
            public final String h;

            public C0688a(ImageUrl imageUrl, wih0.d.a aVar, SdkActionLink sdkActionLink, String str, ixp0 ixp0Var, String str2, String str3) {
                this.b = imageUrl;
                this.c = aVar;
                this.d = sdkActionLink;
                this.e = str;
                this.f = ixp0Var;
                this.g = str2;
                this.h = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0688a)) {
                    return false;
                }
                C0688a c0688a = (C0688a) obj;
                return epx.f(this.b, c0688a.b) && epx.f(this.c, c0688a.c) && epx.f(this.d, c0688a.d) && epx.f(this.e, c0688a.e) && epx.f(this.f, c0688a.f) && epx.f(this.g, c0688a.g) && epx.f(this.h, c0688a.h);
            }

            public final int hashCode() {
                int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
                SdkActionLink sdkActionLink = this.d;
                int a = urd0.a((this.f.hashCode() + urd0.a((hashCode + (sdkActionLink == null ? 0 : sdkActionLink.hashCode())) * 31, 31, this.e)) * 31, 31, this.g);
                String str = this.h;
                return a + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Bind(image=");
                sb.append(this.b);
                sb.append(", adInfo=");
                sb.append(this.c);
                sb.append(", actionLink=");
                sb.append(this.d);
                sb.append(", description=");
                sb.append(this.e);
                sb.append(", uiVisibilityConfig=");
                sb.append(this.f);
                sb.append(", itemUniqueKey=");
                sb.append(this.g);
                sb.append(", trackCode=");
                return ho8.a(sb, this.h, ')');
            }
        }

        /* compiled from: StaticAdsItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.static_ads.a$a$b */
        public static final class b implements InterfaceC0687a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 292610036;
            }

            public final String toString() {
                return "Unbind";
            }
        }
    }

    /* compiled from: StaticAdsItemAction.kt */
    public interface b extends a {

        /* compiled from: StaticAdsItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.static_ads.a$b$a, reason: collision with other inner class name */
        public static final class C0689a implements b {
            public static final C0689a b = new C0689a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0689a);
            }

            public final int hashCode() {
                return -1943863349;
            }

            public final String toString() {
                return "HandleCollapseClicked";
            }
        }

        /* compiled from: StaticAdsItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.static_ads.a$b$b, reason: collision with other inner class name */
        public static final class C0690b implements b {
            public static final C0690b b = new C0690b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0690b);
            }

            public final int hashCode() {
                return -288137090;
            }

            public final String toString() {
                return "HandleExpandClicked";
            }
        }

        /* compiled from: StaticAdsItemAction.kt */
        public static final class c implements b {
            public final String b;

            public c(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("HandleHashtagClicked(hashtag="), this.b, ')');
            }
        }
    }

    /* compiled from: StaticAdsItemAction.kt */
    public interface c extends a {

        /* compiled from: StaticAdsItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.static_ads.a$c$a, reason: collision with other inner class name */
        public static final class C0691a implements c {
            public static final C0691a b = new C0691a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0691a);
            }

            public final int hashCode() {
                return -888491835;
            }

            public final String toString() {
                return "HandleLongPress";
            }
        }

        /* compiled from: StaticAdsItemAction.kt */
        public static final class b implements c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1797723097;
            }

            public final String toString() {
                return "HandleSingleTap";
            }
        }
    }

    /* compiled from: StaticAdsItemAction.kt */
    public static final class d implements a {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1764337850;
        }

        public final String toString() {
            return "HandleAdvertisementViewClicked";
        }
    }

    /* compiled from: StaticAdsItemAction.kt */
    public interface e extends a {

        /* compiled from: StaticAdsItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.static_ads.a$e$a, reason: collision with other inner class name */
        public static final class C0692a implements e {
            public final long b;

            public C0692a(long j) {
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0692a) && this.b == ((C0692a) obj).b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("Successfully(timestamp="));
            }
        }

        /* compiled from: StaticAdsItemAction.kt */
        public static final class b implements e {
            public static final b b = new b();
        }
    }

    /* compiled from: StaticAdsItemAction.kt */
    public interface f extends a {

        /* compiled from: StaticAdsItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.static_ads.a$f$a, reason: collision with other inner class name */
        public static final class C0693a implements f {
            public final long b;

            public C0693a(long j) {
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0693a) && this.b == ((C0693a) obj).b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("Focused(timestamp="));
            }
        }

        /* compiled from: StaticAdsItemAction.kt */
        public static final class b implements f {
            public static final b b = new b();
        }
    }

    /* compiled from: StaticAdsItemAction.kt */
    public static final class g implements a {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1813893749;
        }

        public final String toString() {
            return "HandleLinkCommunityWithSubscribeClicked";
        }
    }

    /* compiled from: StaticAdsItemAction.kt */
    public static final class h implements a {
        public final ixp0 b;

        public h(ixp0 ixp0Var) {
            this.b = ixp0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "HandleOnUIVisibilityConfigChanged(config=" + this.b + ')';
        }
    }

    /* compiled from: StaticAdsItemAction.kt */
    public static final class i implements a {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 210402380;
        }

        public final String toString() {
            return "HandleOwnerViewClicked";
        }
    }

    /* compiled from: StaticAdsItemAction.kt */
    public static final class j implements a {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1506538169;
        }

        public final String toString() {
            return "HandleUnsubscribeBottomSheetConfirmClicked";
        }
    }

    /* compiled from: StaticAdsItemAction.kt */
    public static final class k implements a {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -2014199057;
        }

        public final String toString() {
            return "Initial";
        }
    }

    /* compiled from: StaticAdsItemAction.kt */
    public interface l extends a {

        /* compiled from: StaticAdsItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.static_ads.a$l$a, reason: collision with other inner class name */
        public static final class C0694a implements l {
            public static final C0694a b = new C0694a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0694a);
            }

            public final int hashCode() {
                return 600942178;
            }

            public final String toString() {
                return "HandleSubscribeClicked";
            }
        }

        /* compiled from: StaticAdsItemAction.kt */
        public static final class b implements l {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -922337861;
            }

            public final String toString() {
                return "HandleUnsubscribeClicked";
            }
        }
    }

    /* compiled from: StaticAdsItemAction.kt */
    public interface m extends a {

        /* compiled from: StaticAdsItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.static_ads.a$m$a, reason: collision with other inner class name */
        public static final class C0695a implements m {
            public static final C0695a b = new C0695a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0695a);
            }

            public final int hashCode() {
                return -2024118757;
            }

            public final String toString() {
                return "HandleOpenProfileClick";
            }
        }

        /* compiled from: StaticAdsItemAction.kt */
        public static final class b implements m {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -976716396;
            }

            public final String toString() {
                return "HandleSubscriptionSuccess";
            }
        }
    }
}
